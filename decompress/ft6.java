import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ft6 implements xq<gq6$g>
{
    public static final ft6 a;
    public static final List<String> b;
    
    static {
        a = new ft6();
        b = tdy.u0((Object)"restId");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final gq6$g gq6$g = (gq6$g)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)gq6$g, "value");
        qle.A1("restId");
        Objects.requireNonNull(w2j.Companion);
        bb7.a(w2j.a).a(qle, bb7, gq6$g.a);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        String s = null;
        while (eie.k3((List)ft6.b) == 0) {
            Objects.requireNonNull(w2j.Companion);
            s = bb7.a(w2j.a).b(eie, bb7);
        }
        zzd.c((Object)s);
        return new gq6$g(s);
    }
}
