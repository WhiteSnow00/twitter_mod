import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v7a implements xq<r7a.c>
{
    public static final v7a a;
    public static final List<String> b;
    
    static {
        a = new v7a();
        b = tdy.u0((Object)"__typename");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final r7a.c c = (r7a.c)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)c, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)c.a);
        qh0.a.d(qle, bb7, c.b);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)v7a.b) == 0) {
            o = ar.a.b(eie, bb7);
        }
        eie.H();
        final ph0 c = qh0.a.c(eie, bb7);
        zzd.c(o);
        return new r7a.c((String)o, c);
    }
}
