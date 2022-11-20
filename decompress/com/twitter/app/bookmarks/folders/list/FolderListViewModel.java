// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.folders.list;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/bookmarks/folders/list/FolderListViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lhgb;", "Lfgb;", "Legb;", "feature.tfa.bookmarks.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class FolderListViewModel extends MviViewModel<hgb, fgb, egb>
{
    public static final coe<Object>[] Q0;
    public final h52 O0;
    public final hyh P0;
    
    static {
        Q0 = new coe[] { (coe)w9.f((Class)FolderListViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public FolderListViewModel(final f52 f52, final h52 o0, final r8x r8x, final xbm xbm) {
        czd.f((Object)f52, "navigationDelegate");
        czd.f((Object)o0, "bookmarkFolderRepo");
        czd.f((Object)r8x, "lifecycle");
        czd.f((Object)xbm, "releaseCompletable");
        super((k9e)xbm, (jbx)new hgb(false, 1, (rf8)null));
        this.O0 = o0;
        final h5j merge = h5j.merge((taj)r8x.k().filter((ytk)new vt1((qsb)new FolderListViewModel$a(f52), 3)), (taj)((h5j)f52.a).filter((ytk)new oyf((qsb)FolderListViewModel$b.D0, 2)));
        czd.e((Object)merge, "merge(\n            lifec\u2026en.FolderList }\n        )");
        MviViewModel.M((MviViewModel)this, merge, (String)null, (jrx)null, (ftb)new ftb<Object, go6<? super fzv>, Object>(this, null) {
            public Object D0;
            public final FolderListViewModel E0;
            
            public final go6<fzv> create(final Object d0, final go6<?> go6) {
                final ftb<Object, go6<? super fzv>, Object> ftb = (ftb<Object, go6<? super fzv>, Object>)new ftb<Object, go6<? super fzv>, Object>(this.E0, go6) {
                    public Object D0;
                    public final FolderListViewModel E0;
                };
                ftb.D0 = d0;
                return (go6<fzv>)ftb;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final ftb<Object, go6<? super fzv>, Object> ftb = (ftb<Object, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                final fzv a = fzv.a;
                ftb.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(final Object o) {
                b1n.u(o);
                final Object d0 = this.D0;
                if (d0 instanceof f62$d$f) {
                    final FolderListViewModel e0 = this.E0;
                    final FolderListViewModel$c$a folderListViewModel$c$a = new FolderListViewModel$c$a(d0);
                    final coe<Object>[] q0 = FolderListViewModel.Q0;
                    e0.Q((qsb)folderListViewModel$c$a);
                }
                else {
                    final FolderListViewModel e2 = this.E0;
                    final FolderListViewModel$c$b d2 = FolderListViewModel$c$b.D0;
                    final coe<Object>[] q2 = FolderListViewModel.Q0;
                    e2.Q((qsb)d2);
                }
                return fzv.a;
            }
        }, 3, (Object)null);
        this.P0 = ewj.n(this, (qsb)new FolderListViewModel$d(this));
    }
    
    public final jyh<fgb> v() {
        return (jyh<fgb>)this.P0.a((coe)FolderListViewModel.Q0[0]);
    }
}
