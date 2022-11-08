import java.util.Arrays;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.graphics.drawable.Drawable;
import android.view.ViewParent;
import java.util.WeakHashMap;
import android.view.View;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ProgressBar;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class gp1<S extends hp1> extends ProgressBar
{
    public S C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public final int G0;
    public qc0 H0;
    public boolean I0;
    public int J0;
    public final gp1$a K0;
    public final gp1$b L0;
    public final gp1$c M0;
    public final gp1$d N0;
    
    public gp1(Context context, final AttributeSet set) {
        super(ung.a(context, set, 2130968910, 2132019406), set, 2130968910);
        this.I0 = false;
        this.J0 = 4;
        this.K0 = new gp1$a(this);
        this.L0 = new gp1$b(this);
        this.M0 = new gp1$c(this);
        this.N0 = new gp1$d(this);
        context = ((View)this).getContext();
        this.C0 = (S)new za4(context, set);
        final TypedArray d = hks.d(context, set, rp2.P0, 2130968910, 2132019358, new int[0]);
        d.getInt(5, -1);
        this.G0 = Math.min(d.getInt(3, -1), 1000);
        d.recycle();
        this.H0 = new qc0();
        this.F0 = true;
    }
    
    private bj9<S> getCurrentDrawingDelegate() {
        final boolean indeterminate = this.isIndeterminate();
        final bj9<S> bj9 = null;
        bj9 n0 = null;
        if (indeterminate) {
            if (this.getIndeterminateDrawable() != null) {
                n0 = this.getIndeterminateDrawable().N0;
            }
            return (bj9<S>)n0;
        }
        bj9 n2;
        if (this.getProgressDrawable() == null) {
            n2 = bj9;
        }
        else {
            n2 = this.getProgressDrawable().N0;
        }
        return (bj9<S>)n2;
    }
    
    public final void a(final int n, final boolean e0) {
        if (this.isIndeterminate()) {
            if (this.getProgressDrawable() != null) {
                this.D0 = n;
                this.E0 = e0;
                this.I0 = true;
                if (((Drawable)this.getIndeterminateDrawable()).isVisible() && this.H0.a(((View)this).getContext().getContentResolver()) != 0.0f) {
                    this.getIndeterminateDrawable().O0.h();
                }
                else {
                    final gp1$c m0 = this.M0;
                    this.getIndeterminateDrawable();
                    m0.a();
                }
            }
        }
        else {
            super.setProgress(n);
            if (this.getProgressDrawable() != null && !e0) {
                this.getProgressDrawable().jumpToCurrentState();
            }
        }
    }
    
    public final boolean b() {
        final WeakHashMap a = p5x.a;
        final boolean b = p5x$g.b((View)this);
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            b3 = b2;
            if (((View)this).getWindowVisibility() == 0) {
                Object o = this;
                while (true) {
                    while (((View)o).getVisibility() == 0) {
                        final ViewParent parent = ((View)o).getParent();
                        boolean b4 = false;
                        Label_0078: {
                            if (parent == null) {
                                if (((View)this).getWindowVisibility() != 0) {
                                    b4 = false;
                                    break Label_0078;
                                }
                            }
                            else if (parent instanceof View) {
                                o = parent;
                                continue;
                            }
                            b4 = true;
                        }
                        b3 = b2;
                        if (b4) {
                            b3 = true;
                            return b3;
                        }
                        return b3;
                    }
                    continue;
                }
            }
        }
        return b3;
    }
    
    public Drawable getCurrentDrawable() {
        Object o;
        if (this.isIndeterminate()) {
            o = this.getIndeterminateDrawable();
        }
        else {
            o = this.getProgressDrawable();
        }
        return (Drawable)o;
    }
    
    public int getHideAnimationBehavior() {
        return this.C0.f;
    }
    
    public tkd<S> getIndeterminateDrawable() {
        return (tkd<S>)super.getIndeterminateDrawable();
    }
    
    public int[] getIndicatorColor() {
        return this.C0.c;
    }
    
    public rt8<S> getProgressDrawable() {
        return (rt8<S>)super.getProgressDrawable();
    }
    
    public int getShowAnimationBehavior() {
        return this.C0.e;
    }
    
    public int getTrackColor() {
        return this.C0.d;
    }
    
    public int getTrackCornerRadius() {
        return this.C0.b;
    }
    
    public int getTrackThickness() {
        return this.C0.a;
    }
    
    public final void invalidate() {
        super.invalidate();
        if (this.getCurrentDrawable() != null) {
            this.getCurrentDrawable().invalidateSelf();
        }
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.getProgressDrawable() != null && this.getIndeterminateDrawable() != null) {
            this.getIndeterminateDrawable().O0.g((e80)this.M0);
        }
        if (this.getProgressDrawable() != null) {
            ((de9)this.getProgressDrawable()).f((e80)this.N0);
        }
        if (this.getIndeterminateDrawable() != null) {
            ((de9)this.getIndeterminateDrawable()).f((e80)this.N0);
        }
        if (this.b()) {
            if (this.G0 > 0) {
                SystemClock.uptimeMillis();
            }
            ((View)this).setVisibility(0);
        }
    }
    
    public final void onDetachedFromWindow() {
        ((View)this).removeCallbacks((Runnable)this.L0);
        ((View)this).removeCallbacks((Runnable)this.K0);
        ((de9)this.getCurrentDrawable()).c();
        if (this.getIndeterminateDrawable() != null) {
            ((de9)this.getIndeterminateDrawable()).i((e80)this.N0);
            this.getIndeterminateDrawable().O0.j();
        }
        if (this.getProgressDrawable() != null) {
            ((de9)this.getProgressDrawable()).i((e80)this.N0);
        }
        super.onDetachedFromWindow();
    }
    
    public final void onDraw(final Canvas canvas) {
        synchronized (this) {
            final int save = canvas.save();
            if (((View)this).getPaddingLeft() != 0 || ((View)this).getPaddingTop() != 0) {
                canvas.translate((float)((View)this).getPaddingLeft(), (float)((View)this).getPaddingTop());
            }
            if (((View)this).getPaddingRight() != 0 || ((View)this).getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, ((View)this).getWidth() - (((View)this).getPaddingLeft() + ((View)this).getPaddingRight()), ((View)this).getHeight() - (((View)this).getPaddingTop() + ((View)this).getPaddingBottom()));
            }
            this.getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(save);
        }
    }
    
    public final void onMeasure(int n, int n2) {
        synchronized (this) {
            super.onMeasure(n, n2);
            final bj9<S> currentDrawingDelegate = this.getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            n = currentDrawingDelegate.d();
            n2 = currentDrawingDelegate.c();
            if (n < 0) {
                n = ((View)this).getMeasuredWidth();
            }
            else {
                n = n + ((View)this).getPaddingLeft() + ((View)this).getPaddingRight();
            }
            if (n2 < 0) {
                n2 = ((View)this).getMeasuredHeight();
            }
            else {
                n2 = n2 + ((View)this).getPaddingTop() + ((View)this).getPaddingBottom();
            }
            ((View)this).setMeasuredDimension(n, n2);
        }
    }
    
    public final void onVisibilityChanged(final View view, final int n) {
        super.onVisibilityChanged(view, n);
        final boolean b = n == 0;
        if (this.F0) {
            ((de9)this.getCurrentDrawable()).g(this.b(), false, b);
        }
    }
    
    public final void onWindowVisibilityChanged(final int n) {
        super.onWindowVisibilityChanged(n);
        if (this.F0) {
            ((de9)this.getCurrentDrawable()).g(this.b(), false, false);
        }
    }
    
    public void setAnimatorDurationScaleProvider(final qc0 e0) {
        this.H0 = e0;
        if (this.getProgressDrawable() != null) {
            ((de9)this.getProgressDrawable()).E0 = e0;
        }
        if (this.getIndeterminateDrawable() != null) {
            ((de9)this.getIndeterminateDrawable()).E0 = e0;
        }
    }
    
    public void setHideAnimationBehavior(final int f) {
        this.C0.f = f;
        this.invalidate();
    }
    
    public void setIndeterminate(final boolean indeterminate) {
        synchronized (this) {
            if (indeterminate == this.isIndeterminate()) {
                return;
            }
            final de9 de9 = (de9)this.getCurrentDrawable();
            if (de9 != null) {
                de9.c();
            }
            super.setIndeterminate(indeterminate);
            final de9 de10 = (de9)this.getCurrentDrawable();
            if (de10 != null) {
                de10.g(this.b(), false, false);
            }
            if (de10 instanceof tkd && this.b()) {
                ((tkd)de10).O0.i();
            }
            this.I0 = false;
        }
    }
    
    public void setIndeterminateDrawable(final Drawable indeterminateDrawable) {
        if (indeterminateDrawable == null) {
            super.setIndeterminateDrawable((Drawable)null);
            return;
        }
        if (indeterminateDrawable instanceof tkd) {
            ((de9)indeterminateDrawable).c();
            super.setIndeterminateDrawable(indeterminateDrawable);
            return;
        }
        throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
    }
    
    public void setIndicatorColor(final int... array) {
        int[] c = array;
        if (array.length == 0) {
            c = new int[] { dml.B(((View)this).getContext(), 2130968973, -1) };
        }
        if (!Arrays.equals(this.getIndicatorColor(), c)) {
            this.C0.c = c;
            this.getIndeterminateDrawable().O0.f();
            this.invalidate();
        }
    }
    
    public void setProgress(final int n) {
        synchronized (this) {
            if (this.isIndeterminate()) {
                return;
            }
            this.a(n, false);
        }
    }
    
    public void setProgressDrawable(final Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable((Drawable)null);
            return;
        }
        if (drawable instanceof rt8) {
            final rt8 progressDrawable = (rt8)drawable;
            ((de9)progressDrawable).c();
            super.setProgressDrawable((Drawable)progressDrawable);
            ((Drawable)progressDrawable).setLevel((int)(this.getProgress() / (float)this.getMax() * 10000.0f));
            return;
        }
        throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
    }
    
    public void setShowAnimationBehavior(final int e) {
        this.C0.e = e;
        this.invalidate();
    }
    
    public void setTrackColor(final int d) {
        final hp1 c0 = this.C0;
        if (c0.d != d) {
            c0.d = d;
            this.invalidate();
        }
    }
    
    public void setTrackCornerRadius(final int n) {
        final hp1 c0 = this.C0;
        if (c0.b != n) {
            c0.b = Math.min(n, c0.a / 2);
        }
    }
    
    public void setTrackThickness(final int a) {
        final hp1 c0 = this.C0;
        if (c0.a != a) {
            c0.a = a;
            ((View)this).requestLayout();
        }
    }
    
    public void setVisibilityAfterHide(final int j0) {
        if (j0 != 0 && j0 != 4 && j0 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.J0 = j0;
    }
}
