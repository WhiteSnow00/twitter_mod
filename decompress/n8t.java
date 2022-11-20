import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n8t implements xq<h8t$c>
{
    public static final n8t a;
    public static final List<String> b;
    
    static {
        a = new n8t();
        b = s9i.s("timeline", "requestParams", "title", "subtitle", "cacheId");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final h8t$c h8t$c = (h8t$c)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)h8t$c, "value");
        ale.z1("timeline");
        ar.b((xq)ar.c((xq)l8t.a, true)).a(ale, fa7, (Object)h8t$c.a);
        ale.z1("requestParams");
        ar.b((xq)ar.a((xq)ar.c((xq)k8t.a, false))).a(ale, fa7, (Object)h8t$c.b);
        ale.z1("title");
        final i2j i = ar.i;
        i.a(ale, fa7, (Object)h8t$c.c);
        ale.z1("subtitle");
        i.a(ale, fa7, (Object)h8t$c.d);
        ale.z1("cacheId");
        i.a(ale, fa7, (Object)h8t$c.e);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        h8t$b h8t$b = null;
        String s;
        Object o = s = null;
        String s3;
        String s2 = s3 = s;
        while (true) {
            final int j3 = ohe.j3((List)n8t.b);
            if (j3 != 0) {
                if (j3 != 1) {
                    if (j3 != 2) {
                        if (j3 != 3) {
                            if (j3 != 4) {
                                break;
                            }
                            s3 = (String)ar.i.b(ohe, fa7);
                        }
                        else {
                            s2 = (String)ar.i.b(ohe, fa7);
                        }
                    }
                    else {
                        s = (String)ar.i.b(ohe, fa7);
                    }
                }
                else {
                    o = ar.b((xq)ar.a((xq)ar.c((xq)k8t.a, false))).b(ohe, fa7);
                }
            }
            else {
                h8t$b = (h8t$b)ar.b((xq)ar.c((xq)l8t.a, true)).b(ohe, fa7);
            }
        }
        return new h8t$c(h8t$b, (List)o, s, s2, s3);
    }
}
