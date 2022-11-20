import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kf0 implements xq<hf0$a>
{
    public static final kf0 a;
    public static final List<String> b;
    
    static {
        a = new kf0();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final hf0$a hf0$a = (hf0$a)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)hf0$a, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)hf0$a.a);
        dv0.a.d(ale, fa7, hf0$a.b);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)kf0.b) == 0) {
            o = ar.a.b(ohe, fa7);
        }
        ohe.G();
        final cv0 c = dv0.a.c(ohe, fa7);
        czd.c(o);
        return new hf0$a((String)o, c);
    }
}
