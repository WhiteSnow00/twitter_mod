import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fku implements xq<pju.p>
{
    public static final fku a;
    public static final List<String> b;
    
    static {
        a = new fku();
        b = tdy.u0((Object)"result");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final pju.p p3 = (pju.p)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)p3, "value");
        qle.A1("result");
        ar.b((xq<pju.y>)ar.c((xq<Object>)oku.a, true)).a(qle, bb7, p3.a);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        pju.y y = null;
        while (eie.k3((List)fku.b) == 0) {
            y = ar.b((xq<pju.y>)ar.c((xq<Object>)oku.a, true)).b(eie, bb7);
        }
        return new pju.p(y);
    }
}
