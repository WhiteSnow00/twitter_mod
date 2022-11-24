import com.twitter.card.di.BaseCardObjectGraph$a;
import java.util.Iterator;
import com.twitter.card.broadcast.di.BroadcastCardObjectGraph$a;
import java.util.Set;
import tv.periscope.android.graphics.GLRenderView;
import android.view.View;
import com.twitter.card.unified.di.card.UnifiedCardObjectGraph$a;
import com.twitter.card.di.card.b;
import com.twitter.card.di.card.LegacyCardObjectGraph$a;
import java.util.Objects;
import com.twitter.onboarding.ocf.di.ToggleWrapperObjectGraph;
import com.twitter.profiles.navigation.ImageActivityRetainedGraph$a;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hd3 implements bra
{
    public static rrg a(final Activity activity, final k9x k9x, final kcm kcm, final UserIdentifier userIdentifier) {
        final ey3$a ey3$a = (ey3$a)lp7.m0((Class)ey3$a.class);
        e0e.f((Object)activity, "activity");
        e0e.f((Object)k9x, "viewLifecycle");
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)userIdentifier, "owner");
        return new rrg((Context)activity, (rn)new vrx((Object)activity, 19), "dm_composition", e2h.Q0, userIdentifier, k9x, kcm, 1);
    }
    
    public static o6x b(final k9x k9x) {
        final hcl hcl = (hcl)lp7.m0((Class)hcl.class);
        e0e.f((Object)k9x, "viewLifecycle");
        return ylx.a((stb)new gcl(k9x));
    }
    
    public static mcv c() {
        final ImageActivityRetainedGraph$a imageActivityRetainedGraph$a = (ImageActivityRetainedGraph$a)lp7.m0((Class)ImageActivityRetainedGraph$a.class);
        final mcv$b mcv$b = new mcv$b();
        ((v9$a)mcv$b).a = 2131624618;
        final int a = o5j.a;
        ((v9$a)mcv$b).b = false;
        ((mcv$a)mcv$b).d = false;
        ((v9$a)mcv$b).c = 6;
        return (mcv)((z4j)mcv$b).e();
    }
    
    public static zgt d(final x3e x3e) {
        final ToggleWrapperObjectGraph.a a = (ToggleWrapperObjectGraph.a)lp7.m0((Class)ToggleWrapperObjectGraph.a.class);
        e0e.f((Object)x3e, "item");
        final zgt zgt = (zgt)x3e.a;
        Objects.requireNonNull(zgt, "Cannot return null from a non-@Nullable @Provides method");
        return zgt;
    }
    
    public static Object e(final gk3 gk3, final y06 y06, final kcm kcm) {
        final LegacyCardObjectGraph$a legacyCardObjectGraph$a = (LegacyCardObjectGraph$a)lp7.m0((Class)LegacyCardObjectGraph$a.class);
        e0e.f((Object)gk3, "cardLifecycle");
        e0e.f((Object)y06, "subject");
        e0e.f((Object)kcm, "releaseCompletable");
        return new b(gk3, kcm, y06);
    }
    
    public static h6k f(final UserIdentifier userIdentifier) {
        return i6k.a(userIdentifier, (String)null);
    }
    
    public static kk3 g() {
        final UnifiedCardObjectGraph$a unifiedCardObjectGraph$a = (UnifiedCardObjectGraph$a)lp7.m0((Class)UnifiedCardObjectGraph$a.class);
        return new kk3();
    }
    
    public static GLRenderView h(final View view) {
        final GLRenderView glRenderView = (GLRenderView)view.findViewById(2131428065);
        Objects.requireNonNull(glRenderView, "Cannot return null from a non-@Nullable @Provides method");
        return glRenderView;
    }
    
    public static yzr i(final oyv oyv, final wwv wwv) {
        final UnifiedCardObjectGraph$a unifiedCardObjectGraph$a = (UnifiedCardObjectGraph$a)lp7.m0((Class)UnifiedCardObjectGraph$a.class);
        e0e.f((Object)wwv, "bindData");
        return (yzr)new cyv((Object)oyv, (Object)wwv, 0);
    }
    
    public static ik3 j(final Set set) {
        final BroadcastCardObjectGraph$a broadcastCardObjectGraph$a = (BroadcastCardObjectGraph$a)lp7.m0((Class)BroadcastCardObjectGraph$a.class);
        final ik3 ik3 = new ik3();
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            ((ql1)ik3).a((Object)iterator.next());
        }
        return ik3;
    }
    
    public static gra k(final Context context, final sfv sfv) {
        final pzu pzu = (pzu)lp7.m0((Class)pzu.class);
        e0e.f((Object)context, "context");
        e0e.f((Object)sfv, "scribeAssociation");
        return (gra)new epf((Object)context, (Object)sfv, 1);
    }
    
    public static y06 l() {
        final BaseCardObjectGraph$a baseCardObjectGraph$a = (BaseCardObjectGraph$a)lp7.m0((Class)BaseCardObjectGraph$a.class);
        return new y06();
    }
}
