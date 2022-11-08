import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vtg implements xq<rtg>
{
    public static final vtg a;
    public static final List<String> b;
    
    static {
        a = new vtg();
        b = tdy.v0((Object[])new String[] { "all", "large" });
    }
    
    public final rtg c(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        rtg$a rtg$a = null;
        rtg$c rtg$c = null;
        while (true) {
            final int k3 = eie.k3((List)vtg.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    break;
                }
                rtg$c = ar.b((xq<rtg$c>)ar.c((xq<Object>)utg.a, false)).b(eie, bb7);
            }
            else {
                rtg$a = ar.b((xq<rtg$a>)ar.c((xq<Object>)stg.a, false)).b(eie, bb7);
            }
        }
        return new rtg(rtg$a, rtg$c);
    }
    
    public final void d(final qle qle, final bb7 bb7, final rtg rtg) {
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)rtg, "value");
        qle.A1("all");
        ar.b((xq<rtg$a>)ar.c((xq<Object>)stg.a, false)).a(qle, bb7, rtg.a);
        qle.A1("large");
        ar.b((xq<rtg$c>)ar.c((xq<Object>)utg.a, false)).a(qle, bb7, rtg.b);
    }
}
