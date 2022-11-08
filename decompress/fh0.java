import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fh0 implements xq<ch0.b>
{
    public static final fh0 a;
    public static final List<String> b;
    
    static {
        a = new fh0();
        b = tdy.v0((Object[])new String[] { "coordinates", "type" });
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final ch0.b b = (ch0.b)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)b, "value");
        qle.A1("coordinates");
        ar.b((xq<List<List<List<Double>>>>)new xif((xq)new xif((xq)new xif((xq)ar.c)))).a(qle, bb7, b.a);
        qle.A1("type");
        ar.i.a(qle, bb7, b.b);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        List<? extends List<? extends List<Double>>> list = null;
        String s = null;
        while (true) {
            final int k3 = eie.k3((List)fh0.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    break;
                }
                s = ar.i.b(eie, bb7);
            }
            else {
                list = ar.b((xq<List<? extends List<? extends List<Double>>>>)new xif((xq)new xif((xq)new xif((xq)ar.c)))).b(eie, bb7);
            }
        }
        return new ch0.b(list, s);
    }
}
