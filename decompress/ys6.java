import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ys6 implements xq<gq6$a>
{
    public static final ys6 a;
    public static final List<String> b;
    
    static {
        a = new ys6();
        b = tdy.u0((Object)"result");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final gq6$a gq6$a = (gq6$a)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)gq6$a, "value");
        qle.A1("result");
        ar.b((xq<gq6$f>)ar.c((xq<Object>)et6.a, true)).a(qle, bb7, gq6$a.a);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        gq6$f gq6$f = null;
        while (eie.k3((List)ys6.b) == 0) {
            gq6$f = ar.b((xq<gq6$f>)ar.c((xq<Object>)et6.a, true)).b(eie, bb7);
        }
        return new gq6$a(gq6$f);
    }
}
