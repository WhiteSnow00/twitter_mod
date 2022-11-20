// 
// Decompiled by Procyon v0.6.0
// 

public final class q43 implements lop, pyb
{
    public final r43 a;
    
    public q43(final r43 a) {
        czd.f((Object)a, "buttonItemSettingsItem");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof q43 && czd.a((Object)this.a, (Object)((q43)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final r43 a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("ButtonItemSettingsDisplayItem(buttonItemSettingsItem=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
