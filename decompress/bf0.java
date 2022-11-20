import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bf0 implements xq<af0>
{
    public static final bf0 a;
    public static final List<String> b;
    
    static {
        a = new bf0();
        b = s9i.s("hashtags", "symbols", "urls", "user_mentions", "media");
    }
    
    public final /* bridge */ void a(final ale ale, final fa7 fa7, final Object o) {
        this.d(ale, fa7, (af0)o);
    }
    
    public final /* bridge */ Object b(final ohe ohe, final fa7 fa7) {
        return this.c(ohe, fa7);
    }
    
    public final af0 c(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        List<af0.a> list = null;
        List<af0.b> list3;
        List<af0.b> list2 = list3 = null;
        List<af0.b> list5;
        List<af0.b> list4 = list5 = list3;
        while (true) {
            final int j3 = ohe.j3((List)bf0.b);
            if (j3 != 0) {
                if (j3 != 1) {
                    if (j3 != 2) {
                        if (j3 != 3) {
                            if (j3 != 4) {
                                break;
                            }
                            list5 = (List)ar.b((xq)ar.a((xq)ar.c((xq)df0.a, true))).b(ohe, fa7);
                        }
                        else {
                            list4 = (List)ar.b((xq)ar.a((xq)ar.c((xq)gf0.a, true))).b(ohe, fa7);
                        }
                    }
                    else {
                        list3 = (List)ar.b((xq)ar.a((xq)ar.c((xq)ff0.a, true))).b(ohe, fa7);
                    }
                }
                else {
                    list2 = (List)ar.b((xq)ar.a((xq)ar.c((xq)ef0.a, true))).b(ohe, fa7);
                }
            }
            else {
                list = (List)ar.b((xq)ar.a((xq)ar.c((xq)cf0.a, true))).b(ohe, fa7);
            }
        }
        return new af0(list, (List<af0.c>)list2, (List<af0.d>)list3, (List<af0.e>)list4, list5);
    }
    
    public final void d(final ale ale, final fa7 fa7, final af0 af0) {
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)af0, "value");
        ale.z1("hashtags");
        ar.b((xq)ar.a((xq)ar.c((xq)cf0.a, true))).a(ale, fa7, (Object)af0.a);
        ale.z1("symbols");
        ar.b((xq)ar.a((xq)ar.c((xq)ef0.a, true))).a(ale, fa7, (Object)af0.b);
        ale.z1("urls");
        ar.b((xq)ar.a((xq)ar.c((xq)ff0.a, true))).a(ale, fa7, (Object)af0.c);
        ale.z1("user_mentions");
        ar.b((xq)ar.a((xq)ar.c((xq)gf0.a, true))).a(ale, fa7, (Object)af0.d);
        ale.z1("media");
        ar.b((xq)ar.a((xq)ar.c((xq)df0.a, true))).a(ale, fa7, (Object)af0.e);
    }
}
