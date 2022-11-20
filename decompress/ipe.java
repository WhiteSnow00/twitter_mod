import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ipe
{
    public a a;
    public String b;
    public int c;
    public String d;
    public int e;
    public ArrayList<b> f;
    
    public ipe() {
        this.c = 0;
        this.d = null;
        this.e = 0;
        this.f = new ArrayList<b>();
    }
    
    public final float a(float n) {
        final a a = this.a;
        final m97 g = a.g;
        if (g != null) {
            g.c((double)n, a.h);
        }
        else {
            final double[] h = a.h;
            h[0] = a.e[0];
            h[1] = a.f[0];
            h[2] = a.b[0];
        }
        final double[] h2 = a.h;
        final double n2 = h2[0];
        final double n3 = h2[1];
        final voj a2 = a.a;
        final double n4 = n;
        double n5 = 0.0;
        double n6;
        if (n4 < 0.0) {
            n6 = 0.0;
        }
        else {
            n6 = n4;
            if (n4 > 1.0) {
                n6 = 1.0;
            }
        }
        final int binarySearch = Arrays.binarySearch(a2.b, n6);
        if (binarySearch > 0) {
            n5 = 1.0;
        }
        else if (binarySearch != 0) {
            final int n7 = -binarySearch - 1;
            final float[] a3 = a2.a;
            n = a3[n7];
            final int n8 = n7 - 1;
            final double n9 = n - a3[n8];
            final double[] b = a2.b;
            final double n10 = n9 / (b[n7] - b[n8]);
            n5 = (n6 * n6 - b[n8] * b[n8]) * n10 / 2.0 + ((n6 - b[n8]) * (a3[n8] - b[n8] * n10) + a2.c[n8]);
        }
        final double n11 = n5 + n3;
        double abs = 0.0;
        switch (a2.e) {
            default: {
                final double n12 = Math.sin(n11 * 6.283185307179586);
                return (float)(n12 * a.h[2] + n2);
            }
            case 7: {
                final double n12 = a2.d.b(n11 % 1.0);
                return (float)(n12 * a.h[2] + n2);
            }
            case 6: {
                final double n13 = 1.0 - Math.abs(n11 * 4.0 % 4.0 - 2.0);
                abs = n13 * n13;
                break;
            }
            case 5: {
                final double n12 = Math.cos((n3 + n11) * 6.283185307179586);
                return (float)(n12 * a.h[2] + n2);
            }
            case 4: {
                abs = (n11 * 2.0 + 1.0) % 2.0;
                break;
            }
            case 3: {
                final double n12 = (n11 * 2.0 + 1.0) % 2.0 - 1.0;
                return (float)(n12 * a.h[2] + n2);
            }
            case 2: {
                abs = Math.abs((n11 * 4.0 + 1.0) % 4.0 - 2.0);
                break;
            }
            case 1: {
                final double n12 = Math.signum(0.5 - n11 % 1.0);
                return (float)(n12 * a.h[2] + n2);
            }
        }
        final double n12 = 1.0 - abs;
        return (float)(n12 * a.h[2] + n2);
    }
    
    public void b(final Object o) {
    }
    
    public final void c() {
        final int size = this.f.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.f, (Comparator<? super b>)new hpe());
        final double[] array = new double[size];
        final double[][] array2 = new double[size][3];
        this.a = new a(this.c, this.d, size);
        final Iterator<b> iterator = this.f.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final b b = iterator.next();
            final float d = b.d;
            array[n] = d * 0.01;
            final double[] array3 = array2[n];
            final float b2 = b.b;
            array3[0] = b2;
            final double[] array4 = array2[n];
            final float c = b.c;
            array4[1] = c;
            final double[] array5 = array2[n];
            final float e = b.e;
            array5[2] = e;
            final a a = this.a;
            a.c[n] = b.a / 100.0;
            a.d[n] = d;
            a.e[n] = c;
            a.f[n] = e;
            a.b[n] = b2;
            ++n;
        }
        final a a2 = this.a;
        final double[][] array6 = new double[a2.c.length][3];
        final float[] b3 = a2.b;
        a2.h = new double[b3.length + 2];
        final double[] array7 = new double[b3.length + 2];
        if (a2.c[0] > 0.0) {
            a2.a.a(0.0, a2.d[0]);
        }
        final double[] c2 = a2.c;
        final int n2 = c2.length - 1;
        if (c2[n2] < 1.0) {
            a2.a.a(1.0, a2.d[n2]);
        }
        for (int i = 0; i < array6.length; ++i) {
            array6[i][0] = a2.e[i];
            array6[i][1] = a2.f[i];
            array6[i][2] = a2.b[i];
            a2.a.a(a2.c[i], a2.d[i]);
        }
        final voj a3 = a2.a;
        double n3 = 0.0;
        int n4 = 0;
        while (true) {
            final float[] a4 = a3.a;
            if (n4 >= a4.length) {
                break;
            }
            n3 += a4[n4];
            ++n4;
        }
        double n5 = 0.0;
        int n6 = 1;
        while (true) {
            final float[] a5 = a3.a;
            if (n6 >= a5.length) {
                break;
            }
            final int n7 = n6 - 1;
            final float n8 = (a5[n7] + a5[n6]) / 2.0f;
            final double[] b4 = a3.b;
            n5 += (b4[n6] - b4[n7]) * n8;
            ++n6;
        }
        int n9 = 0;
        while (true) {
            final float[] a6 = a3.a;
            if (n9 >= a6.length) {
                break;
            }
            a6[n9] *= (float)(n3 / n5);
            ++n9;
        }
        a3.c[0] = 0.0;
        int n10 = 1;
        while (true) {
            final float[] a7 = a3.a;
            if (n10 >= a7.length) {
                break;
            }
            final int n11 = n10 - 1;
            final float n12 = (a7[n11] + a7[n10]) / 2.0f;
            final double[] b5 = a3.b;
            final double n13 = b5[n10];
            final double n14 = b5[n11];
            final double[] c3 = a3.c;
            c3[n10] = (n13 - n14) * n12 + c3[n11];
            ++n10;
        }
        final double[] c4 = a2.c;
        if (c4.length > 1) {
            a2.g = m97.a(0, c4, array6);
        }
        else {
            a2.g = null;
        }
        m97.a(0, array, array2);
    }
    
    @Override
    public final String toString() {
        String s = this.b;
        final DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (final b b : this.f) {
            final StringBuilder b2 = kgi.b(s, "[");
            b2.append(b.a);
            b2.append(" , ");
            b2.append(decimalFormat.format(b.b));
            b2.append("] ");
            s = b2.toString();
        }
        return s;
    }
    
    public static final class a
    {
        public voj a;
        public float[] b;
        public double[] c;
        public float[] d;
        public float[] e;
        public float[] f;
        public m97 g;
        public double[] h;
        
        public a(int i, final String s, final int n) {
            final voj a = new voj();
            this.a = a;
            a.e = i;
            if (s != null) {
                final double[] array = new double[s.length() / 2];
                int n2;
                int j;
                for (n2 = s.indexOf(40) + 1, j = s.indexOf(44, n2), i = 0; j != -1; j = s.indexOf(44, n2), ++i) {
                    array[i] = Double.parseDouble(s.substring(n2, j).trim());
                    n2 = j + 1;
                }
                array[i] = Double.parseDouble(s.substring(n2, s.indexOf(41, n2)).trim());
                final double[] copy = Arrays.copyOf(array, i + 1);
                i = copy.length * 3 - 2;
                final int n3 = copy.length - 1;
                final double n4 = 1.0 / n3;
                final double[][] array2 = new double[i][1];
                final double[] array3 = new double[i];
                double n5;
                int n6;
                double n7;
                int n8;
                int n9;
                for (i = 0; i < copy.length; ++i) {
                    n5 = copy[i];
                    n6 = i + n3;
                    array2[n6][0] = n5;
                    n7 = i * n4;
                    array3[n6] = n7;
                    if (i > 0) {
                        n8 = n3 * 2 + i;
                        array2[n8][0] = n5 + 1.0;
                        array3[n8] = n7 + 1.0;
                        n9 = i - 1;
                        array2[n9][0] = n5 - 1.0 - n4;
                        array3[n9] = n7 - 1.0 - n4;
                    }
                }
                a.d = new gqh(array3, array2);
            }
            this.b = new float[n];
            this.c = new double[n];
            this.d = new float[n];
            this.e = new float[n];
            this.f = new float[n];
            final float[] array4 = new float[n];
        }
    }
    
    public static final class b
    {
        public int a;
        public float b;
        public float c;
        public float d;
        public float e;
        
        public b(final int a, final float d, final float c, final float e, final float b) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
    }
}
