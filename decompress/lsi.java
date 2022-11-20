import java.util.Objects;
import java.util.List;
import android.content.Intent;
import com.twitter.model.notification.NotificationSettingsLink;
import com.twitter.util.user.UserIdentifier;
import android.annotation.SuppressLint;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "MissingPropagatedAnnotation" })
public final class lsi
{
    public static final b Companion;
    public static final rlp<lsi> Z;
    public final String A;
    public final UserIdentifier B;
    public final oae C;
    public final c47 D;
    public final String E;
    public final j0k F;
    public final ksi G;
    public final NotificationSettingsLink H;
    public final String I;
    public final Intent J;
    public final fvi K;
    public final gfd L;
    public final long M;
    public final String N;
    public final String O;
    public final xti P;
    public final boolean Q;
    public final eri R;
    public final boolean S;
    public final zsi T;
    public final String U;
    public final lvl V;
    public final String W;
    public final String X;
    public final i77 Y;
    public final long a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final kvi m;
    public final nvi n;
    public final List<hpi> o;
    public final npi p;
    public final List<phd> q;
    public final int r;
    public final List<phd> s;
    public final int t;
    public final String u;
    public final String v;
    public final int w;
    public final boolean x;
    public final String y;
    public final String z;
    
    static {
        Companion = new b();
        lsi.Z = lsi.lsi$c.c;
    }
    
    public lsi(final long a, final int b, final String c, final String d, final String e, final String f, final String g, final String h, final String i, final String j, final String k, final String l, final kvi m, final nvi n, final List<hpi> o, final npi p51, final List<phd> q, final int r, final List<phd> s, final int t, final String u, final String v, final int w, final boolean x, final String y, final String z, final String a2, final UserIdentifier b2, final oae c2, final c47 d2, final String e2, final j0k f2, final ksi g2, final NotificationSettingsLink h2, final String i2, final Intent j2, final fvi k2, final gfd l2, final long m2, final String n2, final String o2, final xti p52, final boolean q2, final eri r2, final boolean s2, final zsi t2, final String u2, final lvl v2, final String w2, final String x2, final i77 y2) {
        czd.f((Object)h, "scribeTarget");
        czd.f((Object)o, "actions");
        czd.f((Object)q, "inboxItems");
        czd.f((Object)s, "groupItems");
        czd.f((Object)b2, "recipientIdentifier");
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
        this.p = p51;
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
        this.P = p52;
        this.Q = q2;
        this.R = r2;
        this.S = s2;
        this.T = t2;
        this.U = u2;
        this.V = v2;
        this.W = w2;
        this.X = x2;
        this.Y = y2;
    }
    
