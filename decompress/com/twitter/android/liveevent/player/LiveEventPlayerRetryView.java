// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.player;

import android.widget.ImageView;
import android.view.ViewGroup;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView;
import android.widget.RelativeLayout;

public class LiveEventPlayerRetryView extends RelativeLayout
{
    public final TextView D0;
    
    public LiveEventPlayerRetryView(final Context context, final AttributeSet set) {
        super(context, set, 0);
        View.inflate(context, 2131624743, (ViewGroup)this);
        this.D0 = (TextView)((View)this).findViewById(2131429826);
        final ImageView imageView = (ImageView)((View)this).findViewById(2131429824);
        ((View)this).getContext();
        wk0.b().t();
    }
    
    public void setError(final String text) {
        this.D0.setText((CharSequence)text);
    }
}
