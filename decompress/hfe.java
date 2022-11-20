import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public class hfe<T> extends ywj<T>
{
    public final m7c<T> a;
    
    public hfe(final m7c<T> a) {
        this.a = a;
    }
    
    public final T parse(final tge tge) throws IOException {
        final vie h0 = tge.h0();
        final T t = null;
        final T t2 = null;
        Object apply = t;
        if (h0 != null) {
            apply = t;
            if (h0 == vie.P0) {
                final String d = tge.d();
                final vie h2 = tge.h0();
                final vie l0 = vie.L0;
                if (h2 != l0 && !"__typename".equals(d)) {
                    m8a.d((Throwable)new IllegalStateException("Json parser should either be an object or typename should be the first key."));
                    tge.l0();
                }
                if (h2 == l0) {
                    final jtb jtb = this.a.b.get(d);
                    if (jtb != null) {
                        apply = jtb.apply((Object)tge);
                    }
                    else {
                        tge.l0();
                        apply = t2;
                    }
                }
                else {
                    final jtb jtb2 = this.a.a.get(tge.j());
                    if (jtb2 != null) {
                        final nrl nrl = new nrl(tge);
                        if (nrl.F0 == vie.K0) {
                            nrl.F0 = l0;
                            return (T)jtb2.apply((Object)nrl);
                        }
                        throw new IllegalStateException("Token is already pushed but not used.");
                    }
                    else {
                        tge.l0();
                        apply = t2;
                    }
                }
                tge.h0();
            }
        }
        return (T)apply;
    }
}
