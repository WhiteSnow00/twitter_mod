// 
// Decompiled by Procyon v0.6.0
// 

public final class fx4
{
    public final String a;
    
    public fx4(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof fx4 && zzd.a((Object)this.a, (Object)((fx4)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return zi.y("CommerceShopReportingMetadata(restId=", this.a, ")");
    }
    
    public static final class a extends h4j<fx4>
    {
        public String a;
        
        public a() {
            this(null, 1, null);
        }
        
        public a(final String s, final int n, final hg8 hg8) {
            this.a = null;
        }
        
        public final Object i() {
            final String a = this.a;
            zzd.c((Object)a);
            return new fx4(a);
        }
    }
}
