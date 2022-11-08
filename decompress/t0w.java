import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class t0w extends i1v<pmi>
{
    public t0w(final UserIdentifier userIdentifier) {
        super(userIdentifier, 0);
        final int[] e0 = pav.E0;
    }
    
    @Override
    public final qrc f0() {
        final rbv rbv = new rbv();
        ((qrc.a)rbv).e = xrc$b.F0;
        final int a = w4j.a;
        ((qrc.a)rbv).n("/1.1/device/unregister.json", "/");
        return ((qrc.a)rbv).k();
    }
    
    @Override
    public final wsc<pmi, pav> g0() {
        return (wsc<pmi, pav>)f9g.d();
    }
    
    @Override
    public final void m0(final tsc<pmi, pav> tsc) {
        pav.g((pav)tsc.h);
    }
}
