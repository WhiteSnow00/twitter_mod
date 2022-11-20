// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.folders.dialog;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/bookmarks/folders/dialog/BookmarkFolderSheetViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lv52;", "Lq52;", "Lo52;", "feature.tfa.bookmarks.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class BookmarkFolderSheetViewModel extends MviViewModel<v52, q52, o52>
{
    public static final coe<Object>[] Q0;
    public final n52 O0;
    public final hyh P0;
    
    static {
        Q0 = new coe[] { (coe)w9.f((Class)BookmarkFolderSheetViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public BookmarkFolderSheetViewModel(final n52 o0, final r8x r8x, final xbm xbm, final f52 f52) {
        czd.f((Object)o0, "args");
        czd.f((Object)r8x, "lifecycle");
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)f52, "navigationDelegate");
        int n = 1;
        super((k9e)xbm, (jbx)new v52(0, 1, (rf8)null));
        this.O0 = o0;
        MviViewModel.M((MviViewModel)this, r8x.k(), (String)null, (jrx)null, (ftb)new ftb<tmi, go6<? super fzv>, Object>(this, null) {
            public final BookmarkFolderSheetViewModel D0;
            
            public final go6<fzv> create(final Object o, final go6<?> go6) {
                return (go6<fzv>)new ftb<tmi, go6<? super fzv>, Object>(this.D0, go6) {
                    public final BookmarkFolderSheetViewModel D0;
                };
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final ftb<tmi, go6<? super fzv>, Object> ftb = (ftb<tmi, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                final fzv a = fzv.a;
                ftb.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(final Object o) {
                b1n.u(o);
                final BookmarkFolderSheetViewModel d0 = this.D0;
                final BookmarkFolderSheetViewModel$a$a bookmarkFolderSheetViewModel$a$a = new BookmarkFolderSheetViewModel$a$a(d0);
                final coe<Object>[] q0 = BookmarkFolderSheetViewModel.Q0;
                d0.T((qsb)bookmarkFolderSheetViewModel$a$a);
                return fzv.a;
            }
        }, 3, (Object)null);
        final h5j filter = ((h5j)f52.a).filter((ytk)new wtn((qsb)BookmarkFolderSheetViewModel$b.D0, 1));
        czd.e((Object)filter, "navigationDelegate.obser\u2026n.Screen.Dialog.Dismiss }");
        MviViewModel.M((MviViewModel)this, filter, (String)null, (jrx)null, (ftb)new ftb<f62$d, go6<? super fzv>, Object>(this, null) {
            public final BookmarkFolderSheetViewModel D0;
            
            public final go6<fzv> create(final Object o, final go6<?> go6) {
                return (go6<fzv>)new ftb<f62$d, go6<? super fzv>, Object>(this.D0, go6) {
                    public final BookmarkFolderSheetViewModel D0;
                };
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final ftb<f62$d, go6<? super fzv>, Object> ftb = (ftb<f62$d, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                final fzv a = fzv.a;
                ftb.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(final Object o) {
                b1n.u(o);
                final BookmarkFolderSheetViewModel d0 = this.D0;
                final o52$a a = o52$a.a;
                final coe<Object>[] q0 = BookmarkFolderSheetViewModel.Q0;
                d0.V((Object)a);
                return fzv.a;
            }
        }, 3, (Object)null);
        if (o0.d) {
            n = 2;
        }
        this.Q((qsb)new u52(n));
        this.P0 = ewj.n(this, (qsb)new BookmarkFolderSheetViewModel$d(this));
    }
    
    public final jyh<q52> v() {
        return (jyh<q52>)this.P0.a((coe)BookmarkFolderSheetViewModel.Q0[0]);
    }
}
