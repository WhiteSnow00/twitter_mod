import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o6f implements xq<k6f.d>
{
    public static final o6f a;
    public static final List<String> b;
    
    static {
        a = new o6f();
        b = tdy.u0((Object)"coordinates");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final k6f.d d = (k6f.d)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)d, "value");
        qle.A1("coordinates");
        ar.b((xq<List<Double>>)new xif((xq)ar.c)).a(qle, bb7, d.a);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        List<Double> list = null;
        while (eie.k3((List)o6f.b) == 0) {
            list = ar.b((xq<List<Double>>)new xif((xq)ar.c)).b(eie, bb7);
        }
        return new k6f.d(list);
    }
}
