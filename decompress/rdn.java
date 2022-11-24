// 
// Decompiled by Procyon v0.6.0
// 

public final class rdn implements ccx
{
    public final String a;
    public final String b;
    
    public rdn(final String a, final String b) {
        e0e.f((Object)a, "roomId");
        e0e.f((Object)b, "invitedBy");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof rdn)) {
            return false;
        }
        final rdn rdn = (rdn)o;
        return e0e.a((Object)this.a, (Object)rdn.a) && e0e.a((Object)this.b, (Object)rdn.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        return dvc.d("RoomDeclineInviteReasonsViewState(roomId=", this.a, ", invitedBy=", this.b, ")");
    }
}
