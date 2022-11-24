import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g1t extends tvs implements cuw, ffc, afc, vdc
{
    public final wpi q;
    public final List<qgv> r;
    public final c9t s;
    public final oh0 t;
    
    public g1t(final a a) {
        super((tvs.a)a, 31);
        final wpi p = a.p;
        vmw.g((Object)p);
        this.q = p;
        Object r;
        if ((r = a.q) == null) {
            r = h3a.F0;
        }
        this.r = (List<qgv>)r;
        this.t = a.r;
        final c9t s = a.s;
        vmw.g((Object)s);
        this.s = s;
    }
    
    public final String d() {
        return this.q.a;
    }
    
    public final List<qgv> e() {
        return this.r;
    }
    
    public final List<oh0> g() {
        return ojf.v((Object)this.t);
    }
    
    public static final class a extends tvs.a<g1t, a>
    {
        public wpi p;
        public List<qgv> q;
        public oh0 r;
        public c9t s;
        
        public final Object i() {
            return new g1t(this);
        }
        
        @Override
        public final boolean k() {
            if (super.k()) {
                final wpi p = this.p;
                if (p != null && p.b.size() == kr4.l((Collection)this.q)) {
                    return true;
                }
            }
            return false;
        }
    }
}
