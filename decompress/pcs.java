import java.util.Iterator;
import bolts.ExecutorException;
import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pcs<TResult>
{
    public static final ExecutorService g;
    public static final a42$a h;
    public static final t30$a i;
    public static pcs<?> j;
    public static pcs<Boolean> k;
    public static pcs<Boolean> l;
    public final Object a;
    public boolean b;
    public boolean c;
    public TResult d;
    public Exception e;
    public List<np6<TResult, Void>> f;
    
    static {
        final a42 c = a42.c;
        g = c.a;
        h = c.b;
        i = t30.b.a;
        pcs.j = new pcs<Object>(null);
        pcs.k = new pcs<Boolean>(Boolean.TRUE);
        pcs.l = new pcs<Boolean>(Boolean.FALSE);
        new pcs(true);
    }
    
    public pcs() {
        this.a = new Object();
        this.f = new ArrayList();
    }
    
    public pcs(final TResult tResult) {
        this.a = new Object();
        this.f = new ArrayList();
        this.h(tResult);
    }
    
    public pcs(final boolean b) {
        this.a = new Object();
        this.f = new ArrayList();
        this.g();
    }
    
    public static <TResult> pcs<TResult> a(final Callable<TResult> callable, final Executor executor) {
        final sog sog = new sog(3);
        try {
            executor.execute((Runnable)new lcs(sog, (Callable)callable));
        }
        catch (final Exception ex) {
            sog.o((Exception)new ExecutorException(ex));
        }
        return (pcs)sog.F0;
    }
    
    public static <TResult> pcs<TResult> c(final Exception ex) {
        final sog sog = new sog(3);
        sog.o(ex);
        return (pcs)sog.F0;
    }
    
    public final <TContinuationResult> pcs<TContinuationResult> b(final np6<TResult, TContinuationResult> np6) {
        final a42$a h = pcs.h;
        final sog sog = new sog(3);
        Object a = this.a;
        synchronized (a) {
            Object o = this.a;
            synchronized (o) {
                final boolean b = this.b;
                monitorexit(o);
                if (!b) {
                    o = this.f;
                    ((ArrayList<jcs>)o).add(new jcs(sog, (np6)np6, (Executor)h));
                }
                monitorexit(a);
                if (b) {
                    try {
                        a = new kcs(sog, (np6)np6, this);
                        h.execute((Runnable)a);
                    }
                    catch (final Exception ex) {
                        sog.o((Exception)new ExecutorException(ex));
                    }
                }
                return (pcs)sog.F0;
            }
        }
    }
    
    public final Exception d() {
        synchronized (this.a) {
            return this.e;
        }
    }
    
    public final boolean e() {
        synchronized (this.a) {
            return this.d() != null;
        }
    }
    
    public final void f() {
        synchronized (this.a) {
            for (final np6 np6 : this.f) {
                try {
                    np6.a(this);
                    continue;
                }
                catch (final Exception ex) {
                    throw new RuntimeException(ex);
                }
                catch (final RuntimeException ex2) {
                    throw ex2;
                }
                break;
            }
            this.f = null;
        }
    }
    
    public final boolean g() {
        synchronized (this.a) {
            if (this.b) {
                return false;
            }
            this.b = true;
            this.c = true;
            this.a.notifyAll();
            this.f();
            return true;
        }
    }
    
    public final boolean h(final TResult d) {
        synchronized (this.a) {
            if (this.b) {
                return false;
            }
            this.b = true;
            this.d = d;
            this.a.notifyAll();
            this.f();
            return true;
        }
    }
}
