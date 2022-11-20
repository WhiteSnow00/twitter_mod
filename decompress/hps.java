// 
// Decompiled by Procyon v0.6.0
// 

public final class hps
{
    public final String a;
    public final String b;
    
    public hps(final String a, final String b) {
        czd.f((Object)a, "spaceId");
        czd.f((Object)b, "ticketId");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof hps)) {
            return false;
        }
        final hps hps = (hps)o;
        return czd.a((Object)this.a, (Object)hps.a) && czd.a((Object)this.b, (Object)hps.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        return zh8.o("TicketedSpace(spaceId=", this.a, ", ticketId=", this.b, ")");
    }
}
