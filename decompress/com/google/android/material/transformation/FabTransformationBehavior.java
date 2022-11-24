// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.transformation;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import java.util.Objects;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import java.util.WeakHashMap;
import java.util.List;
import android.animation.TypeEvaluator;
import android.view.ViewAnimationUtils;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.util.Property;
import android.widget.ImageView;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import android.animation.AnimatorSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout$f;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.ViewGroup;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.Rect;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior
{
    public final Rect c;
    public final RectF d;
    public final RectF e;
    public final int[] f;
    public float g;
    public float h;
    
    public FabTransformationBehavior() {
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }
    
    public FabTransformationBehavior(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }
    
    public final void A(final View view, final RectF rectF) {
        rectF.set(0.0f, 0.0f, (float)view.getWidth(), (float)view.getHeight());
        final int[] f = this.f;
        view.getLocationInWindow(f);
        rectF.offsetTo((float)f[0], (float)f[1]);
        rectF.offset((float)(int)(-view.getTranslationX()), (float)(int)(-view.getTranslationY()));
    }
    
    public abstract FabTransformationBehavior.FabTransformationBehavior$b B(final Context p0, final boolean p1);
    
    public final ViewGroup C(final View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup)view;
        }
        return null;
    }
    
    public final boolean c(final CoordinatorLayout coordinatorLayout, final View view, final View view2) {
        if (view.getVisibility() != 8) {
            final boolean b = view2 instanceof FloatingActionButton;
            boolean b2 = false;
            if (b) {
                final int expandedComponentIdHint = ((FloatingActionButton)view2).getExpandedComponentIdHint();
                if (expandedComponentIdHint != 0) {
                    b2 = b2;
                    if (expandedComponentIdHint != view.getId()) {
                        return b2;
                    }
                }
                b2 = true;
            }
            return b2;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }
    
    public final void d(final CoordinatorLayout$f coordinatorLayout$f) {
        if (coordinatorLayout$f.h == 0) {
            coordinatorLayout$f.h = 80;
        }
    }
    
    public final AnimatorSet u(final View view, final View view2, final boolean b, final boolean b2) {
        final FabTransformationBehavior.FabTransformationBehavior$b b3 = this.B(view2.getContext(), b);
        if (b) {
            this.g = view.getTranslationX();
            this.h = view.getTranslationY();
        }
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        final WeakHashMap a = b7x.a;
        final float n = b7x$i.i(view2) - b7x$i.i(view);
        ObjectAnimator objectAnimator;
        if (b) {
            if (!b2) {
                view2.setTranslationZ(-n);
            }
            objectAnimator = ObjectAnimator.ofFloat((Object)view2, View.TRANSLATION_Z, new float[] { 0.0f });
        }
        else {
            objectAnimator = ObjectAnimator.ofFloat((Object)view2, View.TRANSLATION_Z, new float[] { -n });
        }
        b3.a.d("elevation").a((Animator)objectAnimator);
        list.add(objectAnimator);
        final RectF d = this.d;
        final float x = this.x(view, view2, b3.b);
        final float y = this.y(view, view2, b3.b);
        final Pair<zrh, zrh> w = this.w(x, y, b, b3);
        final zrh zrh = (zrh)w.first;
        final zrh zrh2 = (zrh)w.second;
        ObjectAnimator objectAnimator2;
        ObjectAnimator objectAnimator3;
        if (b) {
            if (!b2) {
                view2.setTranslationX(-x);
                view2.setTranslationY(-y);
            }
            objectAnimator2 = ObjectAnimator.ofFloat((Object)view2, View.TRANSLATION_X, new float[] { 0.0f });
            objectAnimator3 = ObjectAnimator.ofFloat((Object)view2, View.TRANSLATION_Y, new float[] { 0.0f });
            final float n2 = -x;
            final float n3 = -y;
            final float z = this.z(b3, zrh, n2);
            final float z2 = this.z(b3, zrh2, n3);
            final Rect c = this.c;
            view2.getWindowVisibleDisplayFrame(c);
            final RectF d2 = this.d;
            d2.set(c);
            final RectF e = this.e;
            this.A(view2, e);
            e.offset(z, z2);
            e.intersect(d2);
            d.set(e);
        }
        else {
            objectAnimator2 = ObjectAnimator.ofFloat((Object)view2, View.TRANSLATION_X, new float[] { -x });
            objectAnimator3 = ObjectAnimator.ofFloat((Object)view2, View.TRANSLATION_Y, new float[] { -y });
        }
        zrh.a((Animator)objectAnimator2);
        zrh2.a((Animator)objectAnimator3);
        list.add(objectAnimator2);
        list.add(objectAnimator3);
        final float width = d.width();
        final float height = d.height();
        float n4 = this.x(view, view2, b3.b);
        final float y2 = this.y(view, view2, b3.b);
        final Pair<zrh, zrh> w2 = this.w(n4, y2, b, b3);
        final zrh zrh3 = (zrh)w2.first;
        final zrh zrh4 = (zrh)w2.second;
        final Property translation_X = View.TRANSLATION_X;
        if (!b) {
            n4 = this.g;
        }
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)view, translation_X, new float[] { n4 });
        final Property translation_Y = View.TRANSLATION_Y;
        float h;
        if (b) {
            h = y2;
        }
        else {
            h = this.h;
        }
        final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object)view, translation_Y, new float[] { h });
        zrh3.a((Animator)ofFloat);
        zrh4.a((Animator)ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
        final boolean b4 = view2 instanceof nb4;
        if (b4) {
            if (view instanceof ImageView) {
                final nb4 nb4 = (nb4)view2;
                final Drawable drawable = ((ImageView)view).getDrawable();
                if (drawable != null) {
                    drawable.mutate();
                    ObjectAnimator objectAnimator4;
                    if (b) {
                        if (!b2) {
                            drawable.setAlpha(255);
                        }
                        objectAnimator4 = ObjectAnimator.ofInt((Object)drawable, (Property)zd9.a, new int[] { 0 });
                    }
                    else {
                        objectAnimator4 = ObjectAnimator.ofInt((Object)drawable, (Property)zd9.a, new int[] { 255 });
                    }
                    ((ValueAnimator)objectAnimator4).addUpdateListener((ValueAnimator$AnimatorUpdateListener)new a(view2));
                    b3.a.d("iconFade").a((Animator)objectAnimator4);
                    list.add(objectAnimator4);
                    list2.add(new b(nb4, drawable));
                }
            }
        }
        if (b4) {
            final nb4 nb5 = (nb4)view2;
            final xd b5 = b3.b;
            final RectF d3 = this.d;
            final RectF e2 = this.e;
            this.v(view, d3);
            this.A(view2, e2);
            e2.offset(-this.x(view, view2, b5), 0.0f);
            final float n5 = d3.centerX() - e2.left;
            final xd b6 = b3.b;
            final RectF d4 = this.d;
            final RectF e3 = this.e;
            this.v(view, d4);
            this.A(view2, e3);
            e3.offset(0.0f, -this.y(view, view2, b6));
            final float n6 = d4.centerY() - e3.top;
            ((FloatingActionButton)view).g(this.c);
            float c2 = this.c.width() / 2.0f;
            final zrh d5 = b3.a.d("expansion");
            Animator a2;
            if (b) {
                if (!b2) {
                    nb5.setRevealInfo(new nb4$d(n5, n6, c2));
                }
                if (b2) {
                    c2 = nb5.getRevealInfo().c;
                }
                float t = p4j.t(n5, n6, 0.0f, 0.0f);
                final float t2 = p4j.t(n5, n6, width, 0.0f);
                final float t3 = p4j.t(n5, n6, width, height);
                final float t4 = p4j.t(n5, n6, 0.0f, height);
                if (t <= t2 || t <= t3 || t <= t4) {
                    if (t2 > t3 && t2 > t4) {
                        t = t2;
                    }
                    else if (t3 > t4) {
                        t = t3;
                    }
                    else {
                        t = t4;
                    }
                }
                a2 = lb4.a(nb5, n5, n6, t);
                a2.addListener((Animator$AnimatorListener)new c(nb5));
                final long a3 = d5.a;
                final int n7 = (int)n5;
                final int n8 = (int)n6;
                if (a3 > 0L) {
                    final Animator circularReveal = ViewAnimationUtils.createCircularReveal(view2, n7, n8, c2, c2);
                    circularReveal.setStartDelay(0L);
                    circularReveal.setDuration(a3);
                    list.add(circularReveal);
                }
            }
            else {
                final float c3 = nb5.getRevealInfo().c;
                final Animator a4 = lb4.a(nb5, n5, n6, c2);
                final long a5 = d5.a;
                final int n9 = (int)n5;
                final int n10 = (int)n6;
                if (a5 > 0L) {
                    final Animator circularReveal2 = ViewAnimationUtils.createCircularReveal(view2, n9, n10, c3, c3);
                    circularReveal2.setStartDelay(0L);
                    circularReveal2.setDuration(a5);
                    list.add(circularReveal2);
                }
                final long a6 = d5.a;
                final long b7 = d5.b;
                final yrh a7 = b3.a;
                final int h2 = a7.a.H0;
                int i = 0;
                long max = 0L;
                while (i < h2) {
                    final zrh zrh5 = (zrh)a7.a.n(i);
                    max = Math.max(max, zrh5.a + zrh5.b);
                    ++i;
                }
                final long startDelay = a6 + b7;
                if (startDelay < max) {
                    final Animator circularReveal3 = ViewAnimationUtils.createCircularReveal(view2, n9, n10, c2, c2);
                    circularReveal3.setStartDelay(startDelay);
                    circularReveal3.setDuration(max - startDelay);
                    list.add(circularReveal3);
                }
                a2 = a4;
            }
            d5.a(a2);
            list.add(a2);
            list2.add(new kb4(nb5));
        }
        final ArrayList list3 = list2;
        if (b4) {
            final nb4 nb6 = (nb4)view2;
            final WeakHashMap a8 = b7x.a;
            final ColorStateList g = b7x$i.g(view);
            int colorForState;
            if (g != null) {
                colorForState = g.getColorForState(view.getDrawableState(), g.getDefaultColor());
            }
            else {
                colorForState = 0;
            }
            ObjectAnimator objectAnimator5;
            if (b) {
                if (!b2) {
                    nb6.setCircularRevealScrimColor(colorForState);
                }
                objectAnimator5 = ObjectAnimator.ofInt((Object)nb6, (Property)nb4$c.a, new int[] { 0xFFFFFF & colorForState });
            }
            else {
                objectAnimator5 = ObjectAnimator.ofInt((Object)nb6, (Property)nb4$c.a, new int[] { colorForState });
            }
            ((ValueAnimator)objectAnimator5).setEvaluator((TypeEvaluator)cs0.a);
            b3.a.d("color").a((Animator)objectAnimator5);
            list.add(objectAnimator5);
        }
        if (view2 instanceof ViewGroup) {
            final View viewById = view2.findViewById(2131430152);
            ViewGroup viewGroup;
            if (viewById != null) {
                viewGroup = this.C(viewById);
            }
            else if (!(view2 instanceof tzt) && !(view2 instanceof szt)) {
                viewGroup = this.C(view2);
            }
            else {
                viewGroup = this.C(((ViewGroup)view2).getChildAt(0));
            }
            if (viewGroup != null) {
                ObjectAnimator objectAnimator6;
                if (b) {
                    if (!b2) {
                        h94.a.set((Object)viewGroup, (Object)0.0f);
                    }
                    objectAnimator6 = ObjectAnimator.ofFloat((Object)viewGroup, (Property)h94.a, new float[] { 1.0f });
                }
                else {
                    objectAnimator6 = ObjectAnimator.ofFloat((Object)viewGroup, (Property)h94.a, new float[] { 0.0f });
                }
                b3.a.d("contentFade").a((Animator)objectAnimator6);
                list.add(objectAnimator6);
            }
        }
        int j = 0;
        final AnimatorSet set = new AnimatorSet();
        w9y.r(set, list);
        ((Animator)set).addListener((Animator$AnimatorListener)new FabTransformationBehavior$a(b, view2, view));
        while (j < list3.size()) {
            ((Animator)set).addListener((Animator$AnimatorListener)list3.get(j));
            ++j;
        }
        return set;
    }
    
    public final void v(final View view, final RectF rectF) {
        this.A(view, rectF);
        rectF.offset(this.g, this.h);
    }
    
    public final Pair<zrh, zrh> w(final float n, final float n2, final boolean b, final FabTransformationBehavior.FabTransformationBehavior$b fabTransformationBehavior$b) {
        if (n != 0.0f) {
            final float n3 = fcmpl(n2, 0.0f);
            if (n3 != 0) {
                if ((b && n2 < 0.0f) || (!b && n3 > 0)) {
                    final zrh d = fabTransformationBehavior$b.a.d("translationXCurveUpwards");
                    final zrh d2 = fabTransformationBehavior$b.a.d("translationYCurveUpwards");
                    final zrh zrh = d;
                    final zrh d3 = d2;
                    return (Pair<zrh, zrh>)new Pair((Object)zrh, (Object)d3);
                }
                final zrh d4 = fabTransformationBehavior$b.a.d("translationXCurveDownwards");
                final zrh d5 = fabTransformationBehavior$b.a.d("translationYCurveDownwards");
                final zrh zrh = d4;
                final zrh d3 = d5;
                return (Pair<zrh, zrh>)new Pair((Object)zrh, (Object)d3);
            }
        }
        final zrh d6 = fabTransformationBehavior$b.a.d("translationXLinear");
        final zrh d3 = fabTransformationBehavior$b.a.d("translationYLinear");
        final zrh zrh = d6;
        return (Pair<zrh, zrh>)new Pair((Object)zrh, (Object)d3);
    }
    
    public final float x(final View view, final View view2, final xd xd) {
        final RectF d = this.d;
        final RectF e = this.e;
        this.v(view, d);
        this.A(view2, e);
        Objects.requireNonNull(xd);
        return e.centerX() - d.centerX() + 0.0f;
    }
    
    public final float y(final View view, final View view2, final xd xd) {
        final RectF d = this.d;
        final RectF e = this.e;
        this.v(view, d);
        this.A(view2, e);
        Objects.requireNonNull(xd);
        return e.centerY() - d.centerY() + 0.0f;
    }
    
    public final float z(final FabTransformationBehavior.FabTransformationBehavior$b fabTransformationBehavior$b, final zrh zrh, final float n) {
        final long a = zrh.a;
        final long b = zrh.b;
        final zrh d = fabTransformationBehavior$b.a.d("expansion");
        final float interpolation = zrh.b().getInterpolation((d.a + d.b + 17L - a) / (float)b);
        final LinearInterpolator a2 = hc0.a;
        return va.d(0.0f, n, interpolation, n);
    }
}
