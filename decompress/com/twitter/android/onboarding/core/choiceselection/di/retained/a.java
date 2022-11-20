// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.onboarding.core.choiceselection.di.retained;

import android.view.View;

public final class a extends hub implements qsb<View, pyk>
{
    public a(final Object o) {
        super(1, o, (Class)pyk.a.class, "create", "create(Landroid/view/View;)Lcom/twitter/android/onboarding/core/choiceselection/PrimaryChoiceSelectionViewDelegate;", 0);
    }
    
    public final Object invoke(final Object o) {
        final View view = (View)o;
        czd.f((Object)view, "p0");
        return ((pyk.a)((m93)this).receiver).a(view);
    }
}
