// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.spacebar.item.expanded;

import java.util.List;
import java.util.Objects;
import tv.periscope.model.NarrowcastSpaceType$SuperFollowerOnly;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/spacebar/item/expanded/SpacebarItemViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Ldmq;", "Lcmq;", "Lbmq;", "Companion", "e", "feature.tfa.rooms.ui.spacebar.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class SpacebarItemViewModel extends MviViewModel<dmq, cmq, bmq>
{
    public static final SpacebarItemViewModel.SpacebarItemViewModel$e Companion;
    public static final /* synthetic */ soe<Object>[] O0;
    public final gyh N0;
    
    static {
        O0 = new soe[] { (soe)hi.m(SpacebarItemViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new SpacebarItemViewModel.SpacebarItemViewModel$e();
    }
    
    public SpacebarItemViewModel(final zlq zlq, final anq anq, final inq inq, final ibm ibm) {
        zzd.f((Object)zlq, "item");
        zzd.f((Object)anq, "viewModeDispatcher");
        zzd.f((Object)inq, "tickerDispatcherProvider");
        zzd.f((Object)ibm, "releaseCompletable");
        final s01 o = zlq.o;
        final String b = o.b;
        final boolean a = zzd.a((Object)o.p, (Object)NarrowcastSpaceType$SuperFollowerOnly.INSTANCE);
        final hfv h = zlq.h;
        final SpacebarItemViewModel.SpacebarItemViewModel$e companion = SpacebarItemViewModel.Companion;
        Objects.requireNonNull(companion);
        List list;
        if ((list = zlq.l).isEmpty()) {
            list = zlq.k;
        }
        final s01 o2 = zlq.o;
        final Integer j = o2.j;
        final lh5 s = o2.s;
        final boolean a2 = companion.a();
        int n;
        if (oio.I()) {
            n = 2131100843;
        }
        else {
            n = 2131100880;
        }
        int n2;
        if (oio.I()) {
            n2 = 2131233271;
        }
        else if (a) {
            n2 = 2131231354;
        }
        else {
            n2 = 2131231353;
        }
        int n3;
        if (oio.I()) {
            n3 = 2131100704;
        }
        else {
            n3 = 2131100880;
        }
        super((fae)ibm, (oax)new dmq(false, a, b, h, list, j, s, (jnq)null, a2, n, n2, n3));
        final hnq a3 = inq.a(zlq.j);
        this.Q((rtb)SpacebarItemViewModel$a.C0);
        MviViewModel.M((MviViewModel)this, xau.Companion.a().a(), (String)null, (qqx)null, (gub)new SpacebarItemViewModel$b(this, (ap6)null), 3, (Object)null);
        final b5j distinct = ((b5j)anq.a).distinct();
        zzd.e((Object)distinct, "modeEmitter.distinct()");
        MviViewModel.M((MviViewModel)this, distinct, (String)null, (qqx)null, (gub)new SpacebarItemViewModel$c(this, (ap6)null), 3, (Object)null);
        final hlv b2 = dta.b();
        int n5;
        final int n4 = n5 = 0;
        if (b2.b("android_fleets_spacebar_ticker_enabled", false)) {
            n5 = n4;
            if (!dcs.A()) {
                n5 = n4;
                if (xa0.a().a() >= 2014) {
                    n5 = 1;
                }
            }
        }
        if (n5 != 0) {
            final b5j doOnSubscribe = ((b5j)((ydo)a3).c).doOnSubscribe((fk6)new nol((rtb)new zdo((ydo)a3), 23));
            zzd.e((Object)doOnSubscribe, "get() = dispatcher.doOnS\u2026cribe { startEmitting() }");
            MviViewModel.M((MviViewModel)this, doOnSubscribe, (String)null, (qqx)null, (gub)new SpacebarItemViewModel$d(this, (ap6)null), 3, (Object)null);
        }
        this.N0 = oyz.f0(this, (rtb)new SpacebarItemViewModel$f(this, zlq));
    }
    
    public final iyh<cmq> v() {
        return (iyh<cmq>)this.N0.a((soe)SpacebarItemViewModel.O0[0]);
    }
}
