// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.settings;

import com.twitter.app.common.account.a;
import com.twitter.app.common.account.AppAccountManager;
import android.preference.PreferenceActivity;
import android.content.Context;
import android.preference.ListPreference;
import com.twitter.app.common.account.d;
import com.twitter.app.common.account.c;
import android.content.ContentResolver;
import android.preference.Preference;
import android.os.Bundle;
import com.twitter.util.user.UserIdentifier;
import com.twitter.settings.widget.TwitterDropDownPreference;
import android.preference.TwoStatePreference;
import android.preference.Preference$OnPreferenceChangeListener;

public class DataSettingsActivity extends ba implements Preference$OnPreferenceChangeListener
{
    public static final int p1 = 0;
    public boolean a1;
    public int b1;
    public iwi c1;
    public m88 d1;
    public TwoStatePreference e1;
    public TwitterDropDownPreference f1;
    public TwitterDropDownPreference g1;
    public TwitterDropDownPreference h1;
    public TwitterDropDownPreference i1;
    public TwitterDropDownPreference j1;
    public TwitterDropDownPreference k1;
    public TwitterDropDownPreference l1;
    public UserIdentifier m1;
    public final boolean n1;
    public final boolean o1;
    
    public DataSettingsActivity() {
        this.n1 = ita.c().b("android_photo_upload_high_quality_enabled", false);
        this.o1 = ktr.a().O().b();
    }
    
    public final void k(final boolean b) {
        this.e1.setChecked(fcu.c().e("sync_data", false));
        ((Preference)this.e1).setEnabled(b);
        ((Preference)this.e1).setSelectable(b);
        ((Preference)this.l1).setEnabled(b);
        ((Preference)this.l1).setSelectable(b);
    }
    
