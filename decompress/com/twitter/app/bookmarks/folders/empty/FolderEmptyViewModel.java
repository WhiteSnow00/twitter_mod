// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.folders.empty;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/bookmarks/folders/empty/FolderEmptyViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lyfb;", "", "Lwfb;", "feature.tfa.bookmarks.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class FolderEmptyViewModel extends MviViewModel<yfb, Object, wfb>
{
    public static final int O0 = 0;
    
    public FolderEmptyViewModel(final f52 f52, final xbm xbm) {
        czd.f((Object)f52, "navigationDelegate");
        czd.f((Object)xbm, "releaseCompletable");
        super((k9e)xbm, (jbx)new yfb(false, 1, (rf8)null));
        final h5j map = ((h5j)f52.a).map((psb)new y9v((qsb)FolderEmptyViewModel$a.D0, 1));
        czd.e((Object)map, "navigationDelegate.obser\u2026       .map { it.config }");
        final h5j ofType = map.ofType((Class)f62$a$b.class);
        czd.b((Object)ofType, "ofType(R::class.java)");
        MviViewModel.M((MviViewModel)this, ofType, (String)null, (jrx)null, (ftb)new ftb<f62$a$b, go6<? super fzv>, Object>(this, null) {
            public Object D0;
            public final FolderEmptyViewModel E0;
            
            public final go6<fzv> create(final Object d0, final go6<?> go6) {
                final ftb<f62$a$b, go6<? super fzv>, Object> ftb = (ftb<f62$a$b, go6<? super fzv>, Object>)new ftb<f62$a$b, go6<? super fzv>, Object>(this.E0, go6) {
                    public Object D0;
                    public final FolderEmptyViewModel E0;
                };
                ftb.D0 = d0;
                return (go6<fzv>)ftb;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final ftb<f62$a$b, go6<? super fzv>, Object> ftb = (ftb<f62$a$b, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                final fzv a = fzv.a;
                ftb.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(final Object o) {
                b1n.u(o);
                final f62$a$b f62$a$b = (f62$a$b)this.D0;
                final FolderEmptyViewModel e0 = this.E0;
                final wfb$a wfb$a = new wfb$a(f62$a$b.a, f62$a$b.b, f62$a$b.c);
                final int o2 = FolderEmptyViewModel.O0;
                e0.V((Object)wfb$a);
                return fzv.a;
            }
        }, 3, (Object)null);
    }
}
