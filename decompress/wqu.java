import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wqu implements xq<tqu$c>
{
    public static final wqu a;
    public static final List<String> b;
    
    static {
        a = new wqu();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final tqu$c tqu$c = (tqu$c)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)tqu$c, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)tqu$c.a);
        csb.a.d(ale, fa7, tqu$c.b);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)wqu.b) == 0) {
            o = ar.a.b(ohe, fa7);
        }
        ohe.G();
        final bsb c = csb.a.c(ohe, fa7);
        czd.c(o);
        return new tqu$c((String)o, c);
    }
}
