import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yvm implements xq<xvm>
{
    public static final yvm a;
    
    static {
        a = new yvm();
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final xvm xvm = (xvm)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)xvm, "value");
        qle.i2(xvm.C0);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        final String b = br.B(eie, "reader", bb7, "customScalarAdapters");
        Objects.requireNonNull(xvm.Companion);
        while (true) {
            for (final xvm xvm : xvm.values()) {
                if (zzd.a((Object)xvm.C0, (Object)b)) {
                    xvm d0 = xvm;
                    if (xvm == null) {
                        d0 = xvm.D0;
                    }
                    return d0;
                }
            }
            xvm xvm = null;
            continue;
        }
    }
}
