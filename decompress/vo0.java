import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vo0 implements xq<po0.d>
{
    public static final vo0 a;
    public static final List<String> b;
    
    static {
        a = new vo0();
        b = tdy.v0((Object[])new String[] { "count", "star" });
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final po0.d d = (po0.d)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)d, "value");
        qle.A1("count");
        Objects.requireNonNull(w2j.Companion);
        ar.b((xq<String>)bb7.a(w2j.a)).a(qle, bb7, d.a);
        qle.A1("star");
        ar.j.a(qle, bb7, d.b);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        String s = null;
        Double n = null;
        while (true) {
            final int k3 = eie.k3((List)vo0.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    break;
                }
                n = ar.j.b(eie, bb7);
            }
            else {
                Objects.requireNonNull(w2j.Companion);
                s = (String)xa0.A(bb7, w2j.a, eie, bb7);
            }
        }
        return new po0.d(s, n);
    }
}
