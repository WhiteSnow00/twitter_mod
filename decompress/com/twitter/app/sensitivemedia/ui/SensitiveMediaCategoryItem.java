// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.sensitivemedia.ui;

import android.widget.CompoundButton;
import android.widget.TextView;
import android.view.View;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.widget.CheckBox;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import kotlin.Metadata;
import android.widget.FrameLayout;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000b¨\u0006\r" }, d2 = { "Lcom/twitter/app/sensitivemedia/ui/SensitiveMediaCategoryItem;", "Landroid/widget/FrameLayout;", "Lcom/twitter/ui/components/text/legacy/TypefacesTextView;", "titleView$delegate", "Lqwe;", "getTitleView", "()Lcom/twitter/ui/components/text/legacy/TypefacesTextView;", "titleView", "Landroid/widget/CheckBox;", "checkboxView$delegate", "getCheckboxView", "()Landroid/widget/CheckBox;", "checkboxView", "feature.tfa.sensitivemedia.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class SensitiveMediaCategoryItem extends FrameLayout
{
    public final n4s D0;
    public final n4s E0;
    
    public SensitiveMediaCategoryItem(final Context context, final AttributeSet set) {
        czd.f((Object)context, "context");
        super(context, set, 0);
        this.D0 = (n4s)pps.n((nsb)new cip(this));
        this.E0 = (n4s)pps.n((nsb)new bip(this));
        ((View)this).setMinimumHeight(context.getResources().getDimensionPixelSize(2131167443));
        LayoutInflater.from(context).inflate(2131625650, (ViewGroup)this);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, w9i.F0, 0, 0);
        czd.e((Object)obtainStyledAttributes, "context.obtainStyledAttr\u2026oryItem, defStyleAttr, 0)");
        ((TextView)this.getTitleView()).setText((CharSequence)obtainStyledAttributes.getString(1));
        ((CompoundButton)this.getCheckboxView()).setChecked(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
    }
    
    private final CheckBox getCheckboxView() {
        final Object value = this.E0.getValue();
        czd.e(value, "<get-checkboxView>(...)");
        return (CheckBox)value;
    }
    
    private final TypefacesTextView getTitleView() {
        final Object value = this.D0.getValue();
        czd.e(value, "<get-titleView>(...)");
        return (TypefacesTextView)value;
    }
    
    public final void a(final boolean checked) {
        ((CompoundButton)this.getCheckboxView()).setChecked(checked);
    }
}
