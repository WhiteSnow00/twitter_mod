import java.util.Iterator;
import com.twitter.util.user.UserIdentifier;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n2c extends i1v<List<obg>>
{
    public final UserIdentifier i1;
    public List<obg> j1;
    public int[] k1;
    
    public n2c(final UserIdentifier userIdentifier, final UserIdentifier i1) {
        super(userIdentifier, 0);
        this.i1 = i1;
    }
    
    @Override
    public final qrc f0() {
        final rbv u = lf.u("/1.1/account/login_verification_request.json", "/");
        final int a = w4j.a;
        return ((qrc.a)u).k();
    }
    
    @Override
    public final wsc<List<obg>, pav> g0() {
        return (wsc<List<obg>, pav>)f9g.e((Class)obg.class);
    }
    
    @Override
    public final void m0(final tsc<List<obg>, pav> tsc) {
        this.k1 = pav.g((pav)tsc.h);
    }
    
    @Override
    public final void n0(final tsc<List<obg>, pav> tsc) {
        final List j1 = (List)tsc.g;
        pf8.r(j1);
        final Iterator iterator = j1.iterator();
        while (iterator.hasNext()) {
            ((obg)iterator.next()).H0 = this.i1;
        }
        this.j1 = j1;
    }
}
