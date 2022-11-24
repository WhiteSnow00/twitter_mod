import java.util.Objects;
import java.util.Collections;
import com.twitter.rooms.model.helpers.CohostInvite;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.Set;
import tv.periscope.model.b;
import com.twitter.rooms.di.room.RoomObjectGraph;
import com.twitter.rooms.manager.RoomStateManager$l0;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lrn implements ccx
{
    public final Boolean A;
    public final boolean B;
    public final Map<String, Long> C;
    public final int D;
    public final Integer E;
    public final faw F;
    public final cnq G;
    public final String H;
    public final String I;
    public final boolean J;
    public final zmk K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final Long O;
    public final RoomStateManager$l0 P;
    public final boolean Q;
    public final RoomObjectGraph a;
    public final String b;
    public final boolean c;
    public final ci6 d;
    public final b e;
    public final x21 f;
    public final yh5 g;
    public final String h;
    public final qu3 i;
    public final String j;
    public final Set<lpn> k;
    public final Set<RoomUserItem> l;
    public final Set<RoomUserItem> m;
    public final Set<RoomUserItem> n;
    public final Set<CohostInvite> o;
    public final Map<String, Integer> p;
    public final Map<String, awj<RoomUserItem, Long>> q;
    public final Map<Long, Long> r;
    public final int s;
    public final int t;
    public final mrn u;
    public final yf3 v;
    public final w1r w;
    public final boolean x;
    public final String y;
    public final String z;
    
    public lrn() {
        this(null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, null, false, null, null, null, false, null, 0, null, null, null, null, null, false, null, false, false, false, null, null, false, -1, 2047, null);
    }
    
    public lrn(final RoomObjectGraph a, final String b, final boolean c, final ci6 d, final b e, final x21 f, final yh5 g, final String h, final qu3 i, final String j, final Set<lpn> k, final Set<RoomUserItem> l, final Set<RoomUserItem> m, final Set<RoomUserItem> n, final Set<CohostInvite> o, final Map<String, Integer> p43, final Map<String, awj<RoomUserItem, Long>> q, final Map<Long, Long> r, final int s, final int t, final mrn u, final yf3 v, final w1r w, final boolean x, final String y, final String z, final Boolean a2, final boolean b2, final Map<String, Long> c2, final int d2, final Integer e2, final faw f2, final cnq g2, final String h2, final String i2, final boolean j2, final zmk k2, final boolean l2, final boolean m2, final boolean n2, final Long o2, final RoomStateManager$l0 p44, final boolean q2) {
        e0e.f((Object)d, "connectionAudioSpaceState");
        e0e.f((Object)k, "invitedSpeakers");
        e0e.f((Object)l, "listeners");
        e0e.f((Object)m, "speakers");
        e0e.f((Object)n, "admins");
        e0e.f((Object)o, "invitedCohosts");
        e0e.f((Object)p43, "cohostInviteCounts");
        e0e.f((Object)q, "connectingUsers");
        e0e.f((Object)r, "provisionalSpeakers");
        e0e.f((Object)u, "roomManagerType");
        e0e.f((Object)v, "canJoinAsSpeaker");
        e0e.f((Object)w, "hasJoinedAsSpeaker");
        e0e.f((Object)c2, "requestedUserIds");
        e0e.f((Object)f2, "userCohostState");
        e0e.f((Object)g2, "spaceClippingState");
        e0e.f((Object)k2, "playbackMode");
        e0e.f((Object)p44, "roomCreationArgs");
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
        this.p = p43;
        this.q = q;
        this.r = r;
        this.s = s;
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
        this.P = p44;
        this.Q = q2;
    }
    
    public lrn(final RoomObjectGraph roomObjectGraph, final String s, final boolean b, ci6 i0, final b b2, final x21 x21, final yh5 yh5, final String s2, final qu3 qu3, final String s3, final Set set, final Set set2, final Set set3, final Set set4, final Set set5, final Map map, final Map map2, final Map map3, final int n, final int n2, final mrn mrn, final yf3 yf3, final w1r w1r, final boolean b3, final String s4, final String s5, final Boolean b4, final boolean b5, final Map map4, final int n3, final Integer n4, final faw faw, final cnq cnq, final String s6, final String s7, final boolean b6, final zmk zmk, final boolean b7, final boolean b8, final boolean b9, final Long n5, final RoomStateManager$l0 roomStateManager$l0, final boolean b10, final int n6, final int n7, final wg8 wg8) {
        i0 = ci6.I0;
        final r3a f0 = r3a.F0;
        final Map<Object, Object> emptyMap = (Map<Object, Object>)Collections.emptyMap();
        e0e.e((Object)emptyMap, "emptyMap()");
        final Map<Object, Object> emptyMap2 = (Map<Object, Object>)Collections.emptyMap();
        e0e.e((Object)emptyMap2, "emptyMap()");
        final Map<Object, Object> emptyMap3 = (Map<Object, Object>)Collections.emptyMap();
        e0e.e((Object)emptyMap3, "emptyMap()");
        this(null, null, true, i0, null, null, null, null, null, null, (Set<lpn>)f0, (Set<RoomUserItem>)f0, (Set<RoomUserItem>)f0, (Set<RoomUserItem>)f0, (Set<CohostInvite>)f0, (Map<String, Integer>)emptyMap, (Map<String, awj<RoomUserItem, Long>>)emptyMap2, (Map<Long, Long>)emptyMap3, 0, 0, mrn.G0, yf3.H0, w1r.F0, false, null, null, null, false, (Map<String, Long>)m3a.F0, 0, null, faw.K0, cnq.H0, null, null, false, zmk.H0, false, false, false, null, new RoomStateManager$l0(false, 7), false);
    }
    
    public static lrn l(final lrn lrn, RoomObjectGraph a, String b, boolean c, ci6 d, b e, x21 f, yh5 g, String h, qu3 i, String j, Set k, Set l, Set m, Set n, Set o, Map p46, Map q, Map r, int s, int t, mrn u, yf3 v, w1r w, boolean x, String y, String z, Boolean a2, boolean b2, Map c2, int d2, Integer e2, faw f2, cnq g2, String h2, String i2, boolean j2, zmk k2, boolean l2, boolean m2, boolean n2, Long o2, RoomStateManager$l0 p47, boolean q2, final int n3, final int n4) {
        if ((n3 & 0x1) != 0x0) {
            a = lrn.a;
        }
        if ((n3 & 0x2) != 0x0) {
            b = lrn.b;
        }
        if ((n3 & 0x4) != 0x0) {
            c = lrn.c;
        }
        if ((n3 & 0x8) != 0x0) {
            d = lrn.d;
        }
        if ((n3 & 0x10) != 0x0) {
            e = lrn.e;
        }
        if ((n3 & 0x20) != 0x0) {
            f = lrn.f;
        }
        if ((n3 & 0x40) != 0x0) {
            g = lrn.g;
        }
        if ((n3 & 0x80) != 0x0) {
            h = lrn.h;
        }
        if ((n3 & 0x100) != 0x0) {
            i = lrn.i;
        }
        if ((n3 & 0x200) != 0x0) {
            j = lrn.j;
        }
        if ((n3 & 0x400) != 0x0) {
            k = lrn.k;
        }
        if ((n3 & 0x800) != 0x0) {
            l = lrn.l;
        }
        if ((n3 & 0x1000) != 0x0) {
            m = lrn.m;
        }
        if ((n3 & 0x2000) != 0x0) {
            n = lrn.n;
        }
        if ((n3 & 0x4000) != 0x0) {
            o = lrn.o;
        }
        if ((n3 & 0x8000) != 0x0) {
            p46 = lrn.p;
        }
        if ((n3 & 0x10000) != 0x0) {
            q = lrn.q;
        }
        if ((n3 & 0x20000) != 0x0) {
            r = lrn.r;
        }
        if ((n3 & 0x40000) != 0x0) {
            s = lrn.s;
        }
        if ((n3 & 0x80000) != 0x0) {
            t = lrn.t;
        }
        if ((n3 & 0x100000) != 0x0) {
            u = lrn.u;
        }
        if ((n3 & 0x200000) != 0x0) {
            v = lrn.v;
        }
        if ((n3 & 0x400000) != 0x0) {
            w = lrn.w;
        }
        if ((n3 & 0x800000) != 0x0) {
            x = lrn.x;
        }
        if ((n3 & 0x1000000) != 0x0) {
            y = lrn.y;
        }
        if ((n3 & 0x2000000) != 0x0) {
            z = lrn.z;
        }
        if ((n3 & 0x4000000) != 0x0) {
            a2 = lrn.A;
        }
        if ((n3 & 0x8000000) != 0x0) {
            b2 = lrn.B;
        }
        if ((n3 & 0x10000000) != 0x0) {
            c2 = lrn.C;
        }
        if ((n3 & 0x20000000) != 0x0) {
            d2 = lrn.D;
        }
        if ((n3 & 0x40000000) != 0x0) {
            e2 = lrn.E;
        }
        if ((n3 & Integer.MIN_VALUE) != 0x0) {
            f2 = lrn.F;
        }
        if ((n4 & 0x1) != 0x0) {
            g2 = lrn.G;
        }
        if ((n4 & 0x2) != 0x0) {
            h2 = lrn.H;
        }
        if ((n4 & 0x4) != 0x0) {
            i2 = lrn.I;
        }
        if ((n4 & 0x8) != 0x0) {
            j2 = lrn.J;
        }
        if ((n4 & 0x10) != 0x0) {
            k2 = lrn.K;
        }
        if ((n4 & 0x20) != 0x0) {
            l2 = lrn.L;
        }
        if ((n4 & 0x40) != 0x0) {
            m2 = lrn.M;
        }
        if ((n4 & 0x80) != 0x0) {
            n2 = lrn.N;
        }
        if ((n4 & 0x100) != 0x0) {
            o2 = lrn.O;
        }
        if ((n4 & 0x200) != 0x0) {
            p47 = lrn.P;
        }
        if ((n4 & 0x400) != 0x0) {
            q2 = lrn.Q;
        }
        Objects.requireNonNull(lrn);
        e0e.f((Object)d, "connectionAudioSpaceState");
        e0e.f((Object)k, "invitedSpeakers");
        e0e.f((Object)l, "listeners");
        e0e.f((Object)m, "speakers");
        e0e.f((Object)n, "admins");
        e0e.f((Object)o, "invitedCohosts");
        e0e.f((Object)p46, "cohostInviteCounts");
        e0e.f((Object)q, "connectingUsers");
        e0e.f((Object)r, "provisionalSpeakers");
        e0e.f((Object)u, "roomManagerType");
        e0e.f((Object)v, "canJoinAsSpeaker");
        e0e.f((Object)w, "hasJoinedAsSpeaker");
        e0e.f((Object)c2, "requestedUserIds");
        e0e.f((Object)f2, "userCohostState");
        e0e.f((Object)g2, "spaceClippingState");
        e0e.f((Object)k2, "playbackMode");
        e0e.f((Object)p47, "roomCreationArgs");
        return new lrn(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p46, q, r, s, t, u, v, w, x, y, z, a2, b2, c2, d2, e2, f2, g2, h2, i2, j2, k2, l2, m2, n2, o2, p47, q2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof lrn)) {
            return false;
        }
        final lrn lrn = (lrn)o;
        return e0e.a((Object)this.a, (Object)lrn.a) && e0e.a((Object)this.b, (Object)lrn.b) && this.c == lrn.c && this.d == lrn.d && e0e.a((Object)this.e, (Object)lrn.e) && e0e.a((Object)this.f, (Object)lrn.f) && e0e.a((Object)this.g, (Object)lrn.g) && e0e.a((Object)this.h, (Object)lrn.h) && e0e.a((Object)this.i, (Object)lrn.i) && e0e.a((Object)this.j, (Object)lrn.j) && e0e.a((Object)this.k, (Object)lrn.k) && e0e.a((Object)this.l, (Object)lrn.l) && e0e.a((Object)this.m, (Object)lrn.m) && e0e.a((Object)this.n, (Object)lrn.n) && e0e.a((Object)this.o, (Object)lrn.o) && e0e.a((Object)this.p, (Object)lrn.p) && e0e.a((Object)this.q, (Object)lrn.q) && e0e.a((Object)this.r, (Object)lrn.r) && this.s == lrn.s && this.t == lrn.t && this.u == lrn.u && this.v == lrn.v && this.w == lrn.w && this.x == lrn.x && e0e.a((Object)this.y, (Object)lrn.y) && e0e.a((Object)this.z, (Object)lrn.z) && e0e.a((Object)this.A, (Object)lrn.A) && this.B == lrn.B && e0e.a((Object)this.C, (Object)lrn.C) && this.D == lrn.D && e0e.a((Object)this.E, (Object)lrn.E) && this.F == lrn.F && this.G == lrn.G && e0e.a((Object)this.H, (Object)lrn.H) && e0e.a((Object)this.I, (Object)lrn.I) && this.J == lrn.J && this.K == lrn.K && this.L == lrn.L && this.M == lrn.M && this.N == lrn.N && e0e.a((Object)this.O, (Object)lrn.O) && e0e.a((Object)this.P, (Object)lrn.P) && this.Q == lrn.Q;
    }
    
    public final String getTitle() {
        final x21 f = this.f;
        String j;
        if (f != null) {
            j = f.j;
        }
        else {
            j = null;
        }
        return j;
    }
    
    @Override
    public final int hashCode() {
        final RoomObjectGraph a = this.a;
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
        final int c = this.c ? 1 : 0;
        int n = 1;
        int n2 = c;
        if (c != 0) {
            n2 = 1;
        }
        final int hashCode4 = this.d.hashCode();
        final b e = this.e;
        int hashCode5;
        if (e == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = e.hashCode();
        }
        final x21 f = this.f;
        int hashCode6;
        if (f == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = f.hashCode();
        }
        final yh5 g = this.g;
        int hashCode7;
        if (g == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = g.hashCode();
        }
        final String h = this.h;
        int hashCode8;
        if (h == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = h.hashCode();
        }
        final qu3 i = this.i;
        int hashCode9;
        if (i == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = i.hashCode();
        }
        final String j = this.j;
        int hashCode10;
        if (j == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = j.hashCode();
        }
        final int q = z9a.q((Set)this.o, z9a.q((Set)this.n, z9a.q((Set)this.m, z9a.q((Set)this.l, z9a.q((Set)this.k, (((((((hashCode4 + ((hashCode2 * 31 + hashCode3) * 31 + n2) * 31) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31, 31), 31), 31), 31), 31);
        final int hashCode11 = this.p.hashCode();
        final int hashCode12 = this.q.hashCode();
        final int hashCode13 = this.r.hashCode();
        final int s = this.s;
        final int t = this.t;
        final int hashCode14 = this.u.hashCode();
        final int hashCode15 = this.v.hashCode();
        final int hashCode16 = this.w.hashCode();
        int x;
        if ((x = (this.x ? 1 : 0)) != 0) {
            x = 1;
        }
        final String y = this.y;
        int hashCode17;
        if (y == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = y.hashCode();
        }
        final String z = this.z;
        int hashCode18;
        if (z == null) {
            hashCode18 = 0;
        }
        else {
            hashCode18 = z.hashCode();
        }
        final Boolean a2 = this.A;
        int hashCode19;
        if (a2 == null) {
            hashCode19 = 0;
        }
        else {
            hashCode19 = a2.hashCode();
        }
        int b2;
        if ((b2 = (this.B ? 1 : 0)) != 0) {
            b2 = 1;
        }
        final int hashCode20 = this.C.hashCode();
        final int d = this.D;
        final Integer e2 = this.E;
        int hashCode21;
        if (e2 == null) {
            hashCode21 = 0;
        }
        else {
            hashCode21 = e2.hashCode();
        }
        final int hashCode22 = this.F.hashCode();
        final int hashCode23 = this.G.hashCode();
        final String h2 = this.H;
        int hashCode24;
        if (h2 == null) {
            hashCode24 = 0;
        }
        else {
            hashCode24 = h2.hashCode();
        }
        final String k = this.I;
        int hashCode25;
        if (k == null) {
            hashCode25 = 0;
        }
        else {
            hashCode25 = k.hashCode();
        }
        int l;
        if ((l = (this.J ? 1 : 0)) != 0) {
            l = 1;
        }
        final int hashCode26 = this.K.hashCode();
        int m;
        if ((m = (this.L ? 1 : 0)) != 0) {
            m = 1;
        }
        int m2;
        if ((m2 = (this.M ? 1 : 0)) != 0) {
            m2 = 1;
        }
        int n3;
        if ((n3 = (this.N ? 1 : 0)) != 0) {
            n3 = 1;
        }
        final Long o = this.O;
        if (o != null) {
            hashCode = o.hashCode();
        }
        final int hashCode27 = this.P.hashCode();
        final int q2 = this.Q ? 1 : 0;
        if (q2 == 0) {
            n = q2;
        }
        return (hashCode27 + (((((hashCode26 + ((((hashCode23 + (hashCode22 + (((hashCode20 + ((((((hashCode16 + (hashCode15 + (hashCode14 + (((hashCode13 + (hashCode12 + (hashCode11 + q) * 31) * 31) * 31 + s) * 31 + t) * 31) * 31) * 31) * 31 + x) * 31 + hashCode17) * 31 + hashCode18) * 31 + hashCode19) * 31 + b2) * 31) * 31 + d) * 31 + hashCode21) * 31) * 31) * 31 + hashCode24) * 31 + hashCode25) * 31 + l) * 31) * 31 + m) * 31 + m2) * 31 + n3) * 31 + hashCode) * 31) * 31 + n;
    }
    
    public final boolean m() {
        return this.a != null;
    }
    
    public final boolean n() {
        return this.m() && this.d == ci6.F0;
    }
    
    public final boolean o() {
        final boolean n = this.n();
        boolean b = true;
        if (!n || this.b == null || this.u != mrn.G0) {
            b = false;
        }
        return b;
    }
    
    public final boolean p() {
        final boolean n = this.n();
        boolean b = true;
        if (!n || this.b == null || this.w != w1r.H0) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final String toString() {
        final RoomObjectGraph a = this.a;
        final String b = this.b;
        final boolean c = this.c;
        final ci6 d = this.d;
        final b e = this.e;
        final x21 f = this.f;
        final yh5 g = this.g;
        final String h = this.h;
        final qu3 i = this.i;
        final String j = this.j;
        final Set<lpn> k = this.k;
        final Set<RoomUserItem> l = this.l;
        final Set<RoomUserItem> m = this.m;
        final Set<RoomUserItem> n = this.n;
        final Set<CohostInvite> o = this.o;
        final Map<String, Integer> p = this.p;
        final Map<String, awj<RoomUserItem, Long>> q = this.q;
        final Map<Long, Long> r = this.r;
        final int s = this.s;
        final int t = this.t;
        final mrn u = this.u;
        final yf3 v = this.v;
        final w1r w = this.w;
        final boolean x = this.x;
        final String y = this.y;
        final String z = this.z;
        final Boolean a2 = this.A;
        final boolean b2 = this.B;
        final Map<String, Long> c2 = this.C;
        final int d2 = this.D;
        final Integer e2 = this.E;
        final faw f2 = this.F;
        final cnq g2 = this.G;
        final String h2 = this.H;
        final String i2 = this.I;
        final boolean j2 = this.J;
        final zmk k2 = this.K;
        final boolean l2 = this.L;
        final boolean m2 = this.M;
        final boolean n2 = this.N;
        final Long o2 = this.O;
        final RoomStateManager$l0 p2 = this.P;
        final boolean q2 = this.Q;
        final StringBuilder sb = new StringBuilder();
        sb.append("RoomManagerState(currentActiveRoomObjectGraph=");
        sb.append(a);
        sb.append(", roomId=");
        sb.append(b);
        sb.append(", isCurrentUserMuted=");
        sb.append(c);
        sb.append(", connectionAudioSpaceState=");
        sb.append(d);
        sb.append(", broadcast=");
        sb.append(e);
        sb.append(", audioSpace=");
        sb.append(f);
        sb.append(", community=");
        sb.append(g);
        sb.append(", communityId=");
        sb.append(h);
        sb.append(", chatAccess=");
        sb.append(i);
        sb.append(", lifecycleToken=");
        sb.append(j);
        sb.append(", invitedSpeakers=");
        sb.append(k);
        sb.append(", listeners=");
        sb.append(l);
        sb.append(", speakers=");
        sb.append(m);
        sb.append(", admins=");
        sb.append(n);
        sb.append(", invitedCohosts=");
        sb.append(o);
        sb.append(", cohostInviteCounts=");
        sb.append(p);
        sb.append(", connectingUsers=");
        sb.append(q);
        sb.append(", provisionalSpeakers=");
        sb.append(r);
        sb.append(", remainingParticipants=");
        ffe.p(sb, s, ", listenersCount=", t, ", roomManagerType=");
        sb.append(u);
        sb.append(", canJoinAsSpeaker=");
        sb.append(v);
        sb.append(", hasJoinedAsSpeaker=");
        sb.append(w);
        sb.append(", isJoinRequestInProgress=");
        sb.append(x);
        sb.append(", sessionUuid=");
        jba.s(sb, y, ", description=", z, ", isSpaceMuted=");
        sb.append(a2);
        sb.append(", isRaisedHand=");
        sb.append(b2);
        sb.append(", requestedUserIds=");
        sb.append(c2);
        sb.append(", maxNumberOfCohosts=");
        sb.append(d2);
        sb.append(", remainingCohostSpots=");
        sb.append(e2);
        sb.append(", userCohostState=");
        sb.append(f2);
        sb.append(", spaceClippingState=");
        sb.append(g2);
        sb.append(", clipId=");
        sb.append(h2);
        sb.append(", primaryAdminId=");
        o6f.g(sb, i2, ", isHostDisconnected=", j2, ", playbackMode=");
        sb.append(k2);
        sb.append(", isReplayPlaying=");
        sb.append(l2);
        sb.append(", isSpaceRecording=");
        l58.l(sb, m2, ", isEditingReplayStartTime=", n2, ", listenerJoinTimeMs=");
        sb.append(o2);
        sb.append(", roomCreationArgs=");
        sb.append(p2);
        sb.append(", isPlayingStation=");
        return xj0.B(sb, q2, ")");
    }
}
