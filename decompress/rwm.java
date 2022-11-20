import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rwm implements xq<qwm>
{
    public static final rwm a;
    
    static {
        a = new rwm();
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final qwm qwm = (qwm)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)qwm, "value");
        ale.h2(qwm.D0);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        final String y = br.y(ohe, "reader", fa7, "customScalarAdapters");
        Objects.requireNonNull(qwm.Companion);
        while (true) {
            for (final qwm qwm : qwm.values()) {
                if (czd.a((Object)qwm.D0, (Object)y)) {
                    qwm h0 = qwm;
                    if (qwm == null) {
                        h0 = qwm.H0;
                    }
                    return h0;
                }
            }
            qwm qwm = null;
            continue;
        }
    }
}
