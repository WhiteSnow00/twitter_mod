// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.settings.implementation;

import java.util.List;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/notifications/settings/implementation/TweetSettingsViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lvtu;", "", "Lzsu;", "subsystem.tfa.notifications.tweet-settings.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class TweetSettingsViewModel extends MviViewModel<vtu, Object, zsu>
{
    public static final int U0 = 0;
    public final UserIdentifier Q0;
    public final Context R0;
    public final tsc S0;
    public final viw T0;
    
    public TweetSettingsViewModel(final kcm kcm, final fda<btu> fda, final UserIdentifier q0, final Context r0, final tsc s0, final viw t0) {
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)fda, "eventObservable");
        e0e.f((Object)q0, "userId");
        e0e.f((Object)r0, "context");
        e0e.f((Object)s0, "requestController");
        e0e.f((Object)t0, "userRepository");
        final String string = r0.getResources().getString(2131954815);
        e0e.e((Object)string, "context.resources.getString(loading)");
        super((iae)kcm, (ccx)new vtu(string, (List)h3a.F0));
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.T0 = t0;
        final it2 it2 = new it2(r0, q0, 43);
        it2.d1 = 400;
        this.C((bbq)s0.a(it2), (stb)new stb<gzh<vtu, it2>, vzv>(this) {
            public final TweetSettingsViewModel F0;
            
            public final Object invoke(final Object o) {
                final gzh gzh = (gzh)o;
                e0e.f((Object)gzh, "$this$intoWeaver");
                gzh.e((hub)new a(this.F0, (mp6)null));
                gzh.c((hub)new b(this.F0, (mp6)null));
                return vzv.a;
            }
        });
        MviViewModel.M((MviViewModel)this, fda.v0(), (String)null, (asx)null, (hub)new TweetSettingsViewModel$b(this, (mp6)null), 3, (Object)null);
    }
}
