import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class x0v implements xq<u0v>
{
    public static final x0v a;
    public static final List<String> b;
    
    static {
        a = new x0v();
        b = s9i.s("tweet_interstitial", "soft_intervention_pivot", "tweet_visibility_nudge", "limited_action_results");
    }
    
    public final /* bridge */ void a(final ale ale, final fa7 fa7, final Object o) {
        this.d(ale, fa7, (u0v)o);
    }
    
    public final /* bridge */ Object b(final ohe ohe, final fa7 fa7) {
        return this.c(ohe, fa7);
    }
    
    public final u0v c(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        u0v$c u0v$c = null;
        u0v$b u0v$b = null;
        u0v$a u0v$a;
        Object o = u0v$a = null;
        while (true) {
            final int j3 = ohe.j3((List)x0v.b);
            if (j3 != 0) {
                if (j3 != 1) {
                    if (j3 != 2) {
                        if (j3 != 3) {
                            break;
                        }
                        u0v$a = (u0v$a)ar.b((xq)ar.c((xq)v0v.a, true)).b(ohe, fa7);
                    }
                    else {
                        o = ar.b((xq)ar.c((xq)z0v.a, true)).b(ohe, fa7);
                    }
                }
                else {
                    u0v$b = (u0v$b)ar.b((xq)ar.c((xq)w0v.a, true)).b(ohe, fa7);
                }
            }
            else {
                u0v$c = (u0v$c)ar.b((xq)ar.c((xq)y0v.a, true)).b(ohe, fa7);
            }
        }
        return new u0v(u0v$c, u0v$b, (u0v$d)o, u0v$a);
    }
    
    public final void d(final ale ale, final fa7 fa7, final u0v u0v) {
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)u0v, "value");
        ale.z1("tweet_interstitial");
        ar.b((xq)ar.c((xq)y0v.a, true)).a(ale, fa7, (Object)u0v.a);
        ale.z1("soft_intervention_pivot");
        ar.b((xq)ar.c((xq)w0v.a, true)).a(ale, fa7, (Object)u0v.b);
        ale.z1("tweet_visibility_nudge");
        ar.b((xq)ar.c((xq)z0v.a, true)).a(ale, fa7, (Object)u0v.c);
        ale.z1("limited_action_results");
        ar.b((xq)ar.c((xq)v0v.a, true)).a(ale, fa7, (Object)u0v.d);
    }
}
