import java.util.HashMap;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class zn1 extends p2v<qgv>
{
    public final gjl l1;
    public final long m1;
    
    public zn1(final UserIdentifier userIdentifier, final long m1, final gjl l1) {
        super(userIdentifier, 0);
        this.m1 = m1;
        this.l1 = l1;
    }
    
    public final atc<qgv, zbv> g0() {
        return (atc<qgv, zbv>)p9g.c((Class)qgv.class);
    }
    
    public final void o0(final trc$a trc$a) {
        final gjl l1 = this.l1;
        if (l1 != null) {
            final String a = l1.a;
            if (a != null) {
                trc$a.d("impression_id", a);
            }
            if (this.l1.d()) {
                trc$a.f("earned", true);
            }
        }
        final long m1 = this.m1;
        if (m1 != 0L) {
            trc$a.d("user_id", String.valueOf(m1));
        }
        else {
            final m9a m9a = new m9a((Throwable)new IllegalArgumentException());
            ((HashMap<String, Long>)m9a.a).put("user_id", Long.valueOf(this.m1));
            ((HashMap<String, String>)m9a.a).put("uri", trc$a.k().a(zcv.a()));
            r9a.c(m9a);
        }
    }
}
