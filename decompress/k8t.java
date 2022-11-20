import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k8t implements xq<h8t$a>
{
    public static final k8t a;
    public static final List<String> b;
    
    static {
        a = new k8t();
        b = s9i.s("key", "value");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final h8t$a h8t$a = (h8t$a)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)h8t$a, "value");
        ale.z1("key");
        final ar$g a = ar.a;
        a.a(ale, fa7, (Object)h8t$a.a);
        ale.z1("value");
        a.a(ale, fa7, (Object)h8t$a.b);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        String s = null;
        while (true) {
            final int j3 = ohe.j3((List)k8t.b);
            if (j3 != 0) {
                if (j3 != 1) {
                    break;
                }
                s = (String)ar.a.b(ohe, fa7);
            }
            else {
                o = ar.a.b(ohe, fa7);
            }
        }
        czd.c(o);
        czd.c((Object)s);
        return new h8t$a((String)o, s);
    }
}
