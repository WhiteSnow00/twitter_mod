import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fs8 implements xq<vr8.h>
{
    public static final fs8 a;
    public static final List<String> b;
    
    static {
        a = new fs8();
        b = tdy.u0((Object)"__typename");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final vr8.h h = (vr8.h)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)h, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)h.a);
        wg0.a.d(qle, bb7, h.b);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)fs8.b) == 0) {
            o = ar.a.b(eie, bb7);
        }
        eie.H();
        final vg0 c = wg0.a.c(eie, bb7);
        zzd.c(o);
        return new vr8.h((String)o, c);
    }
}
