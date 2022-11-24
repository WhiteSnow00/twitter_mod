// 
// Decompiled by Procyon v0.6.0
// 

public final class r53 implements ipp, qzb
{
    public final s53 a;
    
    public r53(final s53 a) {
        e0e.f((Object)a, "buttonSettingsItem");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof r53 && e0e.a((Object)this.a, (Object)((r53)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final s53 a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("ButtonSettingsDisplayItem(buttonSettingsItem=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
