// 
// Decompiled by Procyon v0.6.0
// 

public final class kc0 extends lc0
{
    public float a;
    public float b;
    public float c;
    public float d;
    
    public kc0(final float a, final float b, final float c, final float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final float a(final int n) {
        float n2;
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        n2 = 0.0f;
                    }
                    else {
                        n2 = this.d;
                    }
                }
                else {
                    n2 = this.c;
                }
            }
            else {
                n2 = this.b;
            }
        }
        else {
            n2 = this.a;
        }
        return n2;
    }
    
    public final int b() {
        return 4;
    }
    
    public final lc0 c() {
        return new kc0(0.0f, 0.0f, 0.0f, 0.0f);
    }
    
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
    }
    
    public final void e(final int n, final float n2) {
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n == 3) {
                        this.d = n2;
                    }
                }
                else {
                    this.c = n2;
                }
            }
            else {
                this.b = n2;
            }
        }
        else {
            this.a = n2;
        }
    }
    
    public final boolean equals(final Object o) {
        final boolean b = o instanceof kc0;
        boolean b2 = true;
        if (b) {
            final kc0 kc0 = (kc0)o;
            if (kc0.a == this.a && kc0.b == this.b && kc0.c == this.c && kc0.d == this.d) {
                return b2;
            }
        }
        b2 = false;
        return b2;
    }
    
    public final int hashCode() {
        return Float.floatToIntBits(this.d) + dn.g(this.c, dn.g(this.b, Float.floatToIntBits(this.a) * 31, 31), 31);
    }
    
    public final String toString() {
        final StringBuilder f = ehk.f("AnimationVector4D: v1 = ");
        f.append(this.a);
        f.append(", v2 = ");
        f.append(this.b);
        f.append(", v3 = ");
        f.append(this.c);
        f.append(", v4 = ");
        f.append(this.d);
        return f.toString();
    }
}
