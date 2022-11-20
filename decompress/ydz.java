import android.os.Handler;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ydz implements Runnable
{
    public final int D0;
    public final long E0;
    public final x1z F0;
    
    public ydz(final x1z f0, final long e0, final int d0) {
        this.D0 = d0;
        this.F0 = f0;
        this.E0 = e0;
    }
    
    @Override
    public final void run() {
        switch (this.D0) {
            default: {
                final nmz nmz = (nmz)this.F0;
                final long e0 = this.E0;
                ((axy)nmz).g();
                nmz.k();
                ((pbz)nmz).D0.b().Q0.b("Activity paused, time", (Object)e0);
                final i99 i0 = nmz.I0;
                Objects.requireNonNull(((pbz)i0.F0).D0.Q0);
                final cmz e2 = new cmz(i0, System.currentTimeMillis(), e0);
                i0.E0 = e2;
                ((Handler)((nmz)i0.F0).F0).postDelayed((Runnable)e2, 2000L);
                if (((pbz)nmz).D0.J0.v()) {
                    ((uey)nmz.H0.c).a();
                }
                return;
            }
            case 0: {
                ((bgz)this.F0).r(this.E0, true);
                ((pbz)this.F0).D0.z().A(new AtomicReference());
            }
        }
    }
}
