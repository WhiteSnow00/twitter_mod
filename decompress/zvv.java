import android.os.BaseBundle;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zvv extends p2v<kni>
{
    public final String l1;
    public int m1;
    
    public zvv(final UserIdentifier userIdentifier, final String l1) {
        super(userIdentifier, 0);
        this.l1 = l1;
        this.m1 = 2;
    }
    
    public final trc f0() {
        final adv h = lf.H("/1.1/account/login_verification_enrollment.json", "/");
        final int a = o5j.a;
        h.e = asc$b.J0;
        if (flr.g((CharSequence)this.l1)) {
            h.d("public_key", this.l1);
        }
        return h.k();
    }
    
    public final atc<kni, zbv> g0() {
        return (atc<kni, zbv>)p9g.d();
    }
    
    @Override
    public final void m0(final xsc<kni, zbv> xsc) {
        ((BaseBundle)xsc.a).putIntArray("custom_errors", zbv.g((zbv)xsc.h));
    }
}
