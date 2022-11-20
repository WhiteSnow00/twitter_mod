import androidx.fragment.app.Fragment;
import androidx.preference.d;
import com.twitter.navigation.settings.OffTwitterSettingsViewArgs;
import com.twitter.navigation.settings.AudienceAndTaggingSettingsViewArgs;
import com.twitter.navigation.settings.MuteAndBlockActivityArgs;
import com.twitter.navigation.settings.DiscoverabilityAndContactsViewArgs;
import com.twitter.subsystem.replyfilter.ReplySettingsContentViewArgs;
import com.twitter.navigation.settings.SafetyModeSettingsViewArgs;
import com.twitter.navigation.settings.AudioSpacesPrivacySettingsViewArgs;
import com.twitter.navigation.settings.DataSharingViewArgs;
import com.twitter.navigation.settings.AdsPreferencesSettingsViewArgs;
import com.twitter.navigation.settings.ContentYouSeeSettingsViewArgs;
import com.twitter.navigation.settings.LocationInformationSettingsViewArgs;
import android.net.Uri;
import com.twitter.navigation.settings.YourTweetsSettingsViewArgs;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.navigation.settings.InferredIdentitySettingsViewArgs;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import androidx.preference.Preference$e;

// 
// Decompiled by Procyon v0.6.0
// 

public class e0l extends qp1 implements Preference$e
{
    public static final String[] Z1;
    public static final List<String> a2;
    
    static {
        Z1 = new String[] { "pref_audience_and_tagging", "pref_audiospaces", "pref_your_tweets", "pref_content_you_see", "pref_replies", "pref_mute_and_block", "pref_direct_messages", "pref_discoverability", "pref_ads_preferences", "pref_off_twitter_activity", "pref_inferred_identity", "pref_data_sharing", "pref_location", "pref_privacy_center", "pref_privacy_policy", "pref_contact_us", "pref_safety_mode" };
        a2 = Arrays.asList("pref_content_you_see", "pref_privacy_center", "pref_privacy_policy", "pref_contact_us");
    }
    
    public final void Z1(final Bundle bundle, String s) {
        super.Z1(bundle, s);
        final boolean a = ikq.a().a();
        final String[] z1 = e0l.Z1;
        for (int i = 0; i < 17; ++i) {
            s = z1[i];
            if (a && !e0l.a2.contains(s)) {
                c9y.z((PreferenceGroup)((d)this).A1.g, s);
            }
            else {
                final Preference c0 = ((d)this).c0((CharSequence)s);
                if (c0 != null) {
                    c0.I0 = (Preference$e)this;
                }
            }
        }
        if (asa.b().b("ucpd_enabled", false)) {
            c9y.z((PreferenceGroup)((d)this).A1.g, "pref_off_twitter_activity");
            ((d)this).c0((CharSequence)"pref_category_data_sharing").S(2131957709);
        }
        else {
            c9y.z((PreferenceGroup)((d)this).A1.g, "pref_inferred_identity");
        }
        if (a) {
            c9y.z((PreferenceGroup)((d)this).A1.g, "pref_category_data_sharing");
        }
        if (!asa.b().b("rito_safety_mode_settings_enabled", false)) {
            c9y.z((PreferenceGroup)((d)this).A1.g, "pref_safety_mode");
        }
        if (!djo.l()) {
            c9y.z((PreferenceGroup)((d)this).A1.g, "pref_audiospaces");
        }
        if (!asa.b().b("toxic_reply_filter_settings_enabled", false)) {
            c9y.z((PreferenceGroup)((d)this).A1.g, "pref_replies");
        }
    }
    
    public final String[] f2() {
        return e0l.Z1;
    }
    
    public final int g2() {
        return 2132213803;
    }
    
