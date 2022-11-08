import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fc5 implements xq<dc5$a>
{
    public static final fc5 a;
    public static final List<String> b;
    
    static {
        a = new fc5();
        b = tdy.u0((Object)"unreadIndicatorActive");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final dc5$a dc5$a = (dc5$a)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)dc5$a, "value");
        qle.A1("unreadIndicatorActive");
        ar.f.a(qle, bb7, (Object)dc5$a.a);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)fc5.b) == 0) {
            o = ar.f.b(eie, bb7);
        }
        zzd.c(o);
        return new dc5$a((boolean)o);
    }
}
