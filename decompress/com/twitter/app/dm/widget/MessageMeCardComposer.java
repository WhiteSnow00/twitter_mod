// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.dm.widget;

import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import com.twitter.tweetview.core.QuoteView;

public class MessageMeCardComposer extends b<b.a>
{
    public final QuoteView Q0;
    public final View R0;
    
    public MessageMeCardComposer(final Context context, final AttributeSet set) {
        super(context, set);
        ((View)this).findViewById(2131429951).setVisibility(8);
        this.R0 = ((View)this).findViewById(2131430856);
        final View viewById = ((View)this).findViewById(2131430846);
        final int a = w4j.a;
        final QuoteView q0 = (QuoteView)viewById;
        pf8.r(q0);
        this.Q0 = q0;
    }
    
    public final void e() {
        ((View)super.G0).setEnabled(super.F0.h());
    }
}
