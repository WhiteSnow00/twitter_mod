// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.sensitivemedia;

import java.util.Set;
import com.twitter.sensitivemedia.SensitiveMediaActivityContentViewArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/sensitivemedia/SensitiveMediaViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lajp;", "Lgip;", "Lfip;", "feature.tfa.sensitivemedia.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class SensitiveMediaViewModel extends MviViewModel<ajp, gip, fip>
{
    public static final coe<Object>[] P0;
    public final hyh O0;
    
    static {
        P0 = new coe[] { (coe)w9.f((Class)SensitiveMediaViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public SensitiveMediaViewModel(final SensitiveMediaActivityContentViewArgs sensitiveMediaActivityContentViewArgs, final xbm xbm) {
        czd.f((Object)sensitiveMediaActivityContentViewArgs, "args");
        czd.f((Object)xbm, "releaseCompletable");
        super((k9e)xbm, (jbx)new ajp((jw9)sensitiveMediaActivityContentViewArgs.getEditableMedia(), (Set)sensitiveMediaActivityContentViewArgs.getSensitiveMediaCategories(), true));
        final af4 af4 = new af4();
        ((u0p)af4).T = new vba("tabbed_media", "sensitive_media", "", "sensitive_media_tab", "show").toString();
        final int a = c5j.a;
        this.V((Object)new fip$c((elm)af4));
        this.O0 = ewj.n(this, (qsb)new SensitiveMediaViewModel$a(this));
    }
    
    public final jyh<gip> v() {
        return (jyh<gip>)this.O0.a((coe)SensitiveMediaViewModel.P0[0]);
    }
}
