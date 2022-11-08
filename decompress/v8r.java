import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class v8r<T> implements Runnable
{
    public final AtomicInteger C0;
    public final dk6<T> D0;
    public final u0l E0;
    public final String F0;
    public final q0l G0;
    
    public v8r(final dk6<T> d0, final u0l e0, final q0l g0, final String f0) {
        this.C0 = new AtomicInteger(0);
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        e0.k(this.G0 = g0, f0);
    }
    
    public final void a() {
        if (this.C0.compareAndSet(0, 2)) {
            this.e();
        }
    }
    
    public abstract void b(final Object p0);
    
    public Map<String, String> c(final T t) {
        return null;
    }
    
    public abstract Object d() throws Exception;
    
    public void e() {
        final u0l e0 = this.E0;
        final q0l g0 = this.G0;
        final String f0 = this.F0;
        e0.j(g0, f0);
        e0.g(g0, f0);
        this.D0.a();
    }
    
    public void f(final Exception ex) {
        final u0l e0 = this.E0;
        final q0l g0 = this.G0;
        final String f0 = this.F0;
        e0.j(g0, f0);
        e0.h(g0, f0, (Throwable)ex, (Map)null);
        this.D0.d((Throwable)ex);
    }
    
    public void g(final T t) {
        final u0l e0 = this.E0;
        final q0l g0 = this.G0;
        final String f0 = this.F0;
        Map<String, String> c;
        if (e0.j(g0, f0)) {
            c = this.c(t);
        }
        else {
            c = null;
        }
        e0.a(g0, f0, (Map)c);
        this.D0.c((Object)t, 1);
    }
    
    @Override
    public final void run() {
        if (this.C0.compareAndSet(0, 1)) {
            try {
                final Object d = this.d();
                this.C0.set(3);
                try {
                    this.g((T)d);
                }
                finally {
                    this.b(d);
                }
            }
            catch (final Exception ex) {
                this.C0.set(4);
                this.f(ex);
            }
        }
    }
}
