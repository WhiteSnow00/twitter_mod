import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zh0 implements xq<uh0$b>
{
    public static final zh0 a;
    public static final List<String> b;
    
    static {
        a = new zh0();
        b = tdy.u0((Object)"__typename");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final uh0$b uh0$b = (uh0$b)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)uh0$b, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)uh0$b.a);
        ff0.a.d(qle, bb7, uh0$b.b);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)zh0.b) == 0) {
            o = ar.a.b(eie, bb7);
        }
        eie.H();
        final ef0 c = ff0.a.c(eie, bb7);
        zzd.c(o);
        return new uh0$b((String)o, c);
    }
}
