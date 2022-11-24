import android.os.BaseBundle;
import android.util.Log;
import java.util.Collections;
import android.app.PendingIntent;
import android.os.Looper;
import java.util.Iterator;
import com.google.android.gms.common.api.c$c;
import com.google.android.gms.common.api.c$b;
import java.util.Objects;
import com.google.android.gms.common.api.a$f;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Future;
import java.util.ArrayList;
import com.google.android.gms.common.api.a$a;
import java.util.Map;
import com.google.android.gms.common.api.a;
import java.util.Set;
import android.os.Bundle;
import android.content.Context;
import java.util.concurrent.locks.Lock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o2y implements y2y
{
    public final b3y a;
    public final Lock b;
    public final Context c;
    public final s5c d;
    public bi6 e;
    public int f;
    public int g;
    public int h;
    public final Bundle i;
    public final Set<a.c> j;
    public t4y k;
    public boolean l;
    public boolean m;
    public boolean n;
    public q2d o;
    public boolean p;
    public boolean q;
    public final lh4 r;
    public final Map<a<?>, Boolean> s;
    public final a$a<? extends t4y, h7q> t;
    public final ArrayList<Future<?>> u;
    
    public o2y(final b3y a, final lh4 r, final Map<a<?>, Boolean> s, final s5c d, final a$a<? extends t4y, h7q> t, final Lock b, final Context c) {
        this.g = 0;
        this.i = new Bundle();
        this.j = new HashSet();
        this.u = new ArrayList<Future<?>>();
        this.a = a;
        this.r = r;
        this.s = s;
        this.d = d;
        this.t = t;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final Bundle bundle) {
        if (!this.o(1)) {
            return;
        }
        if (bundle != null) {
            this.i.putAll(bundle);
        }
        if (this.p()) {
            this.k();
        }
    }
    
    public final void b() {
        this.a.g.clear();
        this.m = false;
        this.e = null;
        this.g = 0;
        this.l = true;
        this.n = false;
        this.p = false;
        final HashMap hashMap = new HashMap();
        for (final a a : this.s.keySet()) {
            final a$f a$f = this.a.f.get(a.b);
            Objects.requireNonNull(a$f, "null reference");
            Objects.requireNonNull(a.a);
            final boolean booleanValue = this.s.get(a);
            if (a$f.k()) {
                this.m = true;
                if (booleanValue) {
                    this.j.add(a.b);
                }
                else {
                    this.l = false;
                }
            }
            hashMap.put(a$f, new f2y(this, (a)a, booleanValue));
        }
        if (this.m) {
            iuk.C((Object)this.r);
            iuk.C((Object)this.t);
            this.r.i = System.identityHashCode(this.a.m);
            final m2y m2y = new m2y(this);
            final a$a<? extends t4y, h7q> t = this.t;
            final Context c = this.c;
            final Looper l0 = this.a.m.L0;
            final lh4 r = this.r;
            this.k = (t4y)t.c(c, l0, r, (Object)r.h, (c$b)m2y, (c$c)m2y);
        }
        this.h = this.a.f.size();
        this.u.add(c3y.a.submit((Runnable)new i2y(this, (Map)hashMap)));
    }
    
    public final void c(final bi6 bi6, final a<?> a, final boolean b) {
        if (!this.o(1)) {
            return;
        }
        this.m(bi6, a, b);
        if (this.p()) {
            this.k();
        }
    }
    
    public final void d() {
    }
    
    public final void e(final int n) {
        this.l(new bi6(8, (PendingIntent)null, (String)null));
    }
    
    public final <A extends a.b, R extends etm, T extends com.google.android.gms.common.api.internal.a<R, A>> T f(final T t) {
        this.a.m.M0.add(t);
        return t;
    }
    
    public final boolean g() {
        this.q();
        this.j(true);
        this.a.j();
        return true;
    }
    
    public final <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends etm, A>> T h(final T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
    
    public final void i() {
        this.m = false;
        this.a.m.U0 = Collections.emptySet();
        for (final a.c c : this.j) {
            if (!this.a.g.containsKey(c)) {
                this.a.g.put(c, new bi6(17, (PendingIntent)null, (String)null));
            }
        }
    }
    
    public final void j(final boolean b) {
        final t4y k = this.k;
        if (k != null) {
            if (((a$f)k).b() && b) {
                k.a();
            }
            ((a$f)k).o();
            Objects.requireNonNull(this.r, "null reference");
            this.o = null;
        }
    }
    
    public final void k() {
        Object o = this.a;
        ((b3y)o).a.lock();
        try {
            ((b3y)o).m.q();
            (((b3y)o).k = (y2y)new e2y((b3y)o)).b();
            ((b3y)o).b.signalAll();
            ((b3y)o).a.unlock();
            c3y.a.execute((Runnable)new hfz((Object)this, 2));
            final t4y k = this.k;
            if (k != null) {
                if (this.p) {
                    o = this.o;
                    Objects.requireNonNull(o, "null reference");
                    k.p((q2d)o, this.q);
                }
                this.j(false);
            }
            o = this.a.g.keySet().iterator();
            while (((Iterator)o).hasNext()) {
                final a$f a$f = this.a.f.get(((Iterator<a.c<?>>)o).next());
                Objects.requireNonNull(a$f, "null reference");
                a$f.o();
            }
            if (((BaseBundle)this.i).isEmpty()) {
                o = null;
            }
            else {
                o = this.i;
            }
            this.a.n.u((Bundle)o);
        }
        finally {
            ((b3y)o).a.unlock();
        }
    }
    
    public final void l(final bi6 bi6) {
        this.q();
        this.j(bi6.p() ^ true);
        this.a.j();
        this.a.n.E(bi6);
    }
    
    public final void m(final bi6 e, final a<?> a, final boolean b) {
        Objects.requireNonNull(a.a);
        Label_0067: {
            if (b) {
                if (!e.p()) {
                    if (this.d.b((Context)null, e.G0, (String)null) == null) {
                        break Label_0067;
                    }
                }
            }
            if (this.e == null || Integer.MAX_VALUE < this.f) {
                this.e = e;
                this.f = Integer.MAX_VALUE;
            }
        }
        this.a.g.put(a.b, e);
    }
    
    public final void n() {
        if (this.h != 0) {
            return;
        }
        if (!this.m || this.n) {
            final ArrayList list = new ArrayList();
            this.g = 1;
            this.h = this.a.f.size();
            for (final a.c c : this.a.f.keySet()) {
                if (this.a.g.containsKey(c)) {
                    if (!this.p()) {
                        continue;
                    }
                    this.k();
                }
                else {
                    list.add(this.a.f.get(c));
                }
            }
            if (!list.isEmpty()) {
                this.u.add(c3y.a.submit((Runnable)new j2y(this, list)));
            }
        }
    }
    
    public final boolean o(int length) {
        if (this.g != length) {
            Log.w("GACConnecting", this.a.m.n());
            Log.w("GACConnecting", "Unexpected callback in ".concat(this.toString()));
            d10.F(33, "mRemainingConnections=", this.h, "GACConnecting");
            final int g = this.g;
            String s = "STEP_GETTING_REMOTE_SERVICE";
            String s2;
            if (g != 0) {
                s2 = "STEP_GETTING_REMOTE_SERVICE";
            }
            else {
                s2 = "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            }
            if (length == 0) {
                s = "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            }
            length = s2.length();
            final StringBuilder sb = new StringBuilder(s.length() + (length + 70));
            sb.append("GoogleApiClient connecting is in step ");
            sb.append(s2);
            sb.append(" but received callback for step ");
            sb.append(s);
            Log.e("GACConnecting", sb.toString(), (Throwable)new Exception());
            this.l(new bi6(8, (PendingIntent)null, (String)null));
            return false;
        }
        return true;
    }
    
    public final boolean p() {
        final int h = this.h - 1;
        this.h = h;
        if (h > 0) {
            return false;
        }
        if (h < 0) {
            Log.w("GACConnecting", this.a.m.n());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", (Throwable)new Exception());
            this.l(new bi6(8, (PendingIntent)null, (String)null));
            return false;
        }
        final bi6 e = this.e;
        if (e != null) {
            this.a.l = this.f;
            this.l(e);
            return false;
        }
        return true;
    }
    
    public final void q() {
        final ArrayList<Future<?>> u = this.u;
        for (int size = u.size(), i = 0; i < size; ++i) {
            ((Future)u.get(i)).cancel(true);
        }
        this.u.clear();
    }
}
