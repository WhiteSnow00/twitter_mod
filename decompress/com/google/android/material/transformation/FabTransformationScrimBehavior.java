// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.transformation;

import android.animation.Animator$AnimatorListener;
import java.util.List;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import android.animation.AnimatorSet;
import android.view.MotionEvent;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.content.Context;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior
{
    public final krh c;
    public final krh d;
    
    public FabTransformationScrimBehavior() {
        this.c = new krh(75L);
        this.d = new krh(0L);
    }
    
    public FabTransformationScrimBehavior(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = new krh(75L);
        this.d = new krh(0L);
    }
    
    public final boolean c(final CoordinatorLayout coordinatorLayout, final View view, final View view2) {
        return view2 instanceof FloatingActionButton;
    }
    
    public final boolean s(final CoordinatorLayout coordinatorLayout, final View view, final MotionEvent motionEvent) {
        return false;
    }
    
    public final AnimatorSet u(final View view, final View view2, final boolean b, final boolean b2) {
        final ArrayList list = new ArrayList();
        new ArrayList();
        krh krh;
        if (b) {
            krh = this.c;
        }
        else {
            krh = this.d;
        }
        ObjectAnimator objectAnimator;
        if (b) {
            if (!b2) {
                view2.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat((Object)view2, View.ALPHA, new float[] { 1.0f });
        }
        else {
            objectAnimator = ObjectAnimator.ofFloat((Object)view2, View.ALPHA, new float[] { 0.0f });
        }
        krh.a((Animator)objectAnimator);
        list.add(objectAnimator);
        final AnimatorSet set = new AnimatorSet();
        af8.G(set, (List)list);
        ((Animator)set).addListener((Animator$AnimatorListener)new FabTransformationScrimBehavior$a(b, view2));
        return set;
    }
}
