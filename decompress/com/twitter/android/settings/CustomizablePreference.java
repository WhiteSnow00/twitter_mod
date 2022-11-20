// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.settings;

import android.content.res.TypedArray;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.graphics.Typeface;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.preference.Preference;

public class CustomizablePreference extends Preference
{
    public final int D0;
    public final int E0;
    public final boolean F0;
    
    public CustomizablePreference(final Context context) {
        this(context, null);
    }
    
    public CustomizablePreference(final Context context, final AttributeSet set) {
        this(context, set, 16842894);
    }
    
    public CustomizablePreference(Context obtainStyledAttributes, final AttributeSet set, final int n) {
        super(obtainStyledAttributes, set, n);
        obtainStyledAttributes = (Context)obtainStyledAttributes.obtainStyledAttributes(set, w9i.N0, n, 0);
        try {
            this.D0 = ((TypedArray)obtainStyledAttributes).getColor(2, -1);
            this.E0 = ((TypedArray)obtainStyledAttributes).getInt(1, 0);
            this.F0 = ((TypedArray)obtainStyledAttributes).getBoolean(0, false);
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
    
    public final View getView(final View view, final ViewGroup viewGroup) {
        final View view2 = super.getView(view, viewGroup);
        final TextView textView = (TextView)view2.findViewById(16908310);
        final int d0 = this.D0;
        if (d0 != -1) {
            textView.setTextColor(d0);
            textView.setTypeface((Typeface)null, this.E0);
        }
        if (this.F0) {
            final RelativeLayout$LayoutParams layoutParams = (RelativeLayout$LayoutParams)((View)textView).getLayoutParams();
            layoutParams.addRule(14);
            ((View)textView).setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        }
        return view2;
    }
}
