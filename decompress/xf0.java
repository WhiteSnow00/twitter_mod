import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xf0 implements xq<vf0$a>
{
    public static final xf0 a;
    public static final List<String> b;
    
    static {
        a = new xf0();
        b = s9i.s("percentage", "rgb");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final vf0$a vf0$a = (vf0$a)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)vf0$a, "value");
        ale.z1("percentage");
        ar.c.a(ale, fa7, (Object)vf0$a.a);
        ale.z1("rgb");
        final yf0 a = yf0.a;
        final vf0$b b = vf0$a.b;
        ale.F();
        ((xq)a).a(ale, fa7, (Object)b);
        ale.P();
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        Object o2 = null;
        while (true) {
            final int j3 = ohe.j3((List)xf0.b);
            if (j3 != 0) {
                if (j3 != 1) {
                    break;
                }
                final yf0 a = yf0.a;
                final ar$g a2 = ar.a;
                o2 = new m4j((xq)a, false).b(ohe, fa7);
            }
            else {
                o = ar.c.b(ohe, fa7);
            }
        }
        czd.c(o);
        final double doubleValue = (double)o;
        czd.c(o2);
        return new vf0$a(doubleValue, (vf0$b)o2);
    }
}
