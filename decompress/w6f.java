import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w6f implements zq<r6f$e>
{
    public static final w6f a;
    public static final List<String> b;
    
    static {
        a = new w6f();
        b = shw.x0((Object)"id_str");
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final r6f$e r6f$e = (r6f$e)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)r6f$e, "value");
        yle.A1("id_str");
        cr.i.a(yle, lb7, (Object)r6f$e.a);
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        String s = null;
        while (kie.k3((List)w6f.b) == 0) {
            s = (String)cr.i.b(kie, lb7);
        }
        return new r6f$e(s);
    }
}
