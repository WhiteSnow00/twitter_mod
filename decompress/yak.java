// 
// Decompiled by Procyon v0.6.0
// 

public final class yak<T> extends kc<T>
{
    public final T[] F0;
    public final d3u<T> G0;
    
    public yak(final Object[] array, final T[] f0, final int n, int n2, final int n3) {
        czd.f((Object)array, "root");
        super(n, n2);
        this.F0 = f0;
        final int n4 = n2 - 1 & 0xFFFFFFE0;
        n2 = n;
        if (n > n4) {
            n2 = n4;
        }
        this.G0 = (d3u<T>)new d3u(array, n2, n4, n3);
    }
    
    public final T next() {
        this.a();
        if (((kc)this.G0).hasNext()) {
            ++super.D0;
            return (T)this.G0.next();
        }
        return this.F0[super.D0++ - ((kc)this.G0).E0];
    }
    
    public final T previous() {
        this.c();
        int d0 = super.D0;
        final d3u<T> g0 = this.G0;
        final int e0 = ((kc)g0).E0;
        if (d0 > e0) {
            final T[] f0 = this.F0;
            --d0;
            super.D0 = d0;
            return f0[d0 - e0];
        }
        super.D0 = d0 - 1;
        return (T)g0.previous();
    }
}
