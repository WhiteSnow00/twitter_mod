import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bwm implements xq<xvm$e>
{
    public static final bwm a;
    public static final List<String> b;
    
    static {
        a = new bwm();
        b = s9i.s("terms_of_service_url", "privacy_policy_url");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final xvm$e xvm$e = (xvm$e)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)xvm$e, "value");
        ale.z1("terms_of_service_url");
        final ar$g a = ar.a;
        a.a(ale, fa7, (Object)xvm$e.a);
        ale.z1("privacy_policy_url");
        a.a(ale, fa7, (Object)xvm$e.b);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        String s = null;
        while (true) {
            final int j3 = ohe.j3((List)bwm.b);
            if (j3 != 0) {
                if (j3 != 1) {
                    break;
                }
                s = (String)ar.a.b(ohe, fa7);
            }
            else {
                o = ar.a.b(ohe, fa7);
            }
        }
        czd.c(o);
        czd.c((Object)s);
        return new xvm$e((String)o, s);
    }
}
