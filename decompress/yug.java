import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yug implements xq<xug>
{
    public static final yug a;
    public static final List<String> b;
    
    static {
        a = new yug();
        b = tdy.v0((Object[])new String[] { "aspect_ratio", "duration_millis", "variants" });
    }
    
    public final xug c(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        List<Integer> list = null;
        List<xug.a> list2;
        Object o = list2 = null;
        while (true) {
            final int k3 = eie.k3((List)yug.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    if (k3 != 2) {
                        break;
                    }
                    list2 = ar.b((xq<List<xug.a>>)ar.a((xq<Object>)ar.c((xq<Object>)zug.a, false))).b(eie, bb7);
                }
                else {
                    Objects.requireNonNull(vtd.Companion);
                    o = xa0.A(bb7, vtd.a, eie, bb7);
                }
            }
            else {
                Objects.requireNonNull(vtd.Companion);
                list = ar.b((xq<List<Integer>>)ar.a((xq<Object>)bb7.a(vtd.a))).b(eie, bb7);
            }
        }
        return new xug(list, (Integer)o, list2);
    }
    
    public final void d(final qle qle, final bb7 bb7, final xug xug) {
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)xug, "value");
        qle.A1("aspect_ratio");
        final vtd.a companion = vtd.Companion;
        Objects.requireNonNull(companion);
        final cb7 a = vtd.a;
        ar.b((xq<List<Integer>>)ar.a((xq<Object>)bb7.a(a))).a(qle, bb7, xug.a);
        qle.A1("duration_millis");
        Objects.requireNonNull(companion);
        ar.b((xq<Integer>)bb7.a(a)).a(qle, bb7, xug.b);
        qle.A1("variants");
        ar.b((xq<List<xug.a>>)ar.a((xq<Object>)ar.c((xq<Object>)zug.a, false))).a(qle, bb7, xug.c);
    }
}
