import java.util.List;
import com.twitter.model.vibe.Vibe;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vvl
{
    public static final rlp<vvl> J;
    public final int A;
    public final int B;
    public final String C;
    public final String D;
    public final on4 E;
    public final Vibe F;
    public final qq9 G;
    public final iyk H;
    public final ybf I;
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final String f;
    public final bj3 g;
    public final hwv h;
    public final boolean i;
    public final uil j;
    public final boolean k;
    public final boolean l;
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final cfu r;
    public final cfu s;
    public final long t;
    public final qqx u;
    public final wdw v;
    public final String w;
    public final List<jw9> x;
    public final int y;
    public final int z;
    
    static {
        vvl.J = new vvl.vvl$b();
    }
    
    public vvl(final bo6 bo6) {
        this.d = bo6.D();
        this.a = bo6.w();
        this.b = bo6.h();
        this.c = bo6.x();
        this.e = bo6.D0.N0;
        this.f = bo6.A();
        final vf3 d0 = bo6.D0;
        this.g = d0.X0;
        this.h = d0.Y0;
        this.i = bo6.I0();
        this.j = bo6.E0;
        this.k = (bo6.A0() ^ true);
        final vf3 d2 = bo6.D0;
        this.l = d2.D0;
        this.m = d2.P0;
        this.n = d2.O0;
        this.o = bo6.A0();
        this.p = bo6.J0();
        this.q = bo6.g0();
        this.r = bo6.D0.L0;
        this.s = bo6.B();
        final vf3 d3 = bo6.D0;
        this.t = d3.l1;
        this.u = d3.m1;
        this.v = bo6.r();
        final vf3 d4 = bo6.D0;
        this.w = d4.a1;
        this.x = bo6.O0;
        this.y = d4.I0;
        this.z = d4.E0;
        this.A = d4.H0;
        this.B = d4.G0;
        this.C = d4.g1;
        this.D = d4.i1;
        this.E = d4.x1;
        this.F = d4.y1;
        this.G = d4.z1;
        this.H = d4.A1;
        this.I = d4.B1;
    }
    
    public vvl(final nh0 nh0) {
        final cgv e0 = nh0.E0;
        this.a = e0.D0;
        this.b = e0.c();
        this.c = e0.K0;
        final boolean m0 = e0.M0;
        this.k = (m0 ^ true);
        this.o = m0;
        this.p = e0.N0;
        this.q = Boolean.TRUE.equals(e0.h());
        this.v = e0.d();
        final vf3 i0 = nh0.I0;
        boolean j = false;
        this.d = i0.a(false);
        final vf3 i2 = nh0.I0;
        this.l = i2.D0;
        this.e = i2.N0;
        this.f = nh0.E0.E0;
        this.g = i2.X0;
        this.h = i2.Y0;
        if ((i2.S0 & 0x40) != 0x0) {
            j = true;
        }
        this.i = j;
        this.j = nh0.K0;
        this.m = i2.P0;
        this.n = i2.O0;
        this.r = i2.L0;
        this.s = i2.M0;
        this.t = i2.l1;
        this.u = i2.m1;
        this.w = i2.a1;
        this.x = null;
        this.y = i2.I0;
        this.z = i2.E0;
        this.A = i2.H0;
        this.B = i2.G0;
        this.C = i2.g1;
        this.D = i2.i1;
        this.E = i2.x1;
        this.F = i2.y1;
        this.G = i2.z1;
        this.H = i2.A1;
        this.I = i2.B1;
    }
    
    public vvl(final vvl.vvl$a vvl$a) {
        this.d = vvl$a.d;
        this.a = vvl$a.a;
        this.b = vvl$a.b;
        this.c = vvl$a.c;
        this.e = vvl$a.e;
        this.f = vvl$a.f;
        this.g = vvl$a.g;
        this.h = vvl$a.h;
        this.i = vvl$a.i;
        this.j = vvl$a.j;
        this.k = vvl$a.k;
        this.l = vvl$a.l;
        this.m = vvl$a.m;
        this.n = vvl$a.n;
        this.o = vvl$a.o;
        this.p = vvl$a.p;
        this.q = vvl$a.q;
        this.r = vvl$a.r;
        this.s = vvl$a.s;
        this.t = vvl$a.t;
        this.u = vvl$a.u;
        this.v = vvl$a.v;
        this.w = vvl$a.w;
        this.x = vvl$a.x;
        this.y = vvl$a.y;
        this.z = vvl$a.z;
        this.A = vvl$a.A;
        this.B = vvl$a.B;
        this.C = vvl$a.C;
        this.D = vvl$a.D;
        this.E = vvl$a.E;
        this.F = vvl$a.F;
        this.G = vvl$a.G;
        this.H = vvl$a.H;
        this.I = vvl$a.I;
    }
    
    public final boolean a(final vvl vvl) {
        return this == vvl || (vvl != null && this.a == vvl.a && c5j.a((Object)this.b, (Object)vvl.b) && c5j.a((Object)this.c, (Object)vvl.c) && this.d == vvl.d && this.e == vvl.e && c5j.a((Object)this.f, (Object)vvl.f) && c5j.a((Object)this.g, (Object)vvl.g) && c5j.a((Object)this.h, (Object)vvl.h) && this.i == vvl.i && c5j.a((Object)this.j, (Object)vvl.j) && this.k == vvl.k && this.l == vvl.l && this.m == vvl.m && this.n == vvl.n && this.o == vvl.o && this.p == vvl.p && c5j.a((Object)this.t, (Object)vvl.t) && c5j.a((Object)this.u, (Object)vvl.u) && c5j.a((Object)this.x, (Object)vvl.x) && c5j.a((Object)this.w, (Object)vvl.w) && c5j.a((Object)this.C, (Object)vvl.C) && c5j.a((Object)this.D, (Object)vvl.D) && c5j.a((Object)this.E, (Object)vvl.E) && c5j.a((Object)this.F, (Object)vvl.F) && c5j.a((Object)this.G, (Object)vvl.G) && c5j.a((Object)this.H, (Object)vvl.H) && c5j.a((Object)this.I, (Object)vvl.I));
    }
    
    public final bo6 b() {
        int o;
        final boolean b = (o = (this.o ? 1 : 0)) != 0;
        if (this.p) {
            o = ((b ? 1 : 0) | 0x2);
        }
        int d = o;
        if (this.q) {
            d = (o | 0x200000);
        }
        final bo6$b bo6$b = new bo6$b();
        final long a = this.a;
        bo6$b.c.b = a;
        bo6$b.a.b = this.d;
        bo6$b.v(a);
        final String c = this.c;
        final qum$a c2 = bo6$b.c;
        c2.c = c;
        final qdu.a b2 = bo6$b.b;
        b2.b = c;
        final String b3 = this.b;
        c2.d = b3;
        b2.c = b3;
        c2.a = this.d;
        final long e = this.e;
        final vf3.b a2 = bo6$b.a;
        a2.d = e;
        a2.y = this.r;
        b2.e = this.f;
        a2.u = this.g;
        a2.v = this.h;
        int q;
        if (this.i) {
            q = 64;
        }
        else {
            q = 0;
        }
        a2.q = q;
        bo6$b.k = this.j;
        a2.i = this.l;
        a2.f = this.m;
        a2.e = this.n;
        b2.d = d;
        a2.z = this.s;
        a2.A = this.t;
        a2.w = this.u;
        bo6$b.q = this.x;
        a2.H = this.w;
        a2.M = this.C;
        a2.P = this.D;
        a2.W = this.E;
        a2.X = this.F;
        a2.Y = this.G;
        a2.Z = this.H;
        a2.b0 = this.I;
        return (bo6)((n4j)bo6$b).e();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && o instanceof vvl && this.a((vvl)o));
    }
    
    @Override
    public final int hashCode() {
        return c5j.f((Object)this.I) + (c5j.f((Object)this.H) + (c5j.f((Object)this.G) + (c5j.f((Object)this.F) + (c5j.f((Object)this.E) + oqf.l(this.D, oqf.l(this.C, (c5j.q((List)this.x) + oqf.l(this.w, (c5j.f((Object)this.u) + (c5j.f((Object)this.r) + hmg.e(this.t, ((hmg.e(this.n, hmg.e(this.m, (((c5j.f((Object)this.j) + ((c5j.f((Object)this.h) + (c5j.f((Object)this.g) + oqf.l(this.f, hmg.e(this.e, hmg.e(this.d, oqf.l(this.c, oqf.l(this.b, c5j.d(this.a) * 31, 31), 31), 31), 31), 31)) * 31) * 31 + (this.i ? 1 : 0)) * 31) * 31 + (this.k ? 1 : 0)) * 31 + (this.l ? 1 : 0)) * 31, 31), 31) + (this.o ? 1 : 0)) * 31 + (this.p ? 1 : 0)) * 31, 31)) * 31) * 31, 31)) * 31, 31), 31)) * 31) * 31) * 31) * 31;
    }
}
