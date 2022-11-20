import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bkq implements xq<zjq>
{
    public static final bkq a;
    
    static {
        a = new bkq();
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final zjq zjq = (zjq)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)zjq, "value");
        ale.h2(zjq.D0);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        final String y = br.y(ohe, "reader", fa7, "customScalarAdapters");
        Objects.requireNonNull(zjq.Companion);
        while (true) {
            for (final zjq zjq : zjq.values()) {
                if (czd.a((Object)zjq.D0, (Object)y)) {
                    zjq e0 = zjq;
                    if (zjq == null) {
                        e0 = zjq.E0;
                    }
                    return e0;
                }
            }
            zjq zjq = null;
            continue;
        }
    }
}
