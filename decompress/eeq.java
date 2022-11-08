import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eeq implements xq<deq>
{
    public static final eeq a;
    public static final List<String> b;
    
    static {
        a = new eeq();
        b = tdy.v0((Object[])new String[] { "previous_cursor", "next_cursor" });
    }
    
    public final deq c(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        String s = null;
        String s2 = null;
        while (true) {
            final int k3 = eie.k3((List)eeq.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    break;
                }
                s2 = ar.i.b(eie, bb7);
            }
            else {
                s = ar.i.b(eie, bb7);
            }
        }
        return new deq(s, s2);
    }
    
    public final void d(final qle qle, final bb7 bb7, final deq deq) {
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)deq, "value");
        qle.A1("previous_cursor");
        final c2j<String> i = ar.i;
        i.a(qle, bb7, deq.a);
        qle.A1("next_cursor");
        i.a(qle, bb7, deq.b);
    }
}
