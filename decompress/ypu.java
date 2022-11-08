import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ypu implements xq<vpu>
{
    public static final ypu a;
    public static final List<String> b;
    
    static {
        a = new ypu();
        b = tdy.u0((Object)"result");
    }
    
    public final vpu c(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)ypu.b) == 0) {
            o = ar.b((xq<vpu.b>)ar.c((xq<Object>)xpu.a, true)).b(eie, bb7);
        }
        return new vpu((vpu.b)o);
    }
    
    public final void d(final qle qle, final bb7 bb7, final vpu vpu) {
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)vpu, "value");
        qle.A1("result");
        ar.b((xq<vpu.b>)ar.c((xq<Object>)xpu.a, true)).a(qle, bb7, vpu.a);
    }
}
