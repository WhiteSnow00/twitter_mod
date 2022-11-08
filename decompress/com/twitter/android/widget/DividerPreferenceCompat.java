// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.widget;

import android.util.AttributeSet;
import android.content.Context;
import androidx.preference.Preference;

public class DividerPreferenceCompat extends Preference
{
    public DividerPreferenceCompat(final Context context) {
        this(context, null);
    }
    
    public DividerPreferenceCompat(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public DividerPreferenceCompat(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        super.g1 = 2131624290;
    }
}
