import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w43 implements zq<t43$b>
{
    public static final w43 a;
    public static final List<String> b;
    
    static {
        a = new w43();
        b = shw.x0((Object)"__typename");
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final t43$b t43$b = (t43$b)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)t43$b, "value");
        yle.A1("__typename");
        cr.a.a(yle, lb7, t43$b.a);
        zy8.a.d(yle, lb7, t43$b.b);
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        Object o = null;
        while (kie.k3((List)w43.b) == 0) {
            o = cr.a.b(kie, lb7);
        }
        kie.H();
        final yy8 c = zy8.a.c(kie, lb7);
        e0e.c(o);
        return new t43$b((String)o, c);
    }
}
