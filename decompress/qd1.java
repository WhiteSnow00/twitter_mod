import java.util.Locale;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qd1 extends i1v<pd1>
{
    public static final tba l1;
    public final String i1;
    public final int j1;
    public String k1;
    
    static {
        l1 = (tba)rba.c("app", "twitter_service", "account", "availability_check");
    }
    
    public qd1(final Context context, final UserIdentifier userIdentifier) {
        super(userIdentifier, 0);
        ((jh0<Object, Object>)this).j0();
        ((cw0)this).G((ysm)new kog(1));
        ((cw0)this).G((ysm)new xci());
        final Locale locale = context.getResources().getConfiguration().locale;
        String h;
        if (locale != null) {
            h = jgw.H(locale);
        }
        else {
            h = null;
        }
        this.i1 = h;
        this.j1 = 2;
        ((j1p$a)this.Y()).a.J0 = (sba)qd1.l1;
    }
    
    @Override
    public final qrc f0() {
        final rbv rbv = new rbv();
        if (pjr.g((CharSequence)this.i1)) {
            ((qrc.a)rbv).d("lang", this.i1);
        }
        final int j1 = this.j1;
        if (j1 == 1) {
            pf8.r(null);
            ((qrc.a)rbv).n("/i/users/email_available.json", "/");
            final int a = w4j.a;
            ((qrc.a)rbv).d("email", null);
            return ((qrc.a)rbv).k();
        }
        if (j1 == 2) {
            pf8.r(this.k1);
            ((qrc.a)rbv).n("/i/users/username_available.json", "/");
            final int a2 = w4j.a;
            ((qrc.a)rbv).c("custom", 1L);
            ((qrc.a)rbv).d("context", "signup");
            ((qrc.a)rbv).d("username", this.k1);
            return ((qrc.a)rbv).k();
        }
        final StringBuilder g = w48.g("No action for code: ");
        g.append(this.j1);
        throw new UnsupportedOperationException(g.toString());
    }
    
    @Override
    public final wsc<pd1, pav> g0() {
        return (wsc<pd1, pav>)f9g.c((Class)pd1.class);
    }
    
    @Override
    public final tsc<pd1, pav> i0(final tsc<pd1, pav> tsc) {
        tsc c = tsc;
        if (tsc.b) {
            final pd1 pd1 = (pd1)tsc.g;
            pf8.r(pd1);
            c = tsc;
            if (!pd1.a) {
                String b;
                if ((b = pd1.b) == null) {
                    b = "";
                }
                c = tsc.c(400, b);
            }
        }
        return (tsc<pd1, pav>)c;
    }
}
