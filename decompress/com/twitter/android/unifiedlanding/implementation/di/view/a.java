// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.unifiedlanding.implementation.di.view;

import android.view.View;

public final class a extends hub implements qsb<View, yyv>
{
    public a(final Object o) {
        super(1, o, (Class)yyv.c.class, "create", "create(Landroid/view/View;)Lcom/twitter/android/unifiedlanding/implementation/UnifiedLandingViewDelegate;", 0);
    }
    
    public final Object invoke(final Object o) {
        final View view = (View)o;
        czd.f((Object)view, "p0");
        return ((yyv.c)((m93)this).receiver).a(view);
    }
}
