import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class po0 implements zq<jo0$d>
{
    public static final po0 a;
    public static final List<String> b;
    
    static {
        a = new po0();
        b = shw.y0((Object[])new String[] { "count", "star" });
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final jo0$d jo0$d = (jo0$d)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)jo0$d, "value");
        yle.A1("count");
        Objects.requireNonNull(p3j.Companion);
        cr.b((zq)lb7.a(p3j.a)).a(yle, lb7, (Object)jo0$d.a);
        yle.A1("star");
        cr.j.a(yle, lb7, (Object)jo0$d.b);
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        String s = null;
        Double n = null;
        while (true) {
            final int k3 = kie.k3((List)po0.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    break;
                }
                n = (Double)cr.j.b(kie, lb7);
            }
            else {
                Objects.requireNonNull(p3j.Companion);
                s = (String)zk.x(lb7, p3j.a, kie, lb7);
            }
        }
        return new jo0$d(s, n);
    }
}
