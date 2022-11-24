import java.util.Collection;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class kdl<OBJECT, ERROR> extends i5w<OBJECT, ERROR>
{
    public final qgv c1;
    public qgv d1;
    public o2k e1;
    public final Context f1;
    public final kbv g1;
    public int h1;
    public atc<qgv, zbv> i1;
    
    public kdl(final Context f1, final UserIdentifier userIdentifier, final qgv c1) {
        final kbv d2 = kbv.d2(userIdentifier);
        super(userIdentifier);
        this.f1 = f1;
        this.c1 = c1;
        this.g1 = d2;
    }
    
    public kdl(final Context f1, final UserIdentifier userIdentifier, final qgv c1, final kbv g1) {
        super(userIdentifier);
        this.f1 = f1;
        this.c1 = c1;
        this.g1 = g1;
    }
    
    public final String g0() {
        return zcv.a().b;
    }
    
    public final atc<qgv, zbv> j0() {
        final p9g c = p9g.c((Class)qgv.class);
        this.i1 = (p9g$e)c;
        return (atc<qgv, zbv>)c;
    }
    
    public final boolean k0(final xsc xsc) {
        final p9g$e i1 = this.i1;
        if (i1 != null) {
            final qgv qgv = (qgv)((atc)i1).F0;
            if (xsc.b && qgv != null) {
                final qgv$b qgv$b = new qgv$b(qgv);
                Boolean false;
                if (this.e1.a != null) {
                    false = Boolean.FALSE;
                }
                else {
                    false = null;
                }
                ((qgv$a)qgv$b).p(false);
                this.d1 = (qgv)((z4j)qgv$b).e();
                final qdw e = pdw.e(((pnm)this).S0);
                if (e != null) {
                    e.b(this.d1);
                }
                final tn6 z = ((pnm)this).Z(this.f1);
                this.g1.W3((Collection)ojf.v((Object)this.d1), -1L, -1, -1L, (String)null, (String)null, z);
                z.b();
            }
            return xsc.b;
        }
        throw new IllegalStateException();
    }
}
