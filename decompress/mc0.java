// 
// Decompiled by Procyon v0.6.0
// 

public final class mc0 extends oc0
{
    public float a;
    public float b;
    
    public mc0(final float a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    public final float a(final int n) {
        float n2;
        if (n != 0) {
            if (n != 1) {
                n2 = 0.0f;
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
        return 2;
    }
    
    public final oc0 c() {
        return new mc0(0.0f, 0.0f);
    }
    
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }
    
    public final void e(final int n, final float n2) {
        if (n != 0) {
            if (n == 1) {
                this.b = n2;
            }
        }
        else {
            this.a = n2;
        }
    }
    
    public final boolean equals(final Object o) {
        final boolean b = o instanceof mc0;
        boolean b2 = true;
        if (b) {
            final mc0 mc0 = (mc0)o;
            if (mc0.a == this.a && mc0.b == this.b) {
                return b2;
            }
        }
        b2 = false;
        return b2;
    }
    
    public final int hashCode() {
        return Float.floatToIntBits(this.b) + Float.floatToIntBits(this.a) * 31;
    }
    
    public final String toString() {
        final StringBuilder g = w48.g("AnimationVector2D: v1 = ");
        g.append(this.a);
        g.append(", v2 = ");
        g.append(this.b);
        return g.toString();
    }
}
