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

public class blf implements o5q
{
    public static Method c1;
    public static Method d1;
    public static Method e1;
    public Context D0;
    public ListAdapter E0;
    public vi9 F0;
    public int G0;
    public int H0;
    public int I0;
    public int J0;
    public int K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public int O0;
    public int P0;
    public blf.blf$d Q0;
    public View R0;
    public AdapterView$OnItemClickListener S0;
    public final blf.blf$g T0;
    public final blf.blf$f U0;
    public final blf.blf$e V0;
    public final blf.blf$c W0;
    public final Handler X0;
    public final Rect Y0;
    public Rect Z0;
    public boolean a1;
    public ik0 b1;
    
    static {
        if (Build$VERSION.SDK_INT <= 28) {
            try {
                blf.c1 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            }
            catch (final NoSuchMethodException ex) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                blf.e1 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            }
            catch (final NoSuchMethodException ex2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build$VERSION.SDK_INT <= 23) {
            try {
                blf.d1 = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            }
            catch (final NoSuchMethodException ex3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }
    
    public blf(final Context d0, final AttributeSet set, final int n, final int n2) {
        this.G0 = -2;
        this.H0 = -2;
        this.K0 = 1002;
        this.O0 = 0;
        this.P0 = Integer.MAX_VALUE;
        this.T0 = new blf.blf$g(this);
        this.U0 = new blf.blf$f(this);
        this.V0 = new blf.blf$e(this);
        this.W0 = new blf.blf$c(this);
        this.Y0 = new Rect();
        this.D0 = d0;
        this.X0 = new Handler(d0.getMainLooper());
        final TypedArray obtainStyledAttributes = d0.obtainStyledAttributes(set, jee.W0, n, n2);
        this.I0 = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        final int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.J0 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.L0 = true;
        }
        obtainStyledAttributes.recycle();
        (this.b1 = new ik0(d0, set, n, n2)).setInputMethodMode(1);
    }
    
    public final int a() {
        return this.I0;
    }
    
    public final void c(final int i0) {
        this.I0 = i0;
    }
    
    @Override
    public final void dismiss() {
        this.b1.dismiss();
        this.b1.setContentView((View)null);
        this.F0 = null;
        this.X0.removeCallbacks((Runnable)this.T0);
    }
    
    public final Drawable e() {
        return this.b1.getBackground();
    }
    
    public final void g(final int j0) {
        this.J0 = j0;
        this.L0 = true;
    }
    
    @Override
    public final boolean isShowing() {
        return this.b1.isShowing();
    }
    
    public final int j() {
        if (!this.L0) {
            return 0;
        }
        return this.J0;
    }
    
    @Override
    public final ListView l() {
        return (ListView)this.F0;
    }
    
    public final void m(final Drawable backgroundDrawable) {
        this.b1.setBackgroundDrawable(backgroundDrawable);
    }
    
    public vi9 n(final Context context, final boolean b) {
        return new vi9(context, b);
    }
    
    public final void o(final int h0) {
        final Drawable background = this.b1.getBackground();
        if (background != null) {
            background.getPadding(this.Y0);
            final Rect y0 = this.Y0;
            this.H0 = y0.left + y0.right + h0;
        }
        else {
            this.H0 = h0;
        }
    }
    
    public final void p() {
        this.b1.setInputMethodMode(2);
    }
    
    public final void q() {
        this.a1 = true;
        this.b1.setFocusable(true);
    }
    
    public final void r(final PopupWindow$OnDismissListener onDismissListener) {
        this.b1.setOnDismissListener(onDismissListener);
    }
    
    public void setAdapter(final ListAdapter e0) {
        final blf.blf$d q0 = this.Q0;
        if (q0 == null) {
            this.Q0 = new blf.blf$d(this);
        }
        else {
            final ListAdapter e2 = this.E0;
            if (e2 != null) {
                ((Adapter)e2).unregisterDataSetObserver((DataSetObserver)q0);
            }
        }
        if ((this.E0 = e0) != null) {
            ((Adapter)e0).registerDataSetObserver((DataSetObserver)this.Q0);
        }
        final vi9 f0 = this.F0;
        if (f0 != null) {
            ((AbsListView)f0).setAdapter(this.E0);
        }
    }
    
    @Override
    public final void show() {
        if (this.F0 == null) {
            ((AbsListView)(this.F0 = this.n(this.D0, this.a1 ^ true))).setAdapter(this.E0);
            ((AdapterView)this.F0).setOnItemClickListener(this.S0);
            ((View)this.F0).setFocusable(true);
            ((View)this.F0).setFocusableInTouchMode(true);
            ((AdapterView)this.F0).setOnItemSelectedListener((AdapterView$OnItemSelectedListener)new alf(this));
            ((AbsListView)this.F0).setOnScrollListener((AbsListView$OnScrollListener)this.V0);
            this.b1.setContentView((View)this.F0);
        }
        else {
            final ViewGroup viewGroup = (ViewGroup)this.b1.getContentView();
        }
        final Drawable background = this.b1.getBackground();
        final int n = 0;
        int n3;
        if (background != null) {
            background.getPadding(this.Y0);
            final Rect y0 = this.Y0;
            final int top = y0.top;
            final int n2 = n3 = y0.bottom + top;
            if (!this.L0) {
                this.J0 = -top;
                n3 = n2;
            }
        }
        else {
            this.Y0.setEmpty();
            n3 = 0;
        }
        final boolean b = this.b1.getInputMethodMode() == 2;
        final View r0 = this.R0;
        final int j0 = this.J0;
        int n4 = 0;
        Label_0327: {
            if (Build$VERSION.SDK_INT <= 23) {
                final Method d1 = blf.d1;
                if (d1 != null) {
                    try {
                        n4 = (int)d1.invoke(this.b1, r0, j0, b);
                        break Label_0327;
                    }
                    catch (final Exception ex) {
                        Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                    }
                }
                n4 = this.b1.getMaxAvailableHeight(r0, j0);
            }
            else {
                n4 = blf.blf$a.a((PopupWindow)this.b1, r0, j0, b);
            }
        }
        int height;
        if (this.G0 == -1) {
            height = n4 + n3;
        }
        else {
            final int h0 = this.H0;
            int n5;
            if (h0 != -2) {
                if (h0 != -1) {
                    n5 = View$MeasureSpec.makeMeasureSpec(h0, 1073741824);
                }
                else {
                    final int widthPixels = this.D0.getResources().getDisplayMetrics().widthPixels;
                    final Rect y2 = this.Y0;
                    n5 = View$MeasureSpec.makeMeasureSpec(widthPixels - (y2.left + y2.right), 1073741824);
                }
            }
            else {
                final int widthPixels2 = this.D0.getResources().getDisplayMetrics().widthPixels;
                final Rect y3 = this.Y0;
                n5 = View$MeasureSpec.makeMeasureSpec(widthPixels2 - (y3.left + y3.right), Integer.MIN_VALUE);
            }
            final int a = this.F0.a(n5, n4 + 0);
            int n6;
            if (a > 0) {
                n6 = ((View)this.F0).getPaddingBottom() + ((View)this.F0).getPaddingTop() + n3 + 0;
            }
            else {
                n6 = 0;
            }
            height = a + n6;
        }
        final boolean b2 = this.b1.getInputMethodMode() == 2;
        vrk.b((PopupWindow)this.b1, this.K0);
        if (this.b1.isShowing()) {
            final View r2 = this.R0;
            final WeakHashMap a2 = j6x.a;
            if (!j6x$g.b(r2)) {
                return;
            }
            final int h2 = this.H0;
            int width;
            if (h2 == -1) {
                width = -1;
            }
            else if ((width = h2) == -2) {
                width = this.R0.getWidth();
            }
            final int g0 = this.G0;
            if (g0 == -1) {
                if (!b2) {
                    height = -1;
                }
                if (b2) {
                    final ik0 b3 = this.b1;
                    int width2;
                    if (this.H0 == -1) {
                        width2 = -1;
                    }
                    else {
                        width2 = 0;
                    }
                    b3.setWidth(width2);
                    this.b1.setHeight(0);
                }
                else {
                    final ik0 b4 = this.b1;
                    int width3 = n;
                    if (this.H0 == -1) {
                        width3 = -1;
                    }
                    b4.setWidth(width3);
                    this.b1.setHeight(-1);
                }
            }
            else if (g0 != -2) {
                height = g0;
            }
            this.b1.setOutsideTouchable(true);
            final ik0 b5 = this.b1;
            final View r3 = this.R0;
            final int i0 = this.I0;
            final int j2 = this.J0;
            if (width < 0) {
                width = -1;
            }
            if (height < 0) {
                height = -1;
            }
            b5.update(r3, i0, j2, width, height);
        }
        else {
            final int h3 = this.H0;
            int width4;
            if (h3 == -1) {
                width4 = -1;
            }
            else if ((width4 = h3) == -2) {
                width4 = this.R0.getWidth();
            }
            final int g2 = this.G0;
            if (g2 == -1) {
                height = -1;
            }
            else if (g2 != -2) {
                height = g2;
            }
            this.b1.setWidth(width4);
            this.b1.setHeight(height);
            if (Build$VERSION.SDK_INT <= 28) {
                final Method c1 = blf.c1;
                if (c1 != null) {
                    try {
                        c1.invoke(this.b1, Boolean.TRUE);
                    }
                    catch (final Exception ex2) {
                        Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                    }
                }
            }
            else {
                blf.blf$b.b((PopupWindow)this.b1, true);
            }
            this.b1.setOutsideTouchable(true);
            this.b1.setTouchInterceptor((View$OnTouchListener)this.U0);
            if (this.N0) {
                vrk.a((PopupWindow)this.b1, this.M0);
            }
            if (Build$VERSION.SDK_INT <= 28) {
                final Method e1 = blf.e1;
                if (e1 != null) {
                    try {
                        e1.invoke(this.b1, this.Z0);
                    }
                    catch (final Exception ex3) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", (Throwable)ex3);
                    }
                }
            }
            else {
                blf.blf$b.a((PopupWindow)this.b1, this.Z0);
            }
            vrk$a.a((PopupWindow)this.b1, this.R0, this.I0, this.J0, this.O0);
            ((AdapterView)this.F0).setSelection(-1);
            if (!this.a1 || this.F0.isInTouchMode()) {
                final vi9 f0 = this.F0;
                if (f0 != null) {
                    f0.setListSelectionHidden(true);
                    ((View)f0).requestLayout();
                }
            }
            if (!this.a1) {
                this.X0.post((Runnable)this.W0);
            }
        }
    }
}
