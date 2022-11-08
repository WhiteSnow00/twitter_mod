import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dqu implements xq<zpu>
{
    public static final dqu a;
    public static final List<String> b;
    
    static {
        a = new dqu();
        b = tdy.u0((Object)"result");
    }
    
    public final zpu c(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)dqu.b) == 0) {
            o = ar.b((xq<zpu.b>)ar.c((xq<Object>)bqu.a, true)).b(eie, bb7);
        }
        return new zpu((zpu.b)o);
    }
    
    public final void d(final qle qle, final bb7 bb7, final zpu zpu) {
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)zpu, "value");
        qle.A1("result");
        ar.b((xq<zpu.b>)ar.c((xq<Object>)bqu.a, true)).a(qle, bb7, zpu.a);
    }
}
