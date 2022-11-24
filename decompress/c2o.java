import java.util.Objects;
import com.twitter.rooms.model.helpers.RoomUserItem;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c2o implements ccx
{
    public final boolean a;
    public final String b;
    public final Long c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final boolean h;
    public final String i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final RoomUserItem m;
    public final long n;
    public final long o;
    public final int p;
    public final Long q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final String u;
    
    public c2o() {
        this(false, null, null, null, false, null, null, false, null, null, false, false, null, 0L, 0L, 0, null, false, false, false, null, 2097151, null);
    }
    
    public c2o(final boolean a, final String b, final Long c, final String d, final boolean e, final String f, final String g, final boolean h, final String i, final String j, final boolean k, final boolean l, final RoomUserItem m, final long n, final long o, final int p21, final Long q, final boolean r, final boolean s, final boolean t, final String u) {
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
        this.p = p21;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
    }
    
    public c2o(final boolean b, final String s, final Long n, final String s2, final boolean b2, final String s3, final String s4, final boolean b3, final String s5, final String s6, final boolean b4, final boolean b5, final RoomUserItem roomUserItem, final long n2, final long n3, final int n4, final Long n5, final boolean b6, final boolean b7, final boolean b8, final String s7, final int n6, final wg8 wg8) {
        this(false, null, null, null, false, null, null, true, null, null, false, false, null, 0L, 0L, 0, null, false, false, false, null);
    }
    
    public static c2o l(final c2o c2o, boolean a, String b, Long c, String d, boolean e, String f, String g, boolean h, String i, boolean k, boolean l, RoomUserItem m, long n, long o, int p22, Long q, boolean r, boolean s, boolean t, String u, final int n2) {
        if ((n2 & 0x1) != 0x0) {
            a = c2o.a;
        }
        if ((n2 & 0x2) != 0x0) {
            b = c2o.b;
        }
        if ((n2 & 0x4) != 0x0) {
            c = c2o.c;
        }
        if ((n2 & 0x8) != 0x0) {
            d = c2o.d;
        }
        if ((n2 & 0x10) != 0x0) {
            e = c2o.e;
        }
        if ((n2 & 0x20) != 0x0) {
            f = c2o.f;
        }
        if ((n2 & 0x40) != 0x0) {
            g = c2o.g;
        }
        if ((n2 & 0x80) != 0x0) {
            h = c2o.h;
        }
        if ((n2 & 0x100) != 0x0) {
            i = c2o.i;
        }
        String j;
        if ((n2 & 0x200) != 0x0) {
            j = c2o.j;
        }
        else {
            j = null;
        }
        if ((n2 & 0x400) != 0x0) {
            k = c2o.k;
        }
        if ((n2 & 0x800) != 0x0) {
            l = c2o.l;
        }
        if ((n2 & 0x1000) != 0x0) {
            m = c2o.m;
        }
        if ((n2 & 0x2000) != 0x0) {
            n = c2o.n;
        }
        if ((n2 & 0x4000) != 0x0) {
            o = c2o.o;
        }
        if ((n2 & 0x8000) != 0x0) {
            p22 = c2o.p;
        }
        if ((0x10000 & n2) != 0x0) {
            q = c2o.q;
        }
        if ((n2 & 0x20000) != 0x0) {
            r = c2o.r;
        }
        if ((n2 & 0x40000) != 0x0) {
            s = c2o.s;
        }
        if ((n2 & 0x80000) != 0x0) {
            t = c2o.t;
        }
        if ((n2 & 0x100000) != 0x0) {
            u = c2o.u;
        }
        Objects.requireNonNull(c2o);
        return new c2o(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p22, q, r, s, t, u);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof c2o)) {
            return false;
        }
        final c2o c2o = (c2o)o;
        return this.a == c2o.a && e0e.a((Object)this.b, (Object)c2o.b) && e0e.a((Object)this.c, (Object)c2o.c) && e0e.a((Object)this.d, (Object)c2o.d) && this.e == c2o.e && e0e.a((Object)this.f, (Object)c2o.f) && e0e.a((Object)this.g, (Object)c2o.g) && this.h == c2o.h && e0e.a((Object)this.i, (Object)c2o.i) && e0e.a((Object)this.j, (Object)c2o.j) && this.k == c2o.k && this.l == c2o.l && e0e.a((Object)this.m, (Object)c2o.m) && this.n == c2o.n && this.o == c2o.o && this.p == c2o.p && e0e.a((Object)this.q, (Object)c2o.q) && this.r == c2o.r && this.s == c2o.s && this.t == c2o.t && e0e.a((Object)this.u, (Object)c2o.u);
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a ? 1 : 0;
        int n = 1;
        int n2 = a;
        if (a != 0) {
            n2 = 1;
        }
        final String b = this.b;
        int hashCode = 0;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final Long c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        final String d = this.d;
        int hashCode4;
        if (d == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = d.hashCode();
        }
        int e;
        if ((e = (this.e ? 1 : 0)) != 0) {
            e = 1;
        }
        final String f = this.f;
        int hashCode5;
        if (f == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = f.hashCode();
        }
        final String g = this.g;
        int hashCode6;
        if (g == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = g.hashCode();
        }
        int h;
        if ((h = (this.h ? 1 : 0)) != 0) {
            h = 1;
        }
        final String i = this.i;
        int hashCode7;
        if (i == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = i.hashCode();
        }
        final String j = this.j;
        int hashCode8;
        if (j == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = j.hashCode();
        }
        int k;
        if ((k = (this.k ? 1 : 0)) != 0) {
            k = 1;
        }
        int l;
        if ((l = (this.l ? 1 : 0)) != 0) {
            l = 1;
        }
        final RoomUserItem m = this.m;
        int hashCode9;
        if (m == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = m.hashCode();
        }
        final long n3 = this.n;
        final int n4 = (int)(n3 ^ n3 >>> 32);
        final long o = this.o;
        final int n5 = (int)(o ^ o >>> 32);
        final int p = this.p;
        final Long q = this.q;
        int hashCode10;
        if (q == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = q.hashCode();
        }
        int r;
        if ((r = (this.r ? 1 : 0)) != 0) {
            r = 1;
        }
        int s;
        if ((s = (this.s ? 1 : 0)) != 0) {
            s = 1;
        }
        final int t = this.t ? 1 : 0;
        if (t == 0) {
            n = t;
        }
        final String u = this.u;
        if (u != null) {
            hashCode = u.hashCode();
        }
        return (((((((((((((((((((n2 * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + e) * 31 + hashCode5) * 31 + hashCode6) * 31 + h) * 31 + hashCode7) * 31 + hashCode8) * 31 + k) * 31 + l) * 31 + hashCode9) * 31 + n4) * 31 + n5) * 31 + p) * 31 + hashCode10) * 31 + r) * 31 + s) * 31 + n) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final String b = this.b;
        final Long c = this.c;
        final String d = this.d;
        final boolean e = this.e;
        final String f = this.f;
        final String g = this.g;
        final boolean h = this.h;
        final String i = this.i;
        final String j = this.j;
        final boolean k = this.k;
        final boolean l = this.l;
        final RoomUserItem m = this.m;
        final long n = this.n;
        final long o = this.o;
        final int p = this.p;
        final Long q = this.q;
        final boolean r = this.r;
        final boolean s = this.s;
        final boolean t = this.t;
        final String u = this.u;
        final StringBuilder b2 = va.B("RoomReplayDockViewState(show=", a, ", roomId=", b, ", startTime=");
        b2.append(c);
        b2.append(", hostName=");
        b2.append(d);
        b2.append(", hasSpeaker=");
        rh.y(b2, e, ", imageUrl=", f, ", topLineText=");
        o6f.g(b2, g, ", isPlaying=", h, ", secondLineText=");
        jba.s(b2, i, ", speakerRole=", j, ", hasHadSpeaker=");
        l58.l(b2, k, ", isPlaybackComplete=", l, ", speakerUserItem=");
        b2.append(m);
        b2.append(", totalDurationMs=");
        b2.append(n);
        po.E(b2, ", currentPlaybackMs=", o, ", currentProgressPercentage=");
        b2.append(p);
        b2.append(", replayStartTime=");
        b2.append(q);
        b2.append(", shouldHideSpeakingIndicator=");
        l58.l(b2, r, ", shouldDisplayImage=", s, ", isStation=");
        b2.append(t);
        b2.append(", podcastId=");
        b2.append(u);
        b2.append(")");
        return b2.toString();
    }
}
