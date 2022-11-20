// 
// Decompiled by Procyon v0.6.0
// 

public final class uon
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    
    public uon() {
        this(null, 31);
    }
    
    public uon(String s, final int n) {
        if ((n & 0x1) != 0x0) {
            s = "";
        }
        String s2;
        if ((n & 0x2) != 0x0) {
            s2 = "";
        }
        else {
            s2 = null;
        }
        String s3;
        if ((n & 0x4) != 0x0) {
            s3 = "";
        }
        else {
            s3 = null;
        }
        String s4;
        if ((n & 0x8) != 0x0) {
            s4 = "";
        }
        else {
            s4 = null;
        }
        this(s, s2, s3, s4, false);
    }
    
    public uon(final String a, final String b, final String c, final String d, final boolean e) {
        czd.f((Object)a, "id");
        czd.f((Object)b, "name");
        czd.f((Object)c, "username");
        czd.f((Object)d, "avatarUrl");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof uon && czd.a((Object)this.a, (Object)((uon)o).a);
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
        final StringBuilder q = tqf.q("RoomInvite(id=", a, ", name=", b, ", username=");
        nb0.z(q, c, ", avatarUrl=", d, ", hasNFTAvatar=");
        return wnj.D(q, e, ")");
    }
}
