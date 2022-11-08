import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v5w implements xq<u5w>
{
    public static final v5w a;
    public static final List<String> b;
    
    static {
        a = new v5w();
        b = tdy.v0((Object[])new String[] { "full_url", "vanity_url" });
    }
    
    public final u5w c(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        String s = null;
        while (true) {
            final int k3 = eie.k3((List)v5w.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    break;
                }
                s = ar.i.b(eie, bb7);
            }
            else {
                o = ar.a.b(eie, bb7);
            }
        }
        zzd.c(o);
        return new u5w((String)o, s);
    }
    
    public final void d(final qle qle, final bb7 bb7, final u5w u5w) {
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)u5w, "value");
        qle.A1("full_url");
        ar.a.a(qle, bb7, (Object)u5w.a);
        qle.A1("vanity_url");
        ar.i.a(qle, bb7, u5w.b);
    }
}
