import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a5t implements zq<p4t.k>
{
    public static final a5t a;
    public static final List<String> b;
    
    static {
        a = new a5t();
        b = shw.x0((Object)"__typename");
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final p4t.k k = (p4t.k)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)k, "value");
        yle.A1("__typename");
        cr.a.a(yle, lb7, k.a);
        final p4t.h b = k.b;
        if (b != null) {
            x4t.a.d(yle, lb7, b);
        }
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        p4t.h c = null;
        String s = null;
        while (kie.k3((List)a5t.b) == 0) {
            s = (String)cr.a.b(kie, lb7);
        }
        if (s != null) {
            if (eg8.J(eg8.w0("User"), lb7.F0.a(), s, lb7.F0)) {
                kie.H();
                c = x4t.a.c(kie, lb7);
            }
            return new p4t.k(s, c);
        }
        throw new IllegalStateException("__typename was not found".toString());
    }
}
