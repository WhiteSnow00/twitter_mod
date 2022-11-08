import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import java.util.Set;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wh8 implements fjc, gjc
{
    public final rll<hjc> a;
    public final Context b;
    public final rll<h8w> c;
    public final Set<ejc> d;
    public final Executor e;
    
    public wh8(final Context b, final String s, final Set<ejc> d, final rll<h8w> c) {
        final sh8 a = new sh8(b, s);
        final ThreadPoolExecutor e = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), (ThreadFactory)vh8.C0);
        this.a = (rll<hjc>)a;
        this.d = d;
        this.e = e;
        this.c = c;
        this.b = b;
    }
    
    public final int a() {
        synchronized (this) {
            final long currentTimeMillis = System.currentTimeMillis();
            final hjc hjc = (hjc)this.a.get();
            synchronized (hjc) {
                final boolean g = hjc.g(currentTimeMillis);
                monitorexit(hjc);
                if (g) {
                    synchronized (hjc) {
                        final String d = hjc.d(System.currentTimeMillis());
                        hjc.a.edit().putString("last-used-date", d).commit();
                        hjc.f(d);
                        return 3;
                    }
                }
                return 1;
            }
        }
    }
    
    @Override
    public final zas<String> b() {
        if (hew.a(this.b) ^ true) {
            return (zas<String>)zbs.e((Object)"");
        }
        return (zas<String>)zbs.c(this.e, (Callable)new uh8((Object)this, 0));
    }
    
    public final zas<Void> c() {
        if (this.d.size() <= 0) {
            return (zas<Void>)zbs.e((Object)null);
        }
        if (hew.a(this.b) ^ true) {
            return (zas<Void>)zbs.e((Object)null);
        }
        return (zas<Void>)zbs.c(this.e, (Callable)new th8((Object)this, 0));
    }
}
