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

public final class vqn implements jbx
{
    public final Boolean A;
    public final boolean B;
    public final Map<String, Long> C;
    public final int D;
    public final Integer E;
    public final p9w F;
    public final fmq G;
    public final String H;
    public final String I;
    public final boolean J;
    public final kmk K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final Long O;
    public final RoomStateManager$l0 P;
    public final boolean Q;
    public final RoomObjectGraph a;
    public final String b;
    public final boolean c;
    public final wg6 d;
    public final b e;
    public final r21 f;
    public final tg5 g;
    public final String h;
    public final qt3 i;
    public final String j;
    public final Set<uon> k;
    public final Set<RoomUserItem> l;
    public final Set<RoomUserItem> m;
    public final Set<RoomUserItem> n;
    public final Set<CohostInvite> o;
    public final Map<String, Integer> p;
    public final Map<String, lvj<RoomUserItem, Long>> q;
    public final Map<Long, Long> r;
    public final int s;
    public final int t;
    public final wqn u;
    public final ye3 v;
    public final z0r w;
    public final boolean x;
    public final String y;
    public final String z;
    
    public vqn() {
        this(null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, null, false, null, null, null, false, null, 0, null, null, null, null, null, false, null, false, false, false, null, null, false, -1, 2047, null);
    }
    
