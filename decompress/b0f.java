import android.os.Trace;
import java.util.concurrent.TimeUnit;
import android.view.Display;
import java.util.Objects;
import android.view.Choreographer;
import android.view.View;
import android.view.Choreographer$FrameCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b0f implements rcm, a0f$b, Runnable, Choreographer$FrameCallback
{
    public static final b0f.b0f$a Companion;
    public static long N0;
    public final a0f D0;
    public final xlr E0;
    public final sze F0;
    public final View G0;
    public final suh<b> H0;
    public long I0;
    public long J0;
    public boolean K0;
    public final Choreographer L0;
    public boolean M0;
    
    static {
        Companion = new b0f.b0f$a();
    }
    
    public b0f(final a0f d0, final xlr e0, final sze f0, final View g0) {
        czd.f((Object)d0, "prefetchState");
        czd.f((Object)e0, "subcomposeLayoutState");
        czd.f((Object)f0, "itemContentFactory");
        czd.f((Object)g0, "view");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = (suh<b>)new suh((Object[])new b[16]);
        this.L0 = Choreographer.getInstance();
        Objects.requireNonNull(b0f.Companion);
        if (b0f.N0 == 0L) {
            final Display display = g0.getDisplay();
            float n2;
            final float n = n2 = 60.0f;
            if (!g0.isInEditMode()) {
                n2 = n;
                if (display != null) {
                    final float refreshRate = display.getRefreshRate();
                    n2 = n;
                    if (refreshRate >= 30.0f) {
                        n2 = refreshRate;
                    }
                }
            }
            b0f.N0 = (long)(1000000000 / n2);
        }
    }
    
    @Override
    public final void a() {
        this.D0.a.setValue((Object)this);
        this.M0 = true;
    }
    
    public final a0f$a b(final int n, final long n2) {
        final b b = new b(n, n2);
        this.H0.b((Object)b);
        if (!this.K0) {
            this.K0 = true;
            this.G0.post((Runnable)this);
        }
        return (a0f$a)b;
    }
    
    @Override
    public final void c() {
    }
    
    @Override
    public final void d() {
        this.M0 = false;
        this.D0.a.setValue((Object)null);
        this.G0.removeCallbacks((Runnable)this);
        this.L0.removeFrameCallback((Choreographer$FrameCallback)this);
    }
    
    public final void doFrame(final long n) {
        if (this.M0) {
            this.G0.post((Runnable)this);
        }
    }
    
    public final void run() {
        if (!this.H0.l() && this.K0 && this.M0 && this.G0.getWindowVisibility() == 0) {
            final long n = TimeUnit.MILLISECONDS.toNanos(this.G0.getDrawingTime()) + b0f.N0;
            int n2 = 0;
            while (this.H0.m() && n2 == 0) {
                final b b = (b)this.H0.D0[0];
                final tze tze = (tze)this.F0.b.invoke();
                if (!b.d) {
                    final int a = tze.a();
                    final int a2 = b.a;
                    if (a2 >= 0 && a2 < a) {
                        if (b.c == null) {
                            Trace.beginSection("compose:lazylist:prefetch:compose");
                            try {
                                final long nanoTime = System.nanoTime();
                                final long i0 = this.I0;
                                if (nanoTime > n || i0 + nanoTime < n) {
                                    final Object g = tze.g(b.a);
                                    b.c = this.E0.b(g, this.F0.a(b.a, g));
                                    long i2 = System.nanoTime() - nanoTime;
                                    final long i3 = this.I0;
                                    if (i3 != 0L) {
                                        final long n3 = 4;
                                        i2 = i2 / n3 + i3 / n3 * 3;
                                    }
                                    this.I0 = i2;
                                }
                                else {
                                    n2 = 1;
                                }
                                continue;
                            }
                            finally {
                                Trace.endSection();
                            }
                        }
                        Trace.beginSection("compose:lazylist:prefetch:measure");
                        try {
                            final long nanoTime2 = System.nanoTime();
                            final long j0 = this.J0;
                            if (nanoTime2 > n || j0 + nanoTime2 < n) {
                                final xlr$a c = b.c;
                                czd.c((Object)c);
                                for (int a3 = c.a(), k = 0; k < a3; ++k) {
                                    c.b(k, b.b);
                                }
                                long j2 = System.nanoTime() - nanoTime2;
                                final long j3 = this.J0;
                                if (j3 != 0L) {
                                    final long n4 = 4;
                                    j2 = j2 / n4 + j3 / n4 * 3;
                                }
                                this.J0 = j2;
                                this.H0.p(0);
                            }
                            else {
                                n2 = 1;
                            }
                            continue;
                        }
                        finally {
                            Trace.endSection();
                        }
                    }
                }
                this.H0.p(0);
            }
            if (n2 != 0) {
                this.L0.postFrameCallback((Choreographer$FrameCallback)this);
            }
            else {
                this.K0 = false;
            }
            return;
        }
        this.K0 = false;
    }
    
    public static final class b implements a0f$a
    {
        public final int a;
        public final long b;
        public xlr$a c;
        public boolean d;
        
        public b(final int a, final long b) {
            this.a = a;
            this.b = b;
        }
        
        public final void cancel() {
            if (!this.d) {
                this.d = true;
                final xlr$a c = this.c;
                if (c != null) {
                    c.dispose();
                }
                this.c = null;
            }
        }
    }
}
