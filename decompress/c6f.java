import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c6f implements xq<t5f$h>
{
    public static final c6f a;
    public static final List<String> b;
    
    static {
        a = new c6f();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final t5f$h t5f$h = (t5f$h)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)t5f$h, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)t5f$h.a);
        hug.a.d(ale, fa7, t5f$h.b);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)c6f.b) == 0) {
            o = ar.a.b(ohe, fa7);
        }
        ohe.G();
        final ctg c = hug.a.c(ohe, fa7);
        czd.c(o);
        return new t5f$h((String)o, c);
    }
}
