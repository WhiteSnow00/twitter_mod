import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cxk implements iq0
{
    public final xk0 F0;
    public final kfw G0;
    public final eo1 H0;
    public final uwi I0;
    
    public cxk(final xk0 f0, final kfw g0, final eo1 h0, final uwi i0) {
        e0e.f((Object)f0, "appConfig");
        e0e.f((Object)g0, "userManager");
        e0e.f((Object)h0, "baseNotificationController");
        e0e.f((Object)i0, "notificationsChannelsManager");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public final void run() {
        final bti$a bti$a = new bti$a();
        bti$a.i = "https://www.twitter.com/login";
        bti$a.d = "Welcome to Twitter";
        bti$a.e = "If you see this notification please report it in #android-notifications";
        bti$a.G = "TWITTER";
        bti$a.x = this.I0.b();
        bti$a.a = 9;
        bti$a.p(UserIdentifier.LOGGED_OUT);
        bti$a.l = 123L;
        this.H0.e((bti)((z4j)bti$a).e(), iwi.a());
    }
    
    public final boolean w0(final int n, final int n2) {
        final boolean b = false;
        boolean b2;
        if (n >= n2) {
            this.F0.t();
            b2 = b;
        }
        else {
            b2 = b;
            if (this.G0.d().isEmpty()) {
                b2 = b;
                if (ita.d().b("android_preloaded_notifications_enabled", false)) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
}
