import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class av7 implements zq<zu7>
{
    public static final av7 a;
    public static final List<String> b;
    
    static {
        a = new av7();
        b = shw.x0((Object)"__typename");
    }
    
    @Override
    public final /* bridge */ void a(final yle yle, final lb7 lb7, final Object o) {
        this.d(yle, lb7, (zu7)o);
    }
    
    @Override
    public final /* bridge */ Object b(final kie kie, final lb7 lb7) {
        return this.c(kie, lb7);
    }
    
    public final zu7 c(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        tu7 c = null;
        String s = null;
        while (kie.k3((List)av7.b) == 0) {
            s = (String)cr.a.b(kie, lb7);
        }
        if (s != null) {
            su7 c2;
            if (eg8.J(eg8.w0("DMReactionSlice"), lb7.F0.a(), s, lb7.F0)) {
                kie.H();
                c2 = wu7.a.c(kie, lb7);
            }
            else {
                c2 = null;
            }
            if (eg8.J(eg8.w0("DMReactionSliceFailure"), lb7.F0.a(), s, lb7.F0)) {
                kie.H();
                c = uu7.a.c(kie, lb7);
            }
            return new zu7(s, c2, c);
        }
        throw new IllegalStateException("__typename was not found".toString());
    }
    
    public final void d(final yle yle, final lb7 lb7, final zu7 zu7) {
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)zu7, "value");
        yle.A1("__typename");
        cr.a.a(yle, lb7, zu7.a);
        final su7 b = zu7.b;
        if (b != null) {
            wu7.a.d(yle, lb7, b);
        }
        final tu7 c = zu7.c;
        if (c != null) {
            uu7.a.d(yle, lb7, c);
        }
    }
}
