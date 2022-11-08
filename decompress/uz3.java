import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uz3 implements xq<sz3$c>
{
    public static final uz3 a;
    public static final List<String> b;
    
    static {
        a = new uz3();
        b = tdy.u0((Object)"__typename");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final sz3$c sz3$c = (sz3$c)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)sz3$c, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)sz3$c.a);
        jn7.a.d(qle, bb7, sz3$c.b);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)uz3.b) == 0) {
            o = ar.a.b(eie, bb7);
        }
        eie.H();
        final in7 c = jn7.a.c(eie, bb7);
        zzd.c(o);
        return new sz3$c((String)o, c);
    }
}
