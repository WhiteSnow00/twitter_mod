import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vku implements xq<pju.e0>
{
    public static final vku a;
    public static final List<String> b;
    
    static {
        a = new vku();
        b = tdy.u0((Object)"hydrate");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final pju.e0 e0 = (pju.e0)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)e0, "value");
        qle.A1("hydrate");
        ar.b((xq<pju.f>)ar.c((xq<Object>)vju.a, false)).a(qle, bb7, e0.a);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        pju.f f = null;
        while (eie.k3((List)vku.b) == 0) {
            f = ar.b((xq<pju.f>)ar.c((xq<Object>)vju.a, false)).b(eie, bb7);
        }
        return new pju.e0(f);
    }
}
