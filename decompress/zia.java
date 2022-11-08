import com.twitter.card.di.BaseCardObjectGraph$a;
import com.twitter.rooms.cards.di.card.SpacesCardObjectGraph;
import java.util.Map;
import com.twitter.card.broadcast.di.BroadcastCardObjectGraph$a;
import java.util.Objects;
import tv.periscope.android.graphics.GLRenderView;
import android.view.View;
import com.twitter.card.unified.di.card.UnifiedCardObjectGraph$a;
import androidx.fragment.app.Fragment;
import java.util.Iterator;
import com.twitter.android.liveevent.card.di.LiveEventCardObjectGraph$a;
import java.util.Set;
import com.twitter.card.di.card.LegacyCardObjectGraph$a;
import com.twitter.profiles.filterbar.FilterBarViewModel;
import com.twitter.rooms.docker.RoomDockerStubViewModel;
import com.twitter.profiles.navigation.b;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zia implements wqa
{
    public static yqg a(final Activity activity, final z7x z7x, final ibm ibm, final UserIdentifier userIdentifier) {
        final wx3$a wx3$a = (wx3$a)ca7.u((Class)wx3$a.class);
        zzd.f((Object)activity, "activity");
        zzd.f((Object)z7x, "viewLifecycle");
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)userIdentifier, "owner");
        return new yqg((Context)activity, (on)new cg8((Object)activity, 25), "dm_composition", l1h.N0, userIdentifier, z7x, ibm, 1);
    }
    
    public static ibi b() {
        final b b = (b)ca7.u((Class)b.class);
        return new ibi(ljr.Companion.b(""), 2);
    }
    
    public static c5x c() {
        final pfn pfn = (pfn)ca7.u((Class)pfn.class);
        return (c5x)goz.k(g9m.a((Class)RoomDockerStubViewModel.class), (rtb)nfn.C0);
    }
    
    public static yix d() {
        final rza rza = (rza)ca7.u((Class)rza.class);
        return new yix(new r8x((Class)FilterBarViewModel.class, ""), (g5x)new g5x$a("FilterBar"), (c9x)c9x$c.a);
    }
    
    public static Object e(final xj3 xj3, final i06 i06, final ibm ibm) {
        final LegacyCardObjectGraph$a legacyCardObjectGraph$a = (LegacyCardObjectGraph$a)ca7.u((Class)LegacyCardObjectGraph$a.class);
        zzd.f((Object)xj3, "cardLifecycle");
        zzd.f((Object)i06, "subject");
        zzd.f((Object)ibm, "releaseCompletable");
        return new com.twitter.card.di.card.b(xj3, ibm, i06);
    }
    
    public static nca f(final qrs qrs) {
        return nca.g(qrs.j(), qrs.l(), "tweet", "link", "open_link");
    }
    
    public static n5k g(final UserIdentifier userIdentifier) {
        return o5k.a(userIdentifier, (String)null);
    }
    
    public static zj3 h(final Set set) {
        final LiveEventCardObjectGraph$a liveEventCardObjectGraph$a = (LiveEventCardObjectGraph$a)ca7.u((Class)LiveEventCardObjectGraph$a.class);
        zzd.f((Object)set, "listeners");
        final zj3 zj3 = new zj3();
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            ((ql1)zj3).a((Object)iterator.next());
        }
        return zj3;
    }
    
    public static c4e i(final l4e l4e, final x3e x3e, final ibm ibm) {
        final dio dio = (dio)ca7.u((Class)dio.class);
        zzd.f((Object)l4e, "collectionProvider");
        zzd.f((Object)x3e, "viewBinderDirectory");
        zzd.f((Object)ibm, "releaseCompletable");
        return new c4e((y4e)l4e, x3e, ibm);
    }
    
    public static nl3 j(final rnd rnd, final ml3 ml3, final fea fea, final lwm lwm, final qvo qvo, final qvo qvo2, final ibm ibm) {
        return (nl3)new xf8((Fragment)rnd, ml3, (jva)fea, false, lwm, qvo, qvo2, ibm);
    }
    
    public static bk3 k() {
        final UnifiedCardObjectGraph$a unifiedCardObjectGraph$a = (UnifiedCardObjectGraph$a)ca7.u((Class)UnifiedCardObjectGraph$a.class);
        return new bk3();
    }
    
    public static cfw l(final afw afw) {
        final km7 km7 = (km7)ca7.u((Class)km7.class);
        zzd.f((Object)afw, "userObjectGraphProvider");
        return (cfw)new jm7(afw, 0);
    }
    
    public static GLRenderView m(final View view) {
        final GLRenderView glRenderView = (GLRenderView)view.findViewById(2131428065);
        Objects.requireNonNull(glRenderView, "Cannot return null from a non-@Nullable @Provides method");
        return glRenderView;
    }
    
    public static kyr n(final hxv hxv, final qvv qvv) {
        final UnifiedCardObjectGraph$a unifiedCardObjectGraph$a = (UnifiedCardObjectGraph$a)ca7.u((Class)UnifiedCardObjectGraph$a.class);
        zzd.f((Object)qvv, "bindData");
        return (kyr)new vwv(hxv, qvv);
    }
    
    public static thv o(final UserIdentifier userIdentifier, final ibm ibm) {
        final m38 m38 = (m38)ca7.u((Class)m38.class);
        zzd.f((Object)userIdentifier, "owner");
        zzd.f((Object)ibm, "releaseCompletable");
        return new thv(userIdentifier, ibm);
    }
    
    public static zj3 p(final Set set) {
        final BroadcastCardObjectGraph$a broadcastCardObjectGraph$a = (BroadcastCardObjectGraph$a)ca7.u((Class)BroadcastCardObjectGraph$a.class);
        final zj3 zj3 = new zj3();
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            ((ql1)zj3).a((Object)iterator.next());
        }
        return zj3;
    }
    
    public static y8x q(final Map map) {
        final SpacesCardObjectGraph.a a = (SpacesCardObjectGraph.a)ca7.u((Class)SpacesCardObjectGraph.a.class);
        return new y8x(mv8.b(map));
    }
    
    public static i06 r() {
        final BaseCardObjectGraph$a baseCardObjectGraph$a = (BaseCardObjectGraph$a)ca7.u((Class)BaseCardObjectGraph$a.class);
        return new i06();
    }
}
