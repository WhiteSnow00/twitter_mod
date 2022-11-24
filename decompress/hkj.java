// 
// Decompiled by Procyon v0.6.0
// 

public final class hkj extends g7r
{
    public final ozo G0;
    
    public hkj(final ozo g0) {
        this.G0 = g0;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof hkj && e0e.a((Object)this.G0, (Object)((hkj)o).G0));
    }
    
    public final int hashCode() {
        return this.G0.hashCode();
    }
    
    public final String toString() {
        final ozo g0 = this.G0;
        final StringBuilder sb = new StringBuilder();
        sb.append("OnScreenshotCaptured(screenshot=");
        sb.append(g0);
        sb.append(")");
        return sb.toString();
    }
}
