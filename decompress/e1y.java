import android.os.BaseBundle;
import android.util.Log;
import java.util.Collections;
import com.google.android.gms.common.api.a$b;
import android.app.PendingIntent;
import android.os.Looper;
import java.util.Iterator;
import com.google.android.gms.common.api.c;
import java.util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Future;
import java.util.ArrayList;
import com.google.android.gms.common.api.a;
import java.util.Map;
import com.google.android.gms.common.api.a$c;
import java.util.Set;
import android.os.Bundle;
import android.content.Context;
import java.util.concurrent.locks.Lock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e1y implements o1y
{
    public final r1y a;
    public final Lock b;
    public final Context c;
    public final o5c d;
    public ph6 e;
    public int f;
    public int g;
    public int h;
    public final Bundle i;
    public final Set<a$c> j;
    public j3y k;
    public boolean l;
    public boolean m;
    public boolean n;
    public l2d o;
    public boolean p;
    public boolean q;
    public final fh4 r;
    public final Map<a<?>, Boolean> s;
    public final a.a<? extends j3y, t5q> t;
    public final ArrayList<Future<?>> u;
    
    public e1y(final r1y a, final fh4 r, final Map<a<?>, Boolean> s, final o5c d, final a.a<? extends j3y, t5q> t, final Lock b, final Context c) {
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
            final a.f f = this.a.f.get(a.b);
            Objects.requireNonNull(f, "null reference");
            Objects.requireNonNull(a.a);
            final boolean booleanValue = this.s.get(a);
            if (f.k()) {
                this.m = true;
                if (booleanValue) {
                    this.j.add(a.b);
                }
                else {
                    this.l = false;
                }
            }
            hashMap.put(f, new v0y(this, a, booleanValue));
        }
        if (this.m) {
            xd.t((Object)this.r);
            xd.t((Object)this.t);
            this.r.i = System.identityHashCode(this.a.m);
            final c1y c1y = new c1y(this);
            final a.a<? extends j3y, t5q> t = this.t;
            final Context c = this.c;
            final Looper i0 = this.a.m.I0;
            final fh4 r = this.r;
            this.k = (j3y)t.c(c, i0, r, r.h, (c.b)c1y, (c.c)c1y);
        }
        this.h = this.a.f.size();
        this.u.add(s1y.a.submit((Runnable)new y0y(this, (Map)hashMap)));
    }
    
    public final void c(final ph6 ph6, final a<?> a, final boolean b) {
        if (!this.o(1)) {
            return;
        }
        this.m(ph6, a, b);
        if (this.p()) {
            this.k();
        }
    }
    
    public final void d() {
    }
    
    public final void e(final int n) {
        this.l(new ph6(8, (PendingIntent)null, (String)null));
    }
    
    public final <A extends a$b, R extends xrm, T extends com.google.android.gms.common.api.internal.a<R, A>> T f(final T t) {
        this.a.m.J0.add(t);
        return t;
    }
    
    public final boolean g() {
        this.q();
        this.j(true);
        this.a.j();
        return true;
    }
    
    public final <A extends a$b, T extends com.google.android.gms.common.api.internal.a<? extends xrm, A>> T h(final T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
    
    public final void i() {
        this.m = false;
        this.a.m.R0 = Collections.emptySet();
        for (final a$c a$c : this.j) {
            if (!this.a.g.containsKey(a$c)) {
                this.a.g.put(a$c, new ph6(17, (PendingIntent)null, (String)null));
            }
        }
    }
    
    public final void j(final boolean b) {
        final j3y k = this.k;
        if (k != null) {
            if (((a.f)k).b() && b) {
                k.a();
            }
            ((a.f)k).o();
            Objects.requireNonNull(this.r, "null reference");
            this.o = null;
        }
    }
    
    public final void k() {
        Object o = this.a;
        ((r1y)o).a.lock();
        try {
            ((r1y)o).m.t();
            (((r1y)o).k = (o1y)new u0y((r1y)o)).b();
            ((r1y)o).b.signalAll();
            ((r1y)o).a.unlock();
            s1y.a.execute((Runnable)new udz((Object)this, 2));
            final j3y k = this.k;
            if (k != null) {
                if (this.p) {
                    o = this.o;
                    Objects.requireNonNull(o, "null reference");
                    k.p((l2d)o, this.q);
                }
                this.j(false);
            }
            o = this.a.g.keySet().iterator();
            while (((Iterator)o).hasNext()) {
                final a.f f = this.a.f.get(((Iterator<a$c>)o).next());
                Objects.requireNonNull(f, "null reference");
                f.o();
            }
            if (((BaseBundle)this.i).isEmpty()) {
                o = null;
            }
            else {
                o = this.i;
            }
            this.a.n.c((Bundle)o);
        }
        finally {
            ((r1y)o).a.unlock();
        }
    }
    
    public final void l(final ph6 ph6) {
        this.q();
        this.j(ph6.r() ^ true);
        this.a.j();
        this.a.n.e(ph6);
    }
    
    public final void m(final ph6 e, final a<?> a, final boolean b) {
        Objects.requireNonNull(a.a);
        Label_0067: {
            if (b) {
                if (!e.r()) {
                    if (this.d.b((Context)null, e.D0, (String)null) == null) {
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
            for (final a$c a$c : this.a.f.keySet()) {
                if (this.a.g.containsKey(a$c)) {
                    if (!this.p()) {
                        continue;
                    }
                    this.k();
                }
                else {
                    list.add(this.a.f.get(a$c));
                }
            }
            if (!list.isEmpty()) {
                this.u.add(s1y.a.submit((Runnable)new z0y(list)));
            }
        }
    }
    
    public final boolean o(int length) {
        if (this.g != length) {
            Log.w("GACConnecting", this.a.m.q());
            Log.w("GACConnecting", "Unexpected callback in ".concat(this.toString()));
            zi.z(33, "mRemainingConnections=", this.h, "GACConnecting");
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
            this.l(new ph6(8, (PendingIntent)null, (String)null));
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
            Log.w("GACConnecting", this.a.m.q());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", (Throwable)new Exception());
            this.l(new ph6(8, (PendingIntent)null, (String)null));
            return false;
        }
        final ph6 e = this.e;
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
