// 
// Decompiled by Procyon v0.6.0
// 

public final class n79
{
    public final String a;
    public final String b;
    public final float c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final int h;
    public final int i;
    public final float j;
    public final boolean k;
    
    public n79(final String a, final String b, final float c, final int d, final int e, final float f, final float g, final int h, final int i, final float j, final boolean k) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    @Override
    public final int hashCode() {
        final int h = d10.h(this.d, (int)(brg.d(this.b, this.a.hashCode() * 31, 31) + this.c) * 31, 31);
        final int e = this.e;
        final long n = Float.floatToRawIntBits(this.f);
        return ((h + e) * 31 + (int)(n ^ n >>> 32)) * 31 + this.h;
    }
}
