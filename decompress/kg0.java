import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kg0 implements xq<tf0$f>
{
    public static final kg0 a;
    public static final List<String> b;
    
    static {
        a = new kg0();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final tf0$f tf0$f = (tf0$f)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)tf0$f, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)tf0$f.a);
        final tf0$e b = tf0$f.b;
        if (b != null) {
            jg0.a.d(ale, fa7, b);
        }
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        tf0$e c = null;
        String s = null;
        while (ohe.j3((List)kg0.b) == 0) {
            s = (String)ar.a.b(ohe, fa7);
        }
        if (s != null) {
            if (npe.G(npe.f0(new String[] { "ApiMediaUnavailabilityInfoCopyrightViolation" }), fa7.D0.a(), s, fa7.D0)) {
                ohe.G();
                c = jg0.a.c(ohe, fa7);
            }
            return new tf0$f(s, c);
        }
        throw new IllegalStateException("__typename was not found".toString());
    }
}
