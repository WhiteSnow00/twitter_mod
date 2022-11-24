import android.view.View;
import com.twitter.app.di.app.DaggerTwApplOG$r71$a;
import com.twitter.app.di.app.DaggerTwApplOG$r71;
import com.twitter.app.di.app.DaggerTwApplOG$t71;
import com.twitter.app.di.app.DaggerTwApplOG$d41$a;
import com.twitter.app.di.app.DaggerTwApplOG$d41;
import com.twitter.app.di.app.DaggerTwApplOG$b41;
import com.twitter.app.di.app.DaggerTwApplOG$ax0$a;
import com.twitter.app.di.app.DaggerTwApplOG$ax0;
import com.twitter.app.di.app.DaggerTwApplOG$yw0;
import com.twitter.app.di.app.DaggerTwApplOG$us0$a;
import com.twitter.app.di.app.DaggerTwApplOG$us0;
import com.twitter.app.di.app.DaggerTwApplOG$ss0;
import com.twitter.app.di.app.DaggerTwApplOG$lk1$a;
import com.twitter.app.di.app.DaggerTwApplOG$lk1;
import com.twitter.app.di.app.DaggerTwApplOG$qp0;
import com.twitter.app.di.app.DaggerTwApplOG$un0$a;
import com.twitter.app.di.app.DaggerTwApplOG$un0;
import com.twitter.app.di.app.DaggerTwApplOG$sn0;
import com.twitter.app.di.app.DaggerTwApplOG$sj0$a;
import com.twitter.app.di.app.DaggerTwApplOG$sj0;
import com.twitter.app.di.app.DaggerTwApplOG$qj0;
import com.twitter.app.di.app.DaggerTwApplOG$of0$a;
import com.twitter.app.di.app.DaggerTwApplOG$of0;
import com.twitter.app.di.app.DaggerTwApplOG$mf0;
import com.twitter.app.di.app.DaggerTwApplOG$yb0$a;
import com.twitter.app.di.app.DaggerTwApplOG$yb0;
import com.twitter.app.di.app.DaggerTwApplOG$y30$a;
import com.twitter.app.di.app.DaggerTwApplOG$y30;
import com.twitter.app.di.app.DaggerTwApplOG$w30;
import com.twitter.app.di.app.DaggerTwApplOG$ax$a;
import com.twitter.app.di.app.DaggerTwApplOG$ax;
import com.twitter.app.di.app.DaggerTwApplOG$cs$a;
import com.twitter.app.di.app.DaggerTwApplOG$cs;
import com.twitter.app.di.app.DaggerTwApplOG$as;
import com.twitter.app.di.app.DaggerTwApplOG$oo$a;
import com.twitter.app.di.app.DaggerTwApplOG$oo;
import com.twitter.app.di.app.DaggerTwApplOG$mo;
import com.twitter.app.di.app.DaggerTwApplOG$oj$a;
import com.twitter.app.di.app.DaggerTwApplOG$oj;
import com.twitter.app.di.app.DaggerTwApplOG$qj;
import com.twitter.app.di.app.DaggerTwApplOG$g9$a;
import com.twitter.app.di.app.DaggerTwApplOG$g9;
import com.twitter.app.di.app.DaggerTwApplOG$e9;
import com.twitter.app.di.app.DaggerTwApplOG$p5$a;
import com.twitter.app.di.app.DaggerTwApplOG$p5;
import com.twitter.app.di.app.DaggerTwApplOG$n5;
import com.twitter.app.di.app.DaggerTwApplOG$p11;
import com.twitter.app.di.app.DaggerTwApplOG$a11$a;
import com.twitter.app.di.app.DaggerTwApplOG$a11;
import com.twitter.app.di.app.DaggerTwApplOG$y01;
import com.twitter.app.di.app.DaggerTwApplOG$c80$a;
import com.twitter.app.di.app.DaggerTwApplOG$c80;
import com.twitter.app.di.app.DaggerTwApplOG$a80;
import com.twitter.app.di.app.DaggerTwApplOG$iz$a;
import com.twitter.app.di.app.DaggerTwApplOG$iz;
import com.twitter.app.di.app.DaggerTwApplOG$se$a;
import com.twitter.app.di.app.DaggerTwApplOG$se;
import com.twitter.app.di.app.DaggerTwApplOG$ue;
import com.twitter.app.di.app.DaggerTwApplOG$j1$a;
import com.twitter.app.di.app.DaggerTwApplOG$j1;
import com.twitter.app.di.app.DaggerTwApplOG$h1;
import com.twitter.app.di.app.DaggerTwApplOG$n11;
import java.util.Objects;
import android.app.Activity;
import tv.periscope.android.view.PsTextView;
import tv.periscope.android.view.RootDragLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w9 implements lp$a
{
    public static final w9 b;
    
    static {
        b = new w9();
    }
    
    public static PsTextView A(final RootDragLayout rootDragLayout) {
        final int a = mn2.a;
        return (PsTextView)((View)rootDragLayout).findViewById(2131432003);
    }
    
    public static int B(final v9 v9) {
        return v9.c;
    }
    
    public static boolean C(final ywc ywc) {
        final int a = mn2.a;
        return ywc.b();
    }
    
    public static void D() {
        final int a = mn2.a;
    }
    
    public static y32 E(final Activity activity) {
        final int a = mn2.a;
        return (y32)activity.findViewById(2131427730);
    }
    
    public static void F() {
        final int a = mn2.a;
    }
    
    public static void G() {
        final int a = mn2.a;
    }
    
    public static void H() {
        final int a = mn2.a;
    }
    
    public static String I(final int n) {
        if (n == 1) {
            return "BoundReached";
        }
        if (n == 2) {
            return "Finished";
        }
        return "null";
    }
    
    public static String J(final int n) {
        if (n == 1) {
            return "EXCEEDED_MAX_PINNED_CONVERSATIONS";
        }
        return "null";
    }
    
    public static String K(final int n) {
        if (n == 1) {
            return "VIDEO";
        }
        if (n == 2) {
            return "AUDIO";
        }
        if (n == 3) {
            return "NONE";
        }
        return "null";
    }
    
    public static String L(final int n) {
        if (n == 1) {
            return "InMeasureBlock";
        }
        if (n == 2) {
            return "InLayoutBlock";
        }
        if (n == 3) {
            return "NotUsed";
        }
        return "null";
    }
    
    public static String M(final int n) {
        if (n == 1) {
            return "CREATE";
        }
        if (n == 2) {
            return "SHOPPING_CART";
        }
        if (n == 3) {
            return "EDIT";
        }
        if (n == 4) {
            return "MANAGE";
        }
        return "null";
    }
    
    public static int N(final String s) {
        Objects.requireNonNull(s, "Name is null");
        if (s.equals("CREATE")) {
            return 1;
        }
        if (s.equals("SHOPPING_CART")) {
            return 2;
        }
        if (s.equals("EDIT")) {
            return 3;
        }
        if (s.equals("MANAGE")) {
            return 4;
        }
        throw new IllegalArgumentException("No enum constant com.twitter.navigation.channels.ListsCrudActivityArgs.Mode.".concat(s));
    }
    
    public static pml b(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$h1 daggerTwApplOG$h1, final DaggerTwApplOG$j1 daggerTwApplOG$j1, final int n) {
        return a89.b((pml)new DaggerTwApplOG$j1$a(daggerTwApplOG$n11, daggerTwApplOG$h1, daggerTwApplOG$j1, n));
    }
    
    public static pml c(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$ue daggerTwApplOG$ue, final DaggerTwApplOG$se daggerTwApplOG$se, final int n) {
        return a89.b((pml)new DaggerTwApplOG$se$a(daggerTwApplOG$n11, daggerTwApplOG$ue, daggerTwApplOG$se, n));
    }
    
    public static pml d(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$iz daggerTwApplOG$iz, final int n) {
        return a89.b((pml)new DaggerTwApplOG$iz$a(daggerTwApplOG$n11, daggerTwApplOG$iz, n));
    }
    
    public static pml e(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$a80 daggerTwApplOG$a80, final DaggerTwApplOG$c80 daggerTwApplOG$c80, final int n) {
        return a89.b((pml)new DaggerTwApplOG$c80$a(daggerTwApplOG$n11, daggerTwApplOG$a80, daggerTwApplOG$c80, n));
    }
    
    public static pml f(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$y01 daggerTwApplOG$y01, final DaggerTwApplOG$a11 daggerTwApplOG$a11, final int n) {
        return a89.b((pml)new DaggerTwApplOG$a11$a(daggerTwApplOG$n11, daggerTwApplOG$y01, daggerTwApplOG$a11, n));
    }
    
    public static pml g(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$n5 daggerTwApplOG$n12, final DaggerTwApplOG$p5 daggerTwApplOG$p12, final int n) {
        return a89.b((pml)new DaggerTwApplOG$p5$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$n12, daggerTwApplOG$p12, n));
    }
    
    public static pml h(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$e9 daggerTwApplOG$e9, final DaggerTwApplOG$g9 daggerTwApplOG$g9, final int n) {
        return a89.b((pml)new DaggerTwApplOG$g9$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$e9, daggerTwApplOG$g9, n));
    }
    
    public static pml i(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$qj daggerTwApplOG$qj, final DaggerTwApplOG$oj daggerTwApplOG$oj, final int n) {
        return a89.b((pml)new DaggerTwApplOG$oj$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$qj, daggerTwApplOG$oj, n));
    }
    
    public static pml j(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$mo daggerTwApplOG$mo, final DaggerTwApplOG$oo daggerTwApplOG$oo, final int n) {
        return a89.b((pml)new DaggerTwApplOG$oo$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$mo, daggerTwApplOG$oo, n));
    }
    
    public static pml k(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$as daggerTwApplOG$as, final DaggerTwApplOG$cs daggerTwApplOG$cs, final int n) {
        return a89.b((pml)new DaggerTwApplOG$cs$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$as, daggerTwApplOG$cs, n));
    }
    
    public static pml l(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$ax daggerTwApplOG$ax, final int n) {
        return a89.b((pml)new DaggerTwApplOG$ax$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$ax, n));
    }
    
    public static pml m(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$w30 daggerTwApplOG$w30, final DaggerTwApplOG$y30 daggerTwApplOG$y30, final int n) {
        return a89.b((pml)new DaggerTwApplOG$y30$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$w30, daggerTwApplOG$y30, n));
    }
    
    public static pml n(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$yb0 daggerTwApplOG$yb0, final int n) {
        return a89.b((pml)new DaggerTwApplOG$yb0$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$yb0, n));
    }
    
    public static pml o(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$mf0 daggerTwApplOG$mf0, final DaggerTwApplOG$of0 daggerTwApplOG$of0, final int n) {
        return a89.b((pml)new DaggerTwApplOG$of0$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$mf0, daggerTwApplOG$of0, n));
    }
    
    public static pml p(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$qj0 daggerTwApplOG$qj0, final DaggerTwApplOG$sj0 daggerTwApplOG$sj0, final int n) {
        return a89.b((pml)new DaggerTwApplOG$sj0$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$qj0, daggerTwApplOG$sj0, n));
    }
    
    public static pml q(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$sn0 daggerTwApplOG$sn0, final DaggerTwApplOG$un0 daggerTwApplOG$un0, final int n) {
        return a89.b((pml)new DaggerTwApplOG$un0$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$sn0, daggerTwApplOG$un0, n));
    }
    
    public static pml r(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$qp0 daggerTwApplOG$qp0, final DaggerTwApplOG$lk1 daggerTwApplOG$lk1, final int n) {
        return a89.b((pml)new DaggerTwApplOG$lk1$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$qp0, daggerTwApplOG$lk1, n));
    }
    
    public static pml s(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$ss0 daggerTwApplOG$ss0, final DaggerTwApplOG$us0 daggerTwApplOG$us0, final int n) {
        return a89.b((pml)new DaggerTwApplOG$us0$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$ss0, daggerTwApplOG$us0, n));
    }
    
    public static pml t(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$p11 daggerTwApplOG$p11, final DaggerTwApplOG$yw0 daggerTwApplOG$yw0, final DaggerTwApplOG$ax0 daggerTwApplOG$ax0, final int n) {
        return a89.b((pml)new DaggerTwApplOG$ax0$a(daggerTwApplOG$n11, daggerTwApplOG$p11, daggerTwApplOG$yw0, daggerTwApplOG$ax0, n));
    }
    
    public static pml u(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$b41 daggerTwApplOG$b41, final DaggerTwApplOG$d41 daggerTwApplOG$d41, final int n) {
        return a89.b((pml)new DaggerTwApplOG$d41$a(daggerTwApplOG$n11, daggerTwApplOG$b41, daggerTwApplOG$d41, n));
    }
    
    public static pml v(final DaggerTwApplOG$n11 daggerTwApplOG$n11, final DaggerTwApplOG$t71 daggerTwApplOG$t71, final DaggerTwApplOG$r71 daggerTwApplOG$r71, final int n) {
        return a89.b((pml)new DaggerTwApplOG$r71$a(daggerTwApplOG$n11, daggerTwApplOG$t71, daggerTwApplOG$r71, n));
    }
    
    public static void w(final String s) {
        r9a.d((Throwable)new IllegalArgumentException(s));
    }
    
    public static String x(final int n) {
        if (n == 1) {
            return "CREATE";
        }
        if (n == 2) {
            return "SHOPPING_CART";
        }
        if (n == 3) {
            return "EDIT";
        }
        if (n == 4) {
            return "MANAGE";
        }
        throw null;
    }
    
    public static void y() {
        final int a = mn2.a;
    }
    
    public static void z() {
        final int a = mn2.a;
    }
    
    public void a() {
        final int a = kp.a;
    }
}
