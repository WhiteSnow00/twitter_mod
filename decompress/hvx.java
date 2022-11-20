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

public class hvx extends qp1 implements Preference$e
{
    public static final cbw Z1;
    public static final String[] a2;
    
    static {
        Z1 = cbw.a();
        a2 = new String[] { "pref_account", "pref_change_your_password", "pref_download_archive", "pref_deactivate_account" };
    }
    
    public final void Z1(final Bundle bundle, final String s) {
        super.Z1(bundle, s);
        final String[] a2 = hvx.a2;
        for (int length = a2.length, i = 0; i < length; ++i) {
            ((d)this).c0((CharSequence)a2[i]).I0 = (Preference$e)this;
        }
        rrz.K(hvx.Z1, "your_account");
    }
    
    public final String[] f2() {
        return hvx.a2;
    }
    
    public final int g2() {
        return 2132213831;
    }
    
    public final boolean w0(final Preference preference) {
        final String o0 = preference.O0;
        final cnb l0 = ((Fragment)this).L0();
        if (o0 == null || l0 == null) {
            return false;
        }
        rrz.J(hvx.Z1, "your_account", o0);
        int n = -1;
        switch (o0) {
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
                ((bnd)this).v0().h().b((ContentViewArgs)AccountInformationViewArgs.INSTANCE);
                return true;
            }
            case 2: {
                ((Fragment)this).V1(new Intent((Context)l0, (Class)DeactivateAccountActivity.class));
                return true;
            }
            case 1: {
                ((bnd)this).v0().h().b((ContentViewArgs)new AuthenticatedWebViewContentViewArgs(((Fragment)this).W0(2131957746), ((Fragment)this).W0(2131953589), 0L, null));
                return true;
            }
            case 0: {
                ((bnd)this).v0().h().b((ContentViewArgs)new ChangePasswordContentViewArgs(super.Y1));
                return true;
            }
        }
    }
}
