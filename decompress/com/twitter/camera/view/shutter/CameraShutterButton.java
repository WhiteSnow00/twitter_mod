// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.camera.view.shutter;

import android.view.View$MeasureSpec;
import android.graphics.drawable.TransitionDrawable;
import android.animation.ValueAnimator;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.view.animation.OvershootInterpolator;
import android.view.animation.LinearInterpolator;
import android.graphics.drawable.Drawable;
import android.animation.AnimatorSet;
import com.twitter.ui.widget.RingView;
import android.view.View;
import android.widget.FrameLayout;

public class CameraShutterButton extends FrameLayout
{
    public final View D0;
    public final RingView E0;
    public final AnimatorSet F0;
    public final Drawable G0;
    public final Drawable H0;
    public final Drawable I0;
    public final Drawable J0;
    public final int K0;
    public final int L0;
    public final int M0;
    public final float N0;
    public final LinearInterpolator O0;
    public final OvershootInterpolator P0;
    public final nnl<tmi> Q0;
    
    public CameraShutterButton(final Context context, final AttributeSet set) {
        super(context, set, 0);
        this.O0 = new LinearInterpolator();
        this.P0 = new OvershootInterpolator();
        LayoutInflater.from(context).inflate(2131624158, (ViewGroup)this);
        this.D0 = ((View)this).findViewById(2131431457);
        final RingView e0 = (RingView)((View)this).findViewById(2131431459);
        this.E0 = e0;
        final Object a = kn6.a;
        final Drawable b = kn6.c.b(context, 2131231085);
        jee.l((Object)b);
        this.G0 = b;
        final Drawable b2 = kn6.c.b(context, 2131231088);
        jee.l((Object)b2);
        this.H0 = b2;
        final Drawable b3 = kn6.c.b(context, 2131231086);
        jee.l((Object)b3);
        this.I0 = b3;
        final Drawable b4 = kn6.c.b(context, 2131231087);
        jee.l((Object)b4);
        this.J0 = b4;
        final int color = ((View)this).getResources().getColor(2131099729);
        final int i = d4j.i(context, 2130968592);
        this.M0 = i;
        final int dimensionPixelSize = ((View)this).getResources().getDimensionPixelSize(2131167405);
        this.L0 = dimensionPixelSize;
        final int dimensionPixelSize2 = ((View)this).getResources().getDimensionPixelSize(2131167407);
        final int dimensionPixelSize3 = ((View)this).getResources().getDimensionPixelSize(2131167406);
        final ValueAnimator a2 = e0.a(new int[] { i, color });
        a2.setDuration(250L);
        final ValueAnimator b5 = e0.b(new int[] { dimensionPixelSize, dimensionPixelSize3 });
        b5.setDuration(600L);
        final ValueAnimator b6 = e0.b(new int[] { dimensionPixelSize3, dimensionPixelSize2 });
        b6.setRepeatMode(2);
        b6.setRepeatCount(-1);
        b6.setDuration(1000L);
        b6.setInterpolator((TimeInterpolator)new AccelerateDecelerateInterpolator());
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)e0, "alpha", new float[] { 1.0f, 0.7f });
        ((ValueAnimator)ofFloat).setRepeatMode(2);
        ((ValueAnimator)ofFloat).setRepeatCount(-1);
        ((ValueAnimator)ofFloat).setDuration(1000L);
        ((ValueAnimator)ofFloat).setInterpolator((TimeInterpolator)new AccelerateDecelerateInterpolator());
        final AnimatorSet f0 = new AnimatorSet();
        f0.play((Animator)a2).with((Animator)b5);
        f0.play((Animator)b5).before((Animator)b6);
        f0.play((Animator)ofFloat).with((Animator)b6);
        this.F0 = f0;
        final int dimensionPixelSize4 = ((View)this).getResources().getDimensionPixelSize(2131167408);
        final float n = (float)dimensionPixelSize4;
        final float n2 = 1.35f * n;
        final int k0 = (int)(1.15f * n2);
        this.K0 = k0;
        final int n3 = (k0 - dimensionPixelSize4) / 2;
        ((View)this).setPadding(n3, n3, n3, n3);
        ((ViewGroup)this).setClipToPadding(false);
        this.N0 = (n2 - ((View)this).getResources().getDimensionPixelSize(2131167404) * 2) / n;
        this.Q0 = (nnl<tmi>)new nnl();
    }
    
    public final void a(final Drawable background) {
        final Drawable background2 = ((View)this).getBackground();
        if (background2 == null) {
            this.D0.setBackground(background);
            return;
        }
        final TransitionDrawable background3 = new TransitionDrawable(new Drawable[] { background2, background });
        this.D0.setBackground((Drawable)background3);
        background3.startTransition(300);
    }
    
    public final void onMeasure(final int n, final int n2) {
        super.onMeasure(View$MeasureSpec.makeMeasureSpec(this.K0, 1073741824), View$MeasureSpec.makeMeasureSpec(this.K0, 1073741824));
    }
    
    public final boolean performClick() {
        this.Q0.onNext((Object)tmi.a);
        return super.performClick();
    }
}
