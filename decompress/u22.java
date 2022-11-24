import android.util.Log;
import android.os.Bundle;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.CountDownLatch;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u22 implements b00, a00
{
    public final sog F0;
    public final Object G0;
    public CountDownLatch H0;
    
    public u22(final sog f0) {
        final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
        this.G0 = new Object();
        this.F0 = f0;
    }
    
    public final void a(final String s, final Bundle bundle) {
        final CountDownLatch h0 = this.H0;
        if (h0 == null) {
            return;
        }
        if ("_ae".equals(s)) {
            h0.countDown();
        }
    }
    
    public final void n(final Bundle bundle) {
        synchronized (this.G0) {
            final r1n k0 = r1n.K0;
            final StringBuilder sb = new StringBuilder();
            sb.append("Logging event ");
            sb.append("_ae");
            sb.append(" to Firebase Analytics with params ");
            sb.append(bundle);
            k0.l0(sb.toString());
            this.H0 = new CountDownLatch(1);
            this.F0.n(bundle);
            k0.l0("Awaiting app exception callback from Analytics...");
            try {
                if (this.H0.await(500, TimeUnit.MILLISECONDS)) {
                    k0.l0("App exception callback received from Analytics listener.");
                }
                else {
                    k0.n0("Timeout exceeded while awaiting app exception callback from Analytics listener.", (Throwable)null);
                }
            }
            catch (final InterruptedException ex) {
                Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", (Throwable)null);
            }
            this.H0 = null;
        }
    }
}
