import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.dynamite.DynamiteModule$a;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Objects;
import android.os.Bundle;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tsy extends uwy
{
    public final Context J0;
    public final Bundle K0;
    public final jzy L0;
    
    public tsy(final jzy l0, final Context j0, final Bundle k0) {
        this.L0 = l0;
        this.J0 = j0;
        this.K0 = k0;
        super(l0, true);
    }
    
    @Override
    public final void a() {
        try {
            iuk.C((Object)this.J0);
            final jzy l0 = this.L0;
            final Context j0 = this.J0;
            Objects.requireNonNull(l0);
            npy interface1;
            try {
                interface1 = ipy.asInterface(DynamiteModule.c(j0, (DynamiteModule$a)DynamiteModule.d, "com.google.android.gms.measurement.dynamite").b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            }
            catch (final DynamiteModule$LoadingException ex) {
                l0.a((Exception)ex, true, false);
                interface1 = null;
            }
            l0.f = interface1;
            if (this.L0.f == null) {
                Objects.requireNonNull(this.L0);
                Log.w("FA", "Failed to connect to measurement client.");
                return;
            }
            final int a = DynamiteModule.a(this.J0, "com.google.android.gms.measurement.dynamite");
            final int d = DynamiteModule.d(this.J0, "com.google.android.gms.measurement.dynamite", false);
            final ary ary = new ary(64000L, (long)Math.max(a, d), d < a, (String)null, (String)null, (String)null, this.K0, j8z.a(this.J0));
            final npy f = this.L0.f;
            Objects.requireNonNull(f, "null reference");
            f.initialize((l3d)new p5j(this.J0), ary, super.F0);
        }
        catch (final Exception ex2) {
            this.L0.a(ex2, true, false);
        }
    }
}
