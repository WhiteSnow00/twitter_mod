// 
// Decompiled by Procyon v0.6.0
// 

public final class jrv extends vxs
{
    public final q2r k;
    
    public jrv(final a a) {
        super((vxs$a)a);
        final q2r k = a.k;
        vmw.g((Object)k);
        this.k = k;
    }
    
    public static final class a extends vxs$a<jrv, a>
    {
        public q2r k;
        
        public a(final long n) {
            super(n);
        }
        
        public final Object i() {
            return new jrv(this);
        }
        
        public final boolean k() {
            return this.k != null;
        }
    }
}
