// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.utils.endscreen.communities;

import java.util.Objects;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/utils/endscreen/communities/CommunityRowItemViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lwt5;", "", "Lnt5;", "Companion", "a", "feature.tfa.rooms.ui.utils.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class CommunityRowItemViewModel extends MviViewModel<wt5, Object, nt5>
{
    public static final CommunityRowItemViewModel.CommunityRowItemViewModel$a Companion;
    public static final ape<Object>[] R0;
    public final yyh Q0;
    
    static {
        R0 = new ape[] { (ape)lb0.h(CommunityRowItemViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new CommunityRowItemViewModel.CommunityRowItemViewModel$a();
    }
    
    public CommunityRowItemViewModel(final t1r$a t1r$a, final oko oko, final kcm kcm) {
        e0e.f((Object)t1r$a, "item");
        e0e.f((Object)oko, "roomsScribeReporter");
        e0e.f((Object)kcm, "releaseCompletable");
        final CommunityRowItemViewModel.CommunityRowItemViewModel$a companion = CommunityRowItemViewModel.Companion;
        final yh5 a = t1r$a.a;
        Objects.requireNonNull(companion);
        e0e.f((Object)a, "<this>");
        final ai5 m = a.m;
        boolean b = true;
        boolean b2 = false;
        Label_0100: {
            Label_0097: {
                if (m != null) {
                    if (!xli.e(m, kt5.Companion.a(a.l))) {
                        final ai5 i = a.m;
                        e0e.c((Object)i);
                        if (!xli.f(i)) {
                            break Label_0097;
                        }
                    }
                    b2 = true;
                    break Label_0100;
                }
            }
            b2 = false;
        }
        Label_0130: {
            if (b2) {
                final ai5 j = a.m;
                e0e.c((Object)j);
                if (xli.f(j)) {
                    break Label_0130;
                }
            }
            b = false;
        }
        super((iae)kcm, (ccx)new wt5(a, b2, b));
        this.Q0 = hfe.v((MviViewModel)this, (stb)new CommunityRowItemViewModel$b(this, oko));
    }
    
    public final azh<Object> v() {
        return (azh<Object>)this.Q0.a((ape)CommunityRowItemViewModel.R0[0]);
    }
}
