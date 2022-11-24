import android.widget.AdapterView;
import android.widget.AbsListView;
import android.widget.Adapter;
import java.util.WeakHashMap;
import android.view.View$OnTouchListener;
import android.view.View$MeasureSpec;
import android.view.ViewGroup;
import android.widget.AbsListView$OnScrollListener;
import android.widget.AdapterView$OnItemSelectedListener;
import android.database.DataSetObserver;
import android.widget.PopupWindow$OnDismissListener;
import android.widget.ListView;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.PopupWindow;
import android.os.Build$VERSION;
import android.graphics.Rect;
import android.os.Handler;
import android.widget.AdapterView$OnItemClickListener;
import android.view.View;
import android.widget.ListAdapter;
import android.content.Context;
import java.lang.reflect.Method;

// 
// Decompiled by Procyon v0.6.0
// 

public class ylf implements k6q
{
    public static Method e1;
    public static Method f1;
    public static Method g1;
    public Context F0;
    public ListAdapter G0;
    public xj9 H0;
    public int I0;
    public int J0;
    public int K0;
    public int L0;
    public int M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public int Q0;
    public int R0;
    public ylf.ylf$d S0;
    public View T0;
    public AdapterView$OnItemClickListener U0;
    public final ylf.ylf$g V0;
    public final ylf.ylf$f W0;
    public final ylf.ylf$e X0;
    public final ylf.ylf$c Y0;
    public final Handler Z0;
    public final Rect a1;
    public Rect b1;
    public boolean c1;
    public jk0 d1;
    
