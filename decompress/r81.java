import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r81 implements b5j<j9g>
{
    public static final r81 a;
    public static final lxa b;
    public static final lxa c;
    
    static {
        a = new r81();
        b = new lxa("logSource", wa0.A(zk.A((Class)fml.class, new ix0(1))), null);
        c = new lxa("logEventDropped", wa0.A(zk.A((Class)fml.class, new ix0(2))), null);
    }
    
    public final void a(final Object o, final Object o2) throws IOException {
        final j9g j9g = (j9g)o;
        final c5j c5j = (c5j)o2;
        c5j.a(r81.b, j9g.a);
        c5j.a(r81.c, j9g.b);
    }
}
