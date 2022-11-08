import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yju implements xq<pju.i>
{
    public static final yju a;
    public static final List<String> b;
    
    static {
        a = new yju();
        b = tdy.u0((Object)"screen_name");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final pju.i i = (pju.i)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)i, "value");
        qle.A1("screen_name");
        ar.i.a(qle, bb7, i.a);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        String s = null;
        while (eie.k3((List)yju.b) == 0) {
            s = ar.i.b(eie, bb7);
        }
        return new pju.i(s);
    }
}
