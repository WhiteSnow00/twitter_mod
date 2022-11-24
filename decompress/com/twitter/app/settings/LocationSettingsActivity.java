// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.settings;

import android.preference.TwoStatePreference;
import android.preference.PreferenceGroup;
import android.preference.PreferenceActivity;
import android.app.Dialog;
import androidx.appcompat.app.e;
import android.app.Activity;
import android.os.Bundle;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import android.preference.Preference;
import android.preference.CheckBoxPreference;
import android.preference.Preference$OnPreferenceChangeListener;

public class LocationSettingsActivity extends ba implements Preference$OnPreferenceChangeListener
{
    public static final int d1 = 0;
    public CheckBoxPreference a1;
    public Preference b1;
    public Preference c1;
    
    public final void k() {
        if (!s1c.c(UserIdentifier.getCurrent()).h()) {
            final nem nem = new nem((Object)this, 2);
            final jng jng = new jng((Context)this, 0);
            jng.m(2131953116);
            final jng n = jng.p(2131955542, (DialogInterface$OnClickListener)nem).n(2131952374, (DialogInterface$OnClickListener)nem);
            ((e.a)n).a.n = false;
            ((Dialog)n.create()).show();
        }
    }
    
    public final void l() {
        if (s1c.c(UserIdentifier.getCurrent()).g()) {
            ((PreferenceGroup)((PreferenceActivity)this).getPreferenceScreen()).removePreference(this.b1);
        }
        else {
            ((PreferenceGroup)((PreferenceActivity)this).getPreferenceScreen()).addPreference(this.b1);
        }
        if (s1c.c(UserIdentifier.getCurrent()).h()) {
            ((PreferenceGroup)((PreferenceActivity)this).getPreferenceScreen()).removePreference(this.c1);
        }
        else {
            ((PreferenceGroup)((PreferenceActivity)this).getPreferenceScreen()).addPreference(this.c1);
        }
    }
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        fj1.b(z6g.a(UserIdentifier.getCurrent()).C0());
        ((PreferenceActivity)this).addPreferencesFromResource(2132213794);
        ((Preference)(this.a1 = (CheckBoxPreference)((PreferenceActivity)this).findPreference((CharSequence)"pref_precise_location"))).setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        ((TwoStatePreference)this.a1).setChecked(ru8.c(UserIdentifier.getCurrent()).d());
        this.b1 = ((PreferenceActivity)this).findPreference((CharSequence)"pref_location_permission_message");
        this.c1 = ((PreferenceActivity)this).findPreference((CharSequence)"pref_system_location_message");
        this.l();
        n7k.b(((znd)this).v0().D(), 1, (fa3)new rp3((Object)this, 13));
    }
    
    public final boolean onPreferenceChange(final Preference preference, final Object o) {
        final String key = preference.getKey();
        if (key == null) {
            return false;
        }
        if (!key.equals("pref_precise_location")) {
            return false;
        }
        final boolean booleanValue = (boolean)o;
        if (booleanValue) {
            if (!s1c.c(UserIdentifier.getCurrent()).g()) {
                u7k.d().i(1, (Activity)this, new String[] { "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION" });
            }
            else {
                this.k();
            }
        }
        ru8.c(UserIdentifier.getCurrent()).g(booleanValue);
        return true;
    }
    
    public final void onResume() {
        super.onResume();
        this.l();
    }
}
