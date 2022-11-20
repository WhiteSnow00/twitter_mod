import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s3t implements xq<f3t>
{
    public static final s3t a;
    public static final List<String> b;
    
    static {
        a = new s3t();
        b = s9i.s("text", "entities", "alignment");
    }
    
    public final /* bridge */ void a(final ale ale, final fa7 fa7, final Object o) {
        this.d(ale, fa7, (f3t)o);
    }
    
    public final /* bridge */ Object b(final ohe ohe, final fa7 fa7) {
        return this.c(ohe, fa7);
    }
    
    public final f3t c(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        String s = null;
        List<Object> list = null;
        g3t g3t = null;
        while (true) {
            final int j3 = ohe.j3((List)s3t.b);
            if (j3 != 0) {
                if (j3 != 1) {
                    if (j3 != 2) {
                        break;
                    }
                    g3t = (g3t)ar.b((xq)h3t.a).b(ohe, fa7);
                }
                else {
                    final k3t a = k3t.a;
                    final ar$g a2 = ar.a;
                    final m4j m4j = new m4j((xq)a, false);
                    ohe.I();
                    list = new ArrayList<Object>();
                    while (ohe.hasNext()) {
                        list.add(((xq)m4j).b(ohe, fa7));
                    }
                    ohe.H();
                }
            }
            else {
                s = (String)ar.a.b(ohe, fa7);
            }
        }
        czd.c((Object)s);
        czd.c((Object)list);
        return new f3t(s, (List)list, g3t);
    }
    
    public final void d(final ale ale, final fa7 fa7, final f3t f3t) {
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)f3t, "value");
        ale.z1("text");
        ar.a.a(ale, fa7, (Object)f3t.a);
        ale.z1("entities");
        final k3t a = k3t.a;
        final List b = f3t.b;
        czd.f((Object)b, "value");
        ale.I();
        for (final Object next : b) {
            ale.F();
            ((xq)a).a(ale, fa7, next);
            ale.P();
        }
        ale.H();
        ale.z1("alignment");
        ar.b((xq)h3t.a).a(ale, fa7, (Object)f3t.c);
    }
}
