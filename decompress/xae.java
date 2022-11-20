// 
// Decompiled by Procyon v0.6.0
// 

public final class xae
{
    public final tg5 a;
    
    public xae(final tg5 a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof xae && czd.a((Object)this.a, (Object)((xae)o).a));
    }
    
    @Override
    public final int hashCode() {
        final tg5 a = this.a;
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
        return g4k.E("JoinRequestCommunity(Community=", this.a, ")");
    }
}
