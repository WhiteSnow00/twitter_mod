import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zg0 implements xq<yg0>
{
    public static final zg0 a;
    
    static {
        a = new zg0();
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final yg0 yg0 = (yg0)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)yg0, "value");
        qle.i2(yg0.C0);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        final String b = br.B(eie, "reader", bb7, "customScalarAdapters");
        Objects.requireNonNull(yg0.Companion);
        while (true) {
            for (final yg0 yg0 : yg0.values()) {
                if (zzd.a((Object)yg0.C0, (Object)b)) {
                    yg0 d0 = yg0;
                    if (yg0 == null) {
                        d0 = yg0.D0;
                    }
                    return d0;
                }
            }
            yg0 yg0 = null;
            continue;
        }
    }
}
