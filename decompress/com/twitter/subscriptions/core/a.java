// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.subscriptions.core;

import com.twitter.weaver.mvi.MviViewModel;
import java.util.concurrent.Callable;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;

@sa8(c = "com.twitter.subscriptions.core.UndoSendViewModel$intents$2$1$1$1", f = "UndoSendViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends p0s implements ftb<l99, go6<? super fzv>, Object>
{
    public Object D0;
    public final UndoSendViewModel E0;
    
    public a(final UndoSendViewModel e0, final go6<? super a> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final a a = new a(this.E0, (go6<? super a>)go6);
        a.D0 = d0;
        return (go6<fzv>)a;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final a a = (a)this.create(o, (go6<?>)o2);
        final fzv a2 = fzv.a;
        a.invokeSuspend(a2);
        return a2;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final l99 l99 = (l99)this.D0;
        final auv r0 = this.E0.R0;
        final UserIdentifier c = UserIdentifier.Companion.c();
        czd.e((Object)l99, "draftTweet");
        Objects.requireNonNull(r0);
        czd.f((Object)c, "userIdentifier");
        r0.a.a(c, l99);
        r0.a.d(l99.a);
        r0.b.b(l99.a);
        final long a = l99.a;
        final eor$a companion = eor.Companion;
        final taa a2 = taa.a;
        eor$a.a(companion, taa.j, Long.valueOf(a), Integer.valueOf(uor.Companion.a()), (String)null, (String)null, (String)null, (String)null, (Integer)null, (Boolean)null, (Boolean)null, (String)null, 1048568);
        final UndoSendViewModel e0 = this.E0;
        rw0.f((Callable)new v8a((Object)e0, (Object)l99, 6), e0.W0);
        this.E0.V0.b(l99.a, false);
        final UndoSendViewModel e2 = this.E0;
        ((MviViewModel)e2).V((Object)new buv$a(e2.O0));
        return fzv.a;
    }
}
