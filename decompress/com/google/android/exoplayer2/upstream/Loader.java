// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.upstream;

import android.os.Message;
import java.util.Objects;
import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Looper;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

public final class Loader
{
    public static final b d;
    public static final b e;
    public static final b f;
    public final ExecutorService a;
    public c<? extends d> b;
    public IOException c;
    
    static {
        d = new b(0, -9223372036854775807L);
        e = new b(2, -9223372036854775807L);
        f = new b(3, -9223372036854775807L);
    }
    
    public Loader(String concat) {
        if (concat.length() != 0) {
            concat = "ExoPlayer:Loader:".concat(concat);
        }
        else {
            concat = new String("ExoPlayer:Loader:");
        }
        final int a = cnw.a;
        this.a = Executors.newSingleThreadExecutor((ThreadFactory)new xmw(concat));
    }
    
    public final void a() {
        final c<? extends d> b = this.b;
        omy.m((Object)b);
        final c<? extends d> c = b;
        b.a(false);
    }
    
    public final boolean b() {
        return this.c != null;
    }
    
    public final boolean c() {
        return this.b != null;
    }
    
    public final void d() throws IOException {
        this.e(Integer.MIN_VALUE);
    }
    
    public final void e(final int n) throws IOException {
        final IOException c = this.c;
        if (c == null) {
            final c<? extends d> b = this.b;
            if (b != null) {
                int d0;
                if ((d0 = n) == Integer.MIN_VALUE) {
                    d0 = b.D0;
                }
                final IOException h0 = b.H0;
                if (h0 != null) {
                    if (b.I0 > d0) {
                        throw h0;
                    }
                }
            }
            return;
        }
        throw c;
    }
    
    public final void f(final e e) {
        final c<? extends d> b = this.b;
        if (b != null) {
            b.a(true);
        }
        if (e != null) {
            this.a.execute(new f(e));
        }
        this.a.shutdown();
    }
    
    public final <T extends d> long g(final T t, final a<T> a, final int n) {
        final Looper myLooper = Looper.myLooper();
        omy.m((Object)myLooper);
        this.c = null;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        new c(myLooper, (d)t, (a<d>)a, n, elapsedRealtime).b(0L);
        return elapsedRealtime;
    }
    
    public static final class UnexpectedLoaderException extends IOException
    {
        public UnexpectedLoaderException(final Throwable t) {
            final String simpleName = t.getClass().getSimpleName();
            final String message = t.getMessage();
            final StringBuilder sb = new StringBuilder(wnj.f(message, simpleName.length() + 13));
            sb.append("Unexpected ");
            sb.append(simpleName);
            sb.append(": ");
            sb.append(message);
            super(sb.toString(), t);
        }
    }
    
    public interface a<T extends d>
    {
        void a(final T p0, final long p1, final long p2, final boolean p3);
        
        void e(final T p0, final long p1, final long p2);
        
        b i(final T p0, final long p1, final long p2, final IOException p3, final int p4);
    }
    
    public static final class b
    {
        public final int a;
        public final long b;
        
        public b(final int a, final long b) {
            this.a = a;
            this.b = b;
        }
        
        public final boolean a() {
            final int a = this.a;
            boolean b = true;
            if (a != 0) {
                b = (a == 1 && b);
            }
            return b;
        }
    }
    
    @SuppressLint({ "HandlerLeak" })
    public final class c<T extends d> extends Handler implements Runnable
    {
        public final int D0;
        public final T E0;
        public final long F0;
        public a<T> G0;
        public IOException H0;
        public int I0;
        public Thread J0;
        public boolean K0;
        public volatile boolean L0;
        public final Loader M0;
        
        public c(final Loader m0, final Looper looper, final T e0, final a<T> g0, final int d0, final long f0) {
            this.M0 = m0;
            super(looper);
            this.E0 = e0;
            this.G0 = g0;
            this.D0 = d0;
            this.F0 = f0;
        }
        
        public final void a(final boolean l0) {
            this.L0 = l0;
            this.H0 = null;
            Label_0075: {
                if (this.hasMessages(0)) {
                    this.K0 = true;
                    this.removeMessages(0);
                    if (!l0) {
                        this.sendEmptyMessage(1);
                        break Label_0075;
                    }
                    break Label_0075;
                }
                synchronized (this) {
                    this.K0 = true;
                    this.E0.a();
                    final Thread j0 = this.J0;
                    if (j0 != null) {
                        j0.interrupt();
                    }
                    monitorexit(this);
                    if (l0) {
                        this.M0.b = null;
                        final long elapsedRealtime = SystemClock.elapsedRealtime();
                        final a<T> g0 = this.G0;
                        Objects.requireNonNull((a)g0);
                        g0.a(this.E0, elapsedRealtime, elapsedRealtime - this.F0, true);
                        this.G0 = null;
                    }
                }
            }
        }
        
