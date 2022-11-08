import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ye0 implements xq<xe0>
{
    public static final ye0 a;
    public static final List<String> b;
    
    static {
        a = new ye0();
        b = tdy.u0((Object)"platform");
    }
    
    public final xe0 c(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)ye0.b) == 0) {
            o = ar.b((xq<xe0.c>)ar.c((xq<Object>)bf0.a, false)).b(eie, bb7);
        }
        return new xe0((xe0.c)o);
    }
    
    public final void d(final qle qle, final bb7 bb7, final xe0 xe0) {
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)xe0, "value");
        qle.A1("platform");
        ar.b((xq<xe0.c>)ar.c((xq<Object>)bf0.a, false)).a(qle, bb7, xe0.a);
    }
}
