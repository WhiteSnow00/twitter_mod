import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fsg implements xq<dsg.a>
{
    public static final fsg a;
    public static final List<String> b;
    
    static {
        a = new fsg();
        b = tdy.u0((Object)"__typename");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final dsg.a a = (dsg.a)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)a, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)a.a);
        ds8.a.d(qle, bb7, a.b);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)fsg.b) == 0) {
            o = ar.a.b(eie, bb7);
        }
        eie.H();
        final vr8 c = ds8.a.c(eie, bb7);
        zzd.c(o);
        return new dsg.a((String)o, c);
    }
}