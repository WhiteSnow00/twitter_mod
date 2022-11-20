// 
// Decompiled by Procyon v0.6.0
// 

public final class pog implements sog
{
    public final sog D0;
    public final p4s E0;
    public final boolean F0;
    
    public pog(final sog d0, final p4s e0, final boolean f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final sog P2(final p4s p4s, final boolean b) {
        return mb0.e((sog)this, p4s, b);
    }
    
    public final kog V1(final Object o) {
        final sog d0 = this.D0;
        final p4s e0 = this.E0;
        final boolean f0 = this.F0;
        czd.f((Object)d0, "this$0");
        czd.f((Object)e0, "$sink");
        return d0.V1(o).h((lj6)new ayi((qsb)new rog((p4s<?, Object, ?>)e0, f0), 4));
    }
    
    public final void close() {
    }
    
    public final sog n(final p4s p4s) {
        return mb0.d((sog)this, p4s);
    }
    
    public final sog o(final qsb qsb) {
        return mb0.c((sog)this, qsb);
    }
}
