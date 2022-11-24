// 
// Decompiled by Procyon v0.6.0
// 

public final class ecq<E> extends lc<E>
{
    public final E H0;
    
    public ecq(final E h0, final int n) {
        super(n, 1);
        this.H0 = h0;
    }
    
    @Override
    public final E next() {
        this.a();
        ++super.F0;
        return this.H0;
    }
    
    @Override
    public final E previous() {
        this.c();
        --super.F0;
        return this.H0;
    }
}
