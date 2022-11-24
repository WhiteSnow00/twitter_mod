// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.settings;

import android.preference.PreferenceActivity;
import android.app.Activity;
import android.preference.Preference;
import android.preference.Preference$OnPreferenceClickListener;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

public class AboutActivity extends ba
{
    public static final int a1 = 0;
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        ((Activity)this).setTitle(2131951767);
        final gn a = fn.a();
        ((PreferenceActivity)this).addPreferencesFromResource(2132213760);
        ((PreferenceActivity)this).findPreference((CharSequence)"ads_info").setIntent(a.a((Context)this, (cn)new mnx(Uri.parse(((Context)this).getString(2131951922).replace("locale", o9a.u(g6s.c()))))));
        ((PreferenceActivity)this).findPreference((CharSequence)"about").setIntent(a.a((Context)this, (cn)new mnx(Uri.parse(((Context)this).getString(2131951774)))));
        ((PreferenceActivity)this).findPreference((CharSequence)"accessibility").setIntent(a.a((Context)this, (cn)new mnx(Uri.parse(((Context)this).getString(2131951800)))));
        ((PreferenceActivity)this).findPreference((CharSequence)"advertising").setIntent(a.a((Context)this, (cn)new mnx(Uri.parse(((Context)this).getString(2131951934).replace("locale", o9a.u(g6s.c()))))));
        ((PreferenceActivity)this).findPreference((CharSequence)"blog").setIntent(a.a((Context)this, (cn)new mnx(Uri.parse(((Context)this).getString(2131952229)))));
        ((PreferenceActivity)this).findPreference((CharSequence)"brand_resources").setIntent(a.a((Context)this, (cn)new mnx(Uri.parse(((Context)this).getString(2131952245)))));
        ((PreferenceActivity)this).findPreference((CharSequence)"careers").setIntent(a.a((Context)this, (cn)new mnx(Uri.parse(((Context)this).getString(2131952386)))));
        ((PreferenceActivity)this).findPreference((CharSequence)"developers").setIntent(a.a((Context)this, (cn)new mnx(Uri.parse(((Context)this).getString(2131953107)))));
        ((PreferenceActivity)this).findPreference((CharSequence)"directory").setIntent(a.a((Context)this, (cn)new mnx(Uri.parse(((Context)this).getString(2131953127)))));
        ((PreferenceActivity)this).findPreference((CharSequence)"marketing").setIntent(a.a((Context)this, (cn)new mnx(Uri.parse(((Context)this).getString(2131954924)))));
        ((PreferenceActivity)this).findPreference((CharSequence)"status").setIntent(a.a((Context)this, (cn)new mnx(Uri.parse(((Context)this).getString(2131958528)))));
        ((PreferenceActivity)this).findPreference((CharSequence)"twitter_business").setIntent(a.a((Context)this, (cn)new mnx(Uri.parse(((Context)this).getString(2131959257).replace("locale", o9a.u(g6s.c()))))));
        final Preference preference = ((PreferenceActivity)this).findPreference((CharSequence)"about_version");
        final xk0 b = po.b();
        b.c();
        b.d();
        preference.setSummary((CharSequence)((Context)this).getString(2131951775, new Object[] { "9.65.6-release.0" }));
        preference.setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new d7(this));
        ((PreferenceActivity)this).findPreference((CharSequence)"help_center").setIntent(a.a((Context)this, (cn)new mnx(Uri.parse(((Context)this).getString(2131954292)))));
        ((PreferenceActivity)this).findPreference((CharSequence)"legal").setIntent(a.a((Context)this, (cn)new mnx(Uri.parse("file:///android_asset/legal.html"))).putExtra("mime_type", "text/html").putExtra("set_disable_javascript", true).putExtra("file_uri", "legal.html"));
        ((PreferenceActivity)this).findPreference((CharSequence)"tos").setIntent(a.a((Context)this, (cn)new mnx(Uri.parse(((Context)this).getString(2131958997)))));
        ((PreferenceActivity)this).findPreference((CharSequence)"pp").setIntent(a.a((Context)this, (cn)new mnx(Uri.parse(((Context)this).getString(2131955872)))));
        ((PreferenceActivity)this).findPreference((CharSequence)"cu").setIntent(a.a((Context)this, (cn)new mnx(Uri.parse(((Context)this).getString(2131952886)))));
    }
    
    public final boolean onSearchRequested() {
        return false;
    }
}
