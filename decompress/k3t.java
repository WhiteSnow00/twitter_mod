import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k3t implements xq<f3t$a>
{
    public static final k3t a;
    public static final List<String> b;
    
    static {
        a = new k3t();
        b = s9i.s("fromIndex", "toIndex", "ref", "format");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final f3t$a f3t$a = (f3t$a)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)f3t$a, "value");
        ale.z1("fromIndex");
        final ar$e b = ar.b;
        b.a(ale, fa7, (Object)f3t$a.a);
        ale.z1("toIndex");
        b.a(ale, fa7, (Object)f3t$a.b);
        ale.z1("ref");
        ar.b((xq)new m4j((xq)r3t.a, true)).a(ale, fa7, (Object)f3t$a.c);
        ale.z1("format");
        ar.b((xq)j3t.a).a(ale, fa7, (Object)f3t$a.d);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        Object o2 = null;
        i3t i3t;
        Object o3 = i3t = null;
        while (true) {
            final int j3 = ohe.j3((List)k3t.b);
            if (j3 != 0) {
                if (j3 != 1) {
                    if (j3 != 2) {
                        if (j3 != 3) {
                            break;
                        }
                        i3t = (i3t)ar.b((xq)j3t.a).b(ohe, fa7);
                    }
                    else {
                        final r3t a = r3t.a;
                        final ar$g a2 = ar.a;
                        o3 = ar.b((xq)new m4j((xq)a, true)).b(ohe, fa7);
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
        return new f3t$a(intValue, (int)o2, (f3t$h)o3, i3t);
    }
}
