// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.folders;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/bookmarks/folders/BookmarkFolderViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Li62;", "Lj52;", "Li52;", "feature.tfa.bookmarks.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class BookmarkFolderViewModel extends MviViewModel<i62, j52, i52>
{
    public static final /* synthetic */ soe<Object>[] O0;
    public final gyh N0;
    
    static {
        O0 = new soe[] { (soe)hi.m(BookmarkFolderViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public BookmarkFolderViewModel(final l52 l52, final n52 n52, final ibm ibm) {
        zzd.f((Object)l52, "navigationDelegate");
        zzd.f((Object)n52, "bookmarkFolderRepo");
        zzd.f((Object)ibm, "releaseCompletable");
        super((fae)ibm, (oax)new i62((l62$d)null, 1, (hg8)null));
        MviViewModel.M((MviViewModel)this, (b5j)l52.a, (String)null, (qqx)null, (gub)new BookmarkFolderViewModel$a(n52, this, (ap6)null), 3, (Object)null);
        this.N0 = oyz.f0(this, (rtb)new rtb<iyh<j52>, oyv>() {
            public final Object invoke(final Object o) {
                final iyh iyh = (iyh)o;
                zzd.f((Object)iyh, "$this$weaver");
                iyh.a(g9m.a((Class)j52$a.class), (gub)new a(l52, (ap6)null));
                return oyv.a;
            }
        });
    }
    
    public final iyh<j52> v() {
        return (iyh<j52>)this.N0.a((soe)BookmarkFolderViewModel.O0[0]);
    }
}
