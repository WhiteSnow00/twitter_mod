import android.view.View;
import com.twitter.app.dm.widget.DMConversationMessageComposer;
import com.twitter.app.dm.widget.DMConversationMessageComposer$a;
import java.util.Objects;
import com.twitter.card.common.preview.b$a;
import java.util.List;
import com.twitter.card.common.preview.a;
import android.app.Activity;
import java.lang.ref.WeakReference;
import com.twitter.card.common.preview.b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wk3 implements b, rj3$a
{
    public final WeakReference<Activity> F0;
    public WeakReference<a> G0;
    public int H0;
    public ca I0;
    public String J0;
    public String K0;
    public List<String> L0;
    public b$a M0;
    public final wj3 N0;
    public final rj3 O0;
    public final exv P0;
    public final r29$c Q0;
    public long R0;
    
    public wk3(final Activity activity, final wj3 n0, final rj3 o0, final exv p4) {
        this.F0 = new WeakReference<Activity>(activity);
        this.H0 = 1;
        this.K0 = "";
        this.N0 = n0;
        this.O0 = o0;
        o0.K0 = (rj3$a)this;
        this.Q0 = r29.i;
        this.P0 = p4;
    }
    
    public final void A(final String s, final boolean b) {
        final ojf j = ojf.J();
        j.q((Iterable)nl3.a(s));
        final List list = (List)((z4j)j).e();
        final List<String> l0 = this.L0;
        boolean b2 = false;
        Label_0068: {
            if (!b) {
                if (list.size() == 1 && !list.equals(l0)) {
                    b2 = true;
                    break Label_0068;
                }
            }
            b2 = false;
        }
        if (b2) {
            this.b();
            if (this.c() != null) {
                this.L0 = list;
                final a c = this.c();
                this.b();
                if (c != null) {
                    if (this.F0.get() != null) {
                        this.H0 = 2;
                        this.K0 = "";
                        final long nanoTime = System.nanoTime();
                        this.R0 = nanoTime;
                        this.O0.g(nanoTime, s);
                        c.a();
                    }
                }
            }
        }
        else {
            this.L0 = list;
            if (list.isEmpty()) {
                this.b();
                this.d();
            }
            else if (list.size() > 1) {
                this.b();
                this.d();
            }
        }
    }
    
    public final void B() {
        this.H0 = 5;
        this.d();
        this.K0 = "tombstone://card";
    }
    
    public final rj3 D() {
        return this.O0;
    }
    
    public final void F1(final long n) {
        if (n == this.R0) {
            this.R0 = -1L;
            final a c = this.c();
            if (c != null) {
                c.d();
            }
            final rj3$b f = this.O0.f(n);
            if (f != null && f.d == 3) {
                final ck3 d = this.O0.d(n);
                if (d != null) {
                    final String b = d.b;
                    if ("tombstone://card".equals(this.K0) || !this.K0.equals(b)) {
                        this.d();
                        if (this.F0.get() != null) {
                            if (d.w()) {
                                final exv p = this.P0;
                                final wwv$a wwv$a = new wwv$a();
                                wwv$a.a = d.h;
                                wwv$a.o((r29)this.Q0);
                                this.I0 = (ca)p.a((wwv)((z4j)wwv$a).e());
                            }
                            else {
                                this.I0 = (ca)this.N0.a((oj3)((z4j)qj3.a(d, (b1p)null)).e(), (r29)this.Q0);
                            }
                            this.J0 = d.a;
                            final ca i0 = this.I0;
                            if (i0 != null) {
                                this.K0 = d.b;
                                i0.b();
                                final a c2 = this.c();
                                if (c2 != null) {
                                    c2.c(this.I0.c(), true);
                                    this.H0 = 3;
                                    final b$a m0 = this.M0;
                                    if (m0 != null) {
                                        final com.twitter.app.dm.widget.a a = (com.twitter.app.dm.widget.a)m0;
                                        final DMConversationMessageComposer$a z0 = a.b.Z0;
                                        final String a2 = a.a.a();
                                        final String x = a.a.x();
                                        Objects.requireNonNull(z0);
                                        final fg4 fg4 = new fg4(z0.a);
                                        final ufv ufv = new ufv();
                                        ufv.c = 6;
                                        ufv.l = a2;
                                        ufv.u = x;
                                        ((o1p)fg4).i((d1p)ufv);
                                        ((o1p)fg4).q(new String[] { "messages:thread:dm_compose_bar:platform_card_preview:impression" });
                                        ((o1p)fg4).e((f0p)z0.b);
                                        sbw.b((tlm)fg4);
                                        final DMConversationMessageComposer b2 = a.b;
                                        b2.T0.setVisibility(8);
                                        final View u0 = b2.U0;
                                        if (u0 != null) {
                                            u0.setVisibility(8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                else {
                    this.d();
                    this.H0 = 4;
                }
            }
            else {
                this.d();
            }
        }
    }
    
    public final String a() {
        return this.J0;
    }
    
    public final void b() {
        final long r0 = this.R0;
        if (r0 != -1L) {
            final rj3$b rj3$b = (rj3$b)this.O0.F0.e(r0);
            if (rj3$b != null) {
                rj3$b.a();
            }
            final Activity activity = this.F0.get();
            if (activity != null) {
                final a a = (a)activity.findViewById(2131428106);
                if (a != null) {
                    a.d();
                }
            }
            this.H0 = 1;
        }
    }
    
    public final a c() {
        final WeakReference<a> g0 = this.G0;
        if (g0 != null) {
            return g0.get();
        }
        final Activity activity = this.F0.get();
        if (activity != null) {
            this.G0 = new WeakReference<a>(activity.findViewById(2131428106));
        }
        return this.G0.get();
    }
    
    public final void d() {
        this.K0 = "";
        final ca i0 = this.I0;
        if (i0 != null) {
            i0.a();
            this.I0 = null;
        }
        final a c = this.c();
        boolean b = true;
        if (c != null) {
            c.b(true);
        }
        final b$a m0 = this.M0;
        if (m0 != null) {
            if (this.H0 != 5) {
                b = false;
            }
            final com.twitter.app.dm.widget.a a = (com.twitter.app.dm.widget.a)m0;
            if (b) {
                final DMConversationMessageComposer$a z0 = a.b.Z0;
                final String a2 = a.a.a();
                final String x = a.a.x();
                Objects.requireNonNull(z0);
                final fg4 fg4 = new fg4(z0.a);
                final ufv ufv = new ufv();
                ufv.c = 6;
                ufv.l = a2;
                ufv.u = x;
                ((o1p)fg4).i((d1p)ufv);
                ((o1p)fg4).q(new String[] { "messages:thread:dm_compose_bar:platform_card_preview:dismiss" });
                ((o1p)fg4).e((f0p)z0.b);
                sbw.b((tlm)fg4);
            }
            if (!a.b.m()) {
                final DMConversationMessageComposer b2 = a.b;
                b2.T0.setVisibility(0);
                final View u0 = b2.U0;
                if (u0 != null) {
                    u0.setVisibility(0);
                }
            }
        }
    }
    
    public final String e0() {
        return this.K0;
    }
    
    public final void i(final b$a m0) {
        this.M0 = m0;
    }
    
    public final String x() {
        final int g = lb0.G(this.H0);
        if (g == 1) {
            return "pending";
        }
        if (g == 2) {
            return "attached";
        }
        if (g == 3) {
            return "no_card";
        }
        if (g != 4) {
            return "";
        }
        return "dismissed";
    }
}
