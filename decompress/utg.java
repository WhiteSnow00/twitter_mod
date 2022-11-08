import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class utg implements xq<rtg$c>
{
    public static final utg a;
    public static final List<String> b;
    
    static {
        a = new utg();
        b = tdy.u0((Object)"faces");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final rtg$c rtg$c = (rtg$c)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)rtg$c, "value");
        qle.A1("faces");
        ar.b((xq<List>)ar.a((xq<Object>)ar.c((xq<Object>)ttg.a, false))).a(qle, bb7, rtg$c.a);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        List list = null;
        while (eie.k3((List)utg.b) == 0) {
            list = ar.b((xq<List>)ar.a((xq<Object>)ar.c((xq<Object>)ttg.a, false))).b(eie, bb7);
        }
        return new rtg$c(list);
    }
}
