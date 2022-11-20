// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.settings;

import androidx.recyclerview.widget.RecyclerView$c0;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import androidx.preference.CheckBoxPreference;

public class TaggedCheckboxPreference extends CheckBoxPreference
{
    public final String u1;
    
    public TaggedCheckboxPreference(final Context context, final AttributeSet set) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, lli.E0, 0, 0);
        this.u1 = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
    }
    
    public TaggedCheckboxPreference(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, lli.E0, n, 0);
        this.u1 = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
    }
    
    @Override
    public final void C(final tvk tvk) {
        super.C(tvk);
        ((RecyclerView$c0)tvk).D0.findViewById(16908289).setTag((Object)this.u1);
    }
}
