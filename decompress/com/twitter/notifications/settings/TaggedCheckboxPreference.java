// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.settings;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import androidx.preference.CheckBoxPreference;

public class TaggedCheckboxPreference extends CheckBoxPreference
{
    public final String w1;
    
    public TaggedCheckboxPreference(final Context context, final AttributeSet set) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, eg8.P0, 0, 0);
        this.w1 = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
    }
    
    public TaggedCheckboxPreference(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, eg8.P0, n, 0);
        this.w1 = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
    }
    
    public final void C(final kwk kwk) {
        super.C(kwk);
        kwk.F0.findViewById(16908289).setTag((Object)this.w1);
    }
}
