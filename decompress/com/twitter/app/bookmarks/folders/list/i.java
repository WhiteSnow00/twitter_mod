// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.folders.list;

import com.twitter.weaver.mvi.MviViewModel;
import java.util.List;

@sa8(c = "com.twitter.app.bookmarks.folders.list.FolderListViewModel$intents$2$5", f = "FolderListViewModel.kt", l = {}, m = "invokeSuspend")
public final class i extends p0s implements ftb<fgb$d, go6<? super fzv>, Object>
{
    public final FolderListViewModel D0;
    
    public i(final FolderListViewModel d0, final go6<? super i> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new i(this.D0, (go6<? super i>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final i i = (i)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        i.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        if (this.D0.O0.i()) {
            final FolderListViewModel d0 = this.D0;
            MviViewModel.N((MviViewModel)d0, d0.O0.b(), (String)null, (jrx)null, (ftb)new ftb<List<? extends u42>, go6<? super fzv>, Object>(this.D0, null) {
                public Object D0;
                public final FolderListViewModel E0;
                
                public final go6<fzv> create(final Object d0, final go6<?> go6) {
                    final ftb<List<? extends u42>, go6<? super fzv>, Object> ftb = (ftb<List<? extends u42>, go6<? super fzv>, Object>)new ftb<List<? extends u42>, go6<? super fzv>, Object>(this.E0, go6) {
                        public Object D0;
                        public final FolderListViewModel E0;
                    };
                    ftb.D0 = d0;
                    return (go6<fzv>)ftb;
                }
                
                public final Object invoke(final Object o, final Object o2) {
                    final ftb<List<? extends u42>, go6<? super fzv>, Object> ftb = (ftb<List<? extends u42>, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                    final fzv a = fzv.a;
                    ftb.invokeSuspend(a);
                    return a;
                }
                
                public final Object invokeSuspend(final Object o) {
                    b1n.u(o);
                    final List list = (List)this.D0;
                    final FolderListViewModel e0 = this.E0;
                    final egb$d egb$d = new egb$d(list);
                    final coe<Object>[] q0 = FolderListViewModel.Q0;
                    e0.V((Object)egb$d);
                    return fzv.a;
                }
            }, 3, (Object)null);
        }
        return fzv.a;
    }
}
