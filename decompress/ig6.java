import com.twitter.onboarding.sso.core.connectedaccounts.ConnectedAccountsViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ig6 extends e66
{
    public final jg6 F0;
    
    public ig6(final p66 p2, final jg6 f0) {
        czd.f((Object)p2, "composeDependencies");
        czd.f((Object)f0, "effectHandler");
        super(p2);
        this.F0 = f0;
    }
    
    public final void a(x66 h, final int n) {
        h = h.h(369656584);
        final n96$b a = n96.a;
        mg6.e(this.F0, (ConnectedAccountsViewModel)null, h, 8, 2);
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ig6$a(this, n));
        }
    }
}
