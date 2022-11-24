// 
// Decompiled by Procyon v0.6.0
// 

public final class cil implements ipp, qzb
{
    public final dil a;
    
    public cil(final dil a) {
        e0e.f((Object)a, "settingsValue");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof cil && e0e.a((Object)this.a, (Object)((cil)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final dil a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("ProgressIndicatorSettingsDisplayItem(settingsValue=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
