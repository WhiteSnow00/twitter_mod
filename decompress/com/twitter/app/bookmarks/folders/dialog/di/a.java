// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.folders.dialog.di;

import android.view.View;

public final class a extends hub implements qsb<View, s52>
{
    public a(final Object o) {
        super(1, o, (Class)s52.a.class, "create", "create(Landroid/view/View;)Lcom/twitter/app/bookmarks/folders/dialog/BookmarkFolderSheetViewDelegate;", 0);
    }
    
    public final Object invoke(final Object o) {
        final View view = (View)o;
        czd.f((Object)view, "p0");
        return ((s52.a)((m93)this).receiver).a(view);
    }
}
