import com.twitter.nft.subsystem.model.VerifyWalletResponse;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jmx extends VerifyWalletResponse
{
    public final String a;
    public final String b;
    public final int c;
    public final b5i d;
    
    public jmx(final String a, final String b, final int c, final b5i d) {
        e0e.f((Object)a, "id");
        e0e.f((Object)b, "restId");
        super((wg8)null);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof jmx)) {
            return false;
        }
        final jmx jmx = (jmx)o;
        return e0e.a((Object)this.a, (Object)jmx.a) && e0e.a((Object)this.b, (Object)jmx.b) && this.c == jmx.c && e0e.a((Object)this.d, (Object)jmx.d);
    }
    
    public final int hashCode() {
        final int d = brg.d(this.b, this.a.hashCode() * 31, 31);
        final int c = this.c;
        final b5i d2 = this.d;
        int hashCode;
        if (d2 == null) {
            hashCode = 0;
        }
        else {
            hashCode = d2.hashCode();
        }
        return (d + c) * 31 + hashCode;
    }
    
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final int c = this.c;
        final b5i d = this.d;
        final StringBuilder k = l58.k("Web3NFTCollection(id=", a, ", restId=", b, ", ownersCount=");
        k.append(c);
        k.append(", nftOwnersSlice=");
        k.append(d);
        k.append(")");
        return k.toString();
    }
}
