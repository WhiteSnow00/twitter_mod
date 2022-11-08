import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a3t implements xq<p2t$g>
{
    public static final a3t a;
    public static final List<String> b;
    
    static {
        a = new a3t();
        b = tdy.u0((Object)"__typename");
    }
    
    public final p2t$g c(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)a3t.b) == 0) {
            o = ar.a.b(eie, bb7);
        }
        eie.H();
        final p7t c = u7t.a.c(eie, bb7);
        zzd.c(o);
        return new p2t$g((String)o, c);
    }
    
    public final void d(final qle qle, final bb7 bb7, final p2t$g p2t$g) {
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)p2t$g, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)p2t$g.a);
        u7t.a.d(qle, bb7, p2t$g.b);
    }
}
