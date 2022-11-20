import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class x16 implements xq<o06$r>
{
    public static final x16 a;
    public static final List<String> b;
    
    static {
        a = new x16();
        b = s9i.r("__typename");
    }
    
    public final /* bridge */ void a(final ale ale, final fa7 fa7, final Object o) {
        this.d(ale, fa7, (o06$r)o);
    }
    
    public final /* bridge */ Object b(final ohe ohe, final fa7 fa7) {
        return this.c(ohe, fa7);
    }
    
    public final o06$r c(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)x16.b) == 0) {
            o = ar.a.b(ohe, fa7);
        }
        ohe.G();
        final dsg c = gsg.a.c(ohe, fa7);
        czd.c(o);
        return new o06$r((String)o, c);
    }
    
    public final void d(final ale ale, final fa7 fa7, final o06$r o06$r) {
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)o06$r, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)o06$r.a);
        gsg.a.d(ale, fa7, o06$r.b);
    }
}
