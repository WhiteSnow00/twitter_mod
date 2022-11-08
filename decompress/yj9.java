import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yj9 implements xq<vj9>
{
    public static final yj9 a;
    public static final List<String> b;
    
    static {
        a = new yj9();
        b = tdy.v0((Object[])new String[] { "name", "chatSlice" });
    }
    
    public final vj9 c(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        Object o2 = null;
        while (true) {
            final int k3 = eie.k3((List)yj9.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    break;
                }
                final xj9 a = xj9.a;
                final ar$g a2 = ar.a;
                o2 = new g4j((xq)a, false).b(eie, bb7);
            }
            else {
                o = ar.a.b(eie, bb7);
            }
        }
        zzd.c(o);
        zzd.c(o2);
        return new vj9((String)o, (vj9.a)o2);
    }
    
    public final void d(final qle qle, final bb7 bb7, final vj9 vj9) {
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)vj9, "value");
        qle.A1("name");
        ar.a.a(qle, bb7, (Object)vj9.a);
        qle.A1("chatSlice");
        final xj9 a = xj9.a;
        final vj9.a b = vj9.b;
        qle.G();
        ((xq<vj9.a>)a).a(qle, bb7, b);
        qle.Q();
    }
}
