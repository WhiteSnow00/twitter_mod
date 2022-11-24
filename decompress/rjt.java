import android.view.ViewManager;
import android.view.accessibility.AccessibilityManager;
import android.view.MotionEvent;
import android.util.DisplayMetrics;
import android.graphics.Rect;
import android.content.Context;
import android.content.res.Resources;
import java.util.WeakHashMap;
import android.view.ViewGroup$LayoutParams;
import android.view.WindowManager;
import android.view.View$MeasureSpec;
import android.app.Activity;
import android.content.ContextWrapper;
import android.view.WindowManager$LayoutParams;
import android.util.Log;
import java.lang.reflect.Method;
import android.os.Build$VERSION;
import android.view.ViewConfiguration;
import android.view.View;
import android.view.View$OnAttachStateChangeListener;
import android.view.View$OnHoverListener;
import android.view.View$OnLongClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rjt implements View$OnLongClickListener, View$OnHoverListener, View$OnAttachStateChangeListener
{
    public static rjt P0;
    public static rjt Q0;
    public final View F0;
    public final CharSequence G0;
    public final int H0;
    public final x16 I0;
    public final qjt J0;
    public int K0;
    public int L0;
    public ckt M0;
    public boolean N0;
    public boolean O0;
    
    public rjt(final View f0, final CharSequence g0) {
        this.I0 = new x16((Object)this, 1);
        this.J0 = new qjt((Object)this, 0);
        this.F0 = f0;
        this.G0 = g0;
        final ViewConfiguration value = ViewConfiguration.get(f0.getContext());
        final Method a = m7x.a;
        int a2;
        if (Build$VERSION.SDK_INT >= 28) {
            a2 = m7x$b.a(value);
        }
        else {
            a2 = value.getScaledTouchSlop() / 2;
        }
        this.H0 = a2;
        this.O0 = true;
        f0.setOnLongClickListener((View$OnLongClickListener)this);
        f0.setOnHoverListener((View$OnHoverListener)this);
    }
    
    public static void b(final rjt p) {
        final rjt p2 = rjt.P0;
        if (p2 != null) {
            p2.F0.removeCallbacks((Runnable)p2.I0);
        }
        if ((rjt.P0 = p) != null) {
            p.F0.postDelayed((Runnable)p.I0, (long)ViewConfiguration.getLongPressTimeout());
        }
    }
    
    public final void a() {
        if (rjt.Q0 == this) {
            rjt.Q0 = null;
            final ckt m0 = this.M0;
            if (m0 != null) {
                m0.a();
                this.M0 = null;
                this.O0 = true;
                this.F0.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
            }
            else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (rjt.P0 == this) {
            b(null);
        }
        this.F0.removeCallbacks((Runnable)this.J0);
    }
    
    public final void c(final boolean n0) {
        final View f0 = this.F0;
        final WeakHashMap a = b7x.a;
        if (!b7x$g.b(f0)) {
            return;
        }
        b(null);
        final rjt q0 = rjt.Q0;
        if (q0 != null) {
            q0.a();
        }
        rjt.Q0 = this;
        this.N0 = n0;
        final ckt m0 = new ckt(this.F0.getContext());
        this.M0 = m0;
        final View f2 = this.F0;
        final int k0 = this.K0;
        final int l0 = this.L0;
        final boolean n2 = this.N0;
        final CharSequence g0 = this.G0;
        if (m0.b.getParent() != null) {
            m0.a();
        }
        m0.c.setText(g0);
        final WindowManager$LayoutParams d = m0.d;
        d.token = f2.getApplicationWindowToken();
        final int dimensionPixelOffset = m0.a.getResources().getDimensionPixelOffset(2131167619);
        int n3;
        if (f2.getWidth() >= dimensionPixelOffset) {
            n3 = k0;
        }
        else {
            n3 = f2.getWidth() / 2;
        }
        int height;
        int n4;
        if (f2.getHeight() >= dimensionPixelOffset) {
            final int dimensionPixelOffset2 = m0.a.getResources().getDimensionPixelOffset(2131167618);
            height = l0 + dimensionPixelOffset2;
            n4 = l0 - dimensionPixelOffset2;
        }
        else {
            height = f2.getHeight();
            n4 = 0;
        }
        d.gravity = 49;
        final Resources resources = m0.a.getResources();
        int n5;
        if (n2) {
            n5 = 2131167622;
        }
        else {
            n5 = 2131167621;
        }
        final int dimensionPixelOffset3 = resources.getDimensionPixelOffset(n5);
        final View rootView = f2.getRootView();
        final ViewGroup$LayoutParams layoutParams = rootView.getLayoutParams();
        View decorView;
        if (layoutParams instanceof WindowManager$LayoutParams && ((WindowManager$LayoutParams)layoutParams).type == 2) {
            decorView = rootView;
        }
        else {
            Context context = f2.getContext();
            while (true) {
                decorView = rootView;
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof Activity) {
                    decorView = ((Activity)context).getWindow().getDecorView();
                    break;
                }
                context = ((ContextWrapper)context).getBaseContext();
            }
        }
        if (decorView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
        }
        else {
            decorView.getWindowVisibleDisplayFrame(m0.e);
            final Rect e = m0.e;
            if (e.left < 0 && e.top < 0) {
                final Resources resources2 = m0.a.getResources();
                final int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                int dimensionPixelSize;
                if (identifier != 0) {
                    dimensionPixelSize = resources2.getDimensionPixelSize(identifier);
                }
                else {
                    dimensionPixelSize = 0;
                }
                final DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                m0.e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            decorView.getLocationOnScreen(m0.g);
            f2.getLocationOnScreen(m0.f);
            final int[] f3 = m0.f;
            final int n6 = f3[0];
            final int[] g2 = m0.g;
            f3[0] = n6 - g2[0];
            f3[1] -= g2[1];
            d.x = f3[0] + n3 - decorView.getWidth() / 2;
            final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
            m0.b.measure(measureSpec, measureSpec);
            final int measuredHeight = m0.b.getMeasuredHeight();
            final int[] f4 = m0.f;
            final int n7 = f4[1] + n4 - dimensionPixelOffset3 - measuredHeight;
            final int n8 = f4[1] + height + dimensionPixelOffset3;
            if (n2) {
                if (n7 >= 0) {
                    d.y = n7;
                }
                else {
                    d.y = n8;
                }
            }
            else if (measuredHeight + n8 <= m0.e.height()) {
                d.y = n8;
            }
            else {
                d.y = n7;
            }
        }
        ((ViewManager)m0.a.getSystemService("window")).addView(m0.b, (ViewGroup$LayoutParams)m0.d);
        this.F0.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        long n9;
        if (this.N0) {
            n9 = 2500L;
        }
        else {
            long n10;
            int n11;
            if ((b7x$d.g(this.F0) & 0x1) == 0x1) {
                n10 = 3000L;
                n11 = ViewConfiguration.getLongPressTimeout();
            }
            else {
                n10 = 15000L;
                n11 = ViewConfiguration.getLongPressTimeout();
            }
            n9 = n10 - n11;
        }
        this.F0.removeCallbacks((Runnable)this.J0);
        this.F0.postDelayed((Runnable)this.J0, n9);
    }
    
    public final boolean onHover(final View view, final MotionEvent motionEvent) {
        if (this.M0 != null && this.N0) {
            return false;
        }
        final AccessibilityManager accessibilityManager = (AccessibilityManager)this.F0.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        final int action = motionEvent.getAction();
        boolean b = true;
        if (action != 7) {
            if (action == 10) {
                this.O0 = true;
                this.a();
            }
        }
        else if (this.F0.isEnabled() && this.M0 == null) {
            final int k0 = (int)motionEvent.getX();
            final int l0 = (int)motionEvent.getY();
            if (!this.O0 && Math.abs(k0 - this.K0) <= this.H0 && Math.abs(l0 - this.L0) <= this.H0) {
                b = false;
            }
            else {
                this.K0 = k0;
                this.L0 = l0;
                this.O0 = false;
            }
            if (b) {
                b(this);
            }
        }
        return false;
    }
    
    public final boolean onLongClick(final View view) {
        this.K0 = view.getWidth() / 2;
        this.L0 = view.getHeight() / 2;
        this.c(true);
        return true;
    }
    
    public final void onViewAttachedToWindow(final View view) {
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        this.a();
    }
}
