import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.navigation.settings.AudioSpacesPrivacySettingsViewArgs;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lko extends gf4
{
    public final fci<?> L0;
    
    public lko(final fci<?> l0, final int n, final int n2) {
        this.L0 = l0;
        super(n, n2, false);
    }
    
    public final void onClick(final View view) {
        e0e.f((Object)view, "p0");
        final fci<?> l0 = this.L0;
        if (l0 != null) {
            l0.b((ContentViewArgs)AudioSpacesPrivacySettingsViewArgs.INSTANCE);
        }
    }
}
