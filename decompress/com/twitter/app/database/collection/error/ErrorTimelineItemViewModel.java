// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.database.collection.error;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/database/collection/error/ErrorTimelineItemViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lk9a;", "Lj9a;", "Li9a;", "subsystem.tfa.database.collection.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class ErrorTimelineItemViewModel extends MviViewModel<k9a, j9a, i9a>
{
    public static final coe<Object>[] Q0;
    public final qbu O0;
    public final hyh P0;
    
    static {
        Q0 = new coe[] { (coe)w9.f((Class)ErrorTimelineItemViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public ErrorTimelineItemViewModel(final u8a u8a, final xk0 xk0, final qbu o0, final xbm xbm) {
        czd.f((Object)u8a, "timelineItem");
        czd.f((Object)xk0, "appConfig");
        czd.f((Object)o0, "appPreferences");
        czd.f((Object)xbm, "releaseCompletable");
        super((k9e)xbm, (jbx)new k9a(u8a));
        this.O0 = o0;
        xk0.t();
        this.Q((qsb)new ErrorTimelineItemViewModel$a(false));
        this.P0 = ewj.n(this, (qsb)new ErrorTimelineItemViewModel$b(this, u8a));
    }
    
    public final jyh<j9a> v() {
        return (jyh<j9a>)this.P0.a((coe)ErrorTimelineItemViewModel.Q0[0]);
    }
}
