import java.util.Iterator;
import java.util.List;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pau implements iq0
{
    public final fgw<rau> F0;
    public final kfw G0;
    public final ccb H0;
    public final mwt I0;
    
    public pau(final fgw<rau> f0, final kfw g0, final ccb h0, final mwt i0) {
        e0e.f((Object)f0, "trustedFriendsRepoUserObjectProvider");
        e0e.f((Object)g0, "userManager");
        e0e.f((Object)h0, "flushDatabaseManager");
        e0e.f((Object)i0, "tracer");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public final void run() {
        final List d = this.G0.d();
        e0e.e((Object)d, "userManager.allLoggedIn");
        for (final UserIdentifier userIdentifier : d) {
            final mwt i0 = this.I0;
            e0e.e((Object)userIdentifier, "userIdentifier");
            final o1k f = mwt.f(i0, "prefetch-trusted-friends", userIdentifier, 0, false, (mwt$b)null, 124);
            e0e.c((Object)f);
            f.start();
            final Object value = ((vzr)this.F0).get((Object)userIdentifier);
            e0e.e(value, "trustedFriendsRepoUserOb\u2026vider.get(userIdentifier)");
            final t5j observeOn = ((rau)value).g(true).observeOn(jxo.c());
            e0e.e((Object)observeOn, "loggedInUserTrustedFrien\u2026bserveOn(Schedulers.io())");
            final e39 e39 = new e39();
            e39.c(observeOn.subscribe((rk6)new f$f4((stb)new pau$a(e39, f))));
        }
    }
    
    public final boolean w0(final int n, final int n2) {
        return this.H0.a();
    }
}
