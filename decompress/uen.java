// 
// Decompiled by Procyon v0.6.0
// 

public final class uen implements sdw
{
    public final lrp a;
    
    public uen(final lrp a) {
        e0e.f((Object)a, "settingsType");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof uen && e0e.a((Object)this.a, (Object)((uen)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final lrp a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("SettingsButtonClicked(settingsType=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
