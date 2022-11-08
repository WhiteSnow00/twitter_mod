import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e26 implements xq<e16.i>
{
    public static final e26 a;
    public static final List<String> b;
    
    static {
        a = new e26();
        b = tdy.u0((Object)"__typename");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final e16.i i = (e16.i)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)i, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)i.a);
        gsg.a.d(qle, bb7, i.b);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)e26.b) == 0) {
            o = ar.a.b(eie, bb7);
        }
        eie.H();
        final dsg c = gsg.a.c(eie, bb7);
        zzd.c(o);
        return new e16.i((String)o, c);
    }
}
