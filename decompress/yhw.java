import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yhw implements xq<whw$b>
{
    public static final yhw a;
    public static final List<String> b;
    
    static {
        a = new yhw();
        b = tdy.u0((Object)"__typename");
    }
    
    public final whw$b c(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)yhw.b) == 0) {
            o = ar.a.b(eie, bb7);
        }
        eie.H();
        final jjw c = mjw.a.c(eie, bb7);
        zzd.c(o);
        return new whw$b((String)o, c);
    }
    
    public final void d(final qle qle, final bb7 bb7, final whw$b whw$b) {
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)whw$b, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)whw$b.a);
        mjw.a.d(qle, bb7, whw$b.b);
    }
}
