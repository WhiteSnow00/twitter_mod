import java.util.Objects;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ory extends jvy
{
    public final /* synthetic */ int G0;
    public final /* synthetic */ Object H0;
    public final /* synthetic */ Object I0;
    
    public ory(final sxy i0, final Activity h0) {
        this.G0 = 1;
        this.I0 = i0;
        this.H0 = h0;
        super(i0.C0, true);
    }
    
    public ory(final wxy i0, final String h0) {
        this.G0 = 0;
        this.I0 = i0;
        this.H0 = h0;
        super(i0, true);
    }
    
    @Override
    public final void a() {
        switch (this.G0) {
            default: {
                final doy f = ((sxy)this.I0).C0.f;
                Objects.requireNonNull(f, "null reference");
                f.onActivityStopped((g3d)new x4j((Object)this.H0), super.D0);
                return;
            }
            case 0: {
                final doy f2 = ((wxy)this.I0).f;
                Objects.requireNonNull(f2, "null reference");
                f2.beginAdUnitExposure((String)this.H0, super.D0);
            }
        }
    }
}
