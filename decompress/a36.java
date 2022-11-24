import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a36 implements zq<u16.o>
{
    public static final a36 a;
    public static final List<String> b;
    
    static {
        a = new a36();
        b = shw.y0((Object[])new String[] { "title", "subtitle", "destination_obj" });
    }
    
    @Override
    public final /* bridge */ void a(final yle yle, final lb7 lb7, final Object o) {
        this.d(yle, lb7, (u16.o)o);
    }
    
    @Override
    public final /* bridge */ Object b(final kie kie, final lb7 lb7) {
        return this.c(kie, lb7);
    }
    
    public final u16.o c(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        Object o = null;
        u16.w w = null;
        u16.h h = null;
        while (true) {
            final int k3 = kie.k3((List)a36.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    if (k3 != 2) {
                        break;
                    }
                    h = (u16.h)cr.b((zq)cr.c((zq)t26.a, true)).b(kie, lb7);
                }
                else {
                    w = (u16.w)cr.c((zq)i36.a, true).b(kie, lb7);
                }
            }
            else {
                o = cr.c((zq)j36.a, true).b(kie, lb7);
            }
        }
        e0e.c(o);
        e0e.c((Object)w);
        return new u16.o((u16.x)o, w, h);
    }
    
    public final void d(final yle yle, final lb7 lb7, final u16.o o) {
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)o, "value");
        yle.A1("title");
        cr.c((zq)j36.a, true).a(yle, lb7, (Object)o.a);
        yle.A1("subtitle");
        cr.c((zq)i36.a, true).a(yle, lb7, (Object)o.b);
        yle.A1("destination_obj");
        cr.b((zq)cr.c((zq)t26.a, true)).a(yle, lb7, (Object)o.c);
    }
}
