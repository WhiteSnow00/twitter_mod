// 
// Decompiled by Procyon v0.6.0
// 

public final class nr6 extends k5j<mr6>
{
    public static final nr6 b;
    
    static {
        b = new nr6();
    }
    
    public nr6() {
        super(0);
    }
    
    public final Object d(final rmp rmp, final int n) {
        e0e.f((Object)rmp, "input");
        return new mr6(rmp.I(), dqv.Companion.a(rmp.I()));
    }
    
    public final void f(final smp smp, final Object o) {
        final mr6 mr6 = (mr6)o;
        e0e.f((Object)smp, "output");
        e0e.f((Object)mr6, "conversationContext");
        smp.G(mr6.a).G(mr6.b.name());
    }
}
