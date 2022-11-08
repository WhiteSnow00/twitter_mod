// 
// Decompiled by Procyon v0.6.0
// 

public final class odn implements qcw
{
    public final ypp a;
    
    public odn(final ypp a) {
        zzd.f((Object)a, "settingsType");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof odn && zzd.a((Object)this.a, (Object)((odn)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final ypp a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("SettingsButtonClicked(settingsType=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
