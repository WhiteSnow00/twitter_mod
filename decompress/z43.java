// 
// Decompiled by Procyon v0.6.0
// 

public final class z43 implements vnp, nzb
{
    public final a53 a;
    
    public z43(final a53 a) {
        zzd.f((Object)a, "buttonItemSettingsItem");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof z43 && zzd.a((Object)this.a, (Object)((z43)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final a53 a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("ButtonItemSettingsDisplayItem(buttonItemSettingsItem=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
