// 
// Decompiled by Procyon v0.6.0
// 

public final class ls4 extends pue implements stb<sr4, kc0>
{
    public static final ls4 F0;
    
    static {
        F0 = new ls4();
    }
    
    public ls4() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final long a = ((sr4)o).a;
        final fs4 a2 = fs4.a;
        final long a3 = sr4.a(a, (es4)fs4.r);
        final float h = sr4.h(a3);
        final float g = sr4.g(a3);
        final float e = sr4.e(a3);
        final ns4$a a4 = ns4.a;
        final float[] b = ns4.b;
        final double n = ns4.a(0, h, g, e, b);
        final double n2 = 0.33333334f;
        return new kc0(sr4.d(a), (float)Math.pow(n, n2), (float)Math.pow(ns4.a(1, h, g, e, b), n2), (float)Math.pow(ns4.a(2, h, g, e, b), n2));
    }
}
