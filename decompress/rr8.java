import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rr8 implements xq<er8.k>
{
    public static final rr8 a;
    public static final List<String> b;
    
    static {
        a = new rr8();
        b = s9i.s("app_store_data", "media_results");
    }
    
    public final /* bridge */ void a(final ale ale, final fa7 fa7, final Object o) {
        this.d(ale, fa7, (er8.k)o);
    }
    
    public final /* bridge */ Object b(final ohe ohe, final fa7 fa7) {
        return this.c(ohe, fa7);
    }
    
    public final er8.k c(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        List<er8.b> c = null;
        er8.g g = null;
        while (true) {
            final int j3 = ohe.j3((List)rr8.b);
            if (j3 != 0) {
                if (j3 != 1) {
                    break;
                }
                g = (er8.g)ar.c((xq)nr8.a, true).b(ohe, fa7);
            }
            else {
                c = ar.a((xq)ar.c((xq)hr8.a, true)).c(ohe, fa7);
            }
        }
        czd.c((Object)c);
        czd.c((Object)g);
        return new er8.k(c, g);
    }
    
    public final void d(final ale ale, final fa7 fa7, final er8.k k) {
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)k, "value");
        ale.z1("app_store_data");
        ar.a((xq)ar.c((xq)hr8.a, true)).d(ale, fa7, (List)k.a);
        ale.z1("media_results");
        ar.c((xq)nr8.a, true).a(ale, fa7, (Object)k.b);
    }
}
