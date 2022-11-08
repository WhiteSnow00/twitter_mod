import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vf0 implements xq<rf0.b>
{
    public static final vf0 a;
    public static final List<String> b;
    
    static {
        a = new vf0();
        b = tdy.u0((Object)"__typename");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final rf0.b b = (rf0.b)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)b, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)b.a);
        oqo.a.d(qle, bb7, b.b);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)vf0.b) == 0) {
            o = ar.a.b(eie, bb7);
        }
        eie.H();
        final nqo c = oqo.a.c(eie, bb7);
        zzd.c(o);
        return new rf0.b((String)o, c);
    }
}