    static {
        if (Build$VERSION.SDK_INT <= 28) {
            try {
                ylf.e1 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            }
            catch (final NoSuchMethodException ex) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                ylf.g1 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            }
            catch (final NoSuchMethodException ex2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build$VERSION.SDK_INT <= 23) {
            try {
                ylf.f1 = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            }
            catch (final NoSuchMethodException ex3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }
    
    public ylf(final Context f0, final AttributeSet set, final int n, final int n2) {
        this.I0 = -2;
        this.J0 = -2;
        this.M0 = 1002;
        this.Q0 = 0;
        this.R0 = Integer.MAX_VALUE;
        this.V0 = new ylf.ylf$g(this);
        this.W0 = new ylf.ylf$f(this);
        this.X0 = new ylf.ylf$e(this);
        this.Y0 = new ylf.ylf$c(this);
        this.a1 = new Rect();
        this.F0 = f0;
        this.Z0 = new Handler(f0.getMainLooper());
        final TypedArray obtainStyledAttributes = f0.obtainStyledAttributes(set, fr0.V0, n, n2);
        this.K0 = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        final int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.L0 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.N0 = true;
        }
        obtainStyledAttributes.recycle();
        (this.d1 = new jk0(f0, set, n, n2)).setInputMethodMode(1);
    }
    
    public final int a() {
        return this.K0;
    }
    
    public final void c(final int k0) {
        this.K0 = k0;
    }
    
    public final void dismiss() {
        this.d1.dismiss();
        this.d1.setContentView((View)null);
        this.H0 = null;
        this.Z0.removeCallbacks((Runnable)this.V0);
    }
    
    public final Drawable e() {
        return this.d1.getBackground();
    }
    
    public final void g(final int l0) {
        this.L0 = l0;
        this.N0 = true;
    }
    
    public final boolean isShowing() {
        return this.d1.isShowing();
    }
    
    public final int j() {
        if (!this.N0) {
            return 0;
        }
        return this.L0;
    }
    
    public final ListView l() {
        return (ListView)this.H0;
    }
    
    public final void m(final Drawable backgroundDrawable) {
        this.d1.setBackgroundDrawable(backgroundDrawable);
    }
    
    public xj9 n(final Context context, final boolean b) {
        return new xj9(context, b);
    }
    
    public final void o(final int j0) {
        final Drawable background = this.d1.getBackground();
        if (background != null) {
            background.getPadding(this.a1);
            final Rect a1 = this.a1;
            this.J0 = a1.left + a1.right + j0;
        }
        else {
            this.J0 = j0;
        }
    }
    
    public final void p() {
        this.d1.setInputMethodMode(2);
    }
    
    public final void q() {
        this.c1 = true;
        this.d1.setFocusable(true);
    }
    
    public final void r(final PopupWindow$OnDismissListener onDismissListener) {
        this.d1.setOnDismissListener(onDismissListener);
    }
    
    public void setAdapter(final ListAdapter g0) {
        final ylf.ylf$d s0 = this.S0;
        if (s0 == null) {
            this.S0 = new ylf.ylf$d(this);
        }
        else {
            final ListAdapter g2 = this.G0;
            if (g2 != null) {
                ((Adapter)g2).unregisterDataSetObserver((DataSetObserver)s0);
            }
        }
        if ((this.G0 = g0) != null) {
            ((Adapter)g0).registerDataSetObserver((DataSetObserver)this.S0);
        }
        final xj9 h0 = this.H0;
        if (h0 != null) {
            ((AbsListView)h0).setAdapter(this.G0);
        }
    }
    
    public final void show() {
        if (this.H0 == null) {
            ((AbsListView)(this.H0 = this.n(this.F0, this.c1 ^ true))).setAdapter(this.G0);
            ((AdapterView)this.H0).setOnItemClickListener(this.U0);
            ((View)this.H0).setFocusable(true);
            ((View)this.H0).setFocusableInTouchMode(true);
            ((AdapterView)this.H0).setOnItemSelectedListener((AdapterView$OnItemSelectedListener)new xlf(this));
            ((AbsListView)this.H0).setOnScrollListener((AbsListView$OnScrollListener)this.X0);
            this.d1.setContentView((View)this.H0);
        }
        else {
            final ViewGroup viewGroup = (ViewGroup)this.d1.getContentView();
        }
        final Drawable background = this.d1.getBackground();
        final int n = 0;
        int n3;
        if (background != null) {
            background.getPadding(this.a1);
            final Rect a1 = this.a1;
            final int top = a1.top;
            final int n2 = n3 = a1.bottom + top;
            if (!this.N0) {
                this.L0 = -top;
                n3 = n2;
            }
        }
        else {
            this.a1.setEmpty();
            n3 = 0;
        }
        final boolean b = this.d1.getInputMethodMode() == 2;
        final View t0 = this.T0;
        final int l0 = this.L0;
        int n4 = 0;
        Label_0327: {
            if (Build$VERSION.SDK_INT <= 23) {
                final Method f1 = ylf.f1;
                if (f1 != null) {
                    try {
                        n4 = (int)f1.invoke(this.d1, t0, l0, b);
                        break Label_0327;
                    }
                    catch (final Exception ex) {
                        Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                    }
                }
                n4 = this.d1.getMaxAvailableHeight(t0, l0);
            }
            else {
                n4 = ylf.ylf$a.a((PopupWindow)this.d1, t0, l0, b);
            }
        }
        int height;
        if (this.I0 == -1) {
            height = n4 + n3;
        }
        else {
            final int j0 = this.J0;
            int n5;
            if (j0 != -2) {
                if (j0 != -1) {
                    n5 = View$MeasureSpec.makeMeasureSpec(j0, 1073741824);
                }
                else {
                    final int widthPixels = this.F0.getResources().getDisplayMetrics().widthPixels;
                    final Rect a2 = this.a1;
                    n5 = View$MeasureSpec.makeMeasureSpec(widthPixels - (a2.left + a2.right), 1073741824);
                }
            }
            else {
                final int widthPixels2 = this.F0.getResources().getDisplayMetrics().widthPixels;
                final Rect a3 = this.a1;
                n5 = View$MeasureSpec.makeMeasureSpec(widthPixels2 - (a3.left + a3.right), Integer.MIN_VALUE);
            }
            final int a4 = this.H0.a(n5, n4 + 0);
            int n6;
            if (a4 > 0) {
                n6 = ((View)this.H0).getPaddingBottom() + ((View)this.H0).getPaddingTop() + n3 + 0;
            }
            else {
                n6 = 0;
            }
            height = a4 + n6;
        }
        final boolean b2 = this.d1.getInputMethodMode() == 2;
        hsk.b((PopupWindow)this.d1, this.M0);
        if (this.d1.isShowing()) {
            final View t2 = this.T0;
            final WeakHashMap a5 = b7x.a;
            if (!b7x$g.b(t2)) {
                return;
            }
            final int j2 = this.J0;
            int width;
            if (j2 == -1) {
                width = -1;
            }
            else if ((width = j2) == -2) {
                width = this.T0.getWidth();
            }
            final int i0 = this.I0;
            if (i0 == -1) {
                if (!b2) {
                    height = -1;
                }
                if (b2) {
                    final jk0 d1 = this.d1;
                    int width2;
                    if (this.J0 == -1) {
                        width2 = -1;
                    }
                    else {
                        width2 = 0;
                    }
                    d1.setWidth(width2);
                    this.d1.setHeight(0);
                }
                else {
                    final jk0 d2 = this.d1;
                    int width3 = n;
                    if (this.J0 == -1) {
                        width3 = -1;
                    }
                    d2.setWidth(width3);
                    this.d1.setHeight(-1);
                }
            }
            else if (i0 != -2) {
                height = i0;
            }
            this.d1.setOutsideTouchable(true);
            final jk0 d3 = this.d1;
            final View t3 = this.T0;
            final int k0 = this.K0;
            final int l2 = this.L0;
            if (width < 0) {
                width = -1;
            }
            if (height < 0) {
                height = -1;
            }
            d3.update(t3, k0, l2, width, height);
        }
        else {
            final int j3 = this.J0;
            int width4;
            if (j3 == -1) {
                width4 = -1;
            }
            else if ((width4 = j3) == -2) {
                width4 = this.T0.getWidth();
            }
            final int i2 = this.I0;
            if (i2 == -1) {
                height = -1;
            }
            else if (i2 != -2) {
                height = i2;
            }
            this.d1.setWidth(width4);
            this.d1.setHeight(height);
            if (Build$VERSION.SDK_INT <= 28) {
                final Method e1 = ylf.e1;
                if (e1 != null) {
                    try {
                        e1.invoke(this.d1, Boolean.TRUE);
                    }
                    catch (final Exception ex2) {
                        Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                    }
                }
            }
            else {
                ylf.ylf$b.b((PopupWindow)this.d1, true);
            }
            this.d1.setOutsideTouchable(true);
            this.d1.setTouchInterceptor((View$OnTouchListener)this.W0);
            if (this.P0) {
                hsk.a((PopupWindow)this.d1, this.O0);
            }
            if (Build$VERSION.SDK_INT <= 28) {
                final Method g1 = ylf.g1;
                if (g1 != null) {
                    try {
                        g1.invoke(this.d1, this.b1);
                    }
                    catch (final Exception ex3) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", (Throwable)ex3);
                    }
                }
            }
            else {
                ylf.ylf$b.a((PopupWindow)this.d1, this.b1);
            }
            hsk$a.a((PopupWindow)this.d1, this.T0, this.K0, this.L0, this.Q0);
            ((AdapterView)this.H0).setSelection(-1);
            if (!this.c1 || this.H0.isInTouchMode()) {
                final xj9 h0 = this.H0;
                if (h0 != null) {
                    h0.setListSelectionHidden(true);
                    ((View)h0).requestLayout();
                }
            }
            if (!this.c1) {
                this.Z0.post((Runnable)this.Y0);
            }
        }
    }
}