    public vqn(final RoomObjectGraph a, final String b, final boolean c, final wg6 d, final b e, final r21 f, final tg5 g, final String h, final qt3 i, final String j, final Set<uon> k, final Set<RoomUserItem> l, final Set<RoomUserItem> m, final Set<RoomUserItem> n, final Set<CohostInvite> o, final Map<String, Integer> p43, final Map<String, lvj<RoomUserItem, Long>> q, final Map<Long, Long> r, final int s, final int t, final wqn u, final ye3 v, final z0r w, final boolean x, final String y, final String z, final Boolean a2, final boolean b2, final Map<String, Long> c2, final int d2, final Integer e2, final p9w f2, final fmq g2, final String h2, final String i2, final boolean j2, final kmk k2, final boolean l2, final boolean m2, final boolean n2, final Long o2, final RoomStateManager$l0 p44, final boolean q2) {
        czd.f((Object)d, "connectionAudioSpaceState");
        czd.f((Object)k, "invitedSpeakers");
        czd.f((Object)l, "listeners");
        czd.f((Object)m, "speakers");
        czd.f((Object)n, "admins");
        czd.f((Object)o, "invitedCohosts");
        czd.f((Object)p43, "cohostInviteCounts");
        czd.f((Object)q, "connectingUsers");
        czd.f((Object)r, "provisionalSpeakers");
        czd.f((Object)u, "roomManagerType");
        czd.f((Object)v, "canJoinAsSpeaker");
        czd.f((Object)w, "hasJoinedAsSpeaker");
        czd.f((Object)c2, "requestedUserIds");
        czd.f((Object)f2, "userCohostState");
        czd.f((Object)g2, "spaceClippingState");
        czd.f((Object)k2, "playbackMode");
        czd.f((Object)p44, "roomCreationArgs");
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
    
    public vqn(final RoomObjectGraph roomObjectGraph, final String s, final boolean b, final wg6 wg6, final b b2, final r21 r21, final tg5 tg5, final String s2, final qt3 qt3, final String s3, final Set set, final Set set2, final Set set3, final Set set4, final Set set5, final Map map, final Map map2, final Map map3, final int n, final int n2, final wqn wqn, final ye3 ye3, final z0r z0r, final boolean b3, final String s4, final String s5, final Boolean b4, final boolean b5, final Map map4, final int n3, final Integer n4, final p9w p9w, final fmq fmq, final String s6, final String s7, final boolean b6, final kmk kmk, final boolean b7, final boolean b8, final boolean b9, final Long n5, final RoomStateManager$l0 roomStateManager$l0, final boolean b10, final int n6, final int n7, final rf8 rf8) {
        final wg6 g0 = wg6.G0;
        final p2a d0 = p2a.D0;
        final Map<String, Integer> emptyMap = Collections.emptyMap();
        czd.e((Object)emptyMap, "emptyMap()");
        final Map<String, lvj<RoomUserItem, Long>> emptyMap2 = Collections.emptyMap();
        czd.e((Object)emptyMap2, "emptyMap()");
        final Map<Long, Long> emptyMap3 = Collections.emptyMap();
        czd.e((Object)emptyMap3, "emptyMap()");
        this(null, null, true, g0, null, null, null, null, null, null, (Set<uon>)d0, (Set<RoomUserItem>)d0, (Set<RoomUserItem>)d0, (Set<RoomUserItem>)d0, (Set<CohostInvite>)d0, emptyMap, emptyMap2, emptyMap3, 0, 0, wqn.E0, ye3.F0, z0r.D0, false, null, null, null, false, (Map<String, Long>)k2a.D0, 0, null, p9w.I0, fmq.F0, null, null, false, kmk.F0, false, false, false, null, new RoomStateManager$l0(false, 7), false);
    }
    
    public static vqn l(final vqn vqn, RoomObjectGraph a, String b, boolean c, wg6 d, b e, r21 f, tg5 g, String h, qt3 i, String j, Set k, Set l, Set m, Set n, Set o, Map p46, Map q, Map r, int s, int t, wqn u, ye3 v, z0r w, boolean x, String y, String z, Boolean a2, boolean b2, Map c2, int d2, Integer e2, p9w f2, fmq g2, String h2, String i2, boolean j2, kmk k2, boolean l2, boolean m2, boolean n2, Long o2, RoomStateManager$l0 p47, boolean q2, final int n3, final int n4) {
        if ((n3 & 0x1) != 0x0) {
            a = vqn.a;
        }
        if ((n3 & 0x2) != 0x0) {
            b = vqn.b;
        }
        if ((n3 & 0x4) != 0x0) {
            c = vqn.c;
        }
        if ((n3 & 0x8) != 0x0) {
            d = vqn.d;
        }
        if ((n3 & 0x10) != 0x0) {
            e = vqn.e;
        }
        if ((n3 & 0x20) != 0x0) {
            f = vqn.f;
        }
        if ((n3 & 0x40) != 0x0) {
            g = vqn.g;
        }
        if ((n3 & 0x80) != 0x0) {
            h = vqn.h;
        }
        if ((n3 & 0x100) != 0x0) {
            i = vqn.i;
        }
        if ((n3 & 0x200) != 0x0) {
            j = vqn.j;
        }
        if ((n3 & 0x400) != 0x0) {
            k = vqn.k;
        }
        if ((n3 & 0x800) != 0x0) {
            l = vqn.l;
        }
        if ((n3 & 0x1000) != 0x0) {
            m = vqn.m;
        }
        if ((n3 & 0x2000) != 0x0) {
            n = vqn.n;
        }
        if ((n3 & 0x4000) != 0x0) {
            o = vqn.o;
        }
        if ((n3 & 0x8000) != 0x0) {
            p46 = vqn.p;
        }
        if ((n3 & 0x10000) != 0x0) {
            q = vqn.q;
        }
        if ((n3 & 0x20000) != 0x0) {
            r = vqn.r;
        }
        if ((n3 & 0x40000) != 0x0) {
            s = vqn.s;
        }
        if ((n3 & 0x80000) != 0x0) {
            t = vqn.t;
        }
        if ((n3 & 0x100000) != 0x0) {
            u = vqn.u;
        }
        if ((n3 & 0x200000) != 0x0) {
            v = vqn.v;
        }
        if ((n3 & 0x400000) != 0x0) {
            w = vqn.w;
        }
        if ((n3 & 0x800000) != 0x0) {
            x = vqn.x;
        }
        if ((n3 & 0x1000000) != 0x0) {
            y = vqn.y;
        }
        if ((n3 & 0x2000000) != 0x0) {
            z = vqn.z;
        }
        if ((n3 & 0x4000000) != 0x0) {
            a2 = vqn.A;
        }
        if ((n3 & 0x8000000) != 0x0) {
            b2 = vqn.B;
        }
        if ((n3 & 0x10000000) != 0x0) {
            c2 = vqn.C;
        }
        if ((n3 & 0x20000000) != 0x0) {
            d2 = vqn.D;
        }
        if ((n3 & 0x40000000) != 0x0) {
            e2 = vqn.E;
        }
        if ((n3 & Integer.MIN_VALUE) != 0x0) {
            f2 = vqn.F;
        }
        if ((n4 & 0x1) != 0x0) {
            g2 = vqn.G;
        }
        if ((n4 & 0x2) != 0x0) {
            h2 = vqn.H;
        }
        if ((n4 & 0x4) != 0x0) {
            i2 = vqn.I;
        }
        if ((n4 & 0x8) != 0x0) {
            j2 = vqn.J;
        }
        if ((n4 & 0x10) != 0x0) {
            k2 = vqn.K;
        }
        if ((n4 & 0x20) != 0x0) {
            l2 = vqn.L;
        }
        if ((n4 & 0x40) != 0x0) {
            m2 = vqn.M;
        }
        if ((n4 & 0x80) != 0x0) {
            n2 = vqn.N;
        }
        if ((n4 & 0x100) != 0x0) {
            o2 = vqn.O;
        }
        if ((n4 & 0x200) != 0x0) {
            p47 = vqn.P;
        }
        if ((n4 & 0x400) != 0x0) {
            q2 = vqn.Q;
        }
        Objects.requireNonNull(vqn);
        czd.f((Object)d, "connectionAudioSpaceState");
        czd.f((Object)k, "invitedSpeakers");
        czd.f((Object)l, "listeners");
        czd.f((Object)m, "speakers");
        czd.f((Object)n, "admins");
        czd.f((Object)o, "invitedCohosts");
        czd.f((Object)p46, "cohostInviteCounts");
        czd.f((Object)q, "connectingUsers");
        czd.f((Object)r, "provisionalSpeakers");
        czd.f((Object)u, "roomManagerType");
        czd.f((Object)v, "canJoinAsSpeaker");
        czd.f((Object)w, "hasJoinedAsSpeaker");
        czd.f((Object)c2, "requestedUserIds");
        czd.f((Object)f2, "userCohostState");
        czd.f((Object)g2, "spaceClippingState");
        czd.f((Object)k2, "playbackMode");
        czd.f((Object)p47, "roomCreationArgs");
        return new vqn(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p46, q, r, s, t, u, v, w, x, y, z, a2, b2, c2, d2, e2, f2, g2, h2, i2, j2, k2, l2, m2, n2, o2, p47, q2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof vqn)) {
            return false;
        }
        final vqn vqn = (vqn)o;
        return czd.a((Object)this.a, (Object)vqn.a) && czd.a((Object)this.b, (Object)vqn.b) && this.c == vqn.c && this.d == vqn.d && czd.a((Object)this.e, (Object)vqn.e) && czd.a((Object)this.f, (Object)vqn.f) && czd.a((Object)this.g, (Object)vqn.g) && czd.a((Object)this.h, (Object)vqn.h) && czd.a((Object)this.i, (Object)vqn.i) && czd.a((Object)this.j, (Object)vqn.j) && czd.a((Object)this.k, (Object)vqn.k) && czd.a((Object)this.l, (Object)vqn.l) && czd.a((Object)this.m, (Object)vqn.m) && czd.a((Object)this.n, (Object)vqn.n) && czd.a((Object)this.o, (Object)vqn.o) && czd.a((Object)this.p, (Object)vqn.p) && czd.a((Object)this.q, (Object)vqn.q) && czd.a((Object)this.r, (Object)vqn.r) && this.s == vqn.s && this.t == vqn.t && this.u == vqn.u && this.v == vqn.v && this.w == vqn.w && this.x == vqn.x && czd.a((Object)this.y, (Object)vqn.y) && czd.a((Object)this.z, (Object)vqn.z) && czd.a((Object)this.A, (Object)vqn.A) && this.B == vqn.B && czd.a((Object)this.C, (Object)vqn.C) && this.D == vqn.D && czd.a((Object)this.E, (Object)vqn.E) && this.F == vqn.F && this.G == vqn.G && czd.a((Object)this.H, (Object)vqn.H) && czd.a((Object)this.I, (Object)vqn.I) && this.J == vqn.J && this.K == vqn.K && this.L == vqn.L && this.M == vqn.M && this.N == vqn.N && czd.a((Object)this.O, (Object)vqn.O) && czd.a((Object)this.P, (Object)vqn.P) && this.Q == vqn.Q;
    }
    
