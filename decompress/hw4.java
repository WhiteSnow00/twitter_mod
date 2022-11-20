// 
// Decompiled by Procyon v0.6.0
// 

public final class hw4
{
    public final String a;
    
    public hw4(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof hw4 && czd.a((Object)this.a, (Object)((hw4)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return da8.j("CommerceShopReportingMetadata(restId=", this.a, ")");
    }
    
    public static final class a extends n4j<hw4>
    {
        public String a;
        
        public a() {
            this(null, 1, null);
        }
        
        public a(final String s, final int n, final rf8 rf8) {
            this.a = null;
        }
        
        public final Object i() {
            final String a = this.a;
            czd.c((Object)a);
            return new hw4(a);
        }
    }
}
