import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nj9 implements xq<lj9$c>
{
    public static final nj9 a;
    public static final List<String> b;
    
    static {
        a = new nj9();
        b = s9i.r("dropsActiveChatViewer");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final lj9$c lj9$c = (lj9$c)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)lj9$c, "value");
        ale.z1("dropsActiveChatViewer");
        ar.b((xq)ar.c((xq)oj9.a, false)).a(ale, fa7, (Object)lj9$c.a);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        lj9.d d = null;
        while (ohe.j3((List)nj9.b) == 0) {
            d = (lj9.d)ar.b((xq)ar.c((xq)oj9.a, false)).b(ohe, fa7);
        }
        return new lj9$c(d);
    }
}
