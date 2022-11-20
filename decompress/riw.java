import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class riw implements xq<piw.b>
{
    public static final riw a;
    public static final List<String> b;
    
    static {
        a = new riw();
        b = s9i.r("__typename");
    }
    
    public final /* bridge */ void a(final ale ale, final fa7 fa7, final Object o) {
        this.d(ale, fa7, (piw.b)o);
    }
    
    public final /* bridge */ Object b(final ohe ohe, final fa7 fa7) {
        return this.c(ohe, fa7);
    }
    
    public final piw.b c(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)riw.b) == 0) {
            o = ar.a.b(ohe, fa7);
        }
        ohe.G();
        final dkw c = gkw.a.c(ohe, fa7);
        czd.c(o);
        return new piw.b((String)o, c);
    }
    
    public final void d(final ale ale, final fa7 fa7, final piw.b b) {
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)b, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)b.a);
        gkw.a.d(ale, fa7, b.b);
    }
}
