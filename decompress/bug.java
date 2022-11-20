import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bug implements xq<ctg.e>
{
    public static final bug a;
    public static final List<String> b;
    
    static {
        a = new bug();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final ctg.e e = (ctg.e)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)e, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)e.a);
        wf0.a.d(ale, fa7, e.b);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)bug.b) == 0) {
            o = ar.a.b(ohe, fa7);
        }
        ohe.G();
        final vf0 c = wf0.a.c(ohe, fa7);
        czd.c(o);
        return new ctg.e((String)o, c);
    }
}
