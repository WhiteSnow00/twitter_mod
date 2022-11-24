import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a2f extends pue implements hub<v0f, vj6, e2f>
{
    public final boolean F0;
    public final osj G0;
    public final boolean H0;
    public final p2f I0;
    public final p1f J0;
    public final gs0$l K0;
    public final gs0$d L0;
    public final n1f M0;
    public final i1f N0;
    public final ex$b O0;
    public final ex$c P0;
    public final krj Q0;
    
    public a2f(final boolean f0, final osj g0, final boolean h0, final p2f i0, final p1f j0, final gs0$l k0, final gs0$d l0, final n1f m0, final i1f n0, final ex$b o0, final ex$c p12, final krj q0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p12;
        this.Q0 = q0;
        super(2);
    }
    
    public final Object invoke(Object value, Object d) {
        final v0f value2 = (v0f)value;
        final long a = ((vj6)d).a;
        final dpj f0 = dpj.F0;
        dpj g0 = dpj.G0;
        e0e.f((Object)value2, "$this$null");
        dpj dpj;
        if (this.F0) {
            dpj = f0;
        }
        else {
            dpj = g0;
        }
        xd.L(a, dpj);
        int n;
        if (this.F0) {
            n = ((rp8)value2).S(this.G0.b(((b0e)value2).getLayoutDirection()));
        }
        else {
            n = ((rp8)value2).S(zzz.y(this.G0, ((b0e)value2).getLayoutDirection()));
        }
        int n2;
        if (this.F0) {
            n2 = ((rp8)value2).S(this.G0.c(((b0e)value2).getLayoutDirection()));
        }
        else {
            n2 = ((rp8)value2).S(zzz.x(this.G0, ((b0e)value2).getLayoutDirection()));
        }
        final int s = ((rp8)value2).S(this.G0.d());
        final int s2 = ((rp8)value2).S(this.G0.a());
        final int n3 = s + s2;
        final int n4 = n + n2;
        final boolean f2 = this.F0;
        int n5;
        if (f2) {
            n5 = n3;
        }
        else {
            n5 = n4;
        }
        if (f2 && !this.H0) {
            n2 = s;
        }
        else if (f2 && this.H0) {
            n2 = s2;
        }
        else if (!f2 && !this.H0) {
            n2 = n;
        }
        final int n6 = n5 - n2;
        final long p = xd.P0(a, -n4, -n3);
        this.I0.k(this.J0);
        final p2f i0 = this.I0;
        Objects.requireNonNull(i0);
        ((cjq<rp8>)i0.f).setValue((rp8)value2);
        final oze d2 = this.J0.d();
        final int h = vj6.h(p);
        final int g2 = vj6.g(p);
        ((cjq<Integer>)d2.a).setValue(Integer.valueOf(h));
        ((cjq<Integer>)d2.b).setValue(Integer.valueOf(g2));
        float n7;
        if (this.F0) {
            final gs0$l k0 = this.K0;
            if (k0 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            n7 = k0.a();
        }
        else {
            final gs0$d l0 = this.L0;
            if (l0 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            n7 = l0.a();
        }
        final int s3 = ((rp8)value2).S(n7);
        final int a2 = ((q0f)this.J0).a();
        int n8;
        if (this.F0) {
            n8 = vj6.g(a) - n3;
        }
        else {
            n8 = vj6.h(a) - n4;
        }
        long n10;
        if (this.H0 && n8 <= 0) {
            final boolean f3 = this.F0;
            if (!f3) {
                n += n8;
            }
            int n9 = s;
            if (f3) {
                n9 = s + n8;
            }
            n10 = kqe.d(n, n9);
        }
        else {
            n10 = kqe.d(n, s);
        }
        final boolean f4 = this.F0;
        value = new v2f(p, f4, this.J0, value2, (frg)new z1f(a2, s3, value2, f4, this.O0, this.P0, this.H0, n2, n6, this.M0, n10));
        ((cjq<vj6>)this.I0.p).setValue(new vj6(((v2f)value).d));
        final piq.a companion = piq.Companion;
        final p2f i2 = this.I0;
        d = companion.a();
        try {
            Object o = ((piq)d).i();
            try {
                final int e = i2.e();
                int f5 = i2.f();
                ((piq)d).p((piq)o);
                ((piq)d).c();
                final float e2 = this.I0.e;
                final boolean f6 = this.F0;
                d = this.J0.h();
                final gs0$l k2 = this.K0;
                final gs0$d l2 = this.L0;
                final boolean h2 = this.H0;
                final n1f m0 = this.M0;
                final i1f n11 = this.N0;
                o = new y1f(value2, a, n4, n3);
                e0e.f(d, "headerIndexes");
                e0e.f((Object)m0, "placementAnimator");
                e0e.f((Object)n11, "beyondBoundsInfo");
                final boolean b = n2 >= 0;
                final String s4 = "Failed requirement.";
                if (!b) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                if (n6 >= 0) {
                    Label_0925: {
                        if (a2 <= 0) {
                            d = ((y1f)o).h0((Object)vj6.j(p), (Object)vj6.i(p), (Object)c2f.F0);
                            final h3a f7 = h3a.F0;
                            final int n12 = -n2;
                            if (f6) {
                                g0 = f0;
                            }
                            value = new e2f((t2f)null, 0, false, 0.0f, (arg)d, (List)f7, n12, n8 + n6, 0, g0);
                        }
                        else {
                            int n13;
                            if (e >= a2) {
                                n13 = a2 - 1;
                                f5 = 0;
                            }
                            else {
                                n13 = e;
                            }
                            final int b2 = jb2.B0(e2);
                            final int n14 = f5 - b2;
                            final boolean b3 = n13 == 0;
                            int n15 = n14;
                            int n16 = b2;
                            if (b3) {
                                n15 = n14;
                                n16 = b2;
                                if (n14 < 0) {
                                    n16 = b2 + n14;
                                    n15 = 0;
                                }
                            }
                            final ArrayList<t2f> list = new ArrayList<t2f>();
                            final int n17 = -n2;
                            int n18;
                            if (s3 < 0) {
                                n18 = s3;
                            }
                            else {
                                n18 = 0;
                            }
                            final int n19 = n17 + n18;
                            int n20 = n15 + n19;
                            int n21 = 0;
                            while (n20 < 0 && n13 + 0 > 0) {
                                --n13;
                                final t2f a3 = ((v2f)value).a(n13);
                                list.add(0, a3);
                                n21 = Math.max(n21, a3.p);
                                n20 += a3.o;
                            }
                            final Object o2 = d;
                            int n22 = n20;
                            int n23 = n16;
                            if (n20 < n19) {
                                n23 = n16 + n20;
                                n22 = n19;
                            }
                            final int n24 = n22 - n19;
                            final int n25 = n8 + n6;
                            int n26;
                            if (n25 < 0) {
                                n26 = 0;
                            }
                            else {
                                n26 = n25;
                            }
                            int n27 = -n24;
                            final int size = list.size();
                            int n28 = n13;
                            for (int j = 0; j < size; ++j) {
                                d = list.get(j);
                                ++n28;
                                n27 += ((t2f)d).o;
                            }
                            int n29 = n24;
                            int n30 = n13;
                            for (int n31 = n28; (n27 <= n26 || list.isEmpty()) && n31 < a2; ++n31) {
                                d = ((v2f)value).a(n31);
                                final int o3 = ((t2f)d).o;
                                n27 += o3;
                                if (n27 <= n19 && n31 != a2 - 1) {
                                    n29 -= o3;
                                    n30 = n31 + 1;
                                }
                                else {
                                    n21 = Math.max(n21, ((t2f)d).p);
                                    list.add((t2f)d);
                                }
                            }
                            int n32 = n29;
                            int n33 = n23;
                            int n34 = n27;
                            int n35 = n21;
                            if (n27 < n8) {
                                final int n36 = n8 - n27;
                                final int n37 = n29 - n36;
                                final int n38 = n27 + n36;
                                int n39;
                                int n40;
                                for (n39 = n30, n40 = n37; n40 < n2 && n39 + 0 > 0; n40 += ((t2f)d).o) {
                                    --n39;
                                    d = ((v2f)value).a(n39);
                                    list.add(0, (t2f)d);
                                    n21 = Math.max(n21, ((t2f)d).p);
                                }
                                final int n41 = n23 + n36;
                                n32 = n40;
                                n33 = n41;
                                n34 = n38;
                                n35 = n21;
                                if (n40 < 0) {
                                    n33 = n41 + n40;
                                    n34 = n38 + n40;
                                    n32 = 0;
                                    n35 = n21;
                                }
                            }
                            final int n42 = n34;
                            float n43 = e2;
                            if (jb2.m0(jb2.B0(e2)) == jb2.m0(n33)) {
                                n43 = e2;
                                if (Math.abs(jb2.B0(e2)) >= Math.abs(n33)) {
                                    n43 = (float)n33;
                                }
                            }
                            if (n32 < 0) {
                                throw new IllegalArgumentException(s4.toString());
                            }
                            final int n44 = -n32;
                            d = rr4.C1((List)list);
                        Label_1594:
                            while (true) {
                                Label_1597: {
                                    if (n2 > 0) {
                                        break Label_1597;
                                    }
                                    final int n45 = n32;
                                    final Object o4 = d;
                                    if (s3 < 0) {
                                        break Label_1597;
                                    }
                                    Label_1827: {
                                        if (n11.d()) {
                                            final int a4 = ((t2f)rr4.C1((List)list)).a;
                                            final int c = n11.c();
                                            final int n46 = a2 - 1;
                                            if (a4 > Math.min(c, n46)) {
                                                final ArrayList<t2f> list2 = new ArrayList<t2f>();
                                                int n47 = ((t2f)rr4.C1((List)list)).a - 1;
                                                final int min = Math.min(n11.c(), n46);
                                                d = list2;
                                                if (min > n47) {
                                                    break Label_1827;
                                                }
                                                while (true) {
                                                    list2.add(((v2f)value).a(n47));
                                                    d = list2;
                                                    if (n47 == min) {
                                                        break Label_1827;
                                                    }
                                                    --n47;
                                                }
                                            }
                                        }
                                        d = h3a.F0;
                                    }
                                    Object f8 = null;
                                    Label_1941: {
                                        if (n11.d()) {
                                            final int a5 = ((t2f)rr4.K1((List)list)).a;
                                            final int b4 = n11.b();
                                            final int n48 = a2 - 1;
                                            if (a5 < Math.min(b4, n48)) {
                                                final ArrayList<t2f> list3 = new ArrayList<t2f>();
                                                int a6 = ((t2f)rr4.K1((List)list)).a;
                                                final int min2 = Math.min(n11.b(), n48);
                                                while (true) {
                                                    f8 = list3;
                                                    if (a6 >= min2) {
                                                        break Label_1941;
                                                    }
                                                    ++a6;
                                                    list3.add(((v2f)value).a(a6));
                                                }
                                            }
                                        }
                                        f8 = h3a.F0;
                                    }
                                    final boolean b5 = e0e.a(o4, rr4.C1((List)list)) && ((List)d).isEmpty() && ((List)f8).isEmpty();
                                    int n49;
                                    if (f6) {
                                        n49 = n35;
                                    }
                                    else {
                                        n49 = n42;
                                    }
                                    int v = xd.V(p, n49);
                                    int n50;
                                    if (f6) {
                                        n50 = n42;
                                    }
                                    else {
                                        n50 = n35;
                                    }
                                    int u = xd.U(p, n50);
                                    int n51;
                                    if (f6) {
                                        n51 = u;
                                    }
                                    else {
                                        n51 = v;
                                    }
                                    final boolean b6 = n42 < Math.min(n51, n8);
                                    if (b6 && n44 != 0) {
                                        throw new IllegalStateException("Check failed.".toString());
                                    }
                                    final ArrayList<h2f> list4 = new ArrayList<h2f>(((List)f8).size() + (((List)d).size() + list.size()));
                                    Label_2742: {
                                        if (b6) {
                                            if (!((List)d).isEmpty() || !((List)f8).isEmpty()) {
                                                throw new IllegalArgumentException(s4.toString());
                                            }
                                            final int size2 = list.size();
                                            d = new int[size2];
                                            for (int n52 = 0; n52 < size2; ++n52) {
                                                int n53;
                                                if (!h2) {
                                                    n53 = n52;
                                                }
                                                else {
                                                    n53 = size2 - n52 - 1;
                                                }
                                                d[n52] = list.get(n53).n;
                                            }
                                            final int[] array = new int[size2];
                                            for (int n54 = 0; n54 < size2; ++n54) {
                                                array[n54] = 0;
                                            }
                                            if (f6) {
                                                if (k2 == null) {
                                                    throw new IllegalArgumentException("Required value was null.".toString());
                                                }
                                                k2.c((rp8)value2, n51, (int[])d, array);
                                            }
                                            else {
                                                if (l2 == null) {
                                                    throw new IllegalArgumentException("Required value was null.".toString());
                                                }
                                                l2.b((rp8)value2, n51, (int[])d, cwe.F0, array);
                                            }
                                            d = new kud(0, size2 - 1);
                                            if (h2) {
                                                d = jb2.z0((iud)d);
                                            }
                                            final int f9 = ((iud)d).F0;
                                            final int g3 = ((iud)d).G0;
                                            final int h3 = ((iud)d).H0;
                                            int n55;
                                            if (h3 <= 0 || (n55 = f9) > g3) {
                                                if (h3 >= 0 || g3 > f9) {
                                                    break Label_2742;
                                                }
                                                n55 = f9;
                                            }
                                            while (true) {
                                                final int n56 = array[n55];
                                                int n57;
                                                if (!h2) {
                                                    n57 = n55;
                                                }
                                                else {
                                                    n57 = size2 - n55 - 1;
                                                }
                                                d = list.get(n57);
                                                int n58 = n56;
                                                if (h2) {
                                                    n58 = n51 - n56 - ((t2f)d).n;
                                                }
                                                list4.add(((t2f)d).a(n58, v, u));
                                                if (n55 == g3) {
                                                    break;
                                                }
                                                n55 += h3;
                                            }
                                        }
                                        else {
                                            final int size3 = ((List)d).size();
                                            int n59 = 0;
                                            int n60 = n44;
                                            while (n59 < size3) {
                                                final t2f t2f = ((List<t2f>)d).get(n59);
                                                n60 -= t2f.o;
                                                list4.add(t2f.a(n60, v, u));
                                                ++n59;
                                            }
                                            final int size4 = list.size();
                                            final int n61 = 0;
                                            int n62 = n44;
                                            for (int n63 = n61; n63 < size4; ++n63) {
                                                d = list.get(n63);
                                                list4.add(((t2f)d).a(n62, v, u));
                                                n62 += ((t2f)d).o;
                                            }
                                            final int size5 = ((List)f8).size();
                                            final int n64 = 0;
                                            int n65 = n62;
                                            for (int n66 = n64; n66 < size5; ++n66) {
                                                d = ((List)f8).get(n66);
                                                list4.add(((t2f)d).a(n65, v, u));
                                                n65 += ((t2f)d).o;
                                            }
                                        }
                                    }
                                    final int n67 = n17;
                                    final int n68 = (int)n43;
                                    while (true) {
                                        for (int size6 = list4.size(), n69 = 0; n69 < size6; ++n69) {
                                            if (list4.get(n69).l) {
                                                final boolean b7 = true;
                                                int n71;
                                                int n72;
                                                boolean b8;
                                                int n73;
                                                int n74;
                                                if (!b7) {
                                                    m0.d();
                                                    final int n70 = n42;
                                                    n71 = u;
                                                    n72 = v;
                                                    b8 = b5;
                                                    n73 = n70;
                                                    n74 = n67;
                                                }
                                                else {
                                                    final boolean b9 = m0.b;
                                                    int n75;
                                                    if (b9) {
                                                        n75 = u;
                                                    }
                                                    else {
                                                        n75 = v;
                                                    }
                                                    int n76 = n68;
                                                    if (h2) {
                                                        n76 = -n68;
                                                    }
                                                    int n77;
                                                    if (b9) {
                                                        n77 = 0;
                                                    }
                                                    else {
                                                        n77 = n76;
                                                    }
                                                    if (!b9) {
                                                        n76 = 0;
                                                    }
                                                    final long d3 = kqe.d(n77, n76);
                                                    final h2f h2f = (h2f)rr4.C1((List)list4);
                                                    d = rr4.K1((List)list4);
                                                    final int size7 = list4.size();
                                                    int n78 = 0;
                                                    for (int n79 = 0; n79 < size7; ++n79) {
                                                        final h2f h2f2 = list4.get(n79);
                                                        final a5e a5e = m0.c.get(h2f2.c);
                                                        n78 += h2f2.e;
                                                    }
                                                    b8 = b5;
                                                    final int n80 = n78 / list4.size();
                                                    m0.i.clear();
                                                    final int size8 = list4.size();
                                                    final int n81 = 0;
                                                    final int n82 = n67;
                                                    final int n83 = n42;
                                                    int n84 = n75;
                                                    int n91;
                                                    int n92;
                                                    Object o6;
                                                    int n93;
                                                    int n97;
                                                    Object o9;
                                                    for (int n85 = n81; n85 < size8; ++n85, n97 = n92, o9 = o6, value = d, d = o9, n84 = n91, v = n93, u = n97) {
                                                        final h2f h2f3 = list4.get(n85);
                                                        m0.i.add(h2f3.c);
                                                        final a5e a5e2 = m0.c.get(h2f3.c);
                                                        if (a5e2 == null) {
                                                            if (h2f3.l) {
                                                                final a5e a5e3 = new a5e();
                                                                final Integer n86 = m0.d.get(h2f3.c);
                                                                final long d4 = h2f3.d(0);
                                                                final int c2 = h2f3.c(0);
                                                                int c3;
                                                                if (n86 == null) {
                                                                    c3 = m0.c(d4);
                                                                }
                                                                else {
                                                                    int c4;
                                                                    if (!h2) {
                                                                        c4 = m0.c(d4);
                                                                    }
                                                                    else {
                                                                        c4 = m0.c(d4) - h2f3.e + c2;
                                                                    }
                                                                    final int a7 = m0.a(n86, h2f3.e, n80, d3, h2, n84, c4, list4);
                                                                    int n87;
                                                                    if (h2) {
                                                                        n87 = h2f3.d - c2;
                                                                    }
                                                                    else {
                                                                        n87 = 0;
                                                                    }
                                                                    c3 = a7 + n87;
                                                                }
                                                                long n88;
                                                                if (m0.b) {
                                                                    n88 = hud.a(d4, 0, c3, 1);
                                                                }
                                                                else {
                                                                    n88 = hud.a(d4, c3, 0, 2);
                                                                }
                                                                for (int e3 = h2f3.e(), n89 = 0; n89 < e3; ++n89) {
                                                                    final long d5 = h2f3.d(n89);
                                                                    final long d6 = kqe.d((int)(d5 >> 32) - (int)(d4 >> 32), hud.c(d5) - hud.c(d4));
                                                                    a5e3.b.add(new mhk(mqb.k(d6, hud.c(n88), (int)(n88 >> 32) + (int)(d6 >> 32)), h2f3.c(n89)));
                                                                }
                                                                final Object o5 = value;
                                                                final int n90 = v;
                                                                m0.c.put(h2f3.c, a5e3);
                                                                m0.e(h2f3, a5e3);
                                                                n91 = n84;
                                                                n92 = u;
                                                                o6 = d;
                                                                n93 = n90;
                                                                d = o5;
                                                            }
                                                            else {
                                                                final Object o7 = value;
                                                                final int n94 = v;
                                                                n91 = n84;
                                                                n92 = u;
                                                                o6 = d;
                                                                n93 = n94;
                                                                d = o7;
                                                            }
                                                        }
                                                        else {
                                                            final Object o8 = d;
                                                            final int n95 = n84;
                                                            d = value;
                                                            final int n96 = v;
                                                            n92 = u;
                                                            if (h2f3.l) {
                                                                final long a8 = a5e2.a;
                                                                final hud$a companion2 = hud.Companion;
                                                                a5e2.a = mqb.k(d3, hud.c(a8), (int)(a8 >> 32) + (int)(d3 >> 32));
                                                                m0.e(h2f3, a5e2);
                                                                n91 = n95;
                                                                o6 = o8;
                                                                n93 = n96;
                                                            }
                                                            else {
                                                                m0.c.remove(h2f3.c);
                                                                n93 = n96;
                                                                o6 = o8;
                                                                n91 = n95;
                                                            }
                                                        }
                                                    }
                                                    final int n98 = v;
                                                    final int n99 = u;
                                                    if (!h2) {
                                                        m0.e = h2f.b;
                                                        m0.f = h2f.a;
                                                        m0.g = ((h2f)d).b;
                                                        m0.h = ((h2f)d).a + ((h2f)d).e - n84;
                                                    }
                                                    else {
                                                        m0.e = ((h2f)d).b;
                                                        m0.f = n84 - ((h2f)d).a - ((h2f)d).d;
                                                        m0.g = h2f.b;
                                                        m0.h = h2f.e - h2f.d + -h2f.a;
                                                    }
                                                    d = m0.c.entrySet().iterator();
                                                    final int n100 = n98;
                                                    final long n101 = d3;
                                                Label_3799:
                                                    while (((Iterator)d).hasNext()) {
                                                        final Map.Entry<Object, V> entry = ((Iterator<Map.Entry<Object, V>>)d).next();
                                                        if (!m0.i.contains(entry.getKey())) {
                                                            final a5e a5e4 = (a5e)entry.getValue();
                                                            final long a9 = a5e4.a;
                                                            final hud$a companion3 = hud.Companion;
                                                            a5e4.a = mqb.k(n101, hud.c(a9), (int)(a9 >> 32) + (int)(n101 >> 32));
                                                            final Integer n102 = ((q0f)((v2f)value).a).f().get(entry.getKey());
                                                            final ArrayList b10 = a5e4.b;
                                                            while (true) {
                                                                for (int size9 = b10.size(), n103 = 0; n103 < size9; ++n103) {
                                                                    final mhk mhk = (mhk)b10.get(n103);
                                                                    final long c5 = mhk.c;
                                                                    final long a10 = a5e4.a;
                                                                    final long k3 = mqb.k(a10, hud.c(c5), (int)(c5 >> 32) + (int)(a10 >> 32));
                                                                    if (m0.c(k3) + mhk.a > 0 && m0.c(k3) < n84) {
                                                                        final boolean b11 = true;
                                                                        final ArrayList b12 = a5e4.b;
                                                                        while (true) {
                                                                            for (int size10 = b12.size(), n104 = 0; n104 < size10; ++n104) {
                                                                                if (((cjq<Object>)((mhk)b12.get(n104)).d).getValue()) {
                                                                                    final int n105 = 1;
                                                                                    if ((b11 || (n105 ^ 0x1) == 0x0) && n102 != null && !a5e4.b.isEmpty()) {
                                                                                        final t2f a11 = ((v2f)value).a(n102);
                                                                                        int a12 = m0.a(n102, a11.o, n80, n101, h2, n84, n84, list4);
                                                                                        if (h2) {
                                                                                            a12 = n84 - a12 - a11.n;
                                                                                        }
                                                                                        final h2f a13 = a11.a(a12, n100, n99);
                                                                                        list4.add(a13);
                                                                                        m0.e(a13, a5e4);
                                                                                    }
                                                                                    else {
                                                                                        ((Iterator)d).remove();
                                                                                    }
                                                                                    continue Label_3799;
                                                                                }
                                                                            }
                                                                            final int n105 = 0;
                                                                            continue;
                                                                        }
                                                                    }
                                                                }
                                                                final boolean b11 = false;
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                    final int n106 = n100;
                                                    m0.d = ((q0f)((v2f)value).a).f();
                                                    n74 = n82;
                                                    n73 = n83;
                                                    n72 = n106;
                                                    n71 = n99;
                                                }
                                                h2f a16;
                                                if (((Collection)o2).isEmpty() ^ true) {
                                                    final int b13 = ((h2f)rr4.C1((List)list4)).b;
                                                    final int size11 = ((List)o2).size();
                                                    int intValue = -1;
                                                    int intValue2 = -1;
                                                    int n107 = 0;
                                                    while (n107 < size11 && ((Number)((List)o2).get(n107)).intValue() <= b13) {
                                                        intValue = ((Number)((List)o2).get(n107)).intValue();
                                                        if (++n107 >= 0 && n107 <= shw.F((List)o2)) {
                                                            d = ((List)o2).get(n107);
                                                        }
                                                        else {
                                                            d = -1;
                                                        }
                                                        intValue2 = ((Number)d).intValue();
                                                    }
                                                    final int size12 = list4.size();
                                                    int n108 = -1;
                                                    int n109 = 0;
                                                    int n110 = Integer.MIN_VALUE;
                                                    int a14 = Integer.MIN_VALUE;
                                                    while (n109 < size12) {
                                                        d = list4.get(n109);
                                                        final int b14 = ((h2f)d).b;
                                                        int a15;
                                                        int n111;
                                                        if (b14 == intValue) {
                                                            a15 = ((h2f)d).a;
                                                            n111 = n109;
                                                        }
                                                        else {
                                                            n111 = n108;
                                                            a15 = n110;
                                                            if (b14 == intValue2) {
                                                                a14 = ((h2f)d).a;
                                                                a15 = n110;
                                                                n111 = n108;
                                                            }
                                                        }
                                                        ++n109;
                                                        n108 = n111;
                                                        n110 = a15;
                                                    }
                                                    if (intValue == -1) {
                                                        a16 = null;
                                                    }
                                                    else {
                                                        final t2f a17 = ((v2f)value).a(intValue);
                                                        int max;
                                                        if (n110 != Integer.MIN_VALUE) {
                                                            max = Math.max(n74, n110);
                                                        }
                                                        else {
                                                            max = n74;
                                                        }
                                                        int min3 = max;
                                                        if (a14 != Integer.MIN_VALUE) {
                                                            min3 = Math.min(max, a14 - a17.n);
                                                        }
                                                        a16 = a17.a(min3, n72, n71);
                                                        if (n108 != -1) {
                                                            list4.set(n108, a16);
                                                        }
                                                        else {
                                                            list4.add(0, a16);
                                                        }
                                                    }
                                                }
                                                else {
                                                    a16 = null;
                                                }
                                                final boolean b15 = n73 > n8;
                                                o = ((y1f)o).h0((Object)n72, (Object)n71, (Object)new d2f(list4, a16));
                                                if (b8) {
                                                    value = list4;
                                                }
                                                else {
                                                    d = new ArrayList(list4.size());
                                                    for (int size13 = list4.size(), n112 = 0; n112 < size13; ++n112) {
                                                        final h2f value3 = list4.get(n112);
                                                        final h2f h2f4 = value3;
                                                        if ((h2f4.b >= ((t2f)rr4.C1((List)list)).a && h2f4.b <= ((t2f)rr4.K1((List)list)).a) || h2f4 == a16) {
                                                            ((ArrayList<h2f>)d).add(value3);
                                                        }
                                                    }
                                                    value = d;
                                                }
                                                if (f6) {
                                                    g0 = f0;
                                                }
                                                value = new e2f((t2f)o4, n45, b15, n43, (arg)o, (List)value, n74, n25, a2, g0);
                                                break Label_0925;
                                            }
                                        }
                                        final boolean b7 = false;
                                        continue;
                                    }
                                }
                                final int size14 = list.size();
                                int n113 = 0;
                                while (true) {
                                    int n45 = n32;
                                    Object o4 = d;
                                    if (n113 >= size14) {
                                        continue Label_1594;
                                    }
                                    final int o10 = list.get(n113).o;
                                    n45 = n32;
                                    o4 = d;
                                    if (n32 == 0) {
                                        continue Label_1594;
                                    }
                                    n45 = n32;
                                    o4 = d;
                                    if (o10 > n32) {
                                        continue Label_1594;
                                    }
                                    n45 = n32;
                                    o4 = d;
                                    if (n113 == shw.F((List)list)) {
                                        continue Label_1594;
                                    }
                                    n32 -= o10;
                                    ++n113;
                                    d = list.get(n113);
                                }
                                break;
                            }
                        }
                    }
                    final p2f i3 = this.I0;
                    final krj q0 = this.Q0;
                    Objects.requireNonNull(i3);
                    final l2f a18 = i3.a;
                    Objects.requireNonNull(a18);
                    d = ((e2f)value).a;
                    if (d != null) {
                        d = ((t2f)d).m;
                    }
                    else {
                        d = null;
                    }
                    a18.d = d;
                    final int b16;
                    Label_5041: {
                        if (!a18.c && ((e2f)value).h <= 0) {
                            break Label_5041;
                        }
                        a18.c = true;
                        b16 = ((e2f)value).b;
                        if (b16 < 0.0f) {
                            break Label_5041;
                        }
                        d = piq.Companion.a();
                        try {
                            o = ((piq)d).i();
                            try {
                                final t2f a19 = ((e2f)value).a;
                                int a20;
                                if (a19 != null) {
                                    a20 = a19.a;
                                }
                                else {
                                    a20 = 0;
                                }
                                a18.c(a20, b16);
                                ((piq)d).p((piq)o);
                                ((piq)d).c();
                                i3.e -= ((e2f)value).d;
                                ((cjq<Object>)i3.c).setValue(value);
                                i3.r = ((e2f)value).c;
                                d = ((e2f)value).a;
                                int a21;
                                if (d != null) {
                                    a21 = ((t2f)d).a;
                                }
                                else {
                                    a21 = 0;
                                }
                                i3.q = (a21 != 0 || ((e2f)value).b != 0);
                                if (i3.i != -1 && (((e2f)value).e.isEmpty() ^ true)) {
                                    int n114;
                                    if (i3.k) {
                                        n114 = ((l1f)rr4.K1((List)((e2f)value).e)).getIndex() + 1;
                                    }
                                    else {
                                        n114 = ((l1f)rr4.C1((List)((e2f)value).e)).getIndex() - 1;
                                    }
                                    if (i3.i != n114) {
                                        i3.i = -1;
                                        d = i3.j;
                                        if (d != null) {
                                            ((x0f$a)d).cancel();
                                        }
                                        i3.j = null;
                                    }
                                }
                                final boolean c6 = ((e2f)value).c;
                                d = ((e2f)value).a;
                                int a22;
                                if (d != null) {
                                    a22 = ((t2f)d).a;
                                }
                                else {
                                    a22 = 0;
                                }
                                final boolean b17 = a22 != 0 || ((e2f)value).b != 0;
                                q0.setEnabled(c6 || b17);
                                return value;
                            }
                            finally {
                                ((piq)d).p((piq)o);
                            }
                        }
                        finally {
                            ((piq)d).c();
                        }
                    }
                    value = new StringBuilder();
                    ((StringBuilder)value).append("scrollOffset should be non-negative (");
                    ((StringBuilder)value).append(b16);
                    ((StringBuilder)value).append(')');
                    throw new IllegalStateException(((StringBuilder)value).toString().toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            finally {
                ((piq)d).p((piq)o);
            }
        }
        finally {
            ((piq)d).c();
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
