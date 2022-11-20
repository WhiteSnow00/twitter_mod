import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xh0 implements xq<qh0$d>
{
    public static final xh0 a;
    public static final List<String> b;
    
    static {
        a = new xh0();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final qh0$d qh0$d = (qh0$d)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)qh0$d, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)qh0$d.a);
        ag0.a.d(ale, fa7, qh0$d.b);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)xh0.b) == 0) {
            o = ar.a.b(ohe, fa7);
        }
        ohe.G();
        final zf0 c = ag0.a.c(ohe, fa7);
        czd.c(o);
        return new qh0$d((String)o, c);
    }
}
