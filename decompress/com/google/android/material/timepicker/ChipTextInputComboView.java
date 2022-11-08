// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.timepicker;

import android.widget.CompoundButton;
import android.view.View$OnClickListener;
import android.content.res.Configuration;
import android.os.Build$VERSION;
import android.text.TextUtils;
import java.util.Arrays;
import android.text.InputFilter;
import android.widget.TextView;
import android.view.View;
import android.text.TextWatcher;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.chip.Chip;
import android.widget.Checkable;
import android.widget.FrameLayout;

class ChipTextInputComboView extends FrameLayout implements Checkable
{
    public final Chip C0;
    public final TextInputLayout D0;
    public final EditText E0;
    public ChipTextInputComboView.ChipTextInputComboView$a F0;
    
    public ChipTextInputComboView(final Context context, final AttributeSet set) {
        super(context, set, 0);
        final LayoutInflater from = LayoutInflater.from(context);
        final Chip c0 = (Chip)from.inflate(2131624796, (ViewGroup)this, false);
        (this.C0 = c0).setAccessibilityClassName((CharSequence)"android.view.View");
        final TextInputLayout d0 = (TextInputLayout)from.inflate(2131624797, (ViewGroup)this, false);
        this.D0 = d0;
        final EditText editText = d0.getEditText();
        ((View)(this.E0 = editText)).setVisibility(4);
        ((TextView)editText).addTextChangedListener((TextWatcher)(this.F0 = new ChipTextInputComboView.ChipTextInputComboView$a(this)));
        this.c();
        ((ViewGroup)this).addView((View)c0);
        ((ViewGroup)this).addView((View)d0);
        final TextView textView = (TextView)((View)this).findViewById(2131429933);
        ((View)editText).setSaveEnabled(false);
        ((View)editText).setLongClickable(false);
    }
    
    public final void a(final InputFilter inputFilter) {
        final InputFilter[] filters = ((TextView)this.E0).getFilters();
        final InputFilter[] filters2 = Arrays.copyOf(filters, filters.length + 1);
        filters2[filters.length] = inputFilter;
        ((TextView)this.E0).setFilters(filters2);
    }
    
    public final void b(final CharSequence charSequence) {
        ((TextView)this.C0).setText((CharSequence)tps.a(((View)this).getResources(), charSequence, "%02d"));
        if (!TextUtils.isEmpty((CharSequence)this.E0.getText())) {
            ((TextView)this.E0).removeTextChangedListener((TextWatcher)this.F0);
            ((TextView)this.E0).setText((CharSequence)null);
            ((TextView)this.E0).addTextChangedListener((TextWatcher)this.F0);
        }
    }
    
    public final void c() {
        if (Build$VERSION.SDK_INT >= 24) {
            this.E0.setImeHintLocales(((View)this).getContext().getResources().getConfiguration().getLocales());
        }
    }
    
    public final boolean isChecked() {
        return ((CompoundButton)this.C0).isChecked();
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.c();
    }
    
    public final void setChecked(final boolean checked) {
        this.C0.setChecked(checked);
        final EditText e0 = this.E0;
        final int n = 0;
        int visibility;
        if (checked) {
            visibility = 0;
        }
        else {
            visibility = 4;
        }
        ((View)e0).setVisibility(visibility);
        final Chip c0 = this.C0;
        int visibility2 = n;
        if (checked) {
            visibility2 = 8;
        }
        ((View)c0).setVisibility(visibility2);
        if (this.isChecked()) {
            final EditText e2 = this.E0;
            ((View)e2).requestFocus();
            ((View)e2).post((Runnable)new obx((View)e2));
            if (!TextUtils.isEmpty((CharSequence)this.E0.getText())) {
                final EditText e3 = this.E0;
                e3.setSelection(((CharSequence)e3.getText()).length());
            }
        }
    }
    
    public final void setOnClickListener(final View$OnClickListener onClickListener) {
        ((View)this.C0).setOnClickListener(onClickListener);
    }
    
    public final void setTag(final int n, final Object o) {
        ((View)this.C0).setTag(n, o);
    }
    
    public final void toggle() {
        ((CompoundButton)this.C0).toggle();
    }
}
