// 
// Decompiled by Procyon v0.6.0
// 

public final class gon
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    
    public gon() {
        this("", "", "", "", false);
    }
    
    public gon(final String a, final String b, final String c, final String d, final boolean e) {
        zzd.f((Object)a, "id");
        zzd.f((Object)b, "name");
        zzd.f((Object)c, "username");
        zzd.f((Object)d, "avatarUrl");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof gon && zzd.a((Object)this.a, (Object)((gon)o).a);
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
        final StringBuilder y = mb0.y("RoomInvite(id=", a, ", name=", b, ", username=");
        mag.m(y, c, ", avatarUrl=", d, ", hasNFTAvatar=");
        return bd.y(y, e, ")");
    }
}
