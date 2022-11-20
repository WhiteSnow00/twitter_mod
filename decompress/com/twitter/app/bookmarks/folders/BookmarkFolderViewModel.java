// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.folders;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/bookmarks/folders/BookmarkFolderViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lc62;", "Lc52;", "Lb52;", "feature.tfa.bookmarks.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class BookmarkFolderViewModel extends MviViewModel<c62, c52, b52>
{
    public static final coe<Object>[] P0;
    public final hyh O0;
    
    static {
        P0 = new coe[] { (coe)w9.f((Class)BookmarkFolderViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public BookmarkFolderViewModel(final f52 f52, final h52 h52, final xbm xbm) {
        czd.f((Object)f52, "navigationDelegate");
        czd.f((Object)h52, "bookmarkFolderRepo");
        czd.f((Object)xbm, "releaseCompletable");
        super((k9e)xbm, (jbx)new c62(null, 1, null));
        MviViewModel.M((MviViewModel)this, (h5j)f52.a, (String)null, (jrx)null, (ftb)new ftb<f62$d, go6<? super fzv>, Object>(h52, this, null) {
            public Object D0;
            public final h52 E0;
            public final BookmarkFolderViewModel F0;
            
            public final go6<fzv> create(final Object d0, final go6<?> go6) {
                final ftb<f62$d, go6<? super fzv>, Object> ftb = (ftb<f62$d, go6<? super fzv>, Object>)new ftb<f62$d, go6<? super fzv>, Object>(this.E0, this.F0, go6) {
                    public Object D0;
                    public final h52 E0;
                    public final BookmarkFolderViewModel F0;
                };
                ftb.D0 = d0;
                return (go6<fzv>)ftb;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final ftb<f62$d, go6<? super fzv>, Object> ftb = (ftb<f62$d, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                final fzv a = fzv.a;
                ftb.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(final Object o) {
                b1n.u(o);
                final f62$d f62$d = (f62$d)this.D0;
                if (f62$d instanceof f62$d$e) {
                    this.E0.h();
                    final BookmarkFolderViewModel f0 = this.F0;
                    final b52$a a = b52$a.a;
                    final coe<Object>[] p = BookmarkFolderViewModel.P0;
                    f0.V((Object)a);
                }
                else {
                    final BookmarkFolderViewModel f2 = this.F0;
                    final BookmarkFolderViewModel$a$a bookmarkFolderViewModel$a$a = new BookmarkFolderViewModel$a$a(f62$d);
                    final coe<Object>[] p2 = BookmarkFolderViewModel.P0;
                    f2.Q((qsb)bookmarkFolderViewModel$a$a);
                }
                return fzv.a;
            }
        }, 3, (Object)null);
        this.O0 = ewj.n(this, (qsb)new BookmarkFolderViewModel$b(f52));
    }
    
    public final jyh<c52> v() {
        return (jyh<c52>)this.O0.a((coe)BookmarkFolderViewModel.P0[0]);
    }
}
