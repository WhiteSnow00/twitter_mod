import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o81 implements b5j<tg4>
{
    public static final o81 a;
    public static final lxa b;
    public static final lxa c;
    public static final lxa d;
    public static final lxa e;
    
    static {
        a = new o81();
        b = new lxa("window", wa0.A(zk.A((Class)fml.class, new ix0(1))), null);
        c = new lxa("logSourceMetrics", wa0.A(zk.A((Class)fml.class, new ix0(2))), null);
        d = new lxa("globalMetrics", wa0.A(zk.A((Class)fml.class, new ix0(3))), null);
        e = new lxa("appNamespace", wa0.A(zk.A((Class)fml.class, new ix0(4))), null);
    }
    
    public final void a(final Object o, final Object o2) throws IOException {
        final tg4 tg4 = (tg4)o;
        final c5j c5j = (c5j)o2;
        c5j.a(o81.b, tg4.a);
        c5j.a(o81.c, tg4.b);
        c5j.a(o81.d, tg4.c);
        c5j.a(o81.e, tg4.d);
    }
}
