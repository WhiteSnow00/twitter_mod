// 
// Decompiled by Procyon v0.6.0
// 

public final class z76 extends ctd implements b
{
    public final kub<dlh, d86, Integer, dlh> G0;
    
    public z76(final stb<? super btd, vzv> stb, final kub<? super dlh, ? super d86, ? super Integer, ? extends dlh> g0) {
        e0e.f((Object)stb, "inspectorInfo");
        e0e.f((Object)g0, "factory");
        super((stb)stb);
        this.G0 = (kub<dlh, d86, Integer, dlh>)g0;
    }
    
    public final dlh E(final dlh dlh) {
        return z9a.i((dlh)this, dlh);
    }
    
    public final boolean H(final stb stb) {
        return k5b.a((b)this, stb);
    }
    
    public final Object X(final Object o, final hub hub) {
        e0e.f((Object)hub, "operation");
        return hub.invoke(o, (Object)this);
    }
}
