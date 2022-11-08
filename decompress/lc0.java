// 
// Decompiled by Procyon v0.6.0
// 

public final class lc0 extends oc0
{
    public float a;
    
    public lc0(final float a) {
        this.a = a;
    }
    
    public final float a(final int n) {
        if (n == 0) {
            return this.a;
        }
        return 0.0f;
    }
    
    public final int b() {
        return 1;
    }
    
    public final oc0 c() {
        return new lc0(0.0f);
    }
    
    public final void d() {
        this.a = 0.0f;
    }
    
    public final void e(final int n, final float a) {
        if (n == 0) {
            this.a = a;
        }
    }
    
    public final boolean equals(final Object o) {
        final boolean b = o instanceof lc0;
        boolean b2 = true;
        if (!b || ((lc0)o).a != this.a) {
            b2 = false;
        }
        return b2;
    }
    
    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }
    
    public final String toString() {
        final StringBuilder g = w48.g("AnimationVector1D: value = ");
        g.append(this.a);
        return g.toString();
    }
}
