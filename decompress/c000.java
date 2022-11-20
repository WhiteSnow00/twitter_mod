import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.lang.ref.WeakReference;
import android.app.Activity;
import java.util.concurrent.Executor;
import com.google.android.gms.tasks.DuplicateTaskCompletionException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c000<TResult> extends ubs<TResult>
{
    public final Object a;
    public final hxz b;
    public boolean c;
    public volatile boolean d;
    public TResult e;
    public Exception f;
    
    public c000() {
        this.a = new Object();
        this.b = new hxz();
    }
    
    public final void A() {
        if (this.c) {
            final int d0 = DuplicateTaskCompletionException.D0;
            Object o;
            if (this.r()) {
                final Exception n = this.n();
                String concat;
                if (n != null) {
                    concat = "failure";
                }
                else if (this.s()) {
                    concat = "result ".concat(String.valueOf(this.o()));
                }
                else if (this.q()) {
                    concat = "cancellation";
                }
                else {
                    concat = "unknown issue";
                }
                String concat2;
                if (concat.length() != 0) {
                    concat2 = "Complete with: ".concat(concat);
                }
                else {
                    concat2 = new String("Complete with: ");
                }
                o = new DuplicateTaskCompletionException(concat2, (Throwable)n);
            }
            else {
                o = new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            throw o;
        }
    }
    
    public final void B() {
        synchronized (this.a) {
            if (!this.c) {
                return;
            }
            monitorexit(this.a);
            this.b.c((ubs)this);
        }
    }
    
    @Override
    public final ubs<TResult> a(final zgj zgj) {
        this.b((Executor)ics.a, zgj);
        return this;
    }
    
    @Override
    public final ubs<TResult> b(final Executor executor, final zgj zgj) {
        this.b.b((hwz)new abz(executor, zgj));
        this.B();
        return this;
    }
    
    @Override
    public final ubs<TResult> c(final ghj<TResult> ghj) {
        this.b.b((hwz)new khz((Executor)ics.a, (ghj)ghj));
        this.B();
        return this;
    }
    
    @Override
    public final ubs<TResult> d(final kij kij) {
        this.f((Executor)ics.a, kij);
        return this;
    }
    
    @Override
    public final ubs<TResult> e(final Activity activity, final kij kij) {
        final bnz bnz = new bnz((Executor)ics.a, kij);
        this.b.b((hwz)bnz);
        final szz j = szz.j(activity);
        synchronized (j.E0) {
            j.E0.add(new WeakReference(bnz));
            monitorexit(j.E0);
            this.B();
            return this;
        }
    }
    
    @Override
    public final ubs<TResult> f(final Executor executor, final kij kij) {
        this.b.b((hwz)new bnz(executor, kij));
        this.B();
        return this;
    }
    
    @Override
    public final ubs<TResult> g(final akj<? super TResult> akj) {
        this.i((Executor)ics.a, akj);
        return this;
    }
    
    @Override
    public final ubs<TResult> h(final Activity activity, final akj<? super TResult> akj) {
        final lsy lsy = new lsy((Executor)ics.a, (akj)akj);
        this.b.b((hwz)lsy);
        final szz j = szz.j(activity);
        synchronized (j.E0) {
            j.E0.add(new WeakReference(lsy));
            monitorexit(j.E0);
            this.B();
            return this;
        }
    }
    
    @Override
    public final ubs<TResult> i(final Executor executor, final akj<? super TResult> akj) {
        this.b.b((hwz)new lsy(executor, (akj)akj));
        this.B();
        return this;
    }
    
    @Override
    public final <TContinuationResult> ubs<TContinuationResult> j(final fo6<TResult, TContinuationResult> fo6) {
        return this.k((Executor)ics.a, fo6);
    }
    
    @Override
    public final <TContinuationResult> ubs<TContinuationResult> k(final Executor executor, final fo6<TResult, TContinuationResult> fo6) {
        final c000 c000 = new c000();
        this.b.b((hwz)new lsy(executor, (fo6)fo6, c000));
        this.B();
        return c000;
    }
    
    @Override
    public final <TContinuationResult> ubs<TContinuationResult> l(final fo6<TResult, ubs<TContinuationResult>> fo6) {
        return this.m((Executor)ics.a, fo6);
    }
    
    @Override
    public final <TContinuationResult> ubs<TContinuationResult> m(final Executor executor, final fo6<TResult, ubs<TContinuationResult>> fo6) {
        final c000 c000 = new c000();
        this.b.b((hwz)new y1z(executor, (Object)fo6, c000, 0));
        this.B();
        return c000;
    }
    
    @Override
    public final Exception n() {
        synchronized (this.a) {
            return this.f;
        }
    }
    
    @Override
    public final TResult o() {
        synchronized (this.a) {
            eli.t(this.c, "Task is not yet complete");
            if (this.d) {
                throw new CancellationException("Task is already canceled.");
            }
            final Exception f = this.f;
            if (f == null) {
                return this.e;
            }
            throw new RuntimeExecutionException((Throwable)f);
        }
    }
    
    @Override
    public final <X extends Throwable> TResult p(final Class<X> clazz) throws X, Throwable {
        synchronized (this.a) {
            eli.t(this.c, "Task is not yet complete");
            if (this.d) {
                throw new CancellationException("Task is already canceled.");
            }
            if (clazz.isInstance(this.f)) {
                throw (Throwable)clazz.cast(this.f);
            }
            final Exception f = this.f;
            if (f == null) {
                return this.e;
            }
            throw new RuntimeExecutionException((Throwable)f);
        }
    }
    
    @Override
    public final boolean q() {
        return this.d;
    }
    
    @Override
    public final boolean r() {
        synchronized (this.a) {
            return this.c;
        }
    }
    
    @Override
    public final boolean s() {
        synchronized (this.a) {
            final boolean c = this.c;
            boolean b2;
            final boolean b = b2 = false;
            if (c) {
                b2 = b;
                if (!this.d) {
                    b2 = b;
                    if (this.f == null) {
                        b2 = true;
                    }
                }
            }
            return b2;
        }
    }
    
    @Override
    public final <TContinuationResult> ubs<TContinuationResult> t(final str<TResult, TContinuationResult> str) {
        final izz a = ics.a;
        final c000 c000 = new c000();
        this.b.b((hwz)new y1z((Executor)a, (Object)str, c000, 1));
        this.B();
        return c000;
    }
    
    @Override
    public final <TContinuationResult> ubs<TContinuationResult> u(final Executor executor, final str<TResult, TContinuationResult> str) {
        final c000 c000 = new c000();
        this.b.b((hwz)new y1z(executor, (Object)str, c000, 1));
        this.B();
        return c000;
    }
    
    public final ubs<TResult> v(final Executor executor, final ghj<TResult> ghj) {
        this.b.b((hwz)new khz(executor, (ghj)ghj));
        this.B();
        return this;
    }
    
    public final void w(final Exception f) {
        eli.r(f, "Exception must not be null");
        synchronized (this.a) {
            this.A();
            this.c = true;
            this.f = f;
            monitorexit(this.a);
            this.b.c((ubs)this);
        }
    }
    
    public final void x(final TResult e) {
        synchronized (this.a) {
            this.A();
            this.c = true;
            this.e = e;
            monitorexit(this.a);
            this.b.c((ubs)this);
        }
    }
    
    public final boolean y() {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.d = true;
            monitorexit(this.a);
            this.b.c((ubs)this);
            return true;
        }
    }
    
    public final boolean z(final TResult e) {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.e = e;
            monitorexit(this.a);
            this.b.c((ubs)this);
            return true;
        }
    }
}
