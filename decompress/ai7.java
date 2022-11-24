import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ai7 implements zq<zh7>
{
    public static final ai7 a;
    public static final List<String> b;
    
    static {
        a = new ai7();
        b = shw.x0((Object)"__typename");
    }
    
    @Override
    public final /* bridge */ void a(final yle yle, final lb7 lb7, final Object o) {
        this.d(yle, lb7, (zh7)o);
    }
    
    @Override
    public final /* bridge */ Object b(final kie kie, final lb7 lb7) {
        return this.c(kie, lb7);
    }
    
    public final zh7 c(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        io7 c = null;
        String s = null;
        while (kie.k3((List)ai7.b) == 0) {
            s = (String)cr.a.b(kie, lb7);
        }
        if (s != null) {
            rh7 c2;
            if (eg8.J(eg8.w0("DMEvent"), lb7.F0.a(), s, lb7.F0)) {
                kie.H();
                c2 = sh7.a.c(kie, lb7);
            }
            else {
                c2 = null;
            }
            if (eg8.J(eg8.w0("DMEventUnavailable"), lb7.F0.a(), s, lb7.F0)) {
                kie.H();
                c = jo7.a.c(kie, lb7);
            }
            return new zh7(s, c2, c);
        }
        throw new IllegalStateException("__typename was not found".toString());
    }
    
    public final void d(final yle yle, final lb7 lb7, final zh7 zh7) {
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)zh7, "value");
        yle.A1("__typename");
        cr.a.a(yle, lb7, zh7.a);
        final rh7 b = zh7.b;
        if (b != null) {
            sh7.a.d(yle, lb7, b);
        }
        final io7 c = zh7.c;
        if (c != null) {
            jo7.a.d(yle, lb7, c);
        }
    }
}
