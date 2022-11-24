import java.util.Objects;
import com.twitter.rooms.model.StationsSocialProof;
import com.twitter.rooms.model.Image;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rbr
{
    public final int a;
    public final String b;
    public final List<Image> c;
    public final String d;
    public final List<owt> e;
    public final List<StationsSocialProof> f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;
    public final boolean k;
    
    public rbr(final int a, final String b, final List<Image> c, final String d, final List<owt> e, final List<StationsSocialProof> f, final String g, final String h, final String i, final boolean j, final boolean k) {
        e0e.f((Object)b, "description");
        e0e.f((Object)d, "title");
        e0e.f((Object)g, "backgroundGradient");
        e0e.f((Object)h, "backgroundTexture");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public static rbr a(final rbr rbr, final boolean b, final boolean b2) {
        final int a = rbr.a;
        final String b3 = rbr.b;
        final List<Image> c = rbr.c;
        final String d = rbr.d;
        final List<owt> e = rbr.e;
        final List<StationsSocialProof> f = rbr.f;
        final String g = rbr.g;
        final String h = rbr.h;
        final String i = rbr.i;
        Objects.requireNonNull(rbr);
        e0e.f((Object)b3, "description");
        e0e.f((Object)c, "images");
        e0e.f((Object)d, "title");
        e0e.f((Object)e, "tracks");
        e0e.f((Object)g, "backgroundGradient");
        e0e.f((Object)h, "backgroundTexture");
        return new rbr(a, b3, c, d, e, f, g, h, i, b, b2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof rbr)) {
            return false;
        }
        final rbr rbr = (rbr)o;
        return this.a == rbr.a && e0e.a((Object)this.b, (Object)rbr.b) && e0e.a((Object)this.c, (Object)rbr.c) && e0e.a((Object)this.d, (Object)rbr.d) && e0e.a((Object)this.e, (Object)rbr.e) && e0e.a((Object)this.f, (Object)rbr.f) && e0e.a((Object)this.g, (Object)rbr.g) && e0e.a((Object)this.h, (Object)rbr.h) && e0e.a((Object)this.i, (Object)rbr.i) && this.j == rbr.j && this.k == rbr.k;
    }
    
    @Override
    public final int hashCode() {
        final int o = go9.o((List)this.e, brg.d(this.d, go9.o((List)this.c, brg.d(this.b, this.a * 31, 31), 31), 31), 31);
        final List<StationsSocialProof> f = this.f;
        final int n = 0;
        int hashCode;
        if (f == null) {
            hashCode = 0;
        }
        else {
            hashCode = f.hashCode();
        }
        final int d = brg.d(this.h, brg.d(this.g, (o + hashCode) * 31, 31), 31);
        final String i = this.i;
        int hashCode2;
        if (i == null) {
            hashCode2 = n;
        }
        else {
            hashCode2 = i.hashCode();
        }
        final int j = this.j ? 1 : 0;
        int n2 = 1;
        int n3 = j;
        if (j != 0) {
            n3 = 1;
        }
        final int k = this.k ? 1 : 0;
        if (k == 0) {
            n2 = k;
        }
        return ((d + hashCode2) * 31 + n3) * 31 + n2;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final String b = this.b;
        final List<Image> c = this.c;
        final String d = this.d;
        final List<owt> e = this.e;
        final List<StationsSocialProof> f = this.f;
        final String g = this.g;
        final String h = this.h;
        final String i = this.i;
        final boolean j = this.j;
        final boolean k = this.k;
        final StringBuilder f2 = awg.f("Station(id=", a, ", description=", b, ", images=");
        f2.append(c);
        f2.append(", title=");
        f2.append(d);
        f2.append(", tracks=");
        f2.append(e);
        f2.append(", socialProof=");
        f2.append(f);
        f2.append(", backgroundGradient=");
        jba.s(f2, g, ", backgroundTexture=", h, ", stationMetadata=");
        o6f.g(f2, i, ", isOpen=", j, ", isPlaying=");
        return xj0.B(f2, k, ")");
    }
}
