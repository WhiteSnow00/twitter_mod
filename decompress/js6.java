import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class js6 implements xq<mp6$f>
{
    public static final js6 a;
    public static final List<String> b;
    
    static {
        a = new js6();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final mp6$f mp6$f = (mp6$f)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)mp6$f, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)mp6$f.a);
        final mp6$d b = mp6$f.b;
        if (b != null) {
            hs6.a.d(ale, fa7, b);
        }
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        mp6$d c = null;
        String s = null;
        while (ohe.j3((List)js6.b) == 0) {
            s = (String)ar.a.b(ohe, fa7);
        }
        if (s != null) {
            if (npe.G(npe.f0(new String[] { "User" }), fa7.D0.a(), s, fa7.D0)) {
                ohe.G();
                c = hs6.a.c(ohe, fa7);
            }
            return new mp6$f(s, c);
        }
        throw new IllegalStateException("__typename was not found".toString());
    }
}
