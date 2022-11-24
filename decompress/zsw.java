import com.twitter.api.model.json.account.JsonGraphQlVerifyCredentialsResponse;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zsw extends p2v<qgv>
{
    public static final jca m1;
    public qgv l1;
    
    static {
        m1 = (jca)hca.c("app", "twitter_service", "account", "verify_credentials");
    }
    
    public zsw(final UserIdentifier userIdentifier, final vev vev) {
        super(userIdentifier, 0);
        if (vev != null) {
            super.b1 = new d2b(b4j.N(), vev);
            final int a = o5j.a;
        }
        ((aw0<Object>)this).G((fum<Object>)new rdi());
        ((v2p$a)((pnm)this).Y()).a.M0 = (ica)zsw.m1;
    }
    
    public final trc f0() {
        return (trc)bng.f("viewer_user_query");
    }
    
    public final atc<qgv, zbv> g0() {
        return (atc<qgv, zbv>)g8c.c((Class)JsonGraphQlVerifyCredentialsResponse.class, "viewer");
    }
    
    @Override
    public final void n0(final xsc<qgv, zbv> xsc) {
        this.l1 = (qgv)xsc.g;
    }
}
