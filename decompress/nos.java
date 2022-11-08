// 
// Decompiled by Procyon v0.6.0
// 

public final class nos
{
    public final String a;
    public final String b;
    
    public nos(final String a, final String b) {
        zzd.f((Object)a, "spaceId");
        zzd.f((Object)b, "ticketId");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof nos)) {
            return false;
        }
        final nos nos = (nos)o;
        return zzd.a((Object)this.a, (Object)nos.a) && zzd.a((Object)this.b, (Object)nos.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        return yqh.k("TicketedSpace(spaceId=", this.a, ", ticketId=", this.b, ")");
    }
}
