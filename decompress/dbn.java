import java.util.Objects;
import tv.periscope.model.NarrowcastSpaceType$None;
import tv.periscope.model.NarrowcastSpaceType;
import com.twitter.rooms.model.AudioSpaceTopicItem;
import java.util.List;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dbn implements ccx
{
    public final boolean A;
    public final kmu B;
    public final yh5 C;
    public final boolean a;
    public final boolean b;
    public final String c;
    public final yf3 d;
    public final Set<RoomUserItem> e;
    public final Set<RoomUserItem> f;
    public final Set<RoomUserItem> g;
    public final String h;
    public final String i;
    public final Long j;
    public final int k;
    public final boolean l;
    public final String m;
    public final boolean n;
    public final String o;
    public final int p;
    public final zps q;
    public final kol r;
    public final List<AudioSpaceTopicItem> s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final NarrowcastSpaceType y;
    public final boolean z;
    
    public dbn() {
        this(false, false, null, null, null, null, null, null, null, null, 0, false, null, false, null, 0, null, null, null, false, false, false, false, false, null, false, false, null, null, 536870911, null);
    }
    
    public dbn(final boolean a, final boolean b, final String c, final yf3 d, final Set<RoomUserItem> e, final Set<RoomUserItem> f, final Set<RoomUserItem> g, final String h, final String i, final Long j, final int k, final boolean l, final String m, final boolean n, final String o, final int p29, final zps q, final kol r, final List<AudioSpaceTopicItem> s, final boolean t, final boolean u, final boolean v, final boolean w, final boolean x, final NarrowcastSpaceType y, final boolean z, final boolean a2, final kmu b2, final yh5 c2) {
        e0e.f((Object)d, "canJoinAsSpeaker");
        e0e.f((Object)e, "admins");
        e0e.f((Object)f, "speakers");
        e0e.f((Object)g, "listeners");
        e0e.f((Object)r, "purchaseButtonState");
        e0e.f((Object)s, "taggedTopics");
        e0e.f((Object)y, "narrowCastSpaceType");
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
    }
    
    public dbn(final boolean b, final boolean b2, final String s, yf3 h0, final Set set, final Set set2, final Set set3, final String s2, final String s3, final Long n, final int n2, final boolean b3, final String s4, final boolean b4, final String s5, final int n3, final zps zps, final kol kol, final List list, final boolean b5, final boolean b6, final boolean b7, final boolean b8, final boolean b9, final NarrowcastSpaceType narrowcastSpaceType, final boolean b10, final boolean b11, final kmu kmu, final yh5 yh5, final int n4, final wg8 wg8) {
        h0 = yf3.H0;
        final r3a f0 = r3a.F0;
        this(false, false, null, h0, (Set<RoomUserItem>)f0, (Set<RoomUserItem>)f0, (Set<RoomUserItem>)f0, null, null, null, 0, false, null, false, null, 0, null, new kol.a(null, 1, null), (List<AudioSpaceTopicItem>)h3a.F0, false, false, false, true, false, (NarrowcastSpaceType)NarrowcastSpaceType$None.INSTANCE, false, false, null, null);
    }
    
    public static dbn l(final dbn dbn, String c, yf3 d, Set e, Set f, Set g, String h, String i, Long j, int k, boolean l, String m, boolean n, String o, int p29, zps q, kol r, List s, boolean t, boolean u, boolean v, boolean w, boolean x, NarrowcastSpaceType y, boolean z, boolean a, kmu b, yh5 c2, final int n2) {
        final boolean b2 = (n2 & 0x1) != 0x0 && dbn.a;
        final boolean b3 = (n2 & 0x2) != 0x0 && dbn.b;
        if ((n2 & 0x4) != 0x0) {
            c = dbn.c;
        }
        if ((n2 & 0x8) != 0x0) {
            d = dbn.d;
        }
        if ((n2 & 0x10) != 0x0) {
            e = dbn.e;
        }
        if ((n2 & 0x20) != 0x0) {
            f = dbn.f;
        }
        if ((n2 & 0x40) != 0x0) {
            g = dbn.g;
        }
        if ((n2 & 0x80) != 0x0) {
            h = dbn.h;
        }
        if ((n2 & 0x100) != 0x0) {
            i = dbn.i;
        }
        if ((n2 & 0x200) != 0x0) {
            j = dbn.j;
        }
        if ((n2 & 0x400) != 0x0) {
            k = dbn.k;
        }
        if ((n2 & 0x800) != 0x0) {
            l = dbn.l;
        }
        if ((n2 & 0x1000) != 0x0) {
            m = dbn.m;
        }
        if ((n2 & 0x2000) != 0x0) {
            n = dbn.n;
        }
        if ((n2 & 0x4000) != 0x0) {
            o = dbn.o;
        }
        if ((0x8000 & n2) != 0x0) {
            p29 = dbn.p;
        }
        if ((0x10000 & n2) != 0x0) {
            q = dbn.q;
        }
        if ((0x20000 & n2) != 0x0) {
            r = dbn.r;
        }
        if ((0x40000 & n2) != 0x0) {
            s = dbn.s;
        }
        if ((0x80000 & n2) != 0x0) {
            t = dbn.t;
        }
        if ((0x100000 & n2) != 0x0) {
            u = dbn.u;
        }
        if ((0x200000 & n2) != 0x0) {
            v = dbn.v;
        }
        if ((0x400000 & n2) != 0x0) {
            w = dbn.w;
        }
        if ((0x800000 & n2) != 0x0) {
            x = dbn.x;
        }
        if ((0x1000000 & n2) != 0x0) {
            y = dbn.y;
        }
        if ((n2 & 0x2000000) != 0x0) {
            z = dbn.z;
        }
        if ((0x4000000 & n2) != 0x0) {
            a = dbn.A;
        }
        if ((0x8000000 & n2) != 0x0) {
            b = dbn.B;
        }
        if ((n2 & 0x10000000) != 0x0) {
            c2 = dbn.C;
        }
        Objects.requireNonNull(dbn);
        e0e.f((Object)d, "canJoinAsSpeaker");
        e0e.f((Object)e, "admins");
        e0e.f((Object)f, "speakers");
        e0e.f((Object)g, "listeners");
        e0e.f((Object)r, "purchaseButtonState");
        e0e.f((Object)s, "taggedTopics");
        e0e.f((Object)y, "narrowCastSpaceType");
        return new dbn(b2, b3, c, d, e, f, g, h, i, j, k, l, m, n, o, p29, q, r, s, t, u, v, w, x, y, z, a, b, c2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof dbn)) {
            return false;
        }
        final dbn dbn = (dbn)o;
        return this.a == dbn.a && this.b == dbn.b && e0e.a((Object)this.c, (Object)dbn.c) && this.d == dbn.d && e0e.a((Object)this.e, (Object)dbn.e) && e0e.a((Object)this.f, (Object)dbn.f) && e0e.a((Object)this.g, (Object)dbn.g) && e0e.a((Object)this.h, (Object)dbn.h) && e0e.a((Object)this.i, (Object)dbn.i) && e0e.a((Object)this.j, (Object)dbn.j) && this.k == dbn.k && this.l == dbn.l && e0e.a((Object)this.m, (Object)dbn.m) && this.n == dbn.n && e0e.a((Object)this.o, (Object)dbn.o) && this.p == dbn.p && e0e.a((Object)this.q, (Object)dbn.q) && e0e.a((Object)this.r, (Object)dbn.r) && e0e.a((Object)this.s, (Object)dbn.s) && this.t == dbn.t && this.u == dbn.u && this.v == dbn.v && this.w == dbn.w && this.x == dbn.x && e0e.a((Object)this.y, (Object)dbn.y) && this.z == dbn.z && this.A == dbn.A && e0e.a((Object)this.B, (Object)dbn.B) && e0e.a((Object)this.C, (Object)dbn.C);
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a ? 1 : 0;
        final int n = 1;
        int n2 = a;
        if (a != 0) {
            n2 = 1;
        }
        int b;
        if ((b = (this.b ? 1 : 0)) != 0) {
            b = 1;
        }
        final String c = this.c;
        int hashCode = 0;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        final int q = z9a.q((Set)this.g, z9a.q((Set)this.f, z9a.q((Set)this.e, (this.d.hashCode() + ((n2 * 31 + b) * 31 + hashCode2) * 31) * 31, 31), 31), 31);
        final String h = this.h;
        int hashCode3;
        if (h == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = h.hashCode();
        }
        final String i = this.i;
        int hashCode4;
        if (i == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = i.hashCode();
        }
        final Long j = this.j;
        int hashCode5;
        if (j == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = j.hashCode();
        }
        final int k = this.k;
        int l;
        if ((l = (this.l ? 1 : 0)) != 0) {
            l = 1;
        }
        final String m = this.m;
        int hashCode6;
        if (m == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = m.hashCode();
        }
        int n3;
        if ((n3 = (this.n ? 1 : 0)) != 0) {
            n3 = 1;
        }
        final String o = this.o;
        int hashCode7;
        if (o == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = o.hashCode();
        }
        final int p = this.p;
        final zps q2 = this.q;
        int hashCode8;
        if (q2 == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = q2.hashCode();
        }
        final int o2 = go9.o((List)this.s, (this.r.hashCode() + ((((((((((q + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + k) * 31 + l) * 31 + hashCode6) * 31 + n3) * 31 + hashCode7) * 31 + p) * 31 + hashCode8) * 31) * 31, 31);
        int t;
        if ((t = (this.t ? 1 : 0)) != 0) {
            t = 1;
        }
        int u;
        if ((u = (this.u ? 1 : 0)) != 0) {
            u = 1;
        }
        int v;
        if ((v = (this.v ? 1 : 0)) != 0) {
            v = 1;
        }
        int w;
        if ((w = (this.w ? 1 : 0)) != 0) {
            w = 1;
        }
        int x;
        if ((x = (this.x ? 1 : 0)) != 0) {
            x = 1;
        }
        final int hashCode9 = this.y.hashCode();
        int z;
        if ((z = (this.z ? 1 : 0)) != 0) {
            z = 1;
        }
        int a2 = this.A ? 1 : 0;
        if (a2 != 0) {
            a2 = n;
        }
        final kmu b2 = this.B;
        int hashCode10;
        if (b2 == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = b2.hashCode();
        }
        final yh5 c2 = this.C;
        if (c2 != null) {
            hashCode = c2.hashCode();
        }
        return ((((hashCode9 + (((((o2 + t) * 31 + u) * 31 + v) * 31 + w) * 31 + x) * 31) * 31 + z) * 31 + a2) * 31 + hashCode10) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final boolean b = this.b;
        final String c = this.c;
        final yf3 d = this.d;
        final Set<RoomUserItem> e = this.e;
        final Set<RoomUserItem> f = this.f;
        final Set<RoomUserItem> g = this.g;
        final String h = this.h;
        final String i = this.i;
        final Long j = this.j;
        final int k = this.k;
        final boolean l = this.l;
        final String m = this.m;
        final boolean n = this.n;
        final String o = this.o;
        final int p = this.p;
        final zps q = this.q;
        final kol r = this.r;
        final List<AudioSpaceTopicItem> s = this.s;
        final boolean t = this.t;
        final boolean u = this.u;
        final boolean v = this.v;
        final boolean w = this.w;
        final boolean x = this.x;
        final NarrowcastSpaceType y = this.y;
        final boolean z = this.z;
        final boolean a2 = this.A;
        final kmu b2 = this.B;
        final yh5 c2 = this.C;
        final StringBuilder p2 = a88.p("RoomConsumptionPreviewViewState(isEnabled=", a, ", isConnected=", b, ", roomId=");
        p2.append(c);
        p2.append(", canJoinAsSpeaker=");
        p2.append(d);
        p2.append(", admins=");
        p2.append(e);
        p2.append(", speakers=");
        p2.append(f);
        p2.append(", listeners=");
        p2.append(g);
        p2.append(", hostTwitterUserId=");
        p2.append(h);
        p2.append(", broadcastId=");
        p2.append(i);
        p2.append(", startedAt=");
        p2.append(j);
        p2.append(", remainingParticipants=");
        p2.append(k);
        p2.append(", isCurrentlyHostingSpace=");
        p2.append(l);
        p2.append(", description=");
        o6f.g(p2, m, ", hasError=", n, ", primaryAdminId=");
        m51.z(p2, o, ", maxAdminCapacity=", p, ", ticketInfo=");
        p2.append(q);
        p2.append(", purchaseButtonState=");
        p2.append(r);
        p2.append(", taggedTopics=");
        p2.append(s);
        p2.append(", isSpaceRecording=");
        p2.append(t);
        p2.append(", canSpaceBeRecordedOnceEnded=");
        l58.l(p2, u, ", isEmployeeOnly=", v, ", preferBypassingPreview=");
        l58.l(p2, w, ", fromSpacesTab=", x, ", narrowCastSpaceType=");
        p2.append(y);
        p2.append(", disallowJoin=");
        p2.append(z);
        p2.append(", isEntity=");
        p2.append(a2);
        p2.append(", softInterventionPivot=");
        p2.append(b2);
        p2.append(", community=");
        p2.append(c2);
        p2.append(")");
        return p2.toString();
    }
}
