// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.safetymode.implementation;

import java.util.List;
import com.twitter.app.safetymode.api.SafetyModePreviewContentViewArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/safetymode/implementation/SafetyModePreviewViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lmro;", "Lkro;", "Lhro;", "feature.tfa.safety-mode.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class SafetyModePreviewViewModel extends MviViewModel<mro, kro, hro>
{
    public static final ape<Object>[] S0;
    public final String Q0;
    public final yyh R0;
    
    static {
        S0 = new ape[] { (ape)lb0.h(SafetyModePreviewViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public SafetyModePreviewViewModel(final kcm kcm, final SafetyModePreviewContentViewArgs safetyModePreviewContentViewArgs, final nro nro) {
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)safetyModePreviewContentViewArgs, "args");
        e0e.f((Object)nro, "repository");
        super((iae)kcm, (ccx)new mro((List)h3a.F0, 0L, false, dro.H0, false));
        final String eventPage = safetyModePreviewContentViewArgs.getEventPage();
        this.Q0 = eventPage;
        final ero a = ero.a;
        e0e.f((Object)eventPage, "page");
        this.W(dda.Companion.e(eventPage, "safety_mode_prompt", "", "", "impression"));
        this.C(nro.a(), (stb)new SafetyModePreviewViewModel$a(this));
        this.C(nro.c(), (stb)new SafetyModePreviewViewModel$b(this));
        this.R0 = hfe.v((MviViewModel)this, (stb)new SafetyModePreviewViewModel$c(this, nro));
    }
    
    public final void W(final dda dda) {
        final sbw a = sbw.a();
        final fg4 fg4 = new fg4();
        ((o1p)fg4).T = dda.toString();
        final int a2 = o5j.a;
        a.c((tlm)fg4);
    }
    
    public final azh<kro> v() {
        return (azh<kro>)this.R0.a((ape)SafetyModePreviewViewModel.S0[0]);
    }
}
