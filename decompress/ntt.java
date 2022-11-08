import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ntt extends i1v<ott>
{
    public ott i1;
    public final UserIdentifier j1;
    
    public ntt(final UserIdentifier j1) {
        super(j1, 0);
        this.j1 = j1;
    }
    
    @Override
    public final qrc f0() {
        final rbv u = lf.u("/1.1/account/totp_code.json", "/");
        final int a = w4j.a;
        ((qrc.a)u).e = xrc$b.E0;
        return ((qrc.a)u).k();
    }
    
    @Override
    public final wsc<ott, pav> g0() {
        return (wsc<ott, pav>)f9g.c((Class)ott.class);
    }
    
    @Override
    public final void m0(final tsc<ott, pav> tsc) {
        pav.g((pav)tsc.h);
    }
    
    @Override
    public final void n0(final tsc<ott, pav> tsc) {
        final ott i1 = (ott)tsc.g;
        this.i1 = i1;
        wau.e(this.j1, "login_verification").i().b("lv_totp_secret", i1.a).e();
    }
}
