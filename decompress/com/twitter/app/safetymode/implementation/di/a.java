// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.safetymode.implementation.di;

import android.view.View;

public final class a extends jvb implements stb<View, lro>
{
    public a(final Object o) {
        super(1, o, (Class)lro$a.class, "create", "create(Landroid/view/View;)Lcom/twitter/app/safetymode/implementation/SafetyModePreviewViewDelegate;", 0);
    }
    
    public final Object invoke(final Object o) {
        final View view = (View)o;
        e0e.f((Object)view, "p0");
        return ((lro$a)((ea3)this).receiver).a(view);
    }
}
