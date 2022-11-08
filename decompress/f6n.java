import tv.periscope.model.NarrowcastSpaceType$None;
import java.util.Objects;
import java.util.Map;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.Set;
import tv.periscope.model.NarrowcastSpaceType;
import com.twitter.rooms.model.AudioSpaceTopicItem;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f6n implements oax
{
    public final boolean A;
    public final boolean B;
    public final h9w C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final List<AudioSpaceTopicItem> J;
    public final Long K;
    public final boolean L;
    public final boolean M;
    public final int N;
    public final boolean O;
    public final NarrowcastSpaceType P;
    public final boolean Q;
    public final int R;
    public final boolean S;
    public final boolean T;
    public final boolean U;
    public final boolean V;
    public final boolean W;
    public final boolean X;
    public final elu Y;
    public final boolean Z;
    public final boolean a;
    public final boolean a0;
    public final boolean b;
    public final boolean b0;
    public final qh6 c;
    public final w6o c0;
    public final dah d;
    public final Set<RoomUserItem> d0;
    public final boolean e;
    public final Set<RoomUserItem> e0;
    public final q31 f;
    public final Set<RoomUserItem> f0;
    public final hm g;
    public final Set<RoomUserItem> g0;
    public final String h;
    public final Long i;
    public final String j;
    public final boolean k;
    public final ypp l;
    public final hqn m;
    public final boolean n;
    public final Map<w1a, a1a> o;
    public final boolean p;
    public final boolean q;
    public final String r;
    public final List<ewp> s;
    public final int t;
    public final oit u;
    public final oit v;
    public final lh5 w;
    public final String x;
    public final oit y;
    public final oit z;
    
    public f6n() {
        this(false, -1, 4194303);
    }
    
    public f6n(boolean b, int n, final int n2) {
        qh6 f0;
        if ((n & 0x4) != 0x0) {
            f0 = qh6.F0;
        }
        else {
            f0 = null;
        }
        dah c0;
        if ((n & 0x8) != 0x0) {
            c0 = dah.C0;
        }
        else {
            c0 = null;
        }
        q31 g;
        if ((n & 0x20) != 0x0) {
            Objects.requireNonNull(q31.Companion);
            g = q31.g;
        }
        else {
            g = null;
        }
        hm f2;
        if ((n & 0x40) != 0x0) {
            f2 = hm.F0;
        }
        else {
            f2 = null;
        }
        hqn d0;
        if ((n & 0x1000) != 0x0) {
            d0 = hqn.D0;
        }
        else {
            d0 = null;
        }
        Object c2;
        if ((n & 0x4000) != 0x0) {
            c2 = a3a.C0;
        }
        else {
            c2 = null;
        }
        Object c3;
        if ((0x40000 & n) != 0x0) {
            c3 = v2a.C0;
        }
        else {
            c3 = null;
        }
        oit f3;
        if ((n & 0x200000) != 0x0) {
            f3 = oit.f1;
        }
        else {
            f3 = null;
        }
        h9w h0;
        if ((n & 0x10000000) != 0x0) {
            h0 = h9w.H0;
        }
        else {
            h0 = null;
        }
        Object c4;
        if ((n2 & 0x8) != 0x0) {
            c4 = v2a.C0;
        }
        else {
            c4 = null;
        }
        Object instance;
        if ((n2 & 0x200) != 0x0) {
            instance = NarrowcastSpaceType$None.INSTANCE;
        }
        else {
            instance = null;
        }
        if ((n2 & 0x800) != 0x0) {
            n = 2131952078;
        }
        else {
            n = 0;
        }
        if ((n2 & 0x200000) != 0x0) {
            b = false;
        }
        this(false, false, f0, c0, false, g, f2, null, null, null, false, null, d0, false, (Map<w1a, ? extends a1a>)c2, false, false, null, (List<? extends ewp>)c3, 0, null, f3, null, null, null, null, false, false, h0, false, false, false, false, false, false, (List<AudioSpaceTopicItem>)c4, null, false, false, 0, false, (NarrowcastSpaceType)instance, false, n, false, false, false, false, false, false, null, false, false, b);
    }
    
    public f6n(final boolean a, final boolean b, final qh6 c, final dah d, final boolean e, final q31 f, final hm g, final String h, final Long i, final String j, final boolean k, final ypp l, final hqn m, final boolean n, final Map<w1a, ? extends a1a> o, final boolean p54, final boolean q, final String r, final List<? extends ewp> s, final int t, final oit u, final oit v, final lh5 w, final String x, final oit y, final oit z, final boolean a2, final boolean b2, final h9w c2, final boolean d2, final boolean e2, final boolean f2, final boolean g2, final boolean h2, final boolean i2, final List<AudioSpaceTopicItem> j2, final Long k2, final boolean l2, final boolean m2, final int n2, final boolean o2, final NarrowcastSpaceType p55, final boolean q2, final int r2, final boolean s2, final boolean t2, final boolean u2, final boolean v2, final boolean w2, final boolean x2, final elu y2, final boolean z2, final boolean a3, final boolean b3) {
        zzd.f((Object)c, "connectionAudioSpaceState");
        zzd.f((Object)d, "micState");
        zzd.f((Object)f, "userList");
        zzd.f((Object)g, "currentlyShownActionView");
        zzd.f((Object)m, "roomManagerType");
        zzd.f((Object)o, "emojiColors");
        zzd.f((Object)s, "sharedContent");
        zzd.f((Object)v, "communitySpaceParticipantTooltip");
        zzd.f((Object)c2, "userCohostState");
        zzd.f((Object)j2, "taggedTopics");
        zzd.f((Object)p55, "narrowCastSpaceType");
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
        this.o = (Map<w1a, a1a>)o;
        this.p = p54;
        this.q = q;
        this.r = r;
        this.s = (List<ewp>)s;
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
        this.D = d2;
        this.E = e2;
        this.F = f2;
        this.G = g2;
        this.H = h2;
        this.I = i2;
        this.J = j2;
        this.K = k2;
        this.L = l2;
        this.M = m2;
        this.N = n2;
        this.O = o2;
        this.P = p55;
        this.Q = q2;
        this.R = r2;
        this.S = s2;
        this.T = t2;
        this.U = u2;
        this.V = v2;
        this.W = w2;
        this.X = x2;
        this.Y = y2;
        this.Z = z2;
        this.a0 = a3;
        this.b0 = b3;
        this.c0 = new w6o(t, s.isEmpty() ^ true);
        this.d0 = f.a;
        this.e0 = f.c;
        this.f0 = f.b;
        this.g0 = f.d;
    }
    
    public static f6n l(final f6n f6n, boolean b, qh6 c, dah d, boolean e, q31 f, hm g, String h, Long i, String j, boolean k, ypp l, hqn m, boolean n, Map o, boolean p55, boolean q, String r, List s, int t, oit u, oit v, lh5 w, String x, oit y, oit z, boolean a, boolean b2, h9w c2, boolean d2, boolean e2, boolean f2, boolean g2, boolean h2, boolean i2, List j2, Long k2, boolean l2, boolean m2, int n2, boolean o2, NarrowcastSpaceType p56, boolean q2, int r2, boolean s2, boolean t2, boolean u2, boolean v2, boolean w2, boolean x2, elu y2, boolean z2, boolean a2, final int n3, final int n4) {
        final boolean b3 = (n3 & 0x1) != 0x0 && f6n.a;
        if ((n3 & 0x2) != 0x0) {
            b = f6n.b;
        }
        if ((n3 & 0x4) != 0x0) {
            c = f6n.c;
        }
        if ((n3 & 0x8) != 0x0) {
            d = f6n.d;
        }
        if ((n3 & 0x10) != 0x0) {
            e = f6n.e;
        }
        if ((n3 & 0x20) != 0x0) {
            f = f6n.f;
        }
        if ((n3 & 0x40) != 0x0) {
            g = f6n.g;
        }
        if ((n3 & 0x80) != 0x0) {
            h = f6n.h;
        }
        if ((n3 & 0x100) != 0x0) {
            i = f6n.i;
        }
        if ((n3 & 0x200) != 0x0) {
            j = f6n.j;
        }
        if ((n3 & 0x400) != 0x0) {
            k = f6n.k;
        }
        if ((n3 & 0x800) != 0x0) {
            l = f6n.l;
        }
        if ((n3 & 0x1000) != 0x0) {
            m = f6n.m;
        }
        if ((n3 & 0x2000) != 0x0) {
            n = f6n.n;
        }
        if ((n3 & 0x4000) != 0x0) {
            o = f6n.o;
        }
        if ((n3 & 0x8000) != 0x0) {
            p55 = f6n.p;
        }
        if ((n3 & 0x10000) != 0x0) {
            q = f6n.q;
        }
        if ((n3 & 0x20000) != 0x0) {
            r = f6n.r;
        }
        if ((n3 & 0x40000) != 0x0) {
            s = f6n.s;
        }
        if ((n3 & 0x80000) != 0x0) {
            t = f6n.t;
        }
        if ((n3 & 0x100000) != 0x0) {
            u = f6n.u;
        }
        if ((n3 & 0x200000) != 0x0) {
            v = f6n.v;
        }
        if ((n3 & 0x400000) != 0x0) {
            w = f6n.w;
        }
        if ((n3 & 0x800000) != 0x0) {
            x = f6n.x;
        }
        if ((n3 & 0x1000000) != 0x0) {
            y = f6n.y;
        }
        if ((n3 & 0x2000000) != 0x0) {
            z = f6n.z;
        }
        if ((n3 & 0x4000000) != 0x0) {
            a = f6n.A;
        }
        if ((n3 & 0x8000000) != 0x0) {
            b2 = f6n.B;
        }
        if ((n3 & 0x10000000) != 0x0) {
            c2 = f6n.C;
        }
        if ((n3 & 0x20000000) != 0x0) {
            d2 = f6n.D;
        }
        if ((n3 & 0x40000000) != 0x0) {
            e2 = f6n.E;
        }
        if ((n3 & Integer.MIN_VALUE) != 0x0) {
            f2 = f6n.F;
        }
        if ((n4 & 0x1) != 0x0) {
            g2 = f6n.G;
        }
        if ((n4 & 0x2) != 0x0) {
            h2 = f6n.H;
        }
        if ((n4 & 0x4) != 0x0) {
            i2 = f6n.I;
        }
        if ((n4 & 0x8) != 0x0) {
            j2 = f6n.J;
        }
        if ((n4 & 0x10) != 0x0) {
            k2 = f6n.K;
        }
        if ((n4 & 0x20) != 0x0) {
            l2 = f6n.L;
        }
        if ((n4 & 0x40) != 0x0) {
            m2 = f6n.M;
        }
        if ((n4 & 0x80) != 0x0) {
            n2 = f6n.N;
        }
        if ((n4 & 0x100) != 0x0) {
            o2 = f6n.O;
        }
        if ((n4 & 0x200) != 0x0) {
            p56 = f6n.P;
        }
        if ((n4 & 0x400) != 0x0) {
            q2 = f6n.Q;
        }
        if ((n4 & 0x800) != 0x0) {
            r2 = f6n.R;
        }
        if ((n4 & 0x1000) != 0x0) {
            s2 = f6n.S;
        }
        if ((n4 & 0x2000) != 0x0) {
            t2 = f6n.T;
        }
        if ((n4 & 0x4000) != 0x0) {
            u2 = f6n.U;
        }
        if ((n4 & 0x8000) != 0x0) {
            v2 = f6n.V;
        }
        if ((n4 & 0x10000) != 0x0) {
            w2 = f6n.W;
        }
        if ((n4 & 0x20000) != 0x0) {
            x2 = f6n.X;
        }
        if ((n4 & 0x40000) != 0x0) {
            y2 = f6n.Y;
        }
        if ((n4 & 0x80000) != 0x0) {
            z2 = f6n.Z;
        }
        if ((n4 & 0x100000) != 0x0) {
            a2 = f6n.a0;
        }
        final boolean b4 = (n4 & 0x200000) != 0x0 && f6n.b0;
        Objects.requireNonNull(f6n);
        zzd.f((Object)c, "connectionAudioSpaceState");
        zzd.f((Object)d, "micState");
        zzd.f((Object)f, "userList");
        zzd.f((Object)g, "currentlyShownActionView");
        zzd.f((Object)m, "roomManagerType");
        zzd.f((Object)o, "emojiColors");
        zzd.f((Object)s, "sharedContent");
        zzd.f((Object)v, "communitySpaceParticipantTooltip");
        zzd.f((Object)c2, "userCohostState");
        zzd.f((Object)j2, "taggedTopics");
        zzd.f((Object)p56, "narrowCastSpaceType");
        return new f6n(b3, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p55, q, r, s, t, u, v, w, x, y, z, a, b2, c2, d2, e2, f2, g2, h2, i2, j2, k2, l2, m2, n2, o2, p56, q2, r2, s2, t2, u2, v2, w2, x2, y2, z2, a2, b4);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof f6n)) {
            return false;
        }
        final f6n f6n = (f6n)o;
        return this.a == f6n.a && this.b == f6n.b && this.c == f6n.c && this.d == f6n.d && this.e == f6n.e && zzd.a((Object)this.f, (Object)f6n.f) && this.g == f6n.g && zzd.a((Object)this.h, (Object)f6n.h) && zzd.a((Object)this.i, (Object)f6n.i) && zzd.a((Object)this.j, (Object)f6n.j) && this.k == f6n.k && zzd.a((Object)this.l, (Object)f6n.l) && this.m == f6n.m && this.n == f6n.n && zzd.a((Object)this.o, (Object)f6n.o) && this.p == f6n.p && this.q == f6n.q && zzd.a((Object)this.r, (Object)f6n.r) && zzd.a((Object)this.s, (Object)f6n.s) && this.t == f6n.t && this.u == f6n.u && this.v == f6n.v && zzd.a((Object)this.w, (Object)f6n.w) && zzd.a((Object)this.x, (Object)f6n.x) && this.y == f6n.y && this.z == f6n.z && this.A == f6n.A && this.B == f6n.B && this.C == f6n.C && this.D == f6n.D && this.E == f6n.E && this.F == f6n.F && this.G == f6n.G && this.H == f6n.H && this.I == f6n.I && zzd.a((Object)this.J, (Object)f6n.J) && zzd.a((Object)this.K, (Object)f6n.K) && this.L == f6n.L && this.M == f6n.M && this.N == f6n.N && this.O == f6n.O && zzd.a((Object)this.P, (Object)f6n.P) && this.Q == f6n.Q && this.R == f6n.R && this.S == f6n.S && this.T == f6n.T && this.U == f6n.U && this.V == f6n.V && this.W == f6n.W && this.X == f6n.X && zzd.a((Object)this.Y, (Object)f6n.Y) && this.Z == f6n.Z && this.a0 == f6n.a0 && this.b0 == f6n.b0;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a ? 1 : 0;
        int n = 1;
        int n2 = a;
        if (a != 0) {
            n2 = 1;
        }
        int b;
        if ((b = (this.b ? 1 : 0)) != 0) {
            b = 1;
        }
        final int hashCode = this.c.hashCode();
        final int hashCode2 = this.d.hashCode();
        int e;
        if ((e = (this.e ? 1 : 0)) != 0) {
            e = 1;
        }
        final int hashCode3 = this.f.hashCode();
        final int hashCode4 = this.g.hashCode();
        final String h = this.h;
        final int n3 = 0;
        int hashCode5;
        if (h == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = h.hashCode();
        }
        final Long i = this.i;
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
        int k;
        if ((k = (this.k ? 1 : 0)) != 0) {
            k = 1;
        }
        final ypp l = this.l;
        int hashCode8;
        if (l == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = l.hashCode();
        }
        final int hashCode9 = this.m.hashCode();
        int n4;
        if ((n4 = (this.n ? 1 : 0)) != 0) {
            n4 = 1;
        }
        final int hashCode10 = this.o.hashCode();
        int p;
        if ((p = (this.p ? 1 : 0)) != 0) {
            p = 1;
        }
        int q;
        if ((q = (this.q ? 1 : 0)) != 0) {
            q = 1;
        }
        final String r = this.r;
        int hashCode11;
        if (r == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = r.hashCode();
        }
        final int m = hy8.m((List)this.s, ((((hashCode10 + ((hashCode9 + ((((((hashCode4 + (hashCode3 + ((hashCode2 + (hashCode + (n2 * 31 + b) * 31) * 31) * 31 + e) * 31) * 31) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + k) * 31 + hashCode8) * 31) * 31 + n4) * 31) * 31 + p) * 31 + q) * 31 + hashCode11) * 31, 31);
        final int t = this.t;
        final oit u = this.u;
        int hashCode12;
        if (u == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = u.hashCode();
        }
        final int hashCode13 = this.v.hashCode();
        final lh5 w = this.w;
        int hashCode14;
        if (w == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = w.hashCode();
        }
        final String x = this.x;
        int hashCode15;
        if (x == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = x.hashCode();
        }
        final oit y = this.y;
        int hashCode16;
        if (y == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = y.hashCode();
        }
        final oit z = this.z;
        int hashCode17;
        if (z == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = z.hashCode();
        }
        int a2;
        if ((a2 = (this.A ? 1 : 0)) != 0) {
            a2 = 1;
        }
        int b2;
        if ((b2 = (this.B ? 1 : 0)) != 0) {
            b2 = 1;
        }
        final int hashCode18 = this.C.hashCode();
        int d;
        if ((d = (this.D ? 1 : 0)) != 0) {
            d = 1;
        }
        int e2;
        if ((e2 = (this.E ? 1 : 0)) != 0) {
            e2 = 1;
        }
        int f;
        if ((f = (this.F ? 1 : 0)) != 0) {
            f = 1;
        }
        int g;
        if ((g = (this.G ? 1 : 0)) != 0) {
            g = 1;
        }
        int h2;
        if ((h2 = (this.H ? 1 : 0)) != 0) {
            h2 = 1;
        }
        int i2;
        if ((i2 = (this.I ? 1 : 0)) != 0) {
            i2 = 1;
        }
        final int m2 = hy8.m((List)this.J, (((((((hashCode18 + (((((((hashCode13 + ((m + t) * 31 + hashCode12) * 31) * 31 + hashCode14) * 31 + hashCode15) * 31 + hashCode16) * 31 + hashCode17) * 31 + a2) * 31 + b2) * 31) * 31 + d) * 31 + e2) * 31 + f) * 31 + g) * 31 + h2) * 31 + i2) * 31, 31);
        final Long k2 = this.K;
        int hashCode19;
        if (k2 == null) {
            hashCode19 = 0;
        }
        else {
            hashCode19 = k2.hashCode();
        }
        int l2;
        if ((l2 = (this.L ? 1 : 0)) != 0) {
            l2 = 1;
        }
        int m3;
        if ((m3 = (this.M ? 1 : 0)) != 0) {
            m3 = 1;
        }
        final int n5 = this.N;
        int o;
        if ((o = (this.O ? 1 : 0)) != 0) {
            o = 1;
        }
        final int hashCode20 = this.P.hashCode();
        int q2;
        if ((q2 = (this.Q ? 1 : 0)) != 0) {
            q2 = 1;
        }
        final int r2 = this.R;
        int s;
        if ((s = (this.S ? 1 : 0)) != 0) {
            s = 1;
        }
        int t2;
        if ((t2 = (this.T ? 1 : 0)) != 0) {
            t2 = 1;
        }
        int u2;
        if ((u2 = (this.U ? 1 : 0)) != 0) {
            u2 = 1;
        }
        int v;
        if ((v = (this.V ? 1 : 0)) != 0) {
            v = 1;
        }
        int w2;
        if ((w2 = (this.W ? 1 : 0)) != 0) {
            w2 = 1;
        }
        int x2;
        if ((x2 = (this.X ? 1 : 0)) != 0) {
            x2 = 1;
        }
        final elu y2 = this.Y;
        int hashCode21;
        if (y2 == null) {
            hashCode21 = n3;
        }
        else {
            hashCode21 = y2.hashCode();
        }
        int z2;
        if ((z2 = (this.Z ? 1 : 0)) != 0) {
            z2 = 1;
        }
        int a3;
        if ((a3 = (this.a0 ? 1 : 0)) != 0) {
            a3 = 1;
        }
        final int b3 = this.b0 ? 1 : 0;
        if (b3 == 0) {
            n = b3;
        }
        return ((((((((((((hashCode20 + (((((m2 + hashCode19) * 31 + l2) * 31 + m3) * 31 + n5) * 31 + o) * 31) * 31 + q2) * 31 + r2) * 31 + s) * 31 + t2) * 31 + u2) * 31 + v) * 31 + w2) * 31 + x2) * 31 + hashCode21) * 31 + z2) * 31 + a3) * 31 + n;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final boolean b = this.b;
        final qh6 c = this.c;
        final dah d = this.d;
        final boolean e = this.e;
        final q31 f = this.f;
        final hm g = this.g;
        final String h = this.h;
        final Long i = this.i;
        final String j = this.j;
        final boolean k = this.k;
        final ypp l = this.l;
        final hqn m = this.m;
        final boolean n = this.n;
        final Map<w1a, a1a> o = this.o;
        final boolean p = this.p;
        final boolean q = this.q;
        final String r = this.r;
        final List<ewp> s = this.s;
        final int t = this.t;
        final oit u = this.u;
        final oit v = this.v;
        final lh5 w = this.w;
        final String x = this.x;
        final oit y = this.y;
        final oit z = this.z;
        final boolean a2 = this.A;
        final boolean b2 = this.B;
        final h9w c2 = this.C;
        final boolean d2 = this.D;
        final boolean e2 = this.E;
        final boolean f2 = this.F;
        final boolean g2 = this.G;
        final boolean h2 = this.H;
        final boolean i2 = this.I;
        final List<AudioSpaceTopicItem> j2 = this.J;
        final Long k2 = this.K;
        final boolean l2 = this.L;
        final boolean m2 = this.M;
        final int n2 = this.N;
        final boolean o2 = this.O;
        final NarrowcastSpaceType p2 = this.P;
        final boolean q2 = this.Q;
        final int r2 = this.R;
        final boolean s2 = this.S;
        final boolean t2 = this.T;
        final boolean u2 = this.U;
        final boolean v2 = this.V;
        final boolean w2 = this.W;
        final boolean x2 = this.X;
        final elu y2 = this.Y;
        final boolean z2 = this.Z;
        final boolean a3 = this.a0;
        final boolean b3 = this.b0;
        final StringBuilder k3 = hi.K("RoomAudioSpaceViewState(isEnabled=", a, ", isRaisedHand=", b, ", connectionAudioSpaceState=");
        k3.append(c);
        k3.append(", micState=");
        k3.append(d);
        k3.append(", isMicButtonDisabled=");
        k3.append(e);
        k3.append(", userList=");
        k3.append(f);
        k3.append(", currentlyShownActionView=");
        k3.append(g);
        k3.append(", broadcastId=");
        k3.append(h);
        k3.append(", startedAt=");
        k3.append(i);
        k3.append(", hostTwitterUserId=");
        k3.append(j);
        k3.append(", canSwitchToListening=");
        k3.append(k);
        k3.append(", currentlyShownSettingView=");
        k3.append(l);
        k3.append(", roomManagerType=");
        k3.append(m);
        k3.append(", settingsPageVisible=");
        k3.append(n);
        k3.append(", emojiColors=");
        k3.append(o);
        k3.append(", canAutoJoin=");
        k3.append(p);
        k3.append(", hostMutedAllSpeakers=");
        lf.z(k3, q, ", description=", r, ", sharedContent=");
        k3.append(s);
        k3.append(", sharedContentSelection=");
        k3.append(t);
        k3.append(", latestParticipantTooltip=");
        k3.append(u);
        k3.append(", communitySpaceParticipantTooltip=");
        k3.append(v);
        k3.append(", community=");
        k3.append(w);
        k3.append(", communityId=");
        k3.append(x);
        k3.append(", latestHostTooltip=");
        k3.append(y);
        k3.append(", latestCohostTooltip=");
        k3.append(z);
        k3.append(", cohostCanSwitchToListening=");
        lo0.z(k3, a2, ", hasAdminPrivileges=", b2, ", userCohostState=");
        k3.append(c2);
        k3.append(", isCohostSwitchingToListening=");
        k3.append(d2);
        k3.append(", isClipActionEnabled=");
        lo0.z(k3, e2, ", showClipSettings=", f2, ", shouldShowClipButton=");
        lo0.z(k3, g2, ", shouldShowHeaderShareButton=", h2, ", shouldShowBottomShareButton=");
        k3.append(i2);
        k3.append(", taggedTopics=");
        k3.append(j2);
        k3.append(", tweetId=");
        k3.append(k2);
        k3.append(", isEmployeeOnly=");
        k3.append(l2);
        k3.append(", isSpaceRecording=");
        k3.append(m2);
        k3.append(", spaceEntityReplyCount=");
        k3.append(n2);
        k3.append(", isEntityReplyRead=");
        k3.append(o2);
        k3.append(", narrowCastSpaceType=");
        k3.append(p2);
        k3.append(", isInPlaybackError=");
        k3.append(q2);
        k3.append(", headerCloseTextResId=");
        k3.append(r2);
        k3.append(", showTweetActionButton=");
        lo0.z(k3, s2, ", showReplyActionButton=", t2, ", isListener=");
        lo0.z(k3, u2, ", isHost=", v2, ", shouldShowClippingNUX=");
        lo0.z(k3, w2, ", timeInSpaceExceedsListenerNudgeThreshold=", x2, ", softInterventionPivot=");
        k3.append(y2);
        k3.append(", notAvailableForRank=");
        k3.append(z2);
        k3.append(", shouldShowFreeTicketOption=");
        return mag.k(k3, a3, ", isFullscreenView=", b3, ")");
    }
}
