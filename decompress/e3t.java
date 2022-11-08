import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e3t implements xq<p2t$j>
{
    public static final e3t a;
    public static final List<String> b;
    
    static {
        a = new e3t();
        b = tdy.u0((Object)"rest_id");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final p2t$j p2t$j = (p2t$j)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)p2t$j, "value");
        qle.A1("rest_id");
        Objects.requireNonNull(w2j.Companion);
        bb7.a(w2j.a).a(qle, bb7, p2t$j.a);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        String s = null;
        while (eie.k3((List)e3t.b) == 0) {
            Objects.requireNonNull(w2j.Companion);
            s = bb7.a(w2j.a).b(eie, bb7);
        }
        zzd.c((Object)s);
        return new p2t$j(s);
    }
}
