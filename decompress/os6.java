// 
// Decompiled by Procyon v0.6.0
// 

public final class os6 extends k5j<ms6>
{
    public static final os6 b;
    
    static {
        b = new os6();
    }
    
    public os6() {
        super(1);
    }
    
    public final Object d(final rmp rmp, final int n) {
        e0e.f((Object)rmp, "input");
        final long a = rmp.A();
        final String c = rmp.C();
        e0e.e((Object)c, "input.readNotNullString()");
        final long a2 = rmp.A();
        if (n < 1) {
            rmp.A();
            rmp.u();
            rmp.A();
        }
        return new ms6(a, c, a2);
    }
    
    public final void f(final smp smp, final Object o) {
        final ms6 ms6 = (ms6)o;
        e0e.f((Object)smp, "output");
        e0e.f((Object)ms6, "entry");
        smp.A(ms6.c).G(ms6.d).A(ms6.e);
    }
}
