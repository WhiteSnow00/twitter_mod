// 
// Decompiled by Procyon v0.6.0
// 

public final class ag4 extends pf4
{
    public final cg4 a;
    
    public ag4(final cg4 a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ag4 && czd.a((Object)this.a, (Object)((ag4)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final cg4 a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("ClientNetworkRequestAnalyticsEvent(event=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
