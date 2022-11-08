// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.dm.request.inbox;

import kotlin.NoWhenBranchMatchedException;
import com.twitter.util.user.UserIdentifier;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/dm/request/inbox/RequestInboxViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lfom;", "Ldnm;", "Lzmm;", "feature.tfa.dm.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RequestInboxViewModel extends MviViewModel<fom, dnm, zmm>
{
    public static final /* synthetic */ soe<Object>[] W0;
    public final mnm N0;
    public final onm O0;
    public final ymm P0;
    public final UserIdentifier Q0;
    public final z7x R0;
    public final rv1<Boolean> S0;
    public boolean T0;
    public final gid U0;
    public final gyh V0;
    
    static {
        W0 = new soe[] { (soe)hi.m(RequestInboxViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public RequestInboxViewModel(final mnm n0, final onm o0, final ymm p6, final UserIdentifier q0, final z7x r0, final ibm ibm) {
        zzd.f((Object)n0, "repository");
        zzd.f((Object)o0, "requestInboxScriber");
        zzd.f((Object)p6, "inbox");
        zzd.f((Object)q0, "owner");
        zzd.f((Object)r0, "viewLifecycle");
        zzd.f((Object)ibm, "releaseCompletable");
        super((fae)ibm, (oax)fom.b.a);
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p6;
        this.Q0 = q0;
        this.R0 = r0;
        final rv1 e = rv1.e((Object)Boolean.FALSE);
        this.S0 = (rv1<Boolean>)e;
        this.T0 = true;
        final int ordinal = ((Enum)p6).ordinal();
        gid u0;
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            u0 = gid.F0;
        }
        else {
            u0 = gid.D0;
        }
        this.U0 = u0;
        final b5j share = r0.d().share();
        zzd.e((Object)share, "viewLifecycle.observeFocus()\n        .share()");
        final b5j combineLatest = b5j.combineLatest((naj)n0.b(p6), (naj)e, (ew1)d6w.F0);
        zzd.e((Object)combineLatest, "combineLatest(\n         \u2026}\n            }\n        )");
        MviViewModel.M((MviViewModel)this, combineLatest, (String)null, (qqx)null, (gub)new eom(this, null), 3, (Object)null);
        final b5j switchMap = share.switchMap((qtb)new uj4((rtb)new ynm(dta.b().h("dm_event_api_poll_interval_inbox", 60L) * 1000L, this), 5));
        zzd.e((Object)switchMap, "private fun initUpdatePo\u2026     }.intoWeaver()\n    }");
        final xyh c0 = xyh.C0;
        this.B(switchMap, (rtb)c0);
        final b5j flatMap = share.flatMap((qtb)new nla((rtb)new wnm(this), 2));
        zzd.e((Object)flatMap, "private fun initLastSeen\u2026()\n        }.intoWeaver()");
        this.B(flatMap, (rtb)c0);
        final b5j skip = n0.e().skip(1L);
        zzd.e((Object)skip, "repository.observeInboxS\u2026es()\n            .skip(1)");
        MviViewModel.M((MviViewModel)this, skip, (String)null, (qqx)null, (gub)new znm(this, (ap6)null), 3, (Object)null);
        this.V0 = oyz.f0(this, (rtb)new rtb<iyh<dnm>, oyv>() {
            public final /* synthetic */ RequestInboxViewModel C0;
            
            public final Object invoke(final Object o) {
                final iyh iyh = (iyh)o;
                zzd.f((Object)iyh, "$this$weaver");
                iyh.a(g9m.a((Class)dnm$c.class), (gub)new a(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)dnm$d.class), (gub)new b(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)dnm$g.class), (gub)new c(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)dnm$f.class), (gub)new d(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)dnm$e.class), (gub)new e(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)dnm$a.class), (gub)new f(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)dnm$b.class), (gub)new g(this.C0, (ap6)null));
                return oyv.a;
            }
        });
    }
    
    public final iyh<dnm> v() {
        return (iyh<dnm>)this.V0.a((soe)RequestInboxViewModel.W0[0]);
    }
}
