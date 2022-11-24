// 
// Decompiled by Procyon v0.6.0
// 

public final class v30
{
    public static final v30 a;
    public static final float[] b;
    
    static {
        a = new v30();
        final float[] array = b = new float[101];
        final float[] array2 = new float[101];
        float n = 0.0f;
        float n2 = 0.0f;
        for (int i = 0; i < 100; ++i) {
            final float n3 = i / (float)100;
            float n4 = 1.0f;
            float n5;
            float n6;
            float n7;
            float n8;
            while (true) {
                n5 = (n4 - n) / 2.0f + n;
                n6 = 1.0f - n5;
                n7 = 3.0f * n5 * n6;
                final float g = d10.g(n5, 0.35000002f, n6 * 0.175f, n7);
                n8 = n5 * n5 * n5;
                final float n9 = g + n8;
                if (Math.abs(n9 - n3) < 1.0E-5) {
                    break;
                }
                if (n9 > n3) {
                    n4 = n5;
                }
                else {
                    n = n5;
                }
            }
            array[i] = (n6 * 0.5f + n5) * n7 + n8;
            float n10 = 1.0f;
            float n11;
            float n12;
            float n13;
            float n14;
            while (true) {
                n11 = (n10 - n2) / 2.0f + n2;
                n12 = 1.0f - n11;
                n13 = 3.0f * n11 * n12;
                final float g2 = d10.g(n12, 0.5f, n11, n13);
                n14 = n11 * n11 * n11;
                final float n15 = g2 + n14;
                if (Math.abs(n15 - n3) < 1.0E-5) {
                    break;
                }
                if (n15 > n3) {
                    n10 = n11;
                }
                else {
                    n2 = n11;
                }
            }
            array2[i] = (n11 * 0.35000002f + n12 * 0.175f) * n13 + n14;
        }
        array[100] = (array2[100] = 1.0f);
    }
    
    public final a a(float n) {
        final float n2 = 100;
        final int n3 = (int)(n2 * n);
        float n9;
        if (n3 < 100) {
            final float n4 = n3 / n2;
            final int n5 = n3 + 1;
            final float n6 = n5 / n2;
            final float[] b = v30.b;
            final float n7 = b[n3];
            final float n8 = (b[n5] - n7) / (n6 - n4);
            final float d = va.d(n, n4, n8, n7);
            n = n8;
            n9 = d;
        }
        else {
            n9 = 1.0f;
            n = 0.0f;
        }
        return new a(n9, n);
    }
    
    public static final class a
    {
        public final float a;
        public final float b;
        
        public a(final float a, final float b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return e0e.a((Object)this.a, (Object)a.a) && e0e.a((Object)this.b, (Object)a.b);
        }
        
        @Override
        public final int hashCode() {
            return Float.floatToIntBits(this.b) + Float.floatToIntBits(this.a) * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder f = ehk.f("FlingResult(distanceCoefficient=");
            f.append(this.a);
            f.append(", velocityCoefficient=");
            return dn.C(f, this.b, ')');
        }
    }
}
