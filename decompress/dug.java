import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dug implements xq<ctg$g>
{
    public static final dug a;
    public static final List<String> b;
    
    static {
        a = new dug();
        b = tdy.u0((Object)"viewCount");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final ctg$g ctg$g = (ctg$g)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)ctg$g, "value");
        qle.A1("viewCount");
        Objects.requireNonNull(vtd.Companion);
        ar.b((xq<Integer>)bb7.a(vtd.a)).a(qle, bb7, ctg$g.a);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Integer n = null;
        while (eie.k3((List)dug.b) == 0) {
            Objects.requireNonNull(vtd.Companion);
            n = (Integer)xa0.A(bb7, vtd.a, eie, bb7);
        }
        return new ctg$g(n);
    }
}
