import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b7a implements xq<a7a>
{
    public static final b7a a;
    public static final List<String> b;
    
    static {
        a = new b7a();
        b = s9i.s("hashtags", "symbols", "urls", "user_mentions", "media");
    }
    
    public final /* bridge */ void a(final ale ale, final fa7 fa7, final Object o) {
        this.d(ale, fa7, (a7a)o);
    }
    
    public final /* bridge */ Object b(final ohe ohe, final fa7 fa7) {
        return this.c(ohe, fa7);
    }
    
    public final a7a c(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        List<a7a.a> list = null;
        List<a7a.b> list3;
        List<a7a.b> list2 = list3 = null;
        List<a7a.b> list5;
        List<a7a.b> list4 = list5 = list3;
        while (true) {
            final int j3 = ohe.j3((List)b7a.b);
            if (j3 != 0) {
                if (j3 != 1) {
                    if (j3 != 2) {
                        if (j3 != 3) {
                            if (j3 != 4) {
                                break;
                            }
                            list5 = (List)ar.b((xq)ar.a((xq)ar.c((xq)d7a.a, true))).b(ohe, fa7);
                        }
                        else {
                            list4 = (List)ar.b((xq)ar.a((xq)ar.c((xq)g7a.a, true))).b(ohe, fa7);
                        }
                    }
                    else {
                        list3 = (List)ar.b((xq)ar.a((xq)ar.c((xq)f7a.a, true))).b(ohe, fa7);
                    }
                }
                else {
                    list2 = (List)ar.b((xq)ar.a((xq)ar.c((xq)e7a.a, true))).b(ohe, fa7);
                }
            }
            else {
                list = (List)ar.b((xq)ar.a((xq)ar.c((xq)c7a.a, true))).b(ohe, fa7);
            }
        }
        return new a7a(list, (List<a7a.c>)list2, (List<a7a.d>)list3, (List<a7a.e>)list4, list5);
    }
    
    public final void d(final ale ale, final fa7 fa7, final a7a a7a) {
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)a7a, "value");
        ale.z1("hashtags");
        ar.b((xq)ar.a((xq)ar.c((xq)c7a.a, true))).a(ale, fa7, (Object)a7a.a);
        ale.z1("symbols");
        ar.b((xq)ar.a((xq)ar.c((xq)e7a.a, true))).a(ale, fa7, (Object)a7a.b);
        ale.z1("urls");
        ar.b((xq)ar.a((xq)ar.c((xq)f7a.a, true))).a(ale, fa7, (Object)a7a.c);
        ale.z1("user_mentions");
        ar.b((xq)ar.a((xq)ar.c((xq)g7a.a, true))).a(ale, fa7, (Object)a7a.d);
        ale.z1("media");
        ar.b((xq)ar.a((xq)ar.c((xq)d7a.a, true))).a(ale, fa7, (Object)a7a.e);
    }
}
