import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h1t extends vxs
{
    public final wpi k;
    public final Iterable<qgv> l;
    public final hp6 m;
    public final c9t n;
    public final agv o;
    
    public h1t(final a a) {
        super((vxs$a)a);
        final wpi k = a.k;
        vmw.g((Object)k);
        this.k = k;
        Object l;
        if ((l = a.l) == null) {
            l = h3a.F0;
        }
        this.l = (List)l;
        this.m = a.m;
        final c9t n = a.n;
        vmw.g((Object)n);
        this.n = n;
        this.o = a.o;
    }
    
    public static final class a extends vxs$a<h1t, a>
    {
        public wpi k;
        public List<qgv> l;
        public hp6 m;
        public c9t n;
        public agv o;
        
        public a(final long n) {
            super(n);
        }
        
        public final Object i() {
            return new h1t(this);
        }
        
        public final boolean k() {
            return this.k != null && this.n != null;
        }
    }
}
