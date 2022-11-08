// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.educationprompts;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/educationprompts/SafetyEducationPromptViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lnpo;", "Llpo;", "Lkpo;", "feature.tfa.education-prompts.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class SafetyEducationPromptViewModel extends MviViewModel<npo, lpo, kpo>
{
    public static final /* synthetic */ soe<Object>[] P0;
    public final String N0;
    public final gyh O0;
    
    static {
        P0 = new soe[] { (soe)hi.m(SafetyEducationPromptViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public SafetyEducationPromptViewModel(final ibm ibm, final SafetyEducationPromptContentViewArgs safetyEducationPromptContentViewArgs) {
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)safetyEducationPromptContentViewArgs, "args");
        super((fae)ibm, (oax)new npo());
        this.W(this.N0 = safetyEducationPromptContentViewArgs.getEventPage(), "impression");
        this.O0 = oyz.f0(this, (rtb)new SafetyEducationPromptViewModel$a(this));
    }
    
    public final void W(final String s, final String s2) {
        zzd.f((Object)s, "page");
        final saw a = saw.a();
        final zf4 zf4 = new zf4();
        zf4.T = nca.Companion.e(s, "safety_education_prompt", "", "", s2).toString();
        final int a2 = w4j.a;
        a.c((okm)zf4);
    }
    
    public final iyh<lpo> v() {
        return (iyh<lpo>)this.O0.a((soe)SafetyEducationPromptViewModel.P0[0]);
    }
}
