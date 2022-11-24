import java.util.HashMap;
import com.twitter.ui.user.UserView;
import com.twitter.ui.user.BaseUserView;
import java.util.Objects;
import java.util.Iterator;
import java.util.List;
import com.google.android.filament.utils.Float4;
import com.google.android.gms.common.api.ApiException;
import java.util.Locale;
import com.twitter.util.user.UserIdentifier;
import com.twitter.ui.user.BaseUserView$a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ffe implements qrf$a, BaseUserView$a
{
    public static final ffe F0;
    public static final ffe G0;
    
    static {
        F0 = new ffe();
        G0 = new ffe();
    }
    
    public static void a(final String s, final String s2) {
        final fg4 fg4 = new fg4(dda.Companion.e("notification", "", "push_layout_view_binder", s, s2));
        ((o1p)fg4).A();
        nda.a().b(UserIdentifier.Companion.c(), (tlm)fg4);
    }
    
    public static t5j b() {
        final t5j never = t5j.never();
        e0e.e((Object)never, "never()");
        return never;
    }
    
    public static final String e(final int n) {
        r(n);
        final Locale english = Locale.ENGLISH;
        return a88.l(english, "ENGLISH", "AUTOMATED_LABEL", english, "this as java.lang.String).toLowerCase(locale)");
    }
    
    public static h2v f() {
        return (h2v)((n5j)cr0.a()).B((Class)h2v.class);
    }
    
    public static noj g(final Throwable t) {
        noj b;
        if (t instanceof ApiException) {
            b = new noj((Object)((ApiException)t).F0.G0);
        }
        else {
            b = noj.b;
            final int a = o5j.a;
        }
        return b;
    }
    
    public static void h(final String s, final String s2, final String s3) {
        final fg4 fg4 = new fg4();
        ((o1p)fg4).T = dda.g(s, "smart_lock", s2, "", s3).toString();
        final int a = o5j.a;
        sbw.b((tlm)fg4);
    }
    
    public static void i(final String s, final Throwable t) {
        final noj g = g(t);
        if (g.f()) {
            final int intValue = (int)g.c();
            if (intValue == 16) {
                h(s, "save_credential", "disabled");
            }
            else if (intValue == 0) {
                h(s, "save_credential", "dismiss");
            }
            else if (intValue == 17) {
                h(s, "save_credential", "api_not_connected");
            }
            else {
                j(s, "save_credential", t);
            }
        }
        else {
            j(s, "save_credential", t);
        }
    }
    
    public static void j(final String s, final String s2, final Throwable b) {
        h(s, s2, "error");
        final m9a m9a = new m9a();
        ((HashMap<String, String>)m9a.a).put("smartlock.error", s2);
        m9a.b = b;
        r9a.c(m9a);
    }
    
    public static float k(final Float4 float4, final float n, final float n2) {
        return float4.getZ() * n + n2;
    }
    
    public static int l(final String s, final int n, final int n2) {
        return (o5j.f((Object)s) + n) * n2;
    }
    
    public static String m(final String s, final int n, final String s2) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(n);
        sb.append(s2);
        return sb.toString();
    }
    
    public static String n(final String s, final Object o, final String s2) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(o);
        sb.append(s2);
        return sb.toString();
    }
    
    public static Iterator o(final yfe yfe, final String s, final List list) {
        yfe.i(s);
        yfe.q0();
        return list.iterator();
    }
    
    public static void p(final StringBuilder sb, final int n, final String s, final int n2, final String s2) {
        sb.append(n);
        sb.append(s);
        sb.append(n2);
        sb.append(s2);
    }
    
    public static void q(final StringBuilder sb, final String s, final String s2, final String s3) {
        sb.append(s);
        sb.append(s2);
        sb.append(s3);
    }
    
    public static String r(final int n) {
        if (n == 1) {
            return "AUTOMATED_LABEL";
        }
        throw null;
    }
    
    public static ufv s(final jyf jyf) {
        return (ufv)swj.f(((am1)jyf).a, "scribe_item", (nmp)ufv.w1);
    }
    
    public static boolean t() {
        final ubl ubl = (ubl)lp7.m0((Class)ubl.class);
        return pdw.d().getUser().j();
    }
    
    public static sfv u(final xfu xfu) {
        return xfu.a();
    }
    
    public static String v(final int n) {
        if (n == 1) {
            return "AUTOMATED_LABEL";
        }
        return "null";
    }
    
    public static String w(final int n) {
        if (n == 1) {
            return "Selling";
        }
        if (n == 2) {
            return "SoldOut";
        }
        if (n == 3) {
            return "SaleEnded";
        }
        return "null";
    }
    
    public static int x(final String s) {
        Objects.requireNonNull(s, "Name is null");
        if (s.equals("AUTOMATED_LABEL")) {
            return 1;
        }
        throw new IllegalArgumentException("No enum constant com.twitter.accounttaxonomy.implementation.OptInAccountType.".concat(s));
    }
    
    public void c(final grf grf) {
        final int a = prf.a;
    }
    
    public void d(final BaseUserView baseUserView, final long n, final int n2) {
        e0e.f((Object)baseUserView, "<anonymous parameter 0>");
    }
}
