// 
// Decompiled by Procyon v0.6.0
// 

public final class o5r implements gjr
{
    public double a;
    public double b;
    public double c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int i;
    
    public o5r() {
        this.a = 0.5;
        this.i = 0;
    }
    
    public final float a() {
        return 0.0f;
    }
    
    public final boolean b() {
        final double n = this.e - this.c;
        final double b = this.b;
        final double n2 = this.f;
        return Math.sqrt((b * n * n + n2 * n2 * this.g) / b) <= this.h;
    }
    
    public final float getInterpolation(final float d) {
        final double n = d - this.d;
        final double b = this.b;
        final double a = this.a;
        final int n2 = (int)(9.0 / (Math.sqrt(b / this.g) * n * 4.0) + 1.0);
        final double n3 = n / n2;
        for (int i = 0; i < n2; ++i) {
            final double n4 = this.e;
            final double c = this.c;
            final double n5 = -b;
            final double n6 = this.f;
            final double n7 = this.g;
            final double n8 = (n5 * (n4 - c) - n6 * a) / n7 * n3 / 2.0 + n6;
            final double n9 = (-(n3 * n8 / 2.0 + n4 - c) * b - n8 * a) / n7 * n3;
            final double n10 = n9 / 2.0;
            final float f = (float)(n6 + n9);
            this.f = f;
            final float e = (float)((n10 + n6) * n3 + n4);
            this.e = e;
            final int j = this.i;
            if (j > 0) {
                if (e < 0.0f && (j & 0x1) == 0x1) {
                    this.e = -e;
                    this.f = -f;
                }
                final float e2 = this.e;
                if (e2 > 1.0f && (j & 0x2) == 0x2) {
                    this.e = 2.0f - e2;
                    this.f = -this.f;
                }
            }
        }
        this.d = d;
        return this.e;
    }
}
