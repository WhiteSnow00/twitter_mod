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

public final class ndf extends hqp
{
    public final List<pr4> c;
    public final List<Float> d;
    public final long e;
    public final long f;
    public final int g;
    
    public ndf(final List c, final long e, final long f, final int g) {
        this.c = c;
        this.d = null;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final Shader b(long n) {
        float n2;
        if (qfj.d(this.e) == Float.POSITIVE_INFINITY) {
            n2 = mcq.d(n);
        }
        else {
            n2 = qfj.d(this.e);
        }
        float n3;
        if (qfj.e(this.e) == Float.POSITIVE_INFINITY) {
            n3 = mcq.b(n);
        }
        else {
            n3 = qfj.e(this.e);
        }
        float n4;
        if (qfj.d(this.f) == Float.POSITIVE_INFINITY) {
            n4 = mcq.d(n);
        }
        else {
            n4 = qfj.d(this.f);
        }
        float n5;
        if (qfj.e(this.f) == Float.POSITIVE_INFINITY) {
            n5 = mcq.b(n);
        }
        else {
            n5 = qfj.e(this.f);
        }
        final List<pr4> c = this.c;
        final List<Float> d = this.d;
        n = ukg.m(n2, n3);
        final long m = ukg.m(n4, n5);
        final int g = this.g;
        zzd.f((Object)c, "colors");
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
            final int s = tdy.S((List)c);
            int n7 = 1;
            int n8 = 0;
            while (true) {
                n6 = n8;
                if (n7 >= s) {
                    break;
                }
                final boolean b = pr4.d(c.get(n7).a) == 0.0f;
                int n9 = n8;
                if (b) {
                    n9 = n8 + 1;
                }
                ++n7;
                n8 = n9;
            }
        }
        final float d2 = qfj.d(n);
        final float e = qfj.e(n);
        final float d3 = qfj.d(m);
        final float e2 = qfj.e(m);
        int[] array;
        if (Build$VERSION.SDK_INT >= 26) {
            final int size = c.size();
            array = new int[size];
            for (int i = 0; i < size; ++i) {
                array[i] = m0n.F0(((pr4)c.get(i)).a);
            }
        }
        else {
            array = new int[c.size() + n6];
            final int s2 = tdy.S((List)c);
            final int size2 = c.size();
            int j = 0;
            int n10 = 0;
            while (j < size2) {
                n = ((pr4)c.get(j)).a;
                if (pr4.d(n) == 0.0f) {
                    if (j == 0) {
                        final int n11 = n10 + 1;
                        array[n10] = m0n.F0(pr4.b(c.get(1).a, 0.0f));
                        n10 = n11;
                    }
                    else if (j == s2) {
                        final int n12 = n10 + 1;
                        array[n10] = m0n.F0(pr4.b(c.get(j - 1).a, 0.0f));
                        n10 = n12;
                    }
                    else {
                        n = ((pr4)c.get(j - 1)).a;
                        final int n13 = n10 + 1;
                        array[n10] = m0n.F0(pr4.b(n, 0.0f));
                        array[n13] = m0n.F0(pr4.b(c.get(j + 1).a, 0.0f));
                        n10 = n13 + 1;
                    }
                }
                else {
                    array[n10] = m0n.F0(n);
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
            final int s3 = tdy.S((List)c);
            int k = 1;
            int n15 = 1;
            while (k < s3) {
                n = ((pr4)c.get(k)).a;
                float floatValue2;
                if (d != null) {
                    floatValue2 = d.get(k).floatValue();
                }
                else {
                    floatValue2 = k / (float)tdy.S((List)c);
                }
                final int n16 = n15 + 1;
                array4[n15] = floatValue2;
                if (pr4.d(n) == 0.0f) {
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
                floatValue3 = d.get(tdy.S((List)c)).floatValue();
            }
            else {
                floatValue3 = 1.0f;
            }
            array4[n15] = floatValue3;
        }
        Objects.requireNonNull(lps.Companion);
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
                        shader$TileMode = mps.a.b();
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
        if (!(o instanceof ndf)) {
            return false;
        }
        final List<pr4> c = this.c;
        final ndf ndf = (ndf)o;
        return zzd.a((Object)c, (Object)ndf.c) && zzd.a((Object)this.d, (Object)ndf.d) && qfj.b(this.e, ndf.e) && qfj.b(this.f, ndf.f) && this.g == ndf.g;
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
        return (qfj.f(this.f) + (qfj.f(this.e) + (hashCode * 31 + hashCode2) * 31) * 31) * 31 + this.g;
    }
    
    public final String toString() {
        final boolean s0 = ukg.s0(this.e);
        String string = "";
        String string2;
        if (s0) {
            final StringBuilder g = w48.g("start=");
            g.append((Object)qfj.j(this.e));
            g.append(", ");
            string2 = g.toString();
        }
        else {
            string2 = "";
        }
        if (ukg.s0(this.f)) {
            final StringBuilder g2 = w48.g("end=");
            g2.append((Object)qfj.j(this.f));
            g2.append(", ");
            string = g2.toString();
        }
        final StringBuilder g3 = w48.g("LinearGradient(colors=");
        g3.append(this.c);
        g3.append(", stops=");
        g3.append(this.d);
        g3.append(", ");
        g3.append(string2);
        g3.append(string);
        g3.append("tileMode=");
        final int g4 = this.g;
        final int n = 0;
        String s2;
        if (g4 == 0) {
            s2 = "Clamp";
        }
        else if (g4 == 1) {
            s2 = "Repeated";
        }
        else if (g4 == 2) {
            s2 = "Mirror";
        }
        else {
            int n2 = n;
            if (g4 == 3) {
                n2 = 1;
            }
            if (n2 != 0) {
                s2 = "Decal";
            }
            else {
                s2 = "Unknown";
            }
        }
        g3.append((Object)s2);
        g3.append(')');
        return g3.toString();
    }
}
