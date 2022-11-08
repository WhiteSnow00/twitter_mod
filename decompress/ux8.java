import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ux8 implements xq<px8$d>
{
    public static final ux8 a;
    public static final List<String> b;
    
    static {
        a = new ux8();
        b = tdy.u0((Object)"__typename");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final px8$d px8$d = (px8$d)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)px8$d, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)px8$d.a);
        dy8.a.d(qle, bb7, px8$d.b);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)ux8.b) == 0) {
            o = ar.a.b(eie, bb7);
        }
        eie.H();
        final cy8 c = dy8.a.c(eie, bb7);
        zzd.c(o);
        return new px8$d((String)o, c);
    }
}
