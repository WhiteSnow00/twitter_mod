// 
// Decompiled by Procyon v0.6.0
// 

public final class l5s implements p5s<Object, Object>
{
    public final p5s<Object, noj<Object>> F0;
    public final p5s<Object, Object> G0;
    public final j5s<?, Object, ?> H0;
    
    public l5s(final p5s<Object, noj<Object>> f0, final p5s<Object, Object> g0, final j5s<?, Object, ?> h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final Object W2(Object o) {
        final noj noj = (noj)this.F0.W2(o);
        if (noj.f()) {
            o = noj.c();
        }
        else {
            o = this.G0.o((j5s)this.H0).W2(o);
        }
        return o;
    }
    
    public final p5s Z2(final j5s j5s) {
        return nv8.l((p5s)this, j5s, true);
    }
    
    public final void close() {
    }
    
    public final p5s f2(final p5s p5s, final j5s j5s) {
        return nv8.h((p5s)this, p5s, j5s);
    }
    
    public final p5s o(final j5s j5s) {
        return nv8.k((p5s)this, j5s);
    }
    
    public final p5s p(final stb stb) {
        return nv8.f((p5s)this, stb);
    }
    
    public final p5s r1(final bx0 bx0) {
        return nv8.j((p5s)this, bx0, true);
    }
    
    public final p5s t2(final bx0 bx0) {
        return nv8.i((p5s)this, bx0);
    }
}
