// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.folders.peek.di;

import android.view.View;

public final class a extends hub implements qsb<View, j62>
{
    public a(final Object o) {
        super(1, o, (Class)j62$a.class, "create", "create(Landroid/view/View;)Lcom/twitter/app/bookmarks/folders/peek/BookmarkPeekViewDelegate;", 0);
    }
    
    public final Object invoke(final Object o) {
        final View view = (View)o;
        czd.f((Object)view, "p0");
        return ((j62$a)((m93)this).receiver).a(view);
    }
}
