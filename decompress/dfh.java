// 
// Decompiled by Procyon v0.6.0
// 

public final class dfh
{
    public final idh a;
    
    public dfh(final idh a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof dfh && e0e.a((Object)this.a, (Object)((dfh)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final idh a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("MobileAppModuleData(appMetadataByStore=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
