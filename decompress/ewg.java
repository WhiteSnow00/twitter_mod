import androidx.fragment.app.Fragment;
import android.widget.ImageView;
import android.view.animation.Animation;
import com.twitter.ui.tweet.inlineactions.InlineActionView;
import com.twitter.ui.tweet.inlineactions.d;
import com.twitter.util.user.UserIdentifier;
import android.content.Intent;
import java.util.Objects;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.ui.tweet.inlineactions.InlineActionBar$b;
import android.view.View;
import android.os.Bundle;
import android.content.Context;
import com.twitter.ui.tweet.inlineactions.InlineActionBar;

// 
// Decompiled by Procyon v0.6.0
// 

public class ewg extends wl1 implements ljj
{
    public bqe V1;
    public InlineActionBar W1;
    public jev X1;
    public vo6 Y1;
    public String Z1;
    public String a2;
    public String b2;
    public lev c2;
    public Context d2;
    public boolean e2;
    public psc f2;
    public uiu$a g2;
    public uiu h2;
    public tr6 i2;
    public zbf j2;
    public final i06 k2;
    public final ibm l2;
    public elu m2;
    public uzi n2;
    public final m29 o2;
    public final m29 p2;
    public rcu q2;
    public ogm r2;
    public qeu s2;
    public fod t2;
    
    public ewg() {
        final i06 k2 = new i06();
        this.k2 = k2;
        this.l2 = ibm.g((iz5)k2);
        this.o2 = new m29();
        this.p2 = new m29();
    }
    
    public final void A1(final Bundle bundle) {
        super.A1(bundle);
        bundle.putBoolean("dialog_impression_scribed", this.e2);
    }
    
    public final void D1(final View view, final Bundle bundle) {
        (this.W1 = (InlineActionBar)view.findViewById(2131429311)).setOnInlineActionListener((InlineActionBar$b)new cwg(this));
        this.W1.setInlineActionMutator((zod)new dwg(this));
        final vo6 y1 = this.Y1;
        if (y1 != null) {
            this.l2(y1);
        }
    }
    
    public final void W() {
    }
    
    public final View b2(final LayoutInflater layoutInflater, final Bundle bundle) {
        return layoutInflater.inflate(2131624537, (ViewGroup)null);
    }
    
    public final void c0(final vo6 vo6, final boolean b) {
        if (!this.e2) {
            final zf4 zf4 = new zf4();
            zf4.q(new String[] { this.Z1, this.a2, "retweet_dialog::impression" });
            saw.b((okm)zf4);
            this.e2 = true;
        }
    }
    
