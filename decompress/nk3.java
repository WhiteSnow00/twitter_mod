import android.view.View;
import com.twitter.app.dm.widget.DMConversationMessageComposer;
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

public final class nk3 implements b, ij3$a
{
    public final WeakReference<Activity> C0;
    public WeakReference<a> D0;
    public int E0;
    public ea F0;
    public String G0;
    public String H0;
    public List<String> I0;
    public b$a J0;
    public final nj3 K0;
    public final ij3 L0;
    public final yvv M0;
    public final z19$c N0;
    public long O0;
    
    public nk3(final Activity activity, final nj3 k0, final ij3 l0, final yvv m0) {
        this.C0 = new WeakReference<Activity>(activity);
        this.E0 = 1;
        this.H0 = "";
        this.K0 = k0;
        this.L0 = l0;
        l0.H0 = (ij3$a)this;
        this.N0 = z19.i;
        this.M0 = m0;
    }
    
    public final void A(final String s, final boolean b) {
        final ijf j = ijf.J();
        j.q((Iterable)el3.a(s));
        final List list = (List)((h4j)j).e();
        final List<String> i0 = this.I0;
        boolean b2 = false;
        Label_0065: {
            if (!b) {
                if (list.size() == 1 && !list.equals(i0)) {
                    b2 = true;
                    break Label_0065;
                }
            }
            b2 = false;
        }
        if (b2) {
            this.b();
            if (this.c() != null) {
                this.I0 = list;
                final a c = this.c();
                this.b();
                if (c != null) {
                    if (this.C0.get() != null) {
                        this.E0 = 2;
                        this.H0 = "";
                        final long nanoTime = System.nanoTime();
                        this.O0 = nanoTime;
                        this.L0.g(nanoTime, s);
                        c.a();
                    }
                }
            }
        }
        else {
            this.I0 = list;
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
        this.E0 = 5;
        this.d();
        this.H0 = "tombstone://card";
    }
    
    public final ij3 D() {
        return this.L0;
    }
    
    public final void F1(final long n) {
        if (n == this.O0) {
            this.O0 = -1L;
            final a c = this.c();
            if (c != null) {
                c.d();
            }
            final ij3$b f = this.L0.f(n);
            if (f != null && f.d == 3) {
                final tj3 d = this.L0.d(n);
                if (d != null) {
                    final String b = d.b;
                    if ("tombstone://card".equals(this.H0) || !this.H0.equals(b)) {
                        this.d();
                        if (this.C0.get() != null) {
                            if (d.w()) {
                                final yvv m0 = this.M0;
                                final qvv$a qvv$a = new qvv$a();
                                qvv$a.a = d.h;
                                qvv$a.o((z19)this.N0);
                                this.F0 = (ea)m0.a((qvv)((h4j)qvv$a).e());
                            }
                            else {
                                this.F0 = (ea)this.K0.a((fj3)((h4j)hj3.a(d, (qzo)null)).e(), (z19)this.N0);
                            }
                            this.G0 = d.a;
                            final ea f2 = this.F0;
                            if (f2 != null) {
                                this.H0 = d.b;
                                f2.c();
                                final a c2 = this.c();
                                if (c2 != null) {
                                    c2.c(this.F0.d(), true);
                                    this.E0 = 3;
                                    final b$a j0 = this.J0;
                                    if (j0 != null) {
                                        final com.twitter.app.dm.widget.a a = (com.twitter.app.dm.widget.a)j0;
                                        final DMConversationMessageComposer.a w0 = a.b.W0;
                                        final String a2 = a.a.a();
                                        final String x = a.a.x();
                                        Objects.requireNonNull(w0);
                                        final zf4 zf4 = new zf4(w0.a);
                                        final lev lev = new lev();
                                        lev.c = 6;
                                        lev.l = a2;
                                        lev.u = x;
                                        zf4.i((szo)lev);
                                        zf4.q(new String[] { "messages:thread:dm_compose_bar:platform_card_preview:impression" });
                                        zf4.e((vyo)w0.b);
                                        saw.b((okm)zf4);
                                        final DMConversationMessageComposer b2 = a.b;
                                        b2.Q0.setVisibility(8);
                                        final View r0 = b2.R0;
                                        if (r0 != null) {
                                            r0.setVisibility(8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                else {
                    this.d();
                    this.E0 = 4;
                }
            }
            else {
                this.d();
            }
        }
    }
    
    public final String a() {
        return this.G0;
    }
    
    public final void b() {
        final long o0 = this.O0;
        if (o0 != -1L) {
            final ij3$b ij3$b = (ij3$b)this.L0.C0.e(o0);
            if (ij3$b != null) {
                ij3$b.a();
            }
            final Activity activity = this.C0.get();
            if (activity != null) {
                final a a = (a)activity.findViewById(2131428106);
                if (a != null) {
                    a.d();
                }
            }
            this.E0 = 1;
        }
    }
    
    public final a c() {
        final WeakReference<a> d0 = this.D0;
        if (d0 != null) {
            return d0.get();
        }
        final Activity activity = this.C0.get();
        if (activity != null) {
            this.D0 = new WeakReference<a>(activity.findViewById(2131428106));
        }
        return this.D0.get();
    }
    
    public final void d() {
        this.H0 = "";
        final ea f0 = this.F0;
        if (f0 != null) {
            f0.a();
            this.F0 = null;
        }
        final a c = this.c();
        boolean b = true;
        if (c != null) {
            c.b(true);
        }
        final b$a j0 = this.J0;
        if (j0 != null) {
            if (this.E0 != 5) {
                b = false;
            }
            final com.twitter.app.dm.widget.a a = (com.twitter.app.dm.widget.a)j0;
            if (b) {
                final DMConversationMessageComposer.a w0 = a.b.W0;
                final String a2 = a.a.a();
                final String x = a.a.x();
                Objects.requireNonNull(w0);
                final zf4 zf4 = new zf4(w0.a);
                final lev lev = new lev();
                lev.c = 6;
                lev.l = a2;
                lev.u = x;
                zf4.i((szo)lev);
                zf4.q(new String[] { "messages:thread:dm_compose_bar:platform_card_preview:dismiss" });
                zf4.e((vyo)w0.b);
                saw.b((okm)zf4);
            }
            if (!a.b.k()) {
                final DMConversationMessageComposer b2 = a.b;
                b2.Q0.setVisibility(0);
                final View r0 = b2.R0;
                if (r0 != null) {
                    r0.setVisibility(0);
                }
            }
        }
    }
    
    public final String e0() {
        return this.H0;
    }
    
    public final void i(final b$a j0) {
        this.J0 = j0;
    }
    
    public final String x() {
        final int d = nb0.D(this.E0);
        if (d == 1) {
            return "pending";
        }
        if (d == 2) {
            return "attached";
        }
        if (d == 3) {
            return "no_card";
        }
        if (d != 4) {
            return "";
        }
        return "dismissed";
    }
}
