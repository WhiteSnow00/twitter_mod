// 
// Decompiled by Procyon v0.6.0
// 

public final class mwp
{
    public final String a;
    public final String b;
    public final lz9 c;
    public final String d;
    
    public mwp(final String a, final String b, final lz9 c, final String d) {
        mo0.z(a, "shareUrl", b, "defaultShareText", d, "messagingShareText");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final mwp a(final int n, String c) {
        k1b.i(n, "shareParam");
        zzd.f((Object)c, "sessionToken");
        c = dcs.c(this.a, n, c);
        return new mwp(c, ckr.k1(this.b, this.a, c, false), new lz9(ckr.k1(this.c.a, this.a, c, false), ckr.k1(this.c.b, this.a, c, false)), ckr.k1(this.d, this.a, c, false));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof mwp)) {
            return false;
        }
        final mwp mwp = (mwp)o;
        return zzd.a((Object)this.a, (Object)mwp.a) && zzd.a((Object)this.b, (Object)mwp.b) && zzd.a((Object)this.c, (Object)mwp.c) && zzd.a((Object)this.d, (Object)mwp.d);
    }
    
    @Override
    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() + l7k.a(this.b, this.a.hashCode() * 31, 31)) * 31;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final lz9 c = this.c;
        final String d = this.d;
        final StringBuilder y = mb0.y("SharedItemContent(shareUrl=", a, ", defaultShareText=", b, ", emailShareText=");
        y.append(c);
        y.append(", messagingShareText=");
        y.append(d);
        y.append(")");
        return y.toString();
    }
}
