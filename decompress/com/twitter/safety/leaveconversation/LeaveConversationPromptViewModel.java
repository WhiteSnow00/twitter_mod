// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.safety.leaveconversation;

import com.twitter.util.user.UserIdentifier;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/safety/leaveconversation/LeaveConversationPromptViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lv4f;", "", "Lo4f;", "Companion", "a", "subsystem.tfa.core-safety.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class LeaveConversationPromptViewModel extends MviViewModel<v4f, Object, o4f>
{
    private static final LeaveConversationPromptViewModel.LeaveConversationPromptViewModel$a Companion;
    public static final ape<Object>[] U0;
    public final LeaveConversationPromptArgs Q0;
    public final UserIdentifier R0;
    public final String S0;
    public final yyh T0;
    
    static {
        U0 = new ape[] { (ape)lb0.h(LeaveConversationPromptViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new LeaveConversationPromptViewModel.LeaveConversationPromptViewModel$a();
    }
    
    public LeaveConversationPromptViewModel(final kcm kcm, final LeaveConversationPromptArgs q0, final usa usa, final UserIdentifier r0) {
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)q0, "args");
        e0e.f((Object)usa, "promptFatigue");
        e0e.f((Object)r0, "userIdentifier");
        super((iae)kcm, (ccx)new v4f(q0.getEducationOnly()));
        this.Q0 = q0;
        this.R0 = r0;
        String s0;
        if (q0.getEducationOnly()) {
            s0 = "leave_this_conversation_education_sheet";
        }
        else {
            s0 = "leave_this_conversation_confirmation_sheet";
        }
        this.S0 = s0;
        usa.b();
        this.W("impression");
        this.T0 = hfe.v((MviViewModel)this, (stb)new LeaveConversationPromptViewModel$b(this));
    }
    
    public final void W(final String s) {
        final sbw a = sbw.a();
        final fg4 fg4 = new fg4(this.R0);
        ((o1p)fg4).T = new dda(this.Q0.getScribePage(), this.Q0.getScribeSection(), "full_screen", this.S0, s).toString();
        final int a2 = o5j.a;
        a.c((tlm)fg4);
    }
    
    public final azh<Object> v() {
        return (azh<Object>)this.T0.a((ape)LeaveConversationPromptViewModel.U0[0]);
    }
}
