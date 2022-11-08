import java.util.Arrays;
import android.graphics.Color;
import java.util.ArrayList;
import android.graphics.Bitmap;
import android.util.SparseBooleanArray;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jvj
{
    public static final jvj$a f;
    public final List<e> a;
    public final List<mas> b;
    public final Map<mas, e> c;
    public final SparseBooleanArray d;
    public final e e;
    
    static {
        f = new jvj$a();
    }
    
    public jvj(final List<e> a, final List<mas> b) {
        this.a = a;
        this.b = b;
        this.d = new SparseBooleanArray();
        this.c = new at0();
        final int size = a.size();
        int n = Integer.MIN_VALUE;
        e e = null;
        int n2;
        for (int i = 0; i < size; ++i, n = n2) {
            final e e2 = this.a.get(i);
            final int e3 = e2.e;
            if (e3 > (n2 = n)) {
                e = e2;
                n2 = e3;
            }
        }
        this.e = e;
    }
    
    public final e a(final mas mas) {
        return (e)((l7q)this.c).getOrDefault((Object)mas, (Object)null);
    }
    
    public static final class b
    {
        public final Bitmap a;
        public final List<mas> b;
        public int c;
        public int d;
        public int e;
        public final List<c> f;
        
        public b(final Bitmap a) {
            final ArrayList b = new ArrayList();
            this.b = b;
            this.c = 16;
            this.d = 12544;
            this.e = -1;
            final ArrayList f = new ArrayList();
            this.f = f;
            if (a != null && !a.isRecycled()) {
                f.add(jvj.f);
                this.a = a;
                b.add(mas.d);
                b.add(mas.e);
                b.add(mas.f);
                b.add(mas.g);
                b.add(mas.h);
                b.add(mas.i);
                return;
            }
            throw new IllegalArgumentException("Bitmap is not valid");
        }
        
        public final jvj a() {
            Bitmap bitmap = this.a;
            if (bitmap != null) {
                final int d = this.d;
                final double n = -1.0;
                double sqrt;
                if (d > 0) {
                    final int n2 = bitmap.getHeight() * bitmap.getWidth();
                    final int d2 = this.d;
                    sqrt = n;
                    if (n2 > d2) {
                        sqrt = Math.sqrt(d2 / (double)n2);
                    }
                }
                else {
                    sqrt = n;
                    if (this.e > 0) {
                        final int max = Math.max(bitmap.getWidth(), bitmap.getHeight());
                        final int e = this.e;
                        sqrt = n;
                        if (max > e) {
                            sqrt = e / (double)max;
                        }
                    }
                }
                if (sqrt > 0.0) {
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int)Math.ceil(bitmap.getWidth() * sqrt), (int)Math.ceil(bitmap.getHeight() * sqrt), false);
                }
                final int width = bitmap.getWidth();
                final int height = bitmap.getHeight();
                final int[] array = new int[width * height];
                bitmap.getPixels(array, 0, width, 0, 0, width, height);
                final int c = this.c;
                c[] array2;
                if (this.f.isEmpty()) {
                    array2 = null;
                }
                else {
                    final ArrayList f = this.f;
                    array2 = f.toArray(new c[f.size()]);
                }
                final qr4 qr4 = new qr4(array, c, array2);
                if (bitmap != this.a) {
                    bitmap.recycle();
                }
                final ArrayList c2 = qr4.c;
                final ArrayList b = this.b;
                final jvj jvj = new jvj(c2, b);
                for (int size = b.size(), i = 0; i < size; ++i) {
                    final mas mas = jvj.b.get(i);
                    final int length = mas.c.length;
                    int j = 0;
                    float n3 = 0.0f;
                    while (j < length) {
                        final float n4 = mas.c[j];
                        float n5 = n3;
                        if (n4 > 0.0f) {
                            n5 = n3 + n4;
                        }
                        ++j;
                        n3 = n5;
                    }
                    if (n3 != 0.0f) {
                        for (int length2 = mas.c.length, k = 0; k < length2; ++k) {
                            final float[] c3 = mas.c;
                            if (c3[k] > 0.0f) {
                                c3[k] /= n3;
                            }
                        }
                    }
                    final at0 c4 = jvj.c;
                    final int size2 = jvj.a.size();
                    int l = 0;
                    e e2 = null;
                    float n6 = 0.0f;
                    while (l < size2) {
                        final e e3 = jvj.a.get(l);
                        final float[] b2 = e3.b();
                        final float n7 = b2[1];
                        final float[] a = mas.a;
                        boolean b4 = false;
                        Label_0574: {
                            if (n7 >= a[0] && b2[1] <= a[2]) {
                                final float n8 = b2[2];
                                final float[] b3 = mas.b;
                                if (n8 >= b3[0] && b2[2] <= b3[2] && !jvj.d.get(e3.d)) {
                                    b4 = true;
                                    break Label_0574;
                                }
                            }
                            b4 = false;
                        }
                        float n13 = 0.0f;
                        Label_0794: {
                            if (b4) {
                                final float[] b5 = e3.b();
                                final e e4 = jvj.e;
                                int e5;
                                if (e4 != null) {
                                    e5 = e4.e;
                                }
                                else {
                                    e5 = 1;
                                }
                                final float[] c5 = mas.c;
                                float n9;
                                if (c5[0] > 0.0f) {
                                    n9 = (1.0f - Math.abs(b5[1] - mas.a[1])) * c5[0];
                                }
                                else {
                                    n9 = 0.0f;
                                }
                                final float[] c6 = mas.c;
                                float n10;
                                if (c6[1] > 0.0f) {
                                    n10 = (1.0f - Math.abs(b5[2] - mas.b[1])) * c6[1];
                                }
                                else {
                                    n10 = 0.0f;
                                }
                                final float[] c7 = mas.c;
                                float n11;
                                if (c7[2] > 0.0f) {
                                    n11 = e3.e / (float)e5 * c7[2];
                                }
                                else {
                                    n11 = 0.0f;
                                }
                                final float n12 = n9 + n10 + n11;
                                if (e2 != null) {
                                    n13 = n6;
                                    if (n12 <= n6) {
                                        break Label_0794;
                                    }
                                }
                                n13 = n12;
                                e2 = e3;
                            }
                            else {
                                n13 = n6;
                            }
                        }
                        ++l;
                        n6 = n13;
                    }
                    if (e2 != null) {
                        jvj.d.append(e2.d, true);
                    }
                    ((l7q)c4).put((Object)mas, (Object)e2);
                }
                jvj.d.clear();
                return jvj;
            }
            throw new AssertionError();
        }
    }
    
    public interface c
    {
        boolean a(final float[] p0);
    }
    
    public interface d
    {
    }
    
    public static final class e
    {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public boolean f;
        public int g;
        public int h;
        public float[] i;
        
        public e(final int d, final int e) {
            this.a = Color.red(d);
            this.b = Color.green(d);
            this.c = Color.blue(d);
            this.d = d;
            this.e = e;
        }
        
        public final void a() {
            if (!this.f) {
                final int f = gs4.f(-1, this.d, 4.5f);
                final int f2 = gs4.f(-1, this.d, 3.0f);
                if (f != -1 && f2 != -1) {
                    this.h = gs4.k(-1, f);
                    this.g = gs4.k(-1, f2);
                    this.f = true;
                    return;
                }
                final int f3 = gs4.f(-16777216, this.d, 4.5f);
                final int f4 = gs4.f(-16777216, this.d, 3.0f);
                if (f3 != -1 && f4 != -1) {
                    this.h = gs4.k(-16777216, f3);
                    this.g = gs4.k(-16777216, f4);
                    this.f = true;
                    return;
                }
                int h;
                if (f != -1) {
                    h = gs4.k(-1, f);
                }
                else {
                    h = gs4.k(-16777216, f3);
                }
                this.h = h;
                int g;
                if (f2 != -1) {
                    g = gs4.k(-1, f2);
                }
                else {
                    g = gs4.k(-16777216, f4);
                }
                this.g = g;
                this.f = true;
            }
        }
        
        public final float[] b() {
            if (this.i == null) {
                this.i = new float[3];
            }
            gs4.a(this.a, this.b, this.c, this.i);
            return this.i;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && e.class == o.getClass()) {
                final e e = (e)o;
                if (this.e != e.e || this.d != e.d) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public final int hashCode() {
            return this.d * 31 + this.e;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder(e.class.getSimpleName());
            sb.append(" [RGB: #");
            sb.append(Integer.toHexString(this.d));
            sb.append(']');
            sb.append(" [HSL: ");
            sb.append(Arrays.toString(this.b()));
            sb.append(']');
            sb.append(" [Population: ");
            sb.append(this.e);
            sb.append(']');
            sb.append(" [Title Text: #");
            this.a();
            sb.append(Integer.toHexString(this.g));
            sb.append(']');
            sb.append(" [Body Text: #");
            this.a();
            sb.append(Integer.toHexString(this.h));
            sb.append(']');
            return sb.toString();
        }
    }
}
