import java.util.Map;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ylb implements jpm
{
    public final List<jpm> a;
    
    public ylb(final Set<jpm> set) {
        this.a = new ArrayList(set.size());
        for (final jpm jpm : set) {
            if (jpm != null) {
                this.a.add(jpm);
            }
        }
    }
    
    public final void a(final z0l z0l, final String s, final Map<String, String> map) {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            final jpm jpm = this.a.get(i);
            try {
                ((d1l)jpm).a(z0l, s, (Map)map);
            }
            catch (final Exception ex) {
                this.l("InternalListener exception in onProducerFinishWithSuccess", ex);
            }
        }
    }
    
    public final void b(final z0l z0l) {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            final jpm jpm = this.a.get(i);
            try {
                ((d1l)jpm).b(z0l);
            }
            catch (final Exception ex) {
                this.l("InternalListener exception in onIntermediateChunkStart", ex);
            }
        }
    }
    
    public final void c(final z0l z0l) {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            final jpm jpm = this.a.get(i);
            try {
                jpm.c(z0l);
            }
            catch (final Exception ex) {
                this.l("InternalListener exception in onRequestStart", ex);
            }
        }
    }
    
    public final void d(final z0l z0l, final String s, final boolean b) {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            final jpm jpm = this.a.get(i);
            try {
                ((d1l)jpm).d(z0l, s, b);
            }
            catch (final Exception ex) {
                this.l("InternalListener exception in onProducerFinishWithSuccess", ex);
            }
        }
    }
    
    public final void e(final z0l z0l, final Throwable t) {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            final jpm jpm = this.a.get(i);
            try {
                jpm.e(z0l, t);
            }
            catch (final Exception ex) {
                this.l("InternalListener exception in onRequestFailure", ex);
            }
        }
    }
    
    public final void f(final z0l z0l) {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            final jpm jpm = this.a.get(i);
            try {
                jpm.f(z0l);
            }
            catch (final Exception ex) {
                this.l("InternalListener exception in onRequestSuccess", ex);
            }
        }
    }
    
    public final void g(final z0l z0l, final String s, Map<String, String> i) {
        int size;
        jpm jpm;
        for (size = this.a.size(), i = 0; i < size; ++i) {
            jpm = this.a.get(i);
            try {
                ((d1l)jpm).g(z0l, s);
            }
            catch (final Exception ex) {
                this.l("InternalListener exception in onProducerFinishWithCancellation", ex);
            }
        }
    }
    
    public final void h(final z0l z0l, final String s, final Throwable t, final Map<String, String> map) {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            final jpm jpm = this.a.get(i);
            try {
                ((d1l)jpm).h(z0l, s, t, (Map)map);
            }
            catch (final Exception ex) {
                this.l("InternalListener exception in onProducerFinishWithFailure", ex);
            }
        }
    }
    
    public final void i(final z0l z0l) {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            final jpm jpm = this.a.get(i);
            try {
                jpm.i(z0l);
            }
            catch (final Exception ex) {
                this.l("InternalListener exception in onRequestCancellation", ex);
            }
        }
    }
    
    public final boolean j(final z0l z0l, final String s) {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            if (((d1l)this.a.get(i)).j(z0l, s)) {
                return true;
            }
        }
        return false;
    }
    
    public final void k(final z0l z0l, final String s) {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            final jpm jpm = this.a.get(i);
            try {
                ((d1l)jpm).k(z0l, s);
            }
            catch (final Exception ex) {
                this.l("InternalListener exception in onProducerStart", ex);
            }
        }
    }
    
    public final void l(final String s, final Throwable t) {
        xli.J("ForwardingRequestListener2", s, t);
    }
}
