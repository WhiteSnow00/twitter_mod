import java.util.WeakHashMap;
import android.view.ViewConfiguration;
import android.view.MotionEvent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.content.Context;
import android.view.VelocityTracker;
import android.widget.OverScroller;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class gic<V extends View> extends xax<V>
{
    public gic.gic$a c;
    public OverScroller d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public VelocityTracker i;
    
    public gic() {
        this.f = -1;
        this.h = -1;
    }
    
    public gic(final Context context, final AttributeSet set) {
        super(context, set);
        this.f = -1;
        this.h = -1;
    }
    
    public void A(final CoordinatorLayout coordinatorLayout, final V v) {
    }
    
    public final int B(final CoordinatorLayout coordinatorLayout, final V v, final int n, final int n2, final int n3) {
        return this.D(coordinatorLayout, v, this.z() - n, n2, n3);
    }
    
    public final int C(final CoordinatorLayout coordinatorLayout, final V v, final int n) {
        return this.D(coordinatorLayout, v, n, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    public int D(final CoordinatorLayout coordinatorLayout, final V v, int l, final int n, final int n2) {
        final int t = this.t();
        if (n != 0 && t >= n && t <= n2) {
            l = p0b.l(l, n, n2);
            if (t != l) {
                this.v(l);
                l = t - l;
                return l;
            }
        }
        l = 0;
        return l;
    }
    
    public boolean h(final CoordinatorLayout coordinatorLayout, final V v, final MotionEvent motionEvent) {
        if (this.h < 0) {
            this.h = ViewConfiguration.get(((View)coordinatorLayout).getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.e) {
            final int f = this.f;
            if (f == -1) {
                return false;
            }
            final int pointerIndex = motionEvent.findPointerIndex(f);
            if (pointerIndex == -1) {
                return false;
            }
            final int g = (int)motionEvent.getY(pointerIndex);
            if (Math.abs(g - this.g) > this.h) {
                this.g = g;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f = -1;
            final int n = (int)motionEvent.getX();
            final int g2 = (int)motionEvent.getY();
            final boolean e = this.w(v) && coordinatorLayout.s((View)v, n, g2);
            this.e = e;
            if (e) {
                this.g = g2;
                this.f = motionEvent.getPointerId(0);
                if (this.i == null) {
                    this.i = VelocityTracker.obtain();
                }
                final OverScroller d = this.d;
                if (d != null && !d.isFinished()) {
                    this.d.abortAnimation();
                    return true;
                }
            }
        }
        final VelocityTracker i = this.i;
        if (i != null) {
            i.addMovement(motionEvent);
        }
        return false;
    }
    
    public final boolean s(final CoordinatorLayout coordinatorLayout, final V v, final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final boolean b = true;
        int n2 = 0;
        Label_0351: {
            int n4 = 0;
            Label_0315: {
                Label_0312: {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                break Label_0312;
                            }
                            if (actionMasked == 6) {
                                int n;
                                if (motionEvent.getActionIndex() == 0) {
                                    n = 1;
                                }
                                else {
                                    n = 0;
                                }
                                this.f = motionEvent.getPointerId(n);
                                this.g = (int)(motionEvent.getY(n) + 0.5f);
                            }
                        }
                        else {
                            final int pointerIndex = motionEvent.findPointerIndex(this.f);
                            if (pointerIndex == -1) {
                                return false;
                            }
                            final int g = (int)motionEvent.getY(pointerIndex);
                            final int g2 = this.g;
                            this.g = g;
                            this.B(coordinatorLayout, v, g2 - g, this.x(v), 0);
                        }
                        n2 = 0;
                        break Label_0351;
                    }
                    final VelocityTracker i = this.i;
                    if (i != null) {
                        i.addMovement(motionEvent);
                        this.i.computeCurrentVelocity(1000);
                        final float yVelocity = this.i.getYVelocity(this.f);
                        final int n3 = -this.y(v);
                        final gic.gic$a c = this.c;
                        if (c != null) {
                            v.removeCallbacks((Runnable)c);
                            this.c = null;
                        }
                        if (this.d == null) {
                            this.d = new OverScroller(v.getContext());
                        }
                        this.d.fling(0, this.t(), 0, Math.round(yVelocity), 0, 0, n3, 0);
                        if (this.d.computeScrollOffset()) {
                            final gic.gic$a c2 = new gic.gic$a(this, coordinatorLayout, (View)v);
                            this.c = c2;
                            final WeakHashMap a = b7x.a;
                            b7x$d.m((View)v, (Runnable)c2);
                        }
                        else {
                            this.A(coordinatorLayout, v);
                        }
                        n4 = 1;
                        break Label_0315;
                    }
                }
                n4 = 0;
            }
            this.e = false;
            this.f = -1;
            final VelocityTracker j = this.i;
            n2 = n4;
            if (j != null) {
                j.recycle();
                this.i = null;
                n2 = n4;
            }
        }
        final VelocityTracker k = this.i;
        if (k != null) {
            k.addMovement(motionEvent);
        }
        boolean b2 = b;
        if (!this.e) {
            b2 = (n2 != 0 && b);
        }
        return b2;
    }
    
    public boolean w(final V v) {
        return false;
    }
    
    public int x(final V v) {
        return -v.getHeight();
    }
    
    public int y(final V v) {
        return v.getHeight();
    }
    
    public int z() {
        return this.t();
    }
}
