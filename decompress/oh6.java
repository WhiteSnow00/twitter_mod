import com.twitter.onboarding.sso.core.connectedaccounts.ConnectedAccountsViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oh6 extends k76
{
    public final ph6 H0;
    
    public oh6(final v76 v76, final ph6 h0) {
        e0e.f((Object)v76, "composeDependencies");
        e0e.f((Object)h0, "effectHandler");
        super(v76);
        this.H0 = h0;
    }
    
    public final void a(d86 h, final int n) {
        h = h.h(369656584);
        final sa6$b a = sa6.a;
        sh6.e(this.H0, (ConnectedAccountsViewModel)null, h, 8, 2);
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new oh6$a(this, n));
        }
    }
}
