import sun.misc.Unsafe;

// 
// Decompiled by Procyon v0.6.0
// 

public final class esz extends gsz
{
    public esz(final Unsafe unsafe) {
        super(unsafe);
    }
    
    public final double a(final Object o, final long n) {
        return Double.longBitsToDouble(this.k(o, n));
    }
    
    public final float b(final Object o, final long n) {
        return Float.intBitsToFloat(this.j(o, n));
    }
    
    public final void c(final Object o, final long n, final boolean b) {
        if (hsz.g) {
            hsz.c(o, n, (byte)(byte)(b ? 1 : 0));
            return;
        }
        hsz.d(o, n, (byte)(byte)(b ? 1 : 0));
    }
    
    public final void d(final Object o, final long n, final byte b) {
        if (hsz.g) {
            hsz.c(o, n, b);
            return;
        }
        hsz.d(o, n, b);
    }
    
    public final void e(final Object o, final long n, final double n2) {
        this.o(o, n, Double.doubleToLongBits(n2));
    }
    
    public final void f(final Object o, final long n, final float n2) {
        this.n(o, n, Float.floatToIntBits(n2));
    }
    
    public final boolean g(final Object o, final long n) {
        if (hsz.g) {
            return hsz.s(o, n);
        }
        return hsz.t(o, n);
    }
}
