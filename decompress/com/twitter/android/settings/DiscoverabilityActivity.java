// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.settings;

import android.preference.TwoStatePreference;
import android.preference.PreferenceActivity;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.navigation.settings.RemoveContactsActivityArgs;
import android.app.Activity;
import android.content.Context;
import android.preference.Preference;
import com.twitter.util.user.UserIdentifier;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference$OnPreferenceChangeListener;
import android.preference.Preference$OnPreferenceClickListener;

public class DiscoverabilityActivity extends ba implements Preference$OnPreferenceClickListener, Preference$OnPreferenceChangeListener
{
    public static final int f1 = 0;
    public CheckBoxPreference Y0;
    public CheckBoxPreference Z0;
    public CheckBoxPreference a1;
    public i1g b1;
    public gk6 c1;
    public ez8 d1;
    public z9j<ajw> e1;
    
    public final void k() {
        this.d1.b();
        final boolean c = this.b1.c();
        this.b1.e(2);
        if (c) {
            this.c1.c(((qo1)this).P0, (qsb)new xy8((Object)this, 0));
        }
    }
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final UserIdentifier p = ((qo1)this).P0;
        final int a = fk6.a;
        this.c1 = gk6.Companion.a();
        this.b1 = g4k.e(p).w2();
        this.d1 = new ez8(p);
        ((PreferenceActivity)this).addPreferencesFromResource(2132213780);
        ((Preference)(this.Y0 = (CheckBoxPreference)((PreferenceActivity)this).findPreference((CharSequence)"upload_contacts"))).setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        final Preference preference = ((PreferenceActivity)this).findPreference((CharSequence)"upload_contacts_disconnect");
        ((Preference)this.Y0).setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        preference.setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        preference.setTitle((CharSequence)uoz.v(((Context)this).getResources().getString(2131956981), -65536));
        ((Preference)(this.Z0 = (CheckBoxPreference)((PreferenceActivity)this).findPreference((CharSequence)"discoverable_by_email"))).setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        this.a1 = (CheckBoxPreference)((PreferenceActivity)this).findPreference((CharSequence)"discoverable_by_mobile_phone");
        this.e1 = super.U0.a(ajw.class);
        z6k.b(((zmd)this).v0().D(), 1, (n93)new doa((Object)this, 3));
    }
    
    public final boolean onPreferenceChange(final Preference preference, final Object o) {
        final String key = preference.getKey();
        if (key == null) {
            return false;
        }
        final adw d = zcw.d();
        int n = -1;
        switch (key) {
            case "discoverable_by_email": {
                n = 2;
                break;
            }
            case "discoverable_by_mobile_phone": {
                n = 1;
                break;
            }
            case "upload_contacts": {
                n = 0;
                break;
            }
            default:
                break;
        }
        switch (n) {
            case 2: {
                final boolean equals = Boolean.TRUE.equals(o);
                d.m((ryt<ziw$a, ziw$a>)new yy8(equals, 0));
                final z9j<ajw> e1 = this.e1;
                final ejw v = ejw.v((Context)this, d);
                v.q("discoverable_by_email", equals);
                e1.d((ajw)((n4j)v).e());
                return true;
            }
            case 1: {
                final boolean equals2 = Boolean.TRUE.equals(o);
                d.m((ryt<ziw$a, ziw$a>)new zy8(equals2, 0));
                final z9j<ajw> e2 = this.e1;
                final ejw v2 = ejw.v((Context)this, d);
                v2.q("discoverable_by_mobile_phone", equals2);
                e2.d((ajw)((n4j)v2).e());
                return true;
            }
            case 0: {
                if (!Boolean.TRUE.equals(o)) {
                    this.b1.e(1);
                    this.d1.a();
                    break;
                }
                final g7k d2 = g7k.d();
                if (!d2.a((Context)this, new String[] { "android.permission.READ_CONTACTS" })) {
                    d2.i(1, (Activity)this, new String[] { "android.permission.READ_CONTACTS" });
                    return false;
                }
                this.k();
                break;
            }
        }
        return true;
    }
    
    public final boolean onPreferenceClick(final Preference preference) {
        if ("upload_contacts_disconnect".equals(preference.getKey())) {
            ((zmd)this).v0().h().b((ContentViewArgs)new RemoveContactsActivityArgs());
            return true;
        }
        return false;
    }
    
    public final void onResume() {
        super.onResume();
        ((TwoStatePreference)this.Y0).setChecked(i1g.a(super.V0).d());
        ((TwoStatePreference)this.Z0).setChecked(zcw.d().A().i);
        final trc c = trc.c();
        ((Preference)this.Z0).setSummary((CharSequence)((Context)this).getString(2131957751));
        final vz9 vz9 = new vz9(UserIdentifier.getCurrent());
        ((anm)vz9).U((wv0$b)new az8(this));
        c.f((orc)vz9);
        if (this.a1 != null) {
            final jck a = jck.a(((qo1)this).P0);
            ((Preference)this.a1).setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
            ((TwoStatePreference)this.a1).setChecked(zcw.d().A().n);
            ((Preference)this.a1).setSummary((CharSequence)((Context)this).getString(2131957894));
            if (!a.b() && !a.b) {
                ((Preference)this.a1).setSummary((CharSequence)((Context)this).getString(2131957734));
            }
            else {
                final int a2 = vbk.a;
                wbk.Companion.a().a((wbk$a)new scn((Object)this, 6));
            }
        }
    }
}
