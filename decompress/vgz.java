import java.util.Objects;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vgz implements Runnable
{
    public final /* synthetic */ roy C0;
    public final /* synthetic */ hgy D0;
    public final /* synthetic */ String E0;
    public final /* synthetic */ AppMeasurementDynamiteService F0;
    
    public vgz(final AppMeasurementDynamiteService f0, final roy c0, final hgy d0, final String e0) {
        this.F0 = f0;
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final void run() {
        final skz z = this.F0.a.z();
        final roy c0 = this.C0;
        final hgy d0 = this.D0;
        final String e0 = this.E0;
        ((lwy)z).g();
        ((h1z)z).h();
        final xoz b = ((abz)z).C0.B();
        Objects.requireNonNull(b);
        if (o5c.b.c(((abz)b).C0.C0, 12451000) != 0) {
            ((abz)z).C0.b().K0.a("Not bundling data. Service unavailable or out of date");
            ((abz)z).C0.B().F(c0, new byte[0]);
        }
        else {
            z.t((Runnable)new liz(z, d0, e0, c0));
        }
    }
}
