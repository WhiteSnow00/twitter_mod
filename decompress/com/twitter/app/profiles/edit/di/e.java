// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.profiles.edit.di;

import android.view.View;

public final class e extends jvb implements stb<View, gkl>
{
    public e(final Object o) {
        super(1, o, (Class)gkl$a.class, "create", "create(Landroid/view/View;)Lcom/twitter/app/profiles/edit/bottomsheets/PronounsExamplesBottomSheetFragmentViewDelegate;", 0);
    }
    
    public final Object invoke(final Object o) {
        final View view = (View)o;
        e0e.f((Object)view, "p0");
        return ((gkl$a)((ea3)this).receiver).a(view);
    }
}
