import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class og0 implements xq<xf0.f>
{
    public static final og0 a;
    public static final List<String> b;
    
    static {
        a = new og0();
        b = tdy.u0((Object)"__typename");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final xf0.f f = (xf0.f)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)f, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)f.a);
        final xf0.e b = f.b;
        if (b != null) {
            ng0.a.d(qle, bb7, b);
        }
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        xf0.e c = null;
        String s = null;
        while (eie.k3((List)og0.b) == 0) {
            s = (String)ar.a.b(eie, bb7);
        }
        if (s != null) {
            if (kq9.I0(kq9.a1(new String[] { "ApiMediaUnavailabilityInfoCopyrightViolation" }), bb7.C0.a(), s, bb7.C0)) {
                eie.H();
                c = ng0.a.c(eie, bb7);
            }
            return new xf0.f(s, c);
        }
        throw new IllegalStateException("__typename was not found".toString());
    }
}
