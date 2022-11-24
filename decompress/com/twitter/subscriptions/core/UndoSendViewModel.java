// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.subscriptions.core;

import android.content.Context;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u0006\u0007¨\u0006\b" }, d2 = { "Lcom/twitter/subscriptions/core/UndoSendViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Levv;", "Lmuv;", "Lluv;", "Companion", "a", "b", "subsystem.tfa.subscriptions.core_release" }, k = 1, mv = { 1, 7, 1 })
public final class UndoSendViewModel extends MviViewModel<evv, muv, luv>
{
    public static final UndoSendViewModel.UndoSendViewModel$a Companion;
    public static final ape<Object>[] a1;
    public final Context Q0;
    public final db9 R0;
    public final kbv S0;
    public final kuv T0;
    public final wtv U0;
    public final quv V0;
    public final rpr W0;
    public final ewu X0;
    public final bxo Y0;
    public final yyh Z0;
    
    static {
        a1 = new ape[] { (ape)lb0.h(UndoSendViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new UndoSendViewModel.UndoSendViewModel$a();
    }
    
    public UndoSendViewModel(final Context q0, final db9 r0, final kbv s0, final kuv t0, final wtv u0, final quv v0, final rpr w0, final ewu x0, final bxo y0, final kcm kcm, final tf tf) {
        e0e.f((Object)q0, "context");
        e0e.f((Object)r0, "draftsDatabaseHelper");
        e0e.f((Object)s0, "twitterDatabaseHelper");
        e0e.f((Object)t0, "undoSendClickHandler");
        e0e.f((Object)u0, "undoNudgePresenter");
        e0e.f((Object)v0, "undoSendTimer");
        e0e.f((Object)w0, "subscriptionsFeatures");
        e0e.f((Object)x0, "tweetUploadTracker");
        e0e.f((Object)y0, "ioScheduler");
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)tf, "accessibilityAnimationPreferences");
        super((iae)kcm, (ccx)new evv(tf.a(), 63));
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.T0 = t0;
        this.U0 = u0;
        this.V0 = v0;
        this.W0 = w0;
        this.X0 = x0;
        this.Y0 = y0;
        this.Z0 = hfe.v((MviViewModel)this, (stb)new UndoSendViewModel$c(this));
    }
    
    public final azh<muv> v() {
        return (azh<muv>)this.Z0.a((ape)UndoSendViewModel.a1[0]);
    }
}
