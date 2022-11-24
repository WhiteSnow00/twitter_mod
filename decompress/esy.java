import java.util.Objects;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class esy extends uwy
{
    public final int J0;
    public final Object K0;
    public final Object L0;
    
    public esy(final fzy l0, final Activity k0) {
        this.J0 = 1;
        this.L0 = l0;
        this.K0 = k0;
        super(l0.F0, true);
    }
    
    public esy(final jzy l0, final Boolean k0) {
        this.J0 = 0;
        this.L0 = l0;
        this.K0 = k0;
        super(l0, true);
    }
    
    @Override
    public final void a() {
        switch (this.J0) {
            default: {
                final npy f = ((fzy)this.L0).F0.f;
                Objects.requireNonNull(f, "null reference");
                f.onActivityResumed((l3d)new p5j(this.K0), super.G0);
                return;
            }
            case 0: {
                if (this.K0 != null) {
                    final npy f2 = ((jzy)this.L0).f;
                    Objects.requireNonNull(f2, "null reference");
                    f2.setMeasurementEnabled((boolean)this.K0, super.F0);
                }
                else {
                    final npy f3 = ((jzy)this.L0).f;
                    Objects.requireNonNull(f3, "null reference");
                    f3.clearMeasurementEnabled(super.F0);
                }
            }
        }
    }
}
