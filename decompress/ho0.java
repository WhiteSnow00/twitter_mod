import java.util.Set;
import android.content.Context;
import java.util.Map;
import com.twitter.app.di.app.DaggerTwApplOG$z61$a;
import com.twitter.app.di.app.DaggerTwApplOG$z61;
import com.twitter.app.di.app.DaggerTwApplOG$x61;
import com.twitter.app.di.app.DaggerTwApplOG$n31$a;
import com.twitter.app.di.app.DaggerTwApplOG$n31;
import com.twitter.app.di.app.DaggerTwApplOG$yz0$a;
import com.twitter.app.di.app.DaggerTwApplOG$yz0;
import com.twitter.app.di.app.DaggerTwApplOG$wz0;
import com.twitter.app.di.app.DaggerTwApplOG$cw0$a;
import com.twitter.app.di.app.DaggerTwApplOG$cw0;
import com.twitter.app.di.app.DaggerTwApplOG$aw0;
import com.twitter.app.di.app.DaggerTwApplOG$kr0$a;
import com.twitter.app.di.app.DaggerTwApplOG$kr0;
import com.twitter.app.di.app.DaggerTwApplOG$mm0$a;
import com.twitter.app.di.app.DaggerTwApplOG$mm0;
import com.twitter.app.di.app.DaggerTwApplOG$om0;
import com.twitter.app.di.app.DaggerTwApplOG$ui0$a;
import com.twitter.app.di.app.DaggerTwApplOG$ui0;
import com.twitter.app.di.app.DaggerTwApplOG$si0;
import com.twitter.app.di.app.DaggerTwApplOG$kb0$a;
import com.twitter.app.di.app.DaggerTwApplOG$kb0;
import com.twitter.app.di.app.DaggerTwApplOG$e70$a;
import com.twitter.app.di.app.DaggerTwApplOG$e70;
import com.twitter.app.di.app.DaggerTwApplOG$c70;
import com.twitter.app.di.app.DaggerTwApplOG$y20$a;
import com.twitter.app.di.app.DaggerTwApplOG$y20;
import com.twitter.app.di.app.DaggerTwApplOG$wy$a;
import com.twitter.app.di.app.DaggerTwApplOG$wy;
import com.twitter.app.di.app.DaggerTwApplOG$uy;
import com.twitter.app.di.app.DaggerTwApplOG$iw$a;
import com.twitter.app.di.app.DaggerTwApplOG$iw;
import com.twitter.app.di.app.DaggerTwApplOG$gw;
import com.twitter.app.di.app.DaggerTwApplOG$er$a;
import com.twitter.app.di.app.DaggerTwApplOG$er;
import com.twitter.app.di.app.DaggerTwApplOG$zj1$a;
import com.twitter.app.di.app.DaggerTwApplOG$zj1;
import com.twitter.app.di.app.DaggerTwApplOG$so;
import com.twitter.app.di.app.DaggerTwApplOG$qi$a;
import com.twitter.app.di.app.DaggerTwApplOG$qi;
import com.twitter.app.di.app.DaggerTwApplOG$sc$a;
import com.twitter.app.di.app.DaggerTwApplOG$sc;
import com.twitter.app.di.app.DaggerTwApplOG$qc;
import com.twitter.app.di.app.DaggerTwApplOG$i8$a;
import com.twitter.app.di.app.DaggerTwApplOG$i8;
import com.twitter.app.di.app.DaggerTwApplOG$p11;
import com.twitter.app.di.app.DaggerTwApplOG$se0$a;
import com.twitter.app.di.app.DaggerTwApplOG$se0;
import com.twitter.app.di.app.DaggerTwApplOG$ue0;
import com.twitter.app.di.app.DaggerTwApplOG$sn$a;
import com.twitter.app.di.app.DaggerTwApplOG$sn;
import com.twitter.app.di.app.DaggerTwApplOG$un;
import com.twitter.app.di.app.DaggerTwApplOG$n11;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ho0 implements cb3$b, qsl, e16
{
    public static final ho0 D0;
    public static final er0 E0;
    public static final ho0 F0;
    public static final ho0 G0;
    
    static {
        D0 = new ho0();
        E0 = new er0();
        F0 = new ho0();
        G0 = new ho0();
    }
    
    public static void A(final String s, final String s2) {
        lp.b0(s, s2, (Throwable)new IllegalArgumentException());
    }
    
    public static String B(final int n) {
        if (n == 1) {
            return "active";
        }
        if (n == 2) {
            return "inactive";
        }
        throw null;
    }
    
    public static String C(final int n) {
        if (n == 1) {
            return "AudioSpaceTickets";
        }
        if (n == 2) {
            return "SuperFollows";
        }
        throw null;
    }
    
    public static String D(final int n) {
        if (n == 1) {
            return "AudioSpaceTickets";
        }
        if (n == 2) {
            return "SuperFollows";
        }
        return "null";
    }
    
    public static String E(final int n) {
        if (n == 1) {
            return "NPS";
        }
        if (n == 2) {
            return "CARD";
        }
        return "null";
    }
    
    public static dml b(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$un daggerTwApplOG$un, final DaggerTwApplOG$sn daggerTwApplOG$sn, final int n) {
        return v69.b((dml)new DaggerTwApplOG$sn$a(daggerTwApplOG$n11, daggerTwApplOG$un, daggerTwApplOG$sn, n));
    }
    
    public static dml c(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$ue0 daggerTwApplOG$ue0, final DaggerTwApplOG$se0 daggerTwApplOG$se0, final int n) {
        return v69.b((dml)new DaggerTwApplOG$se0$a(daggerTwApplOG$n11, daggerTwApplOG$ue0, daggerTwApplOG$se0, n));
    }
    
    public static dml d(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$i8 daggerTwApplOG$i8, final int n) {
        return v69.b((dml)new DaggerTwApplOG$i8$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$i8, n));
    }
    
    public static dml e(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$qc daggerTwApplOG$qc, final DaggerTwApplOG$sc daggerTwApplOG$sc, final int n) {
        return v69.b((dml)new DaggerTwApplOG$sc$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$qc, daggerTwApplOG$sc, n));
    }
    
    public static dml f(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$qi daggerTwApplOG$qi, final int n) {
        return v69.b((dml)new DaggerTwApplOG$qi$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$qi, n));
    }
    
    public static dml g(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$so daggerTwApplOG$so, final DaggerTwApplOG$zj1 daggerTwApplOG$zj1, final int n) {
        return v69.b((dml)new DaggerTwApplOG$zj1$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$so, daggerTwApplOG$zj1, n));
    }
    
    public static dml h(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$er daggerTwApplOG$er, final int n) {
        return v69.b((dml)new DaggerTwApplOG$er$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$er, n));
    }
    
    public static dml i(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$gw daggerTwApplOG$gw, final DaggerTwApplOG$iw daggerTwApplOG$iw, final int n) {
        return v69.b((dml)new DaggerTwApplOG$iw$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$gw, daggerTwApplOG$iw, n));
    }
    
    public static dml j(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$uy daggerTwApplOG$uy, final DaggerTwApplOG$wy daggerTwApplOG$wy, final int n) {
        return v69.b((dml)new DaggerTwApplOG$wy$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$uy, daggerTwApplOG$wy, n));
    }
    
    public static dml k(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$y20 daggerTwApplOG$y20, final int n) {
        return v69.b((dml)new DaggerTwApplOG$y20$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$y20, n));
    }
    
    public static dml l(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$c70 daggerTwApplOG$c70, final DaggerTwApplOG$e70 daggerTwApplOG$e70, final int n) {
        return v69.b((dml)new DaggerTwApplOG$e70$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$c70, daggerTwApplOG$e70, n));
    }
    
    public static dml m(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$kb0 daggerTwApplOG$kb0, final int n) {
        return v69.b((dml)new DaggerTwApplOG$kb0$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$kb0, n));
    }
    
    public static dml n(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$si0 daggerTwApplOG$si0, final DaggerTwApplOG$ui0 daggerTwApplOG$ui0, final int n) {
        return v69.b((dml)new DaggerTwApplOG$ui0$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$si0, daggerTwApplOG$ui0, n));
    }
    
    public static dml o(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$om0 daggerTwApplOG$om0, final DaggerTwApplOG$mm0 daggerTwApplOG$mm0, final int n) {
        return v69.b((dml)new DaggerTwApplOG$mm0$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$om0, daggerTwApplOG$mm0, n));
    }
    
    public static dml q(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$kr0 daggerTwApplOG$kr0, final int n) {
        return v69.b((dml)new DaggerTwApplOG$kr0$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$kr0, n));
    }
    
    public static dml s(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$aw0 daggerTwApplOG$aw0, final DaggerTwApplOG$cw0 daggerTwApplOG$cw0, final int n) {
        return v69.b((dml)new DaggerTwApplOG$cw0$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$aw0, daggerTwApplOG$cw0, n));
    }
    
    public static dml t(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$wz0 daggerTwApplOG$wz0, final DaggerTwApplOG$yz0 daggerTwApplOG$yz0, final int n) {
        return v69.b((dml)new DaggerTwApplOG$yz0$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$wz0, daggerTwApplOG$yz0, n));
    }
    
    public static dml u(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$n31 daggerTwApplOG$n12, final int n) {
        return v69.b((dml)new DaggerTwApplOG$n31$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$n12, n));
    }
    
    public static dml v(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$x61 daggerTwApplOG$x61, final DaggerTwApplOG$z61 daggerTwApplOG$z61, final int n) {
        return v69.b((dml)new DaggerTwApplOG$z61$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$x61, daggerTwApplOG$z61, n));
    }
    
    public static o9x w(final r61 r61, final dml dml) {
        return cia.u(kl.r((Map)jdd.i((Object)r61, (Object)dml)));
    }
    
    public static String x(final x66 x66, final int n, final int n2, final int n3, final x66 x67) {
        x66.x(n);
        x66.x(n2);
        return wd.A(n3, x67);
    }
    
    public static Map y(final jdd$a jdd$a, final slx slx, final w5x w5x) {
        jdd$a.d((Object)slx, (Object)w5x);
        return cia.k((Map)jdd$a.b());
    }
    
    public static void z(final String s) {
        m8a.d((Throwable)new IllegalStateException(s));
    }
    
    public void a(int a, final float[] array, final edq edq, final long n, final int n2, final int n3, final boolean b, final boolean b2) {
        a = db3.a;
    }
    
    public osl$a p(final Object o) {
        czd.f((Object)o, "it");
        return new osl$a();
    }
    
    public Object r(final y06 y06) {
        final ism ism = (ism)y06;
        return new eh8((Context)ism.f((Class)Context.class), ((yza)ism.f((Class)yza.class)).d(), ism.q((Class)eic.class), ism.I((Class)q8w.class));
    }
}
