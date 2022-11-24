// 
// Decompiled by Procyon v0.6.0
// 

public final class obq implements rbq
{
    public final rbq<Object, Object> F0;
    public final stb G0;
    
    public obq(final rbq f0, final stb g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final mpg F(final stb stb) {
        return qee.e((rbq)this, stb);
    }
    
    @Override
    public final bbq S(final Object o) {
        return this.F0.S(o).w((rtb)new l5i(this.G0, 12));
    }
    
    public final void close() {
    }
    
    @Override
    public final mpg n1(final k9x k9x) {
        return qee.h((rbq)this, k9x);
    }
    
    @Override
    public final rbq o(final j5s j5s) {
        return qee.p((rbq)this, j5s);
    }
    
    @Override
    public final rbq p(final stb stb) {
        return qee.m((rbq)this, stb);
    }
    
    @Override
    public final x6j y0(final x6j x6j, final bx0 bx0) {
        return qee.n((rbq)this, x6j, bx0);
    }
}
