// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.view.accessibility.AccessibilityRecord;
import android.text.InputFilter;
import android.graphics.drawable.Drawable;
import java.util.Objects;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.ActionMode$Callback;
import android.annotation.SuppressLint;
import android.widget.TextView;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.Button;

public class AppCompatButton extends Button implements d91, v9t
{
    public final wj0 C0;
    public final vk0 D0;
    public kk0 E0;
    
    public AppCompatButton(final Context context, final AttributeSet set) {
        this(context, set, 2130968814);
    }
    
    public AppCompatButton(final Context context, final AttributeSet set, final int n) {
        q9t.a(context);
        super(context, set, n);
        mls.a((View)this, ((View)this).getContext());
        (this.C0 = new wj0((View)this)).d(set, n);
        final vk0 d0 = new vk0((TextView)this);
        (this.D0 = d0).h(set, n);
        d0.b();
        this.getEmojiTextViewHelper().b(set, n);
    }
    
    private kk0 getEmojiTextViewHelper() {
        if (this.E0 == null) {
            this.E0 = new kk0((TextView)this);
        }
        return this.E0;
    }
    
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        final wj0 c0 = this.C0;
        if (c0 != null) {
            c0.a();
        }
        final vk0 d0 = this.D0;
        if (d0 != null) {
            d0.b();
        }
    }
    
    public int getAutoSizeMaxTextSize() {
        if (d91.h) {
            return super.getAutoSizeMaxTextSize();
        }
        final vk0 d0 = this.D0;
        if (d0 != null) {
            return Math.round(d0.i.e);
        }
        return -1;
    }
    
    public int getAutoSizeMinTextSize() {
        if (d91.h) {
            return super.getAutoSizeMinTextSize();
        }
        final vk0 d0 = this.D0;
        if (d0 != null) {
            return Math.round(d0.i.d);
        }
        return -1;
    }
    
    public int getAutoSizeStepGranularity() {
        if (d91.h) {
            return super.getAutoSizeStepGranularity();
        }
        final vk0 d0 = this.D0;
        if (d0 != null) {
            return Math.round(d0.i.c);
        }
        return -1;
    }
    
    public int[] getAutoSizeTextAvailableSizes() {
        if (d91.h) {
            return super.getAutoSizeTextAvailableSizes();
        }
        final vk0 d0 = this.D0;
        if (d0 != null) {
            return d0.i.f;
        }
        return new int[0];
    }
    
    @SuppressLint({ "WrongConstant" })
    public int getAutoSizeTextType() {
        final boolean h = d91.h;
        int n = 0;
        if (h) {
            if (super.getAutoSizeTextType() == 1) {
                n = 1;
            }
            return n;
        }
        final vk0 d0 = this.D0;
        if (d0 != null) {
            return d0.i.a;
        }
        return 0;
    }
    
    public ActionMode$Callback getCustomSelectionActionModeCallback() {
        return hjs.g(super.getCustomSelectionActionModeCallback());
    }
    
    public ColorStateList getSupportBackgroundTintList() {
        final wj0 c0 = this.C0;
        ColorStateList b;
        if (c0 != null) {
            b = c0.b();
        }
        else {
            b = null;
        }
        return b;
    }
    
    public PorterDuff$Mode getSupportBackgroundTintMode() {
        final wj0 c0 = this.C0;
        PorterDuff$Mode c2;
        if (c0 != null) {
            c2 = c0.c();
        }
        else {
            c2 = null;
        }
        return c2;
    }
    
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.D0.e();
    }
    
    public PorterDuff$Mode getSupportCompoundDrawablesTintMode() {
        return this.D0.f();
    }
    
    public void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ((AccessibilityRecord)accessibilityEvent).setClassName((CharSequence)Button.class.getName());
    }
    
    public void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)Button.class.getName());
    }
    
    public void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        final vk0 d0 = this.D0;
        if (d0 != null) {
            Objects.requireNonNull(d0);
            if (!d91.h) {
                d0.c();
            }
        }
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        super.onTextChanged(charSequence, n, n2, n3);
        final vk0 d0 = this.D0;
        if (d0 != null && !d91.h && d0.g()) {
            this.D0.c();
        }
    }
    
    public void setAllCaps(final boolean allCaps) {
        super.setAllCaps(allCaps);
        this.getEmojiTextViewHelper().c(allCaps);
    }
    
    public final void setAutoSizeTextTypeUniformWithConfiguration(final int n, final int n2, final int n3, final int n4) throws IllegalArgumentException {
        if (d91.h) {
            super.setAutoSizeTextTypeUniformWithConfiguration(n, n2, n3, n4);
        }
        else {
            final vk0 d0 = this.D0;
            if (d0 != null) {
                d0.k(n, n2, n3, n4);
            }
        }
    }
    
    public final void setAutoSizeTextTypeUniformWithPresetSizes(final int[] array, final int n) throws IllegalArgumentException {
        if (d91.h) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(array, n);
        }
        else {
            final vk0 d0 = this.D0;
            if (d0 != null) {
                d0.l(array, n);
            }
        }
    }
    
    public void setAutoSizeTextTypeWithDefaults(final int autoSizeTextTypeWithDefaults) {
        if (d91.h) {
            super.setAutoSizeTextTypeWithDefaults(autoSizeTextTypeWithDefaults);
        }
        else {
            final vk0 d0 = this.D0;
            if (d0 != null) {
                d0.m(autoSizeTextTypeWithDefaults);
            }
        }
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final wj0 c0 = this.C0;
        if (c0 != null) {
            c0.e();
        }
    }
    
    public void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final wj0 c0 = this.C0;
        if (c0 != null) {
            c0.f(backgroundResource);
        }
    }
    
    public void setCustomSelectionActionModeCallback(final ActionMode$Callback actionMode$Callback) {
        super.setCustomSelectionActionModeCallback(hjs.h((TextView)this, actionMode$Callback));
    }
    
    public void setEmojiCompatEnabled(final boolean b) {
        this.getEmojiTextViewHelper().d(b);
    }
    
    public void setFilters(final InputFilter[] array) {
        super.setFilters(this.getEmojiTextViewHelper().a(array));
    }
    
    public void setSupportAllCaps(final boolean b) {
        final vk0 d0 = this.D0;
        if (d0 != null) {
            d0.j(b);
        }
    }
    
    public void setSupportBackgroundTintList(final ColorStateList list) {
        final wj0 c0 = this.C0;
        if (c0 != null) {
            c0.h(list);
        }
    }
    
    public void setSupportBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        final wj0 c0 = this.C0;
        if (c0 != null) {
            c0.i(porterDuff$Mode);
        }
    }
    
    public void setSupportCompoundDrawablesTintList(final ColorStateList list) {
        this.D0.n(list);
        this.D0.b();
    }
    
    public void setSupportCompoundDrawablesTintMode(final PorterDuff$Mode porterDuff$Mode) {
        this.D0.o(porterDuff$Mode);
        this.D0.b();
    }
    
    public final void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        final vk0 d0 = this.D0;
        if (d0 != null) {
            d0.i(context, n);
        }
    }
    
    public final void setTextSize(final int n, final float n2) {
        final boolean h = d91.h;
        if (h) {
            super.setTextSize(n, n2);
        }
        else {
            final vk0 d0 = this.D0;
            if (d0 != null) {
                Objects.requireNonNull(d0);
                if (!h && !d0.g()) {
                    d0.i.f(n, n2);
                }
            }
        }
    }
}
