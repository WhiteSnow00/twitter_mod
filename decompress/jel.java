// 
// Decompiled by Procyon v0.6.0
// 

public final class jel extends p8x
{
    public final ex8 K0;
    public final ydl L0;
    public final qdw M0;
    public final lel N0;
    public final e39 O0;
    public final viw P0;
    
    public jel(final k9x k9x, final ex8 k0, final ydl l0, final lel n0, final qdw m0, final viw p6) {
        super(k9x);
        this.C1(l0.getView());
        k0.x0(true);
        this.K0 = k0;
        this.L0 = l0;
        this.N0 = n0;
        this.M0 = m0;
        this.P0 = p6;
        this.O0 = new e39();
    }
    
    @Override
    public final void w1() {
        this.O0.a();
    }
    
    @Override
    public final void y1() {
        this.O0.c((b39)this.P0.b(this.N0.h).subscribeWith((ocj)new iel(this)));
    }
}
