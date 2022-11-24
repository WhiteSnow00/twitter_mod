import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tea extends tvs implements cuw, aec
{
    public final lea q;
    public final List<lxd> r;
    
    public tea(final a a) {
        super((tvs.a)a, 11);
        final lea p = a.p;
        vmw.g((Object)p);
        this.q = p;
        Object r;
        if ((r = a.q) == null) {
            r = h3a.F0;
        }
        this.r = (List<lxd>)r;
    }
    
    public final List<lxd> f() {
        return this.r;
    }
    
    public static final class a extends tvs.a<tea, a>
    {
        public lea p;
        public List<lxd> q;
        
        public final Object i() {
            return new tea(this);
        }
        
        @Override
        public final boolean k() {
            return this.p != null && super.k();
        }
    }
}
