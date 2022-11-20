// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.folders.folder;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/bookmarks/folders/folder/FolderTimelineViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Ltgb;", "Lngb;", "Lmgb;", "feature.tfa.bookmarks.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class FolderTimelineViewModel extends MviViewModel<tgb, ngb, mgb>
{
    public static final coe<Object>[] P0;
    public final hyh O0;
    
    static {
        P0 = new coe[] { (coe)w9.f((Class)FolderTimelineViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public FolderTimelineViewModel(final f52 f52, final xba<s42> xba, final xbm xbm) {
        czd.f((Object)f52, "navigationDelegate");
        czd.f((Object)xba, "eventObservable");
        czd.f((Object)xbm, "releaseCompletable");
        super((k9e)xbm, (jbx)new tgb(false, (String)null, 3, (rf8)null));
        final h5j ofType = xba.v0().ofType((Class)s42.a.class);
        czd.b((Object)ofType, "ofType(R::class.java)");
        MviViewModel.M((MviViewModel)this, ofType, (String)null, (jrx)null, (ftb)new ftb<s42.a, go6<? super fzv>, Object>(this, null) {
            public Object D0;
            public final FolderTimelineViewModel E0;
            
            public final go6<fzv> create(final Object d0, final go6<?> go6) {
                final ftb<s42.a, go6<? super fzv>, Object> ftb = (ftb<s42.a, go6<? super fzv>, Object>)new ftb<s42.a, go6<? super fzv>, Object>(this.E0, go6) {
                    public Object D0;
                    public final FolderTimelineViewModel E0;
                };
                ftb.D0 = d0;
                return (go6<fzv>)ftb;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final ftb<s42.a, go6<? super fzv>, Object> ftb = (ftb<s42.a, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                final fzv a = fzv.a;
                ftb.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(final Object o) {
                b1n.u(o);
                final s42.a a = (s42.a)this.D0;
                final FolderTimelineViewModel e0 = this.E0;
                final mgb$a mgb$a = new mgb$a(a.a);
                final coe<Object>[] p = FolderTimelineViewModel.P0;
                e0.V((Object)mgb$a);
                return fzv.a;
            }
        }, 3, (Object)null);
        final h5j ofType2 = ((h5j)f52.a).ofType((Class)f62$d$g.class);
        czd.b((Object)ofType2, "ofType(R::class.java)");
        MviViewModel.M((MviViewModel)this, ofType2, (String)null, (jrx)null, (ftb)new ftb<f62$d$g, go6<? super fzv>, Object>(this, null) {
            public Object D0;
            public final FolderTimelineViewModel E0;
            
            public final go6<fzv> create(final Object d0, final go6<?> go6) {
                final ftb<f62$d$g, go6<? super fzv>, Object> ftb = (ftb<f62$d$g, go6<? super fzv>, Object>)new ftb<f62$d$g, go6<? super fzv>, Object>(this.E0, go6) {
                    public Object D0;
                    public final FolderTimelineViewModel E0;
                };
                ftb.D0 = d0;
                return (go6<fzv>)ftb;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final ftb<f62$d$g, go6<? super fzv>, Object> ftb = (ftb<f62$d$g, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                final fzv a = fzv.a;
                ftb.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(final Object o) {
                b1n.u(o);
                final f62$d$g f62$d$g = (f62$d$g)this.D0;
                final FolderTimelineViewModel e0 = this.E0;
                final FolderTimelineViewModel$b$a folderTimelineViewModel$b$a = new FolderTimelineViewModel$b$a(f62$d$g);
                final coe<Object>[] p = FolderTimelineViewModel.P0;
                e0.Q((qsb)folderTimelineViewModel$b$a);
                return fzv.a;
            }
        }, 3, (Object)null);
        this.O0 = ewj.n(this, (qsb)new FolderTimelineViewModel$c(this));
    }
    
    public final jyh<ngb> v() {
        return (jyh<ngb>)this.O0.a((coe)FolderTimelineViewModel.P0[0]);
    }
}
