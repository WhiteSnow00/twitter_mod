import androidx.fragment.app.Fragment;
import androidx.preference.d;
import com.twitter.app.account.changepassword.ChangePasswordContentViewArgs;
import com.twitter.navigation.web.AuthenticatedWebViewContentViewArgs;
import android.content.Context;
import android.content.Intent;
import com.twitter.android.settings.DeactivateAccountActivity;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.navigation.settings.AccountInformationViewArgs;
import androidx.preference.Preference;
import android.os.Bundle;
import androidx.preference.Preference$e;

// 
// Decompiled by Procyon v0.6.0
// 

public class awx extends wp1 implements Preference$e
{
    public static final sbw b2;
    public static final String[] c2;
    
    static {
        b2 = sbw.a();
        c2 = new String[] { "pref_account", "pref_change_your_password", "pref_download_archive", "pref_deactivate_account" };
    }
    
    public final void Z1(final Bundle bundle, final String s) {
        super.Z1(bundle, s);
        final String[] c2 = awx.c2;
        for (int length = c2.length, i = 0; i < length; ++i) {
            ((d)this).c0(c2[i]).K0 = (Preference$e)this;
        }
        ix.G(awx.b2, "your_account");
    }
    
    public final String[] f2() {
        return awx.c2;
    }
    
    public final int g2() {
        return 2132213831;
    }
    
    public final boolean w0(final Preference preference) {
        final String q0 = preference.Q0;
        final dob l0 = ((Fragment)this).L0();
        if (q0 == null || l0 == null) {
            return false;
        }
        ix.F(awx.b2, "your_account", q0);
        int n = -1;
        switch (q0) {
            case "pref_account": {
                n = 3;
                break;
            }
            case "pref_deactivate_account": {
                n = 2;
                break;
            }
            case "pref_download_archive": {
                n = 1;
                break;
            }
            case "pref_change_your_password": {
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
                ((bod)this).v0().h().b((ContentViewArgs)AccountInformationViewArgs.INSTANCE);
                return true;
            }
            case 2: {
                ((Fragment)this).V1(new Intent((Context)l0, (Class)DeactivateAccountActivity.class));
                return true;
            }
            case 1: {
                ((bod)this).v0().h().b((ContentViewArgs)new AuthenticatedWebViewContentViewArgs(((Fragment)this).W0(2131957746), ((Fragment)this).W0(2131953589), 0L, (String)null));
                return true;
            }
            case 0: {
                ((bod)this).v0().h().b((ContentViewArgs)new ChangePasswordContentViewArgs(super.a2));
                return true;
            }
        }
    }
}
