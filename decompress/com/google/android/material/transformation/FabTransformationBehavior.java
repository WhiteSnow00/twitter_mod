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
    
    public final void d(final CoordinatorLayout.f f) {
        if (f.h == 0) {
            f.h = 80;
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
        final WeakHashMap a = j6x.a;
        final float n = j6x$i.i(view2) - j6x$i.i(view);
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
        final Pair<krh, krh> w = this.w(x, y, b, b3);
        final krh krh = (krh)w.first;
        final krh krh2 = (krh)w.second;
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
            final float z = this.z(b3, krh, n2);
            final float z2 = this.z(b3, krh2, n3);
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
        krh.a((Animator)objectAnimator2);
        krh2.a((Animator)objectAnimator3);
        list.add(objectAnimator2);
        list.add(objectAnimator3);
        final float width = d.width();
        final float height = d.height();
        float n4 = this.x(view, view2, b3.b);
        final float y2 = this.y(view, view2, b3.b);
        final Pair<krh, krh> w2 = this.w(n4, y2, b, b3);
        final krh krh3 = (krh)w2.first;
        final krh krh4 = (krh)w2.second;
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
        krh3.a((Animator)ofFloat);
        krh4.a((Animator)ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
        final boolean b4 = view2 instanceof ka4;
        if (b4) {
            if (view instanceof ImageView) {
                final ka4 ka4 = (ka4)view2;
                final Drawable drawable = ((ImageView)view).getDrawable();
                if (drawable != null) {
                    drawable.mutate();
                    ObjectAnimator objectAnimator4;
                    if (b) {
                        if (!b2) {
                            drawable.setAlpha(255);
                        }
                        objectAnimator4 = ObjectAnimator.ofInt((Object)drawable, (Property)wc9.a, new int[] { 0 });
                    }
                    else {
                        objectAnimator4 = ObjectAnimator.ofInt((Object)drawable, (Property)wc9.a, new int[] { 255 });
                    }
                    ((ValueAnimator)objectAnimator4).addUpdateListener((ValueAnimator$AnimatorUpdateListener)new a(view2));
                    b3.a.d("iconFade").a((Animator)objectAnimator4);
                    list.add(objectAnimator4);
                    list2.add(new b(ka4, drawable));
                }
            }
        }
        if (b4) {
            final ka4 ka5 = (ka4)view2;
            final wj1 b5 = b3.b;
            final RectF d3 = this.d;
            final RectF e2 = this.e;
            this.v(view, d3);
            this.A(view2, e2);
            e2.offset(-this.x(view, view2, b5), 0.0f);
            final float n5 = d3.centerX() - e2.left;
            final wj1 b6 = b3.b;
            final RectF d4 = this.d;
            final RectF e3 = this.e;
            this.v(view, d4);
            this.A(view2, e3);
            e3.offset(0.0f, -this.y(view, view2, b6));
            final float n6 = d4.centerY() - e3.top;
            ((FloatingActionButton)view).g(this.c);
            float c2 = this.c.width() / 2.0f;
            final krh d5 = b3.a.d("expansion");
            krh krh5;
            Animator animator;
            if (b) {
                if (!b2) {
                    ka5.setRevealInfo(new ka4$d(n5, n6, c2));
                }
                if (b2) {
                    c2 = ka5.getRevealInfo().c;
                }
                float m = c9y.m(n5, n6, 0.0f, 0.0f);
                final float i = c9y.m(n5, n6, width, 0.0f);
                final float j = c9y.m(n5, n6, width, height);
                final float k = c9y.m(n5, n6, 0.0f, height);
                if (m <= i || m <= j || m <= k) {
                    if (i > j && i > k) {
                        m = i;
                    }
                    else if (j > k) {
                        m = j;
                    }
                    else {
                        m = k;
                    }
                }
                final Animator a2 = ia4.a(ka5, n5, n6, m);
                a2.addListener((Animator$AnimatorListener)new c(ka5));
                final long a3 = d5.a;
                final int n7 = (int)n5;
                final int n8 = (int)n6;
                if (a3 > 0L) {
                    final Animator circularReveal = ViewAnimationUtils.createCircularReveal(view2, n7, n8, c2, c2);
                    circularReveal.setStartDelay(0L);
                    circularReveal.setDuration(a3);
                    list.add(circularReveal);
                }
                krh5 = d5;
                animator = a2;
            }
            else {
                final float c3 = ka5.getRevealInfo().c;
                final Animator a4 = ia4.a(ka5, n5, n6, c2);
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
                final jrh a7 = b3.a;
                final int f0 = a7.a.F0;
                int l = 0;
                long max = 0L;
                while (l < f0) {
                    final krh krh6 = a7.a.m(l);
                    max = Math.max(max, krh6.a + krh6.b);
                    ++l;
                }
                final long startDelay = a6 + b7;
                if (startDelay < max) {
                    final Animator circularReveal3 = ViewAnimationUtils.createCircularReveal(view2, n9, n10, c2, c2);
                    circularReveal3.setStartDelay(startDelay);
                    circularReveal3.setDuration(max - startDelay);
                    list.add(circularReveal3);
                }
                krh5 = d5;
                animator = a4;
            }
            krh5.a(animator);
            list.add(animator);
            list2.add(new ha4(ka5));
        }
        final ArrayList list3 = list2;
        if (b4) {
            final ka4 ka6 = (ka4)view2;
            final WeakHashMap a8 = j6x.a;
            final ColorStateList g = j6x$i.g(view);
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
                    ka6.setCircularRevealScrimColor(colorForState);
                }
                objectAnimator5 = ObjectAnimator.ofInt((Object)ka6, (Property)ka4$c.a, new int[] { 0xFFFFFF & colorForState });
            }
            else {
                objectAnimator5 = ObjectAnimator.ofInt((Object)ka6, (Property)ka4$c.a, new int[] { colorForState });
            }
            ((ValueAnimator)objectAnimator5).setEvaluator((TypeEvaluator)zr0.a);
            b3.a.d("color").a((Animator)objectAnimator5);
            list.add(objectAnimator5);
        }
        if (view2 instanceof ViewGroup) {
            final View viewById = view2.findViewById(2131430151);
            ViewGroup viewGroup;
            if (viewById != null) {
                viewGroup = this.C(viewById);
            }
            else if (!(view2 instanceof azt) && !(view2 instanceof zyt)) {
                viewGroup = this.C(view2);
            }
            else {
                viewGroup = this.C(((ViewGroup)view2).getChildAt(0));
            }
            if (viewGroup != null) {
                ObjectAnimator objectAnimator6;
                if (b) {
                    if (!b2) {
                        c84.a.set(viewGroup, 0.0f);
                    }
                    objectAnimator6 = ObjectAnimator.ofFloat((Object)viewGroup, (Property)c84.a, new float[] { 1.0f });
                }
                else {
                    objectAnimator6 = ObjectAnimator.ofFloat((Object)viewGroup, (Property)c84.a, new float[] { 0.0f });
                }
                b3.a.d("contentFade").a((Animator)objectAnimator6);
                list.add(objectAnimator6);
            }
        }
        int n11 = 0;
        final AnimatorSet set = new AnimatorSet();
        af8.G(set, (List)list);
        ((Animator)set).addListener((Animator$AnimatorListener)new FabTransformationBehavior$a(b, view2, view));
        while (n11 < list3.size()) {
            ((Animator)set).addListener((Animator$AnimatorListener)list3.get(n11));
            ++n11;
        }
        return set;
    }
    
    public final void v(final View view, final RectF rectF) {
        this.A(view, rectF);
        rectF.offset(this.g, this.h);
    }
    
    public final Pair<krh, krh> w(final float n, final float n2, final boolean b, final FabTransformationBehavior.FabTransformationBehavior$b fabTransformationBehavior$b) {
        if (n != 0.0f) {
            final float n3 = fcmpl(n2, 0.0f);
            if (n3 != 0) {
                if ((b && n2 < 0.0f) || (!b && n3 > 0)) {
                    final krh d = fabTransformationBehavior$b.a.d("translationXCurveUpwards");
                    final krh d2 = fabTransformationBehavior$b.a.d("translationYCurveUpwards");
                    final krh krh = d;
                    final krh krh2 = d2;
                    return (Pair<krh, krh>)new Pair((Object)krh, (Object)krh2);
                }
                final krh d3 = fabTransformationBehavior$b.a.d("translationXCurveDownwards");
                final krh krh2 = fabTransformationBehavior$b.a.d("translationYCurveDownwards");
                final krh krh = d3;
                return (Pair<krh, krh>)new Pair((Object)krh, (Object)krh2);
            }
        }
        final krh d4 = fabTransformationBehavior$b.a.d("translationXLinear");
        final krh krh2 = fabTransformationBehavior$b.a.d("translationYLinear");
        final krh krh = d4;
        return (Pair<krh, krh>)new Pair((Object)krh, (Object)krh2);
    }
    
    public final float x(final View view, final View view2, final wj1 wj1) {
        final RectF d = this.d;
        final RectF e = this.e;
        this.v(view, d);
        this.A(view2, e);
        Objects.requireNonNull(wj1);
        return e.centerX() - d.centerX() + 0.0f;
    }
    
    public final float y(final View view, final View view2, final wj1 wj1) {
        final RectF d = this.d;
        final RectF e = this.e;
        this.v(view, d);
        this.A(view2, e);
        Objects.requireNonNull(wj1);
        return e.centerY() - d.centerY() + 0.0f;
    }
    
    public final float z(final FabTransformationBehavior.FabTransformationBehavior$b fabTransformationBehavior$b, final krh krh, final float n) {
        final long a = krh.a;
        final long b = krh.b;
        final krh d = fabTransformationBehavior$b.a.d("expansion");
        final float interpolation = krh.b().getInterpolation((d.a + d.b + 17L - a) / (float)b);
        final LinearInterpolator a2 = gc0.a;
        return k6e.e(0.0f, n, interpolation, n);
    }
}
