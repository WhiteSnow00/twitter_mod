import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oam extends i1v<pmi>
{
    public final fbg i1;
    public int[] j1;
    
    public oam(final UserIdentifier userIdentifier, final fbg i1) {
        super(userIdentifier, 0);
        this.i1 = i1;
    }
    
    @Override
    public final qrc f0() {
        final rbv rbv = new rbv();
        ((qrc.a)rbv).e = xrc$b.G0;
        final int a = w4j.a;
        ((qrc.a)rbv).n("/1.1/account/login_verification_request.json", "/");
        ((qrc.a)rbv).d("lv_id", this.i1.a);
        ((qrc.a)rbv).d("challenge_response", this.i1.b);
        return ((qrc.a)rbv).k();
    }
    
    @Override
    public final wsc<pmi, pav> g0() {
        return (wsc<pmi, pav>)f9g.d();
    }
    
    @Override
    public final void m0(final tsc<pmi, pav> tsc) {
        this.j1 = pav.g((pav)tsc.h);
    }
}
