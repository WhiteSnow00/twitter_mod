import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ysw implements xq<wsw$a>
{
    public static final ysw a;
    public static final List<String> b;
    
    static {
        a = new ysw();
        b = tdy.u0((Object)"__typename");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final wsw$a wsw$a = (wsw$a)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)wsw$a, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)wsw$a.a);
        x16.a.d(qle, bb7, wsw$a.b);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)ysw.b) == 0) {
            o = ar.a.b(eie, bb7);
        }
        eie.H();
        final e16 c = x16.a.c(eie, bb7);
        zzd.c(o);
        return new wsw$a((String)o, c);
    }
}
