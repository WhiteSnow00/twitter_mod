// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.topics.peek.di.view;

import com.twitter.android.topics.peek.activity.TopicPeekActivity;
import android.view.View;

public final class a extends gue implements rtb<View, okx<? super wot, tot, sot>>
{
    public final /* synthetic */ TopicPeekActivity C0;
    public final /* synthetic */ fw8 D0;
    public final /* synthetic */ xqa<String, nca, xot> E0;
    
    public a(final TopicPeekActivity c0, final fw8 d0, final xqa<String, nca, xot> e0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        zzd.f((Object)o, "<anonymous parameter 0>");
        return new uot(this.C0, this.D0, (xqa)this.E0);
    }
}
