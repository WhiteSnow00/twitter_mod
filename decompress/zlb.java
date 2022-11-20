import java.util.Map;
import com.facebook.imagepipeline.request.a;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zlb implements kpm
{
    public final List<kpm> a;
    
    public zlb(final Set<kpm> set) {
        this.a = new ArrayList(set.size());
        for (final kpm kpm : set) {
            if (kpm != null) {
                this.a.add(kpm);
            }
        }
    }
    
    public zlb(final kpm... array) {
        this.a = new ArrayList(array.length);
        for (final kpm kpm : array) {
            if (kpm != null) {
                this.a.add(kpm);
            }
        }
    }
    
    public final void a(final a a, final Object o, final String s, final boolean b) {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            final kpm kpm = this.a.get(i);
            try {
                kpm.a(a, o, s, b);
            }
            catch (final Exception ex) {
                this.l("InternalListener exception in onRequestStart", ex);
            }
        }
    }
    
    public final void b(final String s, final String s2) {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            final kpm kpm = this.a.get(i);
            try {
                ((e1l)kpm).b(s, s2);
            }
            catch (final Exception ex) {
                this.l("InternalListener exception in onProducerStart", ex);
            }
        }
    }
    
    public final void c(final a a, final String s, final boolean b) {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            final kpm kpm = this.a.get(i);
            try {
                kpm.c(a, s, b);
            }
            catch (final Exception ex) {
                this.l("InternalListener exception in onRequestSuccess", ex);
            }
        }
    }
    
    public final boolean d(final String s) {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            if (((e1l)this.a.get(i)).d(s)) {
                return true;
            }
        }
        return false;
    }
    
    public final void e(final String s, final String s2, final Map<String, String> map) {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            final kpm kpm = this.a.get(i);
            try {
                ((e1l)kpm).e(s, s2, (Map)map);
            }
            catch (final Exception ex) {
                this.l("InternalListener exception in onProducerFinishWithSuccess", ex);
            }
        }
    }
    
    public final void f(final String s, final String s2, final Throwable t, final Map<String, String> map) {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            final kpm kpm = this.a.get(i);
            try {
                ((e1l)kpm).f(s, s2, t, (Map)map);
            }
            catch (final Exception ex) {
                this.l("InternalListener exception in onProducerFinishWithFailure", ex);
            }
        }
    }
    
    public final void g(final String s, final String s2, Map<String, String> i) {
        int size;
        kpm kpm;
        for (size = this.a.size(), i = 0; i < size; ++i) {
            kpm = this.a.get(i);
            try {
                ((e1l)kpm).g(s, s2);
            }
            catch (final Exception ex) {
                this.l("InternalListener exception in onProducerFinishWithCancellation", ex);
            }
        }
    }
    
    public final void h(final String s, final String s2, final boolean b) {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            final kpm kpm = this.a.get(i);
            try {
                ((e1l)kpm).h(s, s2, b);
            }
            catch (final Exception ex) {
                this.l("InternalListener exception in onProducerFinishWithSuccess", ex);
            }
        }
    }
    
    public final void i(final String s) {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            final kpm kpm = this.a.get(i);
            try {
                ((e1l)kpm).i(s);
            }
            catch (final Exception ex) {
                this.l("InternalListener exception in onIntermediateChunkStart", ex);
            }
        }
    }
    
    public final void j(final a a, final String s, final Throwable t, final boolean b) {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            final kpm kpm = this.a.get(i);
            try {
                kpm.j(a, s, t, b);
            }
            catch (final Exception ex) {
                this.l("InternalListener exception in onRequestFailure", ex);
            }
        }
    }
    
    public final void k(final String s) {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            final kpm kpm = this.a.get(i);
            try {
                kpm.k(s);
            }
            catch (final Exception ex) {
                this.l("InternalListener exception in onRequestCancellation", ex);
            }
        }
    }
    
    public final void l(final String s, final Throwable t) {
        xli.J("ForwardingRequestListener", s, t);
    }
}
