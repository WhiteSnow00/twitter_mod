import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class her implements ccx
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;
    public final long h;
    public final long i;
    public final boolean j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final int o;
    public final int p;
    
    public her(final String a, final String b, final String c, final String d, final String e, final String f, final long g, final long h, final long i, final boolean j, final String k, final boolean l, final boolean m, final boolean n, final int o, final int p16) {
        e0e.f((Object)a, "podcastTitle");
        e0e.f((Object)b, "episodeDescription");
        e0e.f((Object)c, "episodeTitle");
        e0e.f((Object)d, "mediaUrl");
        e0e.f((Object)e, "podcastId");
        e0e.f((Object)f, "episodeId");
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
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p16;
    }
    
    public static her l(final her her, long g, long h, long i, boolean j, boolean m, boolean n, int o, int p10, final int n2) {
        String a;
        if ((n2 & 0x1) != 0x0) {
            a = her.a;
        }
        else {
            a = null;
        }
        String b;
        if ((n2 & 0x2) != 0x0) {
            b = her.b;
        }
        else {
            b = null;
        }
        String c;
        if ((n2 & 0x4) != 0x0) {
            c = her.c;
        }
        else {
            c = null;
        }
        String d;
        if ((n2 & 0x8) != 0x0) {
            d = her.d;
        }
        else {
            d = null;
        }
        String e;
        if ((n2 & 0x10) != 0x0) {
            e = her.e;
        }
        else {
            e = null;
        }
        String f;
        if ((n2 & 0x20) != 0x0) {
            f = her.f;
        }
        else {
            f = null;
        }
        if ((n2 & 0x40) != 0x0) {
            g = her.g;
        }
        if ((n2 & 0x80) != 0x0) {
            h = her.h;
        }
        if ((n2 & 0x100) != 0x0) {
            i = her.i;
        }
        if ((n2 & 0x200) != 0x0) {
            j = her.j;
        }
        String k;
        if ((n2 & 0x400) != 0x0) {
            k = her.k;
        }
        else {
            k = null;
        }
        final boolean b2 = (n2 & 0x800) != 0x0 && her.l;
        if ((n2 & 0x1000) != 0x0) {
            m = her.m;
        }
        if ((n2 & 0x2000) != 0x0) {
            n = her.n;
        }
        if ((n2 & 0x4000) != 0x0) {
            o = her.o;
        }
        if ((n2 & 0x8000) != 0x0) {
            p10 = her.p;
        }
        Objects.requireNonNull(her);
        e0e.f((Object)a, "podcastTitle");
        e0e.f((Object)b, "episodeDescription");
        e0e.f((Object)c, "episodeTitle");
        e0e.f((Object)d, "mediaUrl");
        e0e.f((Object)e, "podcastId");
        e0e.f((Object)f, "episodeId");
        e0e.f((Object)k, "publishDateText");
        return new her(a, b, c, d, e, f, g, h, i, j, k, b2, m, n, o, p10);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof her)) {
            return false;
        }
        final her her = (her)o;
        return e0e.a((Object)this.a, (Object)her.a) && e0e.a((Object)this.b, (Object)her.b) && e0e.a((Object)this.c, (Object)her.c) && e0e.a((Object)this.d, (Object)her.d) && e0e.a((Object)this.e, (Object)her.e) && e0e.a((Object)this.f, (Object)her.f) && this.g == her.g && this.h == her.h && this.i == her.i && this.j == her.j && e0e.a((Object)this.k, (Object)her.k) && this.l == her.l && this.m == her.m && this.n == her.n && this.o == her.o && this.p == her.p;
    }
    
    @Override
    public final int hashCode() {
        final int d = brg.d(this.f, brg.d(this.e, brg.d(this.d, brg.d(this.c, brg.d(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
        final long g = this.g;
        final int n = (int)(g ^ g >>> 32);
        final long h = this.h;
        final int n2 = (int)(h ^ h >>> 32);
        final long i = this.i;
        final int n3 = (int)(i ^ i >>> 32);
        final int j = this.j ? 1 : 0;
        int n4 = 1;
        int n5 = j;
        if (j != 0) {
            n5 = 1;
        }
        final int d2 = brg.d(this.k, ((((d + n) * 31 + n2) * 31 + n3) * 31 + n5) * 31, 31);
        int l;
        if ((l = (this.l ? 1 : 0)) != 0) {
            l = 1;
        }
        int m;
        if ((m = (this.m ? 1 : 0)) != 0) {
            m = 1;
        }
        final int n6 = this.n ? 1 : 0;
        if (n6 == 0) {
            n4 = n6;
        }
        return ((((d2 + l) * 31 + m) * 31 + n4) * 31 + this.o) * 31 + this.p;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final String c = this.c;
        final String d = this.d;
        final String e = this.e;
        final String f = this.f;
        final long g = this.g;
        final long h = this.h;
        final long i = this.i;
        final boolean j = this.j;
        final String k = this.k;
        final boolean l = this.l;
        final boolean m = this.m;
        final boolean n = this.n;
        final int o = this.o;
        final int p = this.p;
        final StringBuilder k2 = l58.k("StationsPodcastViewState(podcastTitle=", a, ", episodeDescription=", b, ", episodeTitle=");
        jba.s(k2, c, ", mediaUrl=", d, ", podcastId=");
        jba.s(k2, e, ", episodeId=", f, ", currentPlaybackPositionMs=");
        k2.append(g);
        po.E(k2, ", totalPlaybackLengthMs=", h, ", seekPositionMs=");
        to0.E(k2, i, ", isSeeking=", j);
        k2.append(", publishDateText=");
        k2.append(k);
        k2.append(", shouldShowPlaybackButton=");
        k2.append(l);
        snp.d(k2, ", shouldShowErrorProgressBar=", m, ", isPlaying=", n);
        k2.append(", playButtonResourceId=");
        k2.append(o);
        k2.append(", playButtonContentDescriptionId=");
        k2.append(p);
        k2.append(")");
        return k2.toString();
    }
}
