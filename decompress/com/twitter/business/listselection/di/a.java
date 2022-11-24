// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.listselection.di;

import android.view.View;

public final class a extends pue implements stb<View, xlx<? super m23, Object, t13>>
{
    public final j4e<w13> F0;
    public final s13 G0;
    public final nn H0;
    
    public a(final j4e<w13> f0, final s13 g0, final nn h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final View view = (View)o;
        e0e.f((Object)view, "it");
        return new j23(view, this.F0, this.G0, this.H0);
    }
}
