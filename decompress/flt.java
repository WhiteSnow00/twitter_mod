import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class flt implements xq<clt$b>
{
    public static final flt a;
    public static final List<String> b;
    
    static {
        a = new flt();
        b = tdy.u0((Object)"__typename");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final clt$b clt$b = (clt$b)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)clt$b, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)clt$b.a);
        jy8.a.d(qle, bb7, clt$b.b);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)flt.b) == 0) {
            o = ar.a.b(eie, bb7);
        }
        eie.H();
        final iy8 c = jy8.a.c(eie, bb7);
        zzd.c(o);
        return new clt$b((String)o, c);
    }
}
