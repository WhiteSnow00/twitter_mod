import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k0v implements xq<j0v>
{
    public static final k0v a;
    public static final List<String> b;
    
    static {
        a = new k0v();
        b = s9i.s("tweet_visibility_nudge_action_type", "tweet_visibility_nudge_action_payload");
    }
    
    public final /* bridge */ void a(final ale ale, final fa7 fa7, final Object o) {
        this.d(ale, fa7, (j0v)o);
    }
    
    public final /* bridge */ Object b(final ohe ohe, final fa7 fa7) {
        return this.c(ohe, fa7);
    }
    
    public final j0v c(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        i0v e0 = null;
        j0v$a j0v$a = null;
    Label_0018:
        while (true) {
            final int j3 = ohe.j3((List)k0v.b);
            if (j3 == 0) {
                final String r1 = ohe.R1();
                czd.c((Object)r1);
                Objects.requireNonNull(i0v.Companion);
                final i0v[] values = i0v.values();
                final int length = values.length;
                int i = 0;
                while (true) {
                    while (i < length) {
                        final i0v i0v = values[i];
                        if (czd.a((Object)i0v.D0, (Object)r1)) {
                            e0 = i0v;
                            if (i0v == null) {
                                e0 = i0v.E0;
                                continue Label_0018;
                            }
                            continue Label_0018;
                        }
                        else {
                            ++i;
                        }
                    }
                    final i0v i0v = null;
                    continue;
                }
            }
            if (j3 != 1) {
                break;
            }
            j0v$a = (j0v$a)ar.b((xq)ar.c((xq)l0v.a, true)).b(ohe, fa7);
        }
        czd.c((Object)e0);
        return new j0v(e0, j0v$a);
    }
    
    public final void d(final ale ale, final fa7 fa7, final j0v j0v) {
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)j0v, "value");
        ale.z1("tweet_visibility_nudge_action_type");
        final i0v a = j0v.a;
        czd.f((Object)a, "value");
        ale.h2(a.D0);
        ale.z1("tweet_visibility_nudge_action_payload");
        ar.b((xq)ar.c((xq)l0v.a, true)).a(ale, fa7, (Object)j0v.b);
    }
}
