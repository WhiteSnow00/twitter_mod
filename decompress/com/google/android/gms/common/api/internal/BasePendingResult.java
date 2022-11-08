// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import java.util.Objects;
import android.util.Log;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import com.google.android.gms.common.api.c;
import java.lang.ref.WeakReference;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public abstract class BasePendingResult<R extends xrm> extends b2k<R>
{
    public static final ThreadLocal<Boolean> n;
    public final Object a;
    public final a<R> b;
    public final WeakReference<c> c;
    public final CountDownLatch d;
    public final ArrayList<b2k$a> e;
    public yrm<? super R> f;
    public final AtomicReference<f3y> g;
    public R h;
    public Status i;
    public volatile boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    @KeepName
    private w4y mResultGuardian;
    
    static {
        BasePendingResult.n = new u4y();
    }
    
    @Deprecated
    public BasePendingResult() {
        this.a = new Object();
        this.d = new CountDownLatch(1);
        this.e = new ArrayList<b2k$a>();
        this.g = new AtomicReference<f3y>();
        this.m = false;
        this.b = new a<R>(Looper.getMainLooper());
        this.c = new WeakReference<c>(null);
    }
    
    public BasePendingResult(final c c) {
        this.a = new Object();
        this.d = new CountDownLatch(1);
        this.e = new ArrayList<b2k$a>();
        this.g = new AtomicReference<f3y>();
        this.m = false;
        Looper looper;
        if (c != null) {
            looper = c.i();
        }
        else {
            looper = Looper.getMainLooper();
        }
        this.b = new a<R>(looper);
        this.c = new WeakReference<c>(c);
    }
    
    public static void k(final xrm xrm) {
        if (xrm instanceof fbm) {
            try {
                ((fbm)xrm).release();
            }
            catch (final RuntimeException ex) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(xrm)), (Throwable)ex);
            }
        }
    }
    
    public final void b(final b2k$a b2k$a) {
        synchronized (this.a) {
            if (this.f()) {
                b2k$a.a(this.i);
            }
            else {
                this.e.add(b2k$a);
            }
        }
    }
    
    public final void c() {
        synchronized (this.a) {
            if (!this.k && !this.j) {
                k(this.h);
                this.k = true;
                this.i(this.d(Status.L0));
            }
        }
    }
    
    public abstract R d(final Status p0);
    
    @Deprecated
    public final void e(final Status status) {
        synchronized (this.a) {
            if (!this.f()) {
                this.g(this.d(status));
                this.l = true;
            }
        }
    }
    
    public final boolean f() {
        return this.d.getCount() == 0L;
    }
    
    public final void g(final R r) {
        synchronized (this.a) {
            if (!this.l && !this.k) {
                this.f();
                xd.w(this.f() ^ true, (Object)"Results have already been set");
                xd.w(this.j ^ true, (Object)"Result has already been consumed");
                this.i(r);
                return;
            }
            k(r);
        }
    }
    
    public final R h() {
        Object a = this.a;
        synchronized (a) {
            xd.w(this.j ^ true, (Object)"Result has already been consumed.");
            xd.w(this.f(), (Object)"Result is not ready.");
            final xrm h = this.h;
            this.h = null;
            this.f = null;
            this.j = true;
            monitorexit(a);
            a = this.g.getAndSet(null);
            if (a != null) {
                ((f3y)a).a.a.remove(this);
            }
            Objects.requireNonNull(h, "null reference");
            return (R)h;
        }
    }
    
    public final void i(final R h) {
        this.h = h;
        this.i = h.l();
        this.d.countDown();
        if (this.k) {
            this.f = null;
        }
        else {
            final yrm<? super R> f = this.f;
            if (f == null) {
                if (this.h instanceof fbm) {
                    this.mResultGuardian = new w4y(this);
                }
            }
            else {
                ((Handler)this.b).removeMessages(2);
                this.b.a(f, this.h());
            }
        }
        final ArrayList<b2k$a> e = this.e;
        for (int size = e.size(), i = 0; i < size; ++i) {
            ((b2k$a)e.get(i)).a(this.i);
        }
        this.e.clear();
    }
    
    public final void j() {
        this.m = (this.m || ((ThreadLocal<Boolean>)BasePendingResult.n).get());
    }
    
    public final void l(final f3y f3y) {
        this.g.set(f3y);
    }
    
    public static final class a<R extends xrm> extends t4y
    {
        public a(final Looper looper) {
            super(looper);
        }
        
        public final void a(final yrm<? super R> yrm, final R r) {
            final u4y n = BasePendingResult.n;
            ((Handler)this).sendMessage(((Handler)this).obtainMessage(1, (Object)new Pair((Object)yrm, (Object)r)));
        }
        
        public final void handleMessage(Message message) {
            final int what = message.what;
            if (what != 1) {
                if (what != 2) {
                    final StringBuilder sb = new StringBuilder(45);
                    sb.append("Don't know how to handle message: ");
                    sb.append(what);
                    Log.wtf("BasePendingResult", sb.toString(), (Throwable)new Exception());
                    return;
                }
                ((BasePendingResult)message.obj).e(Status.K0);
            }
            else {
                final Pair pair = (Pair)message.obj;
                final yrm yrm = (yrm)pair.first;
                message = (Message)pair.second;
                try {
                    yrm.a((xrm)message);
                }
                catch (final RuntimeException ex) {
                    BasePendingResult.k((xrm)message);
                    throw ex;
                }
            }
        }
    }
}
