import java.util.Arrays;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bxm extends yq4
{
    public static final bxm.bxm$h Companion;
    public static final qsb<Double, Double> p;
    public final jox d;
    public final float e;
    public final float f;
    public final qyt g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final qsb<Double, Double> k;
    public final qsb<Double, Double> l;
    public final qsb<Double, Double> m;
    public final qsb<Double, Double> n;
    public final boolean o;
    
    static {
        Companion = new bxm.bxm$h();
        bxm.p = bxm$g.D0;
    }
    
    public bxm(final String s, final float[] array, final jox jox, final double n, final float n2, final float n3, final int n4) {
        final int n5 = 0;
        final double n6 = dcmpg(n, 1.0);
        Object p7;
        if (n6 == 0) {
            p7 = bxm.p;
        }
        else {
            p7 = new bxm$e(n);
        }
        int n7 = n5;
        if (n6 == 0) {
            n7 = 1;
        }
        Object p8;
        if (n7 != 0) {
            p8 = bxm.p;
        }
        else {
            p8 = new bxm$f(n);
        }
        this(s, array, jox, null, (qsb<? super Double, Double>)p7, (qsb<? super Double, Double>)p8, n2, n3, new qyt(n, 1.0, 0.0, 0.0, 0.0), n4);
    }
    
    public bxm(final String s, final float[] array, final jox jox, final qyt qyt, final int n) {
        final double f = qyt.f;
        final int n2 = 0;
        Object o;
        if (f == 0.0 && qyt.g == 0.0) {
            o = new bxm$a(qyt);
        }
        else {
            o = new bxm$b(qyt);
        }
        Object o2 = null;
        Label_0151: {
            if (qyt.f == 0.0) {
                int n3 = n2;
                if (qyt.g == 0.0) {
                    n3 = 1;
                }
                if (n3 != 0) {
                    o2 = new bxm$c(qyt);
                    break Label_0151;
                }
            }
            o2 = new bxm$d(qyt);
        }
        this(s, array, jox, null, (qsb<? super Double, Double>)o, (qsb<? super Double, Double>)o2, 0.0f, 1.0f, qyt, n);
    }
    
    public bxm(final String s, float[] array, final jox d, float[] i, final qsb<? super Double, Double> k, final qsb<? super Double, Double> m, final float e, final float f, final qyt g, int j) {
        czd.f((Object)s, "name");
        czd.f((Object)array, "primaries");
        czd.f((Object)k, "oetf");
        czd.f((Object)m, "eotf");
        Objects.requireNonNull(tq4.Companion);
        final tq4$a companion = tq4.Companion;
        super(s, tq4.a, j);
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.k = (qsb<Double, Double>)k;
        this.l = new bxm$j(this);
        this.m = (qsb<Double, Double>)m;
        this.n = new bxm$i(this);
        if (array.length != 6 && array.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (e < f) {
            final bxm.bxm$h companion2 = bxm.Companion;
            Objects.requireNonNull(companion2);
            final float[] h = new float[6];
            if (array.length == 9) {
                final float n = array[0] + array[1] + array[2];
                h[0] = array[0] / n;
                h[1] = array[1] / n;
                final float n2 = array[3] + array[4] + array[5];
                h[2] = array[3] / n2;
                h[3] = array[4] / n2;
                final float n3 = array[6] + array[7] + array[8];
                h[4] = array[6] / n3;
                h[5] = array[7] / n3;
            }
            else {
                System.arraycopy(array, 0, h, 0, 6);
            }
            this.h = h;
            if (i == null) {
                final float n4 = h[0];
                final float n5 = h[1];
                final float n6 = h[2];
                final float n7 = h[3];
                final float n8 = h[4];
                final float n9 = h[5];
                final float a = d.a;
                final float b = d.b;
                final float n10 = 1;
                final float n11 = (n10 - n4) / n5;
                final float n12 = (n10 - n6) / n7;
                final float n13 = (n10 - n8) / n9;
                final float n14 = (n10 - a) / b;
                final float n15 = n4 / n5;
                final float n16 = n6 / n7;
                final float n17 = n8 / n9;
                final float n18 = a / b;
                final float n19 = n16 - n15;
                final float n20 = n18 - n15;
                final float n21 = n12 - n11;
                final float n22 = n17 - n15;
                final float n23 = ((n14 - n11) * n19 - n20 * n21) / ((n13 - n11) * n19 - n21 * n22);
                final float o = jxa.o(n22, n23, n20, n19);
                final float n24 = 1.0f - o - n23;
                final float n25 = n24 / n5;
                final float n26 = o / n7;
                final float n27 = n23 / n9;
                this.i = new float[] { n25 * n4, n24, (1.0f - n4 - n5) * n25, n26 * n6, o, (1.0f - n6 - n7) * n26, n27 * n8, n23, (1.0f - n8 - n9) * n27 };
            }
            else {
                if (i.length != 9) {
                    final StringBuilder l = fu8.j("Transform must have 9 entries! Has ");
                    l.append(i.length);
                    throw new IllegalArgumentException(l.toString());
                }
                this.i = i;
            }
            this.j = uoz.G(this.i);
            final float a2 = companion2.a(h);
            final zq4 a3 = zq4.a;
            if (a2 / companion2.a(zq4.c) > 0.9f) {
                array = zq4.b;
                i = new float[] { h[0] - array[0], h[1] - array[1], h[2] - array[2], h[3] - array[3], h[4] - array[4], h[5] - array[5] };
                if ((array[1] - array[5]) * i[0] - i[1] * (array[0] - array[4]) >= 0.0f) {
                    if ((array[0] - array[2]) * i[1] - (array[1] - array[3]) * i[0] >= 0.0f) {
                        if ((array[3] - array[1]) * i[2] - i[3] * (array[2] - array[0]) >= 0.0f) {
                            if ((array[2] - array[4]) * i[3] - (array[3] - array[5]) * i[2] >= 0.0f) {
                                if ((array[5] - array[3]) * i[4] - i[5] * (array[4] - array[2]) >= 0.0f) {
                                    final float n28 = array[4];
                                    final float n29 = array[0];
                                    final float n30 = array[5];
                                    final float n31 = array[1];
                                    final float n32 = i[4];
                                    final float n33 = i[5];
                                }
                            }
                        }
                    }
                }
            }
            boolean o2 = false;
            Label_1240: {
                Label_1237: {
                    if (j != 0) {
                        array = zq4.b;
                        Label_1100: {
                            if (h != array) {
                                for (j = 0; j < 6; ++j) {
                                    if (Float.compare(h[j], array[j]) != 0 && Math.abs(h[j] - array[j]) > 0.001f) {
                                        j = 0;
                                        break Label_1100;
                                    }
                                }
                            }
                            j = 1;
                        }
                        Label_1220: {
                            if (j != 0) {
                                if (uoz.p(d, xli.L0)) {
                                    if (e == 0.0f) {
                                        j = 1;
                                    }
                                    else {
                                        j = 0;
                                    }
                                    if (j != 0) {
                                        if (f == 1.0f) {
                                            j = 1;
                                        }
                                        else {
                                            j = 0;
                                        }
                                        if (j != 0) {
                                            final zq4 a4 = zq4.a;
                                            final bxm d2 = zq4.d;
                                            for (double n34 = 0.0; n34 <= 1.0; n34 += 0.00392156862745098) {
                                                if (!companion2.b(n34, (qsb)k, (qsb)d2.k)) {
                                                    break Label_1220;
                                                }
                                                if (!companion2.b(n34, (qsb)m, (qsb)d2.m)) {
                                                    break Label_1220;
                                                }
                                            }
                                            break Label_1237;
                                        }
                                    }
                                }
                            }
                        }
                        o2 = false;
                        break Label_1240;
                    }
                }
                o2 = true;
            }
            this.o = o2;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid range: min=");
        sb.append(e);
        sb.append(", max=");
        sb.append(f);
        sb.append("; min must be strictly < max");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final float[] a(final float[] array) {
        czd.f((Object)array, "v");
        uoz.P(this.j, array);
        array[0] = (float)((Number)this.l.invoke((Object)(double)array[0])).doubleValue();
        array[1] = (float)((Number)this.l.invoke((Object)(double)array[1])).doubleValue();
        array[2] = (float)((Number)this.l.invoke((Object)(double)array[2])).doubleValue();
        return array;
    }
    
    public final float b(final int n) {
        return this.f;
    }
    
    public final float c(final int n) {
        return this.e;
    }
    
    public final boolean d() {
        return this.o;
    }
    
    public final float[] e(final float[] array) {
        array[0] = (float)((Number)this.n.invoke((Object)(double)array[0])).doubleValue();
        array[1] = (float)((Number)this.n.invoke((Object)(double)array[1])).doubleValue();
        array[2] = (float)((Number)this.n.invoke((Object)(double)array[2])).doubleValue();
        uoz.P(this.i, array);
        return array;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        boolean a;
        final boolean b = a = false;
        if (o != null) {
            if (!czd.a((Object)v9m.a((Class)bxm.class), (Object)v9m.a((Class)o.getClass()))) {
                a = b;
            }
            else {
                if (!super.equals(o)) {
                    return false;
                }
                final bxm bxm = (bxm)o;
                if (Float.compare(bxm.e, this.e) != 0) {
                    return false;
                }
                if (Float.compare(bxm.f, this.f) != 0) {
                    return false;
                }
                if (!czd.a((Object)this.d, (Object)bxm.d)) {
                    return false;
                }
                if (!Arrays.equals(this.h, bxm.h)) {
                    return false;
                }
                final qyt g = this.g;
                if (g != null) {
                    return czd.a((Object)g, (Object)bxm.g);
                }
                if (bxm.g == null) {
                    return true;
                }
                if (!czd.a((Object)this.k, (Object)bxm.k)) {
                    a = b;
                }
                else {
                    a = czd.a((Object)this.m, (Object)bxm.m);
                }
            }
        }
        return a;
    }
    
    public final int hashCode() {
        final int hashCode = super.hashCode();
        final int hashCode2 = this.d.hashCode();
        final int hashCode3 = Arrays.hashCode(this.h);
        final float e = this.e;
        boolean b = true;
        int hashCode4 = 0;
        int floatToIntBits;
        if (e != 0.0f) {
            floatToIntBits = Float.floatToIntBits(e);
        }
        else {
            floatToIntBits = 0;
        }
        final float f = this.f;
        if (f != 0.0f) {
            b = false;
        }
        int floatToIntBits2;
        if (!b) {
            floatToIntBits2 = Float.floatToIntBits(f);
        }
        else {
            floatToIntBits2 = 0;
        }
        final qyt g = this.g;
        if (g != null) {
            hashCode4 = g.hashCode();
        }
        int n = (((hashCode3 + (hashCode2 + hashCode * 31) * 31) * 31 + floatToIntBits) * 31 + floatToIntBits2) * 31 + hashCode4;
        if (this.g == null) {
            n = this.m.hashCode() + (this.k.hashCode() + n * 31) * 31;
        }
        return n;
    }
}
