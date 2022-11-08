import java.util.Collection;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class kcl<OBJECT, ERROR> extends g4w<OBJECT, ERROR>
{
    public final hfv Z0;
    public hfv a1;
    public v1k b1;
    public final Context c1;
    public final aav d1;
    public int e1;
    public wsc<hfv, pav> f1;
    
    public kcl(final Context c1, final UserIdentifier userIdentifier, final hfv z0) {
        final aav d2 = aav.d2(userIdentifier);
        super(userIdentifier);
        this.c1 = c1;
        this.Z0 = z0;
        this.d1 = d2;
    }
    
    public kcl(final Context c1, final UserIdentifier userIdentifier, final hfv z0, final aav d1) {
        super(userIdentifier);
        this.c1 = c1;
        this.Z0 = z0;
        this.d1 = d1;
    }
    
    @Override
    public final String g0() {
        return qbv.a().b;
    }
    
    public final wsc<hfv, pav> j0() {
        final f9g c = f9g.c((Class)hfv.class);
        this.f1 = (f9g.e)c;
        return (wsc<hfv, pav>)c;
    }
    
    public final boolean k0(final tsc tsc) {
        final f9g.e f1 = this.f1;
        if (f1 != null) {
            final hfv hfv = (hfv)((wsc)f1).C0;
            if (tsc.b && hfv != null) {
                final hfv$b hfv$b = new hfv$b(hfv);
                Boolean false;
                if (this.b1.a != null) {
                    false = Boolean.FALSE;
                }
                else {
                    false = null;
                }
                ((hfv$a)hfv$b).p(false);
                this.a1 = (hfv)((h4j)hfv$b).e();
                final ocw e = ncw.e(super.P0);
                if (e != null) {
                    e.d(this.a1);
                }
                final hn6 z = this.Z(this.c1);
                this.d1.W3((Collection)ijf.v((Object)this.a1), -1L, -1, -1L, (String)null, (String)null, z);
                z.b();
            }
            return tsc.b;
        }
        throw new IllegalStateException();
    }
}
