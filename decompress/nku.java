import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nku implements xq<jku$d>
{
    public static final nku a;
    public static final List<String> b;
    
    static {
        a = new nku();
        b = s9i.r("is_downvoted");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final jku$d jku$d = (jku$d)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)jku$d, "value");
        ale.z1("is_downvoted");
        ar.f.a(ale, fa7, (Object)jku$d.a);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)nku.b) == 0) {
            o = ar.f.b(ohe, fa7);
        }
        czd.c(o);
        return new jku$d((boolean)o);
    }
}
