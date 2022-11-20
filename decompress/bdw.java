import com.twitter.util.user.UserIdentifier;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bdw implements adw
{
    public final amr<cgv> c;
    public final amr<ziw> d;
    public final long e;
    public cgv f;
    public ziw g;
    public fds h;
    public List<UserIdentifier> i;
    public zjw j;
    
    public bdw() {
        this.c = new mv1();
        final mv1 d = new mv1();
        this.d = d;
        final ziw g = new ziw();
        this.g = g;
        final gdd$b e0 = gdd.E0;
        final int a = c5j.a;
        this.i = (List<UserIdentifier>)e0;
        this.j = zjw.F0;
        d.onNext((Object)g);
        final m4s a2 = hq1.a;
        this.e = System.currentTimeMillis();
    }
    
    @Override
    public final ziw A() {
        synchronized (this) {
            return this.g;
        }
    }
    
    @Override
    public final boolean a() {
        return this.j == zjw.G0;
    }
    
    @Override
    public final String c() {
        final int a = zcw.a;
        return this.getUser().K0;
    }
    
    @Override
    public adw d(ziw g) {
        monitorenter(this);
        Label_0017: {
            if (g != null) {
                break Label_0017;
            }
            try {
                g = new ziw();
                this.g = g;
                monitorexit(this);
                this.d.onNext((Object)g);
                return this;
            }
            finally {
                monitorexit(this);
            }
        }
    }
    
    @Override
    public final h5j<cgv> e() {
        return (h5j<cgv>)((h5j)this.c).observeOn(gmw.x());
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof adw && this.k().equals((Object)((adw)o).k()));
    }
    
    @Override
    public final List<UserIdentifier> f() {
        synchronized (this) {
            return this.i;
        }
    }
    
    @Override
    public final boolean g() {
        synchronized (this) {
            return this.h != null;
        }
    }
    
    @Override
    public final cgv getUser() {
        synchronized (this) {
            final cgv f = this.f;
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
    
    @Override
    public final boolean i() {
        synchronized (this) {
            return this.i.isEmpty() ^ true;
        }
    }
    
    @Override
    public final fds j() {
        synchronized (this) {
            final fds h = this.h;
            if (h != null) {
                return h;
            }
            throw new IllegalStateException("The user is not a contributee. Ensure that you check isTeamsContributee() before calling this method.");
        }
    }
    
    @Override
    public final UserIdentifier k() {
        final int a = zcw.a;
        return this.getUser().f();
    }
    
    @Override
    public final h5j<ziw> l() {
        return (h5j<ziw>)((h5j)this.d).observeOn(gmw.x());
    }
    
    @Override
    public final adw m(final ryt ryt) {
        zcw.a((adw)this, ryt);
        return this;
    }
    
    @Override
    public final boolean n() {
        synchronized (this) {
            return this.f != null;
        }
    }
    
    @Override
    public final zjw o() {
        return this.j;
    }
    
    @Override
    public final long s() {
        return this.e;
    }
}
