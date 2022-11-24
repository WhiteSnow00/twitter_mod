// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.settings.compose;

import com.twitter.util.user.UserIdentifier;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004" }, d2 = { "Lcom/twitter/notifications/settings/compose/NotificationSettingsNewViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lvvi;", "", "subsystem.tfa.notifications.settings.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class NotificationSettingsNewViewModel extends MviViewModel<vvi, Object, Object>
{
    public static final int V0 = 0;
    public final gcu Q0;
    public final qdw R0;
    public final UserIdentifier S0;
    public final ujw T0;
    public final ch1 U0;
    
    public NotificationSettingsNewViewModel(final gcu q0, final kcm kcm, final qdw r0, final NotificationSettingsNewArgs notificationSettingsNewArgs, final UserIdentifier s0, final ujw t0, final ch1 u0) {
        e0e.f((Object)q0, "preferences");
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)r0, "userInfo");
        e0e.f((Object)notificationSettingsNewArgs, "args");
        e0e.f((Object)s0, "userIdentifier");
        e0e.f((Object)t0, "userRepository");
        e0e.f((Object)u0, "pushCountProducer");
        String c;
        if ((c = r0.c()) == null) {
            c = "";
        }
        final ojw a = r0.A();
        l6q l6q;
        if (notificationSettingsNewArgs.getShowFilters()) {
            l6q = l6q.F0;
        }
        else {
            l6q = l6q.G0;
        }
        super((iae)kcm, (ccx)new vvi(l6q, false, a, false, c, q0.e("launcher_icon_badge_enabled", true)));
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.T0 = t0;
        this.U0 = u0;
        this.T((stb)new ovi(this));
        MviViewModel.M((MviViewModel)this, (t5j)t0.c(notificationSettingsNewArgs.getSyncSettings()), (String)null, (asx)null, (hub)new pvi(this, (mp6)null), 3, (Object)null);
    }
}
