import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wk9 implements zq<nk9$j>
{
    public static final wk9 a;
    public static final List<String> b;
    
    static {
        a = new wk9();
        b = shw.x0((Object)"result");
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final nk9$j nk9$j = (nk9$j)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)nk9$j, "value");
        yle.A1("result");
        cr.b((zq)cr.c((zq)vk9.a, true)).a(yle, lb7, (Object)nk9$j.a);
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        nk9$i nk9$i = null;
        while (kie.k3((List)wk9.b) == 0) {
            nk9$i = (nk9$i)cr.b((zq)cr.c((zq)vk9.a, true)).b(kie, lb7);
        }
        return new nk9$j(nk9$i);
    }
}
