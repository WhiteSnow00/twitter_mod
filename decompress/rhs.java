import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rhs
{
    public static final float a;
    public static final float b;
    public static final float c;
    
    static {
        a = 20;
        b = 10;
        c = 4;
    }
    
    public static final void a(final sis sis, final stb<? super sis, vzv> stb, final dlh dlh, boolean n, boolean b, final kks kks, hub<? super d86, ? super Integer, vzv> hub, hub<? super d86, ? super Integer, vzv> hub2, hub<? super d86, ? super Integer, vzv> hub3, hub<? super d86, ? super Integer, vzv> hub4, boolean n2, final bgx bgx, final tre tre, final ore ore, final boolean b2, int n3, iuh iuh, final asp asp, final lgs lgs, final d86 d86, final int n4, final int n5, final int n6) {
        e0e.f((Object)sis, "value");
        e0e.f((Object)stb, "onValueChange");
        final d86 h = d86.h(-1576622884);
        int n7;
        if ((n6 & 0x1) != 0x0) {
            n7 = (n4 | 0x6);
        }
        else if ((n4 & 0xE) == 0x0) {
            int n8;
            if (h.P((Object)sis)) {
                n8 = 4;
            }
            else {
                n8 = 2;
            }
            n7 = (n8 | n4);
        }
        else {
            n7 = n4;
        }
        int n9;
        if ((n6 & 0x2) != 0x0) {
            n9 = (n7 | 0x30);
        }
        else {
            n9 = n7;
            if ((n4 & 0x70) == 0x0) {
                int n10;
                if (h.P((Object)stb)) {
                    n10 = 32;
                }
                else {
                    n10 = 16;
                }
                n9 = (n7 | n10);
            }
        }
        final int n11 = n6 & 0x4;
        int n14 = 0;
        Label_0213: {
            int n12;
            if (n11 != 0) {
                n12 = (n9 | 0x180);
            }
            else {
                n12 = n9;
                if ((n4 & 0x380) == 0x0) {
                    int n13;
                    if (h.P((Object)dlh)) {
                        n13 = 256;
                    }
                    else {
                        n13 = 128;
                    }
                    n14 = (n9 | n13);
                    break Label_0213;
                }
            }
            n14 = n12;
        }
        final int n15 = n6 & 0x8;
        int n18 = 0;
        Label_0287: {
            int n16;
            if (n15 != 0) {
                n16 = (n14 | 0xC00);
            }
            else {
                n16 = n14;
                if ((n4 & 0x1C00) == 0x0) {
                    int n17;
                    if (h.a((boolean)(n != 0))) {
                        n17 = 2048;
                    }
                    else {
                        n17 = 1024;
                    }
                    n18 = (n14 | n17);
                    break Label_0287;
                }
            }
            n18 = n16;
        }
        final int n19 = n6 & 0x10;
        int n22 = 0;
        Label_0361: {
            int n20;
            if (n19 != 0) {
                n20 = (n18 | 0x6000);
            }
            else {
                n20 = n18;
                if ((n4 & 0xE000) == 0x0) {
                    int n21;
                    if (h.a(b)) {
                        n21 = 16384;
                    }
                    else {
                        n21 = 8192;
                    }
                    n22 = (n18 | n21);
                    break Label_0361;
                }
            }
            n22 = n20;
        }
        if ((n4 & 0x70000) == 0x0) {
            int n23;
            if ((n6 & 0x20) == 0x0 && h.P((Object)kks)) {
                n23 = 131072;
            }
            else {
                n23 = 65536;
            }
            n22 |= n23;
        }
        final int n24 = n6 & 0x40;
        int n25;
        if (n24 != 0) {
            n25 = (n22 | 0x180000);
        }
        else {
            n25 = n22;
            if ((n4 & 0x380000) == 0x0) {
                int n26;
                if (h.P((Object)hub)) {
                    n26 = 1048576;
                }
                else {
                    n26 = 524288;
                }
                n25 = (n22 | n26);
            }
        }
        final int n27 = n6 & 0x80;
        int n28;
        if (n27 != 0) {
            n28 = (n25 | 0xC00000);
        }
        else {
            n28 = n25;
            if ((n4 & 0x1C00000) == 0x0) {
                int n29;
                if (h.P((Object)hub2)) {
                    n29 = 8388608;
                }
                else {
                    n29 = 4194304;
                }
                n28 = (n25 | n29);
            }
        }
        final int n30 = n6 & 0x100;
        int n31;
        if (n30 != 0) {
            n31 = (n28 | 0x6000000);
        }
        else {
            n31 = n28;
            if ((n4 & 0xE000000) == 0x0) {
                int n32;
                if (h.P((Object)hub3)) {
                    n32 = 67108864;
                }
                else {
                    n32 = 33554432;
                }
                n31 = (n28 | n32);
            }
        }
        final int n33 = n6 & 0x200;
        int n34;
        if (n33 != 0) {
            n34 = (n31 | 0x30000000);
        }
        else {
            n34 = n31;
            if ((n4 & 0x70000000) == 0x0) {
                int n35;
                if (h.P((Object)hub4)) {
                    n35 = 536870912;
                }
                else {
                    n35 = 268435456;
                }
                n34 = (n31 | n35);
            }
        }
        final int n36 = n6 & 0x400;
        int n37;
        if (n36 != 0) {
            n37 = (n5 | 0x6);
        }
        else if ((n5 & 0xE) == 0x0) {
            int n38;
            if (h.a((boolean)(n2 != 0))) {
                n38 = 4;
            }
            else {
                n38 = 2;
            }
            n37 = (n5 | n38);
        }
        else {
            n37 = n5;
        }
        final int n39 = n6 & 0x800;
        int n40;
        if (n39 != 0) {
            n40 = (n37 | 0x30);
        }
        else {
            n40 = n37;
            if ((n5 & 0x70) == 0x0) {
                int n41;
                if (h.P((Object)bgx)) {
                    n41 = 32;
                }
                else {
                    n41 = 16;
                }
                n40 = (n37 | n41);
            }
        }
        if ((n5 & 0x380) == 0x0) {
            int n42;
            if ((n6 & 0x1000) == 0x0 && h.P((Object)tre)) {
                n42 = 256;
            }
            else {
                n42 = 128;
            }
            n40 |= n42;
        }
        if ((n5 & 0x1C00) == 0x0) {
            int n43;
            if ((n6 & 0x2000) == 0x0 && h.P((Object)ore)) {
                n43 = 2048;
            }
            else {
                n43 = 1024;
            }
            n40 |= n43;
        }
        final int n44 = n40;
        final int n45 = n6 & 0x4000;
        int n46;
        if (n45 != 0) {
            n46 = (n44 | 0x6000);
        }
        else {
            n46 = n44;
            if ((n5 & 0xE000) == 0x0) {
                int n47;
                if (h.a(b2)) {
                    n47 = 16384;
                }
                else {
                    n47 = 8192;
                }
                n46 = (n44 | n47);
            }
        }
        final int n48 = n6 & 0x8000;
        int n49;
        if (n48 != 0) {
            n49 = (n46 | 0x30000);
        }
        else {
            n49 = n46;
            if ((n5 & 0x70000) == 0x0) {
                int n50;
                if (h.d(n3)) {
                    n50 = 131072;
                }
                else {
                    n50 = 65536;
                }
                n49 = (n46 | n50);
            }
        }
        final int n51 = n6 & 0x10000;
        int n52;
        if (n51 != 0) {
            n52 = (n49 | 0x180000);
        }
        else {
            n52 = n49;
            if ((n5 & 0x380000) == 0x0) {
                int n53;
                if (h.P((Object)iuh)) {
                    n53 = 1048576;
                }
                else {
                    n53 = 524288;
                }
                n52 = (n49 | n53);
            }
        }
        int n55;
        if ((n5 & 0x1C00000) == 0x0) {
            int n54;
            if ((n6 & 0x20000) == 0x0 && h.P((Object)asp)) {
                n54 = 8388608;
            }
            else {
                n54 = 4194304;
            }
            n55 = (n52 | n54);
        }
        else {
            n55 = n52;
        }
        if ((n5 & 0xE000000) == 0x0) {
            int n56;
            if ((n6 & 0x40000) == 0x0 && h.P((Object)lgs)) {
                n56 = 67108864;
            }
            else {
                n56 = 33554432;
            }
            n55 |= n56;
        }
        kks kks2;
        hub<? super d86, ? super Integer, vzv> hub6;
        bgx bgx2;
        dlh dlh2;
        hub<? super d86, ? super Integer, vzv> hub7;
        hub<? super d86, ? super Integer, vzv> hub8;
        hub<? super d86, ? super Integer, vzv> hub9;
        tre tre2;
        ore ore2;
        int n57;
        iuh iuh2;
        asp asp2;
        lgs b3;
        if ((n34 & 0x5B6DB6DB) == 0x12492492 && (0xB6DB6DB & n55) == 0x2492492 && h.i()) {
            h.H();
            kks2 = kks;
            final hub<? super d86, ? super Integer, vzv> hub5 = hub3;
            hub6 = hub4;
            bgx2 = bgx;
            dlh2 = dlh;
            hub7 = hub;
            hub8 = hub2;
            hub9 = hub5;
            tre2 = tre;
            ore2 = ore;
            n57 = (b2 ? 1 : 0);
            iuh2 = iuh;
            asp2 = asp;
            b3 = lgs;
        }
        else {
            h.C();
            int n58;
            int n63;
            asp asp3;
            dlh dlh3;
            boolean b4;
            int n64;
            if ((n4 & 0x1) != 0x0 && !h.K()) {
                h.H();
                n58 = n34;
                if ((n6 & 0x20) != 0x0) {
                    n58 = (n34 & 0xFFF8FFFF);
                }
                int n59 = n55;
                if ((n6 & 0x1000) != 0x0) {
                    n59 = (n55 & 0xFFFFFC7F);
                }
                int n60 = n59;
                if ((n6 & 0x2000) != 0x0) {
                    n60 = (n59 & 0xFFFFE3FF);
                }
                int n61 = n60;
                if ((n6 & 0x20000) != 0x0) {
                    n61 = (n60 & 0xFE3FFFFF);
                }
                int n62 = n61;
                if ((0x40000 & n6) != 0x0) {
                    n62 = (n61 & 0xF1FFFFFF);
                }
                kks2 = kks;
                final hub<? super d86, ? super Integer, vzv> hub10 = hub;
                final hub<? super d86, ? super Integer, vzv> hub11 = hub3;
                bgx2 = bgx;
                b3 = lgs;
                n63 = n62;
                asp3 = asp;
                dlh3 = dlh;
                b4 = b;
                hub7 = hub10;
                hub8 = hub2;
                hub9 = hub11;
                tre2 = tre;
                ore2 = ore;
                n64 = (b2 ? 1 : 0);
            }
            else {
                Object companion;
                if (n11 != 0) {
                    companion = dlh.Companion;
                }
                else {
                    companion = dlh;
                }
                if (n15 != 0) {
                    n = (true ? 1 : 0);
                }
                boolean b5;
                if (n19 != 0) {
                    b5 = false;
                }
                else {
                    b5 = b;
                }
                if ((n6 & 0x20) != 0x0) {
                    kks2 = (kks)h.m((df6)jjs.a);
                    n34 &= 0xFFF8FFFF;
                }
                else {
                    kks2 = kks;
                }
                hub<? super d86, ? super Integer, vzv> hub12;
                if (n24 != 0) {
                    hub12 = null;
                }
                else {
                    hub12 = hub;
                }
                if (n27 != 0) {
                    hub = null;
                }
                else {
                    hub = hub2;
                }
                if (n30 != 0) {
                    hub2 = null;
                }
                else {
                    hub2 = hub3;
                }
                if (n33 != 0) {
                    hub3 = null;
                }
                else {
                    hub3 = hub4;
                }
                int n65;
                if (n36 != 0) {
                    n65 = 0;
                }
                else {
                    n65 = n2;
                }
                Object a;
                if (n39 != 0) {
                    Objects.requireNonNull(bgx.Companion);
                    a = bgx$a.bgx$a$a.a;
                }
                else {
                    a = bgx;
                }
                tre e;
                if ((n6 & 0x1000) != 0x0) {
                    Objects.requireNonNull(tre.Companion);
                    e = tre.e;
                    n55 &= 0xFFFFFC7F;
                }
                else {
                    e = tre;
                }
                ore ore3;
                if ((n6 & 0x2000) != 0x0) {
                    ore3 = new ore(null, null, 63);
                    n55 &= 0xFFFFE3FF;
                }
                else {
                    ore3 = ore;
                }
                final boolean b6 = n45 == 0 && b2;
                if (n48 != 0) {
                    n3 = Integer.MAX_VALUE;
                }
                iuh iuh3;
                if (n51 != 0) {
                    h.x(-492369756);
                    final Object y = h.y();
                    Objects.requireNonNull(d86.Companion);
                    Object d87;
                    if ((d87 = y) == d86$a.b) {
                        d87 = zk.d(h);
                    }
                    h.O();
                    iuh3 = (iuh)d87;
                }
                else {
                    iuh3 = iuh;
                }
                Object b7;
                if ((n6 & 0x20000) != 0x0) {
                    final rgs a2 = rgs.a;
                    final sa6$b a3 = sa6.a;
                    final sy6 a4 = ((wsp)h.m((df6)xsp.a)).a;
                    final xy6$a a5 = xy6.a;
                    b7 = a4.b(a4.a, a4.b, (wy6)a5, (wy6)a5);
                    n55 &= 0xFE3FFFFF;
                }
                else {
                    b7 = asp;
                }
                if ((0x40000 & n6) != 0x0) {
                    b3 = rgs.a.b(0L, 0L, 0L, 0L, h, 2097151);
                    n55 &= 0xF1FFFFFF;
                }
                else {
                    b3 = lgs;
                }
                final ore ore4 = ore3;
                final hub<? super d86, ? super Integer, vzv> hub13 = hub3;
                b4 = b5;
                bgx2 = (bgx)a;
                final tre tre3 = e;
                final boolean b8 = b6;
                hub9 = hub2;
                final iuh iuh4 = iuh3;
                n2 = n65;
                final hub<? super d86, ? super Integer, vzv> hub14 = hub;
                final Object o = b7;
                n58 = n34;
                final hub<? super d86, ? super Integer, vzv> hub15 = hub12;
                dlh3 = (dlh)companion;
                n64 = (b8 ? 1 : 0);
                ore2 = ore4;
                tre2 = tre3;
                hub4 = hub13;
                hub8 = hub14;
                hub7 = hub15;
                n63 = n55;
                iuh = iuh4;
                asp3 = (asp)o;
            }
            h.s();
            final sa6$b a6 = sa6.a;
            h.x(-833020145);
            long n66 = kks2.d();
            Objects.requireNonNull(sr4.Companion);
            if (n66 == sr4.g) {
                n66 = ((sr4)b3.f((boolean)(n != 0), h).getValue()).a;
            }
            h.O();
            final kks e2 = kks2.e(new kks(n66, 0L, (qlb)null, (mlb)null, (qkb)null, 0L, (xfs)null, (efs)null, 0L, 262142));
            final rgs a7 = rgs.a;
            final dlh j = p4j.j(dlh3, ((sr4)b3.b(h).getValue()).a, asp3);
            final float e3 = rgs.e;
            final float d88 = rgs.d;
            e0e.f((Object)j, "$this$indicatorLine");
            e0e.f((Object)iuh, "interactionSource");
            final ysd$a a8 = ysd.a;
            final dlh d89 = heq.d(c86.a(j, (stb<? super btd, vzv>)ysd.a, (kub<? super dlh, ? super d86, ? super Integer, ? extends dlh>)new sgs((boolean)(n != 0), (boolean)(n2 != 0), (hvd)iuh, b3, e3, d88)), rgs.c, rgs.b);
            final jmq jmq = new jmq(((sr4)b3.g((boolean)(n2 != 0), h).getValue()).a);
            final y36 i = w9y.i(h, -2078585677, new kub<hub<? super d86, ? super Integer, ? extends vzv>, d86, Integer, vzv>(sis, n, n64, bgx2, iuh, n2, hub7, hub8, hub9, hub4, b3, n58, n63) {
                public final sis F0;
                public final boolean G0;
                public final boolean H0;
                public final bgx I0;
                public final iuh J0;
                public final boolean K0;
                public final hub<d86, Integer, vzv> L0;
                public final hub<d86, Integer, vzv> M0;
                public final hub<d86, Integer, vzv> N0;
                public final hub<d86, Integer, vzv> O0;
                public final lgs P0;
                public final int Q0;
                public final int R0;
                
                public final Object h0(final Object o, final Object o2, final Object o3) {
                    final hub hub = (hub)o;
                    final d86 d86 = (d86)o2;
                    final int intValue = ((Number)o3).intValue();
                    e0e.f((Object)hub, "innerTextField");
                    int n = intValue;
                    if ((intValue & 0xE) == 0x0) {
                        int n2;
                        if (d86.P((Object)hub)) {
                            n2 = 4;
                        }
                        else {
                            n2 = 2;
                        }
                        n = (intValue | n2);
                    }
                    if ((n & 0x5B) == 0x12 && d86.i()) {
                        d86.H();
                    }
                    else {
                        final sa6$b a = sa6.a;
                        final rgs a2 = rgs.a;
                        final String f0 = this.F0.a.F0;
                        final boolean g0 = this.G0;
                        final boolean h0 = this.H0;
                        final bgx i0 = this.I0;
                        final iuh j0 = this.J0;
                        final boolean k0 = this.K0;
                        final hub<d86, Integer, vzv> l0 = this.L0;
                        final hub<d86, Integer, vzv> m0 = this.M0;
                        final hub<d86, Integer, vzv> n3 = this.N0;
                        final hub<d86, Integer, vzv> o4 = this.O0;
                        final lgs p3 = this.P0;
                        final int q0 = this.Q0;
                        final int r0 = this.R0;
                        final int n4 = r0 >> 3;
                        final int n5 = q0 << 3;
                        a2.a(f0, (hub<? super d86, ? super Integer, vzv>)hub, g0, h0, i0, (hvd)j0, k0, l0, m0, n3, o4, p3, null, d86, (n4 & 0x70000) | ((q0 >> 3 & 0x380) | (n << 3 & 0x70) | (n4 & 0x1C00) | (r0 << 9 & 0xE000)) | (0x380000 & r0 << 18) | (0x1C00000 & n5) | (0xE000000 & n5) | (0x70000000 & n5), (q0 >> 27 & 0xE) | 0xC00 | (r0 >> 21 & 0x70), 4096);
                    }
                    return vzv.a;
                }
            });
            final int n67 = n63 << 12;
            final ore.a companion2 = ore.Companion;
            qs1.a(sis, (stb)stb, d89, (boolean)(n != 0), b4, e2, tre2, ore2, (boolean)(n64 != 0), n3, bgx2, (stb)null, iuh, (wq2)jmq, (kub)i, h, (n58 & 0xE000) | ((n58 & 0xE) | (n58 & 0x70) | (n58 & 0x1C00)) | (n67 & 0x380000) | 0x0 | (n67 & 0x1C00000) | (n67 & 0xE000000) | (n67 & 0x70000000), (n63 >> 3 & 0xE) | 0x6000 | (n63 >> 12 & 0x380), 2048);
            final asp asp4 = asp3;
            final iuh iuh5 = iuh;
            final dlh dlh4 = dlh3;
            asp2 = asp4;
            iuh2 = iuh5;
            n57 = n64;
            hub6 = hub4;
            b = b4;
            dlh2 = dlh4;
        }
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new hub<d86, Integer, vzv>(sis, stb, dlh2, n, b, kks2, hub7, hub8, hub9, hub6, n2, bgx2, tre2, ore2, n57, n3, iuh2, asp2, b3, n4, n5, n6) {
                public final sis F0;
                public final stb<sis, vzv> G0;
                public final dlh H0;
                public final boolean I0;
                public final boolean J0;
                public final kks K0;
                public final hub<d86, Integer, vzv> L0;
                public final hub<d86, Integer, vzv> M0;
                public final hub<d86, Integer, vzv> N0;
                public final hub<d86, Integer, vzv> O0;
                public final boolean P0;
                public final bgx Q0;
                public final tre R0;
                public final ore S0;
                public final boolean T0;
                public final int U0;
                public final iuh V0;
                public final asp W0;
                public final lgs X0;
                public final int Y0;
                public final int Z0;
                public final int a1;
                
                public final Object invoke(final Object o, final Object o2) {
                    final d86 d86 = (d86)o;
                    ((Number)o2).intValue();
                    rhs.a(this.F0, this.G0, this.H0, this.I0, this.J0, this.K0, this.L0, this.M0, this.N0, this.O0, this.P0, this.Q0, this.R0, this.S0, this.T0, this.U0, this.V0, this.W0, this.X0, d86, this.Y0 | 0x1, this.Z0, this.a1);
                    return vzv.a;
                }
            });
        }
    }
    
    public static final void b(final dlh dlh, final hub<? super d86, ? super Integer, vzv> hub, final hub<? super d86, ? super Integer, vzv> hub2, final kub<? super dlh, ? super d86, ? super Integer, vzv> kub, final hub<? super d86, ? super Integer, vzv> hub3, final hub<? super d86, ? super Integer, vzv> hub4, final boolean b, final float n, final osj osj, final d86 d86, final int n2) {
        e0e.f((Object)dlh, "modifier");
        e0e.f((Object)hub, "textField");
        e0e.f((Object)osj, "paddingValues");
        final d86 h = d86.h(-2112507061);
        int n4;
        if ((n2 & 0xE) == 0x0) {
            int n3;
            if (h.P((Object)dlh)) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n3 | n2);
        }
        else {
            n4 = n2;
        }
        int n5 = n4;
        if ((n2 & 0x70) == 0x0) {
            int n6;
            if (h.P((Object)hub)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n5 = (n4 | n6);
        }
        int n7 = n5;
        if ((n2 & 0x380) == 0x0) {
            int n8;
            if (h.P((Object)hub2)) {
                n8 = 256;
            }
            else {
                n8 = 128;
            }
            n7 = (n5 | n8);
        }
        int n9 = n7;
        if ((n2 & 0x1C00) == 0x0) {
            int n10;
            if (h.P((Object)kub)) {
                n10 = 2048;
            }
            else {
                n10 = 1024;
            }
            n9 = (n7 | n10);
        }
        int n11 = n9;
        if ((0xE000 & n2) == 0x0) {
            int n12;
            if (h.P((Object)hub3)) {
                n12 = 16384;
            }
            else {
                n12 = 8192;
            }
            n11 = (n9 | n12);
        }
        int n13 = n11;
        if ((0x70000 & n2) == 0x0) {
            int n14;
            if (h.P((Object)hub4)) {
                n14 = 131072;
            }
            else {
                n14 = 65536;
            }
            n13 = (n11 | n14);
        }
        int n15 = n13;
        if ((0x380000 & n2) == 0x0) {
            int n16;
            if (h.a(b)) {
                n16 = 1048576;
            }
            else {
                n16 = 524288;
            }
            n15 = (n13 | n16);
        }
        int n17 = n15;
        if ((0x1C00000 & n2) == 0x0) {
            int n18;
            if (h.b(n)) {
                n18 = 8388608;
            }
            else {
                n18 = 4194304;
            }
            n17 = (n15 | n18);
        }
        int n19 = n17;
        if ((0xE000000 & n2) == 0x0) {
            int n20;
            if (h.P((Object)osj)) {
                n20 = 67108864;
            }
            else {
                n20 = 33554432;
            }
            n19 = (n17 | n20);
        }
        if ((n19 & 0xB6DB6DB) == 0x2492492 && h.i()) {
            h.H();
        }
        else {
            final sa6$b a = sa6.a;
            h.x(1618982084);
            final boolean p11 = h.P((Object)b);
            final boolean p12 = h.P((Object)n);
            final boolean p13 = h.P((Object)osj);
            final Object y = h.y();
            ths ths = null;
            Label_0567: {
                if (!(p11 | p12 | p13)) {
                    Objects.requireNonNull(d86.Companion);
                    if ((ths = (ths)y) != d86$a.b) {
                        break Label_0567;
                    }
                }
                ths = new ths(b, n, osj);
                h.p((Object)ths);
            }
            h.O();
            final ths ths2 = ths;
            final gbr k = ff6.k;
            final cwe cwe = (cwe)h.m((df6)k);
            h.x(-1323940314);
            final gbr e = ff6.e;
            final rp8 rp8 = (rp8)h.m((df6)e);
            final cwe cwe2 = (cwe)h.m((df6)k);
            final gbr o = ff6.o;
            final l7x l7x = (l7x)h.m((df6)o);
            Objects.requireNonNull(w76.Companion);
            final swe$a b2 = w76.a.b;
            final kub<weq<w76>, d86, Integer, vzv> a2 = lwe.a(dlh);
            final int n21 = ((n19 << 3 & 0x70) << 9 & 0x1C00) | 0x6;
            if (!(h.j() instanceof tr0)) {
                kqe.W();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((ptb)b2);
            }
            else {
                h.o();
            }
            h.F();
            final w76$a$c e2 = w76.a.e;
            jty.X(h, ths2, (hub)e2);
            final w76$a$a d87 = w76.a.d;
            jty.X(h, rp8, (hub)d87);
            final w76$a$b f = w76.a.f;
            jty.X(h, cwe2, (hub)f);
            final w76$a$e g = w76.a.g;
            ((z36)a2).h0((Object)af.y(h, l7x, g, h), (Object)h, (Object)(n21 >> 3 & 0x70));
            h.x(2058660585);
            h.x(642667778);
            if ((n21 >> 9 & 0xE & 0xB) == 0x2 && h.i()) {
                h.H();
            }
            else {
                h.x(254816194);
                if (hub3 != null) {
                    final dlh e3 = egz.t((dlh)dlh.Companion, "Leading").E(dhs.d);
                    Objects.requireNonNull(ex.Companion);
                    final zqg s = z9a.s(h, 733328855, ex$a.f, false, h, -1323940314);
                    final rp8 rp9 = (rp8)h.m((df6)e);
                    final cwe cwe3 = (cwe)h.m((df6)k);
                    final l7x l7x2 = (l7x)h.m((df6)o);
                    final kub<weq<w76>, d86, Integer, vzv> a3 = lwe.a(e3);
                    if (!(h.j() instanceof tr0)) {
                        kqe.W();
                        throw null;
                    }
                    h.E();
                    if (h.f()) {
                        h.A((ptb)b2);
                    }
                    else {
                        h.o();
                    }
                    ((z36)a3).h0((Object)mw.y(h, h, s, e2, h, rp9, d87, h, cwe3, f, h, l7x2, g, h), (Object)h, (Object)0);
                    zk.C(h, 2058660585, -2137368960, 822730659);
                    hub3.invoke((Object)h, (Object)(n19 >> 12 & 0xE));
                    h.O();
                    h.O();
                    h.O();
                    h.r();
                    h.O();
                    h.O();
                }
                h.O();
                h.x(254816479);
                if (hub4 != null) {
                    final dlh e4 = egz.t((dlh)dlh.Companion, "Trailing").E(dhs.d);
                    Objects.requireNonNull(ex.Companion);
                    final zqg s2 = z9a.s(h, 733328855, ex$a.f, false, h, -1323940314);
                    final rp8 rp10 = (rp8)h.m((df6)e);
                    final cwe cwe4 = (cwe)h.m((df6)k);
                    final l7x l7x3 = (l7x)h.m((df6)o);
                    final kub<weq<w76>, d86, Integer, vzv> a4 = lwe.a(e4);
                    if (!(h.j() instanceof tr0)) {
                        kqe.W();
                        throw null;
                    }
                    h.E();
                    if (h.f()) {
                        h.A((ptb)b2);
                    }
                    else {
                        h.o();
                    }
                    ((z36)a4).h0((Object)mw.y(h, h, s2, e2, h, rp10, d87, h, cwe4, f, h, l7x3, g, h), (Object)h, (Object)0);
                    zk.C(h, 2058660585, -2137368960, -1007916070);
                    hub4.invoke((Object)h, (Object)(n19 >> 15 & 0xE));
                    h.O();
                    h.O();
                    h.O();
                    h.r();
                    h.O();
                    h.O();
                }
                h.O();
                float y2 = zzz.y(osj, cwe);
                final float x = zzz.x(osj, cwe);
                final dlh.a companion = dlh.Companion;
                float n24 = 0.0f;
                Label_1567: {
                    if (hub3 != null) {
                        final float n22 = y2 - dhs.c;
                        final float n23 = 0;
                        y2 = n22;
                        if (n22 < n23) {
                            n24 = n23;
                            break Label_1567;
                        }
                    }
                    n24 = y2;
                }
                float n25 = x;
                if (hub4 != null) {
                    final float n26 = x - dhs.c;
                    final float n27 = 0;
                    n25 = n26;
                    if (n26 < n27) {
                        n25 = n27;
                    }
                }
                final dlh d88 = zzz.d0((dlh)companion, n24, 0.0f, n25, 0.0f, 10);
                h.x(254817490);
                if (kub != null) {
                    kub.h0((Object)egz.t((dlh)companion, "Hint").E(d88), (Object)h, (Object)(n19 >> 6 & 0x70));
                }
                h.O();
                h.x(254817619);
                if (hub2 != null) {
                    final dlh e5 = egz.t((dlh)companion, "Label").E(d88);
                    h.x(733328855);
                    Objects.requireNonNull(ex.Companion);
                    final zqg d89 = ob2.d((ex)ex$a.b, false, h);
                    h.x(-1323940314);
                    final rp8 rp11 = (rp8)h.m((df6)e);
                    final cwe cwe5 = (cwe)h.m((df6)k);
                    final l7x l7x4 = (l7x)h.m((df6)o);
                    final kub<weq<w76>, d86, Integer, vzv> a5 = lwe.a(e5);
                    if (!(h.j() instanceof tr0)) {
                        kqe.W();
                        throw null;
                    }
                    h.E();
                    if (h.f()) {
                        h.A((ptb)b2);
                    }
                    else {
                        h.o();
                    }
                    ((z36)a5).h0((Object)mw.y(h, h, d89, e2, h, rp11, d87, h, cwe5, f, h, l7x4, g, h), (Object)h, (Object)0);
                    zk.C(h, 2058660585, -2137368960, 1319246300);
                    hub2.invoke((Object)h, (Object)(n19 >> 6 & 0xE));
                    h.O();
                    h.O();
                    h.O();
                    h.r();
                    h.O();
                    h.O();
                }
                h.O();
                final dlh e6 = egz.t((dlh)companion, "TextField").E(d88);
                h.x(733328855);
                Objects.requireNonNull(ex.Companion);
                final zqg d90 = ob2.d((ex)ex$a.b, true, h);
                h.x(-1323940314);
                final rp8 rp12 = (rp8)h.m((df6)e);
                final cwe cwe6 = (cwe)h.m((df6)k);
                final l7x l7x5 = (l7x)h.m((df6)o);
                final kub<weq<w76>, d86, Integer, vzv> a6 = lwe.a(e6);
                if (!(h.j() instanceof tr0)) {
                    kqe.W();
                    throw null;
                }
                h.E();
                if (h.f()) {
                    h.A((ptb)b2);
                }
                else {
                    h.o();
                }
                ((z36)a6).h0((Object)mw.y(h, h, d90, e2, h, rp12, d87, h, cwe6, f, h, l7x5, g, h), (Object)h, (Object)0);
                zk.C(h, 2058660585, -2137368960, -2048931960);
                hub.invoke((Object)h, (Object)(n19 >> 3 & 0xE));
                h.O();
                h.O();
                h.O();
                h.r();
                h.O();
                h.O();
            }
            h.O();
            h.O();
            h.r();
            h.O();
        }
        final gyo i = h.k();
        if (i != null) {
            i.a((hub)new hub<d86, Integer, vzv>(dlh, hub, hub2, kub, hub3, hub4, b, n, osj, n2) {
                public final dlh F0;
                public final hub<d86, Integer, vzv> G0;
                public final hub<d86, Integer, vzv> H0;
                public final kub<dlh, d86, Integer, vzv> I0;
                public final hub<d86, Integer, vzv> J0;
                public final hub<d86, Integer, vzv> K0;
                public final boolean L0;
                public final float M0;
                public final osj N0;
                public final int O0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final d86 d86 = (d86)o;
                    ((Number)o2).intValue();
                    rhs.b(this.F0, this.G0, this.H0, this.I0, this.J0, this.K0, this.L0, this.M0, this.N0, d86, this.O0 | 0x1);
                    return vzv.a;
                }
            });
        }
    }
    
    public static final int c(int max, final boolean b, final int n, final int n2, final int n3, final int n4, final long n5, float n6, final osj osj) {
        final float c = rhs.c;
        final float d = osj.d();
        final float n7 = osj.a() * n6;
        max = Math.max(max, n4);
        if (b) {
            n6 = n + c * n6 + max + n7;
        }
        else {
            n6 = d * n6 + max + n7;
        }
        return Math.max(jb2.B0(n6), Math.max(Math.max(n2, n3), vj6.i(n5)));
    }
}
