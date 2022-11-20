import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rm7 implements xq<pm7.a>
{
    public static final rm7 a;
    public static final List<String> b;
    
    static {
        a = new rm7();
        b = s9i.r("result");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final pm7.a a = (pm7.a)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)a, "value");
        ale.z1("result");
        ar.b((xq)ar.c((xq)an7.a, true)).a(ale, fa7, (Object)a.a);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        pm7.j j = null;
        while (ohe.j3((List)rm7.b) == 0) {
            j = (pm7.j)ar.b((xq)ar.c((xq)an7.a, true)).b(ohe, fa7);
        }
        return new pm7.a(j);
    }
}
