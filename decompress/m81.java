import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m81 implements p4j<o8g>
{
    public static final m81 a;
    public static final hwa b;
    public static final hwa c;
    
    static {
        a = new m81();
        b = new hwa("logSource", i81.w(wk0.B((Class)tll.class, new ex0(1))), (hwa$a)null);
        c = new hwa("logEventDropped", i81.w(wk0.B((Class)tll.class, new ex0(2))), (hwa$a)null);
    }
    
    public final void a(final Object o, final Object o2) throws IOException {
        final o8g o8g = (o8g)o;
        final q4j q4j = (q4j)o2;
        q4j.a(m81.b, o8g.a);
        q4j.a(m81.c, o8g.b);
    }
}
