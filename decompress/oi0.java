import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oi0 implements xq<ji0$c>
{
    public static final oi0 a;
    public static final List<String> b;
    
    static {
        a = new oi0();
        b = tdy.u0((Object)"__typename");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final ji0$c ji0$c = (ji0$c)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)ji0$c, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)ji0$c.a);
        c4x.a.d(qle, bb7, ji0$c.b);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)oi0.b) == 0) {
            o = ar.a.b(eie, bb7);
        }
        eie.H();
        final b4x c = c4x.a.c(eie, bb7);
        zzd.c(o);
        return new ji0$c((String)o, c);
    }
}
