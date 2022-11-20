import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class q9r<T> implements Runnable
{
    public final AtomicInteger D0;
    public final jj6<T> E0;
    public final d1l F0;
    public final String G0;
    public final z0l H0;
    
    public q9r(final jj6<T> e0, final d1l f0, final z0l h0, final String g0) {
        this.D0 = new AtomicInteger(0);
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        f0.k(this.H0 = h0, g0);
    }
    
    public final void a() {
        if (this.D0.compareAndSet(0, 2)) {
            this.e();
        }
    }
    
    public abstract void b(final Object p0);
    
    public Map<String, String> c(final T t) {
        return null;
    }
    
    public abstract Object d() throws Exception;
    
    public void e() {
        final d1l f0 = this.F0;
        final z0l h0 = this.H0;
        final String g0 = this.G0;
        f0.j(h0, g0);
        f0.g(h0, g0);
        this.E0.a();
    }
    
    public void f(final Exception ex) {
        final d1l f0 = this.F0;
        final z0l h0 = this.H0;
        final String g0 = this.G0;
        f0.j(h0, g0);
        f0.h(h0, g0, (Throwable)ex, (Map)null);
        this.E0.d(ex);
    }
    
    public void g(final T t) {
        final d1l f0 = this.F0;
        final z0l h0 = this.H0;
        final String g0 = this.G0;
        Map<String, String> c;
        if (f0.j(h0, g0)) {
            c = this.c(t);
        }
        else {
            c = null;
        }
        f0.a(h0, g0, (Map)c);
        this.E0.c(t, 1);
    }
    
    @Override
    public final void run() {
        if (this.D0.compareAndSet(0, 1)) {
            try {
                final Object d = this.d();
                this.D0.set(3);
                try {
                    this.g((T)d);
                }
                finally {
                    this.b(d);
                }
            }
            catch (final Exception ex) {
                this.D0.set(4);
                this.f(ex);
            }
        }
    }
}
