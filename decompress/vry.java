import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Objects;
import android.os.Bundle;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vry extends xvy
{
    public final Context H0;
    public final Bundle I0;
    public final kyy J0;
    
    public vry(final kyy j0, final Context h0, final Bundle i0) {
        this.J0 = j0;
        this.H0 = h0;
        this.I0 = i0;
        super(j0, true);
    }
    
    public final void a() {
        try {
            eli.q(this.H0);
            final kyy j0 = this.J0;
            final Context h0 = this.H0;
            Objects.requireNonNull(j0);
            qoy interface1;
            try {
                interface1 = moy.asInterface(DynamiteModule.c(h0, (DynamiteModule.a)DynamiteModule.d, "com.google.android.gms.measurement.dynamite").b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            }
            catch (final DynamiteModule.LoadingException ex) {
                j0.a(ex, true, false);
                interface1 = null;
            }
            j0.f = interface1;
            if (this.J0.f == null) {
                Objects.requireNonNull(this.J0);
                Log.w("FA", "Failed to connect to measurement client.");
                return;
            }
            final int a = DynamiteModule.a(this.H0, "com.google.android.gms.measurement.dynamite");
            final int d = DynamiteModule.d(this.H0, "com.google.android.gms.measurement.dynamite", false);
            final bqy bqy = new bqy(64000L, (long)Math.max(a, d), d < a, (String)null, (String)null, (String)null, this.I0, k7z.a(this.H0));
            final qoy f = this.J0.f;
            Objects.requireNonNull(f, "null reference");
            f.initialize((l2d)new d5j((Object)this.H0), bqy, super.D0);
        }
        catch (final Exception ex2) {
            this.J0.a(ex2, true, false);
        }
    }
}
