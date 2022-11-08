import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oqo implements xq<nqo>
{
    public static final oqo a;
    public static final List<String> b;
    
    static {
        a = new oqo();
        b = tdy.v0((Object[])new String[] { "left", "top", "width", "height" });
    }
    
    public final nqo c(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        Object o2 = null;
        Object o4;
        Object o3 = o4 = o2;
        while (true) {
            final int k3 = eie.k3((List)oqo.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    if (k3 != 2) {
                        if (k3 != 3) {
                            break;
                        }
                        o4 = ar.b.b(eie, bb7);
                    }
                    else {
                        o3 = ar.b.b(eie, bb7);
                    }
                }
                else {
                    o2 = ar.b.b(eie, bb7);
                }
            }
            else {
                o = ar.b.b(eie, bb7);
            }
        }
        zzd.c(o);
        final int intValue = (int)o;
        zzd.c(o2);
        final int intValue2 = (int)o2;
        zzd.c(o3);
        final int intValue3 = (int)o3;
        zzd.c(o4);
        return new nqo(intValue, intValue2, intValue3, (int)o4);
    }
    
    public final void d(final qle qle, final bb7 bb7, final nqo nqo) {
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)nqo, "value");
        qle.A1("left");
        final ar$e b = ar.b;
        b.a(qle, bb7, (Object)nqo.a);
        qle.A1("top");
        b.a(qle, bb7, (Object)nqo.b);
        qle.A1("width");
        b.a(qle, bb7, (Object)nqo.c);
        qle.A1("height");
        b.a(qle, bb7, (Object)nqo.d);
    }
}
