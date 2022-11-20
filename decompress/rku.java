import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rku implements xq<jku$h>
{
    public static final rku a;
    public static final List<String> b;
    
    static {
        a = new rku();
        b = s9i.r("screen_name");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final jku$h jku$h = (jku$h)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)jku$h, "value");
        ale.z1("screen_name");
        ar.i.a(ale, fa7, (Object)jku$h.a);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        String s = null;
        while (ohe.j3((List)rku.b) == 0) {
            s = (String)ar.i.b(ohe, fa7);
        }
        return new jku$h(s);
    }
}
