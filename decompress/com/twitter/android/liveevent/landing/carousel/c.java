// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.landing.carousel;

import android.content.Context;
import androidx.recyclerview.widget.u;

public final class c extends u
{
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;
    
    public c(final Context context, final int q, final int r) {
        this.q = q;
        this.r = r;
        super(context);
    }
    
    public final int n() {
        int n;
        if (this.q < this.r) {
            n = -1;
        }
        else {
            n = 1;
        }
        return n;
    }
}
