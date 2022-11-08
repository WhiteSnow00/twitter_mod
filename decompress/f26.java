import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f26 implements xq<e16.j>
{
    public static final f26 a;
    public static final List<String> b;
    
    static {
        a = new f26();
        b = tdy.u0((Object)"__typename");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final e16.j j = (e16.j)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)j, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)j.a);
        gsg.a.d(qle, bb7, j.b);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)f26.b) == 0) {
            o = ar.a.b(eie, bb7);
        }
        eie.H();
        final dsg c = gsg.a.c(eie, bb7);
        zzd.c(o);
        return new e16.j((String)o, c);
    }
}
