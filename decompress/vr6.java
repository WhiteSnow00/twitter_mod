import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vr6 implements zq<or6.b>
{
    public static final vr6 a;
    public static final List<String> b;
    
    static {
        a = new vr6();
        b = shw.x0((Object)"screen_name");
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final or6.b b = (or6.b)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)b, "value");
        yle.A1("screen_name");
        cr.i.a(yle, lb7, (Object)b.a);
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        String s = null;
        while (kie.k3((List)vr6.b) == 0) {
            s = (String)cr.i.b(kie, lb7);
        }
        return new or6.b(s);
    }
}
