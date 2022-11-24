// 
// Decompiled by Procyon v0.6.0
// 

public final class f2f implements ilh<gek>, flh, gek
{
    public static final f2f.f2f$b Companion;
    public static final f2f$a I0;
    public final p2f F0;
    public final i1f G0;
    public gek H0;
    
    static {
        Companion = new f2f.f2f$b();
        I0 = new f2f$a();
    }
    
    public f2f(final p2f f0, final i1f g0) {
        e0e.f((Object)f0, "state");
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void A(final jlh jlh) {
        e0e.f((Object)jlh, "scope");
        this.H0 = jlh.g((elh<gek>)iek.a);
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
    
    public final gek$a a() {
        final i1f g0 = this.G0;
        Object o;
        if (g0.d()) {
            o = new f2f$c(this, g0);
        }
        else {
            final gek h0 = this.H0;
            if (h0 == null || (o = h0.a()) == null) {
                o = f2f.I0;
            }
        }
        return (gek$a)o;
    }
    
    public final mml<gek> getKey() {
        return (mml<gek>)iek.a;
    }
    
    public final Object getValue() {
        return this;
    }
}
