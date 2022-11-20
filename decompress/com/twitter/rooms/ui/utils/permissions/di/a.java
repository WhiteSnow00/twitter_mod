// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.utils.permissions.di;

import android.view.View;

public final class a extends ste implements qsb<View, ilx<? super bun, d6o, b6o>>
{
    public final xbm D0;
    public final ul1 E0;
    public final xba<bo> F0;
    public final xba<y6k> G0;
    
    public a(final xbm d0, final ul1 e0, final xba<bo> f0, final xba<y6k> g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final View view = (View)o;
        czd.f((Object)view, "it");
        return new aun(view, this.D0, this.E0, (xba)this.F0, (xba)this.G0);
    }
}
