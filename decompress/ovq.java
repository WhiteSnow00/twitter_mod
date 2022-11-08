import java.util.Objects;
import tv.periscope.model.NarrowcastSpaceType;
import com.twitter.rooms.model.AudioSpaceTopicItem;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ovq implements oax
{
    public final boolean A;
    public final String a;
    public final String b;
    public final String c;
    public final Long d;
    public final List<AudioSpaceTopicItem> e;
    public final boolean f;
    public final boolean g;
    public final w21 h;
    public final String i;
    public final List<w21> j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final qiq o;
    public final Long p;
    public final Integer q;
    public final boolean r;
    public final int s;
    public final Long t;
    public final boolean u;
    public final String v;
    public final boolean w;
    public final mos x;
    public final boolean y;
    public final NarrowcastSpaceType z;
    
    public ovq(final String a, final String b, final String c, final Long d, final List<AudioSpaceTopicItem> e, final boolean f, final boolean g, final w21 h, final String i, final List<w21> j, final int k, final int l, final int m, final int n, final qiq o, final Long p27, final Integer q, final boolean r, final int s, final Long t, final boolean u, final String v, final boolean w, final mos x, final boolean y, final NarrowcastSpaceType z, final boolean a2) {
        zzd.f((Object)a, "spaceTitle");
        zzd.f((Object)b, "spaceId");
        zzd.f((Object)c, "state");
        zzd.f((Object)e, "topics");
        zzd.f((Object)z, "narrowCastSpaceType");
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
    
    public static ovq l(final ovq ovq, w21 h, String i, List j, Integer q, boolean r, boolean y, final int n) {
        NarrowcastSpaceType z = null;
        String a;
        if ((n & 0x1) != 0x0) {
            a = ovq.a;
        }
        else {
            a = null;
        }
        String b;
        if ((n & 0x2) != 0x0) {
            b = ovq.b;
        }
        else {
            b = null;
        }
        String c;
        if ((n & 0x4) != 0x0) {
            c = ovq.c;
        }
        else {
            c = null;
        }
        Long d;
        if ((n & 0x8) != 0x0) {
            d = ovq.d;
        }
        else {
            d = null;
        }
        List<AudioSpaceTopicItem> e;
        if ((n & 0x10) != 0x0) {
            e = ovq.e;
        }
        else {
            e = null;
        }
        final boolean b2 = (n & 0x20) != 0x0 && ovq.f;
        final boolean b3 = (n & 0x40) != 0x0 && ovq.g;
        if ((n & 0x80) != 0x0) {
            h = ovq.h;
        }
        if ((n & 0x100) != 0x0) {
            i = ovq.i;
        }
        if ((n & 0x200) != 0x0) {
            j = ovq.j;
        }
        int k;
        if ((n & 0x400) != 0x0) {
            k = ovq.k;
        }
        else {
            k = 0;
        }
        int l;
        if ((n & 0x800) != 0x0) {
            l = ovq.l;
        }
        else {
            l = 0;
        }
        int m;
        if ((n & 0x1000) != 0x0) {
            m = ovq.m;
        }
        else {
            m = 0;
        }
        int n2;
        if ((n & 0x2000) != 0x0) {
            n2 = ovq.n;
        }
        else {
            n2 = 0;
        }
        qiq o;
        if ((n & 0x4000) != 0x0) {
            o = ovq.o;
        }
        else {
            o = null;
        }
        Long p8;
        if ((0x8000 & n) != 0x0) {
            p8 = ovq.p;
        }
        else {
            p8 = null;
        }
        if ((0x10000 & n) != 0x0) {
            q = ovq.q;
        }
        if ((0x20000 & n) != 0x0) {
            r = ovq.r;
        }
        int s;
        if ((0x40000 & n) != 0x0) {
            s = ovq.s;
        }
        else {
            s = 0;
        }
        Long t;
        if ((0x80000 & n) != 0x0) {
            t = ovq.t;
        }
        else {
            t = null;
        }
        final boolean b4 = (0x100000 & n) != 0x0 && ovq.u;
        String v;
        if ((0x200000 & n) != 0x0) {
            v = ovq.v;
        }
        else {
            v = null;
        }
        final boolean b5 = (0x400000 & n) != 0x0 && ovq.w;
        mos x;
        if ((0x800000 & n) != 0x0) {
            x = ovq.x;
        }
        else {
            x = null;
        }
        if ((0x1000000 & n) != 0x0) {
            y = ovq.y;
        }
        if ((0x2000000 & n) != 0x0) {
            z = ovq.z;
        }
        final boolean b6 = (n & 0x4000000) != 0x0 && ovq.A;
        Objects.requireNonNull(ovq);
        zzd.f((Object)a, "spaceTitle");
        zzd.f((Object)b, "spaceId");
        zzd.f((Object)c, "state");
        zzd.f((Object)e, "topics");
        zzd.f((Object)i, "hostProfileDescription");
        zzd.f((Object)z, "narrowCastSpaceType");
        return new ovq(a, b, c, d, e, b2, b3, h, i, j, k, l, m, n2, o, p8, q, r, s, t, b4, v, b5, x, y, z, b6);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ovq)) {
            return false;
        }
        final ovq ovq = (ovq)o;
        return zzd.a((Object)this.a, (Object)ovq.a) && zzd.a((Object)this.b, (Object)ovq.b) && zzd.a((Object)this.c, (Object)ovq.c) && zzd.a((Object)this.d, (Object)ovq.d) && zzd.a((Object)this.e, (Object)ovq.e) && this.f == ovq.f && this.g == ovq.g && zzd.a((Object)this.h, (Object)ovq.h) && zzd.a((Object)this.i, (Object)ovq.i) && zzd.a((Object)this.j, (Object)ovq.j) && this.k == ovq.k && this.l == ovq.l && this.m == ovq.m && this.n == ovq.n && zzd.a((Object)this.o, (Object)ovq.o) && zzd.a((Object)this.p, (Object)ovq.p) && zzd.a((Object)this.q, (Object)ovq.q) && this.r == ovq.r && this.s == ovq.s && zzd.a((Object)this.t, (Object)ovq.t) && this.u == ovq.u && zzd.a((Object)this.v, (Object)ovq.v) && this.w == ovq.w && zzd.a((Object)this.x, (Object)ovq.x) && this.y == ovq.y && zzd.a((Object)this.z, (Object)ovq.z) && this.A == ovq.A;
    }
    
    @Override
    public final int hashCode() {
        final int a = l7k.a(this.c, l7k.a(this.b, this.a.hashCode() * 31, 31), 31);
        final Long d = this.d;
        int hashCode = 0;
        int hashCode2;
        if (d == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = d.hashCode();
        }
        final int m = hy8.m((List)this.e, (a + hashCode2) * 31, 31);
        final int f = this.f ? 1 : 0;
        int n = 1;
        int n2 = f;
        if (f != 0) {
            n2 = 1;
        }
        int g;
        if ((g = (this.g ? 1 : 0)) != 0) {
            g = 1;
        }
        final w21 h = this.h;
        int hashCode3;
        if (h == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = h.hashCode();
        }
        final int a2 = l7k.a(this.i, (((m + n2) * 31 + g) * 31 + hashCode3) * 31, 31);
        final List<w21> j = this.j;
        int hashCode4;
        if (j == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = j.hashCode();
        }
        final int k = this.k;
        final int l = this.l;
        final int i = this.m;
        final int n3 = this.n;
        final qiq o = this.o;
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
        final mos x = this.x;
        if (x != null) {
            hashCode = x.hashCode();
        }
        int y;
        if ((y = (this.y ? 1 : 0)) != 0) {
            y = 1;
        }
        final int hashCode10 = this.z.hashCode();
        final int a3 = this.A ? 1 : 0;
        if (a3 == 0) {
            n = a3;
        }
        return (hashCode10 + ((((((((((((((((a2 + hashCode4) * 31 + k) * 31 + l) * 31 + i) * 31 + n3) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + r) * 31 + s) * 31 + hashCode8) * 31 + u) * 31 + hashCode9) * 31 + w) * 31 + hashCode) * 31 + y) * 31) * 31 + n;
    }
    
    public final boolean m() {
        return zzd.a((Object)this.c, (Object)"ENDED") && this.t != null && this.u;
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
        final w21 h = this.h;
        final String i = this.i;
        final List<w21> j = this.j;
        final int k = this.k;
        final int l = this.l;
        final int m = this.m;
        final int n = this.n;
        final qiq o = this.o;
        final Long p = this.p;
        final Integer q = this.q;
        final boolean r = this.r;
        final int s = this.s;
        final Long t = this.t;
        final boolean u = this.u;
        final String v = this.v;
        final boolean w = this.w;
        final mos x = this.x;
        final boolean y = this.y;
        final NarrowcastSpaceType z = this.z;
        final boolean a2 = this.A;
        final StringBuilder y2 = mb0.y("SpacesTabCardViewState(spaceTitle=", a, ", spaceId=", b, ", state=");
        y2.append(c);
        y2.append(", scheduledStart=");
        y2.append(d);
        y2.append(", topics=");
        y2.append(e);
        y2.append(", isTrending=");
        y2.append(f);
        y2.append(", isEmployeeOnly=");
        y2.append(g);
        y2.append(", host=");
        y2.append(h);
        y2.append(", hostProfileDescription=");
        y2.append(i);
        y2.append(", guests=");
        y2.append(j);
        y2.append(", totalParticipating=");
        k1b.j(y2, k, ", rsvpCount=", l, ", totalParticipated=");
        k1b.j(y2, m, ", totalReplayWatched=", n, ", socialProof=");
        y2.append(o);
        y2.append(", startedAt=");
        y2.append(p);
        y2.append(", backgroundColor=");
        y2.append(q);
        y2.append(", isLoading=");
        y2.append(r);
        y2.append(", cardIndexOnTab=");
        y2.append(s);
        y2.append(", endedAt=");
        y2.append(t);
        y2.append(", isSpaceAvailableForReplay=");
        lf.z(y2, u, ", uuid=", v, ", isUpcoming=");
        y2.append(w);
        y2.append(", ticketInfo=");
        y2.append(x);
        y2.append(", isSubscribed=");
        y2.append(y);
        y2.append(", narrowCastSpaceType=");
        y2.append(z);
        y2.append(", isAvailableForClipping=");
        return bd.y(y2, a2, ")");
    }
}
