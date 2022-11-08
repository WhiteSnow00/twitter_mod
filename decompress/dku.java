import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dku implements xq<pju.n>
{
    public static final dku a;
    public static final List<String> b;
    
    static {
        a = new dku();
        b = tdy.u0((Object)"legacy");
    }
    
    public final pju.n c(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        pju.i i = null;
        while (eie.k3((List)dku.b) == 0) {
            i = ar.b((xq<pju.i>)ar.c((xq<Object>)yju.a, false)).b(eie, bb7);
        }
        return new pju.n(i);
    }
    
    public final void d(final qle qle, final bb7 bb7, final pju.n n) {
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)n, "value");
        qle.A1("legacy");
        ar.b((xq<pju.i>)ar.c((xq<Object>)yju.a, false)).a(qle, bb7, n.a);
    }
}
