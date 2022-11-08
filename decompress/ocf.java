import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ocf implements xq<lcf$a>
{
    public static final ocf a;
    public static final List<String> b;
    
    static {
        a = new ocf();
        b = tdy.u0((Object)"__typename");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final lcf$a lcf$a = (lcf$a)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)lcf$a, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)lcf$a.a);
        gcf.a.d(qle, bb7, lcf$a.b);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)ocf.b) == 0) {
            o = ar.a.b(eie, bb7);
        }
        eie.H();
        final dcf c = gcf.a.c(eie, bb7);
        zzd.c(o);
        return new lcf$a((String)o, c);
    }
}
