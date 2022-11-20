import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nf7 implements xq<jf7$c>
{
    public static final nf7 a;
    public static final List<String> b;
    
    static {
        a = new nf7();
        b = s9i.r("__typename");
    }
    
    public final /* bridge */ void a(final ale ale, final fa7 fa7, final Object o) {
        this.d(ale, fa7, (jf7$c)o);
    }
    
    public final /* bridge */ Object b(final ohe ohe, final fa7 fa7) {
        return this.c(ohe, fa7);
    }
    
    public final jf7$c c(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)nf7.b) == 0) {
            o = ar.a.b(ohe, fa7);
        }
        ohe.G();
        final n38 c = o38.a.c(ohe, fa7);
        czd.c(o);
        return new jf7$c((String)o, c);
    }
    
    public final void d(final ale ale, final fa7 fa7, final jf7$c jf7$c) {
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)jf7$c, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)jf7$c.a);
        o38.a.d(ale, fa7, jf7$c.b);
    }
}
