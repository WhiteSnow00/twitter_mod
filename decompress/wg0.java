import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wg0 implements zq<vg0>
{
    public static final wg0 a;
    
    static {
        a = new wg0();
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final vg0 vg0 = (vg0)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)vg0, "value");
        yle.i2(vg0.F0);
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        final String y = bj.y(kie, "reader", lb7, "customScalarAdapters");
        Objects.requireNonNull(vg0.Companion);
        while (true) {
            for (final vg0 vg0 : vg0.values()) {
                if (e0e.a((Object)vg0.F0, (Object)y)) {
                    vg0 g0 = vg0;
                    if (vg0 == null) {
                        g0 = vg0.G0;
                    }
                    return g0;
                }
            }
            vg0 vg0 = null;
            continue;
        }
    }
}
