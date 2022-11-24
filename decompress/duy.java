import android.os.Bundle;
import java.util.Objects;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class duy extends uwy
{
    public final int J0;
    public final Object K0;
    public final Object L0;
    
    public duy(final fzy k0, final Activity l0) {
        this.J0 = 2;
        this.K0 = k0;
        this.L0 = l0;
        super(k0.F0, true);
    }
    
    public duy(final jzy k0, final bmy l0, final int j0) {
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        super(k0, true);
    }
    
    @Override
    public final void a() {
        switch (this.J0) {
            default: {
                final npy f = ((fzy)this.K0).F0.f;
                Objects.requireNonNull(f, "null reference");
                f.onActivityDestroyed((l3d)new p5j(this.L0), super.G0);
                return;
            }
            case 1: {
                final npy f2 = ((jzy)this.K0).f;
                Objects.requireNonNull(f2, "null reference");
                f2.registerOnMeasurementEventListener((oqy)this.L0);
                return;
            }
            case 0: {
                final npy f3 = ((jzy)this.K0).f;
                Objects.requireNonNull(f3, "null reference");
                f3.getGmpAppId((aqy)this.L0);
            }
        }
    }
    
    @Override
    public final void b() {
        switch (this.J0) {
            default: {
                return;
            }
            case 0: {
                ((yny)this.L0).m(null);
            }
        }
    }
}
