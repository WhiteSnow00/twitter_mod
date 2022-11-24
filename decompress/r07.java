import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r07
{
    public final Executor a;
    public mcs<Void> b;
    public final Object c;
    public final ThreadLocal<Boolean> d;
    
    public r07(final Executor a) {
        this.b = (mcs<Void>)mds.e((Object)null);
        this.c = new Object();
        this.d = new ThreadLocal<Boolean>();
        (this.a = a).execute(new Runnable(this) {
            public final r07 F0;
            
            @Override
            public final void run() {
                this.F0.d.set(Boolean.TRUE);
            }
        });
    }
    
    public final void a() {
        if (Boolean.TRUE.equals(this.d.get())) {
            return;
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }
    
    public final <T> mcs<T> b(final Callable<T> callable) {
        synchronized (this.c) {
            final mcs k = this.b.k(this.a, (lp6)new t07(callable));
            this.b = (mcs<Void>)k.k(this.a, (lp6)new egz());
            return (mcs<T>)k;
        }
    }
    
    public final <T> mcs<T> c(final Callable<mcs<T>> callable) {
        synchronized (this.c) {
            final mcs m = this.b.m(this.a, (lp6)new t07(callable));
            this.b = (mcs<Void>)m.k(this.a, (lp6)new egz());
            return (mcs<T>)m;
        }
    }
}
