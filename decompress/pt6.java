import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pt6 implements zq<sq6$f>
{
    public static final pt6 a;
    public static final List<String> b;
    
    static {
        a = new pt6();
        b = shw.x0((Object)"__typename");
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final sq6$f sq6$f = (sq6$f)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)sq6$f, "value");
        yle.A1("__typename");
        cr.a.a(yle, lb7, sq6$f.a);
        final sq6$d b = sq6$f.b;
        if (b != null) {
            nt6.a.d(yle, lb7, b);
        }
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        sq6$d c = null;
        String s = null;
        while (kie.k3((List)pt6.b) == 0) {
            s = (String)cr.a.b(kie, lb7);
        }
        if (s != null) {
            if (eg8.J(eg8.w0("User"), lb7.F0.a(), s, lb7.F0)) {
                kie.H();
                c = nt6.a.c(kie, lb7);
            }
            return new sq6$f(s, c);
        }
        throw new IllegalStateException("__typename was not found".toString());
    }
}
