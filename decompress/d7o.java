// 
// Decompiled by Procyon v0.6.0
// 

public final class d7o extends ste implements qsb<vqn, rz5>
{
    public final k7o D0;
    public final vwp E0;
    
    public d7o(final k7o d0, final vwp e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final vqn vqn = (vqn)o;
        czd.f((Object)vqn, "state");
        final w01 b = this.D0.b;
        final String b2 = vqn.b;
        czd.c((Object)b2);
        return b.b(b2, this.E0.b());
    }
}
