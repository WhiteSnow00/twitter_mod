// 
// Decompiled by Procyon v0.6.0
// 

public final class tmd implements ipp, qzb
{
    public final umd a;
    
    public tmd(final umd a) {
        e0e.f((Object)a, "settingsValue");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof tmd && e0e.a((Object)this.a, (Object)((tmd)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final umd a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("InfoItemSettingsDisplayItem(settingsValue=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
