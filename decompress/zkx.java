import com.twitter.nft.subsystem.model.VerifyWalletResponse;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zkx extends VerifyWalletResponse
{
    public final String a;
    public final String b;
    public final int c;
    public final f4i d;
    
    public zkx(final String a, final String b, final int c, final f4i d) {
        zzd.f((Object)a, "id");
        zzd.f((Object)b, "restId");
        super((hg8)null);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof zkx)) {
            return false;
        }
        final zkx zkx = (zkx)o;
        return zzd.a((Object)this.a, (Object)zkx.a) && zzd.a((Object)this.b, (Object)zkx.b) && this.c == zkx.c && zzd.a((Object)this.d, (Object)zkx.d);
    }
    
    public final int hashCode() {
        final int a = l7k.a(this.b, this.a.hashCode() * 31, 31);
        final int c = this.c;
        final f4i d = this.d;
        int hashCode;
        if (d == null) {
            hashCode = 0;
        }
        else {
            hashCode = d.hashCode();
        }
        return (a + c) * 31 + hashCode;
    }
    
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final int c = this.c;
        final f4i d = this.d;
        final StringBuilder y = mb0.y("Web3NFTCollection(id=", a, ", restId=", b, ", ownersCount=");
        y.append(c);
        y.append(", nftOwnersSlice=");
        y.append(d);
        y.append(")");
        return y.toString();
    }
}
