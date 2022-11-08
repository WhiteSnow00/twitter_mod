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
import android.animation.AnimatorListenerAdapter;
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
    
    public abstract b B(final Context p0, final boolean p1);
    
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
        final b b3 = this.B(view2.getContext(), b);
        if (b) {
            this.g = view.getTranslationX();
            this.h = view.getTranslationY();
        }
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        final WeakHashMap a = p5x.a;
        final float n = p5x$i.i(view2) - p5x$i.i(view);
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
        final Pair<frh, frh> w = this.w(x, y, b, b3);
        final frh frh = (frh)w.first;
        final frh frh2 = (frh)w.second;
        ObjectAnimator objectAnimator2;
        ObjectAnimator ofFloat2;
        if (b) {
            if (!b2) {
                view2.setTranslationX(-x);
                view2.setTranslationY(-y);
            }
            objectAnimator2 = ObjectAnimator.ofFloat((Object)view2, View.TRANSLATION_X, new float[] { 0.0f });
            final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)view2, View.TRANSLATION_Y, new float[] { 0.0f });
            final float n2 = -x;
            final float n3 = -y;
            final float z = this.z(b3, frh, n2);
            final float z2 = this.z(b3, frh2, n3);
            final Rect c = this.c;
            view2.getWindowVisibleDisplayFrame(c);
            final RectF d2 = this.d;
            d2.set(c);
            final RectF e = this.e;
            this.A(view2, e);
            e.offset(z, z2);
            e.intersect(d2);
            d.set(e);
            ofFloat2 = ofFloat;
        }
        else {
            objectAnimator2 = ObjectAnimator.ofFloat((Object)view2, View.TRANSLATION_X, new float[] { -x });
            ofFloat2 = ObjectAnimator.ofFloat((Object)view2, View.TRANSLATION_Y, new float[] { -y });
        }
        final ArrayList list3 = list2;
        frh.a((Animator)objectAnimator2);
        frh2.a((Animator)ofFloat2);
        list.add(objectAnimator2);
        list.add(ofFloat2);
        final float width = d.width();
        final float height = d.height();
        float n4 = this.x(view, view2, b3.b);
        final float y2 = this.y(view, view2, b3.b);
        final Pair<frh, frh> w2 = this.w(n4, y2, b, b3);
        final frh frh3 = (frh)w2.first;
        final frh frh4 = (frh)w2.second;
        final Property translation_X = View.TRANSLATION_X;
        if (!b) {
            n4 = this.g;
        }
        final ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((Object)view, translation_X, new float[] { n4 });
        final Property translation_Y = View.TRANSLATION_Y;
        float h;
        if (b) {
            h = y2;
        }
        else {
            h = this.h;
        }
        final ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat((Object)view, translation_Y, new float[] { h });
        frh3.a((Animator)ofFloat3);
        frh4.a((Animator)ofFloat4);
        list.add(ofFloat3);
        list.add(ofFloat4);
        final boolean b4 = view2 instanceof gb4;
        if (b4) {
            if (view instanceof ImageView) {
                final gb4 gb4 = (gb4)view2;
                final Drawable drawable = ((ImageView)view).getDrawable();
                if (drawable != null) {
                    drawable.mutate();
                    ObjectAnimator objectAnimator3;
                    if (b) {
                        if (!b2) {
                            drawable.setAlpha(255);
                        }
                        objectAnimator3 = ObjectAnimator.ofInt((Object)drawable, (Property)od9.a, new int[] { 0 });
                    }
                    else {
                        objectAnimator3 = ObjectAnimator.ofInt((Object)drawable, (Property)od9.a, new int[] { 255 });
                    }
                    ((ValueAnimator)objectAnimator3).addUpdateListener((ValueAnimator$AnimatorUpdateListener)new a(view2));
                    b3.a.d("iconFade").a((Animator)objectAnimator3);
                    list.add(objectAnimator3);
                    list3.add(new com.google.android.material.transformation.b(gb4, drawable));
                }
            }
        }
        ArrayList list4;
        ArrayList list5;
        if (!b4) {
            list4 = list3;
            list5 = list;
        }
        else {
            final gb4 gb5 = (gb4)view2;
            final db2 b5 = b3.b;
            final RectF d3 = this.d;
            final RectF e2 = this.e;
            this.v(view, d3);
            this.A(view2, e2);
            e2.offset(-this.x(view, view2, b5), 0.0f);
            final float n5 = d3.centerX() - e2.left;
            final db2 b6 = b3.b;
            final RectF d4 = this.d;
            final RectF e3 = this.e;
            this.v(view, d4);
            this.A(view2, e3);
            e3.offset(0.0f, -this.y(view, view2, b6));
            final float n6 = d4.centerY() - e3.top;
            ((FloatingActionButton)view).g(this.c);
            float c2 = this.c.width() / 2.0f;
            final frh d5 = b3.a.d("expansion");
            Animator a2;
            if (b) {
                if (!b2) {
                    gb5.setRevealInfo(new gb4$d(n5, n6, c2));
                }
                if (b2) {
                    c2 = gb5.getRevealInfo().c;
                }
                float f = ck1.f(n5, n6, 0.0f, 0.0f);
                final float f2 = ck1.f(n5, n6, width, 0.0f);
                final float f3 = ck1.f(n5, n6, width, height);
                final float f4 = ck1.f(n5, n6, 0.0f, height);
                if (f <= f2 || f <= f3 || f <= f4) {
                    if (f2 > f3 && f2 > f4) {
                        f = f2;
                    }
                    else if (f3 > f4) {
                        f = f3;
                    }
                    else {
                        f = f4;
                    }
                }
                a2 = eb4.a(gb5, n5, n6, f);
                a2.addListener((Animator$AnimatorListener)new c(gb5));
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
                final float c3 = gb5.getRevealInfo().c;
                final Animator a4 = eb4.a(gb5, n5, n6, c2);
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
                final erh a7 = b3.a;
                final int e4 = a7.a.E0;
                int i = 0;
                long max = 0L;
                while (i < e4) {
                    final frh frh5 = (frh)a7.a.m(i);
                    max = Math.max(max, frh5.a + frh5.b);
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
            list3.add(new db4(gb5));
            list4 = list3;
            list5 = list;
        }
        if (b4) {
            final gb4 gb6 = (gb4)view2;
            final WeakHashMap a8 = p5x.a;
            final ColorStateList g = p5x$i.g(view);
            int colorForState;
            if (g != null) {
                colorForState = g.getColorForState(view.getDrawableState(), g.getDefaultColor());
            }
            else {
                colorForState = 0;
            }
            ObjectAnimator objectAnimator4;
            if (b) {
                if (!b2) {
                    gb6.setCircularRevealScrimColor(colorForState);
                }
                objectAnimator4 = ObjectAnimator.ofInt((Object)gb6, (Property)gb4$c.a, new int[] { 0xFFFFFF & colorForState });
            }
            else {
                objectAnimator4 = ObjectAnimator.ofInt((Object)gb6, (Property)gb4$c.a, new int[] { colorForState });
            }
            ((ValueAnimator)objectAnimator4).setEvaluator((TypeEvaluator)gs0.a);
            b3.a.d("color").a((Animator)objectAnimator4);
            list5.add(objectAnimator4);
        }
        if (view2 instanceof ViewGroup) {
            final View viewById = view2.findViewById(2131430149);
            ViewGroup viewGroup;
            if (viewById != null) {
                viewGroup = this.C(viewById);
            }
            else if (!(view2 instanceof kyt) && !(view2 instanceof jyt)) {
                viewGroup = this.C(view2);
            }
            else {
                viewGroup = this.C(((ViewGroup)view2).getChildAt(0));
            }
            if (viewGroup != null) {
                ObjectAnimator objectAnimator5;
                if (b) {
                    if (!b2) {
                        z84.a.set((Object)viewGroup, (Object)0.0f);
                    }
                    objectAnimator5 = ObjectAnimator.ofFloat((Object)viewGroup, (Property)z84.a, new float[] { 1.0f });
                }
                else {
                    objectAnimator5 = ObjectAnimator.ofFloat((Object)viewGroup, (Property)z84.a, new float[] { 0.0f });
                }
                b3.a.d("contentFade").a((Animator)objectAnimator5);
                list5.add(objectAnimator5);
            }
        }
        int j = 0;
        final AnimatorSet set = new AnimatorSet();
        m8y.w(set, list5);
        ((Animator)set).addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public final void onAnimationEnd(final Animator animator) {
                if (!b) {
                    view2.setVisibility(4);
                    view.setAlpha(1.0f);
                    view.setVisibility(0);
                }
            }
            
            public final void onAnimationStart(final Animator animator) {
                if (b) {
                    view2.setVisibility(0);
                    view.setAlpha(0.0f);
                    view.setVisibility(4);
                }
            }
        });
        while (j < list4.size()) {
            ((Animator)set).addListener((Animator$AnimatorListener)list4.get(j));
            ++j;
        }
        return set;
    }
    
    public final void v(final View view, final RectF rectF) {
        this.A(view, rectF);
        rectF.offset(this.g, this.h);
    }
    
    public final Pair<frh, frh> w(final float n, final float n2, final boolean b, final b b2) {
        if (n != 0.0f) {
            final float n3 = fcmpl(n2, 0.0f);
            if (n3 != 0) {
                if ((b && n2 < 0.0f) || (!b && n3 > 0)) {
                    final frh d = b2.a.d("translationXCurveUpwards");
                    final frh d2 = b2.a.d("translationYCurveUpwards");
                    final frh frh = d;
                    final frh frh2 = d2;
                    return (Pair<frh, frh>)new Pair((Object)frh, (Object)frh2);
                }
                final frh d3 = b2.a.d("translationXCurveDownwards");
                final frh frh2 = b2.a.d("translationYCurveDownwards");
                final frh frh = d3;
                return (Pair<frh, frh>)new Pair((Object)frh, (Object)frh2);
            }
        }
        final frh d4 = b2.a.d("translationXLinear");
        final frh frh2 = b2.a.d("translationYLinear");
        final frh frh = d4;
        return (Pair<frh, frh>)new Pair((Object)frh, (Object)frh2);
    }
    
    public final float x(final View view, final View view2, final db2 db2) {
        final RectF d = this.d;
        final RectF e = this.e;
        this.v(view, d);
        this.A(view2, e);
        Objects.requireNonNull(db2);
        return e.centerX() - d.centerX() + 0.0f;
    }
    
    public final float y(final View view, final View view2, final db2 db2) {
        final RectF d = this.d;
        final RectF e = this.e;
        this.v(view, d);
        this.A(view2, e);
        Objects.requireNonNull(db2);
        return e.centerY() - d.centerY() + 0.0f;
    }
    
    public final float z(final b b, final frh frh, final float n) {
        final long a = frh.a;
        final long b2 = frh.b;
        final frh d = b.a.d("expansion");
        final float interpolation = frh.b().getInterpolation((d.a + d.b + 17L - a) / (float)b2);
        final LinearInterpolator a2 = kc0.a;
        return xk0.d(0.0f, n, interpolation, n);
    }
    
    public static final class b
    {
        public erh a;
        public db2 b;
    }
}
