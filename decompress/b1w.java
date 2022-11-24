import android.os.BaseBundle;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b1w extends zn1
{
    public final Context n1;
    public final kbv o1;
    
    public b1w(final Context n1, final UserIdentifier userIdentifier, final long n2) {
        final kbv d2 = kbv.d2(userIdentifier);
        super(userIdentifier, n2, null);
        this.n1 = n1;
        this.o1 = d2;
    }
    
    public b1w(final Context n1, final UserIdentifier userIdentifier, final long n2, final gjl gjl) {
        final kbv d2 = kbv.d2(userIdentifier);
        super(userIdentifier, n2, gjl);
        this.n1 = n1;
        this.o1 = d2;
    }
    
    public final trc f0() {
        final adv adv = new adv();
        adv.e = asc$b.I0;
        final int a = o5j.a;
        adv.n("/1.1/mutes/users/destroy.json", "/");
        this.o0(adv);
        return adv.k();
    }
    
    @Override
    public final void n0(final xsc<qgv, zbv> xsc) {
        final qgv qgv = (qgv)xsc.g;
        final tn6 z = ((pnm)this).Z(this.n1);
        this.o1.p4(qgv.F0, 8192, z);
        final gvs gvs = new gvs(kbv.J2(((pnm)this).S0));
        final fxs$a fxs$a = new fxs$a();
        fxs$a.a = 43;
        fxs$a.c = ((pnm)this).S0.getId();
        gvs.f((fxs)((z4j)fxs$a).e(), (Iterable)ojf.v((Object)qgv.e()));
        z.b();
        ((BaseBundle)xsc.a).putString("muted_username", qgv.M0);
    }
}
