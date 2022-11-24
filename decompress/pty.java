import java.util.HashMap;
import java.util.Objects;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pty implements Callable
{
    public final MobileVisionBase F0;
    public final yrd G0;
    
    public pty(final MobileVisionBase f0, final yrd g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final Object call() {
        final MobileVisionBase f0 = this.F0;
        final yrd g0 = this.G0;
        Objects.requireNonNull(f0);
        final HashMap m0 = ndz.M0;
        mgz.a();
        final int a = lgz.a;
        mgz.a();
        Object n0;
        if (!Boolean.parseBoolean("")) {
            n0 = jdz.N0;
        }
        else {
            final HashMap m2 = ndz.M0;
            if (m2.get("detectorTaskWithResource#run") == null) {
                m2.put("detectorTaskWithResource#run", new ndz());
            }
            n0 = m2.get("detectorTaskWithResource#run");
        }
        ((ndz)n0).b();
        try {
            final Object b = f0.G0.b((ofg)g0);
            ((ndz)n0).close();
            return b;
        }
        finally {
            try {
                ((ndz)n0).close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                t.addSuppressed(t2);
            }
        }
    }
}
