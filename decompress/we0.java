import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class we0 implements zq<ue0$a>
{
    public static final we0 a;
    public static final List<String> b;
    
    static {
        a = new we0();
        b = shw.y0((Object[])new String[] { "bucket", "name" });
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final ue0$a ue0$a = (ue0$a)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)ue0$a, "value");
        yle.A1("bucket");
        final v2j i = cr.i;
        i.a(yle, lb7, (Object)ue0$a.a);
        yle.A1("name");
        i.a(yle, lb7, (Object)ue0$a.b);
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        String s = null;
        String s2 = null;
        while (true) {
            final int k3 = kie.k3((List)we0.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    break;
                }
                s2 = (String)cr.i.b(kie, lb7);
            }
            else {
                s = (String)cr.i.b(kie, lb7);
            }
        }
        return new ue0$a(s, s2);
    }
}
