// 
// Decompiled by Procyon v0.6.0
// 

public final class s5m extends pue implements ptb<vzv>
{
    public final w5d<Object> F0;
    public final pq6 G0;
    
    public s5m(final w5d<Object> f0, final pq6 g0) {
        this.F0 = f0;
        this.G0 = g0;
        super(0);
    }
    
    public final Object invoke() {
        final w5d<Object> f0 = this.F0;
        final pq6 g0 = this.G0;
        for (int f2 = f0.F0, i = 0; i < f2; ++i) {
            g0.s(f0.get(i));
        }
        return vzv.a;
    }
}
