import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lsv extends vxs
{
    public final l7t k;
    public final List<hp6> l;
    
    public lsv(final a a) {
        super((vxs$a)a);
        final l7t k = a.k;
        vmw.g((Object)k);
        this.k = k;
        Object l;
        if ((l = a.l) == null) {
            l = h3a.F0;
        }
        this.l = (List<hp6>)l;
    }
    
    public static final class a extends vxs$a<lsv, a>
    {
        public l7t k;
        public List<hp6> l;
        
        public a(final long n) {
            super(n);
        }
        
        public final Object i() {
            return new lsv(this);
        }
        
        public final boolean k() {
            return this.k != null;
        }
    }
}
