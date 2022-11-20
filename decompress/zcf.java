import java.util.Iterator;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import java.util.Objects;
import android.os.Build$VERSION;
import android.graphics.Shader;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zcf extends yqp
{
    public final List<nq4> c;
    public final List<Float> d;
    public final long e;
    public final long f;
    public final int g;
    
    public zcf(final List c, final long e, final long f, final int g) {
        this.c = c;
        this.d = null;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final Shader b(long n) {
        float n2;
        if (wfj.d(this.e) == Float.POSITIVE_INFINITY) {
            n2 = ddq.d(n);
        }
        else {
            n2 = wfj.d(this.e);
        }
        float n3;
        if (wfj.e(this.e) == Float.POSITIVE_INFINITY) {
            n3 = ddq.b(n);
        }
        else {
            n3 = wfj.e(this.e);
        }
        float n4;
        if (wfj.d(this.f) == Float.POSITIVE_INFINITY) {
            n4 = ddq.d(n);
        }
        else {
            n4 = wfj.d(this.f);
        }
        float n5;
        if (wfj.e(this.f) == Float.POSITIVE_INFINITY) {
            n5 = ddq.b(n);
        }
        else {
            n5 = wfj.e(this.f);
        }
        final List<nq4> c = this.c;
        final List<Float> d = this.d;
        final long a = wj1.a(n2, n3);
        n = wj1.a(n4, n5);
        final int g = this.g;
        czd.f((Object)c, "colors");
        if (d == null) {
            if (c.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        }
        else if (c.size() != d.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
        int n6;
        if (Build$VERSION.SDK_INT >= 26) {
            n6 = 0;
        }
        else {
            final int o = s9i.o(c);
            int n7 = 1;
            int n8 = 0;
            while (true) {
                n6 = n8;
                if (n7 >= o) {
                    break;
                }
                final boolean b = nq4.d(c.get(n7).a) == 0.0f;
                int n9 = n8;
                if (b) {
                    n9 = n8 + 1;
                }
                ++n7;
                n8 = n9;
            }
        }
        final float d2 = wfj.d(a);
        final float e = wfj.e(a);
        final float d3 = wfj.d(n);
        final float e2 = wfj.e(n);
        int[] array;
        if (Build$VERSION.SDK_INT >= 26) {
            final int size = c.size();
            array = new int[size];
            for (int i = 0; i < size; ++i) {
                array[i] = q3j.f0(((nq4)c.get(i)).a);
            }
        }
        else {
            array = new int[c.size() + n6];
            final int o2 = s9i.o(c);
            final int size2 = c.size();
            int j = 0;
            int n10 = 0;
            while (j < size2) {
                n = ((nq4)c.get(j)).a;
                if (nq4.d(n) == 0.0f) {
                    if (j == 0) {
                        final int n11 = n10 + 1;
                        array[n10] = q3j.f0(nq4.b(c.get(1).a, 0.0f));
                        n10 = n11;
                    }
                    else if (j == o2) {
                        final int n12 = n10 + 1;
                        array[n10] = q3j.f0(nq4.b(c.get(j - 1).a, 0.0f));
                        n10 = n12;
                    }
                    else {
                        n = ((nq4)c.get(j - 1)).a;
                        final int n13 = n10 + 1;
                        array[n10] = q3j.f0(nq4.b(n, 0.0f));
                        array[n13] = q3j.f0(nq4.b(c.get(j + 1).a, 0.0f));
                        n10 = n13 + 1;
                    }
                }
                else {
                    array[n10] = q3j.f0(n);
                    ++n10;
                }
                ++j;
            }
        }
        float[] array4;
        if (n6 == 0) {
            float[] array3;
            if (d != null) {
                final float[] array2 = new float[d.size()];
                final Iterator iterator = d.iterator();
                int n14 = 0;
                while (true) {
                    array3 = array2;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    array2[n14] = ((Number)iterator.next()).floatValue();
                    ++n14;
                }
            }
            else {
                array3 = null;
            }
            array4 = array3;
        }
        else {
            array4 = new float[c.size() + n6];
            float floatValue;
            if (d != null) {
                floatValue = d.get(0).floatValue();
            }
            else {
                floatValue = 0.0f;
            }
            array4[0] = floatValue;
            final int o3 = s9i.o(c);
            int k = 1;
            int n15 = 1;
            while (k < o3) {
                n = ((nq4)c.get(k)).a;
                float floatValue2;
                if (d != null) {
                    floatValue2 = d.get(k).floatValue();
                }
                else {
                    floatValue2 = k / (float)s9i.o(c);
                }
                final int n16 = n15 + 1;
                array4[n15] = floatValue2;
                if (nq4.d(n) == 0.0f) {
                    n15 = n16 + 1;
                    array4[n16] = floatValue2;
                }
                else {
                    n15 = n16;
                }
                ++k;
            }
            float floatValue3;
            if (d != null) {
                floatValue3 = d.get(s9i.o(c)).floatValue();
            }
            else {
                floatValue3 = 1.0f;
            }
            array4[n15] = floatValue3;
        }
        Objects.requireNonNull(cqs.Companion);
        Shader$TileMode shader$TileMode;
        if (g == 0) {
            shader$TileMode = Shader$TileMode.CLAMP;
        }
        else {
            final int n17 = 1;
            if (g == 1) {
                shader$TileMode = Shader$TileMode.REPEAT;
            }
            else if (g == 2) {
                shader$TileMode = Shader$TileMode.MIRROR;
            }
            else {
                int n18;
                if (g == 3) {
                    n18 = n17;
                }
                else {
                    n18 = 0;
                }
                if (n18 != 0) {
                    if (Build$VERSION.SDK_INT >= 31) {
                        shader$TileMode = dqs.a.b();
                    }
                    else {
                        shader$TileMode = Shader$TileMode.CLAMP;
                    }
                }
                else {
                    shader$TileMode = Shader$TileMode.CLAMP;
                }
            }
        }
        return (Shader)new LinearGradient(d2, e, d3, e2, array, array4, shader$TileMode);
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof zcf)) {
            return false;
        }
        final List<nq4> c = this.c;
        final zcf zcf = (zcf)o;
        return czd.a((Object)c, (Object)zcf.c) && czd.a((Object)this.d, (Object)zcf.d) && wfj.b(this.e, zcf.e) && wfj.b(this.f, zcf.f) && this.g == zcf.g;
    }
    
    public final int hashCode() {
        final int hashCode = this.c.hashCode();
        final List<Float> d = this.d;
        int hashCode2;
        if (d != null) {
            hashCode2 = d.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        return (wfj.f(this.f) + (wfj.f(this.e) + (hashCode * 31 + hashCode2) * 31) * 31) * 31 + this.g;
    }
    
    public final String toString() {
        final boolean q = wj1.q(this.e);
        String string = "";
        String string2;
        if (q) {
            final StringBuilder j = fu8.j("start=");
            j.append((Object)wfj.j(this.e));
            j.append(", ");
            string2 = j.toString();
        }
        else {
            string2 = "";
        }
        if (wj1.q(this.f)) {
            final StringBuilder i = fu8.j("end=");
            i.append((Object)wfj.j(this.f));
            i.append(", ");
            string = i.toString();
        }
        final StringBuilder k = fu8.j("LinearGradient(colors=");
        k.append(this.c);
        k.append(", stops=");
        k.append(this.d);
        k.append(", ");
        k.append(string2);
        k.append(string);
        k.append("tileMode=");
        final int g = this.g;
        final int n = 0;
        String s;
        if (g == 0) {
            s = "Clamp";
        }
        else if (g == 1) {
            s = "Repeated";
        }
        else if (g == 2) {
            s = "Mirror";
        }
        else {
            int n2 = n;
            if (g == 3) {
                n2 = 1;
            }
            if (n2 != 0) {
                s = "Decal";
            }
            else {
                s = "Unknown";
            }
        }
        k.append((Object)s);
        k.append(')');
        return k.toString();
    }
}
