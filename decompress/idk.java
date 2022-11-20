import com.twitter.util.InvalidDataException;
import java.util.Collection;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class idk extends tp1<tmi>
{
    public final UserIdentifier E0;
    public final nm6 F0;
    public final jdk G0;
    public final vav H0;
    
    public idk(final UserIdentifier e0, final nm6 f0, final jdk g0, final vav h0) {
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final void b(Object o) {
        final tmi tmi = (tmi)o;
        final long id = this.E0.getId();
        final nus nus = new nus(this.H0);
        final mws$a mws$a = new mws$a();
        mws$a.c = id;
        mws$a.a = 27;
        nus.d((mws)((n4j)mws$a).e(), this.F0);
        mws$a.a = 28;
        nus.d((mws)((n4j)mws$a).e(), this.F0);
        final cgv y1 = this.H0.Y1(id);
        final jdk g0 = this.G0;
        long a;
        if (g0.b) {
            a = g0.a;
        }
        else {
            a = 0L;
        }
        if (y1 != null && y1.k1 != a) {
            o = new cgv$b(y1);
            ((cgv$a)o).N = a;
            final int a2 = c5j.a;
            final cgv cgv = (cgv)((n4j)o).e();
            this.H0.V3((Collection)rif.v((Object)cgv), -1L, -1, -1L, (String)null, (String)null, this.F0);
            this.F0.b();
            if (id == cgv.D0) {
                final adw e = zcw.e(this.E0);
                if (e != null) {
                    e.b(cgv);
                }
            }
        }
    }
    
    public final void onError(final Throwable t) {
        m8a.d((Throwable)new InvalidDataException("Received null status."));
    }
}
