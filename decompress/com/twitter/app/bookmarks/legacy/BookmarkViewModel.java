// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.legacy;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/bookmarks/legacy/BookmarkViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lz62;", "", "Ly42;", "feature.tfa.bookmarks.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class BookmarkViewModel extends MviViewModel<z62, Object, y42>
{
    public BookmarkViewModel(final pca<z42> pca, final ibm ibm) {
        zzd.f((Object)pca, "eventObservable");
        zzd.f((Object)ibm, "releaseCompletable");
        super((fae)ibm, (oax)new z62());
        MviViewModel.M((MviViewModel)this, pca.v0(), (String)null, (qqx)null, (gub)new BookmarkViewModel$a(this, (ap6)null), 3, (Object)null);
    }
}
