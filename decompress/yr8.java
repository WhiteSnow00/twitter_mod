import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yr8 implements xq<vr8.b>
{
    public static final yr8 a;
    public static final List<String> b;
    
    static {
        a = new yr8();
        b = tdy.u0((Object)"__typename");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final vr8.b b = (vr8.b)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)b, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)b.a);
        ro0.a.d(qle, bb7, b.b);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)yr8.b) == 0) {
            o = ar.a.b(eie, bb7);
        }
        eie.H();
        final po0 c = ro0.a.c(eie, bb7);
        zzd.c(o);
        return new vr8.b((String)o, c);
    }
}
