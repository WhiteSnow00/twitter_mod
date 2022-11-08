// 
// Decompiled by Procyon v0.6.0
// 

public final class dgz extends jgz
{
    public final int F0;
    
    public dgz(final byte[] array, final int f0) {
        super(array);
        bhz.p(0, f0, array.length);
        this.F0 = f0;
    }
    
    @Override
    public final byte e(final int n) {
        final int f0 = this.F0;
        if ((f0 - (n + 1) | n) >= 0) {
            return super.E0[n];
        }
        if (n < 0) {
            throw new ArrayIndexOutOfBoundsException(yk.y("Index < 0: ", n));
        }
        throw new ArrayIndexOutOfBoundsException(hi.H("Index > length: ", n, ", ", f0));
    }
    
    @Override
    public final byte g(final int n) {
        return super.E0[n];
    }
    
    @Override
    public final int i() {
        return this.F0;
    }
    
    @Override
    public final void r() {
    }
}
