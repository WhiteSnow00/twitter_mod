import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yx8 implements xq<vx8.b>
{
    public static final yx8 a;
    public static final List<String> b;
    
    static {
        a = new yx8();
        b = tdy.v0((Object[])new String[] { "description", "url" });
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final vx8.b b = (vx8.b)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)b, "value");
        qle.A1("description");
        ar.b((xq<vx8.a>)ar.c((xq<Object>)wx8.a, true)).a(qle, bb7, b.a);
        qle.A1("url");
        ar.b((xq<vx8.e>)ar.c((xq<Object>)by8.a, true)).a(qle, bb7, b.b);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        vx8.a a = null;
        vx8.e e = null;
        while (true) {
            final int k3 = eie.k3((List)yx8.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    break;
                }
                e = ar.b((xq<vx8.e>)ar.c((xq<Object>)by8.a, true)).b(eie, bb7);
            }
            else {
                a = ar.b((xq<vx8.a>)ar.c((xq<Object>)wx8.a, true)).b(eie, bb7);
            }
        }
        return new vx8.b(a, e);
    }
}
