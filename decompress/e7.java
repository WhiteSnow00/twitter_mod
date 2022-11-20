import android.content.Context;
import java.util.Objects;
import android.preference.Preference;
import com.twitter.app.settings.AboutActivity;
import android.preference.Preference$OnPreferenceClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e7 implements Preference$OnPreferenceClickListener
{
    public final AboutActivity D0;
    
    public e7(final AboutActivity d0) {
        this.D0 = d0;
    }
    
    public final boolean onPreferenceClick(final Preference preference) {
        final AboutActivity d0 = this.D0;
        final int y0 = AboutActivity.Y0;
        Objects.requireNonNull(d0);
        o70.a((Context)d0, preference.getSummary().toString());
        m1f.e().c(2131952888, 0);
        return true;
    }
}
