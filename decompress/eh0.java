import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eh0 implements xq<ch0.a>
{
    public static final eh0 a;
    public static final List<String> b;
    
    static {
        a = new eh0();
        b = tdy.v0((Object[])new String[] { "street_address", "twitter" });
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final ch0.a a = (ch0.a)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)a, "value");
        qle.A1("street_address");
        final c2j<String> i = ar.i;
        i.a(qle, bb7, a.a);
        qle.A1("twitter");
        i.a(qle, bb7, a.b);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        String s = null;
        String s2 = null;
        while (true) {
            final int k3 = eie.k3((List)eh0.b);
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
        return new ch0.a(s, s2);
    }
}
