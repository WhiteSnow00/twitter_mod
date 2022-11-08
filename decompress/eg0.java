import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eg0 implements xq<dg0>
{
    public static final eg0 a;
    public static final List<String> b;
    
    static {
        a = new eg0();
        b = tdy.u0((Object)"mediaColor");
    }
    
    public final dg0 c(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        dg0$a dg0$a = null;
        while (eie.k3((List)eg0.b) == 0) {
            dg0$a = ar.b((xq<dg0$a>)ar.c((xq<Object>)fg0.a, false)).b(eie, bb7);
        }
        return new dg0(dg0$a);
    }
    
    public final void d(final qle qle, final bb7 bb7, final dg0 dg0) {
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)dg0, "value");
        qle.A1("mediaColor");
        ar.b((xq<dg0$a>)ar.c((xq<Object>)fg0.a, false)).a(qle, bb7, dg0.a);
    }
}
