import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zg7 implements xq<wg7>
{
    public static final zg7 a;
    public static final List<String> b;
    
    static {
        a = new zg7();
        b = tdy.u0((Object)"card");
    }
    
    public final wg7 c(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)zg7.b) == 0) {
            o = ar.c((xq<Object>)yg7.a, true).b(eie, bb7);
        }
        zzd.c(o);
        return new wg7((wg7$a)o);
    }
    
    public final void d(final qle qle, final bb7 bb7, final wg7 wg7) {
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)wg7, "value");
        qle.A1("card");
        ar.c((xq<Object>)yg7.a, true).a(qle, bb7, (Object)wg7.a);
    }
}
