import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ftb implements xq<ctb$b>
{
    public static final ftb a;
    public static final List<String> b;
    
    static {
        a = new ftb();
        b = tdy.u0((Object)"__typename");
    }
    
    public final ctb$b c(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)ftb.b) == 0) {
            o = ar.a.b(eie, bb7);
        }
        eie.H();
        final tzu c = xzu.a.c(eie, bb7);
        zzd.c(o);
        return new ctb$b((String)o, c);
    }
    
    public final void d(final qle qle, final bb7 bb7, final ctb$b ctb$b) {
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)ctb$b, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)ctb$b.a);
        xzu.a.d(qle, bb7, ctb$b.b);
    }
}
