// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.settings;

import android.preference.ListPreference;
import android.preference.PreferenceActivity;
import android.content.Context;
import android.preference.Preference;
import android.preference.TwoStatePreference;
import android.os.Bundle;
import com.twitter.settings.widget.TwitterDropDownPreference;
import android.preference.Preference$OnPreferenceChangeListener;

public class AccessibilityActivity extends ba implements Preference$OnPreferenceChangeListener
{
    public static final int c1 = 0;
    public TwitterDropDownPreference a1;
    public laj<pjw> b1;
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final fg4 fg4 = new fg4();
        ((o1p)fg4).T = dda.g("accessibility_settings", "", "", "", "impression").toString();
        final int a = o5j.a;
        sbw.b((tlm)fg4);
        ((PreferenceActivity)this).addPreferencesFromResource(2132213761);
        if (lp7.f()) {
            this.f("vision_category");
        }
        if (!ita.b().b("android_alt_text_nudges_enabled", false) || !ita.b().b("android_alt_text_nudges_settings", false)) {
            this.f("media_category");
        }
        final boolean b = ita.b().b("double_tap_to_like_user_setting_enabled", false) && ita.b().b("double_tap_to_like_enabled", false);
        final boolean b2 = ita.b().b("explore_tap_to_search", false);
        if (!b) {
            this.f("double_tap_to_like");
        }
        if (!b2) {
            this.f("tap_to_search");
        }
        if (!b2 && !b) {
            this.f("gestures_category");
        }
        this.b1 = (laj<pjw>)super.W0.a((Class)pjw.class);
        ((Preference)(this.a1 = (TwitterDropDownPreference)((PreferenceActivity)this).findPreference((CharSequence)"video_autoplay"))).setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)sf.F0);
        if (ma7.z()) {
            ((ListPreference)this.a1).setValue(fcu.c().j("video_autoplay", tqb.H(fdi.d())));
            ((Preference)this.a1).setEnabled(false);
            ((Preference)this.a1).setSelectable(false);
        }
        else if (((ListPreference)this.a1).getValue() == null) {
            final String h = tqb.H(fdi.d());
            ((ListPreference)this.a1).setValue(h);
            tqb.S(false, h);
        }
        final TwoStatePreference twoStatePreference = (TwoStatePreference)((PreferenceActivity)this).findPreference((CharSequence)"compose_alt_text");
        if (twoStatePreference != null) {
            ((Preference)twoStatePreference).setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
            twoStatePreference.setChecked(pdw.d().A().t);
        }
        final TwoStatePreference twoStatePreference2 = (TwoStatePreference)((PreferenceActivity)this).findPreference((CharSequence)"alt_text_prompt");
        if (twoStatePreference2 != null) {
            ((Preference)twoStatePreference2).setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        }
        final TwoStatePreference twoStatePreference3 = (TwoStatePreference)((PreferenceActivity)this).findPreference((CharSequence)"pref_hashtag_pronunciation_override_enabled");
        if (twoStatePreference3 != null) {
            ((Preference)twoStatePreference3).setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        }
        if (!pdw.d().a()) {
            this.h((CharSequence)flr.l(pdw.d().c()));
        }
    }
    
    public final boolean onPreferenceChange(final Preference preference, Object o) {
        final String key = preference.getKey();
        if (key == null) {
            return false;
        }
        final qdw d = pdw.d();
        int n = -1;
        final int hashCode = key.hashCode();
        if (hashCode != -834303472) {
            if (hashCode != -172235289) {
                if (hashCode == 364902176) {
                    if (key.equals("alt_text_prompt")) {
                        n = 2;
                    }
                }
            }
            else if (key.equals("pref_hashtag_pronunciation_override_enabled")) {
                n = 1;
            }
        }
        else if (key.equals("compose_alt_text")) {
            n = 0;
        }
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    return false;
                }
                final boolean booleanValue = (boolean)o;
                final tsc c = tsc.c();
                vy vy;
                if (booleanValue) {
                    vy = vy.H0;
                }
                else {
                    vy = vy.G0;
                }
                ((wo1)this).H0.a(c.b((osc)new a27(vy, pdw.d().k())).C().I(jxo.c()).y(iqs.j()).G((rk6)y41.K0, (rk6)avf.I0));
                o = new fg4();
                String s;
                if (booleanValue) {
                    s = "altTextNudgeType_prompt";
                }
                else {
                    s = "altTextNudgeType_off";
                }
                ((o1p)o).T = dda.g("accessibility_settings", "", "", s, "selected").toString();
                final int a = o5j.a;
                sbw.b((tlm)o);
            }
            return true;
        }
        final boolean booleanValue2 = (boolean)o;
        d.m((kzt)new o0l(booleanValue2, 1));
        final laj<pjw> b1 = this.b1;
        final tjw v = tjw.v((Context)this, d);
        v.q("include_alt_text_compose", true);
        v.q("alt_text_compose_enabled", booleanValue2);
        b1.d((pnm)((z4j)v).e());
        o = new fg4();
        String s2;
        if (booleanValue2) {
            s2 = "enable";
        }
        else {
            s2 = "disable";
        }
        ((o1p)o).q(new String[] { "accessibility_settings", null, null, "alt_text", s2 });
        sbw.b((tlm)o);
        return true;
    }
}
