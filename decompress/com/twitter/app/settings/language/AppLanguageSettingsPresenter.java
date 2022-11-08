// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.settings.language;

import java.util.Locale;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.app.Activity;
import kotlin.Metadata;

@a91
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/twitter/app/settings/language/AppLanguageSettingsPresenter;", "", "feature.tfa.settings.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class AppLanguageSettingsPresenter
{
    public final Activity a;
    public final cn b;
    public final on6 c;
    public final rtb<Context, TaskStackBuilder> d;
    public final otb<Locale> e;
    public final Locale f;
    public boolean g;
    
    public AppLanguageSettingsPresenter(final Activity a, final cn b, final on6 c, final z7x z7x, final sso sso) {
        zzd.f((Object)a, "activity");
        zzd.f((Object)b, "activityArgsIntentFactory");
        zzd.f((Object)c, "contentViewArgsIntentFactory");
        zzd.f((Object)z7x, "viewLifecycle");
        zzd.f((Object)sso, "savedStateHandler");
        final AppLanguageSettingsPresenter$a c2 = AppLanguageSettingsPresenter$a.C0;
        final AppLanguageSettingsPresenter$b c3 = AppLanguageSettingsPresenter$b.C0;
        zzd.f((Object)c2, "taskStackBuilderFactory");
        zzd.f((Object)c3, "localeProvider");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (rtb<Context, TaskStackBuilder>)c2;
        this.e = (otb<Locale>)c3;
        this.f = (Locale)c3.invoke();
        this.g = true;
        sso.b((Object)this);
        z7x.d().subscribe((fk6)new tna((rtb)new gn0(this), 17));
    }
}
