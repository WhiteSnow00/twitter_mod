import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import android.os.SystemClock;
import java.util.Objects;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nae
{
    public final Executor a;
    public final c b;
    public final nae$a c;
    public final nae$b d;
    public final int e;
    public l4a f;
    public int g;
    public int h;
    public long i;
    public long j;
    
    public nae(final Executor a, final c b, final int e) {
        this.a = a;
        this.b = b;
        this.e = e;
        this.c = new Runnable(this) {
            public final nae F0;
            
            @Override
            public final void run() {
                final nae f0 = this.F0;
                Objects.requireNonNull(f0);
                final long uptimeMillis = SystemClock.uptimeMillis();
                synchronized (f0) {
                    final l4a f2 = f0.f;
                    final int g = f0.g;
                    f0.f = null;
                    f0.g = 0;
                    f0.h = 3;
                    f0.j = uptimeMillis;
                    monitorexit(f0);
                    try {
                        if (nae.d(f2, g)) {
                            f0.b.a(f2, g);
                        }
                    }
                    finally {
                        l4a.b(f2);
                        f0.b();
                    }
                }
            }
        };
        this.d = new Runnable(this) {
            public final nae F0;
            
            @Override
            public final void run() {
                final nae f0 = this.F0;
                f0.a.execute(f0.c);
            }
        };
        this.f = null;
        this.g = 0;
        this.h = 1;
        this.i = 0L;
        this.j = 0L;
    }
    
    public static boolean d(final l4a l4a, final int n) {
        return vj1.e(n) || vj1.m(n, 4) || l4a.q(l4a);
    }
    
    public final void a(final long n) {
        final Runnable d = this.d;
        if (n > 0L) {
            if (nae.d.a == null) {
                nae.d.a = Executors.newSingleThreadScheduledExecutor();
            }
            nae.d.a.schedule(d, n, TimeUnit.MILLISECONDS);
        }
        else {
            d.run();
        }
    }
    
    public final void b() {
        final long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            final int h = this.h;
            boolean b = true;
            long max;
            if (h == 4) {
                max = Math.max(this.j + this.e, uptimeMillis);
                this.i = uptimeMillis;
                this.h = 2;
            }
            else {
                this.h = 1;
                max = 0L;
                b = false;
            }
            monitorexit(this);
            if (b) {
                this.a(max - uptimeMillis);
            }
        }
    }
    
    public final boolean c() {
        final long uptimeMillis = SystemClock.uptimeMillis();
        monitorenter(this);
        Label_0034: {
            try {
                final boolean d = d(this.f, this.g);
                final boolean b = false;
                if (!d) {
                    monitorexit(this);
                    return false;
                }
                break Label_0034;
            }
            finally {
                monitorexit(this);
                final int g = lb0.G(this.h);
                iftrue(Label_0065:)(g == 0);
                boolean b;
                long max;
                Label_0059:Block_7_Outer:Label_0095_Outer:
                while (true) {
                    while (true) {
                        while (true) {
                            while (true) {
                                Block_5: {
                                    break Block_5;
                                    break Label_0059;
                                    this.a(max - uptimeMillis);
                                    return true;
                                }
                                iftrue(Label_0054:)(g == 2);
                                continue Block_7_Outer;
                            }
                            monitorexit(this);
                            iftrue(Label_0110:)(!b);
                            continue Label_0095_Outer;
                        }
                        Label_0065: {
                            max = Math.max(this.j + this.e, uptimeMillis);
                        }
                        this.i = uptimeMillis;
                        this.h = 2;
                        b = true;
                        continue;
                        Label_0110:
                        return true;
                        max = 0L;
                        continue;
                    }
                    Label_0054: {
                        this.h = 4;
                    }
                    continue Label_0059;
                }
            }
        }
    }
    
    public final boolean e(final l4a l4a, final int g) {
        if (!d(l4a, g)) {
            return false;
        }
        synchronized (this) {
            final l4a f = this.f;
            this.f = l4a.a(l4a);
            this.g = g;
            monitorexit(this);
            l4a.b(f);
            return true;
        }
    }
    
    public interface c
    {
        void a(final l4a p0, final int p1);
    }
    
    public static final class d
    {
        public static ScheduledExecutorService a;
    }
}
