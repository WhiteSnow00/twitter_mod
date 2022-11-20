import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class csb implements xq<bsb>
{
    public static final csb a;
    public static final List<String> b;
    
    static {
        a = new csb();
        b = s9i.s("__typename", "legacy");
    }
    
    public final /* bridge */ void a(final ale ale, final fa7 fa7, final Object o) {
        this.d(ale, fa7, (bsb)o);
    }
    
    public final /* bridge */ Object b(final ohe ohe, final fa7 fa7) {
        return this.c(ohe, fa7);
    }
    
    public final bsb c(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        bsb.a a = null;
        while (true) {
            final int j3 = ohe.j3((List)csb.b);
            if (j3 != 0) {
                if (j3 != 1) {
                    break;
                }
                final dsb a2 = dsb.a;
                final ar$g a3 = ar.a;
                a = (bsb.a)ar.b((xq)new m4j((xq)a2, false)).b(ohe, fa7);
            }
            else {
                o = ar.a.b(ohe, fa7);
            }
        }
        ohe.G();
        final o0v c = s0v.a.c(ohe, fa7);
        czd.c(o);
        return new bsb((String)o, a, c);
    }
    
    public final void d(final ale ale, final fa7 fa7, final bsb bsb) {
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)bsb, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)bsb.a);
        ale.z1("legacy");
        ar.b((xq)new m4j((xq)dsb.a, false)).a(ale, fa7, (Object)bsb.b);
        s0v.a.d(ale, fa7, bsb.c);
    }
}
