import java.util.concurrent.TimeUnit;
import java.util.concurrent.CountDownLatch;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sjy extends Thread
{
    public final WeakReference<yv> F0;
    public final long G0;
    public final CountDownLatch H0;
    public boolean I0;
    
    public sjy(final yv yv, final long g0) {
        this.F0 = new WeakReference<yv>(yv);
        this.G0 = g0;
        this.H0 = new CountDownLatch(1);
        this.I0 = false;
        this.start();
    }
    
    @Override
    public final void run() {
        try {
            if (!this.H0.await(this.G0, TimeUnit.MILLISECONDS)) {
                final yv yv = this.F0.get();
                if (yv != null) {
                    yv.b();
                    this.I0 = true;
                }
            }
        }
        catch (final InterruptedException ex) {
            final yv yv2 = this.F0.get();
            if (yv2 != null) {
                yv2.b();
                this.I0 = true;
            }
        }
    }
}
