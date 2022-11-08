import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fug implements xq<ctg$i>
{
    public static final fug a;
    public static final List<String> b;
    
    static {
        a = new fug();
        b = tdy.u0((Object)"__typename");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final ctg$i ctg$i = (ctg$i)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)ctg$i, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)ctg$i.a);
        vtg.a.d(qle, bb7, ctg$i.b);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)fug.b) == 0) {
            o = ar.a.b(eie, bb7);
        }
        eie.H();
        final rtg c = vtg.a.c(eie, bb7);
        zzd.c(o);
        return new ctg$i((String)o, c);
    }
}
