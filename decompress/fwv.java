import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fwv implements xq<nvv$a>
{
    public static final fwv a;
    public static final List<String> b;
    
    static {
        a = new fwv();
        b = tdy.v0((Object[])new String[] { "hide_border", "hide_bottom_padding" });
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final nvv$a nvv$a = (nvv$a)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)nvv$a, "value");
        qle.A1("hide_border");
        final c2j<Boolean> l = ar.l;
        l.a(qle, bb7, nvv$a.a);
        qle.A1("hide_bottom_padding");
        l.a(qle, bb7, nvv$a.b);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Boolean b = null;
        Boolean b2 = null;
        while (true) {
            final int k3 = eie.k3((List)fwv.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    break;
                }
                b2 = ar.l.b(eie, bb7);
            }
            else {
                b = ar.l.b(eie, bb7);
            }
        }
        return new nvv$a(b, b2);
    }
}
