import java.util.Objects;
import com.twitter.nft.subsystem.model.Web3Wallet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r6i implements ccx
{
    public final z5i a;
    public final Web3Wallet b;
    public final rsw c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    
    public r6i() {
        this(null, null, null, null, null, null, false, 127, null);
    }
    
    public r6i(final z5i a, final Web3Wallet b, final rsw c, final String d, final String e, final String f, final boolean g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public r6i(final z5i z5i, final Web3Wallet web3Wallet, final rsw rsw, final String s, final String s2, final String s3, final boolean b, final int n, final wg8 wg8) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = false;
    }
    
    public static r6i l(final r6i r6i, z5i a, Web3Wallet b, rsw c, String d, String e, String f, boolean g, final int n) {
        if ((n & 0x1) != 0x0) {
            a = r6i.a;
        }
        if ((n & 0x2) != 0x0) {
            b = r6i.b;
        }
        if ((n & 0x4) != 0x0) {
            c = r6i.c;
        }
        if ((n & 0x8) != 0x0) {
            d = r6i.d;
        }
        if ((n & 0x10) != 0x0) {
            e = r6i.e;
        }
        if ((n & 0x20) != 0x0) {
            f = r6i.f;
        }
        if ((n & 0x40) != 0x0) {
            g = r6i.g;
        }
        Objects.requireNonNull(r6i);
        return new r6i(a, b, c, d, e, f, g);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof r6i)) {
            return false;
        }
        final r6i r6i = (r6i)o;
        return e0e.a((Object)this.a, (Object)r6i.a) && e0e.a((Object)this.b, (Object)r6i.b) && e0e.a((Object)this.c, (Object)r6i.c) && e0e.a((Object)this.d, (Object)r6i.d) && e0e.a((Object)this.e, (Object)r6i.e) && e0e.a((Object)this.f, (Object)r6i.f) && this.g == r6i.g;
    }
    
    @Override
    public final int hashCode() {
        final z5i a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final Web3Wallet b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final rsw c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final String d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final String e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final String f = this.f;
        if (f != null) {
            hashCode = f.hashCode();
        }
        int g;
        if ((g = (this.g ? 1 : 0)) != 0) {
            g = 1;
        }
        return (((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode) * 31 + g;
    }
    
    @Override
    public final String toString() {
        final z5i a = this.a;
        final Web3Wallet b = this.b;
        final rsw c = this.c;
        final String d = this.d;
        final String e = this.e;
        final String f = this.f;
        final boolean g = this.g;
        final StringBuilder sb = new StringBuilder();
        sb.append("NFTWalletConnectViewState(selectedWallet=");
        sb.append(a);
        sb.append(", web3Wallet=");
        sb.append(b);
        sb.append(", session=");
        sb.append(c);
        sb.append(", address=");
        sb.append(d);
        sb.append(", bridgeUrl=");
        jba.s(sb, e, ", walletConnectLink=", f, ", showingQR=");
        return xj0.B(sb, g, ")");
    }
}
