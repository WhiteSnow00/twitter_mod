// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.subscriptions.core;

import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.util.user.UserIdentifier;
import java.util.Objects;

@sa8(c = "com.twitter.subscriptions.core.UndoSendViewModel$intents$2$2$1$1$1", f = "UndoSendViewModel.kt", l = { 142 }, m = "invokeSuspend")
public final class c extends p0s implements ftb<l99, go6<? super fzv>, Object>
{
    public int D0;
    public Object E0;
    public final UndoSendViewModel F0;
    
    public c(final UndoSendViewModel f0, final go6<? super c> go6) {
        this.F0 = f0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object e0, final go6<?> go6) {
        final c c = new c(this.F0, (go6<? super c>)go6);
        c.E0 = e0;
        return (go6<fzv>)c;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((c)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final dy6 d0 = dy6.D0;
        final int d2 = this.D0;
        if (d2 != 0) {
            if (d2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b1n.u(o);
        }
        else {
            b1n.u(o);
            final l99 l99 = (l99)this.E0;
            final auv r0 = this.F0.R0;
            final long a = l99.a;
            Objects.requireNonNull(r0);
            final eor$a companion = eor.Companion;
            final taa a2 = taa.a;
            eor$a.a(companion, taa.k, Long.valueOf(a), Integer.valueOf(uor.Companion.a()), (String)null, (String)null, (String)null, (String)null, (Integer)null, (Boolean)null, (Boolean)null, (String)null, 1048568);
            Objects.requireNonNull(c19.Companion);
            final vx6 q7 = ((c19)((b5j)cr0.Companion.a()).B((Class)c19.class)).q7();
            final ftb<cy6, go6<? super fzv>, Object> ftb = (ftb<cy6, go6<? super fzv>, Object>)new ftb<cy6, go6<? super fzv>, Object>(l99, this.F0, null) {
                public final l99 D0;
                public final UndoSendViewModel E0;
                
                public final go6<fzv> create(final Object o, final go6<?> go6) {
                    return (go6<fzv>)new ftb<cy6, go6<? super fzv>, Object>(this.D0, this.E0, go6) {
                        public final l99 D0;
                        public final UndoSendViewModel E0;
                    };
                }
                
                public final Object invoke(final Object o, final Object o2) {
                    final ftb<cy6, go6<? super fzv>, Object> ftb = (ftb<cy6, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                    final fzv a = fzv.a;
                    ftb.invokeSuspend(a);
                    return a;
                }
                
                public final Object invokeSuspend(final Object o) {
                    b1n.u(o);
                    final l99$b l99$b = new l99$b();
                    l99$b.p(this.D0);
                    l99$b.v = "sending_in_progress";
                    final l99 l99 = (l99)((n4j)l99$b).e();
                    this.E0.P0.L0(l99, 1);
                    ((MviViewModel)this.E0).Q((qsb)c$a$a.D0);
                    this.E0.T0.b(this.D0.a);
                    this.E0.S0.d(this.D0.a);
                    this.E0.S0.b(UserIdentifier.Companion.c(), l99);
                    return fzv.a;
                }
            };
            this.D0 = 1;
            if (as2.X((sx6)q7, (ftb)ftb, (go6)this) == d0) {
                return d0;
            }
        }
        return fzv.a;
    }
}
