import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wlt implements xq<tlt$b>
{
    public static final wlt a;
    public static final List<String> b;
    
    static {
        a = new wlt();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final tlt$b tlt$b = (tlt$b)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)tlt$b, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)tlt$b.a);
        sx8.a.d(ale, fa7, tlt$b.b);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)wlt.b) == 0) {
            o = ar.a.b(ohe, fa7);
        }
        ohe.G();
        final rx8 c = sx8.a.c(ohe, fa7);
        czd.c(o);
        return new tlt$b((String)o, c);
    }
}
