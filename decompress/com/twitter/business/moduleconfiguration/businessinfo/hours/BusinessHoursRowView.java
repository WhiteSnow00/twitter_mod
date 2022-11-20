// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo.hours;

import android.widget.CompoundButton;
import android.view.accessibility.AccessibilityRecord;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import android.content.res.TypedArray;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.RadioButton;
import kotlin.Metadata;
import android.widget.LinearLayout;

@Metadata(bv = {}, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f" }, d2 = { "Lcom/twitter/business/moduleconfiguration/businessinfo/hours/BusinessHoursRowView;", "Landroid/widget/LinearLayout;", "", "isChecked", "Lfzv;", "setChecked", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "feature.tfa.business.module-configuration.business-info_release" }, k = 1, mv = { 1, 7, 1 })
public final class BusinessHoursRowView extends LinearLayout
{
    public final RadioButton D0;
    
    public BusinessHoursRowView(final Context context, final AttributeSet set) {
        czd.f((Object)context, "context");
        czd.f((Object)set, "attrs");
        super(context, set);
        LayoutInflater.from(context).inflate(2131624137, (ViewGroup)this);
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(set, lp.F0, 0, 0);
        try {
            final String string = obtainStyledAttributes.getString(0);
            String text = "";
            String text2 = string;
            if (string == null) {
                text2 = "";
            }
            final String string2 = obtainStyledAttributes.getString(1);
            if (string2 != null) {
                text = string2;
            }
            obtainStyledAttributes.recycle();
            final View viewById = ((View)this).findViewById(2131429485);
            czd.e((Object)viewById, "findViewById(R.id.hours_radio_button)");
            this.D0 = (RadioButton)viewById;
            ((TextView)((View)this).findViewById(2131429487)).setText((CharSequence)text2);
            ((TextView)((View)this).findViewById(2131429488)).setText((CharSequence)text);
        }
        finally {
            obtainStyledAttributes.recycle();
        }
    }
    
    public final void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent != null) {
            ((AccessibilityRecord)accessibilityEvent).setChecked(((CompoundButton)this.D0).isChecked());
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }
    
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        if (accessibilityNodeInfo != null) {
            accessibilityNodeInfo.setCheckable(true);
        }
        if (accessibilityNodeInfo != null) {
            accessibilityNodeInfo.setChecked(((CompoundButton)this.D0).isChecked());
        }
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }
    
    public final void setChecked(final boolean checked) {
        ((CompoundButton)this.D0).setChecked(checked);
    }
}
