import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p6f implements xq<k6f.e>
{
    public static final p6f a;
    public static final List<String> b;
    
    static {
        a = new p6f();
        b = tdy.u0((Object)"id_str");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final k6f.e e = (k6f.e)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)e, "value");
        qle.A1("id_str");
        ar.i.a(qle, bb7, e.a);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        String s = null;
        while (eie.k3((List)p6f.b) == 0) {
            s = ar.i.b(eie, bb7);
        }
        return new k6f.e(s);
    }
}
