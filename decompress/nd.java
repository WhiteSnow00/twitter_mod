import java.util.Objects;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nd extends xj1<Object>
{
    public final /* synthetic */ od b;
    
    public nd(final od b) {
        this.b = b;
    }
    
    public final void g() {
        final od b = this.b;
        synchronized (b) {
            ri4.w(((ob)b).isClosed());
        }
    }
    
    public final void h(final Throwable t) {
        final od b = this.b;
        if (((ob)b).i(t, (Map)b.h.getExtras())) {
            b.i.e((q0l)b.h, t);
        }
    }
    
    public final void i(final Object o, final int n) {
        final od b = this.b;
        final cnp h = b.h;
        final vi4 vi4 = (vi4)b;
        Objects.requireNonNull(vi4);
        final wi4 c = wi4.c((wi4)o);
        final boolean e = xj1.e(n);
        if (((ob)vi4).k((Object)c, e, (Map)h.getExtras()) && e) {
            ((od)vi4).i.f((q0l)((od)vi4).h);
        }
    }
    
    public final void j(final float n) {
        ((ob)this.b).j(n);
    }
}
