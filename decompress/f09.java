import android.preference.TwoStatePreference;
import com.twitter.android.settings.DiscoverabilityActivity;
import java.util.Objects;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f09 implements stb
{
    public final int F0;
    public final Object G0;
    
    public f09(final Object g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final Object invoke(final Object o) {
        switch (this.F0) {
            default: {
                return ((g8t)this.G0).v((ViewGroup)o);
            }
            case 1: {
                final dxb dxb = (dxb)this.G0;
                final Boolean b = (Boolean)o;
                final cqu m = dxb.m;
                Objects.requireNonNull(dxb);
                final boolean booleanValue = b;
                final hp6 h = dxb.h;
                if (h != null) {
                    h.F0.M0 = booleanValue;
                    dxb.a(h);
                }
                return null;
            }
            case 0: {
                final DiscoverabilityActivity discoverabilityActivity = (DiscoverabilityActivity)this.G0;
                final boolean booleanValue2 = (boolean)o;
                final int h2 = DiscoverabilityActivity.h1;
                Objects.requireNonNull(discoverabilityActivity);
                if (!booleanValue2) {
                    ((TwoStatePreference)discoverabilityActivity.a1).setChecked(false);
                    discoverabilityActivity.d1.e(0);
                    ehk.c().c(2131951888, 0);
                }
                return null;
            }
        }
    }
}
