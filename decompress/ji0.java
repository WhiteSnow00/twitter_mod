import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ji0 implements xq<fi0$b>
{
    public static final ji0 a;
    public static final List<String> b;
    
    static {
        a = new ji0();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final fi0$b fi0$b = (fi0$b)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)fi0$b, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)fi0$b.a);
        pf0.a.d(ale, fa7, fi0$b.b);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)ji0.b) == 0) {
            o = ar.a.b(ohe, fa7);
        }
        ohe.G();
        final nf0 c = pf0.a.c(ohe, fa7);
        czd.c(o);
        return new fi0$b((String)o, c);
    }
}
