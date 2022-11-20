import java.util.Objects;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jhz implements Runnable
{
    public final epy D0;
    public final wgy E0;
    public final String F0;
    public final AppMeasurementDynamiteService G0;
    
    public jhz(final AppMeasurementDynamiteService g0, final epy d0, final wgy e0, final String f0) {
        this.G0 = g0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    @Override
    public final void run() {
        final glz z = this.G0.a.z();
        final epy d0 = this.D0;
        final wgy e0 = this.E0;
        final String f0 = this.F0;
        ((axy)z).g();
        z.h();
        final lpz b = ((pbz)z).D0.B();
        Objects.requireNonNull(b);
        if (q4c.b.c(((pbz)b).D0.D0, 12451000) != 0) {
            ((pbz)z).D0.b().L0.a("Not bundling data. Service unavailable or out of date");
            ((pbz)z).D0.B().F(d0, new byte[0]);
        }
        else {
            z.t((Runnable)new ziz(z, e0, f0, d0));
        }
    }
}
