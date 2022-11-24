import java.util.List;
import com.twitter.nft.subsystem.model.NFTCollection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a5i
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final NFTCollection h;
    public final List<aoj> i;
    
    public a5i(final String a, final String b, final String c, final String d, final String e, final String f, final String g, final NFTCollection h, final List<aoj> i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a5i)) {
            return false;
        }
        final a5i a5i = (a5i)o;
        return e0e.a((Object)this.a, (Object)a5i.a) && e0e.a((Object)this.b, (Object)a5i.b) && e0e.a((Object)this.c, (Object)a5i.c) && e0e.a((Object)this.d, (Object)a5i.d) && e0e.a((Object)this.e, (Object)a5i.e) && e0e.a((Object)this.f, (Object)a5i.f) && e0e.a((Object)this.g, (Object)a5i.g) && e0e.a((Object)this.h, (Object)a5i.h) && e0e.a((Object)this.i, (Object)a5i.i);
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final String b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final String c = this.c;
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
        int hashCode7;
        if (f == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = f.hashCode();
        }
        final String g = this.g;
        int hashCode8;
        if (g == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = g.hashCode();
        }
        final NFTCollection h = this.h;
        int hashCode9;
        if (h == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = h.hashCode();
        }
        final List<aoj> i = this.i;
        if (i != null) {
            hashCode = i.hashCode();
        }
        return (((((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final String c = this.c;
        final String d = this.d;
        final String e = this.e;
        final String f = this.f;
        final String g = this.g;
        final NFTCollection h = this.h;
        final List<aoj> i = this.i;
        final StringBuilder k = l58.k("NFTOpenseaNFTMetadata(name=", a, ", schema=", b, ", description=");
        jba.s(k, c, ", imageURL=", d, ", creatorAddress=");
        jba.s(k, e, ", creatorUsername=", f, ", creatorProfileImageUrl=");
        k.append(g);
        k.append(", collection=");
        k.append(h);
        k.append(", traits=");
        return ad.A(k, i, ")");
    }
}
