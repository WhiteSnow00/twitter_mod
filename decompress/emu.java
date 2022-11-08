import java.util.HashSet;
import java.util.Iterator;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnPreDrawListener;
import java.util.Set;
import java.util.List;
import com.twitter.util.user.UserIdentifier;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class emu extends gzm
{
    public final Context E0;
    public final View F0;
    public final bra<UserIdentifier, zf4> G0;
    public final int H0;
    public final List<lev> I0;
    public final List<Long> J0;
    public final List<lev> K0;
    public final Set<String> L0;
    public final jev M0;
    public final oqu N0;
    public final gnf O0;
    public final aws P0;
    public final boolean Q0;
    
    public emu(final Context context, final jev m0, final gew gew, final oqu n0, final View f0, final gnf o0, final aws p11, final bra<UserIdentifier, zf4> g0, final String s, final z7x z7x, final UserIdentifier userIdentifier) {
        super(gew);
        this.I0 = (rth$a)rth.a(0);
        this.J0 = (rth$a)rth.a(0);
        this.K0 = (rth$a)rth.a(0);
        this.L0 = (iuh$a)iuh.a(0);
        this.E0 = context.getApplicationContext();
        this.M0 = m0;
        this.N0 = n0;
        this.F0 = f0;
        this.H0 = tbx.k(context).b;
        this.O0 = o0;
        this.P0 = p11;
        this.G0 = g0;
        if (o0 != null) {
            final boolean i = dta.b().m("ad_formats_android_flybys_6875");
            this.Q0 = i;
            if (i) {
                ((k6m)o0).c((gnf$b)new emu$a(this, f0));
            }
        }
        else {
            this.Q0 = false;
        }
        if (z7x != null && userIdentifier != null) {
            f.i((b5j)z7x.g(), (u93)new dmu((Object)this, (Object)userIdentifier, (Object)s, (Object)m0, 0));
            f.i((b5j)z7x.o(), (u93)new cmu((Object)this, (Object)userIdentifier, 0));
        }
    }
    
    public void o(final vo6 vo6, final int n, final View view) {
        final lev p3 = this.p(vo6, n, view);
        ((List<lev>)this.I0).add(p3);
        if (p3.h == 6 && pjr.g((CharSequence)p3.n)) {
            ((List<lev>)this.K0).add(p3);
        }
    }
    
    public lev p(final vo6 vo6, final int n, final View view) {
        final oqu n2 = this.N0;
        final Context e0 = this.E0;
        String s;
        if (vo6.l0()) {
            s = "focal";
        }
        else if (vo6.h0()) {
            s = "ancestor";
        }
        else {
            s = null;
        }
        final lev c = n2.c(e0, vo6, s);
        c.b = vo6.t();
        c.f = n + 1;
        if (view != null) {
            final ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new fmu(this, viewTreeObserver, c, view));
        }
        return c;
    }
    
    public final void q(final vo6 vo6, final int n, final View view) {
        if (!vo6.F0 && this.i((Object)vo6.J0)) {
            ((List<Long>)this.J0).add(Long.valueOf(vo6.J0));
            this.o(vo6, n, view);
        }
        this.s(vo6);
    }
    
    public void r(final UserIdentifier userIdentifier, final String s, final jev jev) {
        if (!((List)this.I0).isEmpty()) {
            final zf4 zf4 = (zf4)this.G0.a((Object)userIdentifier);
            zf4.q(new String[] { s });
            zf4.e((vyo)jev);
            zf4.g((List)this.I0);
            final float density = this.E0.getResources().getDisplayMetrics().density;
            zf4.H = (int)(this.H0 / density);
            final int a = w4j.a;
            if (this.F0 != null) {
                final Rect rect = new Rect();
                this.F0.getGlobalVisibleRect(rect);
                zf4.I = (int)(rect.height() / density);
            }
            saw.b((okm)zf4);
            if (!((List)this.K0).isEmpty()) {
                final String a2 = t4s.a();
                final lq a3 = mp.a();
                for (final lev lev : this.K0) {
                    final String n = lev.n;
                    final zf4 zf5 = (zf4)this.G0.a((Object)userIdentifier);
                    zf5.q(new String[] { s });
                    zf5.i((szo)lev);
                    if (pjr.g((CharSequence)n)) {
                        zf5.z = "app_download_client_event";
                        final int a4 = w4j.a;
                    }
                    if (pjr.g((CharSequence)a2)) {
                        String b = null;
                        if (n != null) {
                            final String z = af.z(a2, "d6PaPHJeSpyHXeVyWT6ePCcSMSrnD83MnfMgWhtczxpnSMSF7CQcBSQqtBNh6Jym", n, "Activation");
                            final byte[] a5 = rk1.a;
                            final byte[] d = rk1.d(z.getBytes());
                            if (d == null) {
                                b = b;
                            }
                            else {
                                b = rk1.b(d);
                            }
                        }
                        zf5.f("3", b);
                        zf5.f("4", a2);
                    }
                    if (a3 != null) {
                        zf5.f("6", a3.a);
                        zf5.x(a3.b);
                    }
                    saw.b((okm)zf5);
                }
                ((List)this.K0).clear();
            }
            ((List)this.I0).clear();
        }
    }
    
    public final void s(final vo6 vo6) {
        final hil d0 = vo6.D0;
        if (d0 != null && !((HashSet)this.L0).contains(d0.a)) {
            final ovv x0 = vo6.C0.X0;
            boolean b = false;
            Label_0065: {
                if (this.Q0) {
                    final gnf o0 = this.O0;
                    if (o0 != null && o0.f()) {
                        b = true;
                        break Label_0065;
                    }
                }
                b = false;
            }
            final kil$a e = kil.e(jil.D0, d0);
            String i;
            if (b) {
                i = "flyby";
            }
            else {
                i = null;
            }
            e.i = i;
            if (x0 != null) {
                e.j = x0.a.C0;
            }
            saw.b((okm)((h4j)e).e());
            if (!b) {
                ((HashSet<String>)this.L0).add(d0.a);
            }
        }
    }
}