    public final void l(final boolean b) {
        ((ListPreference)this.f1).setValue(fcu.c().j("video_autoplay", tqb.H(fdi.d())));
        ((ListPreference)this.g1).setValue(fcu.c().j("video_quality", "wifi_only"));
        ((ListPreference)this.j1).setValue(fcu.c().j("image_quality", "wifi_and_mobile"));
        ((Preference)this.f1).setEnabled(b);
        ((Preference)this.f1).setSelectable(b);
        ((Preference)this.g1).setEnabled(b);
        ((Preference)this.g1).setSelectable(b);
        ((Preference)this.j1).setEnabled(b);
        ((Preference)this.j1).setSelectable(b);
        if (this.o1) {
            ((ListPreference)this.i1).setValue(fcu.c().j("video_quality_upload", l3x.a()));
            ((Preference)this.i1).setEnabled(b);
            ((Preference)this.i1).setSelectable(b);
        }
        else {
            ((ListPreference)this.h1).setValue(fcu.c().j("video_quality_720p_upload", l3x.b()));
            ((Preference)this.h1).setEnabled(b);
            ((Preference)this.h1).setSelectable(b);
        }
        if (this.n1) {
            ((ListPreference)this.k1).setValue(fcu.c().j("image_quality_upload", "wifi_and_mobile"));
            ((Preference)this.k1).setEnabled(b);
            ((Preference)this.k1).setSelectable(b);
        }
    }
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final fg4 fg4 = new fg4();
        ((o1p)fg4).T = dda.g("settings", "data_usage", "", "", "impression").toString();
        final int a = o5j.a;
        sbw.b((tlm)fg4);
        this.d1 = new m88(fcu.c());
        ((PreferenceActivity)this).addPreferencesFromResource(2132213775);
        final TwitterDropDownPreference f1 = (TwitterDropDownPreference)((PreferenceActivity)this).findPreference((CharSequence)"video_autoplay");
        this.f1 = f1;
        if (((ListPreference)f1).getValue() == null) {
            final String h = tqb.H(fdi.d());
            ((ListPreference)this.f1).setValue(h);
            tqb.S(false, h);
        }
        final TwitterDropDownPreference g1 = (TwitterDropDownPreference)((PreferenceActivity)this).findPreference((CharSequence)"video_quality");
        this.g1 = g1;
        if (((ListPreference)g1).getValue() == null) {
            ((ListPreference)this.g1).setValue(yhc.b());
        }
        if (this.o1) {
            this.f("video_quality_720p_upload");
            final TwitterDropDownPreference i1 = (TwitterDropDownPreference)((PreferenceActivity)this).findPreference((CharSequence)"video_quality_upload");
            this.i1 = i1;
            if (((ListPreference)i1).getValue() == null) {
                ((ListPreference)this.i1).setValue(l3x.a());
            }
        }
        else {
            this.f("video_quality_upload");
            final TwitterDropDownPreference h2 = (TwitterDropDownPreference)((PreferenceActivity)this).findPreference((CharSequence)"video_quality_720p_upload");
            this.h1 = h2;
            if (((ListPreference)h2).getValue() == null) {
                ((ListPreference)this.h1).setValue(l3x.b());
            }
        }
        final TwitterDropDownPreference j1 = (TwitterDropDownPreference)((PreferenceActivity)this).findPreference((CharSequence)"image_quality");
        this.j1 = j1;
        if (((ListPreference)j1).getValue() == null) {
            ((ListPreference)this.j1).setValue("wifi_and_mobile");
        }
        if (this.n1) {
            final TwitterDropDownPreference k1 = (TwitterDropDownPreference)((PreferenceActivity)this).findPreference((CharSequence)"image_quality_upload");
            this.k1 = k1;
            if (((ListPreference)k1).getValue() == null) {
                ((ListPreference)this.k1).setValue("never");
            }
        }
        else {
            this.f("image_quality_upload");
        }
        this.e1 = (TwoStatePreference)((PreferenceActivity)this).findPreference((CharSequence)"sync_data");
        this.l1 = (TwitterDropDownPreference)((PreferenceActivity)this).findPreference((CharSequence)"polling_interval");
        ((Preference)this.f1).setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        ((Preference)this.g1).setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        ((Preference)this.j1).setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        this.m1 = UserIdentifier.getCurrent();
        final TwoStatePreference twoStatePreference = (TwoStatePreference)((PreferenceActivity)this).findPreference((CharSequence)"pref_data_saver");
        if (twoStatePreference.isChecked()) {
            this.l(false);
            this.k(false);
        }
        ((Preference)twoStatePreference).setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        if (!pdw.d().a()) {
            this.h((CharSequence)flr.l(pdw.d().c()));
        }
    }
    
    public final boolean onPreferenceChange(final Preference preference, Object o) {
        final String key = preference.getKey();
        if (key == null) {
            return false;
        }
        key.hashCode();
        int n = -1;
        switch (key) {
            case "video_quality_720p_upload": {
                n = 6;
                break;
            }
            case "video_quality_upload": {
                n = 5;
                break;
            }
            case "image_quality_upload": {
                n = 4;
                break;
            }
            case "image_quality": {
                n = 3;
                break;
            }
            case "video_autoplay": {
                n = 2;
                break;
            }
            case "pref_data_saver": {
                n = 1;
                break;
            }
            case "video_quality": {
                n = 0;
                break;
            }
            default:
                break;
        }
        switch (n) {
            default: {
                return true;
            }
            case 6: {
                if (!this.o1 && o instanceof String) {
                    final fg4 fg4 = new fg4();
                    ((o1p)fg4).q(new String[] { lb0.D("settings::720p_quality_video_upload::", o) });
                    sbw.b((tlm)fg4);
                }
                return true;
            }
            case 5: {
                if (this.o1 && o instanceof String) {
                    final fg4 fg5 = new fg4();
                    ((o1p)fg5).q(new String[] { lb0.D("settings::1080p_quality_video_upload::", o) });
                    sbw.b((tlm)fg5);
                }
                return true;
            }
            case 4: {
                if (this.n1 && o instanceof String) {
                    final fg4 fg6 = new fg4();
                    ((o1p)fg6).q(new String[] { lb0.D("settings::high_quality_images_upload::", o) });
                    sbw.b((tlm)fg6);
                }
                return true;
            }
            case 3: {
                if (o instanceof String) {
                    final fg4 fg7 = new fg4();
                    ((o1p)fg7).q(new String[] { lb0.D("settings::high_quality_images::", o) });
                    sbw.b((tlm)fg7);
                }
                return true;
            }
            case 2: {
                if (o instanceof String) {
                    tqb.S(true, o.toString());
                }
                return true;
            }
            case 1: {
                if (o instanceof Boolean) {
                    final boolean booleanValue = (boolean)o;
                    final m88 d1 = this.d1;
                    if (booleanValue) {
                        d1.b("video_autoplay", "prev_video_autoplay");
                        d1.b("video_quality", "prev_video_quality");
                        d1.b("video_quality_720p_upload", "prev_video_quality_720p_upload");
                        d1.b("video_quality_upload", "prev_video_quality_upload");
                        d1.b("image_quality", "prev_image_quality");
                        d1.b("image_quality_upload", "prev_image_quality_upload");
                        d1.a.i().f("prev_data_sync", d1.a.e("sync_data", false)).e();
                        d1.a.i().b("video_autoplay", "never").e();
                        tqb.S(false, "never");
                        d1.a.i().b("video_quality", "never").e();
                        d1.a.i().b("video_quality_720p_upload", "never").e();
                        d1.a.i().b("video_quality_upload", "never").e();
                        d1.a.i().b("image_quality", "never").e();
                        d1.a.i().b("image_quality_upload", "never").e();
                        d1.a.i().f("sync_data", false).e();
                    }
                    else {
                        d1.a("video_autoplay", "prev_video_autoplay");
                        tqb.S(false, d1.a.j("prev_video_autoplay", tqb.H(fdi.d())));
                        d1.a("video_quality", "prev_video_quality");
                        d1.a("video_quality_720p_upload", "prev_video_quality_720p_upload");
                        d1.a("video_quality_upload", "prev_video_quality_upload");
                        d1.a("image_quality", "prev_image_quality");
                        d1.a("image_quality_upload", "prev_image_quality_upload");
                        d1.a.i().f("sync_data", d1.a.e("prev_data_sync", false)).e();
                    }
                    this.l(booleanValue ^ true);
                    this.k(booleanValue ^ true);
                    o = new fg4();
                    final StringBuilder f = ehk.f("settings::data_saver::");
                    String s;
                    if (booleanValue) {
                        s = "on";
                    }
                    else {
                        s = "off";
                    }
                    f.append(s);
                    ((o1p)o).q(new String[] { f.toString() });
                    sbw.b((tlm)o);
                }
                return true;
            }
            case 0: {
                if (o instanceof String) {
                    final fg4 fg8 = new fg4();
                    final int c = yhc.c(o.toString());
                    String s2;
                    if (c != 2) {
                        if (c != 3) {
                            s2 = "settings::video_quality::cellular_wifi";
                        }
                        else {
                            s2 = "settings::video_quality::off";
                        }
                    }
                    else {
                        s2 = "settings::video_quality::wifi";
                    }
                    ((o1p)fg8).q(new String[] { s2 });
                    sbw.b((tlm)fg8);
                }
                return true;
            }
        }
    }
    
    public final void onStart() {
        super.onStart();
        final boolean masterSyncAutomatically = ContentResolver.getMasterSyncAutomatically();
        final mwi a = lwi.a();
        final UserIdentifier x0 = super.X0;
        ((wo1)this).H0.a(a.c(x0).w((rtb)new ql2((Object)this, (Object)x0, 1)).G((rk6)new q88((Object)this, masterSyncAutomatically, 0), (rk6)lvb.e));
    }
    
    public final void onStop() {
        super.onStop();
        final c c = (c)((AppAccountManager)d.i()).c(this.m1);
        if (c != null) {
            final boolean checked = this.e1.isChecked();
            final boolean b = this.a1 != checked;
            final int int1 = Integer.parseInt(((ListPreference)((PreferenceActivity)this).findPreference((CharSequence)"polling_interval")).getValue());
            final boolean b2 = this.b1 != int1;
            if (b) {
                ((a)c).b(checked);
                String s;
                if (checked) {
                    s = "settings::::enable_sync";
                }
                else {
                    s = "settings::::disable_sync";
                }
                final fg4 fg4 = new fg4(super.X0);
                ((o1p)fg4).q(new String[] { s });
                sbw.b((tlm)fg4);
            }
            final Context applicationContext = ((Context)this).getApplicationContext();
            final mwi a = lwi.a();
            final UserIdentifier b3 = ((a)c).b;
            final iwi c2 = this.c1;
            if (c2 != null) {
                final iwi$a iwi$a = new iwi$a();
                iwi$a.e = int1;
                iwi$a.a = b3;
                iwi$a.d = c2.d;
                iwi$a.c = c2.c;
                iwi$a.f = c2.f;
                iwi$a.b = c2.b;
                xw0.c((sj)new p88(a, (iwi)((z4j)iwi$a).e(), applicationContext, b2, b, checked));
            }
            this.a1 = checked;
            this.b1 = int1;
        }
    }
}
