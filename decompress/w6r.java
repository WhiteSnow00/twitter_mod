import java.util.Objects;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w6r
{
    public Map<z73, l4a> a;
    
    public w6r() {
        this.a = new HashMap();
    }
    
    public final void a() {
        synchronized (this) {
            final ArrayList list = new ArrayList(this.a.values());
            this.a.clear();
            monitorexit(this);
            for (int i = 0; i < list.size(); ++i) {
                final l4a l4a = (l4a)list.get(i);
                if (l4a != null) {
                    l4a.close();
                }
            }
        }
    }
    
    public final l4a b(final z73 z73) {
        synchronized (this) {
            Objects.requireNonNull(z73);
            l4a a;
            final l4a l4a = a = this.a.get(z73);
            if (l4a != null) {
                synchronized (l4a) {
                    if (!l4a.q(l4a)) {
                        this.a.remove(z73);
                        fr0.m0((Class)w6r.class, "Found closed reference %d for key %s (%d)", new Object[] { System.identityHashCode(l4a), z73.a(), System.identityHashCode(z73) });
                        return null;
                    }
                    a = l4a.a(l4a);
                }
            }
            return a;
        }
    }
    
    public final void c(final z73 z73, final l4a l4a) {
        synchronized (this) {
            Objects.requireNonNull(z73);
            xd.D(l4a.q(l4a));
            l4a.b((l4a)this.a.put(z73, l4a.a(l4a)));
            synchronized (this) {
                this.a.size();
            }
        }
    }
    
    public final boolean d(final z73 z73) {
        Objects.requireNonNull(z73);
        synchronized (this) {
            final l4a l4a = this.a.remove(z73);
            monitorexit(this);
            if (l4a == null) {
                return false;
            }
            try {
                return l4a.m();
            }
            finally {
                l4a.close();
            }
        }
    }
    
    public final boolean e(final z73 z73, l4a d) {
        synchronized (this) {
            Objects.requireNonNull(z73);
            Objects.requireNonNull(d);
            xd.D(l4a.q(d));
            final l4a l4a = this.a.get(z73);
            if (l4a == null) {
                return false;
            }
            final cj4 d2 = l4a.d();
            d = (l4a)d.d();
            if (d2 != null && d != null) {
                try {
                    if (d2.h() == ((cj4<Object>)d).h()) {
                        this.a.remove(z73);
                        cj4.e((cj4<?>)d);
                        cj4.e(d2);
                        l4a.b(l4a);
                        synchronized (this) {
                            this.a.size();
                            return true;
                        }
                    }
                }
                finally {
                    cj4.e((cj4<?>)d);
                    cj4.e(d2);
                    l4a.b(l4a);
                }
            }
            cj4.e((cj4<?>)d);
            cj4.e(d2);
            l4a.b(l4a);
            return false;
        }
    }
}
