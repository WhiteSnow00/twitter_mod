import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p5x implements zq<o5x>
{
    public static final p5x a;
    public static final List<String> b;
    
    static {
        a = new p5x();
        b = shw.y0((Object[])new String[] { "bit_rate", "content_type", "url" });
    }
    
    @Override
    public final /* bridge */ void a(final yle yle, final lb7 lb7, final Object o) {
        this.d(yle, lb7, (o5x)o);
    }
    
    @Override
    public final /* bridge */ Object b(final kie kie, final lb7 lb7) {
        return this.c(kie, lb7);
    }
    
    public final o5x c(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        Object o = null;
        String s = null;
        Integer n = null;
        while (true) {
            final int k3 = kie.k3((List)p5x.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    if (k3 != 2) {
                        break;
                    }
                    s = (String)cr.a.b(kie, lb7);
                }
                else {
                    o = cr.a.b(kie, lb7);
                }
            }
            else {
                n = (Integer)cr.k.b(kie, lb7);
            }
        }
        e0e.c(o);
        e0e.c((Object)s);
        return new o5x(n, (String)o, s);
    }
    
    public final void d(final yle yle, final lb7 lb7, final o5x o5x) {
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)o5x, "value");
        yle.A1("bit_rate");
        cr.k.a(yle, lb7, (Object)o5x.a);
        yle.A1("content_type");
        final zq<String> a = cr.a;
        a.a(yle, lb7, o5x.b);
        yle.A1("url");
        a.a(yle, lb7, o5x.c);
    }
}
