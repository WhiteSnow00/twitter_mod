import com.twitter.api.model.json.account.JsonGraphQlVerifyCredentialsResponse;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rrw extends i1v<hfv>
{
    public static final tba j1;
    public hfv i1;
    
    static {
        j1 = (tba)rba.c("app", "twitter_service", "account", "verify_credentials");
    }
    
    public rrw(final UserIdentifier userIdentifier, final mdv mdv) {
        super(userIdentifier, 0);
        if (mdv != null) {
            super.Y0 = new h2b(i3j.N(), mdv);
            final int a = w4j.a;
        }
        ((cw0)this).G((ysm)new xci());
        ((j1p$a)this.Y()).a.J0 = (sba)rrw.j1;
    }
    
    @Override
    public final qrc f0() {
        return (qrc)l7k.b("viewer_user_query");
    }
    
    @Override
    public final wsc<hfv, pav> g0() {
        return (wsc<hfv, pav>)d8c.c((Class)JsonGraphQlVerifyCredentialsResponse.class, "viewer");
    }
    
    @Override
    public final void n0(final tsc<hfv, pav> tsc) {
        this.i1 = (hfv)tsc.g;
    }
}
