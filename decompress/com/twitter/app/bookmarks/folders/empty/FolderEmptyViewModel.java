// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.folders.empty;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/bookmarks/folders/empty/FolderEmptyViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lahb;", "", "Lygb;", "feature.tfa.bookmarks.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class FolderEmptyViewModel extends MviViewModel<ahb, Object, ygb>
{
    public FolderEmptyViewModel(final l52 l52, final ibm ibm) {
        zzd.f((Object)l52, "navigationDelegate");
        zzd.f((Object)ibm, "releaseCompletable");
        super((fae)ibm, (oax)new ahb(false, 1, null));
        final b5j map = ((b5j)l52.a).map((qtb)new c9v((rtb)FolderEmptyViewModel$a.C0, 4));
        zzd.e((Object)map, "navigationDelegate.obser\u2026       .map { it.config }");
        final b5j ofType = map.ofType((Class)l62$a$b.class);
        zzd.b((Object)ofType, "ofType(R::class.java)");
        MviViewModel.M((MviViewModel)this, ofType, (String)null, (qqx)null, (gub)new FolderEmptyViewModel$b(this, (ap6)null), 3, (Object)null);
    }
}
