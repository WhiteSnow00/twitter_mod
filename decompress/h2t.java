// 
// Decompiled by Procyon v0.6.0
// 

public final class h2t extends vxs
{
    public final c2t k;
    
    public h2t(final a a) {
        super((vxs$a)a);
        final c2t k = a.k;
        vmw.g((Object)k);
        this.k = k;
    }
    
    public static final class a extends vxs$a<h2t, a>
    {
        public c2t k;
        
        public a(final long n) {
            super(n);
        }
        
        public final Object i() {
            return new h2t(this);
        }
        
        public final boolean k() {
            return this.k != null;
        }
    }
}
