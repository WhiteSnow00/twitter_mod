import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bn7 implements xq<pm7.k>
{
    public static final bn7 a;
    public static final List<String> b;
    
    static {
        a = new bn7();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final pm7.k k = (pm7.k)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)k, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)k.a);
        veq.a.d(ale, fa7, k.b);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)bn7.b) == 0) {
            o = ar.a.b(ohe, fa7);
        }
        ohe.G();
        final ueq c = veq.a.c(ohe, fa7);
        czd.c(o);
        return new pm7.k((String)o, c);
    }
}
