import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fg7 implements xq<dg7$a>
{
    public static final fg7 a;
    public static final List<String> b;
    
    static {
        a = new fg7();
        b = tdy.u0((Object)"__typename");
    }
    
    public final dg7$a c(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)fg7.b) == 0) {
            o = ar.a.b(eie, bb7);
        }
        eie.H();
        final wg7 c = zg7.a.c(eie, bb7);
        zzd.c(o);
        return new dg7$a((String)o, c);
    }
    
    public final void d(final qle qle, final bb7 bb7, final dg7$a dg7$a) {
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)dg7$a, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)dg7$a.a);
        zg7.a.d(qle, bb7, dg7$a.b);
    }
}
