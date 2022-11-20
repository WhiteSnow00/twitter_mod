import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cs1 implements xq<as1>
{
    public static final cs1 a;
    public static final List<String> b;
    
    static {
        a = new cs1();
        b = s9i.s("headline", "subtext");
    }
    
    public final /* bridge */ void a(final ale ale, final fa7 fa7, final Object o) {
        this.d(ale, fa7, (as1)o);
    }
    
    public final /* bridge */ Object b(final ohe ohe, final fa7 fa7) {
        return this.c(ohe, fa7);
    }
    
    public final as1 c(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        Object o2 = null;
        while (true) {
            final int j3 = ohe.j3((List)cs1.b);
            if (j3 != 0) {
                if (j3 != 1) {
                    break;
                }
                o2 = ar.c((xq)es1.a, true).b(ohe, fa7);
            }
            else {
                o = ar.c((xq)ds1.a, true).b(ohe, fa7);
            }
        }
        czd.c(o);
        czd.c(o2);
        return new as1((as1.a)o, (as1.b)o2);
    }
    
    public final void d(final ale ale, final fa7 fa7, final as1 as1) {
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)as1, "value");
        ale.z1("headline");
        ar.c((xq)ds1.a, true).a(ale, fa7, (Object)as1.a);
        ale.z1("subtext");
        ar.c((xq)es1.a, true).a(ale, fa7, (Object)as1.b);
    }
}
