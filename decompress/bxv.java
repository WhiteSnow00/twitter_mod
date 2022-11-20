import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bxv implements xq<gwv$d>
{
    public static final bxv a;
    public static final List<String> b;
    
    static {
        a = new bxv();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final gwv$d gwv$d = (gwv$d)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)gwv$d, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)gwv$d.a);
        stw.a.d(ale, fa7, gwv$d.b);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)bxv.b) == 0) {
            o = ar.a.b(ohe, fa7);
        }
        ohe.G();
        final ptw c = stw.a.c(ohe, fa7);
        czd.c(o);
        return new gwv$d((String)o, c);
    }
}
