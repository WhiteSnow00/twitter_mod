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

public final class ki8 implements hjc, ijc
{
    public static final int f = 0;
    public final qml<jjc> a;
    public final Context b;
    public final qml<f9w> c;
    public final Set<gjc> d;
    public final Executor e;
    
    public ki8(final Context b, final String s, final Set<gjc> d, final qml<f9w> c) {
        final gi8 a = new gi8(b, s);
        final ThreadPoolExecutor e = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), (ThreadFactory)ji8.F0);
        this.a = (qml<jjc>)a;
        this.d = d;
        this.e = e;
        this.c = c;
        this.b = b;
    }
    
    public final int a() {
        synchronized (this) {
            final long currentTimeMillis = System.currentTimeMillis();
            final jjc jjc = (jjc)this.a.get();
            synchronized (jjc) {
                final boolean g = jjc.g(currentTimeMillis);
                monitorexit(jjc);
                if (g) {
                    synchronized (jjc) {
                        final String d = jjc.d(System.currentTimeMillis());
                        jjc.a.edit().putString("last-used-date", d).commit();
                        jjc.f(d);
                        return 3;
                    }
                }
                return 1;
            }
        }
    }
    
    public final mcs<String> b() {
        if (lfw.a(this.b) ^ true) {
            return (mcs<String>)mds.e((Object)"");
        }
        return (mcs<String>)mds.c(this.e, (Callable)new ii8((Object)this, 0));
    }
    
    public final mcs<Void> c() {
        if (this.d.size() <= 0) {
            return (mcs<Void>)mds.e((Object)null);
        }
        if (lfw.a(this.b) ^ true) {
            return (mcs<Void>)mds.e((Object)null);
        }
        return (mcs<Void>)mds.c(this.e, (Callable)new hi8((Object)this, 0));
    }
}
