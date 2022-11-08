import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vi3 implements xq<ui3>
{
    public static final vi3 a;
    
    static {
        a = new vi3();
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final ui3 ui3 = (ui3)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)ui3, "value");
        qle.i2(ui3.C0);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        final String b = br.B(eie, "reader", bb7, "customScalarAdapters");
        Objects.requireNonNull(ui3.Companion);
        while (true) {
            for (final ui3 ui3 : ui3.values()) {
                if (zzd.a((Object)ui3.C0, (Object)b)) {
                    ui3 d0 = ui3;
                    if (ui3 == null) {
                        d0 = ui3.D0;
                    }
                    return d0;
                }
            }
            ui3 ui3 = null;
            continue;
        }
    }
}
