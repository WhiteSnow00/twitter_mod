import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public class fge<T> extends nxj<T>
{
    public final o8c<T> a;
    
    public fge(final o8c<T> a) {
        this.a = a;
    }
    
    public final T parse(final qhe qhe) throws IOException {
        final rje i0 = qhe.i0();
        final T t = null;
        final T t2 = null;
        Object apply = t;
        if (i0 != null) {
            apply = t;
            if (i0 == rje.R0) {
                final String d = qhe.d();
                final rje i2 = qhe.i0();
                final rje n0 = rje.N0;
                if (i2 != n0 && !"__typename".equals(d)) {
                    r9a.d((Throwable)new IllegalStateException("Json parser should either be an object or typename should be the first key."));
                    qhe.m0();
                }
                if (i2 == n0) {
                    final lub lub = this.a.b.get(d);
                    if (lub != null) {
                        apply = lub.apply((Object)qhe);
                    }
                    else {
                        qhe.m0();
                        apply = t2;
                    }
                }
                else {
                    final lub lub2 = this.a.a.get(qhe.j());
                    if (lub2 != null) {
                        final yrl yrl = new yrl(qhe);
                        if (yrl.H0 == rje.M0) {
                            yrl.H0 = n0;
                            return (T)lub2.apply((Object)yrl);
                        }
                        throw new IllegalStateException("Token is already pushed but not used.");
                    }
                    else {
                        qhe.m0();
                        apply = t2;
                    }
                }
                qhe.i0();
            }
        }
        return (T)apply;
    }
}
