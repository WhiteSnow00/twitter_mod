import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w16 implements xq<e16.b>
{
    public static final w16 a;
    public static final List<String> b;
    
    static {
        a = new w16();
        b = tdy.u0((Object)"__typename");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final e16.b b = (e16.b)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)b, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)b.a);
        k43.a.d(qle, bb7, b.b);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)w16.b) == 0) {
            o = ar.a.b(eie, bb7);
        }
        eie.H();
        final j43 c = k43.a.c(eie, bb7);
        zzd.c(o);
        return new e16.b((String)o, c);
    }
}
