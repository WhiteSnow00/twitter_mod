import android.os.BaseBundle;
import android.os.Parcelable;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hwb extends tt2
{
    public final gwb F0;
    
    public hwb(final gwb f0) {
        this.F0 = f0;
    }
    
    public final void T0() {
        final gwb f0 = this.F0;
        f0.G1 = ((u9)f0).N0.hasExtra("pending_transition_compat");
    }
    
    public final void a(final Bundle bundle) {
        ((BaseBundle)bundle).putInt("current_position", this.F0.v1);
    }
    
    public final void v(final Parcelable parcelable) {
        final Bundle bundle = (Bundle)parcelable;
        final gwb f0 = this.F0;
        f0.v1 = ((BaseBundle)bundle).getInt("current_position", f0.v1);
        this.F0.J1 = true;
    }
}
