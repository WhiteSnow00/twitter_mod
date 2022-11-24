// 
// Decompiled by Procyon v0.6.0
// 

public final class zs9 extends k5j<ys9>
{
    public static final zs9 b;
    
    static {
        b = new zs9();
    }
    
    public final Object d(final rmp rmp, final int n) {
        e0e.f((Object)rmp, "input");
        return new ys9(rmp.z(), rmp.z(), rmp.A());
    }
    
    public final void f(final smp smp, final Object o) {
        final ys9 ys9 = (ys9)o;
        e0e.f((Object)smp, "output");
        e0e.f((Object)ys9, "info");
        smp.z(ys9.a);
        smp.z(ys9.b);
        smp.A(ys9.c);
    }
}
