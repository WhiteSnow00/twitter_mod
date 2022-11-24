// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.anniversary;

import java.util.Objects;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/notifications/anniversary/AnniversaryViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Ltc0;", "Lrc0;", "Lpc0;", "subsystem.tfa.notifications.anniversary.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class AnniversaryViewModel extends MviViewModel<tc0, rc0, pc0>
{
    public static final ape<Object>[] R0;
    public final yyh Q0;
    
    static {
        R0 = new ape[] { (ape)lb0.h(AnniversaryViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public AnniversaryViewModel(final kcm kcm, final qc0 qc0, final AnniversaryContentViewArgs anniversaryContentViewArgs) {
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)qc0, "anniversaryEventReporter");
        super((iae)kcm, (ccx)new tc0((String)null, (String)null, (String)null, (String)null, (String)null, 0, 63, (wg8)null));
        qc0.a("impression");
        if (anniversaryContentViewArgs != null) {
            this.Q((stb)new stb<tc0, tc0>(anniversaryContentViewArgs) {
                public final AnniversaryContentViewArgs F0;
                
                public final Object invoke(final Object o) {
                    e0e.f((Object)o, "$this$setState");
                    final tc0$a companion = tc0.Companion;
                    final AnniversaryContentViewArgs f0 = this.F0;
                    Objects.requireNonNull(companion);
                    e0e.f((Object)f0, "contentViewArgs");
                    return new tc0(f0.title, f0.message, f0.action, f0.imageUrl, f0.text, f0.cursor);
                }
            });
        }
        this.Q0 = hfe.v((MviViewModel)this, (stb)new stb<azh<rc0>, vzv>(this) {
            public final AnniversaryViewModel F0;
            
            public final Object invoke(final Object o) {
                final azh azh = (azh)o;
                e0e.f((Object)azh, "$this$weaver");
                azh.a(iam.a((Class)rc0$b.class), (hub)new a(this.F0, (mp6)null));
                azh.a(iam.a((Class)rc0$a.class), (hub)new b(this.F0, (mp6)null));
                return vzv.a;
            }
        });
    }
    
    public final azh<rc0> v() {
        return (azh<rc0>)this.Q0.a((ape)AnniversaryViewModel.R0[0]);
    }
}
