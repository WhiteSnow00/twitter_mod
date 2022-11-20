import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mug implements xq<ctg.o>
{
    public static final mug a;
    public static final List<String> b;
    
    static {
        a = new mug();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final ctg.o o2 = (ctg.o)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)o2, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)o2.a);
        final ctg.k b = o2.b;
        if (b != null) {
            iug.a.d(ale, fa7, b);
        }
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        ctg.k c = null;
        String s = null;
        while (ohe.j3((List)mug.b) == 0) {
            s = (String)ar.a.b(ohe, fa7);
        }
        if (s != null) {
            if (npe.G(npe.f0(new String[] { "ApiMediaUnavailabilityInfoCopyrightViolation" }), fa7.D0.a(), s, fa7.D0)) {
                ohe.G();
                c = iug.a.c(ohe, fa7);
            }
            return new ctg.o(s, c);
        }
        throw new IllegalStateException("__typename was not found".toString());
    }
}
