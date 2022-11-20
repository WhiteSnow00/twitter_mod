import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rug implements xq<qug$a>
{
    public static final rug a;
    public static final List<String> b;
    
    static {
        a = new rug();
        b = s9i.s("x", "y", "w", "h");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final qug$a qug$a = (qug$a)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)qug$a, "value");
        ale.z1("x");
        final ar$e b = ar.b;
        b.a(ale, fa7, (Object)qug$a.a);
        ale.z1("y");
        b.a(ale, fa7, (Object)qug$a.b);
        ale.z1("w");
        b.a(ale, fa7, (Object)qug$a.c);
        ale.z1("h");
        b.a(ale, fa7, (Object)qug$a.d);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        Object o2 = null;
        Object o4;
        Object o3 = o4 = null;
        while (true) {
            final int j3 = ohe.j3((List)rug.b);
            if (j3 != 0) {
                if (j3 != 1) {
                    if (j3 != 2) {
                        if (j3 != 3) {
                            break;
                        }
                        o4 = ar.b.b(ohe, fa7);
                    }
                    else {
                        o3 = ar.b.b(ohe, fa7);
                    }
                }
                else {
                    o2 = ar.b.b(ohe, fa7);
                }
            }
            else {
                o = ar.b.b(ohe, fa7);
            }
        }
        czd.c(o);
        final int intValue = (int)o;
        czd.c(o2);
        final int intValue2 = (int)o2;
        czd.c(o3);
        final int intValue3 = (int)o3;
        czd.c(o4);
        return new qug$a(intValue, intValue2, intValue3, (int)o4);
    }
}
