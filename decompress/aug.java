import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aug implements zq<ytg$b>
{
    public static final aug a;
    public static final List<String> b;
    
    static {
        a = new aug();
        b = shw.x0((Object)"user_results");
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final ytg$b ytg$b = (ytg$b)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)ytg$b, "value");
        yle.A1("user_results");
        cr.c((zq)dug.a, false).a(yle, lb7, (Object)ytg$b.a);
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        Object o = null;
        while (kie.k3((List)aug.b) == 0) {
            o = cr.c((zq)dug.a, false).b(kie, lb7);
        }
        e0e.c(o);
        return new ytg$b((ytg$d)o);
    }
}
