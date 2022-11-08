import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a0v implements xq<zzu.a>
{
    public static final a0v a;
    public static final List<String> b;
    
    static {
        a = new a0v();
        b = tdy.u0((Object)"__typename");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final zzu.a a = (zzu.a)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)a, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)a.a);
        ncf.a.d(qle, bb7, a.b);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)a0v.b) == 0) {
            o = ar.a.b(eie, bb7);
        }
        eie.H();
        final lcf c = ncf.a.c(eie, bb7);
        zzd.c(o);
        return new zzu.a((String)o, c);
    }
}
