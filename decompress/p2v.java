import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class p2v<OBJECT> extends gh0<OBJECT, zbv>
{
    public p2v(final UserIdentifier userIdentifier, final int n) {
        super(userIdentifier, n);
        ((aw0<OBJECT>)this).G((fum<OBJECT>)new ybv());
        ((v2p$a)((pnm)this).Y()).a.N0 = (nuk)new isf((Object)this, 3);
    }
    
    public xsc<OBJECT, zbv> i0(xsc<OBJECT, zbv> c) {
        if (c.b) {
            if (this.l0((xsc<OBJECT, zbv>)c)) {
                this.n0((xsc<OBJECT, zbv>)c);
                return (xsc<OBJECT, zbv>)c;
            }
            final zbv zbv = (zbv)c.h;
            Label_0083: {
                if (!kr4.s((Iterable)zbv)) {
                    final asc f = c.f;
                    if (f != null) {
                        c = new xsc(false, f, (Object)null, (Object)zbv);
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
                c = xsc.c(0, s);
            }
            this.m0((xsc<OBJECT, zbv>)c);
        }
        else {
            this.m0((xsc<OBJECT, zbv>)c);
        }
        return (xsc<OBJECT, zbv>)c;
    }
    
    public boolean l0(final xsc<OBJECT, zbv> xsc) {
        return xli.w((xsc)xsc);
    }
    
    public void m0(final xsc<OBJECT, zbv> xsc) {
    }
    
    public void n0(final xsc<OBJECT, zbv> xsc) {
    }
}
