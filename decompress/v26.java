import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v26 implements xq<e16.z>
{
    public static final v26 a;
    public static final List<String> b;
    
    static {
        a = new v26();
        b = tdy.u0((Object)"__typename");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final e16.z z = (e16.z)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)z, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)z.a);
        aiw.a.d(qle, bb7, z.b);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)v26.b) == 0) {
            o = ar.a.b(eie, bb7);
        }
        eie.H();
        final whw c = aiw.a.c(eie, bb7);
        zzd.c(o);
        return new e16.z((String)o, c);
    }
}
