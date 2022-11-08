import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uzu implements xq<tzu$a>
{
    public static final uzu a;
    public static final List<String> b;
    
    static {
        a = new uzu();
        b = tdy.u0((Object)"__typename");
    }
    
    public final tzu$a c(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)uzu.b) == 0) {
            o = ar.a.b(eie, bb7);
        }
        eie.H();
        final pju c = sku.a.c(eie, bb7);
        zzd.c(o);
        return new tzu$a((String)o, c);
    }
    
    public final void d(final qle qle, final bb7 bb7, final tzu$a tzu$a) {
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)tzu$a, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)tzu$a.a);
        sku.a.d(qle, bb7, tzu$a.b);
    }
}
