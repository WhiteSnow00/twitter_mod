import java.util.concurrent.TimeUnit;
import com.twitter.util.user.UserIdentifier;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jxa
{
    public static final fli a;
    
    static {
        a = new fli();
    }
    
    public static int A(final String s) {
        Objects.requireNonNull(s, "Name is null");
        if (s.equals("px")) {
            return 1;
        }
        if (s.equals("em")) {
            return 2;
        }
        if (s.equals("ex")) {
            return 3;
        }
        if (s.equals("in")) {
            return 4;
        }
        if (s.equals("cm")) {
            return 5;
        }
        if (s.equals("mm")) {
            return 6;
        }
        if (s.equals("pt")) {
            return 7;
        }
        if (s.equals("pc")) {
            return 8;
        }
        if (s.equals("percent")) {
            return 9;
        }
        throw new IllegalArgumentException("No enum constant com.caverock.androidsvg.SVG.Unit.".concat(s));
    }
    
    public static gqg a(final iqg iqg, final int n, final int n2, final Map map, final qsb qsb) {
        czd.f((Object)map, "alignmentLines");
        czd.f((Object)qsb, "placementBlock");
        return (gqg)new hqg(n, n2, map, iqg, qsb);
    }
    
    public static final String b(final int n) {
        final String q = q(n);
        final Locale english = Locale.ENGLISH;
        return oqf.m(english, "ENGLISH", q, english, "this as java.lang.String).toLowerCase(locale)");
    }
    
    public static j6f c(final UserIdentifier userIdentifier) {
        return (j6f)mfw.a().e(userIdentifier, (Class)j6f.class);
    }
    
    public static bwg d() {
        return (bwg)((b5j)br0.a()).B((Class)bwg.class);
    }
    
    public static w1v e() {
        return (w1v)((b5j)br0.a()).B((Class)w1v.class);
    }
    
    public static xdv f() {
        return (xdv)((b5j)br0.a()).B((Class)xdv.class);
    }
    
    public static int g(final int n) {
        if (n == 1) {
            return 2131099688;
        }
        if (n == 2) {
            return 2131099687;
        }
        throw null;
    }
    
    public static int h(final int n) {
        if (n == 1) {
            return 2131230860;
        }
        if (n == 2) {
            return 2131230856;
        }
        throw null;
    }
    
    public static j6f i() {
        return (j6f)mfw.a().c((Class)j6f.class);
    }
    
    public static boolean j(final int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2) {
            return false;
        }
        if (n == 3) {
            return false;
        }
        if (n == 4) {
            return false;
        }
        if (n == 5) {
            return false;
        }
        if (n == 6) {
            return false;
        }
        if (n == 7) {
            return false;
        }
        if (n == 8) {
            return false;
        }
        if (n == 9) {
            return false;
        }
        if (n == 10) {
            return false;
        }
        if (n == 11) {
            return false;
        }
        if (n == 12) {
            return false;
        }
        if (n == 13) {
            return false;
        }
        if (n == 14) {
            return false;
        }
        if (n == 15) {
            return false;
        }
        if (n == 16) {
            return false;
        }
        if (n == 17) {
            return false;
        }
        if (n == 18) {
            return true;
        }
        if (n == 19) {
            return true;
        }
        if (n == 20) {
            return true;
        }
        if (n == 21) {
            return true;
        }
        if (n == 22) {
            return true;
        }
        if (n == 23) {
            return true;
        }
        if (n == 24) {
            return true;
        }
        if (n == 25) {
            return true;
        }
        if (n == 26) {
            return false;
        }
        if (n == 27) {
            return false;
        }
        if (n == 28) {
            return false;
        }
        if (n == 29) {
            return false;
        }
        if (n == 30) {
            return false;
        }
        if (n == 31) {
            return false;
        }
        if (n == 32) {
            return false;
        }
        if (n == 33) {
            return false;
        }
        if (n == 34) {
            return false;
        }
        if (n == 35) {
            return false;
        }
        if (n == 36) {
            return false;
        }
        if (n == 37) {
            return false;
        }
        if (n == 38) {
            return false;
        }
        if (n == 39) {
            return false;
        }
        if (n == 40) {
            return false;
        }
        if (n == 41) {
            return false;
        }
        if (n == 42) {
            return false;
        }
        if (n == 43) {
            return false;
        }
        if (n == 44) {
            return true;
        }
        if (n == 45) {
            return true;
        }
        if (n == 46) {
            return true;
        }
        if (n == 47) {
            return true;
        }
        if (n == 48) {
            return true;
        }
        throw null;
    }
    
    public static int k(final int n) {
        if (n == 1) {
            return 2131231855;
        }
        if (n == 2) {
            return 2131231401;
        }
        throw null;
    }
    
    public static int l(final int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 3;
        }
        if (n == 4) {
            return 4;
        }
        throw null;
    }
    
    public static long m(final int n) {
        if (n == 1) {
            return 0L;
        }
        if (n == 2) {
            return 1L;
        }
        if (n == 3) {
            return 2L;
        }
        if (n == 4) {
            return 3L;
        }
        if (n == 5) {
            return 4L;
        }
        throw null;
    }
    
    public static gqg n(final iqg iqg, final int n, final int n2, final Map map, final qsb qsb, final int n3, final Object o) {
        return iqg.J(n, n2, (Map)k2a.D0, qsb);
    }
    
    public static float o(final float n, final float n2, final float n3, final float n4) {
        return (n3 - n * n2) / n4;
    }
    
    public static String p(final int n, final String s, final int n2) {
        final StringBuilder sb = new StringBuilder(n);
        sb.append(s);
        sb.append(n2);
        return sb.toString();
    }
    
    public static String q(final int n) {
        if (n == 1) {
            return "BROWSER_OPEN";
        }
        if (n == 2) {
            return "LOAD_START";
        }
        if (n == 3) {
            return "FIRST_PAGE_LOAD";
        }
        if (n == 4) {
            return "PAGE_LOAD";
        }
        if (n == 5) {
            return "ABSOLUTE_DWELL";
        }
        throw null;
    }
    
    public static String r(final int n) {
        if (n == 1) {
            return "SendTweet";
        }
        if (n == 2) {
            return "ReviseTweet";
        }
        if (n == 3) {
            return "DismissNudge";
        }
        if (n == 4) {
            return "CancelTweet";
        }
        if (n == 5) {
            return "CloseApp";
        }
        if (n == 6) {
            return "NudgeNotShown";
        }
        if (n == 7) {
            return "BackButtonPressed";
        }
        if (n == 8) {
            return "MoreInfo";
        }
        if (n == 9) {
            return "Expand";
        }
        if (n == 10) {
            return "Collapse";
        }
        throw null;
    }
    
    public static gfv s(final oxf oxf) {
        return (gfv)dwj.f(((vl1)oxf).a, "scribe_item", (rlp)gfv.w1);
    }
    
    public static Object t(final g4p g4p, final tuh tuh, final ftb ftb, final go6 go6, final int n, final Object o) {
        return g4p.c(tuh.D0, ftb, go6);
    }
    
    public static boolean u(final gjg gjg, final long n, final TimeUnit timeUnit, final int n2, final Object o) {
        return gjg.a(n, TimeUnit.MILLISECONDS);
    }
    
    public static String v(final int n) {
        if (n == 1) {
            return "BROADCASTER";
        }
        if (n == 2) {
            return "VIEWER";
        }
        return "null";
    }
    
    public static String w(final int n) {
        if (n == 1) {
            return "BROWSER_OPEN";
        }
        if (n == 2) {
            return "LOAD_START";
        }
        if (n == 3) {
            return "FIRST_PAGE_LOAD";
        }
        if (n == 4) {
            return "PAGE_LOAD";
        }
        if (n == 5) {
            return "ABSOLUTE_DWELL";
        }
        return "null";
    }
    
    public static String x(final int n) {
        if (n == 1) {
            return "OTHER_VIOLATION";
        }
        if (n == 2) {
            return "INTELLECTUAL_PROPERTY_VIOLATION";
        }
        return "null";
    }
    
    public static String y(final int n) {
        if (n == 1) {
            return "px";
        }
        if (n == 2) {
            return "em";
        }
        if (n == 3) {
            return "ex";
        }
        if (n == 4) {
            return "in";
        }
        if (n == 5) {
            return "cm";
        }
        if (n == 6) {
            return "mm";
        }
        if (n == 7) {
            return "pt";
        }
        if (n == 8) {
            return "pc";
        }
        if (n == 9) {
            return "percent";
        }
        return "null";
    }
    
    public static String z(final int n) {
        if (n == 1) {
            return "OK";
        }
        if (n == 2) {
            return "BAD_CONFIG";
        }
        if (n == 3) {
            return "AUTH_ERROR";
        }
        return "null";
    }
}
