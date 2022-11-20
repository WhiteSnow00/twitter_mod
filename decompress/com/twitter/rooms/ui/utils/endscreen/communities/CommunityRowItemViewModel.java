// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.utils.endscreen.communities;

import java.util.Objects;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/utils/endscreen/communities/CommunityRowItemViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lqs5;", "", "Lhs5;", "Companion", "a", "feature.tfa.rooms.ui.utils.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class CommunityRowItemViewModel extends MviViewModel<qs5, Object, hs5>
{
    public static final a Companion;
    public static final coe<Object>[] P0;
    public final hyh O0;
    
    static {
        P0 = new coe[] { (coe)w9.f((Class)CommunityRowItemViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new a();
    }
    
    public CommunityRowItemViewModel(final w0r$a w0r$a, final vjo vjo, final xbm xbm) {
        czd.f((Object)w0r$a, "item");
        czd.f((Object)vjo, "roomsScribeReporter");
        czd.f((Object)xbm, "releaseCompletable");
        final a companion = CommunityRowItemViewModel.Companion;
        final tg5 a = w0r$a.a;
        Objects.requireNonNull(companion);
        czd.f((Object)a, "<this>");
        final vg5 m = a.m;
        boolean b = true;
        boolean b2 = false;
        Label_0100: {
            Label_0097: {
                if (m != null) {
                    if (!lp.x(m, es5.Companion.a(a.l))) {
                        final vg5 i = a.m;
                        czd.c((Object)i);
                        if (!lp.y(i)) {
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
                final vg5 j = a.m;
                czd.c((Object)j);
                if (lp.y(j)) {
                    break Label_0130;
                }
            }
            b = false;
        }
        super((k9e)xbm, (jbx)new qs5(a, b2, b));
        this.O0 = ewj.n(this, (qsb)new qsb<jyh<Object>, fzv>(this, vjo) {
            public final CommunityRowItemViewModel D0;
            public final vjo E0;
            
            public final Object invoke(final Object o) {
                final jyh jyh = (jyh)o;
                czd.f((Object)jyh, "$this$weaver");
                jyh.a(v9m.a((Class)ks5.class), (ftb)new com.twitter.rooms.ui.utils.endscreen.communities.a(this.D0, this.E0, (go6)null));
                jyh.a(v9m.a((Class)js5.class), (ftb)new c(this.D0, this.E0, (go6)null));
                return fzv.a;
            }
        });
    }
    
    public final jyh<Object> v() {
        return (jyh<Object>)this.O0.a((coe)CommunityRowItemViewModel.P0[0]);
    }
    
    public static final class a
    {
    }
}
