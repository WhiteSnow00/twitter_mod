// 
// Decompiled by Procyon v0.6.0
// 

public final class cmh extends vxs
{
    public final xlh k;
    
    public cmh(final a a) {
        super((vxs$a)a);
        final xlh k = a.k;
        vmw.g((Object)k);
        this.k = k;
    }
    
    public static final class a extends vxs$a<cmh, a>
    {
        public xlh k;
        
        public a(final long n) {
            super(n);
        }
        
        public final Object i() {
            return new cmh(this);
        }
        
        public final boolean k() {
            return this.k != null;
        }
    }
}
