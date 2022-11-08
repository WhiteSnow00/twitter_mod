// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import androidx.appcompat.view.menu.a;
import android.view.ViewParent;
import android.util.Log;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i$a;
import android.view.Menu;
import androidx.appcompat.view.menu.g;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Window$Callback;
import android.graphics.drawable.Drawable;
import android.view.View;

public final class c implements tc8
{
    public Toolbar a;
    public int b;
    public b c;
    public View d;
    public Drawable e;
    public Drawable f;
    public Drawable g;
    public boolean h;
    public CharSequence i;
    public CharSequence j;
    public CharSequence k;
    public Window$Callback l;
    public boolean m;
    public ActionMenuPresenter n;
    public int o;
    public Drawable p;
    
    public c(final Toolbar a, final boolean b) {
        this.o = 0;
        this.a = a;
        this.i = a.getTitle();
        this.j = a.getSubtitle();
        this.h = (this.i != null);
        this.g = a.getNavigationIcon();
        final Context context = ((View)a).getContext();
        final int[] f0 = ck1.F0;
        CharSequence string = null;
        final u9t q = u9t.q(context, (AttributeSet)null, f0, 2130968607);
        int b2 = 15;
        this.p = q.g(15);
        if (b) {
            final CharSequence n = q.n(27);
            if (!TextUtils.isEmpty(n)) {
                this.h = true;
                this.s(n);
            }
            final CharSequence n2 = q.n(25);
            if (!TextUtils.isEmpty(n2)) {
                this.j = n2;
                if ((this.b & 0x8) != 0x0) {
                    this.a.setSubtitle(n2);
                }
            }
            final Drawable g = q.g(20);
            if (g != null) {
                this.f = g;
                this.v();
            }
            final Drawable g2 = q.g(17);
            if (g2 != null) {
                this.setIcon(g2);
            }
            if (this.g == null) {
                final Drawable p2 = this.p;
                if (p2 != null) {
                    this.g = p2;
                    this.u();
                }
            }
            this.C(q.j(10, 0));
            final int l = q.l(9, 0);
            if (l != 0) {
                this.E(LayoutInflater.from(((View)this.a).getContext()).inflate(l, (ViewGroup)this.a, false));
                this.C(this.b | 0x10);
            }
            final int k = q.k(13, 0);
            if (k > 0) {
                final ViewGroup$LayoutParams layoutParams = ((View)this.a).getLayoutParams();
                layoutParams.height = k;
                ((View)this.a).setLayoutParams(layoutParams);
            }
            final int e = q.e(7, -1);
            final int e2 = q.e(3, -1);
            if (e >= 0 || e2 >= 0) {
                final Toolbar a2 = this.a;
                final int max = Math.max(e, 0);
                final int max2 = Math.max(e2, 0);
                a2.d();
                a2.V0.a(max, max2);
            }
            final int i = q.l(28, 0);
            if (i != 0) {
                final Toolbar a3 = this.a;
                final Context context2 = ((View)a3).getContext();
                a3.N0 = i;
                final AppCompatTextView d0 = a3.D0;
                if (d0 != null) {
                    d0.setTextAppearance(context2, i);
                }
            }
            final int j = q.l(26, 0);
            if (j != 0) {
                final Toolbar a4 = this.a;
                final Context context3 = ((View)a4).getContext();
                a4.O0 = j;
                final AppCompatTextView e3 = a4.E0;
                if (e3 != null) {
                    e3.setTextAppearance(context3, j);
                }
            }
            final int m = q.l(22, 0);
            if (m != 0) {
                this.a.setPopupTheme(m);
            }
        }
        else {
            if (this.a.getNavigationIcon() != null) {
                this.p = this.a.getNavigationIcon();
            }
            else {
                b2 = 11;
            }
            this.b = b2;
        }
        q.r();
        if (2131951738 != this.o) {
            this.o = 2131951738;
            if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
                final int o = this.o;
                if (o != 0) {
                    string = this.getContext().getString(o);
                }
                this.k = string;
                this.t();
            }
        }
        this.k = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener((View$OnClickListener)new dit(this));
    }
    
    @Override
    public final void C(final int b) {
        final int n = this.b ^ b;
        this.b = b;
        if (n != 0) {
            if ((n & 0x4) != 0x0) {
                if ((b & 0x4) != 0x0) {
                    this.t();
                }
                this.u();
            }
            if ((n & 0x3) != 0x0) {
                this.v();
            }
            if ((n & 0x8) != 0x0) {
                if ((b & 0x8) != 0x0) {
                    this.a.setTitle(this.i);
                    this.a.setSubtitle(this.j);
                }
                else {
                    this.a.setTitle(null);
                    this.a.setSubtitle(null);
                }
            }
            if ((n & 0x10) != 0x0) {
                final View d = this.d;
                if (d != null) {
                    if ((b & 0x10) != 0x0) {
                        this.a.addView(d);
                    }
                    else {
                        this.a.removeView(d);
                    }
                }
            }
        }
    }
    
    @Override
    public final void E(final View d) {
        final View d2 = this.d;
        if (d2 != null && (this.b & 0x10) != 0x0) {
            this.a.removeView(d2);
        }
        if ((this.d = d) != null && (this.b & 0x10) != 0x0) {
            this.a.addView(d);
        }
    }
    
    @Override
    public final boolean a() {
        final Toolbar a = this.a;
        if (((View)a).getVisibility() == 0) {
            final ActionMenuView c0 = a.C0;
            if (c0 != null && c0.U0) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final boolean b() {
        return this.a.o();
    }
    
    @Override
    public final boolean c() {
        return this.a.y();
    }
    
    @Override
    public final void collapseActionView() {
        final Toolbar.d o1 = this.a.o1;
        g d0;
        if (o1 == null) {
            d0 = null;
        }
        else {
            d0 = o1.D0;
        }
        if (d0 != null) {
            d0.collapseActionView();
        }
    }
    
    @Override
    public final void d(final Menu menu, final i$a g0) {
        if (this.n == null) {
            this.n = new ActionMenuPresenter(((View)this.a).getContext());
        }
        final ActionMenuPresenter n = this.n;
        ((a)n).G0 = g0;
        final Toolbar a = this.a;
        final e e = (e)menu;
        if (e != null || a.C0 != null) {
            a.f();
            final e r0 = a.C0.R0;
            if (r0 != e) {
                if (r0 != null) {
                    r0.v((i)a.n1);
                    r0.v((i)a.o1);
                }
                if (a.o1 == null) {
                    a.o1 = a.new d();
                }
                n.S0 = true;
                if (e != null) {
                    e.c((i)n, a.L0);
                    e.c((i)a.o1, a.L0);
                }
                else {
                    n.h(a.L0, (e)null);
                    final Toolbar.d o1 = a.o1;
                    final e c0 = o1.C0;
                    if (c0 != null) {
                        final g d0 = o1.D0;
                        if (d0 != null) {
                            c0.e(d0);
                        }
                    }
                    o1.C0 = null;
                    n.d();
                    a.o1.d();
                }
                a.C0.setPopupTheme(a.M0);
                a.C0.setPresenter(n);
                a.n1 = n;
            }
        }
    }
    
    @Override
    public final boolean e() {
        return this.a.s();
    }
    
    @Override
    public final void f() {
        this.m = true;
    }
    
    @Override
    public final boolean g() {
        final ActionMenuView c0 = this.a.C0;
        boolean b = false;
        if (c0 != null) {
            final ActionMenuPresenter v0 = c0.V0;
            final boolean b2 = v0 != null && (v0.W0 != null || v0.l());
            b = b;
            if (b2) {
                b = true;
            }
        }
        return b;
    }
    
    @Override
    public final Context getContext() {
        return ((View)this.a).getContext();
    }
    
    @Override
    public final CharSequence getTitle() {
        return this.a.getTitle();
    }
    
    @Override
    public final boolean h() {
        final Toolbar.d o1 = this.a.o1;
        return o1 != null && o1.D0 != null;
    }
    
    @Override
    public final int i() {
        return 0;
    }
    
    @Override
    public final bax j(final int n, final long n2) {
        final bax c = p5x.c((View)this.a);
        float n3;
        if (n == 0) {
            n3 = 1.0f;
        }
        else {
            n3 = 0.0f;
        }
        c.a(n3);
        c.e(n2);
        c.g((dax)new c$a(this, n));
        return c;
    }
    
    @Override
    public final void k() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }
    
    @Override
    public final void l(final boolean collapsible) {
        this.a.setCollapsible(collapsible);
    }
    
    @Override
    public final void m() {
        final ActionMenuView c0 = this.a.C0;
        if (c0 != null) {
            final ActionMenuPresenter v0 = c0.V0;
            if (v0 != null) {
                v0.i();
            }
        }
    }
    
    @Override
    public final void n() {
    }
    
    @Override
    public final void o() {
        final b c = this.c;
        if (c != null) {
            final ViewParent parent = ((View)c).getParent();
            final Toolbar a = this.a;
            if (parent == a) {
                a.removeView((View)this.c);
            }
        }
        this.c = null;
    }
    
    @Override
    public final void p(final int n) {
        Drawable g;
        if (n != 0) {
            g = qli.g(this.getContext(), n);
        }
        else {
            g = null;
        }
        this.f = g;
        this.v();
    }
    
    @Override
    public final int q() {
        return this.b;
    }
    
    @Override
    public final void r() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }
    
    public final void s(final CharSequence charSequence) {
        this.i = charSequence;
        if ((this.b & 0x8) != 0x0) {
            this.a.setTitle(charSequence);
            if (this.h) {
                p5x.B(((View)this.a).getRootView(), charSequence);
            }
        }
    }
    
    @Override
    public final void setIcon(final int n) {
        Drawable g;
        if (n != 0) {
            g = qli.g(this.getContext(), n);
        }
        else {
            g = null;
        }
        this.setIcon(g);
    }
    
    @Override
    public final void setIcon(final Drawable e) {
        this.e = e;
        this.v();
    }
    
    @Override
    public final void setVisibility(final int visibility) {
        ((View)this.a).setVisibility(visibility);
    }
    
    @Override
    public final void setWindowCallback(final Window$Callback l) {
        this.l = l;
    }
    
    @Override
    public final void setWindowTitle(final CharSequence charSequence) {
        if (!this.h) {
            this.s(charSequence);
        }
    }
    
    public final void t() {
        if ((this.b & 0x4) != 0x0) {
            if (TextUtils.isEmpty(this.k)) {
                this.a.setNavigationContentDescription(this.o);
            }
            else {
                this.a.setNavigationContentDescription(this.k);
            }
        }
    }
    
    public final void u() {
        if ((this.b & 0x4) != 0x0) {
            final Toolbar a = this.a;
            Drawable navigationIcon = this.g;
            if (navigationIcon == null) {
                navigationIcon = this.p;
            }
            a.setNavigationIcon(navigationIcon);
        }
        else {
            this.a.setNavigationIcon(null);
        }
    }
    
    public final void v() {
        final int b = this.b;
        Drawable logo;
        if ((b & 0x2) != 0x0) {
            if ((b & 0x1) != 0x0) {
                logo = this.f;
                if (logo == null) {
                    logo = this.e;
                }
            }
            else {
                logo = this.e;
            }
        }
        else {
            logo = null;
        }
        this.a.setLogo(logo);
    }
}
