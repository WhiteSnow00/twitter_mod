// 
// Decompiled by Procyon v0.6.0
// 

public final class sxv
{
    public final hw4 a;
    
    public sxv(final hw4 a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof sxv && czd.a((Object)this.a, (Object)((sxv)o).a));
    }
    
    @Override
    public final int hashCode() {
        final hw4 a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return hashCode;
    }
    
    @Override
    public final String toString() {
        final hw4 a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("UnifiedCardReportingMetadata(commerceShopReportingMetadata=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
