import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pk9 implements zq<nk9$c>
{
    public static final pk9 a;
    public static final List<String> b;
    
    static {
        a = new pk9();
        b = shw.x0((Object)"dropsActiveChatViewer");
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final nk9$c nk9$c = (nk9$c)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)nk9$c, "value");
        yle.A1("dropsActiveChatViewer");
        cr.b((zq)cr.c((zq)qk9.a, false)).a(yle, lb7, (Object)nk9$c.a);
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        nk9$d nk9$d = null;
        while (kie.k3((List)pk9.b) == 0) {
            nk9$d = (nk9$d)cr.b((zq)cr.c((zq)qk9.a, false)).b(kie, lb7);
        }
        return new nk9$c(nk9$d);
    }
}
