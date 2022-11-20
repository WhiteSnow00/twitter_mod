// 
// Decompiled by Procyon v0.6.0
// 

public final class ben implements cdw
{
    public final qqp a;
    
    public ben(final qqp a) {
        czd.f((Object)a, "settingsType");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ben && czd.a((Object)this.a, (Object)((ben)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final qqp a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("SettingsButtonClicked(settingsType=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
