// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.safety.leaveconversation;

import com.twitter.util.user.UserIdentifier;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/safety/leaveconversation/LeaveConversationPromptViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Ly3f;", "", "Lr3f;", "Companion", "a", "subsystem.tfa.core-safety.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class LeaveConversationPromptViewModel extends MviViewModel<y3f, Object, r3f>
{
    private static final a Companion;
    public static final coe<Object>[] S0;
    public final LeaveConversationPromptArgs O0;
    public final UserIdentifier P0;
    public final String Q0;
    public final hyh R0;
    
    static {
        S0 = new coe[] { (coe)w9.f((Class)LeaveConversationPromptViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new a();
    }
    
    public LeaveConversationPromptViewModel(final xbm xbm, final LeaveConversationPromptArgs o0, final mra mra, final UserIdentifier p4) {
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)o0, "args");
        czd.f((Object)mra, "promptFatigue");
        czd.f((Object)p4, "userIdentifier");
        super((k9e)xbm, (jbx)new y3f(o0.getEducationOnly()));
        this.O0 = o0;
        this.P0 = p4;
        String q0;
        if (o0.getEducationOnly()) {
            q0 = "leave_this_conversation_education_sheet";
        }
        else {
            q0 = "leave_this_conversation_confirmation_sheet";
        }
        this.Q0 = q0;
        mra.b();
        this.W("impression");
        this.R0 = ewj.n(this, (qsb)new LeaveConversationPromptViewModel$b(this));
    }
    
    public final void W(final String s) {
        final cbw a = cbw.a();
        final af4 af4 = new af4(this.P0);
        ((u0p)af4).T = new vba(this.O0.getScribePage(), this.O0.getScribeSection(), "full_screen", this.Q0, s).toString();
        final int a2 = c5j.a;
        a.c((elm)af4);
    }
    
    public final jyh<Object> v() {
        return (jyh<Object>)this.R0.a((coe)LeaveConversationPromptViewModel.S0[0]);
    }
    
    public static final class a
    {
    }
}
