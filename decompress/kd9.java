// 
// Decompiled by Procyon v0.6.0
// 

public final class kd9 extends ctd implements qd9
{
    public final stb<wd9, vzv> G0;
    
    public kd9(final stb<? super wd9, vzv> g0, final stb<? super btd, vzv> stb) {
        final ysd$a a = ysd.a;
        e0e.f((Object)g0, "onDraw");
        e0e.f((Object)a, "inspectorInfo");
        super((stb)a);
        this.G0 = (stb<wd9, vzv>)g0;
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
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof kd9 && e0e.a((Object)this.G0, (Object)((kd9)o).G0));
    }
    
    public final int hashCode() {
        return this.G0.hashCode();
    }
    
    public final void x(final em6 em6) {
        e0e.f((Object)em6, "<this>");
        this.G0.invoke((Object)em6);
        em6.E0();
    }
}
