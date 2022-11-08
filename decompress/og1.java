import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class og1 extends i1v<pg1>
{
    public pg1 i1;
    public final boolean j1;
    
    public og1(final UserIdentifier userIdentifier, final boolean j1) {
        super(userIdentifier, 0);
        this.j1 = j1;
    }
    
    @Override
    public final qrc f0() {
        final rbv u = lf.u("/1.1/account/backup_code.json", "/");
        final int a = w4j.a;
        if (this.j1) {
            ((qrc.a)u).e = xrc$b.E0;
        }
        else {
            ((qrc.a)u).e = xrc$b.F0;
        }
        return ((qrc.a)u).k();
    }
    
    @Override
    public final wsc<pg1, pav> g0() {
        return (wsc<pg1, pav>)f9g.c((Class)pg1.class);
    }
    
    @Override
    public final void m0(final tsc<pg1, pav> tsc) {
        pav.g((pav)tsc.h);
    }
    
    @Override
    public final void n0(final tsc<pg1, pav> tsc) {
        this.i1 = (pg1)tsc.g;
    }
}
