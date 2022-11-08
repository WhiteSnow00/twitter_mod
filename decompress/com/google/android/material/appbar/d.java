// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.appbar;

import android.view.View;

public final class d implements bh
{
    public final /* synthetic */ AppBarLayout C0;
    public final /* synthetic */ boolean D0;
    
    public d(final AppBarLayout c0, final boolean d0) {
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public final boolean p(final View view) {
        this.C0.setExpanded(this.D0);
        return true;
    }
}
