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

public final class eh8 implements fic, gic
{
    public static final int f = 0;
    public final eml<hic> a;
    public final Context b;
    public final eml<q8w> c;
    public final Set<eic> d;
    public final Executor e;
    
    public eh8(final Context b, final String s, final Set<eic> d, final eml<q8w> c) {
        final ah8 a = new ah8(b, s);
        final ThreadPoolExecutor e = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), (ThreadFactory)dh8.D0);
        this.a = (eml<hic>)a;
        this.d = d;
        this.e = e;
        this.c = c;
        this.b = b;
    }
    
    public final int a() {
        synchronized (this) {
            final long currentTimeMillis = System.currentTimeMillis();
            final hic hic = this.a.get();
            synchronized (hic) {
                final boolean g = hic.g(currentTimeMillis);
                monitorexit(hic);
                if (g) {
                    synchronized (hic) {
                        final String d = hic.d(System.currentTimeMillis());
                        hic.a.edit().putString("last-used-date", d).commit();
                        hic.f(d);
                        return 3;
                    }
                }
                return 1;
            }
        }
    }
    
    @Override
    public final ubs<String> b() {
        if (vew.a(this.b) ^ true) {
            return ucs.e("");
        }
        return ucs.c(this.e, (Callable<String>)new ch8((Object)this, 0));
    }
    
    public final ubs<Void> c() {
        if (this.d.size() <= 0) {
            return ucs.e((Void)null);
        }
        if (vew.a(this.b) ^ true) {
            return ucs.e((Void)null);
        }
        return ucs.c(this.e, (Callable<Void>)new bh8((Object)this, 0));
    }
}
