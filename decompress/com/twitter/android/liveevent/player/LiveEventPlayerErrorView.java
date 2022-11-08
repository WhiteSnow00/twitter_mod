// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.player;

import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView;
import android.widget.FrameLayout;

public class LiveEventPlayerErrorView extends FrameLayout
{
    public final TextView C0;
    
    public LiveEventPlayerErrorView(final Context context, final AttributeSet set) {
        super(context, set, 0);
        View.inflate(context, 2131624742, (ViewGroup)this);
        this.C0 = (TextView)((View)this).findViewById(2131429826);
        ((View)this).setBackgroundResource(2131099699);
        ((View)this).setOnClickListener((View$OnClickListener)ywf.D0);
        ((View)this).getContext();
        bl0.a().t();
    }
    
    public void setError(final String text) {
        this.C0.setText((CharSequence)text);
    }
}
