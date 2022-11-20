// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.legacy;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/bookmarks/legacy/BookmarkViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Ls62;", "", "Lr42;", "feature.tfa.bookmarks.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class BookmarkViewModel extends MviViewModel<s62, Object, r42>
{
    public static final int O0 = 0;
    
    public BookmarkViewModel(final xba<s42> xba, final xbm xbm) {
        czd.f((Object)xba, "eventObservable");
        czd.f((Object)xbm, "releaseCompletable");
        super((k9e)xbm, (jbx)new s62());
        MviViewModel.M((MviViewModel)this, xba.v0(), (String)null, (jrx)null, (ftb)new ftb<s42, go6<? super fzv>, Object>(this, null) {
            public Object D0;
            public final BookmarkViewModel E0;
            
            public final go6<fzv> create(final Object d0, final go6<?> go6) {
                final ftb<s42, go6<? super fzv>, Object> ftb = (ftb<s42, go6<? super fzv>, Object>)new ftb<s42, go6<? super fzv>, Object>(this.E0, go6) {
                    public Object D0;
                    public final BookmarkViewModel E0;
                };
                ftb.D0 = d0;
                return (go6<fzv>)ftb;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final ftb<s42, go6<? super fzv>, Object> ftb = (ftb<s42, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                final fzv a = fzv.a;
                ftb.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(final Object o) {
                b1n.u(o);
                final s42 s42 = (s42)this.D0;
                if (s42 instanceof s42.e) {
                    final BookmarkViewModel e0 = this.E0;
                    final r42.b a = r42.b.a;
                    final int o2 = BookmarkViewModel.O0;
                    e0.V((Object)a);
                }
                else if (s42 instanceof s42.g) {
                    final BookmarkViewModel e2 = this.E0;
                    final r42.a a2 = r42.a.a;
                    final int o3 = BookmarkViewModel.O0;
                    e2.V((Object)a2);
                }
                return fzv.a;
            }
        }, 3, (Object)null);
    }
}
