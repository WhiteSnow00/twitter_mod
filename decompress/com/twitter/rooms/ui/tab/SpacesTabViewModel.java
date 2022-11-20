// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.tab;

import java.util.Objects;
import java.util.List;
import android.content.Context;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/ui/tab/SpacesTabViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lxzq;", "Lizq;", "Llwq;", "feature.tfa.rooms.ui.tab.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class SpacesTabViewModel extends MviViewModel<xzq, izq, lwq>
{
    public static final coe<Object>[] V0;
    public final w0n O0;
    public final keo P0;
    public final dfo Q0;
    public final Context R0;
    public final vjo S0;
    public final boolean T0;
    public final hyh U0;
    
    static {
        V0 = new coe[] { (coe)w9.f((Class)SpacesTabViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public SpacesTabViewModel(final w0n o0, final keo p7, final dfo q0, final Context r0, final vjo s0, final r8x r8x, final xbm xbm) {
        czd.f((Object)o0, "roomAudioSpaceFeedRepository");
        czd.f((Object)p7, "roomTabUuidDispatcher");
        czd.f((Object)q0, "roomTimestampRepository");
        czd.f((Object)r0, "context");
        czd.f((Object)s0, "roomsScribeReporter");
        czd.f((Object)r8x, "viewLifecycle");
        czd.f((Object)xbm, "releaseCompletable");
        super((k9e)xbm, (jbx)new xzq(false, false, false, (List)null, (List)null, (String)null, 63, (rf8)null));
        this.O0 = o0;
        this.P0 = p7;
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.T0 = djo.a.F();
        final h5j take = r8x.d().take(1L);
        czd.e((Object)take, "viewLifecycle.observeFocus().take(1)");
        MviViewModel.M((MviViewModel)this, take, (String)null, (jrx)null, (ftb)new ftb<tmi, go6<? super fzv>, Object>(this, null) {
            public final SpacesTabViewModel D0;
            
            public final go6<fzv> create(final Object o, final go6<?> go6) {
                return (go6<fzv>)new ftb<tmi, go6<? super fzv>, Object>(this.D0, go6) {
                    public final SpacesTabViewModel D0;
                };
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final ftb<tmi, go6<? super fzv>, Object> ftb = (ftb<tmi, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                final fzv a = fzv.a;
                ftb.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(final Object o) {
                b1n.u(o);
                final SpacesTabViewModel d0 = this.D0;
                final coe<Object>[] v0 = SpacesTabViewModel.V0;
                d0.W(null, true, true);
                return fzv.a;
            }
        }, 3, (Object)null);
        this.U0 = ewj.n(this, (qsb)new SpacesTabViewModel$b(this));
    }
    
    public final void W(final String s, final boolean b, final boolean b2) {
        final eaq<j11> c = this.O0.c(s);
        final cyn cyn = new cyn((qsb)new SpacesTabViewModel$c(this, s), 10);
        Objects.requireNonNull((eaq)c);
        this.C((eaq)new kbq((lcq)c, (psb)cyn), (qsb)new SpacesTabViewModel$d(this, b2, b, s));
    }
    
    public final jyh<izq> v() {
        return (jyh<izq>)this.U0.a((coe)SpacesTabViewModel.V0[0]);
    }
}
