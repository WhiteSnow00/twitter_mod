import android.content.Intent;
import com.twitter.navigation.settings.LanguagesSettingsViewArgs;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.navigation.settings.AccessibilityDisplayRootCompatViewArgs;
import com.twitter.settings.a11ydisplayroot.api.AccessibilityDisplayRootContentViewArgs;
import android.app.TaskStackBuilder;
import android.content.Context;
import com.twitter.app.settings.language.AppLanguageSettingsPresenter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bn0 extends ste implements qsb<tmi, fzv>
{
    public final AppLanguageSettingsPresenter D0;
    
    public bn0(final AppLanguageSettingsPresenter d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final tmi tmi = (tmi)o;
        final AppLanguageSettingsPresenter d0 = this.D0;
        if (!d0.g && !czd.a((Object)d0.f, d0.e.invoke())) {
            final AppLanguageSettingsPresenter d2 = this.D0;
            final Intent addFlags = d2.b.a((Context)d2.a, mfg.a(wfg.F0)).addFlags(268468224);
            czd.e((Object)addFlags, "activityArgsIntentFactor\u2026FLAG_ACTIVITY_CLEAR_TASK)");
            final TaskStackBuilder addNextIntent = ((TaskStackBuilder)d2.d.invoke((Object)d2.a)).addNextIntent(addFlags);
            final Intent a = d2.b.a((Context)d2.a, new app());
            Object o2;
            if (asa.b().b("android_client_ui_modern_settings_compose_arch_enabled", false)) {
                o2 = AccessibilityDisplayRootContentViewArgs.INSTANCE;
            }
            else {
                o2 = AccessibilityDisplayRootCompatViewArgs.INSTANCE;
            }
            addNextIntent.addNextIntent(a).addNextIntent(d2.c.a((Context)d2.a, (ContentViewArgs)o2)).addNextIntent(d2.c.a((Context)d2.a, (ContentViewArgs)LanguagesSettingsViewArgs.INSTANCE));
            addNextIntent.addNextIntent(d2.a.getIntent()).startActivities();
        }
        this.D0.g = false;
        return fzv.a;
    }
}
