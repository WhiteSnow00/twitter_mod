import java.util.Iterator;
import androidx.constraintlayout.widget.b$c;
import androidx.constraintlayout.widget.b$a;
import java.util.LinkedHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arh implements Comparable<arh>
{
    public static String[] T0;
    public bq9 C0;
    public int D0;
    public float E0;
    public float F0;
    public float G0;
    public float H0;
    public float I0;
    public float J0;
    public float K0;
    public int L0;
    public int M0;
    public float N0;
    public rqh O0;
    public LinkedHashMap<String, zi6> P0;
    public int Q0;
    public double[] R0;
    public double[] S0;
    
    static {
        arh.T0 = new String[] { "position", "x", "y", "width", "height", "pathRotate" };
    }
    
    public arh() {
        this.D0 = 0;
        this.K0 = Float.NaN;
        this.L0 = -1;
        this.M0 = -1;
        this.N0 = Float.NaN;
        this.O0 = null;
        this.P0 = new LinkedHashMap<String, zi6>();
        this.Q0 = 0;
        this.R0 = new double[18];
        this.S0 = new double[18];
    }
    
    public arh(int o, final int n, final rqe rqe, final arh arh, final arh arh2) {
        this.D0 = 0;
        this.K0 = Float.NaN;
        this.L0 = -1;
        this.M0 = -1;
        this.N0 = Float.NaN;
        this.O0 = null;
        this.P0 = new LinkedHashMap<String, zi6>();
        this.Q0 = 0;
        this.R0 = new double[18];
        this.S0 = new double[18];
        if (arh.M0 != -1) {
            float e0 = ((qpe)rqe).a / 100.0f;
            this.E0 = e0;
            this.D0 = rqe.h;
            this.Q0 = rqe.o;
            float i;
            if (Float.isNaN(rqe.i)) {
                i = e0;
            }
            else {
                i = rqe.i;
            }
            float j;
            if (Float.isNaN(rqe.j)) {
                j = e0;
            }
            else {
                j = rqe.j;
            }
            final float i2 = arh2.I0;
            final float i3 = arh.I0;
            final float j2 = arh2.J0;
            final float j3 = arh.J0;
            this.F0 = this.E0;
            this.I0 = (float)(int)((i2 - i3) * i + i3);
            this.J0 = (float)(int)((j2 - j3) * j + j3);
            o = rqe.o;
            if (o != 1) {
                if (o != 2) {
                    float k;
                    if (Float.isNaN(rqe.k)) {
                        k = e0;
                    }
                    else {
                        k = rqe.k;
                    }
                    final float g0 = arh2.G0;
                    final float g2 = arh.G0;
                    this.G0 = xk0.d(g0, g2, k, g2);
                    if (!Float.isNaN(rqe.l)) {
                        e0 = rqe.l;
                    }
                    final float h0 = arh2.H0;
                    final float h2 = arh.H0;
                    this.H0 = xk0.d(h0, h2, e0, h2);
                }
                else {
                    float d;
                    if (Float.isNaN(rqe.k)) {
                        final float g3 = arh2.G0;
                        final float g4 = arh.G0;
                        d = xk0.d(g3, g4, e0, g4);
                    }
                    else {
                        d = rqe.k * Math.min(j, i);
                    }
                    this.G0 = d;
                    float h5;
                    if (Float.isNaN(rqe.l)) {
                        final float h3 = arh2.H0;
                        final float h4 = arh.H0;
                        h5 = xk0.d(h3, h4, e0, h4);
                    }
                    else {
                        h5 = rqe.l;
                    }
                    this.H0 = h5;
                }
            }
            else {
                float l;
                if (Float.isNaN(rqe.k)) {
                    l = e0;
                }
                else {
                    l = rqe.k;
                }
                final float g5 = arh2.G0;
                final float g6 = arh.G0;
                this.G0 = xk0.d(g5, g6, l, g6);
                if (!Float.isNaN(rqe.l)) {
                    e0 = rqe.l;
                }
                final float h6 = arh2.H0;
                final float h7 = arh.H0;
                this.H0 = xk0.d(h6, h7, e0, h7);
            }
            this.M0 = arh.M0;
            this.C0 = bq9.c(rqe.f);
            this.L0 = rqe.g;
            return;
        }
        final int o2 = rqe.o;
        if (o2 == 1) {
            float m = ((qpe)rqe).a / 100.0f;
            this.E0 = m;
            this.D0 = rqe.h;
            float i4;
            if (Float.isNaN(rqe.i)) {
                i4 = m;
            }
            else {
                i4 = rqe.i;
            }
            float j4;
            if (Float.isNaN(rqe.j)) {
                j4 = m;
            }
            else {
                j4 = rqe.j;
            }
            final float i5 = arh2.I0;
            final float i6 = arh.I0;
            final float j5 = arh2.J0;
            final float j6 = arh.J0;
            this.F0 = this.E0;
            if (!Float.isNaN(rqe.k)) {
                m = rqe.k;
            }
            final float g7 = arh.G0;
            final float i7 = arh.I0;
            final float n2 = i7 / 2.0f;
            final float h8 = arh.H0;
            final float j7 = arh.J0;
            final float n3 = j7 / 2.0f;
            final float g8 = arh2.G0;
            final float n4 = arh2.I0 / 2.0f;
            final float h9 = arh2.H0;
            final float n5 = arh2.J0 / 2.0f;
            final float n6 = n4 + g8 - (n2 + g7);
            final float n7 = n5 + h9 - (n3 + h8);
            final float n8 = n6 * m;
            final float n9 = (i5 - i6) * i4;
            final float n10 = n9 / 2.0f;
            this.G0 = (float)(int)(g7 + n8 - n10);
            final float n11 = m * n7;
            final float n12 = (j5 - j6) * j4;
            final float n13 = n12 / 2.0f;
            this.H0 = (float)(int)(h8 + n11 - n13);
            this.I0 = (float)(int)(i7 + n9);
            this.J0 = (float)(int)(j7 + n12);
            float l2;
            if (Float.isNaN(rqe.l)) {
                l2 = 0.0f;
            }
            else {
                l2 = rqe.l;
            }
            final float n14 = -n7;
            this.Q0 = 1;
            final float n15 = (float)(int)(arh.G0 + n8 - n10);
            final float n16 = (float)(int)(arh.H0 + n11 - n13);
            this.G0 = n15 + n14 * l2;
            this.H0 = n16 + n6 * l2;
            this.M0 = this.M0;
            this.C0 = bq9.c(rqe.f);
            this.L0 = rqe.g;
            return;
        }
        if (o2 != 2) {
            float l3 = ((qpe)rqe).a / 100.0f;
            this.E0 = l3;
            this.D0 = rqe.h;
            float i8;
            if (Float.isNaN(rqe.i)) {
                i8 = l3;
            }
            else {
                i8 = rqe.i;
            }
            float j8;
            if (Float.isNaN(rqe.j)) {
                j8 = l3;
            }
            else {
                j8 = rqe.j;
            }
            final float i9 = arh2.I0;
            final float i10 = arh.I0;
            final float j9 = arh2.J0;
            final float j10 = arh.J0;
            this.F0 = this.E0;
            final float g9 = arh.G0;
            final float n17 = i10 / 2.0f;
            final float h10 = arh.H0;
            final float n18 = j10 / 2.0f;
            final float g10 = arh2.G0;
            final float n19 = i9 / 2.0f;
            final float h11 = arh2.H0;
            final float n20 = j9 / 2.0f;
            final float n21 = n19 + g10 - (n17 + g9);
            final float n22 = n20 + h11 - (n18 + h10);
            final float n23 = (i9 - i10) * i8;
            final float n24 = n23 / 2.0f;
            this.G0 = (float)(int)(n21 * l3 + g9 - n24);
            final float n25 = (j9 - j10) * j8;
            final float n26 = n25 / 2.0f;
            this.H0 = (float)(int)(n22 * l3 + h10 - n26);
            this.I0 = (float)(int)(i10 + n23);
            this.J0 = (float)(int)(j10 + n25);
            float k2;
            if (Float.isNaN(rqe.k)) {
                k2 = l3;
            }
            else {
                k2 = rqe.k;
            }
            float n27;
            if (Float.isNaN(rqe.n)) {
                n27 = 0.0f;
            }
            else {
                n27 = rqe.n;
            }
            if (!Float.isNaN(rqe.l)) {
                l3 = rqe.l;
            }
            float m2;
            if (Float.isNaN(rqe.m)) {
                m2 = 0.0f;
            }
            else {
                m2 = rqe.m;
            }
            this.Q0 = 0;
            this.G0 = (float)(int)(m2 * n22 + (k2 * n21 + arh.G0) - n24);
            this.H0 = (float)(int)(n22 * l3 + (n21 * n27 + arh.H0) - n26);
            this.C0 = bq9.c(rqe.f);
            this.L0 = rqe.g;
            return;
        }
        final float e2 = ((qpe)rqe).a / 100.0f;
        this.E0 = e2;
        this.D0 = rqe.h;
        float i11;
        if (Float.isNaN(rqe.i)) {
            i11 = e2;
        }
        else {
            i11 = rqe.i;
        }
        float j11;
        if (Float.isNaN(rqe.j)) {
            j11 = e2;
        }
        else {
            j11 = rqe.j;
        }
        final float i12 = arh2.I0;
        final float i13 = arh.I0;
        final float j12 = arh2.J0;
        final float j13 = arh.J0;
        this.F0 = this.E0;
        final float g11 = arh.G0;
        final float n28 = i13 / 2.0f;
        final float h12 = arh.H0;
        final float n29 = j13 / 2.0f;
        final float g12 = arh2.G0;
        final float n30 = i12 / 2.0f;
        final float h13 = arh2.H0;
        final float n31 = j12 / 2.0f;
        final float n32 = (i12 - i13) * i11;
        this.G0 = (float)(int)((n30 + g12 - (n28 + g11)) * e2 + g11 - n32 / 2.0f);
        final float n33 = (j12 - j13) * j11;
        this.H0 = (float)(int)((n31 + h13 - (n29 + h12)) * e2 + h12 - n33 / 2.0f);
        this.I0 = (float)(int)(i13 + n32);
        this.J0 = (float)(int)(j13 + n33);
        this.Q0 = 2;
        if (!Float.isNaN(rqe.k)) {
            o -= (int)this.I0;
            this.G0 = (float)(int)(rqe.k * o);
        }
        if (!Float.isNaN(rqe.l)) {
            o = (int)(n - this.J0);
            this.H0 = (float)(int)(rqe.l * o);
        }
        this.M0 = this.M0;
        this.C0 = bq9.c(rqe.f);
        this.L0 = rqe.g;
    }
    
    public final void b(final b$a b$a) {
        this.C0 = bq9.c(b$a.d.d);
        final b$c d = b$a.d;
        this.L0 = d.e;
        this.M0 = d.b;
        this.K0 = d.h;
        this.D0 = d.f;
        final float e = b$a.c.e;
        this.N0 = b$a.e.C;
        for (final String s : b$a.g.keySet()) {
            final zi6 zi6 = b$a.g.get(s);
            if (zi6 != null) {
                final int d2 = nb0.D(zi6.c);
                if (d2 == 4 || d2 == 5 || d2 == 7) {
                    continue;
                }
                this.P0.put(s, zi6);
            }
        }
    }
    
    @Override
    public final int compareTo(final Object o) {
        return Float.compare(this.F0, ((arh)o).F0);
    }
    
    public final boolean e(final float n, final float n2) {
        final boolean naN = Float.isNaN(n);
        final boolean b = true;
        boolean b2 = true;
        if (!naN && !Float.isNaN(n2)) {
            if (Math.abs(n - n2) <= 1.0E-6f) {
                b2 = false;
            }
            return b2;
        }
        return Float.isNaN(n) != Float.isNaN(n2) && b;
    }
    
    public final void f(double n, final int[] array, final double[] array2, final float[] array3, final int n2) {
        float g0 = this.G0;
        float h0 = this.H0;
        float i0 = this.I0;
        float j0 = this.J0;
        for (int k = 0; k < array.length; ++k) {
            final float n3 = (float)array2[k];
            final int n4 = array[k];
            if (n4 != 1) {
                if (n4 != 2) {
                    if (n4 != 3) {
                        if (n4 == 4) {
                            j0 = n3;
                        }
                    }
                    else {
                        i0 = n3;
                    }
                }
                else {
                    h0 = n3;
                }
            }
            else {
                g0 = n3;
            }
        }
        final rqh o0 = this.O0;
        float n5 = g0;
        float n6 = h0;
        if (o0 != null) {
            final float[] array4 = new float[2];
            o0.b(n, array4, new float[2]);
            final float n7 = array4[0];
            final float n8 = array4[1];
            n = n7;
            final double n9 = g0;
            final double n10 = h0;
            n5 = (float)(Math.sin(n10) * n9 + n - i0 / 2.0f);
            n6 = (float)(n8 - Math.cos(n10) * n9 - j0 / 2.0f);
        }
        array3[n2] = i0 / 2.0f + n5 + 0.0f;
        array3[n2 + 1] = j0 / 2.0f + n6 + 0.0f;
    }
    
    public final void g(final float g0, final float h0, final float i0, final float j0) {
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
    }
    
    public final void i(final float n, final float n2, final float[] array, final int[] array2, final double[] array3, final double[] array4) {
        int i = 0;
        float n3 = 0.0f;
        float n4 = 0.0f;
        float n5 = 0.0f;
        float n6 = 0.0f;
        while (i < array2.length) {
            final float n7 = (float)array3[i];
            final double n8 = array4[i];
            final int n9 = array2[i];
            if (n9 != 1) {
                if (n9 != 2) {
                    if (n9 != 3) {
                        if (n9 == 4) {
                            n6 = n7;
                        }
                    }
                    else {
                        n4 = n7;
                    }
                }
                else {
                    n5 = n7;
                }
            }
            else {
                n3 = n7;
            }
            ++i;
        }
        final float n10 = n3 - 0.0f * n4 / 2.0f;
        final float n11 = n5 - 0.0f * n6 / 2.0f;
        array[0] = (n4 * 1.0f + n10) * n + (1.0f - n) * n10 + 0.0f;
        array[1] = (n6 * 1.0f + n11) * n2 + (1.0f - n2) * n11 + 0.0f;
    }
    
    public final void j(final rqh o0, final arh arh) {
        final double n = this.I0 / 2.0f + this.G0 - arh.G0 - arh.I0 / 2.0f;
        final double n2 = this.J0 / 2.0f + this.H0 - arh.H0 - arh.J0 / 2.0f;
        this.O0 = o0;
        this.G0 = (float)Math.hypot(n2, n);
        if (Float.isNaN(this.N0)) {
            this.H0 = (float)(Math.atan2(n2, n) + 1.5707963267948966);
        }
        else {
            this.H0 = (float)Math.toRadians(this.N0);
        }
    }
}
