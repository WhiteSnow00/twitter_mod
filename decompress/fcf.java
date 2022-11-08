import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fcf implements xq<dcf$a>
{
    public static final fcf a;
    public static final List<String> b;
    
    static {
        a = new fcf();
        b = tdy.u0((Object)"__typename");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final dcf$a dcf$a = (dcf$a)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)dcf$a, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)dcf$a.a);
        jcf.a.d(qle, bb7, dcf$a.b);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)fcf.b) == 0) {
            o = ar.a.b(eie, bb7);
        }
        eie.H();
        final icf c = jcf.a.c(eie, bb7);
        zzd.c(o);
        return new dcf$a((String)o, c);
    }
}
