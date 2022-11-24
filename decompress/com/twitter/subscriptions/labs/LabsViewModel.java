// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.subscriptions.labs;

import java.util.List;
import android.content.Context;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/subscriptions/labs/LabsViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lmue;", "", "Lyte;", "feature.tfa.subscriptions.labs.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class LabsViewModel extends MviViewModel<mue, Object, yte>
{
    public static final ape<Object>[] T0;
    public final Context Q0;
    public final r9a R0;
    public final yyh S0;
    
    static {
        T0 = new ape[] { (ape)lb0.h(LabsViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public LabsViewModel(final Context q0, final kcm kcm, final kqr kqr, final r9a r0, final eue eue) {
        e0e.f((Object)q0, "context");
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)kqr, "subscriptionsProductFeatureRepository");
        e0e.f((Object)r0, "errorReporter");
        e0e.f((Object)eue, "labsScribeDelegate");
        super((iae)kcm, (ccx)new mue((List)null, 1, (wg8)null));
        this.Q0 = q0;
        this.R0 = r0;
        final bpr$a companion = bpr.Companion;
        final dca a = dca.a;
        bpr$a.a(companion, dca.b, (Long)null, (Integer)null, eue.a.getReferringPage().getScribePageName(), (String)null, (String)null, (String)null, (Integer)null, (Boolean)null, (Boolean)null, (String)null, 1048566);
        this.C((bbq)kqr.a(), (stb)new LabsViewModel$a(this));
        this.S0 = hfe.v((MviViewModel)this, (stb)LabsViewModel$b.F0);
    }
    
    public static final List W(final LabsViewModel labsViewModel) {
        final String string = labsViewModel.Q0.getString(2131954530);
        e0e.e((Object)string, "context.getString(R.string.labs_screen_empty)");
        return shw.x0((Object)new aue.b(string));
    }
    
    public final azh<Object> v() {
        return (azh<Object>)this.S0.a((ape)LabsViewModel.T0[0]);
    }
}
