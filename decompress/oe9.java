import android.animation.Animator;
import android.graphics.ColorFilter;
import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import android.graphics.Paint;
import java.util.List;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Property;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class oe9 extends Drawable implements Animatable
{
    public static final Property<oe9, Float> P0;
    public final Context F0;
    public final jp1 G0;
    public nc0 H0;
    public ValueAnimator I0;
    public ValueAnimator J0;
    public List<d80> K0;
    public boolean L0;
    public float M0;
    public final Paint N0;
    public int O0;
    
    static {
        oe9.P0 = new Property<oe9, Float>() {
            public final Object get(final Object o) {
                return ((oe9)o).b();
            }
            
            public final void set(final Object o, final Object o2) {
                final oe9 oe9 = (oe9)o;
                final float floatValue = (float)o2;
                if (oe9.M0 != floatValue) {
                    oe9.M0 = floatValue;
                    oe9.invalidateSelf();
                }
            }
        };
    }
    
    public oe9(final Context f0, final jp1 g0) {
        this.N0 = new Paint();
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = new nc0();
        this.setAlpha(255);
    }
    
    public static boolean a(final oe9 oe9) {
        return oe9.setVisible(false, false);
    }
    
    public final float b() {
        final jp1 g0 = this.G0;
        final int e = g0.e;
        final int n = 1;
        if (e == 0) {
            int n2;
            if (g0.f != 0) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            if (n2 == 0) {
                return 1.0f;
            }
        }
        return this.M0;
    }
    
    public final boolean c() {
        return this.g(false, false, false);
    }
    
    public final boolean d() {
        final ValueAnimator j0 = this.J0;
        return j0 != null && j0.isRunning();
    }
    
    public final boolean e() {
        final ValueAnimator i0 = this.I0;
        return i0 != null && i0.isRunning();
    }
    
    public final void f(final d80 d80) {
        if (this.K0 == null) {
            this.K0 = new ArrayList();
        }
        if (!this.K0.contains(d80)) {
            this.K0.add(d80);
        }
    }
    
    public final boolean g(final boolean b, final boolean b2, final boolean b3) {
        final float a = this.H0.a(this.F0.getContentResolver());
        return this.h(b, b2, b3 && a > 0.0f);
    }
    
    public final int getAlpha() {
        return this.O0;
    }
    
    public final int getOpacity() {
        return -3;
    }
    
    public boolean h(final boolean b, final boolean b2, final boolean b3) {
        if (this.I0 == null) {
            (this.I0 = (ValueAnimator)ObjectAnimator.ofFloat((Object)this, (Property)oe9.P0, new float[] { 0.0f, 1.0f })).setDuration(500L);
            this.I0.setInterpolator((TimeInterpolator)hc0.b);
            final ValueAnimator i0 = this.I0;
            if (i0 != null && i0.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            ((Animator)(this.I0 = i0)).addListener((Animator$AnimatorListener)new me9(this));
        }
        if (this.J0 == null) {
            (this.J0 = (ValueAnimator)ObjectAnimator.ofFloat((Object)this, (Property)oe9.P0, new float[] { 1.0f, 0.0f })).setDuration(500L);
            this.J0.setInterpolator((TimeInterpolator)hc0.b);
            final ValueAnimator j0 = this.J0;
            if (j0 != null && j0.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            ((Animator)(this.J0 = j0)).addListener((Animator$AnimatorListener)new ne9(this));
        }
        final boolean visible = this.isVisible();
        final int n = 0;
        if (!visible && !b) {
            return false;
        }
        ValueAnimator valueAnimator;
        if (b) {
            valueAnimator = this.I0;
        }
        else {
            valueAnimator = this.J0;
        }
        if (!b3) {
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            }
            else {
                final boolean l0 = this.L0;
                this.L0 = true;
                for (int k = 0; k < 1; ++k) {
                    (new ValueAnimator[] { valueAnimator })[k].end();
                }
                this.L0 = l0;
            }
            return super.setVisible(b, false);
        }
        if (b3 && valueAnimator.isRunning()) {
            return false;
        }
        final boolean b4 = !b || super.setVisible(b, false);
        if (!(b ? (this.G0.e != 0) : (this.G0.f != 0))) {
            final boolean l2 = this.L0;
            this.L0 = true;
            for (int n2 = n; n2 < 1; ++n2) {
                (new ValueAnimator[] { valueAnimator })[n2].end();
            }
            this.L0 = l2;
            return b4;
        }
        if (!b2 && ((Animator)valueAnimator).isPaused()) {
            valueAnimator.resume();
        }
        else {
            valueAnimator.start();
        }
        return b4;
    }
    
    public final boolean i(final d80 d80) {
        final ArrayList k0 = this.K0;
        if (k0 != null && k0.contains(d80)) {
            this.K0.remove(d80);
            if (this.K0.isEmpty()) {
                this.K0 = null;
            }
            return true;
        }
        return false;
    }
    
    public final boolean isRunning() {
        return this.e() || this.d();
    }
    
    public final void setAlpha(final int o0) {
        this.O0 = o0;
        this.invalidateSelf();
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        this.N0.setColorFilter(colorFilter);
        this.invalidateSelf();
    }
    
    public final boolean setVisible(final boolean b, final boolean b2) {
        return this.g(b, b2, true);
    }
    
    public final void start() {
        this.h(true, true, false);
    }
    
    public final void stop() {
        this.h(false, true, false);
    }
}
