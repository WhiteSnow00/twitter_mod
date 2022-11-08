// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.folders.dialog;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/bookmarks/folders/dialog/BookmarkFolderSheetViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lb62;", "Lw52;", "Lu52;", "feature.tfa.bookmarks.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class BookmarkFolderSheetViewModel extends MviViewModel<b62, w52, u52>
{
    public static final /* synthetic */ soe<Object>[] P0;
    public final t52 N0;
    public final gyh O0;
    
    static {
        P0 = new soe[] { (soe)hi.m(BookmarkFolderSheetViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public BookmarkFolderSheetViewModel(final t52 n0, final z7x z7x, final ibm ibm, final l52 l52) {
        zzd.f((Object)n0, "args");
        zzd.f((Object)z7x, "lifecycle");
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)l52, "navigationDelegate");
        int n2 = 1;
        super((fae)ibm, (oax)new b62(0, 1, (hg8)null));
        this.N0 = n0;
        MviViewModel.M((MviViewModel)this, (b5j)z7x.l(), (String)null, (qqx)null, (gub)new BookmarkFolderSheetViewModel$a(this, (ap6)null), 3, (Object)null);
        final b5j filter = ((b5j)l52.a).filter((ptk)new dzf((rtb)BookmarkFolderSheetViewModel$b.C0, 2));
        zzd.e((Object)filter, "navigationDelegate.obser\u2026n.Screen.Dialog.Dismiss }");
        MviViewModel.M((MviViewModel)this, filter, (String)null, (qqx)null, (gub)new BookmarkFolderSheetViewModel$c(this, (ap6)null), 3, (Object)null);
        if (n0.d) {
            n2 = 2;
        }
        this.Q((rtb)new a62(n2));
        this.O0 = oyz.f0(this, (rtb)new rtb<iyh<w52>, oyv>() {
            public final /* synthetic */ BookmarkFolderSheetViewModel C0;
            
            public final Object invoke(final Object o) {
                final iyh iyh = (iyh)o;
                zzd.f((Object)iyh, "$this$weaver");
                iyh.a(g9m.a((Class)w52$b.class), (gub)new a(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)w52$a.class), (gub)new b(this.C0, (ap6)null));
                return oyv.a;
            }
        });
    }
    
    public final iyh<w52> v() {
        return (iyh<w52>)this.O0.a((soe)BookmarkFolderSheetViewModel.P0[0]);
    }
}
