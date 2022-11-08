import com.twitter.rooms.cards.di.card.SpacesCardObjectGraph;
import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.rooms.cards.view.SpacesCardViewModel;
import com.twitter.onboarding.ocf.c;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import java.util.Objects;
import com.twitter.onboarding.ocf.di.ButtonItemComponentObjectGraph$a;
import com.twitter.rooms.docker.reaction.RoomDockerReactionStubViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rh8 implements wqa
{
    public static c5x a() {
        final fen fen = (fen)ca7.u((Class)fen.class);
        return (c5x)goz.k(g9m.a((Class)RoomDockerReactionStubViewModel.class), (rtb)den.C0);
    }
    
    public static c5x b(final z7x z7x) {
        final hbl hbl = (hbl)ca7.u((Class)hbl.class);
        zzd.f((Object)z7x, "viewLifecycle");
        return pkx.a((rtb)new gbl(z7x));
    }
    
    public static z43 c(final r3e r3e) {
        final ButtonItemComponentObjectGraph$a buttonItemComponentObjectGraph$a = (ButtonItemComponentObjectGraph$a)ca7.u((Class)ButtonItemComponentObjectGraph$a.class);
        zzd.f((Object)r3e, "item");
        final z43 z43 = (z43)r3e.a;
        Objects.requireNonNull(z43, "Cannot return null from a non-@Nullable @Provides method");
        return z43;
    }
    
    public static c5x d(final seo seo, final irn irn, final xio xio, final yl1 yl1, final xio xio2, final grq grq, final z7x z7x, final ibm ibm, final UserIdentifier userIdentifier) {
        final pfn pfn = (pfn)ca7.u((Class)pfn.class);
        zzd.f((Object)seo, "roomToaster");
        zzd.f((Object)irn, "roomNotificationController");
        zzd.f((Object)xio, "dispatcher");
        zzd.f((Object)xio2, "utilsViewEventDispatcher");
        zzd.f((Object)grq, "spacesLauncher");
        zzd.f((Object)z7x, "viewLifecycle");
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)userIdentifier, "userIdentifier");
        return pkx.a((rtb)new ofn(seo, xio2, grq, yl1, xio, z7x, ibm, userIdentifier));
    }
    
    public static mbl e(final j97 j97) {
        final kbl kbl = (kbl)ca7.u((Class)kbl.class);
        zzd.f((Object)j97, "profileUserDispatcher");
        final b5j map = ((b5j)((ggm)j97).C0).map((qtb)new l5l((rtb)jbl.C0, 1));
        zzd.e((Object)map, "profileUserDispatcher.ob\u2026ble().map { it.stringId }");
        return new mbl(map, new qv1());
    }
    
    public static c f(final Context context, final UserIdentifier userIdentifier, final io0 io0, final jbs jbs, final ibm ibm, final you you) {
        final pf6 pf6 = new pf6(userIdentifier, (mmm)new rbs(1, context, io0));
        final pf6 pf7 = new pf6(userIdentifier, (mmm)new rbs(2, context, io0));
        final pf6 pf8 = new pf6(userIdentifier, (mmm)new obs(context, io0, jbs));
        Object o = pf6;
        Object o2 = pf7;
        Object o3 = pf8;
        if (dta.b().b("auth_timeline_token_tracking_enabled", false)) {
            final zvj zvj = new zvj(16);
            o = new psd((hb)pf6, (psd$a)zvj);
            o2 = new psd((hb)pf7, (psd$a)zvj);
            o3 = new psd((hb)pf8, (psd$a)zvj);
        }
        final ubs ubs = new ubs(jbs);
        return new c((daq)new u83((daq<Object, Object>)new ce6((daq)new psd((hb)o, (psd$a)ubs), (daq)new psd((hb)o2, (psd$a)ubs), (daq)new psd((hb)o3, (psd$a)ubs))), ibm, you);
    }
    
    public static keu g(final bfm bfm) {
        final kyu kyu = (kyu)ca7.u((Class)kyu.class);
        zzd.f((Object)bfm, "factories");
        return (keu)new leu(false, (z19)z19.c, bfm);
    }
    
    public static MviViewModel h(final SpacesCardViewModel spacesCardViewModel) {
        final SpacesCardObjectGraph.a a = (SpacesCardObjectGraph.a)ca7.u((Class)SpacesCardObjectGraph.a.class);
        zzd.f((Object)spacesCardViewModel, "viewModel");
        return (MviViewModel)spacesCardViewModel;
    }
}
