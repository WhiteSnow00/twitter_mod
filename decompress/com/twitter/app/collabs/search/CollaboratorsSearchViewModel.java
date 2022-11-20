// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.collabs.search;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/collabs/search/CollaboratorsSearchViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lxo4;", "", "Ljo4;", "feature.tfa.collabs.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class CollaboratorsSearchViewModel extends MviViewModel<xo4, Object, jo4>
{
    public static final coe<Object>[] R0;
    public final jn4 O0;
    public final g76 P0;
    public final hyh Q0;
    
    static {
        R0 = new coe[] { (coe)w9.f((Class)CollaboratorsSearchViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public CollaboratorsSearchViewModel(final xbm xbm, final jn4 o0, final g76 p3) {
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)o0, "collaborationSearchRepository");
        czd.f((Object)p3, "composerCollabDispatcher");
        super((k9e)xbm, (jbx)new xo4("", (l7p)l7p$a.a));
        this.O0 = o0;
        this.P0 = p3;
        this.Q0 = ewj.n(this, (qsb)new CollaboratorsSearchViewModel$a(this));
    }
    
    public final jyh<Object> v() {
        return (jyh<Object>)this.Q0.a((coe)CollaboratorsSearchViewModel.R0[0]);
    }
}
