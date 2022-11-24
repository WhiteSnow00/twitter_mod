import java.util.Objects;
import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n8b
{
    public static final void a(final dlh dlh, final ixe ixe, final ieq ieq, final jhg jhg, final float n, final k8b k8b, final float n2, final jhg jhg2, final hub<? super d86, ? super Integer, vzv> hub, d86 h, final int n3) {
        h = h.h(-1567419051);
        int n5;
        if ((n3 & 0xE) == 0x0) {
            int n4;
            if (h.P((Object)dlh)) {
                n4 = 4;
            }
            else {
                n4 = 2;
            }
            n5 = (n4 | n3);
        }
        else {
            n5 = n3;
        }
        if ((n3 & 0x70) == 0x0) {
            int n6;
            if (h.P((Object)ixe)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n5 |= n6;
        }
        int n8;
        if ((n3 & 0x380) == 0x0) {
            int n7;
            if (h.P((Object)ieq)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n8 = (n5 | n7);
        }
        else {
            n8 = n5;
        }
        if ((n3 & 0x1C00) == 0x0) {
            int n9;
            if (h.P((Object)jhg)) {
                n9 = 2048;
            }
            else {
                n9 = 1024;
            }
            n8 |= n9;
        }
        if ((0xE000 & n3) == 0x0) {
            int n10;
            if (h.b(n)) {
                n10 = 16384;
            }
            else {
                n10 = 8192;
            }
            n8 |= n10;
        }
        if ((0x70000 & n3) == 0x0) {
            int n11;
            if (h.P((Object)k8b)) {
                n11 = 131072;
            }
            else {
                n11 = 65536;
            }
            n8 |= n11;
        }
        if ((0x380000 & n3) == 0x0) {
            int n12;
            if (h.b(n2)) {
                n12 = 1048576;
            }
            else {
                n12 = 524288;
            }
            n8 |= n12;
        }
        int n13 = n8;
        if ((0x1C00000 & n3) == 0x0) {
            int n14;
            if (h.P((Object)jhg2)) {
                n14 = 8388608;
            }
            else {
                n14 = 4194304;
            }
            n13 = (n8 | n14);
        }
        int n15 = n13;
        if ((0xE000000 & n3) == 0x0) {
            int n16;
            if (h.P((Object)hub)) {
                n16 = 67108864;
            }
            else {
                n16 = 33554432;
            }
            n15 = (n13 | n16);
        }
        if ((0xB6DB6DB & n15) == 0x2492492 && h.i()) {
            h.H();
        }
        else {
            final sa6$b a = sa6.a;
            final zqg zqg = new zqg(ixe, n, ieq, n2, jhg, jhg2, k8b) {
                public final ixe a;
                public final float b;
                public final ieq c;
                public final float d;
                public final jhg e;
                public final jhg f;
                public final k8b g;
                
                public static final void f(final List<List<khk>> list, final c8m c8m, final crg crg, final float n, final List<khk> list2, final List<Integer> list3, final c8m c8m2, final List<Integer> list4, final c8m c8m3, final c8m c8m4) {
                    if (list.isEmpty() ^ true) {
                        c8m.F0 += ((rp8)crg).S(n);
                    }
                    list.add((Object)rr4.i2((Iterable)list2));
                    list3.add(c8m2.F0);
                    list4.add(c8m.F0);
                    c8m.F0 += c8m2.F0;
                    c8m3.F0 = Math.max(c8m3.F0, c8m4.F0);
                    list2.clear();
                    c8m4.F0 = 0;
                    c8m2.F0 = 0;
                }
                
                @Override
                public final int a(final b0e b0e, final List list, final int n) {
                    return go9.e((zqg)this, b0e, list, n);
                }
                
                @Override
                public final arg b(final crg crg, final List<? extends wqg> list, long n) {
                    final ixe f0 = ixe.F0;
                    e0e.f((Object)crg, "$this$Layout");
                    e0e.f((Object)list, "measurables");
                    final ArrayList list2 = new ArrayList();
                    final ArrayList list3 = new ArrayList();
                    final ArrayList list4 = new ArrayList();
                    final c8m c8m = new c8m();
                    final c8m c8m2 = new c8m();
                    final ArrayList list5 = new ArrayList();
                    final c8m c8m3 = new c8m();
                    final c8m c8m4 = new c8m();
                    final ixe a = this.a;
                    int n2;
                    if (a == f0) {
                        n2 = vj6.j(n);
                    }
                    else {
                        n2 = vj6.i(n);
                    }
                    final int n3 = n2;
                    int n4;
                    if (a == f0) {
                        n4 = vj6.h(n);
                    }
                    else {
                        n4 = vj6.g(n);
                    }
                    int n5;
                    if (a == f0) {
                        n5 = vj6.i(n);
                    }
                    else {
                        n5 = vj6.j(n);
                    }
                    if (a == f0) {
                        vj6.g(n);
                    }
                    else {
                        vj6.h(n);
                    }
                    if (this.a == f0) {
                        n = xd.m(n4, 0, 13);
                    }
                    else {
                        n = xd.m(0, n4, 7);
                    }
                    final Iterator<? extends wqg> iterator = list.iterator();
                    final c8m c8m5 = c8m;
                    final c8m c8m6 = c8m2;
                    while (iterator.hasNext()) {
                        final khk w = ((wqg)iterator.next()).W(n);
                        final float b = this.b;
                        final ixe a2 = this.a;
                        boolean b2 = false;
                        Label_0348: {
                            if (!list5.isEmpty()) {
                                final int f2 = c8m3.F0;
                                final int s = ((rp8)crg).S(b);
                                int n6;
                                if (a2 == f0) {
                                    n6 = w.F0;
                                }
                                else {
                                    n6 = w.G0;
                                }
                                if (s + f2 + n6 > n4) {
                                    b2 = false;
                                    break Label_0348;
                                }
                            }
                            b2 = true;
                        }
                        if (!b2) {
                            f(list2, c8m6, crg, this.d, list5, list3, c8m4, list4, c8m5, c8m3);
                        }
                        if (list5.isEmpty() ^ true) {
                            c8m3.F0 += ((rp8)crg).S(this.b);
                        }
                        list5.add(w);
                        c8m3.F0 += n8b.d(w, this.a);
                        final int f3 = c8m4.F0;
                        int n7;
                        if (this.a == f0) {
                            n7 = w.G0;
                        }
                        else {
                            n7 = w.F0;
                        }
                        c8m4.F0 = Math.max(f3, n7);
                    }
                    if (list5.isEmpty() ^ true) {
                        f(list2, c8m6, crg, this.d, list5, list3, c8m4, list4, c8m5, c8m3);
                    }
                    if (n4 == Integer.MAX_VALUE || this.c != ieq.G0) {
                        n4 = Math.max(c8m5.F0, n3);
                    }
                    int max = Math.max(c8m6.F0, n5);
                    final ixe a3 = this.a;
                    int n8;
                    if (a3 == f0) {
                        n8 = n4;
                    }
                    else {
                        n8 = max;
                    }
                    if (a3 != f0) {
                        max = n4;
                    }
                    return crg.J(n8, max, (Map)m3a.F0, (stb)new n8b$a$a((List)list2, crg, this.b, this.e, this.f, a3, n4, this.g, (List)list3, (List)list4));
                }
                
                @Override
                public final int c(final b0e b0e, final List list, final int n) {
                    return go9.g((zqg)this, b0e, list, n);
                }
                
                @Override
                public final int d(final b0e b0e, final List list, final int n) {
                    return go9.c((zqg)this, b0e, list, n);
                }
                
                @Override
                public final int e(final b0e b0e, final List list, final int n) {
                    return go9.f((zqg)this, b0e, list, n);
                }
            };
            h.x(-1323940314);
            final rp8 rp8 = (rp8)h.m((df6)ff6.e);
            final cwe cwe = (cwe)h.m((df6)ff6.k);
            final l7x l7x = (l7x)h.m((df6)ff6.o);
            Objects.requireNonNull(w76.Companion);
            final swe$a b = w76.a.b;
            final kub<weq<w76>, d86, Integer, vzv> a2 = lwe.a(dlh);
            final int n17 = (((n15 << 3 & 0x70) | (n15 >> 24 & 0xE)) << 9 & 0x1C00) | 0x6;
            if (!(h.j() instanceof tr0)) {
                kqe.W();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((ptb)b);
            }
            else {
                h.o();
            }
            h.F();
            jty.X(h, zqg, (hub)w76.a.e);
            jty.X(h, rp8, (hub)w76.a.d);
            jty.X(h, cwe, (hub)w76.a.f);
            ((z36)a2).h0((Object)af.y(h, l7x, w76.a.g, h), (Object)h, (Object)(n17 >> 3 & 0x70));
            h.x(2058660585);
            hub.invoke((Object)h, (Object)(n17 >> 9 & 0xE));
            h.O();
            h.r();
            h.O();
        }
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new n8b$b(dlh, ixe, ieq, jhg, n, k8b, n2, jhg2, (hub)hub, n3));
        }
    }
    
    public static final void b(dlh companion, ieq f0, jhg g0, float n, k8b f2, float n2, jhg jhg, final hub<? super d86, ? super Integer, vzv> hub, final d86 d86, final int n3, final int n4) {
        e0e.f((Object)hub, "content");
        final d86 h = d86.h(-137566119);
        final int n5 = n4 & 0x1;
        int n6;
        if (n5 != 0) {
            n6 = (n3 | 0x6);
        }
        else if ((n3 & 0xE) == 0x0) {
            int n7;
            if (h.P((Object)companion)) {
                n7 = 4;
            }
            else {
                n7 = 2;
            }
            n6 = (n7 | n3);
        }
        else {
            n6 = n3;
        }
        final int n8 = n4 & 0x2;
        int n11 = 0;
        Label_0150: {
            int n9;
            if (n8 != 0) {
                n9 = (n6 | 0x30);
            }
            else {
                n9 = n6;
                if ((n3 & 0x70) == 0x0) {
                    int n10;
                    if (h.P((Object)f0)) {
                        n10 = 32;
                    }
                    else {
                        n10 = 16;
                    }
                    n11 = (n6 | n10);
                    break Label_0150;
                }
            }
            n11 = n9;
        }
        final int n12 = n4 & 0x4;
        int n15 = 0;
        Label_0223: {
            int n13;
            if (n12 != 0) {
                n13 = (n11 | 0x180);
            }
            else {
                n13 = n11;
                if ((n3 & 0x380) == 0x0) {
                    int n14;
                    if (h.P((Object)g0)) {
                        n14 = 256;
                    }
                    else {
                        n14 = 128;
                    }
                    n15 = (n11 | n14);
                    break Label_0223;
                }
            }
            n15 = n13;
        }
        final int n16 = n4 & 0x8;
        int n19 = 0;
        Label_0297: {
            int n17;
            if (n16 != 0) {
                n17 = (n15 | 0xC00);
            }
            else {
                n17 = n15;
                if ((n3 & 0x1C00) == 0x0) {
                    int n18;
                    if (h.b(n)) {
                        n18 = 2048;
                    }
                    else {
                        n18 = 1024;
                    }
                    n19 = (n15 | n18);
                    break Label_0297;
                }
            }
            n19 = n17;
        }
        final int n20 = n4 & 0x10;
        int n21;
        if (n20 != 0) {
            n21 = (n19 | 0x6000);
        }
        else {
            n21 = n19;
            if ((n3 & 0xE000) == 0x0) {
                int n22;
                if (h.P((Object)f2)) {
                    n22 = 16384;
                }
                else {
                    n22 = 8192;
                }
                n21 = (n19 | n22);
            }
        }
        final int n23 = n4 & 0x20;
        int n24;
        if (n23 != 0) {
            n24 = (n21 | 0x30000);
        }
        else {
            n24 = n21;
            if ((n3 & 0x70000) == 0x0) {
                int n25;
                if (h.b(n2)) {
                    n25 = 131072;
                }
                else {
                    n25 = 65536;
                }
                n24 = (n21 | n25);
            }
        }
        int n27;
        if ((n3 & 0x380000) == 0x0) {
            int n26;
            if ((n4 & 0x40) == 0x0 && h.P((Object)jhg)) {
                n26 = 1048576;
            }
            else {
                n26 = 524288;
            }
            n27 = (n24 | n26);
        }
        else {
            n27 = n24;
        }
        int n29 = 0;
        Label_0545: {
            int n28;
            if ((n4 & 0x80) != 0x0) {
                n28 = 12582912;
            }
            else {
                n29 = n27;
                if ((n3 & 0x1C00000) != 0x0) {
                    break Label_0545;
                }
                if (h.P((Object)hub)) {
                    n28 = 8388608;
                }
                else {
                    n28 = 4194304;
                }
            }
            n29 = (n27 | n28);
        }
        dlh dlh2;
        ieq ieq2;
        jhg jhg2;
        k8b k8b2;
        float n30;
        jhg jhg3;
        if ((0x16DB6DB & n29) == 0x492492 && h.i()) {
            h.H();
            final dlh dlh = companion;
            final ieq ieq = f0;
            final k8b k8b = f2;
            dlh2 = dlh;
            ieq2 = ieq;
            jhg2 = g0;
            k8b2 = k8b;
            n30 = n2;
            jhg3 = jhg;
        }
        else {
            h.C();
            dlh dlh3;
            k8b k8b4;
            jhg jhg5;
            if ((n3 & 0x1) != 0x0 && !h.K()) {
                h.H();
                int n31 = n29;
                if ((n4 & 0x40) != 0x0) {
                    n31 = (n29 & 0xFFC7FFFF);
                }
                final jhg jhg4 = jhg;
                final float n32 = n;
                n = n2;
                final k8b k8b3 = f2;
                n29 = n31;
                dlh3 = companion;
                ieq2 = f0;
                n2 = n32;
                k8b4 = k8b3;
                jhg5 = jhg4;
            }
            else {
                if (n5 != 0) {
                    companion = (dlh)dlh.Companion;
                }
                if (n8 != 0) {
                    f0 = ieq.F0;
                }
                if (n12 != 0) {
                    g0 = jhg.G0;
                }
                if (n16 != 0) {
                    n = 0;
                }
                if (n20 != 0) {
                    f2 = k8b.F0;
                }
                if (n23 != 0) {
                    n2 = 0;
                }
                if ((n4 & 0x40) != 0x0) {
                    n29 &= 0xFFC7FFFF;
                    jhg = g0;
                }
                final float n33 = n;
                final ieq ieq3 = f0;
                final dlh dlh4 = companion;
                k8b4 = f2;
                n = n2;
                jhg5 = jhg;
                n2 = n33;
                ieq2 = ieq3;
                dlh3 = dlh4;
            }
            h.s();
            final sa6$b a = sa6.a;
            final ixe f3 = ixe.F0;
            final int n34 = n29 << 3;
            a(dlh3, f3, ieq2, g0, n2, k8b4, n, jhg5, hub, h, (n29 & 0xE) | 0x30 | (n34 & 0x380) | (n34 & 0x1C00) | (0xE000 & n34) | (n34 & 0x70000) | (n34 & 0x380000) | (n34 & 0x1C00000) | (n34 & 0xE000000));
            final jhg jhg6 = g0;
            jhg3 = jhg5;
            n30 = n;
            k8b2 = k8b4;
            n = n2;
            jhg2 = jhg6;
            dlh2 = dlh3;
        }
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new n8b$c(dlh2, ieq2, jhg2, n, k8b2, n30, jhg3, (hub)hub, n3, n4));
        }
    }
    
    public static final int c(final khk khk, final ixe ixe) {
        int n;
        if (ixe == ixe.F0) {
            n = khk.G0;
        }
        else {
            n = khk.F0;
        }
        return n;
    }
    
    public static final int d(final khk khk, final ixe ixe) {
        int n;
        if (ixe == ixe.F0) {
            n = khk.F0;
        }
        else {
            n = khk.G0;
        }
        return n;
    }
}
