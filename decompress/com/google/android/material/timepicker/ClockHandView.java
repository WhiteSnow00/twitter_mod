// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import java.util.Objects;
import android.view.accessibility.AccessibilityManager;
import android.view.MotionEvent;
import android.graphics.Canvas;
import java.util.Iterator;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.util.Pair;
import java.util.WeakHashMap;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.Paint;
import java.util.List;
import android.animation.ValueAnimator;
import android.view.View;

class ClockHandView extends View
{
    public static final /* synthetic */ int T0 = 0;
    public ValueAnimator C0;
    public boolean D0;
    public float E0;
    public float F0;
    public boolean G0;
    public int H0;
    public final List<d> I0;
    public final int J0;
    public final float K0;
    public final Paint L0;
    public final RectF M0;
    public final int N0;
    public float O0;
    public boolean P0;
    public c Q0;
    public double R0;
    public int S0;
    
    public ClockHandView(final Context context, final AttributeSet set) {
        super(context, set, 2130970108);
        this.I0 = new ArrayList();
        final Paint l0 = new Paint();
        this.L0 = l0;
        this.M0 = new RectF();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, rp2.W0, 2130970108, 2132019430);
        this.S0 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.J0 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        final Resources resources = this.getResources();
        this.N0 = resources.getDimensionPixelSize(2131166339);
        this.K0 = (float)resources.getDimensionPixelSize(2131166337);
        final int color = obtainStyledAttributes.getColor(0, 0);
        l0.setAntiAlias(true);
        l0.setColor(color);
        this.b(0.0f, false);
        this.H0 = ViewConfiguration.get(context).getScaledTouchSlop();
        final WeakHashMap a = p5x.a;
        p5x$d.s((View)this, 2);
        obtainStyledAttributes.recycle();
    }
    
    public final int a(final float n, final float n2) {
        int n4;
        final int n3 = n4 = (int)Math.toDegrees(Math.atan2(n2 - this.getHeight() / 2, n - this.getWidth() / 2)) + 90;
        if (n3 < 0) {
            n4 = n3 + 360;
        }
        return n4;
    }
    
    public final void b(final float n, final boolean b) {
        final ValueAnimator c0 = this.C0;
        if (c0 != null) {
            c0.cancel();
        }
        if (!b) {
            this.c(n, false);
            return;
        }
        final float o0 = this.O0;
        float n2 = n;
        float n3 = o0;
        if (Math.abs(o0 - n) > 180.0f) {
            float n4 = n;
            if (o0 > 180.0f) {
                n4 = n;
                if (n < 180.0f) {
                    n4 = n + 360.0f;
                }
            }
            n2 = n4;
            n3 = o0;
            if (o0 < 180.0f) {
                n2 = n4;
                n3 = o0;
                if (n4 > 180.0f) {
                    n3 = o0 + 360.0f;
                    n2 = n4;
                }
            }
        }
        final Pair pair = new Pair((Object)n3, (Object)n2);
        (this.C0 = ValueAnimator.ofFloat(new float[] { (float)pair.first, (float)pair.second })).setDuration(200L);
        this.C0.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener() {
            public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
                final float floatValue = (float)valueAnimator.getAnimatedValue();
                final ClockHandView c0 = ClockHandView.this;
                final int t0 = ClockHandView.T0;
                c0.c(floatValue, true);
            }
        });
        ((Animator)this.C0).addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public final void onAnimationCancel(final Animator animator) {
                animator.end();
            }
        });
        this.C0.start();
    }
    
    public final void c(float o0, final boolean b) {
        o0 %= 360.0f;
        this.O0 = o0;
        this.R0 = Math.toRadians(o0 - 90.0f);
        final int n = this.getHeight() / 2;
        final float n2 = this.S0 * (float)Math.cos(this.R0) + this.getWidth() / 2;
        final float n3 = this.S0 * (float)Math.sin(this.R0) + n;
        final RectF m0 = this.M0;
        final float n4 = (float)this.J0;
        m0.set(n2 - n4, n3 - n4, n2 + n4, n3 + n4);
        final Iterator iterator = this.I0.iterator();
        while (iterator.hasNext()) {
            ((d)iterator.next()).e(o0, b);
        }
        this.invalidate();
    }
    
    public final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final int n = this.getHeight() / 2;
        final int n2 = this.getWidth() / 2;
        final float n3 = (float)n2;
        final float n4 = (float)this.S0;
        final float n5 = (float)Math.cos(this.R0);
        final float n6 = (float)n;
        final float n7 = (float)this.S0;
        final float n8 = (float)Math.sin(this.R0);
        this.L0.setStrokeWidth(0.0f);
        canvas.drawCircle(n4 * n5 + n3, n7 * n8 + n6, (float)this.J0, this.L0);
        final double sin = Math.sin(this.R0);
        final double cos = Math.cos(this.R0);
        final double n9 = (float)(this.S0 - this.J0);
        final float n10 = (float)(n2 + (int)(cos * n9));
        final float n11 = (float)(n + (int)(n9 * sin));
        this.L0.setStrokeWidth((float)this.N0);
        canvas.drawLine(n3, n6, n10, n11, this.L0);
        canvas.drawCircle(n3, n6, this.K0, this.L0);
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        this.b(this.O0, false);
    }
    
    @SuppressLint({ "ClickableViewAccessibility" })
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final float x = motionEvent.getX();
        final float y = motionEvent.getY();
        boolean b;
        boolean p;
        boolean b2;
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                b = false;
                p = false;
            }
            else {
                final int n = (int)(x - this.E0);
                final int n2 = (int)(y - this.F0);
                this.G0 = (n2 * n2 + n * n > this.H0);
                p = this.P0;
                b = (actionMasked == 1);
            }
            b2 = false;
        }
        else {
            this.E0 = x;
            this.F0 = y;
            this.G0 = true;
            this.P0 = false;
            b = false;
            p = false;
            b2 = true;
        }
        final boolean p2 = this.P0;
        final int a = this.a(x, y);
        final float o0 = this.O0;
        final float n3 = (float)a;
        final boolean b3 = o0 != n3;
        int n4 = 0;
        Label_0252: {
            if (!b2 || !b3) {
                if (!b3 && !p) {
                    n4 = 0;
                    break Label_0252;
                }
                this.b(n3, b && this.D0);
            }
            n4 = 1;
        }
        final int p3 = n4 | (p2 ? 1 : 0);
        this.P0 = (p3 != 0);
        if (p3 && b) {
            final c q0 = this.Q0;
            if (q0 != null) {
                final float n5 = (float)this.a(x, y);
                final boolean g0 = this.G0;
                final com.google.android.material.timepicker.d d = (com.google.android.material.timepicker.d)q0;
                d.G0 = true;
                final tps d2 = d.D0;
                final int g2 = d2.G0;
                final int f0 = d2.F0;
                if (d2.H0 == 10) {
                    d.C0.z(d.F0, false);
                    final AccessibilityManager accessibilityManager = (AccessibilityManager)eo6.c(((View)d.C0).getContext(), (Class)AccessibilityManager.class);
                    if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                        d.d(12, true);
                    }
                }
                else {
                    final int round = Math.round(n5);
                    if (!g0) {
                        final int n6 = (round + 15) / 30;
                        final tps d3 = d.D0;
                        Objects.requireNonNull(d3);
                        d3.G0 = n6 * 5 % 60;
                        d.E0 = (float)(d.D0.G0 * 6);
                    }
                    d.C0.z(d.E0, g0);
                }
                d.G0 = false;
                d.f();
                final tps d4 = d.D0;
                if (d4.G0 != g2 || d4.F0 != f0) {
                    ((View)d.C0).performHapticFeedback(4);
                }
            }
        }
        return true;
    }
    
    public interface c
    {
    }
    
    public interface d
    {
        void e(final float p0, final boolean p1);
    }
}
