import com.twitter.app.settings.AccessibilityActivity;
import android.preference.Preference;
import android.preference.Preference$OnPreferenceChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rf implements Preference$OnPreferenceChangeListener
{
    public static final rf D0;
    
    static {
        D0 = new rf();
    }
    
    public final boolean onPreferenceChange(final Preference preference, final Object o) {
        final int a1 = AccessibilityActivity.a1;
        q3j.U(true, String.valueOf(o));
        return true;
    }
}
