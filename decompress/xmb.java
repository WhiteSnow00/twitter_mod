import android.view.ViewParent;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.View;
import android.view.View$OnAttachStateChangeListener;
import android.view.View$OnTouchListener;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class xmb implements View$OnTouchListener, View$OnAttachStateChangeListener
{
    public final float C0;
    public final int D0;
    public final int E0;
    public final View F0;
    public a G0;
    public b H0;
    public boolean I0;
    public int J0;
    public final int[] K0;
    
    public xmb(final View f0) {
        this.K0 = new int[2];
        (this.F0 = f0).setLongClickable(true);
        f0.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        this.C0 = (float)ViewConfiguration.get(f0.getContext()).getScaledTouchSlop();
        final int tapTimeout = ViewConfiguration.getTapTimeout();
        this.D0 = tapTimeout;
        this.E0 = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }
    
    public final void a() {
        final b h0 = this.H0;
        if (h0 != null) {
            this.F0.removeCallbacks((Runnable)h0);
        }
        final a g0 = this.G0;
        if (g0 != null) {
            this.F0.removeCallbacks((Runnable)g0);
        }
    }
    
    public abstract w4q b();
    
    public abstract boolean c();
    
    public boolean d() {
        final w4q b = this.b();
        if (b != null && b.isShowing()) {
            b.dismiss();
        }
        return true;
    }
    
    public final boolean onTouch(View f0, final MotionEvent motionEvent) {
        final boolean i0 = this.I0;
        final boolean b = false;
        boolean i2;
        if (i0) {
            final View f2 = this.F0;
            final w4q b2 = this.b();
            boolean b5 = false;
            Label_0189: {
                if (b2 != null) {
                    if (b2.isShowing()) {
                        final mj9 mj9 = (mj9)b2.l();
                        if (mj9 != null) {
                            if (((View)mj9).isShown()) {
                                final MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                                final int[] k0 = this.K0;
                                f2.getLocationOnScreen(k0);
                                obtainNoHistory.offsetLocation((float)k0[0], (float)k0[1]);
                                final int[] k2 = this.K0;
                                ((View)mj9).getLocationOnScreen(k2);
                                obtainNoHistory.offsetLocation((float)(-k2[0]), (float)(-k2[1]));
                                final boolean b3 = mj9.b(obtainNoHistory, this.J0);
                                obtainNoHistory.recycle();
                                final int actionMasked = motionEvent.getActionMasked();
                                final boolean b4 = actionMasked != 1 && actionMasked != 3;
                                if (b3 && b4) {
                                    b5 = true;
                                    break Label_0189;
                                }
                            }
                        }
                    }
                }
                b5 = false;
            }
            i2 = (b5 || !this.d());
        }
        else {
            f0 = this.F0;
            boolean b6 = false;
            Label_0478: {
                Label_0475: {
                    if (f0.isEnabled()) {
                        final int actionMasked2 = motionEvent.getActionMasked();
                        if (actionMasked2 != 0) {
                            if (actionMasked2 != 1) {
                                if (actionMasked2 != 2) {
                                    if (actionMasked2 != 3) {
                                        break Label_0475;
                                    }
                                }
                                else {
                                    final int pointerIndex = motionEvent.findPointerIndex(this.J0);
                                    if (pointerIndex < 0) {
                                        break Label_0475;
                                    }
                                    final float x = motionEvent.getX(pointerIndex);
                                    final float y = motionEvent.getY(pointerIndex);
                                    final float c0 = this.C0;
                                    final float n = -c0;
                                    if (x < n || y < n || x >= f0.getRight() - f0.getLeft() + c0 || y >= f0.getBottom() - f0.getTop() + c0) {
                                        this.a();
                                        f0.getParent().requestDisallowInterceptTouchEvent(true);
                                        b6 = true;
                                        break Label_0478;
                                    }
                                    break Label_0475;
                                }
                            }
                            this.a();
                        }
                        else {
                            this.J0 = motionEvent.getPointerId(0);
                            if (this.G0 == null) {
                                this.G0 = new a();
                            }
                            f0.postDelayed((Runnable)this.G0, (long)this.D0);
                            if (this.H0 == null) {
                                this.H0 = new b();
                            }
                            f0.postDelayed((Runnable)this.H0, (long)this.E0);
                        }
                    }
                }
                b6 = false;
            }
            final boolean b7 = i2 = (b6 && this.c());
            if (b7) {
                final long uptimeMillis = SystemClock.uptimeMillis();
                final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.F0.onTouchEvent(obtain);
                obtain.recycle();
                i2 = b7;
            }
        }
        if (!(this.I0 = i2)) {
            final boolean b8 = b;
            if (!i0) {
                return b8;
            }
        }
        return true;
    }
    
    public final void onViewAttachedToWindow(final View view) {
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        this.I0 = false;
        this.J0 = -1;
        final a g0 = this.G0;
        if (g0 != null) {
            this.F0.removeCallbacks((Runnable)g0);
        }
    }
    
    public final class a implements Runnable
    {
        @Override
        public final void run() {
            final ViewParent parent = xmb.this.F0.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }
    
    public final class b implements Runnable
    {
        @Override
        public final void run() {
            final xmb c0 = xmb.this;
            c0.a();
            final View f0 = c0.F0;
            if (f0.isEnabled()) {
                if (!f0.isLongClickable()) {
                    if (c0.c()) {
                        f0.getParent().requestDisallowInterceptTouchEvent(true);
                        final long uptimeMillis = SystemClock.uptimeMillis();
                        final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        f0.onTouchEvent(obtain);
                        obtain.recycle();
                        c0.I0 = true;
                    }
                }
            }
        }
    }
}
