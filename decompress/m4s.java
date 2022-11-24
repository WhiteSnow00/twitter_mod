import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m4s
{
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final float g;
    public static final float h;
    public static final jcu<Float> i;
    public static final float j;
    public static final float k;
    
    static {
        final float f2 = a = 34;
        b = 14;
        final float g2 = c = 20;
        d = 24;
        e = 2;
        f = f2;
        g = g2;
        h = f2 - g2;
        i = new jcu(100, (nq9)null, 6);
        j = 1;
        k = 6;
    }
    
    public static final void a(final boolean b, final stb<? super Boolean, vzv> stb, dlh companion, boolean b2, iuh iuh, j4s j, d86 h, final int n, final int n2) {
        h = h.h(25866825);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (h.a(b)) {
                n4 = 4;
            }
            else {
                n4 = 2;
            }
            n3 = (n4 | n);
        }
        else {
            n3 = n;
        }
        int n5;
        if ((n2 & 0x2) != 0x0) {
            n5 = (n3 | 0x30);
        }
        else {
            n5 = n3;
            if ((n & 0x70) == 0x0) {
                int n6;
                if (h.P((Object)stb)) {
                    n6 = 32;
                }
                else {
                    n6 = 16;
                }
                n5 = (n3 | n6);
            }
        }
        final int n7 = n2 & 0x4;
        int n10 = 0;
        Label_0201: {
            int n8;
            if (n7 != 0) {
                n8 = (n5 | 0x180);
            }
            else {
                n8 = n5;
                if ((n & 0x380) == 0x0) {
                    int n9;
                    if (h.P((Object)companion)) {
                        n9 = 256;
                    }
                    else {
                        n9 = 128;
                    }
                    n10 = (n5 | n9);
                    break Label_0201;
                }
            }
            n10 = n8;
        }
        final int n11 = n2 & 0x8;
        int n14 = 0;
        Label_0275: {
            int n12;
            if (n11 != 0) {
                n12 = (n10 | 0xC00);
            }
            else {
                n12 = n10;
                if ((n & 0x1C00) == 0x0) {
                    int n13;
                    if (h.a(b2)) {
                        n13 = 2048;
                    }
                    else {
                        n13 = 1024;
                    }
                    n14 = (n10 | n13);
                    break Label_0275;
                }
            }
            n14 = n12;
        }
        final int n15 = n2 & 0x10;
        int n18 = 0;
        Label_0349: {
            int n16;
            if (n15 != 0) {
                n16 = (n14 | 0x6000);
            }
            else {
                n16 = n14;
                if ((0xE000 & n) == 0x0) {
                    int n17;
                    if (h.P((Object)iuh)) {
                        n17 = 16384;
                    }
                    else {
                        n17 = 8192;
                    }
                    n18 = (n14 | n17);
                    break Label_0349;
                }
            }
            n18 = n16;
        }
        if ((n & 0x70000) == 0x0) {
            int n19;
            if ((n2 & 0x20) == 0x0 && h.P((Object)j)) {
                n19 = 131072;
            }
            else {
                n19 = 65536;
            }
            n18 |= n19;
        }
        j4s j4s;
        dlh dlh = null;
        iuh iuh3;
        if ((0x5B6DB & n18) == 0x12492 && h.i()) {
            h.H();
            final iuh iuh2 = iuh;
            j4s = j;
            dlh = companion;
            iuh3 = iuh2;
        }
        else {
            h.C();
            j4s j4s2 = null;
            Label_0648: {
                int n20;
                if ((n & 0x1) != 0x0 && !h.K()) {
                    h.H();
                    n20 = n18;
                    if ((n2 & 0x20) != 0x0) {
                        n20 = (n18 & 0xFFF8FFFF);
                    }
                }
                else {
                    if (n7 != 0) {
                        companion = (dlh)dlh.Companion;
                    }
                    if (n11 != 0) {
                        b2 = true;
                    }
                    if (n15 != 0) {
                        h.x(-492369756);
                        final Object y = h.y();
                        Objects.requireNonNull(d86.Companion);
                        Object d;
                        if ((d = y) == d86$a.b) {
                            d = zk.d(h);
                        }
                        h.O();
                        iuh = (iuh)d;
                    }
                    if ((n2 & 0x20) == 0x0) {
                        final dlh dlh2 = companion;
                        j4s2 = j;
                        dlh = dlh2;
                        break Label_0648;
                    }
                    j = jb2.J(0L, 0L, 0.0f, h, 1023);
                    n20 = (n18 & 0xFFF8FFFF);
                }
                final dlh dlh3 = companion;
                j4s2 = j;
                n18 = n20;
                dlh = dlh3;
            }
            h.s();
            final sa6$b a = sa6.a;
            final gbr e = ff6.e;
            final float t0 = ((rp8)h.m((df6)e)).t0(m4s.h);
            final Boolean value = b;
            Object f0;
            if (stb == null) {
                f0 = m4s$c.F0;
            }
            else {
                f0 = stb;
            }
            final jcu<Float> i = m4s.i;
            e0e.f((Object)value, "value");
            e0e.f(f0, "onValueChange");
            h.x(1156387078);
            h.x(-492369756);
            final Object y2 = h.y();
            Objects.requireNonNull(d86.Companion);
            final d86$a$a b3 = d86$a.b;
            Object o = y2;
            if (y2 == b3) {
                o = new o3s((Object)value, (ac0)i, (stb)a3s.F0);
                h.p(o);
            }
            h.O();
            final o3s o3s = (o3s)o;
            h.x(-492369756);
            Object o2;
            if ((o2 = h.y()) == b3) {
                o2 = zzz.W((Object)Boolean.FALSE);
                h.p(o2);
            }
            h.O();
            final fvh fvh = (fvh)o2;
            shw.i((Object)value, fvh.getValue(), (hub)new x2s((Object)value, o3s, (mp6)null), h);
            shw.b(o3s.f(), (stb)new z2s((Object)value, o3s, (stb)f0, fvh), h);
            h.O();
            final gbr k = ff6.k;
            final boolean b4 = h.m((df6)k) == cwe.G0;
            Object o3;
            if (stb != null) {
                final dlh.a companion2 = dlh.Companion;
                Objects.requireNonNull(t0n.Companion);
                o3 = yht.a((dlh)companion2, b, iuh, (jld)null, b2, new t0n(2), (stb)stb);
            }
            else {
                o3 = dlh.Companion;
            }
            dlh dlh4;
            final dlh.a a2 = (dlh.a)(dlh4 = (dlh)dlh.Companion);
            if (stb != null) {
                dlh4 = bvt.a((dlh)a2);
            }
            final dlh u = lai.u(dlh.E(dlh4).E((dlh)o3), o3s, mlg.S(new awj[] { new awj((Object)0.0f, (Object)Boolean.FALSE), new awj((Object)t0, (Object)Boolean.TRUE) }), b2 && stb != null, b4, iuh, (hub)m4s$a.F0, 0.0f, 256);
            Objects.requireNonNull(ex.Companion);
            final dlh z = zzz.Z(heq.u(u, (ex)ex$a.f, 2), m4s.e);
            final float f2 = m4s.f;
            final float g = m4s.g;
            e0e.f((Object)z, "$this$requiredSize");
            final ysd$a a3 = ysd.a;
            final ysd$a a4 = ysd.a;
            final dlh e2 = z.E((dlh)new jeq(f2, g, f2, g, false));
            h.x(733328855);
            final zqg d2 = ob2.d((ex)ex$a.b, false, h);
            h.x(-1323940314);
            final rp8 rp8 = (rp8)h.m((df6)e);
            final cwe cwe = (cwe)h.m((df6)k);
            final l7x l7x = (l7x)h.m((df6)ff6.o);
            Objects.requireNonNull(w76.Companion);
            final swe$a b5 = w76.a.b;
            final kub<weq<w76>, d86, Integer, vzv> a5 = lwe.a(e2);
            if (!(h.j() instanceof tr0)) {
                kqe.W();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((ptb)b5);
            }
            else {
                h.o();
            }
            h.F();
            jty.X(h, d2, (hub)w76.a.e);
            jty.X(h, rp8, (hub)w76.a.d);
            jty.X(h, cwe, (hub)w76.a.f);
            ((z36)a5).h0((Object)af.y(h, l7x, w76.a.g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-2137368960);
            final bs4 k2 = bs4.K0;
            h.x(1571176015);
            final wwj e3 = o3s.e;
            final int n21 = n18 << 3;
            final d86 d3 = h;
            b((qb2)k2, b, b2, j4s2, (l9r<Float>)e3, (hvd)iuh, d3, (n21 & 0x70) | 0x6 | (n18 >> 3 & 0x380) | (n18 >> 6 & 0x1C00) | (n21 & 0x70000));
            d3.O();
            d3.O();
            d3.O();
            d3.r();
            d3.O();
            d3.O();
            final iuh iuh4 = iuh;
            j4s = j4s2;
            iuh3 = iuh4;
        }
        final gyo l = h.k();
        if (l != null) {
            l.a((hub)new hub<d86, Integer, vzv>(b, stb, dlh, b2, iuh3, j4s, n, n2) {
                public final boolean F0;
                public final stb<Boolean, vzv> G0;
                public final dlh H0;
                public final boolean I0;
                public final iuh J0;
                public final j4s K0;
                public final int L0;
                public final int M0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final d86 d86 = (d86)o;
                    ((Number)o2).intValue();
                    m4s.a(this.F0, this.G0, this.H0, this.I0, this.J0, this.K0, d86, this.L0 | 0x1, this.M0);
                    return vzv.a;
                }
            });
        }
    }
    
    public static final void b(final qb2 qb2, final boolean b, final boolean b2, final j4s j4s, final l9r<Float> l9r, final hvd hvd, final d86 d86, final int n) {
        final d86 h = d86.h(-1834839253);
        int n3;
        if ((n & 0xE) == 0x0) {
            int n2;
            if (h.P((Object)qb2)) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        int n4 = n3;
        if ((n & 0x70) == 0x0) {
            int n5;
            if (h.a(b)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        int n6 = n4;
        if ((n & 0x380) == 0x0) {
            int n7;
            if (h.a(b2)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n4 | n7);
        }
        int n8 = n6;
        if ((n & 0x1C00) == 0x0) {
            int n9;
            if (h.P((Object)j4s)) {
                n9 = 2048;
            }
            else {
                n9 = 1024;
            }
            n8 = (n6 | n9);
        }
        int n10 = n8;
        if ((0xE000 & n) == 0x0) {
            int n11;
            if (h.P((Object)l9r)) {
                n11 = 16384;
            }
            else {
                n11 = 8192;
            }
            n10 = (n8 | n11);
        }
        int n12 = n10;
        if ((0x70000 & n) == 0x0) {
            int n13;
            if (h.P((Object)hvd)) {
                n13 = 131072;
            }
            else {
                n13 = 65536;
            }
            n12 = (n10 | n13);
        }
        if ((n12 & 0x5B6DB) == 0x12492 && h.i()) {
            h.H();
        }
        else {
            final sa6$b a = sa6.a;
            h.x(-492369756);
            final Object y = h.y();
            Objects.requireNonNull(d86.Companion);
            final d86$a$a b3 = d86$a.b;
            jjq jjq;
            if ((jjq = (jjq)y) == b3) {
                jjq = new jjq();
                h.p((Object)jjq);
            }
            h.O();
            final jjq jjq2 = jjq;
            h.x(511388516);
            final boolean p8 = h.P((Object)hvd);
            final boolean p9 = h.P((Object)jjq2);
            final Object y2 = h.y();
            Object o;
            if ((p8 | p9) || (o = y2) == b3) {
                o = new m4s$d(hvd, jjq2, (mp6)null);
                h.p(o);
            }
            h.O();
            shw.h((Object)hvd, (hub)o, h);
            float n14;
            if (jjq2.isEmpty() ^ true) {
                n14 = m4s.k;
            }
            else {
                n14 = m4s.j;
            }
            final l9r b4 = j4s.b(b2, b, h);
            final dlh.a companion = dlh.Companion;
            Objects.requireNonNull(ex.Companion);
            final dlh g = heq.g(qb2.e((dlh)companion, (ex)ex$a.f));
            h.x(1157296644);
            final boolean p10 = h.P((Object)b4);
            final Object y3 = h.y();
            Object o2;
            if (p10 || (o2 = y3) == b3) {
                o2 = new stb<wd9, vzv>(b4) {
                    public final l9r<sr4> F0;
                    
                    public final Object invoke(final Object o) {
                        final wd9 wd9 = (wd9)o;
                        e0e.f((Object)wd9, "$this$Canvas");
                        final long a = ((sr4)this.F0.getValue()).a;
                        final float a2 = m4s.a;
                        final float t0 = ((rp8)wd9).t0(m4s.a);
                        final float t2 = ((rp8)wd9).t0(m4s.b);
                        final float n = t2 / 2;
                        final long e = kqe.e(n, kgj.e(wd9.B0()));
                        final long e2 = kqe.e(t0 - n, kgj.e(wd9.B0()));
                        Objects.requireNonNull(gmr.Companion);
                        final int a3 = vd9.a;
                        Objects.requireNonNull(wd9.Companion);
                        wd9.Y(a, e, e2, t2, 1, null, 1.0f, null, wd9.a.b);
                        return vzv.a;
                    }
                };
                h.p(o2);
            }
            h.O();
            eh3.a(g, (stb)o2, h, 0);
            final l9r a2 = j4s.a(b2, b, h);
            final dz9 dz9 = (dz9)h.m((df6)ez9.a);
            final float f0 = ((s99)h.m((df6)ez9.b)).F0;
            h.x(-539245361);
            long n15;
            if (sr4.c(c((l9r<sr4>)a2), ((os4)h.m((df6)ps4.a)).l()) && dz9 != null) {
                n15 = dz9.a(((sr4)a2.getValue()).a, f0 + n14, h, 0);
            }
            else {
                n15 = ((sr4)a2.getValue()).a;
            }
            h.O();
            final dlh e = qb2.e((dlh)companion, (ex)ex$a.e);
            h.x(1157296644);
            final boolean p11 = h.P((Object)l9r);
            final Object y4 = h.y();
            Object o3;
            if (p11 || (o3 = y4) == b3) {
                o3 = new stb<rp8, hud>(l9r) {
                    public final l9r<Float> F0;
                    
                    public final Object invoke(final Object o) {
                        e0e.f((Object)o, "$this$offset");
                        return new hud(kqe.d(jb2.B0(((Number)this.F0.getValue()).floatValue()), 0));
                    }
                };
                h.p(o3);
            }
            h.O();
            final dlh l = heq.l(lld.a(jty.O(e, (stb)o3), hvd, o0n.a(false, m4s.d, 0L, h, 54, 4)), m4s.c);
            final xlo a3 = ylo.a;
            kqe.f(p4j.j(qjy.A(l, n14, (asp)a3, 0L, 0L, 24), n15, (asp)a3), h, 0);
        }
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new hub<d86, Integer, vzv>(qb2, b, b2, j4s, l9r, hvd, n) {
                public final qb2 F0;
                public final boolean G0;
                public final boolean H0;
                public final j4s I0;
                public final l9r<Float> J0;
                public final hvd K0;
                public final int L0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final d86 d86 = (d86)o;
                    ((Number)o2).intValue();
                    m4s.b(this.F0, this.G0, this.H0, this.I0, this.J0, this.K0, d86, this.L0 | 0x1);
                    return vzv.a;
                }
            });
        }
    }
    
    public static final long c(final l9r<sr4> l9r) {
        return ((sr4)l9r.getValue()).a;
    }
}
