import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fq4 implements xq<aq4$d>
{
    public static final fq4 a;
    public static final List<String> b;
    
    static {
        a = new fq4();
        b = tdy.u0((Object)"invited_collaborators");
    }
    
    public final aq4$d c(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        List c = null;
        while (eie.k3((List)fq4.b) == 0) {
            c = ar.a((xq<Object>)ar.c((xq<Object>)eq4.a, false)).c(eie, bb7);
        }
        zzd.c((Object)c);
        return new aq4$d(c);
    }
    
    public final void d(final qle qle, final bb7 bb7, final aq4$d aq4$d) {
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)aq4$d, "value");
        qle.A1("invited_collaborators");
        ar.a((xq<Object>)ar.c((xq<Object>)eq4.a, false)).d(qle, bb7, aq4$d.a);
    }
}
