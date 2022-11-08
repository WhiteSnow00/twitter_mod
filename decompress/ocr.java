import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ocr implements oax
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
    
    public ocr(final String a, final String b, final String c, final String d, final String e, final String f, final long g, final long h, final long i, final boolean j, final String k, final boolean l, final boolean m, final boolean n, final int o, final int p16) {
        zzd.f((Object)a, "podcastTitle");
        zzd.f((Object)b, "episodeDescription");
        zzd.f((Object)c, "episodeTitle");
        zzd.f((Object)d, "mediaUrl");
        zzd.f((Object)e, "podcastId");
        zzd.f((Object)f, "episodeId");
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
    
    public static ocr l(final ocr ocr, long g, long h, long i, boolean j, boolean m, boolean n, int o, int p10, final int n2) {
        String a;
        if ((n2 & 0x1) != 0x0) {
            a = ocr.a;
        }
        else {
            a = null;
        }
        String b;
        if ((n2 & 0x2) != 0x0) {
            b = ocr.b;
        }
        else {
            b = null;
        }
        String c;
        if ((n2 & 0x4) != 0x0) {
            c = ocr.c;
        }
        else {
            c = null;
        }
        String d;
        if ((n2 & 0x8) != 0x0) {
            d = ocr.d;
        }
        else {
            d = null;
        }
        String e;
        if ((n2 & 0x10) != 0x0) {
            e = ocr.e;
        }
        else {
            e = null;
        }
        String f;
        if ((n2 & 0x20) != 0x0) {
            f = ocr.f;
        }
        else {
            f = null;
        }
        if ((n2 & 0x40) != 0x0) {
            g = ocr.g;
        }
        if ((n2 & 0x80) != 0x0) {
            h = ocr.h;
        }
        if ((n2 & 0x100) != 0x0) {
            i = ocr.i;
        }
        if ((n2 & 0x200) != 0x0) {
            j = ocr.j;
        }
        String k;
        if ((n2 & 0x400) != 0x0) {
            k = ocr.k;
        }
        else {
            k = null;
        }
        final boolean b2 = (n2 & 0x800) != 0x0 && ocr.l;
        if ((n2 & 0x1000) != 0x0) {
            m = ocr.m;
        }
        if ((n2 & 0x2000) != 0x0) {
            n = ocr.n;
        }
        if ((n2 & 0x4000) != 0x0) {
            o = ocr.o;
        }
        if ((n2 & 0x8000) != 0x0) {
            p10 = ocr.p;
        }
        Objects.requireNonNull(ocr);
        zzd.f((Object)a, "podcastTitle");
        zzd.f((Object)b, "episodeDescription");
        zzd.f((Object)c, "episodeTitle");
        zzd.f((Object)d, "mediaUrl");
        zzd.f((Object)e, "podcastId");
        zzd.f((Object)f, "episodeId");
        zzd.f((Object)k, "publishDateText");
        return new ocr(a, b, c, d, e, f, g, h, i, j, k, b2, m, n, o, p10);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ocr)) {
            return false;
        }
        final ocr ocr = (ocr)o;
        return zzd.a((Object)this.a, (Object)ocr.a) && zzd.a((Object)this.b, (Object)ocr.b) && zzd.a((Object)this.c, (Object)ocr.c) && zzd.a((Object)this.d, (Object)ocr.d) && zzd.a((Object)this.e, (Object)ocr.e) && zzd.a((Object)this.f, (Object)ocr.f) && this.g == ocr.g && this.h == ocr.h && this.i == ocr.i && this.j == ocr.j && zzd.a((Object)this.k, (Object)ocr.k) && this.l == ocr.l && this.m == ocr.m && this.n == ocr.n && this.o == ocr.o && this.p == ocr.p;
    }
    
    @Override
    public final int hashCode() {
        final int a = l7k.a(this.f, l7k.a(this.e, l7k.a(this.d, l7k.a(this.c, l7k.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
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
        final int a2 = l7k.a(this.k, ((((a + n) * 31 + n2) * 31 + n3) * 31 + n5) * 31, 31);
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
        return ((((a2 + l) * 31 + m) * 31 + n4) * 31 + this.o) * 31 + this.p;
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
        final StringBuilder y = mb0.y("StationsPodcastViewState(podcastTitle=", a, ", episodeDescription=", b, ", episodeTitle=");
        mag.m(y, c, ", mediaUrl=", d, ", podcastId=");
        mag.m(y, e, ", episodeId=", f, ", currentPlaybackPositionMs=");
        y.append(g);
        c0.G(y, ", totalPlaybackLengthMs=", h, ", seekPositionMs=");
        du1.y(y, i, ", isSeeking=", j);
        y.append(", publishDateText=");
        y.append(k);
        y.append(", shouldShowPlaybackButton=");
        y.append(l);
        q1a.j(y, ", shouldShowErrorProgressBar=", m, ", isPlaying=", n);
        y.append(", playButtonResourceId=");
        y.append(o);
        y.append(", playButtonContentDescriptionId=");
        y.append(p);
        y.append(")");
        return y.toString();
    }
}