    public static lsi a(final lsi lsi, long a, String d, String e, String i, nvi n, List q, List s, String u, boolean q2, lvl v, final int n2, final int n3) {
        if ((n2 & 0x1) != 0x0) {
            a = lsi.a;
        }
        int b;
        if ((n2 & 0x2) != 0x0) {
            b = lsi.b;
        }
        else {
            b = 0;
        }
        String c;
        if ((n2 & 0x4) != 0x0) {
            c = lsi.c;
        }
        else {
            c = null;
        }
        if ((n2 & 0x8) != 0x0) {
            d = lsi.d;
        }
        if ((n2 & 0x10) != 0x0) {
            e = lsi.e;
        }
        String f;
        if ((n2 & 0x20) != 0x0) {
            f = lsi.f;
        }
        else {
            f = null;
        }
        String g;
        if ((n2 & 0x40) != 0x0) {
            g = lsi.g;
        }
        else {
            g = null;
        }
        String h;
        if ((n2 & 0x80) != 0x0) {
            h = lsi.h;
        }
        else {
            h = null;
        }
        if ((n2 & 0x100) != 0x0) {
            i = lsi.i;
        }
        String j;
        if ((n2 & 0x200) != 0x0) {
            j = lsi.j;
        }
        else {
            j = null;
        }
        String k;
        if ((n2 & 0x400) != 0x0) {
            k = lsi.k;
        }
        else {
            k = null;
        }
        String l;
        if ((n2 & 0x800) != 0x0) {
            l = lsi.l;
        }
        else {
            l = null;
        }
        kvi m;
        if ((n2 & 0x1000) != 0x0) {
            m = lsi.m;
        }
        else {
            m = null;
        }
        if ((n2 & 0x2000) != 0x0) {
            n = lsi.n;
        }
        List<hpi> o;
        if ((n2 & 0x4000) != 0x0) {
            o = lsi.o;
        }
        else {
            o = null;
        }
        npi p13;
        if ((n2 & 0x8000) != 0x0) {
            p13 = lsi.p;
        }
        else {
            p13 = null;
        }
        if ((n2 & 0x10000) != 0x0) {
            q = lsi.q;
        }
        int r;
        if ((n2 & 0x20000) != 0x0) {
            r = lsi.r;
        }
        else {
            r = 0;
        }
        if ((n2 & 0x40000) != 0x0) {
            s = lsi.s;
        }
        int t;
        if ((n2 & 0x80000) != 0x0) {
            t = lsi.t;
        }
        else {
            t = 0;
        }
        if ((0x100000 & n2) != 0x0) {
            u = lsi.u;
        }
        String v2;
        if ((0x200000 & n2) != 0x0) {
            v2 = lsi.v;
        }
        else {
            v2 = null;
        }
        int w;
        if ((0x400000 & n2) != 0x0) {
            w = lsi.w;
        }
        else {
            w = 0;
        }
        final boolean b2 = (0x800000 & n2) != 0x0 && lsi.x;
        String y;
        if ((0x1000000 & n2) != 0x0) {
            y = lsi.y;
        }
        else {
            y = null;
        }
        String z;
        if ((0x2000000 & n2) != 0x0) {
            z = lsi.z;
        }
        else {
            z = null;
        }
        String a2;
        if ((0x4000000 & n2) != 0x0) {
            a2 = lsi.A;
        }
        else {
            a2 = null;
        }
        UserIdentifier b3;
        if ((0x8000000 & n2) != 0x0) {
            b3 = lsi.B;
        }
        else {
            b3 = null;
        }
        oae c2;
        if ((n2 & 0x10000000) != 0x0) {
            c2 = lsi.C;
        }
        else {
            c2 = null;
        }
        c47 d2;
        if ((0x20000000 & n2) != 0x0) {
            d2 = lsi.D;
        }
        else {
            d2 = null;
        }
        String e2;
        if ((0x40000000 & n2) != 0x0) {
            e2 = lsi.E;
        }
        else {
            e2 = null;
        }
        j0k f2;
        if ((n2 & Integer.MIN_VALUE) != 0x0) {
            f2 = lsi.F;
        }
        else {
            f2 = null;
        }
        ksi g2;
        if ((n3 & 0x1) != 0x0) {
            g2 = lsi.G;
        }
        else {
            g2 = null;
        }
        NotificationSettingsLink h2;
        if ((n3 & 0x2) != 0x0) {
            h2 = lsi.H;
        }
        else {
            h2 = null;
        }
        String i2;
        if ((n3 & 0x4) != 0x0) {
            i2 = lsi.I;
        }
        else {
            i2 = null;
        }
        Intent j2;
        if ((n3 & 0x8) != 0x0) {
            j2 = lsi.J;
        }
        else {
            j2 = null;
        }
        fvi k2;
        if ((n3 & 0x10) != 0x0) {
            k2 = lsi.K;
        }
        else {
            k2 = null;
        }
        gfd l2;
        if ((n3 & 0x20) != 0x0) {
            l2 = lsi.L;
        }
        else {
            l2 = null;
        }
        long m2;
        if ((n3 & 0x40) != 0x0) {
            m2 = lsi.M;
        }
        else {
            m2 = 0L;
        }
        String n4;
        if ((n3 & 0x80) != 0x0) {
            n4 = lsi.N;
        }
        else {
            n4 = null;
        }
        String o2;
        if ((n3 & 0x100) != 0x0) {
            o2 = lsi.O;
        }
        else {
            o2 = null;
        }
        xti p14;
        if ((n3 & 0x200) != 0x0) {
            p14 = lsi.P;
        }
        else {
            p14 = null;
        }
        if ((n3 & 0x400) != 0x0) {
            q2 = lsi.Q;
        }
        eri r2;
        if ((n3 & 0x800) != 0x0) {
            r2 = lsi.R;
        }
        else {
            r2 = null;
        }
        final boolean b4 = (n3 & 0x1000) != 0x0 && lsi.S;
        zsi t2;
        if ((n3 & 0x2000) != 0x0) {
            t2 = lsi.T;
        }
        else {
            t2 = null;
        }
        String u2;
        if ((n3 & 0x4000) != 0x0) {
            u2 = lsi.U;
        }
        else {
            u2 = null;
        }
        if ((n3 & 0x8000) != 0x0) {
            v = lsi.V;
        }
        String w2;
        if ((0x10000 & n3) != 0x0) {
            w2 = lsi.W;
        }
        else {
            w2 = null;
        }
        String x;
        if ((n3 & 0x20000) != 0x0) {
            x = lsi.X;
        }
        else {
            x = null;
        }
        i77 y2;
        if ((n3 & 0x40000) != 0x0) {
            y2 = lsi.Y;
        }
        else {
            y2 = null;
        }
        Objects.requireNonNull(lsi);
        czd.f((Object)h, "scribeTarget");
        czd.f((Object)o, "actions");
        czd.f((Object)q, "inboxItems");
        czd.f((Object)s, "groupItems");
        czd.f((Object)b3, "recipientIdentifier");
        return new lsi(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p13, q, r, s, t, u, v2, w, b2, y, z, a2, b3, c2, d2, e2, f2, g2, h2, i2, j2, k2, l2, m2, n4, o2, p14, q2, r2, b4, t2, u2, v, w2, x, y2);
    }
    
