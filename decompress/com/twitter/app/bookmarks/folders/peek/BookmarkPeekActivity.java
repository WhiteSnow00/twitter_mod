// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.folders.peek;

import android.app.Activity;
import android.os.Bundle;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004" }, d2 = { "Lcom/twitter/app/bookmarks/folders/peek/BookmarkPeekActivity;", "Lvmd;", "<init>", "()V", "feature.tfa.bookmarks.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class BookmarkPeekActivity extends vmd
{
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        ((Activity)this).getWindow().addFlags(16);
    }
}
