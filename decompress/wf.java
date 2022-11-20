import androidx.fragment.app.Fragment;
import androidx.preference.d;
import com.twitter.navigation.settings.DataSettingsViewArgs;
import com.twitter.navigation.settings.DisplayAndSoundSettingsViewArgs;
import com.twitter.navigation.settings.LanguagesSettingsViewArgs;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.navigation.settings.AccessibilityViewArgs;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import android.os.Bundle;
import androidx.preference.Preference$e;

// 
// Decompiled by Procyon v0.6.0
// 

public class wf extends qp1 implements Preference$e
{
    public static final cbw Z1;
    public static final String[] a2;
    
    static {
        Z1 = cbw.a();
        a2 = new String[] { "pref_accessibility", "pref_display", "pref_languages", "pref_data_usage" };
    }
    
    public final void Z1(final Bundle bundle, String s) {
        super.Z1(bundle, s);
        final String[] a2 = wf.a2;
        for (int length = a2.length, i = 0; i < length; ++i) {
            s = a2[i];
            if (qp1.h2() && s.equals("pref_languages")) {
                c9y.z((PreferenceGroup)((d)this).A1.g, s);
            }
            else {
                final Preference c0 = ((d)this).c0((CharSequence)s);
                if (c0 != null) {
                    c0.I0 = (Preference$e)this;
                }
            }
        }
        rrz.K(wf.Z1, "accessibility_display_languages");
    }
    
    public final String[] f2() {
        return wf.a2;
    }
    
    public final int g2() {
        return 2132213762;
    }
    
    public final boolean w0(final Preference preference) {
        final String o0 = preference.O0;
        if (o0 == null) {
            return false;
        }
        rrz.J(wf.Z1, "accessibility_display_languages", o0);
        o0.hashCode();
        int n = -1;
        switch (o0) {
            case "pref_accessibility": {
                n = 3;
                break;
            }
            case "pref_languages": {
                n = 2;
                break;
            }
            case "pref_display": {
                n = 1;
                break;
            }
            case "pref_data_usage": {
                n = 0;
                break;
            }
            default:
                break;
        }
        switch (n) {
            default: {
                return false;
            }
            case 3: {
                ((bnd)this).v0().h().b((ContentViewArgs)AccessibilityViewArgs.INSTANCE);
                return true;
            }
            case 2: {
                if (asa.b().b("onboarding_project_uls_enabled", false)) {
                    final qdj.a a = new qdj.a(((Fragment)this).N0());
                    final ncs$a m = zh8.m("uls_content_and_app_language_selector");
                    m.d = "settings";
                    a.d = (ncs)((n4j)m).e();
                    ((Fragment)this).V1(((qdj)a.e()).a());
                }
                else {
                    ((bnd)this).v0().h().b((ContentViewArgs)LanguagesSettingsViewArgs.INSTANCE);
                }
                return true;
            }
            case 1: {
                ((bnd)this).v0().h().b((ContentViewArgs)DisplayAndSoundSettingsViewArgs.INSTANCE);
                return true;
            }
            case 0: {
                ((bnd)this).v0().h().b((ContentViewArgs)DataSettingsViewArgs.INSTANCE);
                return true;
            }
        }
    }
}
