// 
// Decompiled by Procyon v0.6.0
// 

public final class meh
{
    public final rch a;
    
    public meh(final rch a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof meh && zzd.a((Object)this.a, (Object)((meh)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final rch a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("MobileAppModuleData(appMetadataByStore=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
