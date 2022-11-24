// 
// Decompiled by Procyon v0.6.0
// 

public final class kpn
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    
    public kpn() {
        this("", "", "", "", false);
    }
    
    public kpn(final String a, final String b, final String c, final String d, final boolean e) {
        e0e.f((Object)a, "id");
        e0e.f((Object)b, "name");
        e0e.f((Object)c, "username");
        e0e.f((Object)d, "avatarUrl");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof kpn && e0e.a((Object)this.a, (Object)((kpn)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final String c = this.c;
        final String d = this.d;
        final boolean e = this.e;
        final StringBuilder k = l58.k("RoomInvite(id=", a, ", name=", b, ", username=");
        jba.s(k, c, ", avatarUrl=", d, ", hasNFTAvatar=");
        return xj0.B(k, e, ")");
    }
}
