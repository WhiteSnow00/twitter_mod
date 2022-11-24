// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.topics.peek.di.view;

import com.twitter.android.topics.peek.activity.TopicPeekActivity;
import android.view.View;

public final class a extends pue implements stb<View, xlx<? super eqt, bqt, aqt>>
{
    public final TopicPeekActivity F0;
    public final ww8 G0;
    public final cra<String, dda, fqt> H0;
    
    public a(final TopicPeekActivity f0, final ww8 g0, final cra<String, dda, fqt> h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        e0e.f((Object)o, "<anonymous parameter 0>");
        return new cqt(this.F0, this.G0, (cra)this.H0);
    }
}
