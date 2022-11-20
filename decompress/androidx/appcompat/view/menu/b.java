// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.view.menu;

import android.widget.AdapterView;
import android.view.MenuItem;
import android.widget.AdapterView$OnItemClickListener;
import java.lang.reflect.Method;
import android.widget.TextView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.graphics.Rect;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.KeyEvent;
import android.widget.ListView;
import android.view.Gravity;
import android.widget.ListAdapter;
import java.util.Iterator;
import android.widget.HeaderViewListAdapter;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.transition.Transition;
import android.widget.PopupWindow;
import android.os.Build$VERSION;
import java.util.Objects;
import android.content.res.Resources;
import java.util.WeakHashMap;
import java.util.ArrayList;
import android.view.ViewTreeObserver;
import android.view.View;
import java.util.List;
import android.os.Handler;
import android.content.Context;
import android.widget.PopupWindow$OnDismissListener;
import android.view.View$OnKeyListener;

public final class b extends g5h implements View$OnKeyListener, PopupWindow$OnDismissListener
{
    public final Context E0;
    public final int F0;
    public final int G0;
    public final int H0;
    public final boolean I0;
    public final Handler J0;
    public final List<e> K0;
    public final List<b.b$d> L0;
    public final b$a M0;
    public final b$b N0;
    public final b$c O0;
    public int P0;
    public int Q0;
    public View R0;
    public View S0;
    public int T0;
    public boolean U0;
    public boolean V0;
    public int W0;
    public int X0;
    public boolean Y0;
    public boolean Z0;
    public i$a a1;
    public ViewTreeObserver b1;
    public PopupWindow$OnDismissListener c1;
    public boolean d1;
    
    public b(final Context e0, final View r0, int n, final int h0, final boolean i0) {
        this.K0 = new ArrayList();
        this.L0 = new ArrayList();
        this.M0 = new b$a(this);
        this.N0 = new b$b(this);
        this.O0 = new b$c(this);
        final int n2 = 0;
        this.P0 = 0;
        this.Q0 = 0;
        this.E0 = e0;
        this.R0 = r0;
        this.G0 = n;
        this.H0 = h0;
        this.I0 = i0;
        this.Y0 = false;
        final WeakHashMap a = j6x.a;
        if (j6x$e.d(r0) == 1) {
            n = n2;
        }
        else {
            n = 1;
        }
        this.T0 = n;
        final Resources resources = e0.getResources();
        this.F0 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.J0 = new Handler();
    }
    
