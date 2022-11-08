import androidx.fragment.app.Fragment;
import androidx.preference.d;
import android.content.Intent;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.settings.AppLanguageSettingsContentViewArgs;
import androidx.preference.PreferenceScreen;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import java.util.Objects;
import android.os.Bundle;
import kotlin.Metadata;
import androidx.preference.Preference$e;

// 
// Decompiled by Procyon v0.6.0
// 

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006" }, d2 = { "Lpue;", "Lynd;", "Landroidx/preference/Preference$e;", "<init>", "()V", "a", "feature.tfa.settings.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class pue extends ynd implements Preference$e
{
    public static final pue.pue$a Companion;
    
    static {
        Companion = new pue.pue$a();
    }
    
    public final void Z1(final Bundle bundle, final String s) {
        ((d)this).Y1(2132213792);
        Objects.requireNonNull(pue.Companion);
        final zf4 zf4 = new zf4();
        zf4.T = nca.Companion.e("settings", "languages", "", "", "impression").toString();
        final int a = w4j.a;
        saw.b((okm)zf4);
        ((d)this).d0((CharSequence)"pref_content_language").H0 = (Preference$e)this;
        if (dta.b().b("app_language_setting_enabled", false)) {
            ((d)this).d0((CharSequence)"pref_app_language").H0 = (Preference$e)this;
            final Preference d0 = ((d)this).d0((CharSequence)"pref_content_language");
            d0.T((CharSequence)((Fragment)this).U0().getString(2131957880));
            d0.R((CharSequence)((Fragment)this).U0().getString(2131957879));
        }
        else {
            final PreferenceScreen g = ((d)this).z1.g;
            zzd.e((Object)g, "preferenceScreen");
            rez.F((PreferenceGroup)g, "pref_app_language");
        }
    }
    
    public final boolean w0(final Preference preference) {
        zzd.f((Object)preference, "preference");
        final String n0 = preference.N0;
        final boolean a = zzd.a((Object)n0, (Object)"pref_app_language");
        boolean b = true;
        if (a) {
            this.v0().h().b((ContentViewArgs)AppLanguageSettingsContentViewArgs.INSTANCE);
            pue.Companion.a("app_language");
        }
        else if (zzd.a((Object)n0, (Object)"pref_content_language")) {
            final ldj$a ldj$a = new ldj$a(((Fragment)this).J1());
            final sbs$a j = yqh.j("language_selector");
            j.d = "settings";
            ldj$a.d = (sbs)((h4j)j).e();
            final Intent a2 = ((ldj)((h4j)ldj$a).e()).a();
            zzd.e((Object)a2, "Builder(requireContext()\u2026                  .intent");
            ((Fragment)this).V1(a2);
            pue.Companion.a("content_language");
        }
        else {
            b = false;
        }
        return b;
    }
}