        public final void b(final long n) {
            omy.k(this.M0.b == null);
            final Loader m0 = this.M0;
            m0.b = (c<? extends d>)this;
            if (n > 0L) {
                this.sendEmptyMessageDelayed(0, n);
            }
            else {
                this.H0 = null;
                final ExecutorService a = m0.a;
                Objects.requireNonNull(this);
                a.execute(this);
            }
        }
        
        public final void handleMessage(final Message message) {
            if (this.L0) {
                return;
            }
            final int what = message.what;
            if (what == 0) {
                this.H0 = null;
                final Loader m0 = this.M0;
                final ExecutorService a = m0.a;
                final c<? extends d> b = m0.b;
                Objects.requireNonNull(b);
                a.execute(b);
                return;
            }
            if (what == 3) {
                throw (Error)message.obj;
            }
            this.M0.b = null;
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            final long n = elapsedRealtime - this.F0;
            final a<T> g0 = this.G0;
            Objects.requireNonNull((a)g0);
            if (this.K0) {
                g0.a(this.E0, elapsedRealtime, n, false);
                return;
            }
            final int what2 = message.what;
            if (what2 != 1) {
                if (what2 == 2) {
                    final IOException h0 = (IOException)message.obj;
                    this.H0 = h0;
                    final int i0 = this.I0 + 1;
                    this.I0 = i0;
                    final b j = g0.i(this.E0, elapsedRealtime, n, h0, i0);
                    final int a2 = j.a;
                    if (a2 == 3) {
                        this.M0.c = this.H0;
                    }
                    else if (a2 != 2) {
                        if (a2 == 1) {
                            this.I0 = 1;
                        }
                        long b2 = j.b;
                        if (b2 == -9223372036854775807L) {
                            b2 = Math.min((this.I0 - 1) * 1000, 5000);
                        }
                        this.b(b2);
                    }
                }
            }
            else {
                try {
                    g0.e(this.E0, elapsedRealtime, n);
                }
                catch (final RuntimeException ex) {
                    g63.s("LoadTask", "Unexpected exception handling load completed", (Throwable)ex);
                    this.M0.c = new UnexpectedLoaderException(ex);
                }
            }
        }
        
        public final void run() {
            try {
                synchronized (this) {
                    final boolean b = !this.K0;
                    this.J0 = Thread.currentThread();
                    monitorexit(this);
                    if (b) {
                        final String simpleName = this.E0.getClass().getSimpleName();
                        String concat;
                        if (simpleName.length() != 0) {
                            concat = "load:".concat(simpleName);
                        }
                        else {
                            concat = new String("load:");
                        }
                        blz.e(concat);
                        try {
                            this.E0.b();
                        }
                        finally {
                            blz.o();
                        }
                    }
                    synchronized (this) {
                        this.J0 = null;
                        Thread.interrupted();
                        monitorexit(this);
                        if (!this.L0) {
                            this.sendEmptyMessage(1);
                        }
                    }
                }
            }
            catch (final Error error) {
                if (!this.L0) {
                    g63.s("LoadTask", "Unexpected error loading stream", (Throwable)error);
                    this.obtainMessage(3, (Object)error).sendToTarget();
                }
                throw error;
            }
            catch (final OutOfMemoryError outOfMemoryError) {
                if (!this.L0) {
                    g63.s("LoadTask", "OutOfMemory error loading stream", (Throwable)outOfMemoryError);
                    this.obtainMessage(2, (Object)new UnexpectedLoaderException(outOfMemoryError)).sendToTarget();
                }
            }
            catch (final Exception ex) {
                if (!this.L0) {
                    g63.s("LoadTask", "Unexpected exception loading stream", (Throwable)ex);
                    this.obtainMessage(2, (Object)new UnexpectedLoaderException(ex)).sendToTarget();
                }
            }
            catch (final IOException ex2) {
                if (!this.L0) {
                    this.obtainMessage(2, (Object)ex2).sendToTarget();
                }
            }
        }
    }
    
    public interface d
    {
        void a();
        
        void b() throws IOException;
    }
    
    public interface e
    {
        void b();
    }
    
    public static final class f implements Runnable
    {
        public final e D0;
        
        public f(final e d0) {
            this.D0 = d0;
        }
        
        @Override
        public final void run() {
            this.D0.b();
        }
    }
}
