// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.settings.widget;

import android.widget.AdapterView;
import android.preference.ListPreference;
import android.preference.Preference;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.SpinnerAdapter;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.Spinner;
import android.widget.ArrayAdapter;

public class TwitterDropDownPreference extends rlf
{
    public final ArrayAdapter<String> C0;
    public Spinner D0;
    public TwitterDropDownPreference.TwitterDropDownPreference$b E0;
    public final TwitterDropDownPreference$a F0;
    
    public TwitterDropDownPreference(final Context context) {
        this(context, null);
    }
    
    public TwitterDropDownPreference(final Context context, final AttributeSet set) {
        this(context, set, null, null);
    }
    
    public TwitterDropDownPreference(final Context context, final AttributeSet set, final Spinner d0, final TwitterDropDownPreference.TwitterDropDownPreference$b e0) {
        super(context, set);
        this.F0 = new TwitterDropDownPreference$a(this);
        this.C0 = (ArrayAdapter<String>)new ArrayAdapter(((Preference)this).getContext(), 17367049);
        this.D0 = d0;
        this.E0 = e0;
        this.e();
        ((Preference)this).setLayoutResource(2131625910);
    }
    
    public final void e() {
        this.C0.clear();
        if (((ListPreference)this).getEntries() != null) {
            final CharSequence[] entries = ((ListPreference)this).getEntries();
            for (int length = entries.length, i = 0; i < length; ++i) {
                this.C0.add((Object)entries[i].toString());
            }
        }
    }
    
    public final void notifyChanged() {
        super.notifyChanged();
        this.C0.notifyDataSetChanged();
    }
    
    public final void onBindView(final View view) {
        (this.D0 = (Spinner)view.findViewById(2131431669)).setAdapter((SpinnerAdapter)this.C0);
        ((AdapterView)this.D0).setOnItemSelectedListener((AdapterView$OnItemSelectedListener)this.F0);
        final Spinner d0 = this.D0;
        final String value = ((ListPreference)this).getValue();
        final CharSequence[] entryValues = ((ListPreference)this).getEntryValues();
        int i = 0;
        Label_0094: {
            if (value != null && entryValues != null) {
                for (int i = 0; i < entryValues.length; ++i) {
                    if (pjr.c(entryValues[i], (CharSequence)value)) {
                        break Label_0094;
                    }
                }
            }
            i = -1;
        }
        ((AdapterView)d0).setSelection(i);
        super.onBindView(view);
    }
    
    public final void onClick() {
        final TwitterDropDownPreference.TwitterDropDownPreference$b e0 = this.E0;
        if (e0 != null && e0.a()) {
            return;
        }
        this.D0.performClick();
    }
    
    public final void setEntries(final CharSequence[] entries) {
        super.setEntries(entries);
        this.e();
    }
}
