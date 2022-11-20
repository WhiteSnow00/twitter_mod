import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bp4 implements xq<yo4>
{
    public static final bp4 a;
    public static final List<String> b;
    
    static {
        a = new bp4();
        b = s9i.r("__typename");
    }
    
    public final /* bridge */ void a(final ale ale, final fa7 fa7, final Object o) {
        this.d(ale, fa7, (yo4)o);
    }
    
    public final /* bridge */ Object b(final ohe ohe, final fa7 fa7) {
        return this.c(ohe, fa7);
    }
    
    public final yo4 c(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object c = null;
        String s = null;
        while (ohe.j3((List)bp4.b) == 0) {
            s = (String)ar.a.b(ohe, fa7);
        }
        if (s != null) {
            Object c2;
            if (npe.G(npe.f0(new String[] { "CollabTweet" }), fa7.D0.a(), s, fa7.D0)) {
                ohe.G();
                c2 = ep4.a.c(ohe, fa7);
            }
            else {
                c2 = null;
            }
            if (npe.G(npe.f0(new String[] { "CollabInvitation" }), fa7.D0.a(), s, fa7.D0)) {
                ohe.G();
                c = dp4.a.c(ohe, fa7);
            }
            return new yo4(s, (yo4.e)c2, (yo4.d)c);
        }
        throw new IllegalStateException("__typename was not found".toString());
    }
    
    public final void d(final ale ale, final fa7 fa7, final yo4 yo4) {
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)yo4, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)yo4.a);
        final yo4.e b = yo4.b;
        if (b != null) {
            ep4.a.d(ale, fa7, b);
        }
        final yo4.d c = yo4.c;
        if (c != null) {
            dp4.a.d(ale, fa7, c);
        }
    }
}
