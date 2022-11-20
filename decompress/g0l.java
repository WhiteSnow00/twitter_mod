import android.widget.CompoundButton;
import com.twitter.onboarding.ocf.signup.PrivacyOptionsPresenter;
import android.widget.CompoundButton$OnCheckedChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g0l implements CompoundButton$OnCheckedChangeListener
{
    public final PrivacyOptionsPresenter D0;
    
    public g0l(final PrivacyOptionsPresenter d0) {
        this.D0 = d0;
    }
    
    public final void onCheckedChanged(final CompoundButton compoundButton, final boolean b) {
        this.D0.b = b;
    }
}
