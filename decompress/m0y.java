import android.os.Handler;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a$b;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.app.PendingIntent;
import java.util.Objects;
import android.util.Log;
import java.util.Iterator;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import android.os.Bundle;
import com.google.android.gms.common.api.a;
import java.util.Set;
import com.google.android.gms.common.api.a$c;
import java.util.Map;
import android.os.Looper;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m0y implements o2y
{
    public final Context a;
    public final n1y b;
    public final Looper c;
    public final r1y d;
    public final r1y e;
    public final Map<a$c<?>, r1y> f;
    public final Set<r5q> g;
    public final a.f h;
    public Bundle i;
    public ph6 j;
    public ph6 k;
    public boolean l;
    public final Lock m;
    public int n;
    
    public m0y(final Context a, final n1y b, final Lock m, final Looper c, final o5c o5c, final Map<a$c<?>, a.f> map, final Map<a$c<?>, a.f> map2, final fh4 fh4, final a.a<? extends j3y, t5q> a2, final a.f h, final ArrayList<y4y> list, final ArrayList<y4y> list2, final Map<a<?>, Boolean> map3, final Map<a<?>, Boolean> map4) {
        this.g = Collections.newSetFromMap(new WeakHashMap<r5q, Boolean>());
        this.j = null;
        this.k = null;
        this.l = false;
        this.n = 0;
        this.a = a;
        this.b = b;
        this.m = m;
        this.c = c;
        this.h = h;
        this.d = new r1y(a, b, m, c, o5c, (Map)map2, (fh4)null, (Map)map4, (a.a)null, (ArrayList)list2, (f2y)new yrb(this));
        this.e = new r1y(a, b, m, c, o5c, (Map)map, fh4, (Map)map3, (a.a)a2, (ArrayList)list, (f2y)new r4c(this));
        final at0 at0 = new at0();
        final Iterator<a$c<?>> iterator = map2.keySet().iterator();
        while (iterator.hasNext()) {
            ((l7q)at0).put((Object)iterator.next(), (Object)this.d);
        }
        final Iterator<a$c<?>> iterator2 = map.keySet().iterator();
        while (iterator2.hasNext()) {
            ((l7q)at0).put((Object)iterator2.next(), (Object)this.e);
        }
        this.f = Collections.unmodifiableMap((Map<? extends a$c<?>, ? extends r1y>)at0);
    }
    
    public static boolean n(final ph6 ph6) {
        return ph6 != null && ph6.s();
    }
    
    public static void o(final m0y m0y) {
        if (n(m0y.j)) {
            if (n(m0y.k) || m0y.l()) {
                final int n = m0y.n;
                Label_0122: {
                    if (n != 1) {
                        if (n != 2) {
                            Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", (Throwable)new AssertionError());
                            break Label_0122;
                        }
                        final n1y b = m0y.b;
                        Objects.requireNonNull(b, "null reference");
                        b.c(m0y.i);
                    }
                    m0y.k();
                }
                m0y.n = 0;
                return;
            }
            final ph6 k = m0y.k;
            if (k != null) {
                if (m0y.n == 1) {
                    m0y.k();
                    return;
                }
                m0y.j(k);
                m0y.d.c();
            }
        }
        else {
            if (m0y.j != null && n(m0y.k)) {
                m0y.e.c();
                final ph6 j = m0y.j;
                Objects.requireNonNull(j, "null reference");
                m0y.j(j);
                return;
            }
            ph6 i = m0y.j;
            if (i != null) {
                final ph6 l = m0y.k;
                if (l != null) {
                    if (m0y.e.l < m0y.d.l) {
                        i = l;
                    }
                    m0y.j(i);
                }
            }
        }
    }
    
    public final void a() {
        this.n = 2;
        this.l = false;
        this.k = null;
        this.j = null;
        this.d.a();
        this.e.a();
    }
    
    public final void b() {
        this.m.lock();
        try {
            final boolean e = this.e();
            this.e.c();
            this.k = new ph6(4, (PendingIntent)null, (String)null);
            if (e) {
                ((Handler)new t4y(this.c)).post((Runnable)new s2y((Object)this, 1));
            }
            else {
                this.k();
            }
        }
        finally {
            this.m.unlock();
        }
    }
    
    public final void c() {
        this.k = null;
        this.j = null;
        this.n = 0;
        this.d.c();
        this.e.c();
        this.k();
    }
    
    public final void d(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        printWriter.append(s).append("authClient").println(":");
        this.e.d(String.valueOf(s).concat("  "), fileDescriptor, printWriter, array);
        printWriter.append(s).append("anonClient").println(":");
        this.d.d(String.valueOf(s).concat("  "), fileDescriptor, printWriter, array);
    }
    
    public final boolean e() {
        this.m.lock();
        try {
            return this.n == 2;
        }
        finally {
            this.m.unlock();
        }
    }
    
    public final <A extends a$b, R extends xrm, T extends com.google.android.gms.common.api.internal.a<R, A>> T f(final T t) {
        if (!this.m(t)) {
            final r1y d = this.d;
            Objects.requireNonNull(d);
            t.j();
            d.k.f((com.google.android.gms.common.api.internal.a)t);
            return t;
        }
        if (this.l()) {
            t.o(new Status(4, null, this.p()));
            return t;
        }
        final r1y e = this.e;
        Objects.requireNonNull(e);
        t.j();
        e.k.f((com.google.android.gms.common.api.internal.a)t);
        return t;
    }
    
    public final boolean g() {
        this.m.lock();
        try {
            final boolean b = this.d.k instanceof u0y;
            boolean b2 = false;
            if (b) {
                if (!(this.e.k instanceof u0y) && !this.l()) {
                    final int n = this.n;
                    b2 = b2;
                    if (n != 1) {
                        return b2;
                    }
                }
                b2 = true;
            }
            return b2;
        }
        finally {
            this.m.unlock();
        }
    }
    
    public final boolean h(final r5q r5q) {
        this.m.lock();
        try {
            if ((this.e() || this.g()) && !(this.e.k instanceof u0y)) {
                this.g.add(r5q);
                if (this.n == 0) {
                    this.n = 1;
                }
                this.k = null;
                this.e.a();
                return true;
            }
            return false;
        }
        finally {
            this.m.unlock();
        }
    }
    
    public final <A extends a$b, T extends com.google.android.gms.common.api.internal.a<? extends xrm, A>> T i(final T t) {
        if (!this.m(t)) {
            final r1y d = this.d;
            Objects.requireNonNull(d);
            t.j();
            return (T)d.k.h((com.google.android.gms.common.api.internal.a)t);
        }
        if (this.l()) {
            t.o(new Status(4, null, this.p()));
            return t;
        }
        final r1y e = this.e;
        Objects.requireNonNull(e);
        t.j();
        return (T)e.k.h((com.google.android.gms.common.api.internal.a)t);
    }
    
    public final void j(final ph6 ph6) {
        final int n = this.n;
        Label_0046: {
            if (n != 1) {
                if (n != 2) {
                    Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", (Throwable)new Exception());
                    break Label_0046;
                }
                this.b.e(ph6);
            }
            this.k();
        }
        this.n = 0;
    }
    
    public final void k() {
        final Iterator<r5q> iterator = this.g.iterator();
        while (iterator.hasNext()) {
            iterator.next().onComplete();
        }
        this.g.clear();
    }
    
    public final boolean l() {
        final ph6 k = this.k;
        return k != null && k.D0 == 4;
    }
    
    public final boolean m(final com.google.android.gms.common.api.internal.a<? extends xrm, ? extends a$b> a) {
        final r1y r1y = this.f.get(a.o);
        xd.u((Object)r1y, (Object)"GoogleApiClient is not configured to use the API required for this call.");
        return r1y.equals(this.e);
    }
    
    public final PendingIntent p() {
        if (this.h == null) {
            return null;
        }
        return PendingIntent.getActivity(this.a, System.identityHashCode(this.b), this.h.u(), g4y.a | 0x8000000);
    }
}
