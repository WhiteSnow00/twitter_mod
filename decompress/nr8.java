import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nr8 implements xq<er8.g>
{
    public static final nr8 a;
    public static final List<String> b;
    
    static {
        a = new nr8();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final er8.g g = (er8.g)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)g, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)g.a);
        sg0.a.d(ale, fa7, g.b);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)nr8.b) == 0) {
            o = ar.a.b(ohe, fa7);
        }
        ohe.G();
        final rg0 c = sg0.a.c(ohe, fa7);
        czd.c(o);
        return new er8.g((String)o, c);
    }
}
