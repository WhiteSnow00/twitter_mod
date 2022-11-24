import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a7 implements zq<z6$b>
{
    public static final a7 a;
    public static final List<String> b;
    
    static {
        a = new a7();
        b = shw.x0((Object)"aaid_consent_put");
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final z6$b z6$b = (z6$b)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)z6$b, "value");
        yle.A1("aaid_consent_put");
        cr.b((zq)v79.a).a(yle, lb7, (Object)z6$b.a);
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        t79 t79 = null;
        while (kie.k3((List)a7.b) == 0) {
            t79 = (t79)cr.b((zq)v79.a).b(kie, lb7);
        }
        return new z6$b(t79);
    }
}