    public final void a(final e e, final boolean b) {
        final int size = this.L0.size();
        int i = 0;
        while (true) {
            while (i < size) {
                if (e == ((b.b$d)this.L0.get(i)).b) {
                    if (i < 0) {
                        return;
                    }
                    final int n = i + 1;
                    if (n < this.L0.size()) {
                        ((b.b$d)this.L0.get(n)).b.d(false);
                    }
                    final b.b$d b$d = this.L0.remove(i);
                    b$d.b.v((i)this);
                    if (this.d1) {
                        final h5h a = b$d.a;
                        Objects.requireNonNull(a);
                        if (Build$VERSION.SDK_INT >= 23) {
                            h5h.a.b(((blf)a).b1, null);
                        }
                        ((blf)b$d.a).b1.setAnimationStyle(0);
                    }
                    ((blf)b$d.a).dismiss();
                    final int size2 = this.L0.size();
                    if (size2 > 0) {
                        this.T0 = ((b.b$d)this.L0.get(size2 - 1)).c;
                    }
                    else {
                        final View r0 = this.R0;
                        final WeakHashMap a2 = j6x.a;
                        this.T0 = ((j6x$e.d(r0) != 1) ? 1 : 0);
                    }
                    if (size2 == 0) {
                        this.dismiss();
                        final i$a a3 = this.a1;
                        if (a3 != null) {
                            a3.a(e, true);
                        }
                        final ViewTreeObserver b2 = this.b1;
                        if (b2 != null) {
                            if (b2.isAlive()) {
                                this.b1.removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this.M0);
                            }
                            this.b1 = null;
                        }
                        this.S0.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this.N0);
                        this.c1.onDismiss();
                    }
                    else if (b) {
                        this.L0.get(0).b.d(false);
                    }
                    return;
                }
                else {
                    ++i;
                }
            }
            i = -1;
            continue;
        }
    }
    
    public final void b(final i$a a1) {
        this.a1 = a1;
    }
    
    public final void d() {
        final Iterator iterator = this.L0.iterator();
        while (iterator.hasNext()) {
            final ListAdapter adapter = ((ListView)((blf)((b.b$d)iterator.next()).a).F0).getAdapter();
            d d;
            if (adapter instanceof HeaderViewListAdapter) {
                d = (d)((HeaderViewListAdapter)adapter).getWrappedAdapter();
            }
            else {
                d = (d)adapter;
            }
            d.notifyDataSetChanged();
        }
    }
    
    public final void dismiss() {
        int size = this.L0.size();
        if (size > 0) {
            final b.b$d[] array = this.L0.toArray(new b.b$d[size]);
            while (true) {
                final int n = size - 1;
                if (n < 0) {
                    break;
                }
                final b.b$d b$d = array[n];
                size = n;
                if (!((blf)b$d.a).isShowing()) {
                    continue;
                }
                ((blf)b$d.a).dismiss();
                size = n;
            }
        }
    }
    
    public final boolean e(final l l) {
        for (final b.b$d b$d : this.L0) {
            if (l == b$d.b) {
                ((View)((blf)b$d.a).F0).requestFocus();
                return true;
            }
        }
        if (l.hasVisibleItems()) {
            this.i(l);
            final i$a a1 = this.a1;
            if (a1 != null) {
                a1.b((e)l);
            }
            return true;
        }
        return false;
    }
    
    public final boolean g() {
        return false;
    }
    
    public final void i(final e e) {
        e.c((i)this, this.E0);
        if (this.isShowing()) {
            this.t(e);
        }
        else {
            this.K0.add(e);
        }
    }
    
    public final boolean isShowing() {
        final int size = this.L0.size();
        boolean b = false;
        if (size > 0) {
            b = b;
            if (((blf)this.L0.get(0).a).isShowing()) {
                b = true;
            }
        }
        return b;
    }
    
    public final void k(final View r0) {
        if (this.R0 != r0) {
            this.R0 = r0;
            final int p = this.P0;
            final WeakHashMap a = j6x.a;
            this.Q0 = Gravity.getAbsoluteGravity(p, j6x$e.d(r0));
        }
    }
    
    public final ListView l() {
        Object f0;
        if (this.L0.isEmpty()) {
            f0 = null;
        }
        else {
            final ArrayList l0 = this.L0;
            f0 = ((blf)((b.b$d)l0.get(l0.size() - 1)).a).F0;
        }
        return (ListView)f0;
    }
    
    public final void m(final boolean y0) {
        this.Y0 = y0;
    }
    
    public final void n(final int p) {
        if (this.P0 != p) {
            this.P0 = p;
            final View r0 = this.R0;
            final WeakHashMap a = j6x.a;
            this.Q0 = Gravity.getAbsoluteGravity(p, j6x$e.d(r0));
        }
    }
    
    public final void o(final int w0) {
        this.U0 = true;
        this.W0 = w0;
    }
    
    public final void onDismiss() {
        while (true) {
            for (int size = this.L0.size(), i = 0; i < size; ++i) {
                final b.b$d b$d = this.L0.get(i);
                if (!((blf)b$d.a).isShowing()) {
                    if (b$d != null) {
                        b$d.b.d(false);
                    }
                    return;
                }
            }
            final b.b$d b$d = null;
            continue;
        }
    }
    
    public final boolean onKey(final View view, final int n, final KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && n == 82) {
            this.dismiss();
            return true;
        }
        return false;
    }
    
    public final void p(final PopupWindow$OnDismissListener c1) {
        this.c1 = c1;
    }
    
    public final void q(final boolean z0) {
        this.Z0 = z0;
    }
    
    public final void r(final int x0) {
        this.V0 = true;
        this.X0 = x0;
    }
    
    public final void show() {
        if (this.isShowing()) {
            return;
        }
        final Iterator iterator = this.K0.iterator();
        while (iterator.hasNext()) {
            this.t((e)iterator.next());
        }
        this.K0.clear();
        final View r0 = this.R0;
        if ((this.S0 = r0) != null) {
            final boolean b = this.b1 == null;
            final ViewTreeObserver viewTreeObserver = r0.getViewTreeObserver();
            this.b1 = viewTreeObserver;
            if (b) {
                viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this.M0);
            }
            this.S0.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)this.N0);
        }
    }
    
    public final void t(final e e) {
        final LayoutInflater from = LayoutInflater.from(this.E0);
        final d adapter = new d(e, from, this.I0, 2131623947);
        if (!this.isShowing() && this.Y0) {
            adapter.F0 = true;
        }
        else if (this.isShowing()) {
            adapter.F0 = g5h.s(e);
        }
        int n = g5h.j((ListAdapter)adapter, this.E0, this.F0);
        final h5h h5h = new h5h(this.E0, this.G0, this.H0);
        h5h.f1 = (a5h)this.O0;
        ((blf)h5h).r((PopupWindow$OnDismissListener)(((blf)h5h).S0 = (AdapterView$OnItemClickListener)this));
        ((blf)h5h).R0 = this.R0;
        ((blf)h5h).O0 = this.Q0;
        ((blf)h5h).q();
        ((blf)h5h).p();
        ((blf)h5h).setAdapter((ListAdapter)adapter);
        ((blf)h5h).o(n);
        ((blf)h5h).O0 = this.Q0;
        b.b$d b$d2 = null;
        View r0 = null;
        Label_0449: {
            Label_0446: {
                if (this.L0.size() > 0) {
                    final ArrayList l0 = this.L0;
                    final b.b$d b$d = l0.get(l0.size() - 1);
                    final e b = b$d.b;
                    final int size = b.size();
                    int i = 0;
                    while (true) {
                        while (i < size) {
                            final Object item = b.getItem(i);
                            if (((MenuItem)item).hasSubMenu() && e == ((MenuItem)item).getSubMenu()) {
                                if (item == null) {
                                    b$d2 = b$d;
                                    break Label_0446;
                                }
                                final vi9 f0 = ((blf)b$d.a).F0;
                                final ListAdapter adapter2 = ((ListView)f0).getAdapter();
                                int headersCount;
                                d d;
                                if (adapter2 instanceof HeaderViewListAdapter) {
                                    final HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter)adapter2;
                                    headersCount = headerViewListAdapter.getHeadersCount();
                                    d = (d)headerViewListAdapter.getWrappedAdapter();
                                }
                                else {
                                    d = (d)adapter2;
                                    headersCount = 0;
                                }
                                final int count = d.getCount();
                                int j = 0;
                                while (true) {
                                    while (j < count) {
                                        if (item == d.d(j)) {
                                            if (j == -1) {
                                                b$d2 = b$d;
                                                break Label_0446;
                                            }
                                            final int n2 = j + headersCount - ((AdapterView)f0).getFirstVisiblePosition();
                                            b$d2 = b$d;
                                            if (n2 < 0) {
                                                break Label_0446;
                                            }
                                            if (n2 >= ((ViewGroup)f0).getChildCount()) {
                                                b$d2 = b$d;
                                                break Label_0446;
                                            }
                                            final View child = ((ViewGroup)f0).getChildAt(n2);
                                            b$d2 = b$d;
                                            r0 = child;
                                            break Label_0449;
                                        }
                                        else {
                                            ++j;
                                        }
                                    }
                                    j = -1;
                                    continue;
                                }
                            }
                            else {
                                ++i;
                            }
                        }
                        final Object item = null;
                        continue;
                    }
                }
                b$d2 = null;
            }
            r0 = null;
        }
        if (r0 != null) {
            if (Build$VERSION.SDK_INT <= 28) {
                final Method g1 = h5h.g1;
                if (g1 != null) {
                    try {
                        g1.invoke(((blf)h5h).b1, Boolean.FALSE);
                    }
                    catch (final Exception ex) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            }
            else {
                h5h.b.a(((blf)h5h).b1, false);
            }
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 23) {
                h5h.a.a(((blf)h5h).b1, null);
            }
            final ArrayList l2 = this.L0;
            final vi9 f2 = ((blf)l2.get(l2.size() - 1).a).F0;
            final int[] array = new int[2];
            ((View)f2).getLocationOnScreen(array);
            final Rect rect = new Rect();
            this.S0.getWindowVisibleDisplayFrame(rect);
            int t0 = 0;
            Label_0651: {
                Label_0649: {
                    if (this.T0 == 1) {
                        if (((View)f2).getWidth() + array[0] + n > rect.right) {
                            break Label_0649;
                        }
                    }
                    else if (array[0] - n >= 0) {
                        break Label_0649;
                    }
                    t0 = 1;
                    break Label_0651;
                }
                t0 = 0;
            }
            final boolean b2 = t0 == 1;
            this.T0 = t0;
            int n3;
            int n4;
            if (sdk_INT >= 26) {
                ((blf)h5h).R0 = r0;
                n3 = 0;
                n4 = 0;
            }
            else {
                final int[] array2 = new int[2];
                this.R0.getLocationOnScreen(array2);
                final int[] array3 = new int[2];
                r0.getLocationOnScreen(array3);
                if ((this.Q0 & 0x7) == 0x5) {
                    array2[0] += this.R0.getWidth();
                    array3[0] += r0.getWidth();
                }
                n4 = array3[0] - array2[0];
                n3 = array3[1] - array2[1];
            }
            int i2 = 0;
            Label_0837: {
                if ((this.Q0 & 0x5) == 0x5) {
                    if (b2) {
                        i2 = n4 + n;
                        break Label_0837;
                    }
                    n = r0.getWidth();
                }
                else if (b2) {
                    i2 = n4 + r0.getWidth();
                    break Label_0837;
                }
                i2 = n4 - n;
            }
            ((blf)h5h).I0 = i2;
            ((blf)h5h).N0 = true;
            ((blf)h5h).M0 = true;
            ((blf)h5h).g(n3);
        }
        else {
            if (this.U0) {
                ((blf)h5h).I0 = this.W0;
            }
            if (this.V0) {
                ((blf)h5h).g(this.X0);
            }
            final Rect d2 = super.D0;
            Rect z0;
            if (d2 != null) {
                z0 = new Rect(d2);
            }
            else {
                z0 = null;
            }
            ((blf)h5h).Z0 = z0;
        }
        this.L0.add(new b.b$d(h5h, e, this.T0));
        ((blf)h5h).show();
        final vi9 f3 = ((blf)h5h).F0;
        ((View)f3).setOnKeyListener((View$OnKeyListener)this);
        if (b$d2 == null && this.Z0 && e.m != null) {
            final FrameLayout frameLayout = (FrameLayout)from.inflate(2131623954, (ViewGroup)f3, false);
            final TextView textView = (TextView)((View)frameLayout).findViewById(16908310);
            ((View)frameLayout).setEnabled(false);
            textView.setText(e.m);
            ((ListView)f3).addHeaderView((View)frameLayout, (Object)null, false);
            ((blf)h5h).show();
        }
    }
}
