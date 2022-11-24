// 
// Decompiled by Procyon v0.6.0
// 

public final class t87 implements nq9
{
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    
    public t87(final float a, final float b, final float c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = 1.0f;
        if (!Float.isNaN(a) && !Float.isNaN(b) && !Float.isNaN(c) && !Float.isNaN(1.0f)) {
            return;
        }
        throw new IllegalArgumentException(go0.D(lr0.z("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", a, ", ", b, ", "), c, ", ", 1.0f, '.').toString());
    }
    
    public final float a(final float n) {
        float n2 = 0.0f;
        if (n > 0.0f) {
            float n3 = 1.0f;
            if (n < 1.0f) {
                float n4;
                while (true) {
                    n4 = (n2 + n3) / 2;
                    final float b = this.b(this.a, this.c, n4);
                    if (Math.abs(n - b) < 0.001f) {
                        break;
                    }
                    if (b < n) {
                        n2 = n4;
                    }
                    else {
                        n3 = n4;
                    }
                }
                return this.b(this.b, this.d, n4);
            }
        }
        return n;
    }
    
    public final float b(final float n, final float n2, final float n3) {
        final float n4 = 3;
        final float n5 = 1 - n3;
        return n3 * n3 * n3 + (n4 * n2 * n5 * n3 * n3 + n * n4 * n5 * n5 * n3);
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof t87;
        boolean b2 = true;
        if (b) {
            final float a = this.a;
            final t87 t87 = (t87)o;
            if (a == t87.a && this.b == t87.b && this.c == t87.c && this.d == t87.d) {
                return b2;
            }
        }
        b2 = false;
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.d) + dn.g(this.c, dn.g(this.b, Float.floatToIntBits(this.a) * 31, 31), 31);
    }
}
