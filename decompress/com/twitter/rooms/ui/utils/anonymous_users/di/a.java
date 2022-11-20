// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.utils.anonymous_users.di;

import android.view.View;

public final class a extends ste implements qsb<View, ilx<? super r0n, n0n, l0n>>
{
    public final yv8 D0;
    public final ul1 E0;
    public final xbm F0;
    
    public a(final yv8 d0, final ul1 e0, final xbm f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final View view = (View)o;
        czd.f((Object)view, "it");
        return new o0n(view, this.D0, this.E0, this.F0);
    }
}
