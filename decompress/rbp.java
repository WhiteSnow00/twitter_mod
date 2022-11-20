import androidx.fragment.app.Fragment;
import androidx.preference.d;
import com.twitter.navigation.web.AuthenticatedWebViewContentViewArgs;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.delegate.api.DelegateSettingsWebViewContentViewArgs;
import com.twitter.app.settings.connectedaccounts.ConnectedAccountsSettingsActivity;
import android.content.Context;
import android.content.Intent;
import com.twitter.app.settings.SecuritySettingsActivity;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import android.os.Bundle;
import androidx.preference.Preference$e;

// 
// Decompiled by Procyon v0.6.0
// 

public class rbp extends qp1 implements Preference$e
{
    public static final String[] Z1;
    
    static {
        Z1 = new String[] { "pref_security", "pref_apps_and_sessions", "pref_connected_accounts", "pref_twitter_delegate" };
    }
    
    public final void Z1(final Bundle bundle, String s) {
        super.Z1(bundle, s);
        final String[] z1 = rbp.Z1;
        for (int i = 0; i < 4; ++i) {
            s = z1[i];
            if (s == "pref_connected_accounts" && !asa.b().b("consideration_sso_disconnect_screen_enabled", false)) {
                c9y.z((PreferenceGroup)((d)this).A1.g, s);
            }
            else if (s.equals("pref_twitter_delegate") && !w9i.L()) {
                c9y.z((PreferenceGroup)((d)this).A1.g, s);
            }
            else {
                ((d)this).c0((CharSequence)s).I0 = (Preference$e)this;
            }
        }
    }
    
    public final String[] f2() {
        return rbp.Z1;
    }
    
    public final int g2() {
        return 2132213809;
    }
    
    public final boolean w0(final Preference preference) {
        final String o0 = preference.O0;
        if (o0 == null) {
            return false;
        }
        int n = -1;
        switch (o0) {
            case "pref_security": {
                n = 3;
                break;
            }
            case "pref_connected_accounts": {
                n = 2;
                break;
            }
            case "pref_twitter_delegate": {
                n = 1;
                break;
            }
            case "pref_apps_and_sessions": {
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
                final Intent intent = new Intent((Context)((Fragment)this).L0(), (Class)SecuritySettingsActivity.class);
                dwj.m(intent, "SecuritySettingsActivity_account_name", super.Y1);
                ((Fragment)this).V1(intent);
                return true;
            }
            case 2: {
                ((Fragment)this).V1(new Intent((Context)((Fragment)this).L0(), (Class)ConnectedAccountsSettingsActivity.class));
                return true;
            }
            case 1: {
                ((bnd)this).v0().h().b((ContentViewArgs)new DelegateSettingsWebViewContentViewArgs(((Fragment)this).W0(2131957985), ((Fragment)this).W0(2131959252)));
                return true;
            }
            case 0: {
                ((bnd)this).v0().h().b((ContentViewArgs)new AuthenticatedWebViewContentViewArgs(((Fragment)this).W0(2131957702), ((Fragment)this).W0(2131952799), 0L, null));
                return true;
            }
        }
    }
}
