import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jug implements xq<ctg.l>
{
    public static final jug a;
    public static final List<String> b;
    
    static {
        a = new jug();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final ctg.l l = (ctg.l)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)l, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)l.a);
        sug.a.d(ale, fa7, l.b);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)jug.b) == 0) {
            o = ar.a.b(ohe, fa7);
        }
        ohe.G();
        final qug c = sug.a.c(ohe, fa7);
        czd.c(o);
        return new ctg.l((String)o, c);
    }
}
