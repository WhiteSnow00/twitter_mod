import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.lang.ref.WeakReference;
import android.app.Activity;
import java.util.concurrent.Executor;
import com.google.android.gms.tasks.DuplicateTaskCompletionException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c100<TResult> extends mcs<TResult>
{
    public final Object a;
    public final gyz b;
    public boolean c;
    public volatile boolean d;
    public TResult e;
    public Exception f;
    
    public c100() {
        this.a = new Object();
        this.b = new gyz();
    }
    
    public final void A() {
        if (this.c) {
            final int f0 = DuplicateTaskCompletionException.F0;
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
            this.b.b((mcs)this);
        }
    }
    
    public final mcs<TResult> a(final nhj nhj) {
        this.b((Executor)ads.a, nhj);
        return this;
    }
    
    public final mcs<TResult> b(final Executor executor, final nhj nhj) {
        this.b.a((gxz)new zbz(executor, nhj));
        this.B();
        return this;
    }
    
    public final mcs<TResult> c(final uhj<TResult> uhj) {
        this.b.a((gxz)new jiz((Executor)ads.a, (uhj)uhj));
        this.B();
        return this;
    }
    
    public final mcs<TResult> d(final yij yij) {
        this.f((Executor)ads.a, yij);
        return this;
    }
    
    public final mcs<TResult> e(final Activity activity, final yij yij) {
        final boz boz = new boz((Executor)ads.a, yij);
        this.b.a((gxz)boz);
        final s000 j = s000.j(activity);
        synchronized (j.G0) {
            j.G0.add(new WeakReference(boz));
            monitorexit(j.G0);
            this.B();
            return this;
        }
    }
    
    public final mcs<TResult> f(final Executor executor, final yij yij) {
        this.b.a((gxz)new boz(executor, yij));
        this.B();
        return this;
    }
    
    public final mcs<TResult> g(final okj<? super TResult> okj) {
        this.i((Executor)ads.a, okj);
        return this;
    }
    
    public final mcs<TResult> h(final Activity activity, final okj<? super TResult> okj) {
        final ity ity = new ity((Executor)ads.a, (okj)okj);
        this.b.a((gxz)ity);
        final s000 j = s000.j(activity);
        synchronized (j.G0) {
            j.G0.add(new WeakReference(ity));
            monitorexit(j.G0);
            this.B();
            return this;
        }
    }
    
    public final mcs<TResult> i(final Executor executor, final okj<? super TResult> okj) {
        this.b.a((gxz)new ity(executor, (okj)okj));
        this.B();
        return this;
    }
    
    public final <TContinuationResult> mcs<TContinuationResult> j(final lp6<TResult, TContinuationResult> lp6) {
        return this.k((Executor)ads.a, lp6);
    }
    
    public final <TContinuationResult> mcs<TContinuationResult> k(final Executor executor, final lp6<TResult, TContinuationResult> lp6) {
        final c100 c100 = new c100();
        this.b.a((gxz)new ity(executor, (lp6)lp6, c100));
        this.B();
        return c100;
    }
    
    public final <TContinuationResult> mcs<TContinuationResult> l(final lp6<TResult, mcs<TContinuationResult>> lp6) {
        return this.m((Executor)ads.a, lp6);
    }
    
    public final <TContinuationResult> mcs<TContinuationResult> m(final Executor executor, final lp6<TResult, mcs<TContinuationResult>> lp6) {
        final c100 c100 = new c100();
        this.b.a((gxz)new w2z(executor, (Object)lp6, c100, 0));
        this.B();
        return c100;
    }
    
    public final Exception n() {
        synchronized (this.a) {
            return this.f;
        }
    }
    
    public final TResult o() {
        synchronized (this.a) {
            iuk.H(this.c, (Object)"Task is not yet complete");
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
    
    public final <X extends Throwable> TResult p(final Class<X> clazz) throws X, Throwable {
        synchronized (this.a) {
            iuk.H(this.c, (Object)"Task is not yet complete");
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
    
    public final boolean q() {
        return this.d;
    }
    
    public final boolean r() {
        synchronized (this.a) {
            return this.c;
        }
    }
    
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
    
    public final <TContinuationResult> mcs<TContinuationResult> t(final qur<TResult, TContinuationResult> qur) {
        final i000 a = ads.a;
        final c100 c100 = new c100();
        this.b.a((gxz)new w2z((Executor)a, (Object)qur, c100, 1));
        this.B();
        return c100;
    }
    
    public final <TContinuationResult> mcs<TContinuationResult> u(final Executor executor, final qur<TResult, TContinuationResult> qur) {
        final c100 c100 = new c100();
        this.b.a((gxz)new w2z(executor, (Object)qur, c100, 1));
        this.B();
        return c100;
    }
    
    public final mcs<TResult> v(final Executor executor, final uhj<TResult> uhj) {
        this.b.a((gxz)new jiz(executor, (uhj)uhj));
        this.B();
        return this;
    }
    
    public final void w(final Exception f) {
        iuk.D((Object)f, (Object)"Exception must not be null");
        synchronized (this.a) {
            this.A();
            this.c = true;
            this.f = f;
            monitorexit(this.a);
            this.b.b((mcs)this);
        }
    }
    
    public final void x(final TResult e) {
        synchronized (this.a) {
            this.A();
            this.c = true;
            this.e = e;
            monitorexit(this.a);
            this.b.b((mcs)this);
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
            this.b.b((mcs)this);
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
            this.b.b((mcs)this);
            return true;
        }
    }
}
