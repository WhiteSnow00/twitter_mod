// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.safety.leaveconversation;

@sa8(c = "com.twitter.safety.leaveconversation.LeaveConversationPromptViewModel$intents$2$3", f = "LeaveConversationPromptViewModel.kt", l = {}, m = "invokeSuspend")
public final class c extends p0s implements ftb<t3f, go6<? super fzv>, Object>
{
    public final LeaveConversationPromptViewModel D0;
    
    public c(final LeaveConversationPromptViewModel d0, final go6<? super c> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new c(this.D0, (go6<? super c>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final c c = (c)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        c.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final LeaveConversationPromptViewModel d0 = this.D0;
        final coe<Object>[] s0 = LeaveConversationPromptViewModel.S0;
        d0.W("close");
        return fzv.a;
    }
}
