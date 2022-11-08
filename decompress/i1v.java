import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class i1v<OBJECT> extends jh0<OBJECT, pav>
{
    public i1v(final UserIdentifier userIdentifier, final int n) {
        super(userIdentifier, n);
        ((cw0)this).G((ysm)new oav<Object>());
        ((j1p$a)this.Y()).a.K0 = (otk<tsc<OBJECT, ERROR>>)new h1v((Object)this, 0);
    }
    
    @Override
    public tsc<OBJECT, pav> i0(tsc<OBJECT, pav> c) {
        if (c.b) {
            if (this.l0((tsc<OBJECT, pav>)c)) {
                this.n0((tsc<OBJECT, pav>)c);
                return (tsc<OBJECT, pav>)c;
            }
            final pav pav = (pav)c.h;
            Label_0083: {
                if (!hr4.s((Iterable)pav)) {
                    final xrc f = c.f;
                    if (f != null) {
                        c = new tsc(false, f, (Object)null, (Object)pav);
                        break Label_0083;
                    }
                }
                String s;
                if (c.f == null) {
                    s = "Invalid http operation";
                }
                else {
                    s = "Invalid error";
                }
                c = tsc.c(0, s);
            }
            this.m0((tsc<OBJECT, pav>)c);
        }
        else {
            this.m0((tsc<OBJECT, pav>)c);
        }
        return (tsc<OBJECT, pav>)c;
    }
    
    public boolean l0(final tsc<OBJECT, pav> tsc) {
        return zi8.H(tsc);
    }
    
    public void m0(final tsc<OBJECT, pav> tsc) {
    }
    
    public void n0(final tsc<OBJECT, pav> tsc) {
    }
}
