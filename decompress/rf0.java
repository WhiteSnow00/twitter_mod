import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rf0 implements xq<nf0$b>
{
    public static final rf0 a;
    public static final List<String> b;
    
    static {
        a = new rf0();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final nf0$b nf0$b = (nf0$b)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)nf0$b, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)nf0$b.a);
        gro.a.d(ale, fa7, nf0$b.b);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)rf0.b) == 0) {
            o = ar.a.b(ohe, fa7);
        }
        ohe.G();
        final fro c = gro.a.c(ohe, fa7);
        czd.c(o);
        return new nf0$b((String)o, c);
    }
}
