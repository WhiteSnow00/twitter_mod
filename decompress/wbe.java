// 
// Decompiled by Procyon v0.6.0
// 

public final class wbe
{
    public final yh5 a;
    
    public wbe(final yh5 a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof wbe && e0e.a((Object)this.a, (Object)((wbe)o).a));
    }
    
    @Override
    public final int hashCode() {
        final yh5 a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return hashCode;
    }
    
    @Override
    public final String toString() {
        return va.A("JoinRequestCommunity(Community=", this.a, ")");
    }
}
