import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yu6 implements xq<wu6>
{
    public static final yu6 a;
    public static final List<String> b;
    
    static {
        a = new yu6();
        b = tdy.u0((Object)"conversationWithResult");
    }
    
    public final wu6 c(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)yu6.b) == 0) {
            o = ar.c((xq<Object>)xu6.a, true).b(eie, bb7);
        }
        zzd.c(o);
        return new wu6((wu6$a)o);
    }
    
    public final void d(final qle qle, final bb7 bb7, final wu6 wu6) {
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)wu6, "value");
        qle.A1("conversationWithResult");
        ar.c((xq<Object>)xu6.a, true).a(qle, bb7, (Object)wu6.a);
    }
}
