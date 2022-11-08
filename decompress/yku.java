import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yku implements xq<pju.h0>
{
    public static final yku a;
    public static final List<String> b;
    
    static {
        a = new yku();
        b = tdy.u0((Object)"id");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final pju.h0 h0 = (pju.h0)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)h0, "value");
        qle.A1("id");
        Objects.requireNonNull(w2j.Companion);
        bb7.a(w2j.a).a(qle, bb7, h0.a);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        String s = null;
        while (eie.k3((List)yku.b) == 0) {
            Objects.requireNonNull(w2j.Companion);
            s = bb7.a(w2j.a).b(eie, bb7);
        }
        zzd.c((Object)s);
        return new pju.h0(s);
    }
}
