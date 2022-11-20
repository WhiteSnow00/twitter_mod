import java.util.Objects;
import com.twitter.rooms.model.StationsSocialProof;
import com.twitter.rooms.model.Image;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tar
{
    public final int a;
    public final String b;
    public final List<Image> c;
    public final String d;
    public final List<xvt> e;
    public final List<StationsSocialProof> f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;
    public final boolean k;
    
    public tar(final int a, final String b, final List<Image> c, final String d, final List<xvt> e, final List<StationsSocialProof> f, final String g, final String h, final String i, final boolean j, final boolean k) {
        czd.f((Object)b, "description");
        czd.f((Object)d, "title");
        czd.f((Object)g, "backgroundGradient");
        czd.f((Object)h, "backgroundTexture");
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
    
    public static tar a(final tar tar, final boolean b, final boolean b2) {
        final int a = tar.a;
        final String b3 = tar.b;
        final List<Image> c = tar.c;
        final String d = tar.d;
        final List<xvt> e = tar.e;
        final List<StationsSocialProof> f = tar.f;
        final String g = tar.g;
        final String h = tar.h;
        final String i = tar.i;
        Objects.requireNonNull(tar);
        czd.f((Object)b3, "description");
        czd.f((Object)c, "images");
        czd.f((Object)d, "title");
        czd.f((Object)e, "tracks");
        czd.f((Object)g, "backgroundGradient");
        czd.f((Object)h, "backgroundTexture");
        return new tar(a, b3, c, d, e, f, g, h, i, b, b2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof tar)) {
            return false;
        }
        final tar tar = (tar)o;
        return this.a == tar.a && czd.a((Object)this.b, (Object)tar.b) && czd.a((Object)this.c, (Object)tar.c) && czd.a((Object)this.d, (Object)tar.d) && czd.a((Object)this.e, (Object)tar.e) && czd.a((Object)this.f, (Object)tar.f) && czd.a((Object)this.g, (Object)tar.g) && czd.a((Object)this.h, (Object)tar.h) && czd.a((Object)this.i, (Object)tar.i) && this.j == tar.j && this.k == tar.k;
    }
    
    @Override
    public final int hashCode() {
        final int d = sde.d((List)this.e, hmg.f(this.d, sde.d((List)this.c, hmg.f(this.b, this.a * 31, 31), 31), 31), 31);
        final List<StationsSocialProof> f = this.f;
        final int n = 0;
        int hashCode;
        if (f == null) {
            hashCode = 0;
        }
        else {
            hashCode = f.hashCode();
        }
        final int f2 = hmg.f(this.h, hmg.f(this.g, (d + hashCode) * 31, 31), 31);
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
        return ((f2 + hashCode2) * 31 + n3) * 31 + n2;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final String b = this.b;
        final List<Image> c = this.c;
        final String d = this.d;
        final List<xvt> e = this.e;
        final List<StationsSocialProof> f = this.f;
        final String g = this.g;
        final String h = this.h;
        final String i = this.i;
        final boolean j = this.j;
        final boolean k = this.k;
        final StringBuilder l = fu8.k("Station(id=", a, ", description=", b, ", images=");
        l.append(c);
        l.append(", title=");
        l.append(d);
        l.append(", tracks=");
        l.append(e);
        l.append(", socialProof=");
        l.append(f);
        l.append(", backgroundGradient=");
        nb0.z(l, g, ", backgroundTexture=", h, ", stationMetadata=");
        bo1.A(l, i, ", isOpen=", j, ", isPlaying=");
        return wnj.D(l, k, ")");
    }
}
