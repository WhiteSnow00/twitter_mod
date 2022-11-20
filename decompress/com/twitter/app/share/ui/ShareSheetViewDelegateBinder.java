// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.share.ui;

import com.twitter.util.user.UserIdentifier;
import kotlin.Metadata;
import com.twitter.menu.share.full.providers.ShareSheetDialogViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006" }, d2 = { "Lcom/twitter/app/share/ui/ShareSheetViewDelegateBinder;", "Lz6x;", "Ljtu;", "Lcom/twitter/menu/share/full/providers/ShareSheetDialogViewModel;", "<init>", "()V", "feature.tfa.share.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class ShareSheetViewDelegateBinder implements z6x<jtu, ShareSheetDialogViewModel>
{
    public static final ShareSheetViewDelegateBinder a;
    
    static {
        a = new ShareSheetViewDelegateBinder();
    }
    
    private ShareSheetViewDelegateBinder() {
    }
    
    public final /* bridge */ t19 a(final y6x y6x, final z8x z8x) {
        return this.b((jtu)y6x, (ShareSheetDialogViewModel)z8x);
    }
    
    public final t19 b(final jtu jtu, final ShareSheetDialogViewModel shareSheetDialogViewModel) {
        czd.f((Object)jtu, "viewDelegate");
        czd.f((Object)shareSheetDialogViewModel, "viewModel");
        final r7m r7m = new r7m();
        final y0k f = vvt.f(vvt.Companion.a(), "share-sheet-data-query", (UserIdentifier)null, 0, false, (vvt$b)null, 126);
        r7m.D0 = f;
        if (f != null) {
            f.start();
        }
        final h5j distinctUntilChanged = ((h5j)new obq((lcq)eaq.Q((lcq)shareSheetDialogViewModel.F0.R((Object)tmi.a).w((psb)new pgl((qsb)new oup(shareSheetDialogViewModel), 22)), (lcq)shareSheetDialogViewModel.E0.a(), (zv1)new mf8((Object)pup.D0, 3)), (psb)new cu4((qsb)new rup(shareSheetDialogViewModel), 27))).distinctUntilChanged();
        czd.e((Object)distinctUntilChanged, "fun getViewData(): Obser\u2026tinctUntilChanged()\n    }");
        final t19 subscribe = distinctUntilChanged.observeOn(gmw.H()).subscribe((lj6)new ebk((qsb)new ShareSheetViewDelegateBinder$a(jtu, r7m), 14));
        czd.e((Object)subscribe, "viewDelegate: TweetShare\u2026race = null\n            }");
        return subscribe;
    }
}
