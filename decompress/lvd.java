import android.view.View;
import com.twitter.onboarding.ocf.NavigationHandler;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lvd implements View$OnClickListener
{
    public final int D0;
    public final NavigationHandler E0;
    public final ssv F0;
    
    public lvd(final NavigationHandler e0, final ssv f0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final void onClick(final View view) {
        switch (this.D0) {
            default: {
                this.E0.d(new pqd(this.F0), (String)null);
                return;
            }
            case 0: {
                this.E0.d(new pqd(this.F0), (String)null);
            }
        }
    }
}
