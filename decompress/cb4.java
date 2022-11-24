import android.animation.ValueAnimator;
import android.animation.Animator;
import android.graphics.drawable.Drawable;
import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ObjectAnimator;
import android.util.Property;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cb4 extends tn1
{
    public static final int[] l;
    public static final int[] m;
    public static final int[] n;
    public static final Property<cb4, Float> o;
    public static final Property<cb4, Float> p;
    public ObjectAnimator d;
    public ObjectAnimator e;
    public final ssa f;
    public final gb4 g;
    public int h;
    public float i;
    public float j;
    public d80 k;
    
    static {
        l = new int[] { 0, 1350, 2700, 4050 };
        m = new int[] { 667, 2017, 3367, 4717 };
        n = new int[] { 1000, 2350, 3700, 5050 };
        cb4.o = new Property<cb4, Float>() {
            public final Object get(final Object o) {
                return ((cb4)o).i;
            }
            
            public final void set(final Object o, final Object o2) {
                final cb4 cb4 = (cb4)o;
                final float floatValue = (float)o2;
                cb4.i = floatValue;
                final int n = (int)(5400.0f * floatValue);
                final float[] array = (float[])cb4.b;
                final float n2 = floatValue * 1520.0f;
                array[0] = -20.0f + n2;
                array[1] = n2;
                for (int i = 0; i < 4; ++i) {
                    final float n3 = (float)(n - cb4.l[i]);
                    final float n4 = 667;
                    final float n5 = n3 / n4;
                    final float[] array2 = (float[])cb4.b;
                    array2[1] += cb4.f.getInterpolation(n5) * 250.0f;
                    final float n6 = (n - cb4.m[i]) / n4;
                    final float[] array3 = (float[])cb4.b;
                    array3[0] += cb4.f.getInterpolation(n6) * 250.0f;
                }
                final float[] array4 = (float[])cb4.b;
                array4[0] += (array4[1] - array4[0]) * cb4.j;
                array4[0] /= 360.0f;
                array4[1] /= 360.0f;
                for (int j = 0; j < 4; ++j) {
                    final float n7 = (n - cb4.n[j]) / (float)333;
                    if (n7 >= 0.0f && n7 <= 1.0f) {
                        final int h = cb4.h;
                        final int[] c = cb4.g.c;
                        final int n8 = (j + h) % c.length;
                        ((int[])cb4.c)[0] = cs0.a.a(cb4.f.getInterpolation(n7), Integer.valueOf(ak1.f(c[n8], ((oe9)cb4.a).O0)), Integer.valueOf(ak1.f(cb4.g.c[(n8 + 1) % c.length], ((oe9)cb4.a).O0)));
                        break;
                    }
                }
                ((Drawable)cb4.a).invalidateSelf();
            }
        };
        cb4.p = new Property<cb4, Float>() {
            public final Object get(final Object o) {
                return ((cb4)o).j;
            }
            
            public final void set(final Object o, final Object o2) {
                ((cb4)o).j = (float)o2;
            }
        };
    }
    
    public cb4(final gb4 g) {
        this.h = 0;
        this.k = null;
        this.g = g;
        this.f = new ssa();
    }
    
    @Override
    public final void c() {
        final ObjectAnimator d = this.d;
        if (d != null) {
            ((Animator)d).cancel();
        }
    }
    
    @Override
    public final void f() {
        this.k();
    }
    
    @Override
    public final void g(final d80 k) {
        this.k = k;
    }
    
    @Override
    public final void h() {
        final ObjectAnimator e = this.e;
        if (e != null) {
            if (!((Animator)e).isRunning()) {
                if (((Drawable)super.a).isVisible()) {
                    this.e.start();
                }
                else {
                    this.c();
                }
            }
        }
    }
    
    @Override
    public final void i() {
        if (this.d == null) {
            (this.d = ObjectAnimator.ofFloat((Object)this, (Property)cb4.o, new float[] { 0.0f, 1.0f })).setDuration(5400L);
            ((Animator)this.d).setInterpolator((TimeInterpolator)null);
            ((ValueAnimator)this.d).setRepeatCount(-1);
            ((Animator)this.d).addListener((Animator$AnimatorListener)new ab4(this));
        }
        if (this.e == null) {
            (this.e = ObjectAnimator.ofFloat((Object)this, (Property)cb4.p, new float[] { 0.0f, 1.0f })).setDuration(333L);
            ((Animator)this.e).setInterpolator((TimeInterpolator)this.f);
            ((Animator)this.e).addListener((Animator$AnimatorListener)new bb4(this));
        }
        this.k();
        this.d.start();
    }
    
    @Override
    public final void j() {
        this.k = null;
    }
    
    public final void k() {
        this.h = 0;
        ((int[])super.c)[0] = ak1.f(this.g.c[0], ((oe9)super.a).O0);
        this.j = 0.0f;
    }
}
