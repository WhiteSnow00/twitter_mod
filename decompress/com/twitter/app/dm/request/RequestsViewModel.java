// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.dm.request;

import kotlin.NoWhenBranchMatchedException;
import java.util.Objects;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/app/dm/request/RequestsViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Ljpm;", "Lcpm;", "Lbpm;", "Companion", "a", "feature.tfa.dm.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RequestsViewModel extends MviViewModel<jpm, cpm, bpm>
{
    public static final a Companion;
    public static final /* synthetic */ soe<Object>[] Q0;
    public final ymm N0;
    public final z7x O0;
    public final gyh P0;
    
    static {
        Q0 = new soe[] { (soe)hi.m(RequestsViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new a();
    }
    
    public RequestsViewModel(final ymm n0, final z7x o0, final ibm ibm) {
        zzd.f((Object)n0, "requestInbox");
        zzd.f((Object)o0, "viewLifecycle");
        zzd.f((Object)ibm, "releaseCompletable");
        Objects.requireNonNull(RequestsViewModel.Companion);
        final int ordinal = ((Enum)n0).ordinal();
        Object o2;
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            o2 = jpm$b.a;
        }
        else {
            o2 = jpm$a.a;
        }
        super((fae)ibm, (oax)o2);
        this.N0 = n0;
        this.O0 = o0;
        MviViewModel.M((MviViewModel)this, (b5j)o0.d(), (String)null, (qqx)null, (gub)new hpm(this, null), 3, (Object)null);
        this.P0 = oyz.f0(this, (rtb)new rtb<iyh<cpm>, oyv>() {
            public final /* synthetic */ RequestsViewModel C0;
            
            public final Object invoke(final Object o) {
                final iyh iyh = (iyh)o;
                zzd.f((Object)iyh, "$this$weaver");
                iyh.a(g9m.a((Class)cpm$a.class), (gub)new com.twitter.app.dm.request.a(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)cpm$b.class), (gub)new b(this.C0, (ap6)null));
                return oyv.a;
            }
        });
    }
    
    public final iyh<cpm> v() {
        return (iyh<cpm>)this.P0.a((soe)RequestsViewModel.Q0[0]);
    }
    
    public static final class a
    {
    }
}
