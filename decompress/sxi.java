import androidx.fragment.app.Fragment;
import androidx.preference.d;
import android.net.Uri;
import java.util.List;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.twitter.util.user.UserIdentifier;
import android.os.Bundle;
import androidx.preference.Preference$e;

// 
// Decompiled by Procyon v0.6.0
// 

public class sxi extends qp1 implements Preference$e
{
    public static final String[] Z1;
    
    static {
        Z1 = new String[] { "pref_filters", "pref_preferences", "pref_data_push_learn_more_summary" };
    }
    
    public final void Z1(final Bundle bundle, final String s) {
        super.Z1(bundle, s);
        final String[] z1 = sxi.Z1;
        final boolean b = false;
        for (int i = 0; i < 3; ++i) {
            final Preference c0 = ((d)this).c0((CharSequence)z1[i]);
            if (c0 != null) {
                c0.I0 = (Preference$e)this;
            }
        }
        final List d = ((uew)caa.e()).d();
        czd.f((Object)d, "loggedInAccounts");
        int n = b ? 1 : 0;
        if (ffz.v0(d)) {
            boolean b2;
            if (d.size() == 1) {
                b2 = asa.a((UserIdentifier)mq4.g0(d)).b("android_notifications_signals_enable_no_op", false);
            }
            else {
                b2 = asa.d().b("android_notifications_signals_enable_multi_account_no_op", false);
            }
            n = (b ? 1 : 0);
            if (!b2) {
                n = 1;
            }
        }
        if (n == 0) {
            c9y.z((PreferenceGroup)((d)this).A1.g, "pref_data_push_learn_more");
        }
    }
    
    public final String[] f2() {
        return sxi.Z1;
    }
    
    public final int g2() {
        return 2132213799;
    }
    
    public final boolean w0(final Preference preference) {
        final String o0 = preference.O0;
        final cnb l0 = ((Fragment)this).L0();
        if (o0 == null || l0 == null) {
            return false;
        }
        int n = -1;
        switch (o0) {
            case "pref_filters": {
                n = 2;
                break;
            }
            case "pref_preferences": {
                n = 1;
                break;
            }
            case "pref_data_push_learn_more_summary": {
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
            case 2: {
                final obi h = ((bnd)this).v0().h();
                final qui qui = new qui();
                qui.a(true);
                qui.b(false);
                h.d((ym)qui);
                return true;
            }
            case 1: {
                final obi h2 = ((bnd)this).v0().h();
                final qui qui2 = new qui();
                qui2.a(false);
                qui2.b(true);
                h2.d((ym)qui2);
                return true;
            }
            case 0: {
                ((bnd)this).v0().h().d((ym)new vmx(Uri.parse(((Fragment)this).W0(2131952990))));
                return true;
            }
        }
    }
}
