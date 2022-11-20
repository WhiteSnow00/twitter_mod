// 
// Decompiled by Procyon v0.6.0
// 

public final class bof implements dcj<Object>
{
    public Object D0;
    public final gcs E0;
    public final Object F0;
    public final wtb G0;
    public final r2h H0;
    
    public bof(final gcs e0, final Object f0, final wtb g0, final r2h h0) {
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.D0 = null;
    }
    
    @Override
    public final void f(final Object o) {
        ((bsx)this.E0).a((Runnable)new bof$a(this, o));
    }
}
