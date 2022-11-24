import java.util.HashMap;
import java.util.Arrays;
import androidx.constraintlayout.widget.ConstraintLayout$b;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d8b extends bfx
{
    public int H0;
    public int I0;
    public int J0;
    public int K0;
    public int L0;
    public int M0;
    public float N0;
    public float O0;
    public float P0;
    public float Q0;
    public float R0;
    public float S0;
    public int T0;
    public int U0;
    public int V0;
    public int W0;
    public int X0;
    public int Y0;
    public int Z0;
    public ArrayList<d8b.d8b$a> a1;
    public tj6[] b1;
    public tj6[] c1;
    public int[] d1;
    public tj6[] e1;
    public int f1;
    
    public d8b() {
        this.H0 = -1;
        this.I0 = -1;
        this.J0 = -1;
        this.K0 = -1;
        this.L0 = -1;
        this.M0 = -1;
        this.N0 = 0.5f;
        this.O0 = 0.5f;
        this.P0 = 0.5f;
        this.Q0 = 0.5f;
        this.R0 = 0.5f;
        this.S0 = 0.5f;
        this.T0 = 0;
        this.U0 = 0;
        this.V0 = 2;
        this.W0 = 2;
        this.X0 = 0;
        this.Y0 = -1;
        this.Z0 = 0;
        this.a1 = new ArrayList<d8b.d8b$a>();
        this.b1 = null;
        this.c1 = null;
        this.d1 = null;
        this.f1 = 0;
    }
    
    public final void b0(int min, int min2, final int n, final int n2) {
        final tj6.a h0 = tj6.a.H0;
        final tj6.a g0 = tj6.a.G0;
        if (((bkc)this).v0 > 0) {
            final tj6 v = ((tj6)this).V;
            Object y0;
            if (v != null) {
                y0 = ((uj6)v).y0;
            }
            else {
                y0 = null;
            }
            boolean b;
            if (y0 == null) {
                b = false;
            }
            else {
                for (int i = 0; i < ((bkc)this).v0; ++i) {
                    final tj6 tj6 = ((bkc)this).u0[i];
                    if (tj6 != null) {
                        if (!(tj6 instanceof dbc)) {
                            final tj6.a p4 = tj6.p(0);
                            final tj6.a p5 = tj6.p(1);
                            if (p4 != h0 || tj6.r == 1 || p5 != h0 || tj6.s == 1) {
                                tj6.a a;
                                if ((a = p4) == h0) {
                                    a = g0;
                                }
                                tj6.a b2;
                                if ((b2 = p5) == h0) {
                                    b2 = g0;
                                }
                                final ms1.a f0 = super.F0;
                                f0.a = a;
                                f0.b = b2;
                                f0.c = tj6.x();
                                super.F0.d = tj6.q();
                                ((ConstraintLayout$b)y0).b(tj6, super.F0);
                                tj6.X(super.F0.e);
                                tj6.S(super.F0.f);
                                tj6.P(super.F0.g);
                            }
                        }
                    }
                }
                b = true;
            }
            if (!b) {
                super.D0 = 0;
                super.E0 = 0;
                super.C0 = false;
                return;
            }
        }
        final int a2 = super.A0;
        final int b3 = super.B0;
        final int w0 = super.w0;
        final int x0 = super.x0;
        final int[] array = new int[2];
        int n3 = min2 - a2 - b3;
        final int z0 = this.Z0;
        if (z0 == 1) {
            n3 = n2 - w0 - x0;
        }
        if (z0 == 0) {
            if (this.H0 == -1) {
                this.H0 = 0;
            }
            if (this.I0 == -1) {
                this.I0 = 0;
            }
        }
        else {
            if (this.H0 == -1) {
                this.H0 = 0;
            }
            if (this.I0 == -1) {
                this.I0 = 0;
            }
        }
        tj6[] u0 = ((bkc)this).u0;
        int n4 = 0;
        int n5 = 0;
        int v2;
        while (true) {
            v2 = ((bkc)this).v0;
            if (n4 >= v2) {
                break;
            }
            int n6 = n5;
            if (((bkc)this).u0[n4].i0 == 8) {
                n6 = n5 + 1;
            }
            ++n4;
            n5 = n6;
        }
        int[] array2 = array;
        int n7 = x0;
        int f2 = v2;
        if (n5 > 0) {
            final tj6[] array3 = new tj6[v2 - n5];
            int n8 = 0;
            int n9 = 0;
            while (true) {
                u0 = array3;
                array2 = array;
                n7 = x0;
                f2 = n9;
                if (n8 >= ((bkc)this).v0) {
                    break;
                }
                final tj6 tj7 = ((bkc)this).u0[n8];
                int n10 = n9;
                if (tj7.i0 != 8) {
                    array3[n9] = tj7;
                    n10 = n9 + 1;
                }
                ++n8;
                n9 = n10;
            }
        }
        this.e1 = u0;
        this.f1 = f2;
        final int x2 = this.X0;
        Label_0641: {
            if (x2 != 0) {
                if (x2 != 1) {
                    if (x2 == 2) {
                        final int z2 = this.Z0;
                        int y2;
                        int y3;
                        if (z2 == 0) {
                            y2 = this.Y0;
                            if (y2 <= 0) {
                                int n11 = 0;
                                y2 = 0;
                                for (int j = 0; j < f2; ++j) {
                                    int n12 = n11;
                                    if (j > 0) {
                                        n12 = n11 + this.T0;
                                    }
                                    final tj6 tj8 = u0[j];
                                    if (tj8 == null) {
                                        n11 = n12;
                                    }
                                    else {
                                        n11 = this.e0(tj8, n3) + n12;
                                        if (n11 > n3) {
                                            break;
                                        }
                                        ++y2;
                                    }
                                }
                            }
                            y3 = 0;
                        }
                        else {
                            y3 = this.Y0;
                            if (y3 <= 0) {
                                int n13 = 0;
                                int n14 = 0;
                                for (int k = 0; k < f2; ++k) {
                                    int n15 = n13;
                                    if (k > 0) {
                                        n15 = n13 + this.U0;
                                    }
                                    final tj6 tj9 = u0[k];
                                    if (tj9 == null) {
                                        n13 = n15;
                                    }
                                    else {
                                        n13 = this.d0(tj9, n3) + n15;
                                        if (n13 > n3) {
                                            break;
                                        }
                                        ++n14;
                                    }
                                }
                                y3 = n14;
                            }
                            y2 = 0;
                        }
                        if (this.d1 == null) {
                            this.d1 = new int[2];
                        }
                        while (true) {
                            d8b d8b = null;
                            int[] array4 = null;
                            int n16 = 0;
                            int n17 = 0;
                            Label_2639: {
                                if ((y3 == 0 && z2 == 1) || (y2 == 0 && z2 == 0)) {
                                    d8b = this;
                                    array4 = array2;
                                    n16 = y2;
                                    n17 = y3;
                                    break Label_2639;
                                }
                                final d8b d8b2 = this;
                                final int[] array5 = array2;
                                final int l = 0;
                                while (l == 0) {
                                    if (z2 == 0) {
                                        y3 = (int)Math.ceil(f2 / (float)y2);
                                    }
                                    else {
                                        y2 = (int)Math.ceil(f2 / (float)y3);
                                    }
                                    final tj6[] c1 = d8b2.c1;
                                    if (c1 != null && c1.length >= y2) {
                                        Arrays.fill(c1, null);
                                    }
                                    else {
                                        d8b2.c1 = new tj6[y2];
                                    }
                                    final tj6[] b4 = d8b2.b1;
                                    if (b4 != null && b4.length >= y3) {
                                        Arrays.fill(b4, null);
                                    }
                                    else {
                                        d8b2.b1 = new tj6[y3];
                                    }
                                    for (int n18 = 0; n18 < y2; ++n18) {
                                        for (int n19 = 0; n19 < y3; ++n19) {
                                            int n20 = n19 * y2 + n18;
                                            if (z2 == 1) {
                                                n20 = n18 * y3 + n19;
                                            }
                                            if (n20 < u0.length) {
                                                final tj6 tj10 = u0[n20];
                                                if (tj10 != null) {
                                                    final int e0 = d8b2.e0(tj10, n3);
                                                    final tj6[] c2 = d8b2.c1;
                                                    if (c2[n18] == null || c2[n18].x() < e0) {
                                                        d8b2.c1[n18] = tj10;
                                                    }
                                                    final int d0 = d8b2.d0(tj10, n3);
                                                    final tj6[] b5 = d8b2.b1;
                                                    if (b5[n19] == null || b5[n19].q() < d0) {
                                                        d8b2.b1[n19] = tj10;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    int n21 = 0;
                                    int n22 = 0;
                                    while (n21 < y2) {
                                        final tj6 tj11 = d8b2.c1[n21];
                                        int n23 = n22;
                                        if (tj11 != null) {
                                            int n24 = n22;
                                            if (n21 > 0) {
                                                n24 = n22 + d8b2.T0;
                                            }
                                            n23 = d8b2.e0(tj11, n3) + n24;
                                        }
                                        ++n21;
                                        n22 = n23;
                                    }
                                    int n25 = 0;
                                    int n26 = 0;
                                    while (n25 < y3) {
                                        final tj6 tj12 = d8b2.b1[n25];
                                        int n27 = n26;
                                        if (tj12 != null) {
                                            int n28 = n26;
                                            if (n25 > 0) {
                                                n28 = n26 + d8b2.U0;
                                            }
                                            n27 = d8b2.d0(tj12, n3) + n28;
                                        }
                                        ++n25;
                                        n26 = n27;
                                    }
                                    array5[0] = n22;
                                    array5[1] = n26;
                                    if (z2 == 0) {
                                        n16 = y2;
                                        array4 = array5;
                                        n17 = y3;
                                        d8b = d8b2;
                                        if (n22 <= n3) {
                                            break Label_2639;
                                        }
                                        n16 = y2;
                                        array4 = array5;
                                        n17 = y3;
                                        d8b = d8b2;
                                        if (y2 <= 1) {
                                            break Label_2639;
                                        }
                                        --y2;
                                    }
                                    else {
                                        n16 = y2;
                                        array4 = array5;
                                        n17 = y3;
                                        d8b = d8b2;
                                        if (n26 <= n3) {
                                            break Label_2639;
                                        }
                                        n16 = y2;
                                        array4 = array5;
                                        n17 = y3;
                                        d8b = d8b2;
                                        if (y3 <= 1) {
                                            break Label_2639;
                                        }
                                        --y3;
                                    }
                                }
                                final int[] d2 = d8b2.d1;
                                d2[0] = y2;
                                d2[1] = y3;
                                break Label_0641;
                            }
                            final int l = 1;
                            y2 = n16;
                            final int[] array5 = array4;
                            y3 = n17;
                            final d8b d8b2 = d8b;
                            continue;
                        }
                    }
                    if (x2 == 3) {
                        final int z3 = this.Z0;
                        if (f2 != 0) {
                            this.a1.clear();
                            d8b.d8b$a d8b$a = new d8b.d8b$a(this, z3, ((tj6)this).J, ((tj6)this).K, ((tj6)this).L, ((tj6)this).M, n3);
                            this.a1.add(d8b$a);
                            int n29;
                            int n36;
                            if (z3 == 0) {
                                n29 = 0;
                                int n30 = 0;
                                int n31 = 0;
                                int n34;
                                for (int n32 = 0; n32 < f2; ++n32, n29 = n34) {
                                    final int n33 = n31 + 1;
                                    final tj6 tj13 = u0[n32];
                                    final int e2 = this.e0(tj13, n3);
                                    n34 = n29;
                                    if (tj13.U[0] == h0) {
                                        n34 = n29 + 1;
                                    }
                                    boolean b7;
                                    final boolean b6 = b7 = ((n30 == n3 || this.T0 + n30 + e2 > n3) && d8b$a.b != null);
                                    if (!b6) {
                                        b7 = b6;
                                        if (n32 > 0) {
                                            final int y4 = this.Y0;
                                            b7 = b6;
                                            if (y4 > 0) {
                                                b7 = b6;
                                                if (n33 > y4) {
                                                    b7 = true;
                                                }
                                            }
                                        }
                                    }
                                    if (b7) {
                                        d8b$a = new d8b.d8b$a(this, z3, ((tj6)this).J, ((tj6)this).K, ((tj6)this).L, ((tj6)this).M, n3);
                                        d8b$a.n = n32;
                                        this.a1.add(d8b$a);
                                        n30 = e2;
                                        n31 = n33;
                                    }
                                    else {
                                        int n35 = e2;
                                        if (n32 > 0) {
                                            n35 = this.T0 + e2 + n30;
                                        }
                                        n31 = 0;
                                        n30 = n35;
                                    }
                                    d8b$a.a(tj13);
                                }
                                n36 = n3;
                            }
                            else {
                                final int n37 = n3;
                                int n38 = 0;
                                n29 = 0;
                                int n39 = 0;
                                final tj6.a a3 = h0;
                                while (n39 < f2) {
                                    final tj6 tj14 = u0[n39];
                                    final int d3 = this.d0(tj14, n37);
                                    int n40 = n29;
                                    if (tj14.U[1] == a3) {
                                        n40 = n29 + 1;
                                    }
                                    boolean b9;
                                    final boolean b8 = b9 = ((n38 == n37 || this.U0 + n38 + d3 > n37) && d8b$a.b != null);
                                    if (!b8) {
                                        b9 = b8;
                                        if (n39 > 0) {
                                            final int y5 = this.Y0;
                                            b9 = b8;
                                            if (y5 > 0) {
                                                b9 = b8;
                                                if (y5 < 0) {
                                                    b9 = true;
                                                }
                                            }
                                        }
                                    }
                                    int n41 = 0;
                                    Label_1225: {
                                        d8b.d8b$a d8b$a2;
                                        if (b9) {
                                            d8b$a2 = new d8b.d8b$a(this, z3, ((tj6)this).J, ((tj6)this).K, ((tj6)this).L, ((tj6)this).M, n37);
                                            d8b$a2.n = n39;
                                            this.a1.add(d8b$a2);
                                        }
                                        else {
                                            d8b$a2 = d8b$a;
                                            if (n39 > 0) {
                                                n41 = this.U0 + d3 + n38;
                                                break Label_1225;
                                            }
                                        }
                                        n41 = d3;
                                        d8b$a = d8b$a2;
                                    }
                                    d8b$a.a(tj14);
                                    ++n39;
                                    n38 = n41;
                                    n29 = n40;
                                }
                                n36 = n37;
                            }
                            final int size = this.a1.size();
                            kj6 m = ((tj6)this).J;
                            kj6 k2 = ((tj6)this).K;
                            kj6 l2 = ((tj6)this).L;
                            kj6 m2 = ((tj6)this).M;
                            int a4 = super.A0;
                            int w2 = super.w0;
                            int b10 = super.B0;
                            int x3 = super.x0;
                            final tj6.a[] u2 = ((tj6)this).U;
                            final boolean b11 = u2[0] == g0 || u2[1] == g0;
                            if (n29 > 0 && b11) {
                                for (int n42 = 0; n42 < size; ++n42) {
                                    final d8b.d8b$a d8b$a3 = this.a1.get(n42);
                                    if (z3 == 0) {
                                        d8b$a3.e(n36 - d8b$a3.d());
                                    }
                                    else {
                                        d8b$a3.e(n36 - d8b$a3.c());
                                    }
                                }
                            }
                            int n43 = 0;
                            int n44 = 0;
                            int n45 = 0;
                            while (n44 < size) {
                                final d8b.d8b$a d8b$a4 = this.a1.get(n44);
                                int n47;
                                int n48;
                                if (z3 == 0) {
                                    kj6 kj6;
                                    int x4;
                                    if (n44 < size - 1) {
                                        kj6 = this.a1.get(n44 + 1).b.K;
                                        x4 = 0;
                                    }
                                    else {
                                        kj6 = ((tj6)this).M;
                                        x4 = super.x0;
                                    }
                                    final kj6 m3 = d8b$a4.b.M;
                                    d8b$a4.f(z3, m, k2, l2, kj6, a4, w2, b10, x4, n36);
                                    final int max = Math.max(n45, d8b$a4.d());
                                    int n46 = d8b$a4.c() + n43;
                                    if (n44 > 0) {
                                        n46 += this.U0;
                                    }
                                    k2 = m3;
                                    n47 = 0;
                                    n48 = n46;
                                    n45 = max;
                                    m2 = kj6;
                                    x3 = x4;
                                }
                                else {
                                    kj6 kj7;
                                    int b12;
                                    if (n44 < size - 1) {
                                        kj7 = this.a1.get(n44 + 1).b.J;
                                        b12 = 0;
                                    }
                                    else {
                                        kj7 = ((tj6)this).L;
                                        b12 = super.B0;
                                    }
                                    final kj6 l3 = d8b$a4.b.L;
                                    d8b$a4.f(z3, m, k2, kj7, m2, a4, w2, b12, x3, n36);
                                    final int n49 = d8b$a4.d() + n45;
                                    final int max2 = Math.max(n43, d8b$a4.c());
                                    n45 = n49;
                                    if (n44 > 0) {
                                        n45 = n49 + this.T0;
                                    }
                                    m = l3;
                                    a4 = 0;
                                    n47 = w2;
                                    b10 = b12;
                                    l2 = kj7;
                                    n48 = max2;
                                }
                                ++n44;
                                n43 = n48;
                                w2 = n47;
                            }
                            array2[0] = n45;
                            array2[1] = n43;
                        }
                    }
                }
                else {
                    final int z4 = this.Z0;
                    if (f2 != 0) {
                        this.a1.clear();
                        d8b.d8b$a d8b$a5 = new d8b.d8b$a(this, z4, ((tj6)this).J, ((tj6)this).K, ((tj6)this).L, ((tj6)this).M, n3);
                        this.a1.add(d8b$a5);
                        int n55;
                        int n56;
                        Enum<tj6.a> enum1;
                        if (z4 == 0) {
                            int n50 = 0;
                            int n51 = 0;
                            int n52 = 0;
                            final tj6.a a5 = h0;
                            while (n52 < f2) {
                                final tj6 tj15 = u0[n52];
                                final int e3 = this.e0(tj15, n3);
                                int n53 = n51;
                                if (tj15.U[0] == a5) {
                                    n53 = n51 + 1;
                                }
                                boolean b14;
                                final boolean b13 = b14 = ((n50 == n3 || this.T0 + n50 + e3 > n3) && d8b$a5.b != null);
                                if (!b13) {
                                    b14 = b13;
                                    if (n52 > 0) {
                                        final int y6 = this.Y0;
                                        b14 = b13;
                                        if (y6 > 0) {
                                            b14 = b13;
                                            if (n52 % y6 == 0) {
                                                b14 = true;
                                            }
                                        }
                                    }
                                }
                                int n54 = 0;
                                Label_2982: {
                                    d8b.d8b$a d8b$a6;
                                    if (b14) {
                                        d8b$a6 = new d8b.d8b$a(this, z4, ((tj6)this).J, ((tj6)this).K, ((tj6)this).L, ((tj6)this).M, n3);
                                        d8b$a6.n = n52;
                                        this.a1.add(d8b$a6);
                                    }
                                    else {
                                        d8b$a6 = d8b$a5;
                                        if (n52 > 0) {
                                            n54 = this.T0 + e3 + n50;
                                            break Label_2982;
                                        }
                                    }
                                    n54 = e3;
                                    d8b$a5 = d8b$a6;
                                }
                                d8b$a5.a(tj15);
                                ++n52;
                                n50 = n54;
                                n51 = n53;
                            }
                            n55 = z4;
                            n56 = n51;
                            enum1 = g0;
                        }
                        else {
                            final int n57 = z4;
                            final tj6.a a6 = g0;
                            int n58 = 0;
                            int n59 = 0;
                            int n60 = 0;
                            d8b.d8b$a d8b$a7 = d8b$a5;
                            while (true) {
                                n56 = n59;
                                enum1 = a6;
                                n55 = n57;
                                if (n60 >= f2) {
                                    break;
                                }
                                final tj6 tj16 = u0[n60];
                                final int d4 = this.d0(tj16, n3);
                                int n61 = n59;
                                if (tj16.U[1] == h0) {
                                    n61 = n59 + 1;
                                }
                                boolean b16;
                                final boolean b15 = b16 = ((n58 == n3 || this.U0 + n58 + d4 > n3) && d8b$a7.b != null);
                                if (!b15) {
                                    b16 = b15;
                                    if (n60 > 0) {
                                        final int y7 = this.Y0;
                                        b16 = b15;
                                        if (y7 > 0) {
                                            b16 = b15;
                                            if (n60 % y7 == 0) {
                                                b16 = true;
                                            }
                                        }
                                    }
                                }
                                int n62 = 0;
                                Label_3271: {
                                    d8b.d8b$a d8b$a8;
                                    if (b16) {
                                        d8b$a8 = new d8b.d8b$a(this, n57, ((tj6)this).J, ((tj6)this).K, ((tj6)this).L, ((tj6)this).M, n3);
                                        d8b$a8.n = n60;
                                        this.a1.add(d8b$a8);
                                    }
                                    else {
                                        d8b$a8 = d8b$a7;
                                        if (n60 > 0) {
                                            n62 = this.U0 + d4 + n58;
                                            break Label_3271;
                                        }
                                    }
                                    n62 = d4;
                                    d8b$a7 = d8b$a8;
                                }
                                d8b$a7.a(tj16);
                                ++n60;
                                n58 = n62;
                                n59 = n61;
                            }
                        }
                        final int size2 = this.a1.size();
                        final kj6 j2 = ((tj6)this).J;
                        kj6 k3 = ((tj6)this).K;
                        kj6 l4 = ((tj6)this).L;
                        kj6 m4 = ((tj6)this).M;
                        int a7 = super.A0;
                        int w3 = super.w0;
                        int b17 = super.B0;
                        int x5 = super.x0;
                        final tj6.a[] u3 = ((tj6)this).U;
                        final boolean b18 = u3[0] == enum1 || u3[1] == enum1;
                        if (n56 > 0 && b18) {
                            for (int n63 = 0; n63 < size2; ++n63) {
                                final d8b.d8b$a d8b$a9 = this.a1.get(n63);
                                if (n55 == 0) {
                                    d8b$a9.e(n3 - d8b$a9.d());
                                }
                                else {
                                    d8b$a9.e(n3 - d8b$a9.c());
                                }
                            }
                        }
                        int n64 = 0;
                        kj6 kj8 = j2;
                        int n65 = 0;
                        int n66 = 0;
                        while (n64 < size2) {
                            final d8b.d8b$a d8b$a10 = this.a1.get(n64);
                            int n68;
                            int n69;
                            if (n55 == 0) {
                                kj6 kj9;
                                int x6;
                                if (n64 < size2 - 1) {
                                    kj9 = this.a1.get(n64 + 1).b.K;
                                    x6 = 0;
                                }
                                else {
                                    kj9 = ((tj6)this).M;
                                    x6 = super.x0;
                                }
                                final kj6 m5 = d8b$a10.b.M;
                                d8b$a10.f(n55, kj8, k3, l4, kj9, a7, w3, b17, x6, n3);
                                final int max3 = Math.max(n66, d8b$a10.d());
                                int n67 = d8b$a10.c() + n65;
                                if (n64 > 0) {
                                    n67 += this.U0;
                                }
                                k3 = m5;
                                n68 = 0;
                                n69 = n67;
                                n66 = max3;
                                m4 = kj9;
                                x5 = x6;
                            }
                            else {
                                kj6 kj10;
                                int b19;
                                if (n64 < size2 - 1) {
                                    kj10 = this.a1.get(n64 + 1).b.J;
                                    b19 = 0;
                                }
                                else {
                                    kj10 = ((tj6)this).L;
                                    b19 = super.B0;
                                }
                                final kj6 l5 = d8b$a10.b.L;
                                d8b$a10.f(n55, kj8, k3, kj10, m4, a7, w3, b19, x5, n3);
                                final int n70 = d8b$a10.d() + n66;
                                final int max4 = Math.max(n65, d8b$a10.c());
                                n66 = n70;
                                if (n64 > 0) {
                                    n66 = n70 + this.T0;
                                }
                                kj8 = l5;
                                a7 = 0;
                                n68 = w3;
                                b17 = b19;
                                l4 = kj10;
                                n69 = max4;
                            }
                            ++n64;
                            n65 = n69;
                            w3 = n68;
                        }
                        array2[0] = n66;
                        array2[1] = n65;
                    }
                }
            }
            else {
                final int z5 = this.Z0;
                if (f2 != 0) {
                    d8b.d8b$a d8b$a11;
                    if (this.a1.size() == 0) {
                        d8b$a11 = new d8b.d8b$a(this, z5, ((tj6)this).J, ((tj6)this).K, ((tj6)this).L, ((tj6)this).M, n3);
                        this.a1.add(d8b$a11);
                    }
                    else {
                        d8b$a11 = this.a1.get(0);
                        d8b$a11.c = 0;
                        d8b$a11.b = null;
                        d8b$a11.l = 0;
                        d8b$a11.m = 0;
                        d8b$a11.n = 0;
                        d8b$a11.o = 0;
                        d8b$a11.p = 0;
                        d8b$a11.f(z5, ((tj6)this).J, ((tj6)this).K, ((tj6)this).L, ((tj6)this).M, super.A0, super.w0, super.B0, super.x0, n3);
                    }
                    for (int n71 = 0; n71 < f2; ++n71) {
                        d8b$a11.a(u0[n71]);
                    }
                    array2[0] = d8b$a11.d();
                    array2[1] = d8b$a11.c();
                }
            }
        }
        final int n72 = array2[0] + a2 + b3;
        final int n73 = array2[1] + w0 + n7;
        if (min == 1073741824) {
            min = min2;
        }
        else if (min == Integer.MIN_VALUE) {
            min = Math.min(n72, min2);
        }
        else if (min == 0) {
            min = n72;
        }
        else {
            min = 0;
        }
        if (n == 1073741824) {
            min2 = n2;
        }
        else if (n == Integer.MIN_VALUE) {
            min2 = Math.min(n73, n2);
        }
        else if (n == 0) {
            min2 = n73;
        }
        else {
            min2 = 0;
        }
        super.D0 = min;
        super.E0 = min2;
        ((tj6)this).X(min);
        ((tj6)this).S(min2);
        super.C0 = (((bkc)this).v0 > 0);
    }
    
    public final int d0(final tj6 tj6, int n) {
        if (tj6 == null) {
            return 0;
        }
        if (tj6.U[1] == tj6.a.H0) {
            final int s = tj6.s;
            if (s == 0) {
                return 0;
            }
            if (s == 2) {
                n *= (int)tj6.z;
                if (n != tj6.q()) {
                    tj6.g = true;
                    this.c0(tj6, tj6.U[0], tj6.x(), tj6.a.F0, n);
                }
                return n;
            }
            if (s == 1) {
                return tj6.q();
            }
            if (s == 3) {
                return (int)(tj6.x() * tj6.Y + 0.5f);
            }
        }
        return tj6.q();
    }
    
    public final int e0(final tj6 tj6, int n) {
        if (tj6 == null) {
            return 0;
        }
        if (tj6.U[0] == tj6.a.H0) {
            final int r = tj6.r;
            if (r == 0) {
                return 0;
            }
            if (r == 2) {
                n *= (int)tj6.w;
                if (n != tj6.x()) {
                    tj6.g = true;
                    this.c0(tj6, tj6.a.F0, n, tj6.U[1], tj6.q());
                }
                return n;
            }
            if (r == 1) {
                return tj6.x();
            }
            if (r == 3) {
                return (int)(tj6.q() * tj6.Y + 0.5f);
            }
        }
        return tj6.x();
    }
    
    public final void f(final ydf ydf, final boolean b) {
        super.f(ydf, b);
        final tj6 v = ((tj6)this).V;
        final boolean b2 = v != null && ((uj6)v).z0;
        final int x0 = this.X0;
        if (x0 != 0) {
            if (x0 != 1) {
                if (x0 != 2) {
                    if (x0 == 3) {
                        for (int size = this.a1.size(), i = 0; i < size; ++i) {
                            this.a1.get(i).b(b2, i, i == size - 1);
                        }
                    }
                }
                else if (this.d1 != null && this.c1 != null) {
                    if (this.b1 != null) {
                        for (int j = 0; j < this.f1; ++j) {
                            this.e1[j].K();
                        }
                        final int[] d1 = this.d1;
                        final int n = d1[0];
                        final int n2 = d1[1];
                        tj6 tj6 = null;
                        float n3 = this.N0;
                        tj6 tj8;
                        for (int k = 0; k < n; ++k, tj6 = tj8) {
                            int n4;
                            if (b2) {
                                n4 = n - k - 1;
                                n3 = 1.0f - this.N0;
                            }
                            else {
                                n4 = k;
                            }
                            final tj6 tj7 = this.c1[n4];
                            tj8 = tj6;
                            if (tj7 != null) {
                                if (tj7.i0 == 8) {
                                    tj8 = tj6;
                                }
                                else {
                                    if (k == 0) {
                                        tj7.j(tj7.J, ((tj6)this).J, super.A0);
                                        tj7.l0 = this.H0;
                                        tj7.f0 = n3;
                                    }
                                    if (k == n - 1) {
                                        tj7.j(tj7.L, ((tj6)this).L, super.B0);
                                    }
                                    if (k > 0 && tj6 != null) {
                                        tj7.j(tj7.J, tj6.L, this.T0);
                                        tj6.j(tj6.L, tj7.J, 0);
                                    }
                                    tj8 = tj7;
                                }
                            }
                        }
                        int l = 0;
                        tj6 tj9 = tj6;
                        while (l < n2) {
                            final tj6 tj10 = this.b1[l];
                            tj6 tj11 = tj9;
                            if (tj10 != null) {
                                if (tj10.i0 == 8) {
                                    tj11 = tj9;
                                }
                                else {
                                    if (l == 0) {
                                        tj10.j(tj10.K, ((tj6)this).K, super.w0);
                                        tj10.m0 = this.I0;
                                        tj10.g0 = this.O0;
                                    }
                                    if (l == n2 - 1) {
                                        tj10.j(tj10.M, ((tj6)this).M, super.x0);
                                    }
                                    if (l > 0 && tj9 != null) {
                                        tj10.j(tj10.K, tj9.M, this.U0);
                                        tj9.j(tj9.M, tj10.K, 0);
                                    }
                                    tj11 = tj10;
                                }
                            }
                            ++l;
                            tj9 = tj11;
                        }
                        for (int n5 = 0; n5 < n; ++n5) {
                            for (int n6 = 0; n6 < n2; ++n6) {
                                int n7 = n6 * n + n5;
                                if (this.Z0 == 1) {
                                    n7 = n5 * n2 + n6;
                                }
                                final tj6[] e1 = this.e1;
                                if (n7 < e1.length) {
                                    final tj6 tj12 = e1[n7];
                                    if (tj12 != null) {
                                        if (tj12.i0 != 8) {
                                            final tj6 tj13 = this.c1[n5];
                                            final tj6 tj14 = this.b1[n6];
                                            if (tj12 != tj13) {
                                                tj12.j(tj12.J, tj13.J, 0);
                                                tj12.j(tj12.L, tj13.L, 0);
                                            }
                                            if (tj12 != tj14) {
                                                tj12.j(tj12.K, tj14.K, 0);
                                                tj12.j(tj12.M, tj14.M, 0);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else {
                for (int size2 = this.a1.size(), n8 = 0; n8 < size2; ++n8) {
                    this.a1.get(n8).b(b2, n8, n8 == size2 - 1);
                }
            }
        }
        else if (this.a1.size() > 0) {
            this.a1.get(0).b(b2, 0, true);
        }
        super.C0 = false;
    }
    
    public final void k(final tj6 tj6, final HashMap<tj6, tj6> hashMap) {
        super.k(tj6, hashMap);
        final d8b d8b = (d8b)tj6;
        this.H0 = d8b.H0;
        this.I0 = d8b.I0;
        this.J0 = d8b.J0;
        this.K0 = d8b.K0;
        this.L0 = d8b.L0;
        this.M0 = d8b.M0;
        this.N0 = d8b.N0;
        this.O0 = d8b.O0;
        this.P0 = d8b.P0;
        this.Q0 = d8b.Q0;
        this.R0 = d8b.R0;
        this.S0 = d8b.S0;
        this.T0 = d8b.T0;
        this.U0 = d8b.U0;
        this.V0 = d8b.V0;
        this.W0 = d8b.W0;
        this.X0 = d8b.X0;
        this.Y0 = d8b.Y0;
        this.Z0 = d8b.Z0;
    }
}
