import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jqu implements xq<iqu$a>
{
    public static final jqu a;
    public static final List<String> b;
    
    static {
        a = new jqu();
        b = s9i.r("richText");
    }
    
    public final /* bridge */ void a(final ale ale, final fa7 fa7, final Object o) {
        this.d(ale, fa7, (iqu$a)o);
    }
    
    public final /* bridge */ Object b(final ohe ohe, final fa7 fa7) {
        return this.c(ohe, fa7);
    }
    
    public final iqu$a c(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)jqu.b) == 0) {
            o = ar.c((xq)mqu.a, true).b(ohe, fa7);
        }
        czd.c(o);
        return new iqu$a((iqu$d)o);
    }
    
    public final void d(final ale ale, final fa7 fa7, final iqu$a iqu$a) {
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)iqu$a, "value");
        ale.z1("richText");
        ar.c((xq)mqu.a, true).a(ale, fa7, (Object)iqu$a.a);
    }
}
