import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class of0 implements xq<lf0$a>
{
    public static final of0 a;
    public static final List<String> b;
    
    static {
        a = new of0();
        b = tdy.u0((Object)"__typename");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final lf0$a lf0$a = (lf0$a)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)lf0$a, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)lf0$a.a);
        kv0.a.d(qle, bb7, lf0$a.b);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)of0.b) == 0) {
            o = ar.a.b(eie, bb7);
        }
        eie.H();
        final jv0 c = kv0.a.c(eie, bb7);
        zzd.c(o);
        return new lf0$a((String)o, c);
    }
}
