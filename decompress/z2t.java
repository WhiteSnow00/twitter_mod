import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z2t implements xq<p2t$f>
{
    public static final z2t a;
    public static final List<String> b;
    
    static {
        a = new z2t();
        b = tdy.u0((Object)"user_results");
    }
    
    public final p2t$f c(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)z2t.b) == 0) {
            o = ar.c((xq<Object>)e3t.a, false).b(eie, bb7);
        }
        zzd.c(o);
        return new p2t$f((p2t$j)o);
    }
    
    public final void d(final qle qle, final bb7 bb7, final p2t$f p2t$f) {
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)p2t$f, "value");
        qle.A1("user_results");
        ar.c((xq<Object>)e3t.a, false).a(qle, bb7, (Object)p2t$f.a);
    }
}
