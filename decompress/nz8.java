import java.util.Iterator;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nz8 extends i1v<lz8>
{
    public static final tba l1;
    public lz8 i1;
    public mav j1;
    public final String k1;
    
    static {
        l1 = (tba)rba.c("app", "twitter_service", "mute_keywords", "discouraged");
    }
    
    public nz8(final UserIdentifier userIdentifier, final String k1) {
        super(userIdentifier, 0);
        this.k1 = k1;
        ((cw0)this).G((ysm)new jdi());
        ((j1p$a)this.Y()).a.J0 = (sba)nz8.l1;
    }
    
    @Override
    public final qrc f0() {
        final rbv rbv = new rbv();
        ((qrc.a)rbv).e = xrc$b.E0;
        final int a = w4j.a;
        ((qrc.a)rbv).n("/1.1/mutes/keywords/discouraged.json", "/");
        ((qrc.a)rbv).d("lang", this.k1);
        return ((qrc.a)rbv).k();
    }
    
    @Override
    public final wsc<lz8, pav> g0() {
        return (wsc<lz8, pav>)f9g.c((Class)lz8.class);
    }
    
    @Override
    public final void m0(final tsc<lz8, pav> tsc) {
        this.i1 = null;
        final pav pav = (pav)tsc.h;
        if (pav != null) {
            final Iterator<mav> iterator = pav.iterator();
            if (iterator.hasNext()) {
                this.j1 = iterator.next();
            }
        }
    }
    
    @Override
    public final void n0(final tsc<lz8, pav> tsc) {
        this.i1 = (lz8)tsc.g;
        this.j1 = null;
    }
}
