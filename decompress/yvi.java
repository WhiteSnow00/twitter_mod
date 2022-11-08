import java.util.Iterator;
import com.twitter.util.user.UserIdentifier;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yvi implements mq0
{
    public final cl0 C0;
    public final qll<gew> D0;
    public final eql E0;
    public final vpl F0;
    public final ser G0;
    public final cfw<uxi> H0;
    public final ndv I0;
    public final ko0 J0;
    public final fk6<fvj<List<jsi>, UserIdentifier>> K0;
    
    public yvi(final cl0 c0, final qll<gew> d0, final eql e0, final vpl f0, final ser g0, final cfw<uxi> h0, final ndv i0, final ko0 j0) {
        zzd.f((Object)c0, "appConfig");
        zzd.f((Object)d0, "userManager");
        zzd.f((Object)e0, "pushNotificationsRepository");
        zzd.f((Object)f0, "pushNotificationPresenter");
        zzd.f((Object)g0, "statusBarNotificationClientEventLogFactory");
        zzd.f((Object)h0, "notificationsSettingsChecker");
        zzd.f((Object)i0, "twitterOpenBack");
        zzd.f((Object)j0, "appStandbyScriber");
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = new lno((Object)this, 9);
    }
    
    public final void run() {
        final List d = ((gew)this.D0.get()).d();
        zzd.e((Object)d, "userManager.get().allLoggedIn");
        for (final UserIdentifier userIdentifier : d) {
            final eql e0 = this.E0;
            zzd.e((Object)userIdentifier, "userId");
            e0.c(userIdentifier).w((qtb)new q3m((rtb)new yvi$a(userIdentifier), 1)).G((fk6)this.K0, (fk6)new s41((Object)this, (Object)userIdentifier, 6));
        }
        if (((uxi)((hyr)this.H0).get((Object)((gew)this.D0.get()).b())).c()) {
            final List d2 = ((gew)this.D0.get()).d();
            zzd.e((Object)d2, "userManager.get().allLoggedIn");
            if (fk7.A0(d2)) {
                this.I0.b();
            }
        }
        this.J0.a();
    }
    
    public final boolean x0(final int n, final int n2) {
        boolean b;
        if (n >= n2) {
            this.C0.t();
            b = false;
        }
        else {
            b = true;
        }
        return b;
    }
}
