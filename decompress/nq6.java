import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nq6 implements xq<hq6>
{
    public static final nq6 a;
    public static final List<String> b;
    
    static {
        a = new nq6();
        b = s9i.s("policy", "conversation_owner_results");
    }
    
    public final /* bridge */ void a(final ale ale, final fa7 fa7, final Object o) {
        this.d(ale, fa7, (hq6)o);
    }
    
    public final /* bridge */ Object b(final ohe ohe, final fa7 fa7) {
        return this.c(ohe, fa7);
    }
    
    public final hq6 c(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        ze0 e0 = null;
        hq6$a hq6$a = null;
    Label_0018:
        while (true) {
            final int j3 = ohe.j3((List)nq6.b);
            int i = 0;
            if (j3 == 0) {
                final String r1 = ohe.R1();
                czd.c((Object)r1);
                Objects.requireNonNull(ze0.Companion);
                final ze0[] values = ze0.values();
                while (true) {
                    while (i < values.length) {
                        final ze0 ze0 = values[i];
                        if (czd.a((Object)ze0.D0, (Object)r1)) {
                            e0 = ze0;
                            if (ze0 == null) {
                                e0 = ze0.E0;
                                continue Label_0018;
                            }
                            continue Label_0018;
                        }
                        else {
                            ++i;
                        }
                    }
                    final ze0 ze0 = null;
                    continue;
                }
            }
            if (j3 != 1) {
                break;
            }
            hq6$a = (hq6$a)ar.c((xq)oq6.a, false).b(ohe, fa7);
        }
        czd.c((Object)e0);
        czd.c((Object)hq6$a);
        return new hq6(e0, hq6$a);
    }
    
    public final void d(final ale ale, final fa7 fa7, final hq6 hq6) {
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)hq6, "value");
        ale.z1("policy");
        final ze0 a = hq6.a;
        czd.f((Object)a, "value");
        ale.h2(a.D0);
        ale.z1("conversation_owner_results");
        ar.c((xq)oq6.a, false).a(ale, fa7, (Object)hq6.b);
    }
}
