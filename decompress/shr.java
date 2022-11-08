// 
// Decompiled by Procyon v0.6.0
// 

public final class shr implements qhr
{
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public boolean k;
    public float l;
    public float m;
    
    public shr() {
        this.k = false;
    }
    
    public final float a() {
        float c;
        if (this.k) {
            c = -this.c(this.m);
        }
        else {
            c = this.c(this.m);
        }
        return c;
    }
    
    public final boolean b() {
        float c;
        if (this.k) {
            c = -this.c(this.m);
        }
        else {
            c = this.c(this.m);
        }
        return c < 1.0E-5f && Math.abs(this.i - this.m) < 1.0E-5f;
    }
    
    public final float c(float f) {
        float n = this.d;
        float n2;
        float n3;
        if (f <= n) {
            n2 = this.a;
            n3 = this.b;
        }
        else {
            final int j = this.j;
            if (j == 1) {
                return 0.0f;
            }
            f -= n;
            n = this.e;
            if (f < n) {
                n2 = this.b;
                n3 = this.c;
            }
            else {
                if (j == 2) {
                    return this.h;
                }
                final float n4 = f - n;
                f = this.f;
                if (n4 < f) {
                    final float c = this.c;
                    return c - n4 * c / f;
                }
                return this.i;
            }
        }
        return (n3 - n2) * f / n + n2;
    }
    
    public final void d(float n, final float i, float n2, float c, float n3) {
        float n4 = n;
        if (n == 0.0f) {
            n4 = 1.0E-4f;
        }
        this.a = n4;
        n = n4 / n2;
        final float n5 = n * n4 / 2.0f;
        if (n4 < 0.0f) {
            n = (float)Math.sqrt((i - -n4 / n2 * n4 / 2.0f) * n2);
            if (n < c) {
                this.j = 2;
                this.a = n4;
                this.b = n;
                this.c = 0.0f;
                c = (n - n4) / n2;
                this.d = c;
                this.e = n / n2;
                this.g = (n4 + n) * c / 2.0f;
                this.h = i;
                this.i = i;
                return;
            }
            this.j = 3;
            this.a = n4;
            this.b = c;
            this.c = c;
            n = (c - n4) / n2;
            this.d = n;
            n2 = c / n2;
            this.f = n2;
            n = (n4 + c) * n / 2.0f;
            n2 = n2 * c / 2.0f;
            this.e = (i - n - n2) / c;
            this.g = n;
            this.h = i - n2;
            this.i = i;
        }
        else {
            if (n5 >= i) {
                n = 2.0f * i / n4;
                this.j = 1;
                this.a = n4;
                this.b = 0.0f;
                this.g = i;
                this.d = n;
                return;
            }
            final float g = i - n5;
            final float d = g / n4;
            if (d + n < n3) {
                this.j = 2;
                this.a = n4;
                this.b = n4;
                this.c = 0.0f;
                this.g = g;
                this.h = i;
                this.d = d;
                this.e = n;
                return;
            }
            n = (float)Math.sqrt(n4 * n4 / 2.0f + n2 * i);
            final float n6 = (n - n4) / n2;
            this.d = n6;
            n3 = n / n2;
            this.e = n3;
            if (n < c) {
                this.j = 2;
                this.a = n4;
                this.b = n;
                this.c = 0.0f;
                this.d = n6;
                this.e = n3;
                this.g = (n4 + n) * n6 / 2.0f;
                this.h = i;
                return;
            }
            this.j = 3;
            this.a = n4;
            this.b = c;
            this.c = c;
            n = (c - n4) / n2;
            this.d = n;
            n2 = c / n2;
            this.f = n2;
            n = (n4 + c) * n / 2.0f;
            n2 = n2 * c / 2.0f;
            this.e = (i - n - n2) / c;
            this.g = n;
            this.h = i - n2;
            this.i = i;
        }
    }
    
    public final float getInterpolation(float m) {
        final float d = this.d;
        float n;
        if (m <= d) {
            final float a = this.a;
            n = (this.b - a) * m * m / (d * 2.0f) + a * m;
        }
        else {
            final int j = this.j;
            if (j == 1) {
                n = this.g;
            }
            else {
                final float n2 = m - d;
                final float e = this.e;
                if (n2 < e) {
                    final float g = this.g;
                    final float b = this.b;
                    n = (this.c - b) * n2 * n2 / (e * 2.0f) + (b * n2 + g);
                }
                else if (j == 2) {
                    n = this.h;
                }
                else {
                    final float n3 = n2 - e;
                    final float f = this.f;
                    if (n3 <= f) {
                        final float h = this.h;
                        final float n4 = this.c * n3;
                        n = h + n4 - n4 * n3 / (f * 2.0f);
                    }
                    else {
                        n = this.i;
                    }
                }
            }
        }
        this.m = m;
        if (this.k) {
            m = this.l - n;
        }
        else {
            m = this.l + n;
        }
        return m;
    }
}
