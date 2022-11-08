import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fg0 implements xq<dg0$a>
{
    public static final fg0 a;
    public static final List<String> b;
    
    static {
        a = new fg0();
        b = tdy.u0((Object)"r");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final dg0$a dg0$a = (dg0$a)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)dg0$a, "value");
        qle.A1("r");
        ar.b((xq<dg0$c>)ar.c((xq<Object>)hg0.a, false)).a(qle, bb7, dg0$a.a);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        dg0$c dg0$c = null;
        while (eie.k3((List)fg0.b) == 0) {
            dg0$c = ar.b((xq<dg0$c>)ar.c((xq<Object>)hg0.a, false)).b(eie, bb7);
        }
        return new dg0$a(dg0$c);
    }
}
