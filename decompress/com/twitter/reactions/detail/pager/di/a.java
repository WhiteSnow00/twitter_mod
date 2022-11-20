// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.reactions.detail.pager.di;

import android.view.View;

public final class a extends ste implements qsb<View, ilx<? super hvs, Object, Object>>
{
    public final a9t D0;
    public final k8w E0;
    public final ppu F0;
    
    public a(final a9t d0, final k8w e0, final ppu f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final View view = (View)o;
        czd.f((Object)view, "it");
        return new gvs(view, this.D0, this.E0, this.F0);
    }
}
