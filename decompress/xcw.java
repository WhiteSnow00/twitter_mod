import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xcw implements xq<f8w$b>
{
    public static final xcw a;
    public static final List<String> b;
    
    static {
        a = new xcw();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final f8w$b f8w$b = (f8w$b)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)f8w$b, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)f8w$b.a);
        v4l.a.d(ale, fa7, f8w$b.b);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)xcw.b) == 0) {
            o = ar.a.b(ohe, fa7);
        }
        ohe.G();
        final d4l c = v4l.a.c(ohe, fa7);
        czd.c(o);
        return new f8w$b((String)o, c);
    }
}
