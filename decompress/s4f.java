import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s4f implements xq<l4f.c>
{
    public static final s4f a;
    public static final List<String> b;
    
    static {
        a = new s4f();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final l4f.c c = (l4f.c)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)c, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)c.a);
        tiw.a.d(ale, fa7, c.b);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)s4f.b) == 0) {
            o = ar.a.b(ohe, fa7);
        }
        ohe.G();
        final piw c = tiw.a.c(ohe, fa7);
        czd.c(o);
        return new l4f.c((String)o, c);
    }
}
