import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ah0 implements zq<zg0>
{
    public static final ah0 a;
    public static final List<String> b;
    
    static {
        a = new ah0();
        b = shw.y0((Object[])new String[] { "attributes", "bounding_box", "centroid", "country", "country_code", "full_name", "id", "name", "place_type", "vendor_info" });
    }
    
    @Override
    public final /* bridge */ void a(final yle yle, final lb7 lb7, final Object o) {
        this.d(yle, lb7, (zg0)o);
    }
    
    @Override
    public final /* bridge */ Object b(final kie kie, final lb7 lb7) {
        return this.c(kie, lb7);
    }
    
    public final zg0 c(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        zg0$a zg0$a = null;
        Object o = null;
        Object o3;
        Object o2 = o3 = o;
        Object o5;
        Object o4 = o5 = o3;
        Object o7;
        Object o6 = o7 = o5;
        Object o9;
        Object o8 = o9 = o7;
        while (true) {
            switch (kie.k3((List)ah0.b)) {
                default: {
                    return new zg0(zg0$a, (zg0$b)o, (List)o2, (String)o3, (String)o4, (String)o5, (String)o6, (String)o7, (String)o8, (zg0$d)o9);
                }
                case 9: {
                    final eh0 a = eh0.a;
                    final zq<String> a2 = cr.a;
                    o9 = cr.b((zq)new y4j((zq)a, false)).b(kie, lb7);
                    continue;
                }
                case 8: {
                    o8 = cr.i.b(kie, lb7);
                    continue;
                }
                case 7: {
                    o7 = cr.i.b(kie, lb7);
                    continue;
                }
                case 6: {
                    o6 = cr.i.b(kie, lb7);
                    continue;
                }
                case 5: {
                    o5 = cr.i.b(kie, lb7);
                    continue;
                }
                case 4: {
                    o4 = cr.i.b(kie, lb7);
                    continue;
                }
                case 3: {
                    o3 = cr.i.b(kie, lb7);
                    continue;
                }
                case 2: {
                    o2 = cr.b((zq)new ejf(cr.c)).b(kie, lb7);
                    continue;
                }
                case 1: {
                    final ch0 a3 = ch0.a;
                    final zq<String> a4 = cr.a;
                    o = cr.b((zq)new y4j((zq)a3, false)).b(kie, lb7);
                    continue;
                }
                case 0: {
                    final bh0 a5 = bh0.a;
                    final zq<String> a6 = cr.a;
                    zg0$a = (zg0$a)cr.b((zq)new y4j((zq)a5, false)).b(kie, lb7);
                    continue;
                }
            }
        }
    }
    
    public final void d(final yle yle, final lb7 lb7, final zg0 zg0) {
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)zg0, "value");
        yle.A1("attributes");
        final bh0 a = bh0.a;
        final zq<String> a2 = cr.a;
        cr.b((zq)new y4j((zq)a, false)).a(yle, lb7, (Object)zg0.a);
        yle.A1("bounding_box");
        cr.b((zq)new y4j((zq)ch0.a, false)).a(yle, lb7, (Object)zg0.b);
        yle.A1("centroid");
        cr.b((zq)new ejf(cr.c)).a(yle, lb7, (Object)zg0.c);
        yle.A1("country");
        final v2j i = cr.i;
        i.a(yle, lb7, (Object)zg0.d);
        yle.A1("country_code");
        i.a(yle, lb7, (Object)zg0.e);
        yle.A1("full_name");
        i.a(yle, lb7, (Object)zg0.f);
        yle.A1("id");
        i.a(yle, lb7, (Object)zg0.g);
        yle.A1("name");
        i.a(yle, lb7, (Object)zg0.h);
        yle.A1("place_type");
        i.a(yle, lb7, (Object)zg0.i);
        yle.A1("vendor_info");
        cr.b((zq)new y4j((zq)eh0.a, false)).a(yle, lb7, (Object)zg0.j);
    }
}
