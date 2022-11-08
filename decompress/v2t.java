import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v2t implements xq<p2t$b>
{
    public static final v2t a;
    public static final List<String> b;
    
    static {
        a = new v2t();
        b = tdy.u0((Object)"text");
    }
    
    public final p2t$b c(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)v2t.b) == 0) {
            o = ar.a.b(eie, bb7);
        }
        zzd.c(o);
        return new p2t$b((String)o);
    }
    
    public final void d(final qle qle, final bb7 bb7, final p2t$b p2t$b) {
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)p2t$b, "value");
        qle.A1("text");
        ar.a.a(qle, bb7, (Object)p2t$b.a);
    }
}
