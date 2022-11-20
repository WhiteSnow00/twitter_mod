// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.camera.view.location;

import android.animation.ValueAnimator;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.ObjectAnimator;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;

public class LocationRippleDot extends FrameLayout
{
    public final View D0;
    public final AnimatorSet E0;
    public final View F0;
    
    public LocationRippleDot(final Context context, final AttributeSet set) {
        super(context, set, 0);
        LayoutInflater.from(context).inflate(2131624763, (ViewGroup)this);
        final View viewById = ((View)this).findViewById(2131429870);
        this.D0 = viewById;
        this.F0 = ((View)this).findViewById(2131429864);
        final AnimatorSet e0 = new AnimatorSet();
        this.E0 = e0;
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)viewById, "scaleX", new float[] { 0.25f, 1.0f });
        ((ValueAnimator)ofFloat).setRepeatCount(-1);
        final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object)viewById, "scaleY", new float[] { 0.25f, 1.0f });
        ((ValueAnimator)ofFloat2).setRepeatCount(-1);
        final ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((Object)viewById, "alpha", new float[] { 1.0f, 0.0f });
        ((ValueAnimator)ofFloat3).setRepeatCount(-1);
        e0.setDuration(1000L);
        e0.setInterpolator((TimeInterpolator)new AccelerateDecelerateInterpolator());
        e0.playTogether(new Animator[] { (Animator)ofFloat, (Animator)ofFloat2, (Animator)ofFloat3 });
    }
}
