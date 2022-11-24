// 
// Decompiled by Procyon v0.6.0
// 

public final class wtf implements m69
{
    public final mm3 a;
    
    public wtf(final mm3 a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof wtf && e0e.a((Object)this.a, (Object)((wtf)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final mm3 a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("LiveEventDockCarouselTransitionEvent(carouselItem=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
