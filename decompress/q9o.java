// 
// Decompiled by Procyon v0.6.0
// 

public final class q9o extends ste implements qsb<vqn, Boolean>
{
    public static final q9o D0;
    
    static {
        D0 = new q9o();
    }
    
    public q9o() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final vqn vqn = (vqn)o;
        czd.f((Object)vqn, "it");
        final qt3 i = vqn.i;
        String a;
        if (i != null) {
            a = i.a();
        }
        else {
            a = null;
        }
        return (a != null || blz.M(vqn)) && vqn.u == wqn.D0 && vqn.a != null;
    }
}
