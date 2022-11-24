import java.util.Objects;
import com.twitter.rooms.model.AudioSpaceTopicItem;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tsq implements ccx
{
    public static final tsq.tsq$a Companion;
    public final Integer A;
    public final boolean B;
    public final long C;
    public final dl3 a;
    public final String b;
    public final y21 c;
    public final String d;
    public final z21 e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final String i;
    public final String j;
    public final long k;
    public final String l;
    public final String m;
    public final Long n;
    public final boolean o;
    public final boolean p;
    public final int q;
    public final int r;
    public final int s;
    public final boolean t;
    public final boolean u;
    public final String v;
    public final boolean w;
    public final Long x;
    public final Set<AudioSpaceTopicItem> y;
    public final lbs z;
    
    static {
        Companion = new tsq.tsq$a();
    }
    
    public tsq() {
        this(null, null, null, null, null, false, false, 0L, null, null, 0L, null, null, null, false, false, 0, 0, 0, false, false, null, false, null, null, null, null, false, 0L, 536870911, null);
    }
    
    public tsq(final dl3 a, final String b, final y21 c, final String d, final z21 e, final boolean f, final boolean g, final long h, final String i, final String j, final long k, final String l, final String m, final Long n, final boolean o, final boolean p29, final int q, final int r, final Object s, final boolean t, final boolean u, final String v, final boolean w, final Long x, final Set<AudioSpaceTopicItem> y, final lbs z, final Integer a2, final boolean b2, final long c2) {
        e0e.f((Object)a, "cardState");
        e0e.f((Object)y, "topics");
        e0e.f((Object)z, "talkingViewState");
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
        this.p = p29;
        this.q = q;
        this.r = r;
        this.s = (int)s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a2;
        this.B = b2;
        this.C = c2;
    }
    
    public tsq(final dl3 dl3, final String s, final y21 y21, final String s2, final z21 z21, final boolean b, final boolean b2, final long n, final String s3, final String s4, final long n2, final String s5, final String s6, final Long n3, final boolean b3, final boolean b4, final int n4, final int n5, final int n6, final boolean b5, final boolean b6, final String s7, final boolean b7, final Long n7, final Set set, final lbs lbs, final Integer n8, final boolean b8, final long n9, final int n10, final wg8 wg8) {
        this(dl3.F0, (String)null, (y21)null, (String)null, (z21)null, false, false, 0L, (String)null, (String)null, 0L, (String)null, (String)null, (Long)null, true, false, 2131232450, 2131959341, 0, false, false, (String)null, false, (Long)null, (Set)r3a.F0, lbs.F0, (Integer)null, false, 0L);
    }
    
    public static tsq l(final tsq tsq, dl3 a, String b, y21 c, String d, z21 e, boolean f, boolean g, long h, String i, String j, long k, String l, String m, Long n, boolean o, boolean p31, int q, int r, int s, boolean t, boolean u, String v, boolean w, Long x, Set y, lbs z, Integer a2, boolean b2, long c2, final int n2) {
        if ((n2 & 0x1) != 0x0) {
            a = tsq.a;
        }
        if ((n2 & 0x2) != 0x0) {
            b = tsq.b;
        }
        if ((n2 & 0x4) != 0x0) {
            c = tsq.c;
        }
        if ((n2 & 0x8) != 0x0) {
            d = tsq.d;
        }
        if ((n2 & 0x10) != 0x0) {
            e = tsq.e;
        }
        if ((n2 & 0x20) != 0x0) {
            f = tsq.f;
        }
        if ((n2 & 0x40) != 0x0) {
            g = tsq.g;
        }
        if ((n2 & 0x80) != 0x0) {
            h = tsq.h;
        }
        if ((n2 & 0x100) != 0x0) {
            i = tsq.i;
        }
        if ((n2 & 0x200) != 0x0) {
            j = tsq.j;
        }
        if ((n2 & 0x400) != 0x0) {
            k = tsq.k;
        }
        if ((n2 & 0x800) != 0x0) {
            l = tsq.l;
        }
        if ((n2 & 0x1000) != 0x0) {
            m = tsq.m;
        }
        if ((n2 & 0x2000) != 0x0) {
            n = tsq.n;
        }
        if ((n2 & 0x4000) != 0x0) {
            o = tsq.o;
        }
        if ((n2 & 0x8000) != 0x0) {
            p31 = tsq.p;
        }
        if ((n2 & 0x10000) != 0x0) {
            q = tsq.q;
        }
        if ((n2 & 0x20000) != 0x0) {
            r = tsq.r;
        }
        if ((n2 & 0x40000) != 0x0) {
            s = tsq.s;
        }
        if ((n2 & 0x80000) != 0x0) {
            t = tsq.t;
        }
        if ((n2 & 0x100000) != 0x0) {
            u = tsq.u;
        }
        if ((n2 & 0x200000) != 0x0) {
            v = tsq.v;
        }
        if ((n2 & 0x400000) != 0x0) {
            w = tsq.w;
        }
        if ((n2 & 0x800000) != 0x0) {
            x = tsq.x;
        }
        if ((n2 & 0x1000000) != 0x0) {
            y = tsq.y;
        }
        if ((n2 & 0x2000000) != 0x0) {
            z = tsq.z;
        }
        if ((0x4000000 & n2) != 0x0) {
            a2 = tsq.A;
        }
        if ((n2 & 0x8000000) != 0x0) {
            b2 = tsq.B;
        }
        if ((n2 & 0x10000000) != 0x0) {
            c2 = tsq.C;
        }
        Objects.requireNonNull(tsq);
        e0e.f((Object)a, "cardState");
        e0e.f((Object)y, "topics");
        e0e.f((Object)z, "talkingViewState");
        return new tsq(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p31, q, r, s, t, u, v, w, x, (Set)y, z, a2, b2, c2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof tsq)) {
            return false;
        }
        final tsq tsq = (tsq)o;
        return this.a == tsq.a && e0e.a((Object)this.b, (Object)tsq.b) && e0e.a((Object)this.c, (Object)tsq.c) && e0e.a((Object)this.d, (Object)tsq.d) && e0e.a((Object)this.e, (Object)tsq.e) && this.f == tsq.f && this.g == tsq.g && this.h == tsq.h && e0e.a((Object)this.i, (Object)tsq.i) && e0e.a((Object)this.j, (Object)tsq.j) && this.k == tsq.k && e0e.a((Object)this.l, (Object)tsq.l) && e0e.a((Object)this.m, (Object)tsq.m) && e0e.a((Object)this.n, (Object)tsq.n) && this.o == tsq.o && this.p == tsq.p && this.q == tsq.q && this.r == tsq.r && this.s == tsq.s && this.t == tsq.t && this.u == tsq.u && e0e.a((Object)this.v, (Object)tsq.v) && this.w == tsq.w && e0e.a((Object)this.x, (Object)tsq.x) && e0e.a((Object)this.y, (Object)tsq.y) && this.z == tsq.z && e0e.a((Object)this.A, (Object)tsq.A) && this.B == tsq.B && this.C == tsq.C;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        final int n = 0;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final y21 c = this.c;
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
        final z21 e = this.e;
        int hashCode5;
        if (e == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = e.hashCode();
        }
        final int f = this.f ? 1 : 0;
        final int n2 = 1;
        int n3 = f;
        if (f != 0) {
            n3 = 1;
        }
        int g;
        if ((g = (this.g ? 1 : 0)) != 0) {
            g = 1;
        }
        final long h = this.h;
        final int n4 = (int)(h ^ h >>> 32);
        final String i = this.i;
        int hashCode6;
        if (i == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = i.hashCode();
        }
        final String j = this.j;
        int hashCode7;
        if (j == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = j.hashCode();
        }
        final long k = this.k;
        final int n5 = (int)(k ^ k >>> 32);
        final String l = this.l;
        int hashCode8;
        if (l == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = l.hashCode();
        }
        final String m = this.m;
        int hashCode9;
        if (m == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = m.hashCode();
        }
        final Long n6 = this.n;
        int hashCode10;
        if (n6 == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = n6.hashCode();
        }
        int o;
        if ((o = (this.o ? 1 : 0)) != 0) {
            o = 1;
        }
        int p;
        if ((p = (this.p ? 1 : 0)) != 0) {
            p = 1;
        }
        final int q = this.q;
        final int r = this.r;
        final int s = this.s;
        int g2;
        if (s == 0) {
            g2 = 0;
        }
        else {
            g2 = lb0.G(s);
        }
        int t;
        if ((t = (this.t ? 1 : 0)) != 0) {
            t = 1;
        }
        int u;
        if ((u = (this.u ? 1 : 0)) != 0) {
            u = 1;
        }
        final String v = this.v;
        int hashCode11;
        if (v == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = v.hashCode();
        }
        int w;
        if ((w = (this.w ? 1 : 0)) != 0) {
            w = 1;
        }
        final Long x = this.x;
        int hashCode12;
        if (x == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = x.hashCode();
        }
        final int q2 = z9a.q((Set)this.y, (((((((((((((((((((((((hashCode * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + n3) * 31 + g) * 31 + n4) * 31 + hashCode6) * 31 + hashCode7) * 31 + n5) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + o) * 31 + p) * 31 + q) * 31 + r) * 31 + g2) * 31 + t) * 31 + u) * 31 + hashCode11) * 31 + w) * 31 + hashCode12) * 31, 31);
        final int hashCode13 = this.z.hashCode();
        final Integer a = this.A;
        int hashCode14;
        if (a == null) {
            hashCode14 = n;
        }
        else {
            hashCode14 = a.hashCode();
        }
        int b2 = this.B ? 1 : 0;
        if (b2 != 0) {
            b2 = n2;
        }
        final long c2 = this.C;
        return (((hashCode13 + q2) * 31 + hashCode14) * 31 + b2) * 31 + (int)(c2 >>> 32 ^ c2);
    }
    
    @Override
    public final String toString() {
        final dl3 a = this.a;
        final String b = this.b;
        final y21 c = this.c;
        final String d = this.d;
        final z21 e = this.e;
        final boolean f = this.f;
        final boolean g = this.g;
        final long h = this.h;
        final String i = this.i;
        final String j = this.j;
        final long k = this.k;
        final String l = this.l;
        final String m = this.m;
        final Long n = this.n;
        final boolean o = this.o;
        final boolean p = this.p;
        final int q = this.q;
        final int r = this.r;
        final int s = this.s;
        final boolean t = this.t;
        final boolean u = this.u;
        final String v = this.v;
        final boolean w = this.w;
        final Long x = this.x;
        final Set<AudioSpaceTopicItem> y = this.y;
        final lbs z = this.z;
        final Integer a2 = this.A;
        final boolean b2 = this.B;
        final long c2 = this.C;
        final StringBuilder sb = new StringBuilder();
        sb.append("SpacesClipCardViewState(cardState=");
        sb.append(a);
        sb.append(", clipId=");
        sb.append(b);
        sb.append(", host=");
        sb.append(c);
        sb.append(", title=");
        sb.append(d);
        sb.append(", participants=");
        sb.append(e);
        sb.append(", isPlaying=");
        sb.append(f);
        sb.append(", shouldShowAutoplayBadge=");
        sb.append(g);
        sb.append(", playbackStartPositionMs=");
        sb.append(h);
        jba.s(sb, ", displayedClipDurationSeconds=", i, ", defaultDisplayedClipDurationSeconds=", j);
        po.E(sb, ", clipDurationMs=", k, ", speakerUserName=");
        jba.s(sb, l, ", speakerAvatarUrl=", m, ", speakerTwitterId=");
        sb.append(n);
        sb.append(", isMuted=");
        sb.append(o);
        sb.append(", shouldShowTranscriptions=");
        sb.append(p);
        sb.append(", volumeButtonResId=");
        sb.append(q);
        sb.append(", volumeButtonContentDescription=");
        sb.append(r);
        sb.append(", spaceState=");
        sb.append(awg.m(s));
        sb.append(", shouldPlayWhenLoaded=");
        sb.append(t);
        sb.append(", shouldAutoplay=");
        sb.append(u);
        sb.append(", actionButtonText=");
        sb.append(v);
        sb.append(", isHost=");
        sb.append(w);
        sb.append(", startedAt=");
        sb.append(x);
        sb.append(", topics=");
        sb.append(y);
        sb.append(", talkingViewState=");
        sb.append(z);
        sb.append(", backgroundColor=");
        sb.append(a2);
        sb.append(", isCommunity=");
        sb.append(b2);
        return go9.q(sb, ", currentProgressMs=", c2, ")");
    }
}
