import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rtw implements xq<ptw.a>
{
    public static final rtw a;
    public static final List<String> b;
    
    static {
        a = new rtw();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final ptw.a a = (ptw.a)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)a, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)a.a);
        h16.a.d(ale, fa7, a.b);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)rtw.b) == 0) {
            o = ar.a.b(ohe, fa7);
        }
        ohe.G();
        final o06 c = h16.a.c(ohe, fa7);
        czd.c(o);
        return new ptw.a((String)o, c);
    }
}
