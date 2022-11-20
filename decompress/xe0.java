import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xe0 implements xq<te0$c>
{
    public static final xe0 a;
    public static final List<String> b;
    
    static {
        a = new xe0();
        b = s9i.s("audience", "device");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final te0$c te0$c = (te0$c)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)te0$c, "value");
        ale.z1("audience");
        ar.b((xq)ar.c((xq)ve0.a, false)).a(ale, fa7, (Object)te0$c.a);
        ale.z1("device");
        ar.b((xq)ar.c((xq)we0.a, false)).a(ale, fa7, (Object)te0$c.b);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        te0$a te0$a = null;
        te0$b te0$b = null;
        while (true) {
            final int j3 = ohe.j3((List)xe0.b);
            if (j3 != 0) {
                if (j3 != 1) {
                    break;
                }
                te0$b = (te0$b)ar.b((xq)ar.c((xq)we0.a, false)).b(ohe, fa7);
            }
            else {
                te0$a = (te0$a)ar.b((xq)ar.c((xq)ve0.a, false)).b(ohe, fa7);
            }
        }
        return new te0$c(te0$a, te0$b);
    }
}
