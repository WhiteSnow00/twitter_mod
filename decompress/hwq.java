import java.util.Objects;
import tv.periscope.model.NarrowcastSpaceType;
import com.twitter.rooms.model.AudioSpaceTopicItem;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hwq implements jbx
{
    public final boolean A;
    public final String a;
    public final String b;
    public final String c;
    public final Long d;
    public final List<AudioSpaceTopicItem> e;
    public final boolean f;
    public final boolean g;
    public final s21 h;
    public final String i;
    public final List<s21> j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final ijq o;
    public final Long p;
    public final Integer q;
    public final boolean r;
    public final int s;
    public final Long t;
    public final boolean u;
    public final String v;
    public final boolean w;
    public final gps x;
    public final boolean y;
    public final NarrowcastSpaceType z;
    
    public hwq(final String a, final String b, final String c, final Long d, final List<AudioSpaceTopicItem> e, final boolean f, final boolean g, final s21 h, final String i, final List<s21> j, final int k, final int l, final int m, final int n, final ijq o, final Long p27, final Integer q, final boolean r, final int s, final Long t, final boolean u, final String v, final boolean w, final gps x, final boolean y, final NarrowcastSpaceType z, final boolean a2) {
        czd.f((Object)a, "spaceTitle");
        czd.f((Object)b, "spaceId");
        czd.f((Object)c, "state");
        czd.f((Object)e, "topics");
        czd.f((Object)z, "narrowCastSpaceType");
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
        this.p = p27;
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
    }
    
    public static hwq l(final hwq hwq, s21 h, String i, List j, Integer q, boolean r, boolean y, final int n) {
        NarrowcastSpaceType z = null;
        String a;
        if ((n & 0x1) != 0x0) {
            a = hwq.a;
        }
        else {
            a = null;
        }
        String b;
        if ((n & 0x2) != 0x0) {
            b = hwq.b;
        }
        else {
            b = null;
        }
        String c;
        if ((n & 0x4) != 0x0) {
            c = hwq.c;
        }
        else {
            c = null;
        }
        Long d;
        if ((n & 0x8) != 0x0) {
            d = hwq.d;
        }
        else {
            d = null;
        }
        List<AudioSpaceTopicItem> e;
        if ((n & 0x10) != 0x0) {
            e = hwq.e;
        }
        else {
            e = null;
        }
        final boolean b2 = (n & 0x20) != 0x0 && hwq.f;
        final boolean b3 = (n & 0x40) != 0x0 && hwq.g;
        if ((n & 0x80) != 0x0) {
            h = hwq.h;
        }
        if ((n & 0x100) != 0x0) {
            i = hwq.i;
        }
        if ((n & 0x200) != 0x0) {
            j = hwq.j;
        }
        int k;
        if ((n & 0x400) != 0x0) {
            k = hwq.k;
        }
        else {
            k = 0;
        }
        int l;
        if ((n & 0x800) != 0x0) {
            l = hwq.l;
        }
        else {
            l = 0;
        }
        int m;
        if ((n & 0x1000) != 0x0) {
            m = hwq.m;
        }
        else {
            m = 0;
        }
        int n2;
        if ((n & 0x2000) != 0x0) {
            n2 = hwq.n;
        }
        else {
            n2 = 0;
        }
        ijq o;
        if ((n & 0x4000) != 0x0) {
            o = hwq.o;
        }
        else {
            o = null;
        }
        Long p8;
        if ((0x8000 & n) != 0x0) {
            p8 = hwq.p;
        }
        else {
            p8 = null;
        }
        if ((0x10000 & n) != 0x0) {
            q = hwq.q;
        }
        if ((0x20000 & n) != 0x0) {
            r = hwq.r;
        }
        int s;
        if ((0x40000 & n) != 0x0) {
            s = hwq.s;
        }
        else {
            s = 0;
        }
        Long t;
        if ((0x80000 & n) != 0x0) {
            t = hwq.t;
        }
        else {
            t = null;
        }
        final boolean b4 = (0x100000 & n) != 0x0 && hwq.u;
        String v;
        if ((0x200000 & n) != 0x0) {
            v = hwq.v;
        }
        else {
            v = null;
        }
        final boolean b5 = (0x400000 & n) != 0x0 && hwq.w;
        gps x;
        if ((0x800000 & n) != 0x0) {
            x = hwq.x;
        }
        else {
            x = null;
        }
        if ((0x1000000 & n) != 0x0) {
            y = hwq.y;
        }
        if ((0x2000000 & n) != 0x0) {
            z = hwq.z;
        }
        final boolean b6 = (n & 0x4000000) != 0x0 && hwq.A;
        Objects.requireNonNull(hwq);
        czd.f((Object)a, "spaceTitle");
        czd.f((Object)b, "spaceId");
        czd.f((Object)c, "state");
        czd.f((Object)e, "topics");
        czd.f((Object)i, "hostProfileDescription");
        czd.f((Object)z, "narrowCastSpaceType");
        return new hwq(a, b, c, d, e, b2, b3, h, i, j, k, l, m, n2, o, p8, q, r, s, t, b4, v, b5, x, y, z, b6);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof hwq)) {
            return false;
        }
        final hwq hwq = (hwq)o;
        return czd.a((Object)this.a, (Object)hwq.a) && czd.a((Object)this.b, (Object)hwq.b) && czd.a((Object)this.c, (Object)hwq.c) && czd.a((Object)this.d, (Object)hwq.d) && czd.a((Object)this.e, (Object)hwq.e) && this.f == hwq.f && this.g == hwq.g && czd.a((Object)this.h, (Object)hwq.h) && czd.a((Object)this.i, (Object)hwq.i) && czd.a((Object)this.j, (Object)hwq.j) && this.k == hwq.k && this.l == hwq.l && this.m == hwq.m && this.n == hwq.n && czd.a((Object)this.o, (Object)hwq.o) && czd.a((Object)this.p, (Object)hwq.p) && czd.a((Object)this.q, (Object)hwq.q) && this.r == hwq.r && this.s == hwq.s && czd.a((Object)this.t, (Object)hwq.t) && this.u == hwq.u && czd.a((Object)this.v, (Object)hwq.v) && this.w == hwq.w && czd.a((Object)this.x, (Object)hwq.x) && this.y == hwq.y && czd.a((Object)this.z, (Object)hwq.z) && this.A == hwq.A;
    }
    
    @Override
    public final int hashCode() {
        final int f = hmg.f(this.c, hmg.f(this.b, this.a.hashCode() * 31, 31), 31);
        final Long d = this.d;
        int hashCode = 0;
        int hashCode2;
        if (d == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = d.hashCode();
        }
        final int d2 = sde.d((List)this.e, (f + hashCode2) * 31, 31);
        final int f2 = this.f ? 1 : 0;
        int n = 1;
        int n2 = f2;
        if (f2 != 0) {
            n2 = 1;
        }
        int g;
        if ((g = (this.g ? 1 : 0)) != 0) {
            g = 1;
        }
        final s21 h = this.h;
        int hashCode3;
        if (h == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = h.hashCode();
        }
        final int f3 = hmg.f(this.i, (((d2 + n2) * 31 + g) * 31 + hashCode3) * 31, 31);
        final List<s21> j = this.j;
        int hashCode4;
        if (j == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = j.hashCode();
        }
        final int k = this.k;
        final int l = this.l;
        final int m = this.m;
        final int n3 = this.n;
        final ijq o = this.o;
        int hashCode5;
        if (o == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = o.hashCode();
        }
        final Long p = this.p;
        int hashCode6;
        if (p == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = p.hashCode();
        }
        final Integer q = this.q;
        int hashCode7;
        if (q == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = q.hashCode();
        }
        int r;
        if ((r = (this.r ? 1 : 0)) != 0) {
            r = 1;
        }
        final int s = this.s;
        final Long t = this.t;
        int hashCode8;
        if (t == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = t.hashCode();
        }
        int u;
        if ((u = (this.u ? 1 : 0)) != 0) {
            u = 1;
        }
        final String v = this.v;
        int hashCode9;
        if (v == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = v.hashCode();
        }
        int w;
        if ((w = (this.w ? 1 : 0)) != 0) {
            w = 1;
        }
        final gps x = this.x;
        if (x != null) {
            hashCode = x.hashCode();
        }
        int y;
        if ((y = (this.y ? 1 : 0)) != 0) {
            y = 1;
        }
        final int hashCode10 = this.z.hashCode();
        final int a = this.A ? 1 : 0;
        if (a == 0) {
            n = a;
        }
        return (hashCode10 + ((((((((((((((((f3 + hashCode4) * 31 + k) * 31 + l) * 31 + m) * 31 + n3) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + r) * 31 + s) * 31 + hashCode8) * 31 + u) * 31 + hashCode9) * 31 + w) * 31 + hashCode) * 31 + y) * 31) * 31 + n;
    }
    
    public final boolean m() {
        return czd.a((Object)this.c, (Object)"ENDED") && this.t != null && this.u;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final String c = this.c;
        final Long d = this.d;
        final List<AudioSpaceTopicItem> e = this.e;
        final boolean f = this.f;
        final boolean g = this.g;
        final s21 h = this.h;
        final String i = this.i;
        final List<s21> j = this.j;
        final int k = this.k;
        final int l = this.l;
        final int m = this.m;
        final int n = this.n;
        final ijq o = this.o;
        final Long p = this.p;
        final Integer q = this.q;
        final boolean r = this.r;
        final int s = this.s;
        final Long t = this.t;
        final boolean u = this.u;
        final String v = this.v;
        final boolean w = this.w;
        final gps x = this.x;
        final boolean y = this.y;
        final NarrowcastSpaceType z = this.z;
        final boolean a2 = this.A;
        final StringBuilder q2 = tqf.q("SpacesTabCardViewState(spaceTitle=", a, ", spaceId=", b, ", state=");
        q2.append(c);
        q2.append(", scheduledStart=");
        q2.append(d);
        q2.append(", topics=");
        q2.append(e);
        q2.append(", isTrending=");
        q2.append(f);
        q2.append(", isEmployeeOnly=");
        q2.append(g);
        q2.append(", host=");
        q2.append(h);
        q2.append(", hostProfileDescription=");
        q2.append(i);
        q2.append(", guests=");
        q2.append(j);
        q2.append(", totalParticipating=");
        k0c.k(q2, k, ", rsvpCount=", l, ", totalParticipated=");
        k0c.k(q2, m, ", totalReplayWatched=", n, ", socialProof=");
        q2.append(o);
        q2.append(", startedAt=");
        q2.append(p);
        q2.append(", backgroundColor=");
        q2.append(q);
        q2.append(", isLoading=");
        q2.append(r);
        q2.append(", cardIndexOnTab=");
        q2.append(s);
        q2.append(", endedAt=");
        q2.append(t);
        q2.append(", isSpaceAvailableForReplay=");
        mw.C(q2, u, ", uuid=", v, ", isUpcoming=");
        q2.append(w);
        q2.append(", ticketInfo=");
        q2.append(x);
        q2.append(", isSubscribed=");
        q2.append(y);
        q2.append(", narrowCastSpaceType=");
        q2.append(z);
        q2.append(", isAvailableForClipping=");
        return wnj.D(q2, a2, ")");
    }
}