    public final String getTitle() {
        final r21 f = this.f;
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
        final r21 f = this.f;
        int hashCode6;
        if (f == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = f.hashCode();
        }
        final tg5 g = this.g;
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
        final qt3 i = this.i;
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
        final int b2 = zip.b((Set)this.o, zip.b((Set)this.n, zip.b((Set)this.m, zip.b((Set)this.l, zip.b((Set)this.k, (((((((hashCode4 + ((hashCode2 * 31 + hashCode3) * 31 + n2) * 31) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31, 31), 31), 31), 31), 31);
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
        int b3;
        if ((b3 = (this.B ? 1 : 0)) != 0) {
            b3 = 1;
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
        final int q = this.Q ? 1 : 0;
        if (q == 0) {
            n = q;
        }
        return (hashCode27 + (((((hashCode26 + ((((hashCode23 + (hashCode22 + (((hashCode20 + ((((((hashCode16 + (hashCode15 + (hashCode14 + (((hashCode13 + (hashCode12 + (hashCode11 + b2) * 31) * 31) * 31 + s) * 31 + t) * 31) * 31) * 31) * 31 + x) * 31 + hashCode17) * 31 + hashCode18) * 31 + hashCode19) * 31 + b3) * 31) * 31 + d) * 31 + hashCode21) * 31) * 31) * 31 + hashCode24) * 31 + hashCode25) * 31 + l) * 31) * 31 + m) * 31 + m2) * 31 + n3) * 31 + hashCode) * 31) * 31 + n;
    }
    
    public final boolean m() {
        return this.a != null;
    }
    
    public final boolean n() {
        return this.m() && this.d == wg6.D0;
    }
    
    public final boolean o() {
        final boolean n = this.n();
        boolean b = true;
        if (!n || this.b == null || this.u != wqn.E0) {
            b = false;
        }
        return b;
    }
    
    public final boolean p() {
        final boolean n = this.n();
        boolean b = true;
        if (!n || this.b == null || this.w != z0r.F0) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final String toString() {
        final RoomObjectGraph a = this.a;
        final String b = this.b;
        final boolean c = this.c;
        final wg6 d = this.d;
        final b e = this.e;
        final r21 f = this.f;
        final tg5 g = this.g;
        final String h = this.h;
        final qt3 i = this.i;
        final String j = this.j;
        final Set<uon> k = this.k;
        final Set<RoomUserItem> l = this.l;
        final Set<RoomUserItem> m = this.m;
        final Set<RoomUserItem> n = this.n;
        final Set<CohostInvite> o = this.o;
        final Map<String, Integer> p = this.p;
        final Map<String, lvj<RoomUserItem, Long>> q = this.q;
        final Map<Long, Long> r = this.r;
        final int s = this.s;
        final int t = this.t;
        final wqn u = this.u;
        final ye3 v = this.v;
        final z0r w = this.w;
        final boolean x = this.x;
        final String y = this.y;
        final String z = this.z;
        final Boolean a2 = this.A;
        final boolean b2 = this.B;
        final Map<String, Long> c2 = this.C;
        final int d2 = this.D;
        final Integer e2 = this.E;
        final p9w f2 = this.F;
        final fmq g2 = this.G;
        final String h2 = this.H;
        final String i2 = this.I;
        final boolean j2 = this.J;
        final kmk k2 = this.K;
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
        k0c.k(sb, s, ", listenersCount=", t, ", roomManagerType=");
        sb.append(u);
        sb.append(", canJoinAsSpeaker=");
        sb.append(v);
        sb.append(", hasJoinedAsSpeaker=");
        sb.append(w);
        sb.append(", isJoinRequestInProgress=");
        sb.append(x);
        sb.append(", sessionUuid=");
        nb0.z(sb, y, ", description=", z, ", isSpaceMuted=");
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
        bo1.A(sb, i2, ", isHostDisconnected=", j2, ", playbackMode=");
        sb.append(k2);
        sb.append(", isReplayPlaying=");
        sb.append(l2);
        sb.append(", isSpaceRecording=");
        jg9.u(sb, m2, ", isEditingReplayStartTime=", n2, ", listenerJoinTimeMs=");
        sb.append(o2);
        sb.append(", roomCreationArgs=");
        sb.append(p2);
        sb.append(", isPlayingStation=");
        return wnj.D(sb, q2, ")");
    }
}
