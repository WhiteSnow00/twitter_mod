import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dtb implements xq<ctb>
{
    public static final dtb a;
    public static final List<String> b;
    
    static {
        a = new dtb();
        b = tdy.v0((Object[])new String[] { "__typename", "legacy" });
    }
    
    public final ctb c(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        ctb$a ctb$a = null;
        while (true) {
            final int k3 = eie.k3((List)dtb.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    break;
                }
                final etb a = etb.a;
                final ar$g a2 = ar.a;
                ctb$a = ar.b((xq<ctb$a>)new g4j((xq)a, false)).b(eie, bb7);
            }
            else {
                o = ar.a.b(eie, bb7);
            }
        }
        eie.H();
        final tzu c = xzu.a.c(eie, bb7);
        zzd.c(o);
        return new ctb((String)o, ctb$a, c);
    }
    
    public final void d(final qle qle, final bb7 bb7, final ctb ctb) {
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)ctb, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)ctb.a);
        qle.A1("legacy");
        ar.b((xq<ctb$a>)new g4j((xq)etb.a, false)).a(qle, bb7, ctb.b);
        xzu.a.d(qle, bb7, ctb.c);
    }
}
