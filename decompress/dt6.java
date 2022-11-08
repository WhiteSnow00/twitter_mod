import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dt6 implements xq<gq6$e>
{
    public static final dt6 a;
    public static final List<String> b;
    
    static {
        a = new dt6();
        b = tdy.u0((Object)"userResults");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final gq6$e gq6$e = (gq6$e)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)gq6$e, "value");
        qle.A1("userResults");
        ar.c((xq<Object>)ft6.a, false).a(qle, bb7, (Object)gq6$e.a);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)dt6.b) == 0) {
            o = ar.c((xq<Object>)ft6.a, false).b(eie, bb7);
        }
        zzd.c(o);
        return new gq6$e((gq6$g)o);
    }
}
