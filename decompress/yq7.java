import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yq7 implements xq<xq7>
{
    public static final yq7 a;
    public static final List<String> b;
    
    static {
        a = new yq7();
        b = tdy.u0((Object)"is_low_quality");
    }
    
    public final xq7 c(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Boolean b = null;
        while (eie.k3((List)yq7.b) == 0) {
            b = ar.l.b(eie, bb7);
        }
        return new xq7(b);
    }
    
    public final void d(final qle qle, final bb7 bb7, final xq7 xq7) {
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)xq7, "value");
        qle.A1("is_low_quality");
        ar.l.a(qle, bb7, xq7.a);
    }
}
