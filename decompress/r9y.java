import android.os.Bundle;
import java.util.Objects;
import android.app.job.JobParameters;
import com.google.android.gms.common.api.internal.LifecycleCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r9y implements Runnable
{
    public final int D0;
    public final Object E0;
    public final Object F0;
    public final Object G0;
    
    public r9y(final tiy g0, final LifecycleCallback e0, final String f0) {
        this.D0 = 0;
        this.G0 = g0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public r9y(final vlz e0, final q2z f0, final JobParameters g0) {
        this.D0 = 1;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final void run() {
        switch (this.D0) {
            default: {
                final vlz vlz = (vlz)this.E0;
                final q2z q2z = (q2z)this.F0;
                final JobParameters jobParameters = (JobParameters)this.G0;
                Objects.requireNonNull(vlz);
                q2z.Q0.a("AppMeasurementJobService processed last upload request.");
                ((tlz)vlz.a).c(jobParameters);
                return;
            }
            case 0: {
                final tiy tiy = (tiy)this.G0;
                if (tiy.E0 > 0) {
                    final LifecycleCallback lifecycleCallback = (LifecycleCallback)this.E0;
                    final Bundle f0 = tiy.F0;
                    Bundle bundle;
                    if (f0 != null) {
                        bundle = f0.getBundle((String)this.F0);
                    }
                    else {
                        bundle = null;
                    }
                    lifecycleCallback.e(bundle);
                }
                if (((tiy)this.G0).E0 >= 2) {
                    ((LifecycleCallback)this.E0).h();
                }
                if (((tiy)this.G0).E0 >= 3) {
                    ((LifecycleCallback)this.E0).f();
                }
                if (((tiy)this.G0).E0 >= 4) {
                    ((LifecycleCallback)this.E0).i();
                }
                if (((tiy)this.G0).E0 >= 5) {
                    Objects.requireNonNull(this.E0);
                }
            }
        }
    }
}
