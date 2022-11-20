import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nlu implements xq<jku$c0>
{
    public static final nlu a;
    public static final List<String> b;
    
    static {
        a = new nlu();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final jku$c0 jku$c0 = (jku$c0)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)jku$c0, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)jku$c0.a);
        zi3.a.d(ale, fa7, jku$c0.b);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)nlu.b) == 0) {
            o = ar.a.b(ohe, fa7);
        }
        ohe.G();
        final ph3 c = zi3.a.c(ohe, fa7);
        czd.c(o);
        return new jku$c0((String)o, c);
    }
}
