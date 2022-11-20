// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.broadcast.di.view;

import android.os.Handler;

public final class b extends z6f$a
{
    public final Handler D0;
    public final eqh E0;
    
    public b(final Handler d0, final eqh e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void p(final w4 w4) {
        this.D0.removeCallbacksAndMessages((Object)null);
        final eqh e0 = this.E0;
        final j1r a1 = e0.a1;
        if (a1 != null) {
            a1.K0.e();
        }
        e0.N0.k((Object)e0);
        final uo6 u0 = e0.U0;
        u0.e.k((Object)u0);
    }
}
