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
    public static final int E0 = 0;
    public final TextView D0;
    
    public LiveEventPlayerErrorView(final Context context, final AttributeSet set) {
        super(context, set, 0);
        View.inflate(context, 2131624742, (ViewGroup)this);
        this.D0 = (TextView)((View)this).findViewById(2131429826);
        ((View)this).setBackgroundResource(2131099699);
        ((View)this).setOnClickListener((View$OnClickListener)jwf.D0);
        ((View)this).getContext();
        wk0.b().t();
    }
    
    public void setError(final String text) {
        this.D0.setText((CharSequence)text);
    }
}
