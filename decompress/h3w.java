// 
// Decompiled by Procyon v0.6.0
// 

public final class h3w extends k5j<f3w>
{
    public static final h3w b;
    
    static {
        b = new h3w();
    }
    
    public h3w() {
        super(2);
    }
    
    public final Object d(final rmp rmp, final int n) {
        e0e.f((Object)rmp, "input");
        final long a = rmp.A();
        final String c = rmp.C();
        e0e.e((Object)c, "input.readNotNullString()");
        final long a2 = rmp.A();
        final long a3 = rmp.A();
        if (n < 2) {
            rmp.u();
        }
        final String c2 = rmp.C();
        e0e.e((Object)c2, "input.readNotNullString()");
        final f3w f3w = new f3w(a, c, a2, a3, c2);
        if (n < 1) {
            rmp.A();
        }
        return f3w;
    }
    
    public final void f(final smp smp, final Object o) {
        final f3w f3w = (f3w)o;
        e0e.f((Object)smp, "output");
        e0e.f((Object)f3w, "entry");
        smp.A(f3w.c).G(f3w.d).A(f3w.e).A(f3w.f).G(f3w.g);
    }
}
