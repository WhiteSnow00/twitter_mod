// 
// Decompiled by Procyon v0.6.0
// 

public final class o73 extends k5j<m73>
{
    public static final o73 b;
    
    static {
        b = new o73();
    }
    
    public o73() {
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
            gmp.d(rmp);
            rmp.A();
        }
        return new m73(a, c, a2);
    }
    
    public final void f(final smp smp, final Object o) {
        final m73 m73 = (m73)o;
        e0e.f((Object)smp, "output");
        e0e.f((Object)m73, "entry");
        smp.A(m73.c).G(m73.d).A(m73.e);
    }
}
