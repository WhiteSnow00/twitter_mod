import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jr8 implements xq<er8.d>
{
    public static final jr8 a;
    public static final List<String> b;
    
    static {
        a = new jr8();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final er8.d d = (er8.d)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)d, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)d.a);
        mo0.a.d(ale, fa7, d.b);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)jr8.b) == 0) {
            o = ar.a.b(ohe, fa7);
        }
        ohe.G();
        final ko0 c = mo0.a.c(ohe, fa7);
        czd.c(o);
        return new er8.d((String)o, c);
    }
}
