import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rmr implements xq<pmr.c>
{
    public static final rmr a;
    public static final List<String> b;
    
    static {
        a = new rmr();
        b = s9i.s("revue_account_id", "subscription_status");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final pmr.c c = (pmr.c)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)c, "value");
        ale.z1("revue_account_id");
        Objects.requireNonNull(c3j.Companion);
        fa7.a(c3j.a).a(ale, fa7, (Object)c.a);
        ale.z1("subscription_status");
        ar.b((xq)rwm.a).a(ale, fa7, (Object)c.b);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        qwm qwm = null;
        while (true) {
            final int j3 = ohe.j3((List)rmr.b);
            if (j3 != 0) {
                if (j3 != 1) {
                    break;
                }
                qwm = (qwm)ar.b((xq)rwm.a).b(ohe, fa7);
            }
            else {
                Objects.requireNonNull(c3j.Companion);
                o = fa7.a(c3j.a).b(ohe, fa7);
            }
        }
        czd.c(o);
        return new pmr.c((String)o, qwm);
    }
}
