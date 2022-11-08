import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yv5 implements xq<vv5.d>
{
    public static final yv5 a;
    public static final List<String> b;
    
    static {
        a = new yv5();
        b = tdy.u0((Object)"actions");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final vv5.d d = (vv5.d)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)d, "value");
        qle.A1("actions");
        ar.c((xq<Object>)wv5.a, false).a(qle, bb7, (Object)d.a);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)yv5.b) == 0) {
            o = ar.c((xq<Object>)wv5.a, false).b(eie, bb7);
        }
        zzd.c(o);
        return new vv5.d((vv5.a)o);
    }
}
