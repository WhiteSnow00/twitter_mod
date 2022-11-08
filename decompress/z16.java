import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z16 implements xq<e16.d>
{
    public static final z16 a;
    public static final List<String> b;
    
    static {
        a = new z16();
        b = tdy.u0((Object)"__typename");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final e16.d d = (e16.d)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)d, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)d.a);
        ds8.a.d(qle, bb7, d.b);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)z16.b) == 0) {
            o = ar.a.b(eie, bb7);
        }
        eie.H();
        final vr8 c = ds8.a.c(eie, bb7);
        zzd.c(o);
        return new e16.d((String)o, c);
    }
}
