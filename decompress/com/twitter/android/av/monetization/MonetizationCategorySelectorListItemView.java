// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.av.monetization;

import android.widget.CompoundButton;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.CheckBox;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.widget.LinearLayout;

public class MonetizationCategorySelectorListItemView extends LinearLayout implements View$OnClickListener
{
    public TextView D0;
    public CheckBox E0;
    public a F0;
    
    public MonetizationCategorySelectorListItemView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public a getListener() {
        cj1.g();
        return this.F0;
    }
    
    public dqh getMonetizationCategory() {
        cj1.g();
        return null;
    }
    
    public final void onClick(final View view) {
        ((CompoundButton)this.E0).setChecked(((CompoundButton)this.E0).isChecked() ^ true);
    }
    
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.D0 = (TextView)((View)this).findViewById(2131430120);
        this.E0 = (CheckBox)((View)this).findViewById(2131430119);
        ((View)this).setOnClickListener((View$OnClickListener)this);
    }
    
    public void setEnabled(final boolean enabled) {
        super.setEnabled(enabled);
        this.D0.setEnabled(enabled);
        ((View)this.E0).setEnabled(enabled);
    }
    
    public void setListener(final a f0) {
        this.F0 = f0;
    }
    
    public interface a
    {
    }
}
