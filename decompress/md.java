import java.util.Objects;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class md extends vj1<Object>
{
    public final nd b;
    
    public md(final nd b) {
        this.b = b;
    }
    
    public final void g() {
        final nd b = this.b;
        synchronized (b) {
            xd.M(b.isClosed());
        }
    }
    
    public final void h(final Throwable t) {
        final nd b = this.b;
        if (b.i(t, b.h.getExtras())) {
            b.i.e((n1l)b.h, t);
        }
    }
    
    public final void i(final Object o, final int n) {
        final nd b = this.b;
        final pop h = b.h;
        final bj4 bj4 = (bj4)b;
        Objects.requireNonNull(bj4);
        final cj4<Object> c = cj4.c((cj4<Object>)o);
        final boolean e = vj1.e(n);
        if (((nb)bj4).k(c, e, h.getExtras()) && e) {
            ((nd)bj4).i.f((n1l)((nd)bj4).h);
        }
    }
    
    public final void j(final float n) {
        this.b.j(n);
    }
}
