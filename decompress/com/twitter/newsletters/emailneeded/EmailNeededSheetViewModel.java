// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.newsletters.emailneeded;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/newsletters/emailneeded/EmailNeededSheetViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lgz9;", "Ldz9;", "Laz9;", "subsystem.tfa.newsletters.core.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class EmailNeededSheetViewModel extends MviViewModel<gz9, dz9, az9>
{
    public static final coe<Object>[] P0;
    public final hyh O0;
    
    static {
        P0 = new coe[] { (coe)w9.f((Class)EmailNeededSheetViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public EmailNeededSheetViewModel(final zy9 zy9, final fwm fwm, final xbm xbm) {
        czd.f((Object)zy9, "args");
        czd.f((Object)fwm, "revueModuleRepository");
        czd.f((Object)xbm, "releaseCompletable");
        super((k9e)xbm, (jbx)new gz9(zy9.c, zy9.d, zy9.f, zy9.e, zy9.g, zy9.h));
        this.T((qsb)new EmailNeededSheetViewModel$a(this));
        this.O0 = ewj.n(this, (qsb)new EmailNeededSheetViewModel$b(this));
    }
    
    public final jyh<dz9> v() {
        return (jyh<dz9>)this.O0.a((coe)EmailNeededSheetViewModel.P0[0]);
    }
}