    public final lsi b(final long n) {
        return a(this, n, null, null, null, null, null, null, null, false, null, -2, 524287);
    }
    
    public final long c() {
        final String g = this.g;
        int hashCode;
        if (g != null) {
            hashCode = g.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode;
    }
    
    public final String d() {
        final nvi n = this.n;
        if (n != null) {
            final mvi a = n.a;
            final String b;
            if (a != null && (b = a.b) != null) {
                return b;
            }
        }
        return "";
    }
    
    public final long e() {
        final nvi n = this.n;
        if (n != null) {
            final mvi b = n.b;
            if (b != null) {
                return b.a;
            }
        }
        return 0L;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof lsi)) {
            return false;
        }
        final lsi lsi = (lsi)o;
        return this.a == lsi.a && this.b == lsi.b && czd.a((Object)this.c, (Object)lsi.c) && czd.a((Object)this.d, (Object)lsi.d) && czd.a((Object)this.e, (Object)lsi.e) && czd.a((Object)this.f, (Object)lsi.f) && czd.a((Object)this.g, (Object)lsi.g) && czd.a((Object)this.h, (Object)lsi.h) && czd.a((Object)this.i, (Object)lsi.i) && czd.a((Object)this.j, (Object)lsi.j) && czd.a((Object)this.k, (Object)lsi.k) && czd.a((Object)this.l, (Object)lsi.l) && czd.a((Object)this.m, (Object)lsi.m) && czd.a((Object)this.n, (Object)lsi.n) && czd.a((Object)this.o, (Object)lsi.o) && czd.a((Object)this.p, (Object)lsi.p) && czd.a((Object)this.q, (Object)lsi.q) && this.r == lsi.r && czd.a((Object)this.s, (Object)lsi.s) && this.t == lsi.t && czd.a((Object)this.u, (Object)lsi.u) && czd.a((Object)this.v, (Object)lsi.v) && this.w == lsi.w && this.x == lsi.x && czd.a((Object)this.y, (Object)lsi.y) && czd.a((Object)this.z, (Object)lsi.z) && czd.a((Object)this.A, (Object)lsi.A) && czd.a((Object)this.B, (Object)lsi.B) && czd.a((Object)this.C, (Object)lsi.C) && czd.a((Object)this.D, (Object)lsi.D) && czd.a((Object)this.E, (Object)lsi.E) && czd.a((Object)this.F, (Object)lsi.F) && czd.a((Object)this.G, (Object)lsi.G) && czd.a((Object)this.H, (Object)lsi.H) && czd.a((Object)this.I, (Object)lsi.I) && czd.a((Object)this.J, (Object)lsi.J) && czd.a((Object)this.K, (Object)lsi.K) && czd.a((Object)this.L, (Object)lsi.L) && this.M == lsi.M && czd.a((Object)this.N, (Object)lsi.N) && czd.a((Object)this.O, (Object)lsi.O) && czd.a((Object)this.P, (Object)lsi.P) && this.Q == lsi.Q && czd.a((Object)this.R, (Object)lsi.R) && this.S == lsi.S && czd.a((Object)this.T, (Object)lsi.T) && czd.a((Object)this.U, (Object)lsi.U) && czd.a((Object)this.V, (Object)lsi.V) && czd.a((Object)this.W, (Object)lsi.W) && czd.a((Object)this.X, (Object)lsi.X) && czd.a((Object)this.Y, (Object)lsi.Y);
    }
    
    public final long f() {
        final kvi m = this.m;
        long a;
        if (m != null) {
            a = m.a;
        }
        else {
            a = 0L;
        }
        return a;
    }
    
    public final boolean g() {
        final int w = this.w;
        return w == 4 || w == 27 || w == 5 || w == 6 || w == 23 || w == 24 || w == 219;
    }
    
    public final boolean h() {
        final int w = this.w;
        return w == 22 || w == 274 || w == 253 || w == 308;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final int n = (int)(a ^ a >>> 32);
        final int b = this.b;
        final String c = this.c;
        int hashCode = 0;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        final String d = this.d;
        int hashCode3;
        if (d == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = d.hashCode();
        }
        final String e = this.e;
        int hashCode4;
        if (e == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = e.hashCode();
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
        final int f2 = hmg.f(this.h, ((((((n * 31 + b) * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31, 31);
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
        final String k = this.k;
        int hashCode9;
        if (k == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = k.hashCode();
        }
        final String l = this.l;
        int hashCode10;
        if (l == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = l.hashCode();
        }
        final kvi m = this.m;
        int hashCode11;
        if (m == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = m.hashCode();
        }
        final nvi n2 = this.n;
        int hashCode12;
        if (n2 == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = n2.hashCode();
        }
        final int d2 = sde.d((List)this.o, ((((((f2 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode12) * 31, 31);
        final npi p = this.p;
        int hashCode13;
        if (p == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = p.hashCode();
        }
        final int d3 = sde.d((List)this.s, (sde.d((List)this.q, (d2 + hashCode13) * 31, 31) + this.r) * 31, 31);
        final int t = this.t;
        final String u = this.u;
        int hashCode14;
        if (u == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = u.hashCode();
        }
        final String v = this.v;
        int hashCode15;
        if (v == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = v.hashCode();
        }
        final int w = this.w;
        final int x = this.x ? 1 : 0;
        int n3 = 1;
        int n4 = x;
        if (x != 0) {
            n4 = 1;
        }
        final String y = this.y;
        int hashCode16;
        if (y == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = y.hashCode();
        }
        final String z = this.z;
        int hashCode17;
        if (z == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = z.hashCode();
        }
        final String a2 = this.A;
        int hashCode18;
        if (a2 == null) {
            hashCode18 = 0;
        }
        else {
            hashCode18 = a2.hashCode();
        }
        final int hashCode19 = this.B.hashCode();
        final oae c2 = this.C;
        int hashCode20;
        if (c2 == null) {
            hashCode20 = 0;
        }
        else {
            hashCode20 = c2.hashCode();
        }
        final c47 d4 = this.D;
        int hashCode21;
        if (d4 == null) {
            hashCode21 = 0;
        }
        else {
            hashCode21 = d4.hashCode();
        }
        final String e2 = this.E;
        int hashCode22;
        if (e2 == null) {
            hashCode22 = 0;
        }
        else {
            hashCode22 = e2.hashCode();
        }
        final j0k f3 = this.F;
        int hashCode23;
        if (f3 == null) {
            hashCode23 = 0;
        }
        else {
            hashCode23 = f3.hashCode();
        }
        final ksi g2 = this.G;
        int hashCode24;
        if (g2 == null) {
            hashCode24 = 0;
        }
        else {
            hashCode24 = g2.hashCode();
        }
        final NotificationSettingsLink h = this.H;
        int hashCode25;
        if (h == null) {
            hashCode25 = 0;
        }
        else {
            hashCode25 = h.hashCode();
        }
        final String i2 = this.I;
        int hashCode26;
        if (i2 == null) {
            hashCode26 = 0;
        }
        else {
            hashCode26 = i2.hashCode();
        }
        final Intent j2 = this.J;
        int hashCode27;
        if (j2 == null) {
            hashCode27 = 0;
        }
        else {
            hashCode27 = j2.hashCode();
        }
        final fvi k2 = this.K;
        int hashCode28;
        if (k2 == null) {
            hashCode28 = 0;
        }
        else {
            hashCode28 = k2.hashCode();
        }
        final gfd l2 = this.L;
        int hashCode29;
        if (l2 == null) {
            hashCode29 = 0;
        }
        else {
            hashCode29 = l2.hashCode();
        }
        final long m2 = this.M;
        final int n5 = (int)(m2 ^ m2 >>> 32);
        final String n6 = this.N;
        int hashCode30;
        if (n6 == null) {
            hashCode30 = 0;
        }
        else {
            hashCode30 = n6.hashCode();
        }
        final String o = this.O;
        int hashCode31;
        if (o == null) {
            hashCode31 = 0;
        }
        else {
            hashCode31 = o.hashCode();
        }
        final xti p2 = this.P;
        int hashCode32;
        if (p2 == null) {
            hashCode32 = 0;
        }
        else {
            hashCode32 = p2.hashCode();
        }
        int q;
        if ((q = (this.Q ? 1 : 0)) != 0) {
            q = 1;
        }
        final eri r = this.R;
        int hashCode33;
        if (r == null) {
            hashCode33 = 0;
        }
        else {
            hashCode33 = r.hashCode();
        }
        final int s = this.S ? 1 : 0;
        if (s == 0) {
            n3 = s;
        }
        final zsi t2 = this.T;
        int hashCode34;
        if (t2 == null) {
            hashCode34 = 0;
        }
        else {
            hashCode34 = t2.hashCode();
        }
        final String u2 = this.U;
        int hashCode35;
        if (u2 == null) {
            hashCode35 = 0;
        }
        else {
            hashCode35 = u2.hashCode();
        }
        final lvl v2 = this.V;
        int hashCode36;
        if (v2 == null) {
            hashCode36 = 0;
        }
        else {
            hashCode36 = v2.hashCode();
        }
        final String w2 = this.W;
        int hashCode37;
        if (w2 == null) {
            hashCode37 = 0;
        }
        else {
            hashCode37 = w2.hashCode();
        }
        final String x2 = this.X;
        int hashCode38;
        if (x2 == null) {
            hashCode38 = 0;
        }
        else {
            hashCode38 = x2.hashCode();
        }
        final i77 y2 = this.Y;
        if (y2 != null) {
            hashCode = y2.hashCode();
        }
        return (((((((((((((((((((((((hashCode19 + ((((((((d3 + t) * 31 + hashCode14) * 31 + hashCode15) * 31 + w) * 31 + n4) * 31 + hashCode16) * 31 + hashCode17) * 31 + hashCode18) * 31) * 31 + hashCode20) * 31 + hashCode21) * 31 + hashCode22) * 31 + hashCode23) * 31 + hashCode24) * 31 + hashCode25) * 31 + hashCode26) * 31 + hashCode27) * 31 + hashCode28) * 31 + hashCode29) * 31 + n5) * 31 + hashCode30) * 31 + hashCode31) * 31 + hashCode32) * 31 + q) * 31 + hashCode33) * 31 + n3) * 31 + hashCode34) * 31 + hashCode35) * 31 + hashCode36) * 31 + hashCode37) * 31 + hashCode38) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final int b = this.b;
        final String c = this.c;
        final String d = this.d;
        final String e = this.e;
        final String f = this.f;
        final String g = this.g;
        final String h = this.h;
        final String i = this.i;
        final String j = this.j;
        final String k = this.k;
        final String l = this.l;
        final kvi m = this.m;
        final nvi n = this.n;
        final List<hpi> o = this.o;
        final npi p = this.p;
        final List<phd> q = this.q;
        final int r = this.r;
        final List<phd> s = this.s;
        final int t = this.t;
        final String u = this.u;
        final String v = this.v;
        final int w = this.w;
        final boolean x = this.x;
        final String y = this.y;
        final String z = this.z;
        final String a2 = this.A;
        final UserIdentifier b2 = this.B;
        final oae c2 = this.C;
        final c47 d2 = this.D;
        final String e2 = this.E;
        final j0k f2 = this.F;
        final ksi g2 = this.G;
        final NotificationSettingsLink h2 = this.H;
        final String i2 = this.I;
        final Intent j2 = this.J;
        final fvi k2 = this.K;
        final gfd l2 = this.L;
        final long m2 = this.M;
        final String n2 = this.N;
        final String o2 = this.O;
        final xti p2 = this.P;
        final boolean q2 = this.Q;
        final eri r2 = this.R;
        final boolean s2 = this.S;
        final zsi t2 = this.T;
        final String u2 = this.U;
        final lvl v2 = this.V;
        final String w2 = this.W;
        final String x2 = this.X;
        final i77 y2 = this.Y;
        final StringBuilder sb = new StringBuilder();
        sb.append("NotificationInfo(notificationId=");
        sb.append(a);
        sb.append(", unreadCount=");
        sb.append(b);
        nb0.z(sb, ", impressionId=", c, ", title=", d);
        nb0.z(sb, ", text=", e, ", subtext=", f);
        nb0.z(sb, ", conversationId=", g, ", scribeTarget=", h);
        nb0.z(sb, ", senderName=", i, ", uri=", j);
        nb0.z(sb, ", imageUrl=", k, ", smallIcon=", l);
        sb.append(", tweet=");
        sb.append(m);
        sb.append(", users=");
        sb.append(n);
        sb.append(", actions=");
        sb.append(o);
        sb.append(", actionsV2=");
        sb.append(p);
        sb.append(", inboxItems=");
        sb.append(q);
        sb.append(", interactionCount=");
        sb.append(r);
        sb.append(", groupItems=");
        sb.append(s);
        sb.append(", priority=");
        sb.append(t);
        nb0.z(sb, ", ticker=", u, ", header=", v);
        sb.append(", category=");
        sb.append(w);
        sb.append(", isImageUrlPossiblySensitive=");
        sb.append(x);
        nb0.z(sb, ", channel=", y, ", group=", z);
        sb.append(", sound=");
        sb.append(a2);
        sb.append(", recipientIdentifier=");
        sb.append(b2);
        sb.append(", joinConversationEvent=");
        sb.append(c2);
        sb.append(", createMessageEvent=");
        sb.append(d2);
        sb.append(", endpointUrl=");
        sb.append(e2);
        sb.append(", payloadBadgeCount=");
        sb.append(f2);
        sb.append(", notificationImages=");
        sb.append(g2);
        sb.append(", notificationSettingsLink=");
        sb.append(h2);
        sb.append(", overridingImpressionId=");
        sb.append(i2);
        sb.append(", intent=");
        sb.append(j2);
        sb.append(", notificationSmartAction=");
        sb.append(k2);
        sb.append(", inAppMessageInfo=");
        sb.append(l2);
        e1.C(sb, ", serverSentTime=", m2, ", topicId=");
        nb0.z(sb, n2, ", notificationTypeMetadata=", o2, ", progress=");
        sb.append(p2);
        sb.append(", isShowing=");
        sb.append(q2);
        sb.append(", customFormatting=");
        sb.append(r2);
        sb.append(", isSenderVerified=");
        sb.append(s2);
        sb.append(", notificationLayout=");
        sb.append(t2);
        sb.append(", subtitle=");
        sb.append(u2);
        sb.append(", quoteTweetPushDetails=");
        sb.append(v2);
        sb.append(", compactStateColor=");
        sb.append(w2);
        sb.append(", expandedStateColor=");
        sb.append(x2);
        sb.append(", ctaSuffix=");
        sb.append(y2);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class b
    {
    }
}
