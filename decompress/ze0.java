import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ze0 implements xq<xe0.a>
{
    public static final ze0 a;
    public static final List<String> b;
    
    static {
        a = new ze0();
        b = tdy.v0((Object[])new String[] { "bucket", "name" });
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final xe0.a a = (xe0.a)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)a, "value");
        qle.A1("bucket");
        final c2j<String> i = ar.i;
        i.a(qle, bb7, a.a);
        qle.A1("name");
        i.a(qle, bb7, a.b);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        String s = null;
        String s2 = null;
        while (true) {
            final int k3 = eie.k3((List)ze0.b);
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
        return new xe0.a(s, s2);
    }
}
