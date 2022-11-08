import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yrg implements xq<wrg$a>
{
    public static final yrg a;
    public static final List<String> b;
    
    static {
        a = new yrg();
        b = tdy.v0((Object[])new String[] { "percentage", "rgb" });
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final wrg$a wrg$a = (wrg$a)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)wrg$a, "value");
        qle.A1("percentage");
        ar.c.a(qle, bb7, (Object)wrg$a.a);
        qle.A1("rgb");
        final zrg a = zrg.a;
        final wrg$b b = wrg$a.b;
        qle.G();
        ((xq<wrg$b>)a).a(qle, bb7, b);
        qle.Q();
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        Object o2 = null;
        while (true) {
            final int k3 = eie.k3((List)yrg.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    break;
                }
                final zrg a = zrg.a;
                final ar$g a2 = ar.a;
                o2 = new g4j((xq)a, false).b(eie, bb7);
            }
            else {
                o = ar.c.b(eie, bb7);
            }
        }
        zzd.c(o);
        final double doubleValue = (double)o;
        zzd.c(o2);
        return new wrg$a(doubleValue, (wrg$b)o2);
    }
}
