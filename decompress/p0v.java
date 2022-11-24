import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p0v implements zq<o0v$a>
{
    public static final p0v a;
    public static final List<String> b;
    
    static {
        a = new p0v();
        b = shw.y0((Object[])new String[] { "url", "url_type" });
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final o0v$a o0v$a = (o0v$a)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)o0v$a, "value");
        yle.A1("url");
        cr.a.a(yle, lb7, o0v$a.a);
        yle.A1("url_type");
        final j9t b = o0v$a.b;
        e0e.f((Object)b, "value");
        yle.i2(b.F0);
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        Object o = null;
        j9t g0 = null;
    Label_0018:
        while (true) {
            final int k3 = kie.k3((List)p0v.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    break;
                }
                final String s1 = kie.S1();
                e0e.c((Object)s1);
                Objects.requireNonNull(j9t.Companion);
                final j9t[] values = j9t.values();
                final int length = values.length;
                int i = 0;
                while (true) {
                    while (i < length) {
                        final j9t j9t = values[i];
                        if (e0e.a((Object)j9t.F0, (Object)s1)) {
                            g0 = j9t;
                            if (j9t == null) {
                                g0 = j9t.G0;
                                continue Label_0018;
                            }
                            continue Label_0018;
                        }
                        else {
                            ++i;
                        }
                    }
                    final j9t j9t = null;
                    continue;
                }
            }
            else {
                o = cr.a.b(kie, lb7);
            }
        }
        e0e.c(o);
        e0e.c((Object)g0);
        return new o0v$a((String)o, g0);
    }
}
