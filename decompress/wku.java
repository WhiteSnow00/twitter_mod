import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wku implements zq<vku$a>
{
    public static final wku a;
    public static final List<String> b;
    
    static {
        a = new wku();
        b = shw.y0((Object[])new String[] { "reply_count", "participants_top_results" });
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final vku$a vku$a = (vku$a)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)vku$a, "value");
        yle.A1("reply_count");
        cr.b.a(yle, lb7, vku$a.a);
        yle.A1("participants_top_results");
        final mlu a = mlu.a;
        final List b = vku$a.b;
        e0e.f((Object)b, "value");
        yle.J();
        for (final Object next : b) {
            if (!(yle instanceof ukg)) {
                final ukg ukg = new ukg();
                ukg.G();
                ((zq<Object>)a).a((yle)ukg, lb7, next);
                ukg.Q();
                if (!ukg.G0) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                final Object f0 = ukg.F0;
                e0e.c(f0);
                iuk.S0(yle, f0);
            }
            else {
                yle.G();
                ((zq<Object>)a).a(yle, lb7, next);
                yle.Q();
            }
        }
        yle.I();
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        Object o = null;
        List<Object> list = null;
        while (true) {
            final int k3 = kie.k3((List)wku.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    break;
                }
                final mlu a = mlu.a;
                final zq<String> a2 = cr.a;
                final y4j y4j = new y4j((zq)a, true);
                kie.J();
                list = new ArrayList<Object>();
                while (kie.hasNext()) {
                    list.add(((zq)y4j).b(kie, lb7));
                }
                kie.I();
            }
            else {
                o = cr.b.b(kie, lb7);
            }
        }
        e0e.c(o);
        final int intValue = (int)o;
        e0e.c((Object)list);
        return new vku$a(intValue, (List)list);
    }
}
