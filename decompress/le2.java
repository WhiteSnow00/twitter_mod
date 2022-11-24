// 
// Decompiled by Procyon v0.6.0
// 

public abstract class le2 implements flh, wjj
{
    public final ne2 F0;
    public ne2 G0;
    public bwe H0;
    
    public le2(final ne2 f0) {
        e0e.f((Object)f0, "defaultParent");
        this.F0 = f0;
    }
    
    @Override
    public final void A(final jlh jlh) {
        e0e.f((Object)jlh, "scope");
        this.G0 = jlh.g((elh<ne2>)me2.a);
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
    
    public final bwe b() {
        bwe h0 = this.H0;
        if (h0 == null || !h0.j()) {
            h0 = null;
        }
        return h0;
    }
    
    public final void q(final bwe h0) {
        e0e.f((Object)h0, "coordinates");
        this.H0 = h0;
    }
}
