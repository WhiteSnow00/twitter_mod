import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jlu implements xq<jku$z>
{
    public static final jlu a;
    public static final List<String> b;
    
    static {
        a = new jlu();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final jku$z jku$z = (jku$z)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)jku$z, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)jku$z.a);
        final jku$o b = jku$z.b;
        if (b != null) {
            yku.a.d(ale, fa7, b);
        }
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        jku$o c = null;
        String s = null;
        while (ohe.j3((List)jlu.b) == 0) {
            s = (String)ar.a.b(ohe, fa7);
        }
        if (s != null) {
            if (npe.G(npe.f0(new String[] { "User" }), fa7.D0.a(), s, fa7.D0)) {
                ohe.G();
                c = yku.a.c(ohe, fa7);
            }
            return new jku$z(s, c);
        }
        throw new IllegalStateException("__typename was not found".toString());
    }
}
