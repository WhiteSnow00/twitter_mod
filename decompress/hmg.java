import android.view.View;
import com.twitter.ui.user.UserView;
import com.twitter.ui.user.BaseUserView;
import com.google.android.filament.utils.Float4;
import com.twitter.ui.user.BaseUserView$a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hmg implements BaseUserView$a, ugj
{
    public static final hmg D0;
    public static final hmg E0;
    
    static {
        D0 = new hmg();
        E0 = new hmg();
    }
    
    public static mdv b() {
        return (mdv)((b5j)br0.a()).B((Class)mdv.class);
    }
    
    public static float d(final Float4 float4, final float n, final float n2) {
        return float4.getY() * n + n2;
    }
    
    public static int e(final long n, final int n2, final int n3) {
        return (c5j.d(n) + n2) * n3;
    }
    
    public static int f(final String s, final int n, final int n2) {
        return (s.hashCode() + n) * n2;
    }
    
    public static int g(final boolean b, final int n) {
        return Boolean.valueOf(b).hashCode() + n;
    }
    
    public static String h(final String s, final String s2) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(s2);
        return sb.toString();
    }
    
    public static String i(final StringBuilder sb, final long n, final String s) {
        sb.append(n);
        sb.append(s);
        return sb.toString();
    }
    
    public static void j(final qvj qvj, final ag3 ag3, final fq2 fq2, final float n, final arp arp, final ffs ffs, final nbu nbu, final int n2, final Object o) {
        qvj.u(ag3, fq2, n, arp, ffs, (nbu)null);
    }
    
    public static do6 k(final lhu lhu) {
        final bo6 r = lhu.r();
        do6 do6;
        if (r != null) {
            do6 = new do6(r.D(), r.H0, r.P0, r.Y0, r.T0, r.U0, r.E0, r.D0.D1, r.I0);
        }
        else {
            do6 = null;
        }
        return do6;
    }
    
    public static String l(final int n) {
        if (n == 1) {
            return "LOADING";
        }
        if (n == 2) {
            return "LOADED";
        }
        if (n == 3) {
            return "ERROR";
        }
        return "null";
    }
    
    public void a(final BaseUserView baseUserView, final long n, final int n2) {
        czd.f((Object)baseUserView, "<anonymous parameter 0>");
    }
    
    public opx c(final View view, final opx opx) {
        czd.f((Object)view, "view");
        final jrd d = opx.d(7);
        czd.e((Object)d, "windowInsets.getInsets(W\u2026Compat.Type.systemBars())");
        view.setPadding(view.getPaddingLeft(), d.b, view.getPaddingRight(), view.getPaddingBottom());
        return opx.b;
    }
}
