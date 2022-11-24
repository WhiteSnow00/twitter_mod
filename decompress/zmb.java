import java.util.Map;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zmb implements xpm
{
    public final List<xpm> a;
    
    public zmb(final Set<xpm> set) {
        this.a = new ArrayList(set.size());
        for (final xpm xpm : set) {
            if (xpm != null) {
                this.a.add(xpm);
            }
        }
    }
    
    public final void a(final n1l n1l, final String s, final Map<String, String> map) {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            final xpm xpm = this.a.get(i);
            try {
                ((r1l)xpm).a(n1l, s, map);
            }
            catch (final Exception ex) {
                this.l("InternalListener exception in onProducerFinishWithSuccess", ex);
            }
        }
    }
    
    public final void b(final n1l n1l) {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            final xpm xpm = this.a.get(i);
            try {
                ((r1l)xpm).b(n1l);
            }
            catch (final Exception ex) {
                this.l("InternalListener exception in onIntermediateChunkStart", ex);
            }
        }
    }
    
    public final void c(final n1l n1l) {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            final xpm xpm = this.a.get(i);
            try {
                xpm.c(n1l);
            }
            catch (final Exception ex) {
                this.l("InternalListener exception in onRequestStart", ex);
            }
        }
    }
    
    public final void d(final n1l n1l, final String s, final boolean b) {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            final xpm xpm = this.a.get(i);
            try {
                ((r1l)xpm).d(n1l, s, b);
            }
            catch (final Exception ex) {
                this.l("InternalListener exception in onProducerFinishWithSuccess", ex);
            }
        }
    }
    
    public final void e(final n1l n1l, final Throwable t) {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            final xpm xpm = this.a.get(i);
            try {
                xpm.e(n1l, t);
            }
            catch (final Exception ex) {
                this.l("InternalListener exception in onRequestFailure", ex);
            }
        }
    }
    
    public final void f(final n1l n1l) {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            final xpm xpm = this.a.get(i);
            try {
                xpm.f(n1l);
            }
            catch (final Exception ex) {
                this.l("InternalListener exception in onRequestSuccess", ex);
            }
        }
    }
    
    public final void g(final n1l n1l, final String s, Map<String, String> i) {
        int size;
        xpm xpm;
        for (size = this.a.size(), i = 0; i < size; ++i) {
            xpm = this.a.get(i);
            try {
                ((r1l)xpm).g(n1l, s);
            }
            catch (final Exception ex) {
                this.l("InternalListener exception in onProducerFinishWithCancellation", ex);
            }
        }
    }
    
    public final void h(final n1l n1l, final String s, final Throwable t, final Map<String, String> map) {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            final xpm xpm = this.a.get(i);
            try {
                ((r1l)xpm).h(n1l, s, t, map);
            }
            catch (final Exception ex) {
                this.l("InternalListener exception in onProducerFinishWithFailure", ex);
            }
        }
    }
    
    public final void i(final n1l n1l) {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            final xpm xpm = this.a.get(i);
            try {
                xpm.i(n1l);
            }
            catch (final Exception ex) {
                this.l("InternalListener exception in onRequestCancellation", ex);
            }
        }
    }
    
    public final boolean j(final n1l n1l, final String s) {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            if (((r1l)this.a.get(i)).j(n1l, s)) {
                return true;
            }
        }
        return false;
    }
    
    public final void k(final n1l n1l, final String s) {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            final xpm xpm = this.a.get(i);
            try {
                ((r1l)xpm).k(n1l, s);
            }
            catch (final Exception ex) {
                this.l("InternalListener exception in onProducerStart", ex);
            }
        }
    }
    
    public final void l(final String s, final Throwable t) {
        fr0.r("ForwardingRequestListener2", s, t);
    }
}
