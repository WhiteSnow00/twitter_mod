import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w7l implements zq<s7l>
{
    public static final w7l a;
    
    static {
        a = new w7l();
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final s7l s7l = (s7l)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)s7l, "value");
        yle.i2(s7l.F0);
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        final String y = bj.y(kie, "reader", lb7, "customScalarAdapters");
        Objects.requireNonNull(s7l.Companion);
        while (true) {
            for (final s7l s7l : s7l.values()) {
                if (e0e.a((Object)s7l.F0, (Object)y)) {
                    s7l g0 = s7l;
                    if (s7l == null) {
                        g0 = s7l.G0;
                    }
                    return g0;
                }
            }
            s7l s7l = null;
            continue;
        }
    }
}
