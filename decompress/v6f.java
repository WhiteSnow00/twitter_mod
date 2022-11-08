import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v6f implements xq<k6f.j>
{
    public static final v6f a;
    public static final List<String> b;
    
    static {
        a = new v6f();
        b = tdy.v0((Object[])new String[] { "__typename", "contained_within" });
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final k6f.j j = (k6f.j)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)j, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)j.a);
        qle.A1("contained_within");
        ar.b((xq<List<k6f.b>>)new xif((xq)new g4j((xq)m6f.a, true))).a(qle, bb7, j.b);
        dh0.a.d(qle, bb7, j.c);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        List<k6f.b> list = null;
        while (true) {
            final int k3 = eie.k3((List)v6f.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    break;
                }
                final m6f a = m6f.a;
                final ar$g a2 = ar.a;
                list = ar.b((xq<List<k6f.b>>)new xif((xq)new g4j((xq)a, true))).b(eie, bb7);
            }
            else {
                o = ar.a.b(eie, bb7);
            }
        }
        eie.H();
        final ch0 c = dh0.a.c(eie, bb7);
        zzd.c(o);
        return new k6f.j((String)o, list, c);
    }
}
