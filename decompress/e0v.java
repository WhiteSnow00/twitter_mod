import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e0v implements xq<zzu.d>
{
    public static final e0v a;
    public static final List<String> b;
    
    static {
        a = new e0v();
        b = tdy.u0((Object)"__typename");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final zzu.d d = (zzu.d)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)d, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)d.a);
        rzu.a.d(qle, bb7, d.b);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)e0v.b) == 0) {
            o = ar.a.b(eie, bb7);
        }
        eie.H();
        final hzu c = rzu.a.c(eie, bb7);
        zzd.c(o);
        return new zzu.d((String)o, c);
    }
}
