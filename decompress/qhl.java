// 
// Decompiled by Procyon v0.6.0
// 

public final class qhl implements lop, pyb
{
    public final rhl a;
    
    public qhl(final rhl a) {
        czd.f((Object)a, "settingsValue");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof qhl && czd.a((Object)this.a, (Object)((qhl)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final rhl a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("ProgressIndicatorSettingsDisplayItem(settingsValue=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
