import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q81 implements b5j<x8g>
{
    public static final q81 a;
    public static final lxa b;
    public static final lxa c;
    
    static {
        a = new q81();
        b = new lxa("eventsDroppedCount", wa0.A(zk.A((Class)fml.class, new ix0(1))), null);
        c = new lxa("reason", wa0.A(zk.A((Class)fml.class, new ix0(3))), null);
    }
    
    public final void a(final Object o, final Object o2) throws IOException {
        final x8g x8g = (x8g)o;
        final c5j c5j = (c5j)o2;
        c5j.f(q81.b, x8g.a);
        c5j.a(q81.c, x8g.b);
    }
}
