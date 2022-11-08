import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vju implements xq<pju.f>
{
    public static final vju a;
    public static final List<String> b;
    
    static {
        a = new vju();
        b = tdy.u0((Object)"unmentioned_users_results");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final pju.f f = (pju.f)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)f, "value");
        qle.A1("unmentioned_users_results");
        ar.b((xq<List<pju.g0>>)ar.a((xq<Object>)ar.c((xq<Object>)xku.a, false))).a(qle, bb7, f.a);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        List<pju.g0> list = null;
        while (eie.k3((List)vju.b) == 0) {
            list = ar.b((xq<List<pju.g0>>)ar.a((xq<Object>)ar.c((xq<Object>)xku.a, false))).b(eie, bb7);
        }
        return new pju.f(list);
    }
}
