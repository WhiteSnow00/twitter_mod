// 
// Decompiled by Procyon v0.6.0
// 

public final class mbk<T> extends lc<T>
{
    public final T[] H0;
    public final w3u<T> I0;
    
    public mbk(final Object[] array, final T[] h0, final int n, int n2, final int n3) {
        e0e.f((Object)array, "root");
        super(n, n2);
        this.H0 = h0;
        final int n4 = n2 - 1 & 0xFFFFFFE0;
        n2 = n;
        if (n > n4) {
            n2 = n4;
        }
        this.I0 = (w3u<T>)new w3u(array, n2, n4, n3);
    }
    
    @Override
    public final T next() {
        this.a();
        if (((lc)this.I0).hasNext()) {
            ++super.F0;
            return (T)this.I0.next();
        }
        return this.H0[super.F0++ - ((lc)this.I0).G0];
    }
    
    @Override
    public final T previous() {
        this.c();
        int f0 = super.F0;
        final w3u<T> i0 = this.I0;
        final int g0 = ((lc)i0).G0;
        if (f0 > g0) {
            final T[] h0 = this.H0;
            --f0;
            super.F0 = f0;
            return h0[f0 - g0];
        }
        super.F0 = f0 - 1;
        return (T)i0.previous();
    }
}
