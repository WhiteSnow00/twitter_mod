// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.settings;

import android.preference.PreferenceActivity;
import android.app.Activity;
import java.util.Objects;
import android.preference.Preference;
import android.content.SharedPreferences;
import android.content.Context;
import android.preference.PreferenceManager;
import android.os.Bundle;
import android.preference.EditTextPreference;
import java.util.regex.Pattern;
import android.preference.Preference$OnPreferenceChangeListener;

public class ProxySettingsActivity extends ba implements Preference$OnPreferenceChangeListener
{
    public static final Pattern f1;
    public boolean a1;
    public String b1;
    public String c1;
    public boolean d1;
    public EditTextPreference e1;
    
    static {
        f1 = Pattern.compile("^[a-zA-Z0-9.\\-]+$");
    }
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        ((Activity)this).setTitle(2131957916);
        ((PreferenceActivity)this).addPreferencesFromResource(2132213804);
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences((Context)this);
        this.b1 = defaultSharedPreferences.getString("proxy_host", "");
        this.c1 = defaultSharedPreferences.getString("proxy_port", "");
        this.d1 = defaultSharedPreferences.getBoolean("proxy_enabled", false);
        final Preference preference = ((PreferenceActivity)this).findPreference((CharSequence)"proxy_enabled_switch");
        preference.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        this.e1 = (EditTextPreference)((PreferenceActivity)this).findPreference((CharSequence)"proxy_host");
        if (flr.g((CharSequence)this.b1)) {
            ((Preference)this.e1).setSummary((CharSequence)this.b1);
        }
        ((Preference)this.e1).setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        ((Preference)this.e1).setDependency(preference.getKey());
        final EditTextPreference editTextPreference = (EditTextPreference)((PreferenceActivity)this).findPreference((CharSequence)"proxy_port");
        if (flr.g((CharSequence)this.c1)) {
            ((Preference)editTextPreference).setSummary((CharSequence)this.c1);
        }
        ((Preference)editTextPreference).setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        ((Preference)editTextPreference).setDependency(preference.getKey());
    }
    
    public final void onDestroy() {
        super.onDestroy();
        if (this.a1) {
            zk.a().T3().b();
        }
    }
    
    public final boolean onPreferenceChange(final Preference preference, Object o) {
        final String key = preference.getKey();
        Objects.requireNonNull(key);
        final int hashCode = key.hashCode();
        final boolean b = false;
        final boolean b2 = false;
        boolean a1 = false;
        int n = 0;
        Label_0120: {
            switch (hashCode) {
                case -17635357: {
                    if (!key.equals("proxy_enabled_switch")) {
                        break;
                    }
                    n = 2;
                    break Label_0120;
                }
                case -1861035086: {
                    if (!key.equals("proxy_port")) {
                        break;
                    }
                    n = 1;
                    break Label_0120;
                }
                case -1861273383: {
                    if (!key.equals("proxy_host")) {
                        break;
                    }
                    n = 0;
                    break Label_0120;
                }
            }
            n = -1;
        }
    Label_0230_Outer:
        while (true) {
            Label_0210: {
                switch (n) {
                    default: {
                        break Label_0438;
                    }
                    case 2: {
                        if (this.a1 || (boolean)o != this.d1) {
                            a1 = true;
                        }
                        this.a1 = a1;
                        break Label_0438;
                    }
                    case 1: {
                        final String string = ((EditTextPreference)preference).getEditText().getText().toString();
                        if (flr.e((CharSequence)string)) {
                            break Label_0210;
                        }
                        break Label_0210;
                    }
                    case 0: {
                        Label_0327: {
                            break Label_0327;
                        Block_13_Outer:
                            while (true) {
                                try {
                                    final String string;
                                    boolean b3;
                                    if (Integer.parseInt(string.trim()) < 65535) {
                                        b3 = true;
                                    }
                                    else {
                                        b3 = false;
                                    }
                                    if (b3) {
                                        o = o;
                                        boolean a2 = false;
                                        Label_0283: {
                                            if (!this.a1) {
                                                a2 = b;
                                                if (!flr.g((CharSequence)this.e1.getText())) {
                                                    break Label_0283;
                                                }
                                                a2 = b;
                                                if (this.c1.equals(o)) {
                                                    break Label_0283;
                                                }
                                            }
                                            a2 = true;
                                        }
                                        this.a1 = a2;
                                        if (flr.e((CharSequence)o)) {
                                            preference.setSummary(2131957810);
                                        }
                                        else {
                                            preference.setSummary((CharSequence)o);
                                        }
                                        ((Activity)this).setResult(-1);
                                        return true;
                                    }
                                    ehk.c().c(2131954462, 1);
                                    return false;
                                    while (true) {
                                    Block_14_Outer:
                                        while (true) {
                                            preference.setSummary(2131957807);
                                            continue Label_0230_Outer;
                                            Label_0445: {
                                                ehk.c().c(2131954459, 1);
                                            }
                                            return false;
                                            boolean a3 = false;
                                            Label_0411: {
                                                while (true) {
                                                    a3 = b2;
                                                    iftrue(Label_0411:)(this.b1.equals(o));
                                                    Label_0408:
                                                    a3 = true;
                                                    break Label_0411;
                                                    o = o;
                                                    iftrue(Label_0408:)(this.a1);
                                                    continue Block_13_Outer;
                                                }
                                                Label_0433:
                                                preference.setSummary((CharSequence)o);
                                                continue Label_0230_Outer;
                                            }
                                            this.a1 = a3;
                                            iftrue(Label_0433:)(!flr.e((CharSequence)o));
                                            continue Block_14_Outer;
                                        }
                                        final String string2 = ((EditTextPreference)preference).getEditText().getText().toString();
                                        iftrue(Label_0445:)(!flr.e((CharSequence)string2) && !ProxySettingsActivity.f1.matcher(string2.trim()).matches());
                                        continue;
                                    }
                                }
                                catch (final NumberFormatException ex) {
                                    continue;
                                }
                                break;
                            }
                        }
                        break;
                    }
                }
            }
            break;
        }
    }
    
    public final boolean onSearchRequested() {
        return false;
    }
}
