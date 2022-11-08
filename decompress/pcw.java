import com.twitter.util.user.UserIdentifier;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class pcw implements ocw
{
    public final hlr<hfv> c;
    public final hlr<giw> d;
    public final long e;
    public hfv f;
    public giw g;
    public kcs h;
    public List<UserIdentifier> i;
    public fjw j;
    
    public pcw() {
        this.c = new rv1();
        final rv1 d = new rv1();
        this.d = d;
        final giw g = new giw();
        this.g = g;
        final ced$b d2 = ced.D0;
        final int a = w4j.a;
        this.i = (List<UserIdentifier>)d2;
        this.j = fjw.E0;
        d.onNext((Object)g);
        final t3s a2 = mq1.a;
        this.e = System.currentTimeMillis();
    }
    
    public final giw A() {
        synchronized (this) {
            return this.g;
        }
    }
    
    public final boolean a() {
        return this.j == fjw.F0;
    }
    
    public final String b() {
        final int a = ncw.a;
        return this.getUser().J0;
    }
    
    public ocw c(giw g) {
        monitorenter(this);
        Label_0017: {
            if (g != null) {
                break Label_0017;
            }
            try {
                g = new giw();
                this.g = g;
                monitorexit(this);
                this.d.onNext((Object)g);
                return (ocw)this;
            }
            finally {
                monitorexit(this);
            }
        }
    }
    
    public final b5j<hfv> e() {
        return (b5j<hfv>)((b5j)this.c).observeOn(h6q.C());
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof ocw && this.k().equals((Object)((ocw)o).k()));
    }
    
    public final List<UserIdentifier> f() {
        synchronized (this) {
            return this.i;
        }
    }
    
    public final boolean g() {
        synchronized (this) {
            return this.h != null;
        }
    }
    
    public final hfv getUser() {
        synchronized (this) {
            final hfv f = this.f;
            if (f != null) {
                return f;
            }
            throw new IllegalStateException("The user has not been set.");
        }
    }
    
    @Override
    public final int hashCode() {
        return this.k().hashCode();
    }
    
    public final boolean i() {
        synchronized (this) {
            return this.i.isEmpty() ^ true;
        }
    }
    
    public final kcs j() {
        synchronized (this) {
            final kcs h = this.h;
            if (h != null) {
                return h;
            }
            throw new IllegalStateException("The user is not a contributee. Ensure that you check isTeamsContributee() before calling this method.");
        }
    }
    
    public final UserIdentifier k() {
        final int a = ncw.a;
        return this.getUser().f();
    }
    
    public final b5j<giw> l() {
        return (b5j<giw>)((b5j)this.d).observeOn(h6q.C());
    }
    
    public final boolean n() {
        synchronized (this) {
            return this.f != null;
        }
    }
    
    public final fjw o() {
        return this.j;
    }
    
    public final long s() {
        return this.e;
    }
}
