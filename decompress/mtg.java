import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mtg implements xq<ftg$f>
{
    public static final mtg a;
    public static final List<String> b;
    
    static {
        a = new mtg();
        b = s9i.r("url");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final ftg$f ftg$f = (ftg$f)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)ftg$f, "value");
        ale.z1("url");
        ar.a.a(ale, fa7, (Object)ftg$f.a);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)mtg.b) == 0) {
            o = ar.a.b(ohe, fa7);
        }
        czd.c(o);
        return new ftg$f((String)o);
    }
}
