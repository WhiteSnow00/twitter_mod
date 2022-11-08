import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dy8 implements xq<cy8>
{
    public static final dy8 a;
    public static final List<String> b;
    
    static {
        a = new dy8();
        b = tdy.v0((Object[])new String[] { "rest_id", "result" });
    }
    
    public final cy8 c(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        String s = null;
        cy8$a cy8$a = null;
        while (true) {
            final int k3 = eie.k3((List)dy8.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    break;
                }
                cy8$a = ar.b((xq<cy8$a>)ar.c((xq<Object>)ey8.a, true)).b(eie, bb7);
            }
            else {
                Objects.requireNonNull(w2j.Companion);
                s = bb7.a(w2j.a).b(eie, bb7);
            }
        }
        zzd.c((Object)s);
        return new cy8(s, cy8$a);
    }
    
    public final void d(final qle qle, final bb7 bb7, final cy8 cy8) {
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)cy8, "value");
        qle.A1("rest_id");
        Objects.requireNonNull(w2j.Companion);
        bb7.a(w2j.a).a(qle, bb7, cy8.a);
        qle.A1("result");
        ar.b((xq<cy8$a>)ar.c((xq<Object>)ey8.a, true)).a(qle, bb7, cy8.b);
    }
}
