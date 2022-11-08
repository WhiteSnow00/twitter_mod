import java.util.Objects;
import java.util.Collections;
import com.twitter.rooms.model.helpers.CohostInvite;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.Set;
import tv.periscope.model.b;
import com.twitter.rooms.di.room.RoomObjectGraph;
import com.twitter.rooms.manager.RoomStateManager;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gqn implements oax
{
    public final Boolean A;
    public final boolean B;
    public final Map<String, Long> C;
    public final int D;
    public final Integer E;
    public final h9w F;
    public final llq G;
    public final String H;
    public final String I;
    public final boolean J;
    public final emk K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final Long O;
    public final RoomStateManager.l0 P;
    public final boolean Q;
    public final RoomObjectGraph a;
    public final String b;
    public final boolean c;
    public final qh6 d;
    public final b e;
    public final v21 f;
    public final lh5 g;
    public final String h;
    public final iu3 i;
    public final String j;
    public final Set<hon> k;
    public final Set<RoomUserItem> l;
    public final Set<RoomUserItem> m;
    public final Set<RoomUserItem> n;
    public final Set<CohostInvite> o;
    public final Map<String, Integer> p;
    public final Map<String, gvj<RoomUserItem, Long>> q;
    public final Map<Long, Long> r;
    public final int s;
    public final int t;
    public final hqn u;
    public final pf3 v;
    public final f0r w;
    public final boolean x;
    public final String y;
    public final String z;
    
    public gqn() {
        this(null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, null, false, null, null, null, false, null, 0, null, null, null, null, null, false, null, false, false, false, null, null, false, -1, 2047, null);
    }
    
    public gqn(final RoomObjectGraph a, final String b, final boolean c, final qh6 d, final b e, final v21 f, final lh5 g, final String h, final iu3 i, final String j, final Set<hon> k, final Set<RoomUserItem> l, final Set<RoomUserItem> m, final Set<RoomUserItem> n, final Set<CohostInvite> o, final Map<String, Integer> p43, final Map<String, gvj<RoomUserItem, Long>> q, final Map<Long, Long> r, final int s, final int t, final hqn u, final pf3 v, final f0r w, final boolean x, final String y, final String z, final Boolean a2, final boolean b2, final Map<String, Long> c2, final int d2, final Integer e2, final h9w f2, final llq g2, final String h2, final String i2, final boolean j2, final emk k2, final boolean l2, final boolean m2, final boolean n2, final Long o2, final RoomStateManager.l0 p44, final boolean q2) {
        zzd.f((Object)d, "connectionAudioSpaceState");
        zzd.f((Object)k, "invitedSpeakers");
        zzd.f((Object)l, "listeners");
        zzd.f((Object)m, "speakers");
        zzd.f((Object)n, "admins");
        zzd.f((Object)o, "invitedCohosts");
        zzd.f((Object)p43, "cohostInviteCounts");
        zzd.f((Object)q, "connectingUsers");
        zzd.f((Object)r, "provisionalSpeakers");
        zzd.f((Object)u, "roomManagerType");
        zzd.f((Object)v, "canJoinAsSpeaker");
        zzd.f((Object)w, "hasJoinedAsSpeaker");
        zzd.f((Object)c2, "requestedUserIds");
        zzd.f((Object)f2, "userCohostState");
        zzd.f((Object)g2, "spaceClippingState");
        zzd.f((Object)k2, "playbackMode");
        zzd.f((Object)p44, "roomCreationArgs");
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
    
    public static gqn l(final gqn gqn, final RoomObjectGraph roomObjectGraph, String b, boolean c, qh6 d, b e, v21 f, lh5 g, String h, iu3 i, String j, Set k, Set l, Set m, Set n, Set o, Map p46, Map q, Map r, int s, int t, hqn u, pf3 v, f0r w, boolean x, String y, String z, Boolean a, boolean b2, final Map map, int d2, final Integer n2, final h9w h9w, final llq llq, final String s2, final String s3, boolean j2, final emk emk, boolean l2, boolean m2, boolean n3, final Long n4, final RoomStateManager.l0 l3, boolean q2, final int n5, final int n6) {
        RoomObjectGraph a2;
        if ((n5 & 0x1) != 0x0) {
            a2 = gqn.a;
        }
        else {
            a2 = roomObjectGraph;
        }
        if ((n5 & 0x2) != 0x0) {
            b = gqn.b;
        }
        if ((n5 & 0x4) != 0x0) {
            c = gqn.c;
        }
        if ((n5 & 0x8) != 0x0) {
            d = gqn.d;
        }
        if ((n5 & 0x10) != 0x0) {
            e = gqn.e;
        }
        if ((n5 & 0x20) != 0x0) {
            f = gqn.f;
        }
        if ((n5 & 0x40) != 0x0) {
            g = gqn.g;
        }
        if ((n5 & 0x80) != 0x0) {
            h = gqn.h;
        }
        if ((n5 & 0x100) != 0x0) {
            i = gqn.i;
        }
        if ((n5 & 0x200) != 0x0) {
            j = gqn.j;
        }
        if ((n5 & 0x400) != 0x0) {
            k = gqn.k;
        }
        if ((n5 & 0x800) != 0x0) {
            l = gqn.l;
        }
        if ((n5 & 0x1000) != 0x0) {
            m = gqn.m;
        }
        if ((n5 & 0x2000) != 0x0) {
            n = gqn.n;
        }
        if ((n5 & 0x4000) != 0x0) {
            o = gqn.o;
        }
        if ((n5 & 0x8000) != 0x0) {
            p46 = gqn.p;
        }
        if ((n5 & 0x10000) != 0x0) {
            q = gqn.q;
        }
        if ((n5 & 0x20000) != 0x0) {
            r = gqn.r;
        }
        if ((n5 & 0x40000) != 0x0) {
            s = gqn.s;
        }
        if ((n5 & 0x80000) != 0x0) {
            t = gqn.t;
        }
        if ((n5 & 0x100000) != 0x0) {
            u = gqn.u;
        }
        if ((n5 & 0x200000) != 0x0) {
            v = gqn.v;
        }
        if ((n5 & 0x400000) != 0x0) {
            w = gqn.w;
        }
        if ((n5 & 0x800000) != 0x0) {
            x = gqn.x;
        }
        if ((n5 & 0x1000000) != 0x0) {
            y = gqn.y;
        }
        if ((n5 & 0x2000000) != 0x0) {
            z = gqn.z;
        }
        if ((n5 & 0x4000000) != 0x0) {
            a = gqn.A;
        }
        if ((n5 & 0x8000000) != 0x0) {
            b2 = gqn.B;
        }
        Map<String, Long> c2;
        if ((n5 & 0x10000000) != 0x0) {
            c2 = gqn.C;
        }
        else {
            c2 = map;
        }
        if ((n5 & 0x20000000) != 0x0) {
            d2 = gqn.D;
        }
        final Map<String, Long> map2 = c2;
        Integer e2;
        if ((n5 & 0x40000000) != 0x0) {
            e2 = gqn.E;
        }
        else {
            e2 = n2;
        }
        h9w f2;
        if ((n5 & Integer.MIN_VALUE) != 0x0) {
            f2 = gqn.F;
        }
        else {
            f2 = h9w;
        }
        llq g2;
        if ((n6 & 0x1) != 0x0) {
            g2 = gqn.G;
        }
        else {
            g2 = llq;
        }
        String h2;
        if ((n6 & 0x2) != 0x0) {
            h2 = gqn.H;
        }
        else {
            h2 = s2;
        }
        final llq llq2 = g2;
        String i2;
        if ((n6 & 0x4) != 0x0) {
            i2 = gqn.I;
        }
        else {
            i2 = s3;
        }
        if ((n6 & 0x8) != 0x0) {
            j2 = gqn.J;
        }
        emk k2;
        if ((n6 & 0x10) != 0x0) {
            k2 = gqn.K;
        }
        else {
            k2 = emk;
        }
        if ((n6 & 0x20) != 0x0) {
            l2 = gqn.L;
        }
        final emk emk2 = k2;
        if ((n6 & 0x40) != 0x0) {
            m2 = gqn.M;
        }
        if ((n6 & 0x80) != 0x0) {
            n3 = gqn.N;
        }
        Long o2;
        if ((n6 & 0x100) != 0x0) {
            o2 = gqn.O;
        }
        else {
            o2 = n4;
        }
        RoomStateManager.l0 p47;
        if ((n6 & 0x200) != 0x0) {
            p47 = gqn.P;
        }
        else {
            p47 = l3;
        }
        if ((n6 & 0x400) != 0x0) {
            q2 = gqn.Q;
        }
        Objects.requireNonNull(gqn);
        zzd.f((Object)d, "connectionAudioSpaceState");
        zzd.f((Object)k, "invitedSpeakers");
        zzd.f((Object)l, "listeners");
        zzd.f((Object)m, "speakers");
        zzd.f((Object)n, "admins");
        zzd.f((Object)o, "invitedCohosts");
        zzd.f((Object)p46, "cohostInviteCounts");
        zzd.f((Object)q, "connectingUsers");
        zzd.f((Object)r, "provisionalSpeakers");
        zzd.f((Object)u, "roomManagerType");
        zzd.f((Object)v, "canJoinAsSpeaker");
        zzd.f((Object)w, "hasJoinedAsSpeaker");
        zzd.f((Object)map2, "requestedUserIds");
        zzd.f((Object)f2, "userCohostState");
        zzd.f((Object)llq2, "spaceClippingState");
        zzd.f((Object)emk2, "playbackMode");
        zzd.f((Object)p47, "roomCreationArgs");
        return new gqn(a2, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p46, q, r, s, t, u, v, w, x, y, z, a, b2, map2, d2, e2, f2, llq2, h2, i2, j2, emk2, l2, m2, n3, o2, p47, q2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof gqn)) {
            return false;
        }
        final gqn gqn = (gqn)o;
        return zzd.a((Object)this.a, (Object)gqn.a) && zzd.a((Object)this.b, (Object)gqn.b) && this.c == gqn.c && this.d == gqn.d && zzd.a((Object)this.e, (Object)gqn.e) && zzd.a((Object)this.f, (Object)gqn.f) && zzd.a((Object)this.g, (Object)gqn.g) && zzd.a((Object)this.h, (Object)gqn.h) && zzd.a((Object)this.i, (Object)gqn.i) && zzd.a((Object)this.j, (Object)gqn.j) && zzd.a((Object)this.k, (Object)gqn.k) && zzd.a((Object)this.l, (Object)gqn.l) && zzd.a((Object)this.m, (Object)gqn.m) && zzd.a((Object)this.n, (Object)gqn.n) && zzd.a((Object)this.o, (Object)gqn.o) && zzd.a((Object)this.p, (Object)gqn.p) && zzd.a((Object)this.q, (Object)gqn.q) && zzd.a((Object)this.r, (Object)gqn.r) && this.s == gqn.s && this.t == gqn.t && this.u == gqn.u && this.v == gqn.v && this.w == gqn.w && this.x == gqn.x && zzd.a((Object)this.y, (Object)gqn.y) && zzd.a((Object)this.z, (Object)gqn.z) && zzd.a((Object)this.A, (Object)gqn.A) && this.B == gqn.B && zzd.a((Object)this.C, (Object)gqn.C) && this.D == gqn.D && zzd.a((Object)this.E, (Object)gqn.E) && this.F == gqn.F && this.G == gqn.G && zzd.a((Object)this.H, (Object)gqn.H) && zzd.a((Object)this.I, (Object)gqn.I) && this.J == gqn.J && this.K == gqn.K && this.L == gqn.L && this.M == gqn.M && this.N == gqn.N && zzd.a((Object)this.O, (Object)gqn.O) && zzd.a((Object)this.P, (Object)gqn.P) && this.Q == gqn.Q;
    }
    
    public final String getTitle() {
        final v21 f = this.f;
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
        final v21 f = this.f;
        int hashCode6;
        if (f == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = f.hashCode();
        }
        final lh5 g = this.g;
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
        final iu3 i = this.i;
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
        final int p = dia.p((Set)this.o, dia.p((Set)this.n, dia.p((Set)this.m, dia.p((Set)this.l, dia.p((Set)this.k, (((((((hashCode4 + ((hashCode2 * 31 + hashCode3) * 31 + n2) * 31) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31, 31), 31), 31), 31), 31);
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
        final int q = this.Q ? 1 : 0;
        if (q == 0) {
            n = q;
        }
        return (hashCode27 + (((((hashCode26 + ((((hashCode23 + (hashCode22 + (((hashCode20 + ((((((hashCode16 + (hashCode15 + (hashCode14 + (((hashCode13 + (hashCode12 + (hashCode11 + p) * 31) * 31) * 31 + s) * 31 + t) * 31) * 31) * 31) * 31 + x) * 31 + hashCode17) * 31 + hashCode18) * 31 + hashCode19) * 31 + b2) * 31) * 31 + d) * 31 + hashCode21) * 31) * 31) * 31 + hashCode24) * 31 + hashCode25) * 31 + l) * 31) * 31 + m) * 31 + m2) * 31 + n3) * 31 + hashCode) * 31) * 31 + n;
    }
    
    public final boolean m() {
        return this.a != null;
    }
    
    public final boolean n() {
        return this.m() && this.d == qh6.C0;
    }
    
    public final boolean o() {
        final boolean n = this.n();
        boolean b = true;
        if (!n || this.b == null || this.u != hqn.D0) {
            b = false;
        }
        return b;
    }
    
    public final boolean p() {
        final boolean n = this.n();
        boolean b = true;
        if (!n || this.b == null || this.w != f0r.E0) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final String toString() {
        final RoomObjectGraph a = this.a;
        final String b = this.b;
        final boolean c = this.c;
        final qh6 d = this.d;
        final b e = this.e;
        final v21 f = this.f;
        final lh5 g = this.g;
        final String h = this.h;
        final iu3 i = this.i;
        final String j = this.j;
        final Set<hon> k = this.k;
        final Set<RoomUserItem> l = this.l;
        final Set<RoomUserItem> m = this.m;
        final Set<RoomUserItem> n = this.n;
        final Set<CohostInvite> o = this.o;
        final Map<String, Integer> p = this.p;
        final Map<String, gvj<RoomUserItem, Long>> q = this.q;
        final Map<Long, Long> r = this.r;
        final int s = this.s;
        final int t = this.t;
        final hqn u = this.u;
        final pf3 v = this.v;
        final f0r w = this.w;
        final boolean x = this.x;
        final String y = this.y;
        final String z = this.z;
        final Boolean a2 = this.A;
        final boolean b2 = this.B;
        final Map<String, Long> c2 = this.C;
        final int d2 = this.D;
        final Integer e2 = this.E;
        final h9w f2 = this.F;
        final llq g2 = this.G;
        final String h2 = this.H;
        final String i2 = this.I;
        final boolean j2 = this.J;
        final emk k2 = this.K;
        final boolean l2 = this.L;
        final boolean m2 = this.M;
        final boolean n2 = this.N;
        final Long o2 = this.O;
        final RoomStateManager.l0 p2 = this.P;
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
        k1b.j(sb, s, ", listenersCount=", t, ", roomManagerType=");
        sb.append(u);
        sb.append(", canJoinAsSpeaker=");
        sb.append(v);
        sb.append(", hasJoinedAsSpeaker=");
        sb.append(w);
        sb.append(", isJoinRequestInProgress=");
        sb.append(x);
        sb.append(", sessionUuid=");
        mag.m(sb, y, ", description=", z, ", isSpaceMuted=");
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
        mag.n(sb, i2, ", isHostDisconnected=", j2, ", playbackMode=");
        sb.append(k2);
        sb.append(", isReplayPlaying=");
        sb.append(l2);
        sb.append(", isSpaceRecording=");
        lo0.z(sb, m2, ", isEditingReplayStartTime=", n2, ", listenerJoinTimeMs=");
        sb.append(o2);
        sb.append(", roomCreationArgs=");
        sb.append(p2);
        sb.append(", isPlayingStation=");
        return bd.y(sb, q2, ")");
    }
}
