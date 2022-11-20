import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c26 implements xq<o06$w>
{
    public static final c26 a;
    public static final List<String> b;
    
    static {
        a = new c26();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final o06$w o06$w = (o06$w)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)o06$w, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)o06$w.a);
        sx8.a.d(ale, fa7, o06$w.b);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)c26.b) == 0) {
            o = ar.a.b(ohe, fa7);
        }
        ohe.G();
        final rx8 c = sx8.a.c(ohe, fa7);
        czd.c(o);
        return new o06$w((String)o, c);
    }
}
