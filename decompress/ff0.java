import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ff0 implements xq<ef0>
{
    public static final ff0 a;
    public static final List<String> b;
    
    static {
        a = new ff0();
        b = tdy.v0((Object[])new String[] { "hashtags", "symbols", "urls", "user_mentions", "media" });
    }
    
    public final ef0 c(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        List list = null;
        List list3;
        List list2 = list3 = list;
        List list5;
        List list4 = list5 = list3;
        while (true) {
            final int k3 = eie.k3((List)ff0.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    if (k3 != 2) {
                        if (k3 != 3) {
                            if (k3 != 4) {
                                break;
                            }
                            list5 = ar.b((xq<List>)ar.a((xq<Object>)ar.c((xq<Object>)hf0.a, true))).b(eie, bb7);
                        }
                        else {
                            list4 = ar.b((xq<List>)ar.a((xq<Object>)ar.c((xq<Object>)kf0.a, true))).b(eie, bb7);
                        }
                    }
                    else {
                        list3 = ar.b((xq<List>)ar.a((xq<Object>)ar.c((xq<Object>)jf0.a, true))).b(eie, bb7);
                    }
                }
                else {
                    list2 = ar.b((xq<List>)ar.a((xq<Object>)ar.c((xq<Object>)if0.a, true))).b(eie, bb7);
                }
            }
            else {
                list = ar.b((xq<List>)ar.a((xq<Object>)ar.c((xq<Object>)gf0.a, true))).b(eie, bb7);
            }
        }
        return new ef0(list, list2, list3, list4, list5);
    }
    
    public final void d(final qle qle, final bb7 bb7, final ef0 ef0) {
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)ef0, "value");
        qle.A1("hashtags");
        ar.b((xq<List>)ar.a((xq<Object>)ar.c((xq<Object>)gf0.a, true))).a(qle, bb7, ef0.a);
        qle.A1("symbols");
        ar.b((xq<List>)ar.a((xq<Object>)ar.c((xq<Object>)if0.a, true))).a(qle, bb7, ef0.b);
        qle.A1("urls");
        ar.b((xq<List>)ar.a((xq<Object>)ar.c((xq<Object>)jf0.a, true))).a(qle, bb7, ef0.c);
        qle.A1("user_mentions");
        ar.b((xq<List>)ar.a((xq<Object>)ar.c((xq<Object>)kf0.a, true))).a(qle, bb7, ef0.d);
        qle.A1("media");
        ar.b((xq<List>)ar.a((xq<Object>)ar.c((xq<Object>)hf0.a, true))).a(qle, bb7, ef0.e);
    }
}
