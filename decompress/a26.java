import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a26 implements xq<e16.e>
{
    public static final a26 a;
    public static final List<String> b;
    
    static {
        a = new a26();
        b = tdy.u0((Object)"__typename");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final e16.e e = (e16.e)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)e, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)e.a);
        ds8.a.d(qle, bb7, e.b);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)a26.b) == 0) {
            o = ar.a.b(eie, bb7);
        }
        eie.H();
        final vr8 c = ds8.a.c(eie, bb7);
        zzd.c(o);
        return new e16.e((String)o, c);
    }
}
