// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.anniversary;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/notifications/anniversary/AnniversaryViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lsc0;", "Lqc0;", "Loc0;", "subsystem.tfa.notifications.anniversary.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class AnniversaryViewModel extends MviViewModel<sc0, qc0, oc0>
{
    public static final coe<Object>[] P0;
    public final hyh O0;
    
    static {
        P0 = new coe[] { (coe)w9.f((Class)AnniversaryViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public AnniversaryViewModel(final xbm xbm, final pc0 pc0, final AnniversaryContentViewArgs anniversaryContentViewArgs) {
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)pc0, "anniversaryEventReporter");
        super((k9e)xbm, (jbx)new sc0((String)null, (String)null, (String)null, (String)null, (String)null, 0, 63, (rf8)null));
        pc0.a("impression");
        if (anniversaryContentViewArgs != null) {
            this.Q((qsb)new AnniversaryViewModel$a(anniversaryContentViewArgs));
        }
        this.O0 = ewj.n(this, (qsb)new AnniversaryViewModel$b(this));
    }
    
    public final jyh<qc0> v() {
        return (jyh<qc0>)this.O0.a((coe)AnniversaryViewModel.P0[0]);
    }
}
