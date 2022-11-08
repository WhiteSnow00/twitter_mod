// 
// Decompiled by Procyon v0.6.0
// 

public final class ehl implements vnp, nzb
{
    public final fhl a;
    
    public ehl(final fhl a) {
        zzd.f((Object)a, "settingsValue");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ehl && zzd.a((Object)this.a, (Object)((ehl)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final fhl a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("ProgressIndicatorSettingsDisplayItem(settingsValue=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
