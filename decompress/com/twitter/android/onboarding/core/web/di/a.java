// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.onboarding.core.web.di;

import android.view.View;

public final class a extends hub implements qsb<View, rmx>
{
    public a(final Object o) {
        super(1, o, (Class)rmx.a.class, "create", "create(Landroid/view/View;)Lcom/twitter/android/onboarding/core/web/WebSubtaskViewDelegate;", 0);
    }
    
    public final Object invoke(final Object o) {
        final View view = (View)o;
        czd.f((Object)view, "p0");
        return ((rmx.a)((m93)this).receiver).a(view);
    }
}
