import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ai0 implements xq<uh0$c>
{
    public static final ai0 a;
    public static final List<String> b;
    
    static {
        a = new ai0();
        b = tdy.v0((Object[])new String[] { "url", "description" });
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final uh0$c uh0$c = (uh0$c)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)uh0$c, "value");
        qle.A1("url");
        ar.b((xq<uh0$h>)ar.c((xq<Object>)fi0.a, true)).a(qle, bb7, uh0$c.a);
        qle.A1("description");
        ar.b((xq<uh0$b>)ar.c((xq<Object>)zh0.a, true)).a(qle, bb7, uh0$c.b);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        uh0$h uh0$h = null;
        uh0$b uh0$b = null;
        while (true) {
            final int k3 = eie.k3((List)ai0.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    break;
                }
                uh0$b = ar.b((xq<uh0$b>)ar.c((xq<Object>)zh0.a, true)).b(eie, bb7);
            }
            else {
                uh0$h = ar.b((xq<uh0$h>)ar.c((xq<Object>)fi0.a, true)).b(eie, bb7);
            }
        }
        return new uh0$c(uh0$h, uh0$b);
    }
}
