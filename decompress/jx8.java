import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jx8 implements xq<gx8$b>
{
    public static final jx8 a;
    public static final List<String> b;
    
    static {
        a = new jx8();
        b = s9i.s("description", "url");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final gx8$b gx8$b = (gx8$b)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)gx8$b, "value");
        ale.z1("description");
        ar.b((xq)ar.c((xq)hx8.a, true)).a(ale, fa7, (Object)gx8$b.a);
        ale.z1("url");
        ar.b((xq)ar.c((xq)mx8.a, true)).a(ale, fa7, (Object)gx8$b.b);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        gx8$a gx8$a = null;
        gx8$e gx8$e = null;
        while (true) {
            final int j3 = ohe.j3((List)jx8.b);
            if (j3 != 0) {
                if (j3 != 1) {
                    break;
                }
                gx8$e = (gx8$e)ar.b((xq)ar.c((xq)mx8.a, true)).b(ohe, fa7);
            }
            else {
                gx8$a = (gx8$a)ar.b((xq)ar.c((xq)hx8.a, true)).b(ohe, fa7);
            }
        }
        return new gx8$b(gx8$a, gx8$e);
    }
}
