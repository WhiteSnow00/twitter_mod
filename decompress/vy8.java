import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vy8 implements zq<ty8.a>
{
    public static final vy8 a;
    public static final List<String> b;
    
    static {
        a = new vy8();
        b = shw.x0((Object)"__typename");
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final ty8.a a = (ty8.a)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)a, "value");
        yle.A1("__typename");
        cr.a.a(yle, lb7, a.a);
        final my8 b = a.b;
        if (b != null) {
            oy8.a.d(yle, lb7, b);
        }
        final skw c = a.c;
        if (c != null) {
            vkw.a.d(yle, lb7, c);
        }
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        skw c = null;
        String s = null;
        while (kie.k3((List)vy8.b) == 0) {
            s = (String)cr.a.b(kie, lb7);
        }
        if (s != null) {
            my8 c2;
            if (eg8.J(eg8.w0("User"), lb7.F0.a(), s, lb7.F0)) {
                kie.H();
                c2 = oy8.a.c(kie, lb7);
            }
            else {
                c2 = null;
            }
            if (eg8.J(eg8.w0("UserUnavailable"), lb7.F0.a(), s, lb7.F0)) {
                kie.H();
                c = vkw.a.c(kie, lb7);
            }
            return new ty8.a(s, c2, c);
        }
        throw new IllegalStateException("__typename was not found".toString());
    }
}
