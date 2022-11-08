import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class af0 implements xq<xe0.b>
{
    public static final af0 a;
    public static final List<String> b;
    
    static {
        a = new af0();
        b = tdy.v0((Object[])new String[] { "name", "version" });
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final xe0.b b = (xe0.b)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)b, "value");
        qle.A1("name");
        final c2j<String> i = ar.i;
        i.a(qle, bb7, b.a);
        qle.A1("version");
        i.a(qle, bb7, b.b);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        String s = null;
        String s2 = null;
        while (true) {
            final int k3 = eie.k3((List)af0.b);
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
        return new xe0.b(s, s2);
    }
}
