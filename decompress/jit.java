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

public final class jit implements View$OnLongClickListener, View$OnHoverListener, View$OnAttachStateChangeListener
{
    public static jit M0;
    public static jit N0;
    public final View C0;
    public final CharSequence D0;
    public final int E0;
    public final h16 F0;
    public final iit G0;
    public int H0;
    public int I0;
    public uit J0;
    public boolean K0;
    public boolean L0;
    
    public jit(final View c0, final CharSequence d0) {
        this.F0 = new h16((Object)this, 1);
        this.G0 = new iit((Object)this, 0);
        this.C0 = c0;
        this.D0 = d0;
        final ViewConfiguration value = ViewConfiguration.get(c0.getContext());
        final Method a = a6x.a;
        int a2;
        if (Build$VERSION.SDK_INT >= 28) {
            a2 = a6x$b.a(value);
        }
        else {
            a2 = value.getScaledTouchSlop() / 2;
        }
        this.E0 = a2;
        this.L0 = true;
        c0.setOnLongClickListener((View$OnLongClickListener)this);
        c0.setOnHoverListener((View$OnHoverListener)this);
    }
    
    public static void b(final jit m0) {
        final jit m2 = jit.M0;
        if (m2 != null) {
            m2.C0.removeCallbacks((Runnable)m2.F0);
        }
        if ((jit.M0 = m0) != null) {
            m0.C0.postDelayed((Runnable)m0.F0, (long)ViewConfiguration.getLongPressTimeout());
        }
    }
    
    public final void a() {
        if (jit.N0 == this) {
            jit.N0 = null;
            final uit j0 = this.J0;
            if (j0 != null) {
                j0.a();
                this.J0 = null;
                this.L0 = true;
                this.C0.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
            }
            else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (jit.M0 == this) {
            b(null);
        }
        this.C0.removeCallbacks((Runnable)this.G0);
    }
    
    public final void c(final boolean k0) {
        final View c0 = this.C0;
        final WeakHashMap a = p5x.a;
        if (!p5x$g.b(c0)) {
            return;
        }
        b(null);
        final jit n0 = jit.N0;
        if (n0 != null) {
            n0.a();
        }
        jit.N0 = this;
        this.K0 = k0;
        final uit j0 = new uit(this.C0.getContext());
        this.J0 = j0;
        final View c2 = this.C0;
        final int h0 = this.H0;
        final int i0 = this.I0;
        final boolean k2 = this.K0;
        final CharSequence d0 = this.D0;
        if (j0.b.getParent() != null) {
            j0.a();
        }
        j0.c.setText(d0);
        final WindowManager$LayoutParams d2 = j0.d;
        d2.token = c2.getApplicationWindowToken();
        final int dimensionPixelOffset = j0.a.getResources().getDimensionPixelOffset(2131167619);
        int n2;
        if (c2.getWidth() >= dimensionPixelOffset) {
            n2 = h0;
        }
        else {
            n2 = c2.getWidth() / 2;
        }
        int height;
        int n3;
        if (c2.getHeight() >= dimensionPixelOffset) {
            final int dimensionPixelOffset2 = j0.a.getResources().getDimensionPixelOffset(2131167618);
            height = i0 + dimensionPixelOffset2;
            n3 = i0 - dimensionPixelOffset2;
        }
        else {
            height = c2.getHeight();
            n3 = 0;
        }
        d2.gravity = 49;
        final Resources resources = j0.a.getResources();
        int n4;
        if (k2) {
            n4 = 2131167622;
        }
        else {
            n4 = 2131167621;
        }
        final int dimensionPixelOffset3 = resources.getDimensionPixelOffset(n4);
        final View rootView = c2.getRootView();
        final ViewGroup$LayoutParams layoutParams = rootView.getLayoutParams();
        View decorView;
        if (layoutParams instanceof WindowManager$LayoutParams && ((WindowManager$LayoutParams)layoutParams).type == 2) {
            decorView = rootView;
        }
        else {
            Context context = c2.getContext();
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
            decorView.getWindowVisibleDisplayFrame(j0.e);
            final Rect e = j0.e;
            if (e.left < 0 && e.top < 0) {
                final Resources resources2 = j0.a.getResources();
                final int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                int dimensionPixelSize;
                if (identifier != 0) {
                    dimensionPixelSize = resources2.getDimensionPixelSize(identifier);
                }
                else {
                    dimensionPixelSize = 0;
                }
                final DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                j0.e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            decorView.getLocationOnScreen(j0.g);
            c2.getLocationOnScreen(j0.f);
            final int[] f = j0.f;
            final int n5 = f[0];
            final int[] g = j0.g;
            f[0] = n5 - g[0];
            f[1] -= g[1];
            d2.x = f[0] + n2 - decorView.getWidth() / 2;
            final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
            j0.b.measure(measureSpec, measureSpec);
            final int measuredHeight = j0.b.getMeasuredHeight();
            final int[] f2 = j0.f;
            final int n6 = f2[1] + n3 - dimensionPixelOffset3 - measuredHeight;
            final int n7 = f2[1] + height + dimensionPixelOffset3;
            if (k2) {
                if (n6 >= 0) {
                    d2.y = n6;
                }
                else {
                    d2.y = n7;
                }
            }
            else if (measuredHeight + n7 <= j0.e.height()) {
                d2.y = n7;
            }
            else {
                d2.y = n6;
            }
        }
        ((ViewManager)j0.a.getSystemService("window")).addView(j0.b, (ViewGroup$LayoutParams)j0.d);
        this.C0.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        long n8;
        if (this.K0) {
            n8 = 2500L;
        }
        else {
            long n9;
            int n10;
            if ((p5x$d.g(this.C0) & 0x1) == 0x1) {
                n9 = 3000L;
                n10 = ViewConfiguration.getLongPressTimeout();
            }
            else {
                n9 = 15000L;
                n10 = ViewConfiguration.getLongPressTimeout();
            }
            n8 = n9 - n10;
        }
        this.C0.removeCallbacks((Runnable)this.G0);
        this.C0.postDelayed((Runnable)this.G0, n8);
    }
    
    public final boolean onHover(final View view, final MotionEvent motionEvent) {
        if (this.J0 != null && this.K0) {
            return false;
        }
        final AccessibilityManager accessibilityManager = (AccessibilityManager)this.C0.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        final int action = motionEvent.getAction();
        boolean b = true;
        if (action != 7) {
            if (action == 10) {
                this.L0 = true;
                this.a();
            }
        }
        else if (this.C0.isEnabled() && this.J0 == null) {
            final int h0 = (int)motionEvent.getX();
            final int i0 = (int)motionEvent.getY();
            if (!this.L0 && Math.abs(h0 - this.H0) <= this.E0 && Math.abs(i0 - this.I0) <= this.E0) {
                b = false;
            }
            else {
                this.H0 = h0;
                this.I0 = i0;
                this.L0 = false;
            }
            if (b) {
                b(this);
            }
        }
        return false;
    }
    
    public final boolean onLongClick(final View view) {
        this.H0 = view.getWidth() / 2;
        this.I0 = view.getHeight() / 2;
        this.c(true);
        return true;
    }
    
    public final void onViewAttachedToWindow(final View view) {
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        this.a();
    }
}