    public final boolean g2() {
        final String z1 = this.Z1;
        Objects.requireNonNull(z1);
        final int hashCode = z1.hashCode();
        int n = -1;
        switch (hashCode) {
            case 110773873: {
                if (!z1.equals("tweet")) {
                    break;
                }
                n = 4;
                break;
            }
            case 3208415: {
                if (!z1.equals("home")) {
                    break;
                }
                n = 3;
                break;
            }
            case 3480: {
                if (!z1.equals("me")) {
                    break;
                }
                n = 2;
                break;
            }
            case -196315310: {
                if (!z1.equals("gallery")) {
                    break;
                }
                n = 1;
                break;
            }
            case -309425751: {
                if (!z1.equals("profile")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                return false;
            }
            case 0:
            case 1:
            case 2:
            case 3:
            case 4: {
                return true;
            }
        }
    }
    
    public final void h1(final int n, final int n2, final Intent intent) {
        if (n == 185749209 && n2 == 1) {
            this.j2(this.Y1, true);
            this.h2("favorite", this.Y1);
        }
    }
    
    public final void h2(String o, final vo6 vo6) {
        o = d0p.o(new String[] { this.Z1, this.a2, this.b2, "tweet", o });
        final zf4 zf4 = new zf4();
        wvz.e(zf4, this.d2, vo6, (String)null);
        zf4.q(new String[] { o });
        zf4.e((vyo)this.X1);
        zf4.i((szo)this.c2);
        saw.b((okm)zf4);
    }
    
    public final void i2(final vo6 vo6, final boolean c0, final int n) {
        vo6.C0.C0 = c0;
        vo6.L0(n);
        this.l2(vo6);
    }
    
    public final void j2(final vo6 vo6, final boolean b) {
        if (b) {
            this.i2(vo6, true, vo6.C0.D0 + 1);
        }
        else {
            this.i2(vo6, false, Math.max(vo6.C0.D0 - 1, 0));
        }
    }
    
    public final void k1(final Bundle bundle) {
        super.k1(bundle);
        this.d2 = ((Context)((Fragment)this).L0()).getApplicationContext();
        this.f2 = psc.c();
        final zl1 z1 = this.Z1();
        final String g = z1.g("page");
        final String s = "";
        String z2 = g;
        if (g == null) {
            z2 = "";
        }
        this.Z1 = z2;
        String g2;
        if ((g2 = z1.g("section")) == null) {
            g2 = "";
        }
        this.a2 = g2;
        String g3 = z1.g("component");
        if (g3 == null) {
            g3 = s;
        }
        this.b2 = g3;
        this.X1 = (jev)z1.f("association", (alp)jev.i);
        this.c2 = (lev)z1.f("item", (alp)lev.w1);
        if (bundle != null) {
            this.e2 = bundle.getBoolean("dialog_impression_scribed");
        }
        this.g2 = xha.b(UserIdentifier.getCurrent()).m8();
        final int a = uur.a;
        this.V1 = vur.Companion.a().u1();
    }
    
    public final void k2(final vo6 vo6) {
        final boolean c0 = vo6.C0.C0;
        String s;
        if (c0) {
            s = "unfavorite";
        }
        else {
            s = "favorite";
        }
        final boolean b = false;
        if (c0) {
            this.j2(vo6, false);
            final Context d2 = this.d2;
            final UserIdentifier current = UserIdentifier.getCurrent();
            final long d3 = vo6.D();
            final long g = vo6.G();
            zzd.f((Object)d2, "context");
            zzd.f((Object)current, "userIdentifier");
            final j7c j7c = new j7c(d2, current, d3, g);
            j7c.r1 = vo6.D0;
            ((kmm)j7c).U((cw0$b)new ewg$a(this, vo6));
            this.f2.f((ksc)j7c);
        }
        else {
            this.j2(vo6, true);
            final InlineActionBar w1 = this.W1;
            final d d4 = w1.I0.get(tbu.D0);
            Label_0260: {
                if (d4 != null) {
                    final InlineActionView inlineActionView = (InlineActionView)d4.e;
                    if (((View)inlineActionView).isShown()) {
                        if (!inlineActionView.e()) {
                            if (InlineActionBar.h()) {
                                final deg q0 = w1.Q0;
                                if (q0 != null) {
                                    final kdg e = q0.e;
                                    if (e != null) {
                                        inlineActionView.f(e);
                                        break Label_0260;
                                    }
                                }
                            }
                            if (dcs.A()) {
                                final Animation a = InlineActionBar.a();
                                final ImageView iconView = inlineActionView.getIconView();
                                ((View)iconView).clearAnimation();
                                ((View)iconView).startAnimation(a);
                            }
                        }
                    }
                }
            }
            final h7c h7c = new h7c(this.d2, UserIdentifier.getCurrent(), vo6.D(), vo6.G());
            h7c.p0(vo6.D0);
            h7c.o0(Boolean.valueOf(vo6.R()));
            ((kmm)h7c).U((cw0$b)new ewg$b(this, vo6));
            this.f2.f((ksc)h7c);
        }
        this.h2(s, vo6);
        if (this.g2()) {
            final boolean b2 = vo6.C0.g1.getId() == UserIdentifier.Companion.c().getId();
            int n = b ? 1 : 0;
            if (dcs.x()) {
                n = (b ? 1 : 0);
                if (vo6.C0()) {
                    n = (b ? 1 : 0);
                    if (!b2) {
                        n = (b ? 1 : 0);
                        if (!vo6.E0()) {
                            n = 1;
                        }
                    }
                }
            }
            if (n != 0) {
                new khm().b(this.Z1, vo6.C0.C0);
            }
        }
    }
    
    public final void l2(final vo6 vo6) {
        this.Y1 = vo6;
        this.h2 = this.g2.a(vo6);
        final InlineActionBar w1 = this.W1;
        w1.N0 = new oem(false, false, false, this.Y1.w() == UserIdentifier.getCurrent().getId(), false, this.Y1.C0(), this.Y1.E0(), this.g2(), this.Y1.D0(), this.Y1.F0(), false, false, true, false, false);
        w1.k();
        this.W1.setTweet(vo6);
    }
    
    public final void m0(final vo6 vo6, final boolean b) {
        final zf4 zf4 = new zf4();
        zf4.q(new String[] { this.Z1, this.a2, "retweet_dialog::dismiss" });
        saw.b((okm)zf4);
    }
    
    public final void o1() {
        this.k2.onComplete();
        this.o2.a();
        this.p2.a();
        super.o1();
    }
    
    public final void v(final long n, final vo6 vo6) {
        this.h2("quote", this.Y1);
    }
    
    public final void x(vo6 y1, final boolean b) {
        if (((Fragment)this).d1()) {
            if (b) {
                y1 = this.Y1;
                final int max = Math.max(y1.C0.F0 - 1, 0);
                y1.C0.E0 = false;
                y1.M0(max);
                this.l2(y1);
                this.h2("unretweet", this.Y1);
                if ("soft_nudge_with_quote_tweet".equals(this.Y1.C0.Z0)) {
                    this.h2("soft_nudge_with_qt_unretweet", this.Y1);
                }
            }
            else {
                final vo6 y2 = this.Y1;
                final mg3 c0 = y2.C0;
                final int f0 = c0.F0;
                c0.E0 = true;
                y2.M0(f0 + 1);
                this.l2(y2);
                this.h2("retweet", this.Y1);
                if ("soft_nudge_with_quote_tweet".equals(this.Y1.C0.Z0)) {
                    this.h2("soft_nudge_with_qt_retweet", this.Y1);
                }
            }
        }
    }
}
