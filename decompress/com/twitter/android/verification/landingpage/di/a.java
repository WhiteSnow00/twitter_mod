// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.verification.landingpage.di;

import android.view.View;

public final class a extends hub implements qsb<View, drw>
{
    public a(final Object o) {
        super(1, o, (Class)drw$a.class, "create", "create(Landroid/view/View;)Lcom/twitter/android/verification/landingpage/VerificationLandingPageViewDelegate;", 0);
    }
    
    public final Object invoke(final Object o) {
        final View view = (View)o;
        czd.f((Object)view, "p0");
        return ((drw$a)((m93)this).receiver).a(view);
    }
}
