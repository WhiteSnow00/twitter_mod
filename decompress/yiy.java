import java.util.concurrent.TimeUnit;
import java.util.concurrent.CountDownLatch;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yiy extends Thread
{
    public final WeakReference<yv> D0;
    public final long E0;
    public final CountDownLatch F0;
    public boolean G0;
    
    public yiy(final yv yv, final long e0) {
        this.D0 = new WeakReference<yv>(yv);
        this.E0 = e0;
        this.F0 = new CountDownLatch(1);
        this.G0 = false;
        this.start();
    }
    
    @Override
    public final void run() {
        try {
            if (!this.F0.await(this.E0, TimeUnit.MILLISECONDS)) {
                final yv yv = this.D0.get();
                if (yv != null) {
                    yv.b();
                    this.G0 = true;
                }
            }
        }
        catch (final InterruptedException ex) {
            final yv yv2 = this.D0.get();
            if (yv2 != null) {
                yv2.b();
                this.G0 = true;
            }
        }
    }
}
