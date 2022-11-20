// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.accounttaxonomy.implementation.di;

import android.view.View;

public final class a extends hub implements qsb<View, ei>
{
    public a(final Object o) {
        super(1, o, (Class)ei.a.class, "create", "create(Landroid/view/View;)Lcom/twitter/accounttaxonomy/implementation/AccountLabelLandingPageViewDelegate;", 0);
    }
    
    public final Object invoke(final Object o) {
        final View view = (View)o;
        czd.f((Object)view, "p0");
        return ((ei.a)((m93)this).receiver).a(view);
    }
}
