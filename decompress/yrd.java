import java.util.concurrent.TimeUnit;
import android.os.SystemClock;
import java.util.Objects;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yrd implements ofg
{
    public volatile Bitmap a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    
    public yrd(final Bitmap a) {
        Objects.requireNonNull(a, "null reference");
        this.a = a;
        this.b = a.getWidth();
        this.c = a.getHeight();
        this.d = 0;
        this.e = -1;
    }
    
    public static void a(final int n, final long n2, final int n3, final int n4, final int n5) {
        synchronized (egz.class) {
            final tdz tdz = new tdz();
            tdz.a = "vision-common";
            tdz.b = Boolean.TRUE;
            tdz.c = 1;
            final cez a = tdz.a();
            synchronized (egz.class) {
                if (egz.F0 == null) {
                    egz.F0 = new bgz();
                }
                final yez yez = egz.F0.b(a);
                monitorexit(egz.class);
                monitorexit(egz.class);
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                final c6z g0 = c6z.G0;
                Objects.requireNonNull(yez);
                final long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (yez.h.get(g0) != null) {
                    if (elapsedRealtime2 - yez.h.get(g0) <= TimeUnit.SECONDS.toMillis(30L)) {
                        return;
                    }
                }
                yez.h.put(g0, elapsedRealtime2);
                final b5z b5z = new b5z();
                b5z.H0 = j4z.L0;
                f5z g2;
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            if (n != 4) {
                                g2 = f5z.K0;
                            }
                            else {
                                g2 = f5z.J0;
                            }
                        }
                        else {
                            g2 = f5z.I0;
                        }
                    }
                    else {
                        g2 = f5z.H0;
                    }
                }
                else {
                    g2 = f5z.G0;
                }
                b5z.G0 = g2;
                b5z.I0 = (n5 & Integer.MAX_VALUE);
                b5z.K0 = (n3 & Integer.MAX_VALUE);
                b5z.J0 = (n4 & Integer.MAX_VALUE);
                b5z.F0 = ((long)(elapsedRealtime - n2) & Long.MAX_VALUE);
                b5z.L0 = (0x0 & Integer.MAX_VALUE);
                final i5z c = new i5z(b5z);
                final k6z k6z = new k6z();
                k6z.c = c;
                final a8d a8d = new a8d(k6z);
                String a2;
                if (yez.e.s()) {
                    a2 = yez.e.o();
                }
                else {
                    a2 = raf.c.a(yez.g);
                }
                final Object b = nfg.b;
                pbz.F0.execute((Runnable)new iez(yez, a8d, a2));
            }
        }
    }
}
