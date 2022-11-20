// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.safetymode.implementation;

import java.util.List;
import com.twitter.app.safetymode.api.SafetyModePreviewContentViewArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/safetymode/implementation/SafetyModePreviewViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Ltqo;", "Lrqo;", "Loqo;", "feature.tfa.safety-mode.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class SafetyModePreviewViewModel extends MviViewModel<tqo, rqo, oqo>
{
    public static final coe<Object>[] Q0;
    public final String O0;
    public final hyh P0;
    
    static {
        Q0 = new coe[] { (coe)w9.f((Class)SafetyModePreviewViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public SafetyModePreviewViewModel(final xbm xbm, final SafetyModePreviewContentViewArgs safetyModePreviewContentViewArgs, final uqo uqo) {
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)safetyModePreviewContentViewArgs, "args");
        czd.f((Object)uqo, "repository");
        super((k9e)xbm, (jbx)new tqo((List)f2a.D0, 0L, false, kqo.F0, false));
        final String eventPage = safetyModePreviewContentViewArgs.getEventPage();
        this.O0 = eventPage;
        final lqo a = lqo.a;
        czd.f((Object)eventPage, "page");
        this.W(vba.Companion.e(eventPage, "safety_mode_prompt", "", "", "impression"));
        this.C((eaq)uqo.a(), (qsb)new SafetyModePreviewViewModel$a(this));
        this.C((eaq)uqo.c(), (qsb)new SafetyModePreviewViewModel$b(this));
        this.P0 = ewj.n(this, (qsb)new SafetyModePreviewViewModel$c(this, uqo));
    }
    
    public final void W(final vba vba) {
        final cbw a = cbw.a();
        final af4 af4 = new af4();
        ((u0p)af4).T = vba.toString();
        final int a2 = c5j.a;
        a.c((elm)af4);
    }
    
    public final jyh<rqo> v() {
        return (jyh<rqo>)this.P0.a((coe)SafetyModePreviewViewModel.Q0[0]);
    }
}
