import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ag0 implements xq<zf0>
{
    public static final ag0 a;
    public static final List<String> b;
    
    static {
        a = new ag0();
        b = tdy.u0((Object)"palette");
    }
    
    public final zf0 c(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        List<zf0.a> c = null;
        while (eie.k3((List)ag0.b) == 0) {
            c = ar.a((xq<Object>)ar.c((xq<Object>)bg0.a, false)).c(eie, bb7);
        }
        zzd.c((Object)c);
        return new zf0(c);
    }
    
    public final void d(final qle qle, final bb7 bb7, final zf0 zf0) {
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)zf0, "value");
        qle.A1("palette");
        ar.a((xq<Object>)ar.c((xq<Object>)bg0.a, false)).d(qle, bb7, (List)zf0.a);
    }
}
