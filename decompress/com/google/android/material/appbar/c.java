// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public final class c implements bh
{
    public final /* synthetic */ CoordinatorLayout C0;
    public final /* synthetic */ AppBarLayout D0;
    public final /* synthetic */ View E0;
    public final /* synthetic */ int F0;
    public final /* synthetic */ AppBarLayout.BaseBehavior G0;
    
    public c(final AppBarLayout.BaseBehavior g0, final CoordinatorLayout c0, final AppBarLayout d0, final View e0, final int f0) {
        this.G0 = g0;
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final boolean p(final View view) {
        this.G0.I(this.C0, this.D0, this.E0, 0, this.F0, new int[] { 0, 0 }, 1);
        return true;
    }
}
