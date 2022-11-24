// 
// Decompiled by Procyon v0.6.0
// 

public final class wdp implements vrd
{
    public final ex9 b;
    
    public wdp(final ex9 b) {
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof wdp && o5j.a((Object)this.b, (Object)((wdp)o).b));
    }
    
    @Override
    public final int hashCode() {
        return o5j.f((Object)this.b);
    }
}
