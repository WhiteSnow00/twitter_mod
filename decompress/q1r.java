// 
// Decompiled by Procyon v0.6.0
// 

public final class q1r extends wn6
{
    public final n1r I0;
    public final p1r J0;
    
    public q1r(final r8x r8x, final n1r i0, final p1r j0) {
        super(r8x);
        this.I0 = i0;
        this.J0 = j0;
    }
    
    public final void E1() {
        this.I0.b((jvg)null);
        final p1r j0 = this.J0;
        j0.a.animate().cancel();
        ec0.f(j0.a);
    }
    
    public final h5j<tmi> F1() {
        return (h5j<tmi>)this.I0.c();
    }
    
    public final h5j<ynj<jw9<?>>> G1() {
        return (h5j<ynj<jw9<?>>>)this.I0.a();
    }
    
    public final void I1(final jvg jvg) {
        this.I0.b(jvg);
    }
    
    public final void J1() {
        final p1r j0 = this.J0;
        j0.a.animate().cancel();
        ec0.d(j0.a, 300);
    }
    
    public final void bind() {
    }
    
    public final void unbind() {
    }
}