    public final boolean w0(final Preference preference) {
        final String o0 = preference.O0;
        if (o0 == null) {
            return false;
        }
        int n = -1;
        switch (o0) {
            case "pref_direct_messages": {
                n = 16;
                break;
            }
            case "pref_inferred_identity": {
                n = 15;
                break;
            }
            case "pref_your_tweets": {
                n = 14;
                break;
            }
            case "pref_contact_us": {
                n = 13;
                break;
            }
            case "pref_location": {
                n = 12;
                break;
            }
            case "pref_content_you_see": {
                n = 11;
                break;
            }
            case "pref_ads_preferences": {
                n = 10;
                break;
            }
            case "pref_data_sharing": {
                n = 9;
                break;
            }
            case "pref_audiospaces": {
                n = 8;
                break;
            }
            case "pref_safety_mode": {
                n = 7;
                break;
            }
            case "pref_replies": {
                n = 6;
                break;
            }
            case "pref_discoverability": {
                n = 5;
                break;
            }
            case "pref_privacy_policy": {
                n = 4;
                break;
            }
            case "pref_mute_and_block": {
                n = 3;
                break;
            }
            case "pref_privacy_center": {
                n = 2;
                break;
            }
            case "pref_audience_and_tagging": {
                n = 1;
                break;
            }
            case "pref_off_twitter_activity": {
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
            case 16: {
                final obi h = ((bnd)this).v0().h();
                final n39 n2 = new n39();
                n2.a(true);
                h.d((ym)n2);
                return true;
            }
            case 15: {
                ((bnd)this).v0().h().b((ContentViewArgs)InferredIdentitySettingsViewArgs.INSTANCE);
                return true;
            }
            case 14: {
                ((bnd)this).v0().h().b((ContentViewArgs)YourTweetsSettingsViewArgs.INSTANCE);
                return true;
            }
            case 13: {
                ((bnd)this).v0().h().d((ym)new vmx(Uri.parse(((Fragment)this).W0(2131955869))));
                return true;
            }
            case 12: {
                ((bnd)this).v0().h().b((ContentViewArgs)LocationInformationSettingsViewArgs.INSTANCE);
                return true;
            }
            case 11: {
                ((bnd)this).v0().h().b((ContentViewArgs)ContentYouSeeSettingsViewArgs.INSTANCE);
                return true;
            }
            case 10: {
                ((bnd)this).v0().h().b((ContentViewArgs)AdsPreferencesSettingsViewArgs.INSTANCE);
                return true;
            }
            case 9: {
                ((bnd)this).v0().h().b((ContentViewArgs)DataSharingViewArgs.INSTANCE);
                return true;
            }
            case 8: {
                ((bnd)this).v0().h().b((ContentViewArgs)AudioSpacesPrivacySettingsViewArgs.INSTANCE);
                return true;
            }
            case 7: {
                ((bnd)this).v0().h().b((ContentViewArgs)SafetyModeSettingsViewArgs.INSTANCE);
                return true;
            }
            case 6: {
                ((bnd)this).v0().h().b((ContentViewArgs)ReplySettingsContentViewArgs.INSTANCE);
                return true;
            }
            case 5: {
                ((bnd)this).v0().h().b((ContentViewArgs)DiscoverabilityAndContactsViewArgs.INSTANCE);
                return true;
            }
            case 4: {
                ((bnd)this).v0().h().d((ym)new vmx(Uri.parse(((Fragment)this).W0(2131955872))));
                return true;
            }
            case 3: {
                ((bnd)this).v0().h().b((ContentViewArgs)MuteAndBlockActivityArgs.INSTANCE);
                return true;
            }
            case 2: {
                ((bnd)this).v0().h().d((ym)new vmx(Uri.parse(((Fragment)this).W0(2131955868))));
                return true;
            }
            case 1: {
                ((bnd)this).v0().h().b((ContentViewArgs)AudienceAndTaggingSettingsViewArgs.INSTANCE);
                return true;
            }
            case 0: {
                ((bnd)this).v0().h().b((ContentViewArgs)OffTwitterSettingsViewArgs.INSTANCE);
                return true;
            }
        }
    }
}
