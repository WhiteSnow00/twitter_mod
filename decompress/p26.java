import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p26 implements xq<e16.t>
{
    public static final p26 a;
    public static final List<String> b;
    
    static {
        a = new p26();
        b = tdy.v0((Object[])new String[] { "destination_obj", "social_context", "userResults" });
    }
    
    public final e16.t c(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        e16.e e = null;
        Object o2;
        Object o = o2 = null;
        while (true) {
            final int k3 = eie.k3((List)p26.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    if (k3 != 2) {
                        break;
                    }
                    o2 = ar.c((xq<Object>)w26.a, true).b(eie, bb7);
                }
                else {
                    o = ar.i.b(eie, bb7);
                }
            }
            else {
                e = ar.b((xq<e16.e>)ar.c((xq<Object>)a26.a, true)).b(eie, bb7);
            }
        }
        zzd.c(o2);
        return new e16.t(e, (String)o, (e16.a0)o2);
    }
    
    public final void d(final qle qle, final bb7 bb7, final e16.t t) {
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)t, "value");
        qle.A1("destination_obj");
        ar.b((xq<e16.e>)ar.c((xq<Object>)a26.a, true)).a(qle, bb7, t.a);
        qle.A1("social_context");
        ar.i.a(qle, bb7, t.b);
        qle.A1("userResults");
        ar.c((xq<Object>)w26.a, true).a(qle, bb7, (Object)t.c);
    }
}
