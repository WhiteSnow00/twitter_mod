import com.twitter.app.di.app.DaggerTwApplOG$b91$a;
import com.twitter.app.di.app.DaggerTwApplOG$b91;
import com.twitter.app.di.app.DaggerTwApplOG$z81;
import com.twitter.app.di.app.DaggerTwApplOG$x41$a;
import com.twitter.app.di.app.DaggerTwApplOG$x41;
import com.twitter.app.di.app.DaggerTwApplOG$v41;
import com.twitter.app.di.app.DaggerTwApplOG$ey0$a;
import com.twitter.app.di.app.DaggerTwApplOG$ey0;
import com.twitter.app.di.app.DaggerTwApplOG$cy0;
import com.twitter.app.di.app.DaggerTwApplOG$uk0$a;
import com.twitter.app.di.app.DaggerTwApplOG$uk0;
import com.twitter.app.di.app.DaggerTwApplOG$sk0;
import com.twitter.app.di.app.DaggerTwApplOG$yg0$a;
import com.twitter.app.di.app.DaggerTwApplOG$yg0;
import com.twitter.app.di.app.DaggerTwApplOG$wg0;
import com.twitter.app.di.app.DaggerTwApplOG$yc0$a;
import com.twitter.app.di.app.DaggerTwApplOG$yc0;
import com.twitter.app.di.app.DaggerTwApplOG$wc0;
import com.twitter.app.di.app.DaggerTwApplOG$br1$a;
import com.twitter.app.di.app.DaggerTwApplOG$br1;
import com.twitter.app.di.app.DaggerTwApplOG$e30;
import com.twitter.app.di.app.DaggerTwApplOG$o00$a;
import com.twitter.app.di.app.DaggerTwApplOG$o00;
import com.twitter.app.di.app.DaggerTwApplOG$q00;
import com.twitter.app.di.app.DaggerTwApplOG$ox$a;
import com.twitter.app.di.app.DaggerTwApplOG$ox;
import com.twitter.app.di.app.DaggerTwApplOG$mx;
import com.twitter.app.di.app.DaggerTwApplOG$cp$a;
import com.twitter.app.di.app.DaggerTwApplOG$cp;
import com.twitter.app.di.app.DaggerTwApplOG$kl$a;
import com.twitter.app.di.app.DaggerTwApplOG$kl;
import com.twitter.app.di.app.DaggerTwApplOG$ml;
import com.twitter.app.di.app.DaggerTwApplOG$cg$a;
import com.twitter.app.di.app.DaggerTwApplOG$cg;
import com.twitter.app.di.app.DaggerTwApplOG$eg;
import com.twitter.app.di.app.DaggerTwApplOG$ca$a;
import com.twitter.app.di.app.DaggerTwApplOG$ca;
import com.twitter.app.di.app.DaggerTwApplOG$p6$a;
import com.twitter.app.di.app.DaggerTwApplOG$p6;
import com.twitter.app.di.app.DaggerTwApplOG$n6;
import com.twitter.app.di.app.DaggerTwApplOG$f2$a;
import com.twitter.app.di.app.DaggerTwApplOG$f2;
import com.twitter.app.di.app.DaggerTwApplOG$h2;
import com.twitter.app.di.app.DaggerTwApplOG$p11;
import com.twitter.app.di.app.DaggerTwApplOG$yt0$a;
import com.twitter.app.di.app.DaggerTwApplOG$yt0;
import com.twitter.app.di.app.DaggerTwApplOG$wt0;
import com.twitter.app.di.app.DaggerTwApplOG$ep0$a;
import com.twitter.app.di.app.DaggerTwApplOG$ep0;
import com.twitter.app.di.app.DaggerTwApplOG$cp0;
import com.twitter.app.di.app.DaggerTwApplOG$y80$a;
import com.twitter.app.di.app.DaggerTwApplOG$y80;
import com.twitter.app.di.app.DaggerTwApplOG$a90;
import com.twitter.app.di.app.DaggerTwApplOG$a50$a;
import com.twitter.app.di.app.DaggerTwApplOG$a50;
import com.twitter.app.di.app.DaggerTwApplOG$y40;
import com.twitter.app.di.app.DaggerTwApplOG$au$a;
import com.twitter.app.di.app.DaggerTwApplOG$au;
import com.twitter.app.di.app.DaggerTwApplOG$cu;
import com.twitter.app.di.app.DaggerTwApplOG$n11;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;
import android.net.Uri;
import com.twitter.navigation.profile.ImageActivityArgs;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ed
{
    public static String A(final String s, final Object o) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(o);
        return sb.toString();
    }
    
    public static String B(final StringBuilder sb, final String s, final String s2) {
        sb.append(s);
        sb.append(s2);
        return sb.toString();
    }
    
    public static StringBuilder C(final String s, final w9q w9q, final String s2) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(w9q);
        sb.append(s2);
        return sb;
    }
    
    public static void D(final qr0 qr0, final String s, final qfq qfq, final String s2, final qcm qcm, final String s3) {
        czd.f((Object)qr0, s);
        czd.f((Object)qfq, s2);
        czd.f((Object)qcm, s3);
    }
    
    public static ImageActivityArgs E(final soj soj) {
        final String a = kyv.c((p8d)hyv.I0, new x5w(soj.a)).a();
        return new ImageActivityArgs(Uri.parse(a), a, true);
    }
    
    public static tv6 a() {
        return (tv6)((b5j)br0.a()).B((Class)tv6.class);
    }
    
    public static fsa b(final UserIdentifier userIdentifier, final String s, final ryt ryt) {
        if (fes.c) {
            return (fsa)new esa(ryt, userIdentifier, s);
        }
        final fmv a = asa.a(userIdentifier);
        Objects.requireNonNull(a);
        return (fsa)new fmv$d(a, s, ryt);
    }
    
    public static fsa c(final String s) {
        final UserIdentifier current = UserIdentifier.getCurrent();
        final csv a = iub.a;
        final int a2 = c5j.a;
        return b(current, s, (ryt)a);
    }
    
    public static fsa d(final String s, final ryt ryt) {
        return b(UserIdentifier.getCurrent(), s, ryt);
    }
    
    public static float e(final float n, final float n2, final float n3, final float n4) {
        return (n * n2 + n3) * n4;
    }
    
    public static p61 f(final jdd$a jdd$a, final p61 p4, final ypa ypa, final int n) {
        jdd$a.d((Object)p4, (Object)ypa);
        return new p61(n);
    }
    
    public static dml g(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$cu daggerTwApplOG$cu, final DaggerTwApplOG$au daggerTwApplOG$au, final int n) {
        return v69.b((dml)new DaggerTwApplOG$au$a(daggerTwApplOG$n11, daggerTwApplOG$cu, daggerTwApplOG$au, n));
    }
    
    public static dml h(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$y40 daggerTwApplOG$y40, final DaggerTwApplOG$a50 daggerTwApplOG$a50, final int n) {
        return v69.b((dml)new DaggerTwApplOG$a50$a(daggerTwApplOG$n11, daggerTwApplOG$y40, daggerTwApplOG$a50, n));
    }
    
    public static dml i(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$a90 daggerTwApplOG$a90, final DaggerTwApplOG$y80 daggerTwApplOG$y80, final int n) {
        return v69.b((dml)new DaggerTwApplOG$y80$a(daggerTwApplOG$n11, daggerTwApplOG$a90, daggerTwApplOG$y80, n));
    }
    
    public static dml j(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$cp0 daggerTwApplOG$cp0, final DaggerTwApplOG$ep0 daggerTwApplOG$ep0, final int n) {
        return v69.b((dml)new DaggerTwApplOG$ep0$a(daggerTwApplOG$n11, daggerTwApplOG$cp0, daggerTwApplOG$ep0, n));
    }
    
    public static dml k(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$wt0 daggerTwApplOG$wt0, final DaggerTwApplOG$yt0 daggerTwApplOG$yt0, final int n) {
        return v69.b((dml)new DaggerTwApplOG$yt0$a(daggerTwApplOG$n11, daggerTwApplOG$wt0, daggerTwApplOG$yt0, n));
    }
    
    public static dml l(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$h2 daggerTwApplOG$h2, final DaggerTwApplOG$f2 daggerTwApplOG$f2, final int n) {
        return v69.b((dml)new DaggerTwApplOG$f2$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$h2, daggerTwApplOG$f2, n));
    }
    
    public static dml m(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$n6 daggerTwApplOG$n12, final DaggerTwApplOG$p6 daggerTwApplOG$p12, final int n) {
        return v69.b((dml)new DaggerTwApplOG$p6$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$n12, daggerTwApplOG$p12, n));
    }
    
    public static dml n(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$ca daggerTwApplOG$ca, final int n) {
        return v69.b((dml)new DaggerTwApplOG$ca$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$ca, n));
    }
    
    public static dml o(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$eg daggerTwApplOG$eg, final DaggerTwApplOG$cg daggerTwApplOG$cg, final int n) {
        return v69.b((dml)new DaggerTwApplOG$cg$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$eg, daggerTwApplOG$cg, n));
    }
    
    public static dml p(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$ml daggerTwApplOG$ml, final DaggerTwApplOG$kl daggerTwApplOG$kl, final int n) {
        return v69.b((dml)new DaggerTwApplOG$kl$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$ml, daggerTwApplOG$kl, n));
    }
    
    public static dml q(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$cp daggerTwApplOG$cp, final int n) {
        return v69.b((dml)new DaggerTwApplOG$cp$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$cp, n));
    }
    
    public static dml r(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$mx daggerTwApplOG$mx, final DaggerTwApplOG$ox daggerTwApplOG$ox, final int n) {
        return v69.b((dml)new DaggerTwApplOG$ox$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$mx, daggerTwApplOG$ox, n));
    }
    
    public static dml s(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$q00 daggerTwApplOG$q00, final DaggerTwApplOG$o00 daggerTwApplOG$o00, final int n) {
        return v69.b((dml)new DaggerTwApplOG$o00$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$q00, daggerTwApplOG$o00, n));
    }
    
    public static dml t(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$e30 daggerTwApplOG$e30, final DaggerTwApplOG$br1 daggerTwApplOG$br1, final int n) {
        return v69.b((dml)new DaggerTwApplOG$br1$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$e30, daggerTwApplOG$br1, n));
    }
    
    public static dml u(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$wc0 daggerTwApplOG$wc0, final DaggerTwApplOG$yc0 daggerTwApplOG$yc0, final int n) {
        return v69.b((dml)new DaggerTwApplOG$yc0$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$wc0, daggerTwApplOG$yc0, n));
    }
    
    public static dml v(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$wg0 daggerTwApplOG$wg0, final DaggerTwApplOG$yg0 daggerTwApplOG$yg0, final int n) {
        return v69.b((dml)new DaggerTwApplOG$yg0$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$wg0, daggerTwApplOG$yg0, n));
    }
    
    public static dml w(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$sk0 daggerTwApplOG$sk0, final DaggerTwApplOG$uk0 daggerTwApplOG$uk0, final int n) {
        return v69.b((dml)new DaggerTwApplOG$uk0$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$sk0, daggerTwApplOG$uk0, n));
    }
    
    public static dml x(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$cy0 daggerTwApplOG$cy0, final DaggerTwApplOG$ey0 daggerTwApplOG$ey0, final int n) {
        return v69.b((dml)new DaggerTwApplOG$ey0$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$cy0, daggerTwApplOG$ey0, n));
    }
    
    public static dml y(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$v41 daggerTwApplOG$v41, final DaggerTwApplOG$x41 daggerTwApplOG$x41, final int n) {
        return v69.b((dml)new DaggerTwApplOG$x41$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$v41, daggerTwApplOG$x41, n));
    }
    
    public static dml z(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$z81 daggerTwApplOG$z81, final DaggerTwApplOG$b91 daggerTwApplOG$b91, final int n) {
        return v69.b((dml)new DaggerTwApplOG$b91$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$z81, daggerTwApplOG$b91, n));
    }
}
