// 
// Decompiled by Procyon v0.6.0
// 

public final class btf implements f59
{
    public final ll3 a;
    
    public btf(final ll3 a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof btf && czd.a((Object)this.a, (Object)((btf)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final ll3 a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("LiveEventDockCarouselTransitionEvent(carouselItem=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
