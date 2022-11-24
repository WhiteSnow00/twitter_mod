import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class avg implements zq<vtg$j>
{
    public static final avg a;
    public static final List<String> b;
    
    static {
        a = new avg();
        b = shw.y0((Object[])new String[] { "w", "h" });
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final vtg$j vtg$j = (vtg$j)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)vtg$j, "value");
        yle.A1("w");
        Objects.requireNonNull(aud.Companion);
        final mb7 a = aud.a;
        cr.b((zq)lb7.a(a)).a(yle, lb7, (Object)vtg$j.a);
        yle.A1("h");
        cr.b((zq)lb7.a(a)).a(yle, lb7, (Object)vtg$j.b);
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        Integer n = null;
        Integer n2 = null;
        while (true) {
            final int k3 = kie.k3((List)avg.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    break;
                }
                Objects.requireNonNull(aud.Companion);
                n2 = (Integer)zk.x(lb7, aud.a, kie, lb7);
            }
            else {
                Objects.requireNonNull(aud.Companion);
                n = (Integer)zk.x(lb7, aud.a, kie, lb7);
            }
        }
        return new vtg$j(n, n2);
    }
}
