import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nxo implements pml
{
    public final pml<Context> F0;
    public final pml<gea> G0;
    public final pml<dxo> H0;
    public final pml<si4> I0;
    
    public nxo(final pml<Context> f0, final pml<gea> g0, final pml<dxo> h0, final pml<si4> pml) {
        final frs a = frs$a.a;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = (pml<si4>)a;
    }
    
    public final Object get() {
        final Context context = (Context)this.F0.get();
        final gea gea = (gea)this.G0.get();
        final dxo dxo = (dxo)this.H0.get();
        final si4 si4 = (si4)this.I0.get();
        return new lae(context, gea, dxo);
    }
}
