// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.view.menu;

import android.widget.AdapterView$OnItemClickListener;
import android.widget.TextView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.graphics.Rect;
import java.util.Objects;
import android.widget.ListAdapter;
import android.view.KeyEvent;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.widget.ListView;
import java.util.WeakHashMap;
import android.view.Gravity;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewTreeObserver;
import android.view.View;
import android.content.Context;
import android.view.View$OnKeyListener;
import android.widget.PopupWindow$OnDismissListener;

public final class k extends g5h implements PopupWindow$OnDismissListener, View$OnKeyListener
{
    public final Context E0;
    public final e F0;
    public final d G0;
    public final boolean H0;
    public final int I0;
    public final int J0;
    public final int K0;
    public final h5h L0;
    public final k$a M0;
    public final k$b N0;
    public PopupWindow$OnDismissListener O0;
    public View P0;
    public View Q0;
    public i$a R0;
    public ViewTreeObserver S0;
    public boolean T0;
    public boolean U0;
    public int V0;
    public int W0;
    public boolean X0;
    
    public k(final Context e0, final e f0, final View p6, final int j0, final int k0, final boolean h0) {
        this.M0 = new k$a(this);
        this.N0 = new k$b(this);
        this.W0 = 0;
        this.E0 = e0;
        this.F0 = f0;
        this.H0 = h0;
        this.G0 = new d(f0, LayoutInflater.from(e0), h0, 2131623955);
        this.J0 = j0;
        this.K0 = k0;
        final Resources resources = e0.getResources();
        this.I0 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.P0 = p6;
        this.L0 = new h5h(e0, j0, k0);
        f0.c((i)this, e0);
    }
    
    public final void a(final e e, final boolean b) {
        if (e != this.F0) {
            return;
        }
        this.dismiss();
        final i$a r0 = this.R0;
        if (r0 != null) {
            r0.a(e, b);
        }
    }
    
    public final void b(final i$a r0) {
        this.R0 = r0;
    }
    
    public final void d() {
        this.U0 = false;
        final d g0 = this.G0;
        if (g0 != null) {
            g0.notifyDataSetChanged();
        }
    }
    
    public final void dismiss() {
        if (this.isShowing()) {
            ((blf)this.L0).dismiss();
        }
    }
    
    public final boolean e(final l l) {
        if (l.hasVisibleItems()) {
            final h h = new h(this.E0, (e)l, this.Q0, this.H0, this.J0, this.K0);
            h.d(this.R0);
            final boolean s = g5h.s((e)l);
            h.h = s;
            final g5h j = h.j;
            if (j != null) {
                j.m(s);
            }
            h.k = this.O0;
            this.O0 = null;
            this.F0.d(false);
            final h5h l2 = this.L0;
            final int i0 = ((blf)l2).I0;
            int j2;
            if (!((blf)l2).L0) {
                j2 = 0;
            }
            else {
                j2 = ((blf)l2).J0;
            }
            final int w0 = this.W0;
            final View p = this.P0;
            final WeakHashMap a = j6x.a;
            int n = i0;
            if ((Gravity.getAbsoluteGravity(w0, j6x$e.d(p)) & 0x7) == 0x5) {
                n = i0 + this.P0.getWidth();
            }
            boolean b = false;
            Label_0218: {
                if (!h.b()) {
                    if (h.f == null) {
                        b = false;
                        break Label_0218;
                    }
                    h.f(n, j2, true, true);
                }
                b = true;
            }
            if (b) {
                final i$a r0 = this.R0;
                if (r0 != null) {
                    r0.b((e)l);
                }
                return true;
            }
        }
        return false;
    }
    
    public final boolean g() {
        return false;
    }
    
    public final void i(final e e) {
    }
    
    public final boolean isShowing() {
        return !this.T0 && ((blf)this.L0).isShowing();
    }
    
    public final void k(final View p) {
        this.P0 = p;
    }
    
    public final ListView l() {
        return (ListView)((blf)this.L0).F0;
    }
    
    public final void m(final boolean f0) {
        this.G0.F0 = f0;
    }
    
    public final void n(final int w0) {
        this.W0 = w0;
    }
    
    public final void o(final int i0) {
        ((blf)this.L0).I0 = i0;
    }
    
    public final void onDismiss() {
        this.T0 = true;
        this.F0.d(true);
        final ViewTreeObserver s0 = this.S0;
        if (s0 != null) {
            if (!s0.isAlive()) {
                this.S0 = this.Q0.getViewTreeObserver();
            }
            this.S0.removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this.M0);
            this.S0 = null;
        }
        this.Q0.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this.N0);
        final PopupWindow$OnDismissListener o0 = this.O0;
        if (o0 != null) {
            o0.onDismiss();
        }
    }
    
    public final boolean onKey(final View view, final int n, final KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && n == 82) {
            this.dismiss();
            return true;
        }
        return false;
    }
    
    public final void p(final PopupWindow$OnDismissListener o0) {
        this.O0 = o0;
    }
    
    public final void q(final boolean x0) {
        this.X0 = x0;
    }
    
    public final void r(final int n) {
        ((blf)this.L0).g(n);
    }
    
    public final void show() {
        final boolean showing = this.isShowing();
        final boolean b = false;
        int n = 0;
        Label_0368: {
            if (!showing) {
                n = (b ? 1 : 0);
                if (this.T0) {
                    break Label_0368;
                }
                final View p0 = this.P0;
                if (p0 == null) {
                    n = (b ? 1 : 0);
                    break Label_0368;
                }
                this.Q0 = p0;
                ((blf)this.L0).r((PopupWindow$OnDismissListener)this);
                final h5h l0 = this.L0;
                ((blf)l0).S0 = (AdapterView$OnItemClickListener)this;
                ((blf)l0).q();
                final View q0 = this.Q0;
                final boolean b2 = this.S0 == null;
                final ViewTreeObserver viewTreeObserver = q0.getViewTreeObserver();
                this.S0 = viewTreeObserver;
                if (b2) {
                    viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this.M0);
                }
                q0.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)this.N0);
                final h5h l2 = this.L0;
                ((blf)l2).R0 = q0;
                ((blf)l2).O0 = this.W0;
                if (!this.U0) {
                    this.V0 = g5h.j((ListAdapter)this.G0, this.E0, this.I0);
                    this.U0 = true;
                }
                ((blf)this.L0).o(this.V0);
                ((blf)this.L0).p();
                final h5h l3 = this.L0;
                final Rect d0 = super.D0;
                Objects.requireNonNull(l3);
                Rect z0;
                if (d0 != null) {
                    z0 = new Rect(d0);
                }
                else {
                    z0 = null;
                }
                ((blf)l3).Z0 = z0;
                ((blf)this.L0).show();
                final vi9 f0 = ((blf)this.L0).F0;
                ((View)f0).setOnKeyListener((View$OnKeyListener)this);
                if (this.X0 && this.F0.m != null) {
                    final FrameLayout frameLayout = (FrameLayout)LayoutInflater.from(this.E0).inflate(2131623954, (ViewGroup)f0, false);
                    final TextView textView = (TextView)((View)frameLayout).findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.F0.m);
                    }
                    ((View)frameLayout).setEnabled(false);
                    ((ListView)f0).addHeaderView((View)frameLayout, (Object)null, false);
                }
                ((blf)this.L0).setAdapter((ListAdapter)this.G0);
                ((blf)this.L0).show();
            }
            n = 1;
        }
        if (n != 0) {
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }
}
