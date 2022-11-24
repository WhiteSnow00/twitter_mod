import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class psg implements zq<osg>
{
    public static final psg a;
    public static final List<String> b;
    
    static {
        a = new psg();
        b = shw.x0((Object)"palette");
    }
    
    @Override
    public final /* bridge */ void a(final yle yle, final lb7 lb7, final Object o) {
        this.d(yle, lb7, (osg)o);
    }
    
    @Override
    public final /* bridge */ Object b(final kie kie, final lb7 lb7) {
        return this.c(kie, lb7);
    }
    
    public final osg c(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        List<osg.a> c = null;
        while (kie.k3((List)psg.b) == 0) {
            c = cr.a((zq)cr.c((zq)qsg.a, false)).c(kie, lb7);
        }
        e0e.c((Object)c);
        return new osg(c);
    }
    
    public final void d(final yle yle, final lb7 lb7, final osg osg) {
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)osg, "value");
        yle.A1("palette");
        cr.a((zq)cr.c((zq)qsg.a, false)).d(yle, lb7, osg.a);
    }
}
