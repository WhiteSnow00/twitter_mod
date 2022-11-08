import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oku implements xq<pju.y>
{
    public static final oku a;
    public static final List<String> b;
    
    static {
        a = new oku();
        b = tdy.u0((Object)"__typename");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final pju.y y = (pju.y)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)y, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)y.a);
        final pju.n b = y.b;
        if (b != null) {
            dku.a.d(qle, bb7, b);
        }
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        pju.n c = null;
        String s = null;
        while (eie.k3((List)oku.b) == 0) {
            s = (String)ar.a.b(eie, bb7);
        }
        if (s != null) {
            if (kq9.I0(kq9.a1(new String[] { "User" }), bb7.C0.a(), s, bb7.C0)) {
                eie.H();
                c = dku.a.c(eie, bb7);
            }
            return new pju.y(s, c);
        }
        throw new IllegalStateException("__typename was not found".toString());
    }
}
