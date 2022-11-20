// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.subscriptions.core;

import com.twitter.weaver.mvi.MviViewModel;

@sa8(c = "com.twitter.subscriptions.core.UndoSendViewModel$intents$2$2", f = "UndoSendViewModel.kt", l = {}, m = "invokeSuspend")
public final class e extends p0s implements ftb<cuv$a, go6<? super fzv>, Object>
{
    public final UndoSendViewModel D0;
    
    public e(final UndoSendViewModel d0, final go6<? super e> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new e(this.D0, (go6<? super e>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final e e = (e)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        e.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final UndoSendViewModel d0 = this.D0;
        final e$a e$a = new e$a(d0);
        final UndoSendViewModel$a companion = UndoSendViewModel.Companion;
        ((MviViewModel)d0).T((qsb)e$a);
        return fzv.a;
    }
}
