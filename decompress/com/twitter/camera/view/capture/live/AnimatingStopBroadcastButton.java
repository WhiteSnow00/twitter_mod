// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.camera.view.capture.live;

import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import android.graphics.Rect;
import java.util.Objects;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import android.view.View;
import android.widget.FrameLayout;

public class AnimatingStopBroadcastButton extends FrameLayout
{
    public final View D0;
    public final View E0;
    public final View F0;
    public final Button G0;
    public final Drawable H0;
    public final int I0;
    
    public AnimatingStopBroadcastButton(final Context context, final AttributeSet set) {
        super(context, set, 0);
        LayoutInflater.from(context).inflate(2131625737, (ViewGroup)this, true);
        final krm b = krm.Companion.b((View)this);
        this.D0 = ((View)this).findViewById(2131431771);
        this.E0 = ((View)this).findViewById(2131431770);
        this.F0 = ((View)this).findViewById(2131431769);
        this.G0 = (Button)((View)this).findViewById(2131431772);
        this.H0 = b.j(2131233344);
        this.I0 = ((View)this).getResources().getDimensionPixelSize(2131165377);
        ((View)this).setClickable(true);
        ((View)this).setFocusable(true);
        this.setForeground(b.j(2131233342));
    }
    
    public static void a(final AnimatingStopBroadcastButton animatingStopBroadcastButton, final ValueAnimator valueAnimator) {
        Objects.requireNonNull(animatingStopBroadcastButton);
        final int intValue = (int)valueAnimator.getAnimatedValue();
        animatingStopBroadcastButton.D0.setClipBounds(new Rect(0, 0, intValue, animatingStopBroadcastButton.I0));
        animatingStopBroadcastButton.setIconButtonContainerWidth(intValue);
        animatingStopBroadcastButton.D0.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
        animatingStopBroadcastButton.F0.setAlpha(valueAnimator.getAnimatedFraction());
    }
    
    private void setCloseButtonText(final boolean b) {
        if (b) {
            ((TextView)this.G0).setText((CharSequence)((View)this).getResources().getString(2131958541));
        }
        else {
            ((TextView)this.G0).setText((CharSequence)((View)this).getResources().getString(2131958542));
        }
    }
    
    private void setIconButtonContainerWidth(final int width) {
        final ViewGroup$LayoutParams layoutParams = this.E0.getLayoutParams();
        layoutParams.width = width;
        this.E0.setLayoutParams(layoutParams);
    }
    
    public final void b() {
        this.D0.setVisibility(0);
        this.D0.setAlpha(1.0f);
        this.D0.setBackground(this.H0);
        this.D0.setClipBounds((Rect)null);
        this.E0.setVisibility(8);
        this.F0.setAlpha(0.0f);
        this.setIconButtonContainerWidth(-1);
    }
    
    public final void c(final boolean closeButtonText) {
        this.setCloseButtonText(closeButtonText);
        this.b();
        ((View)this).setVisibility(0);
    }
}
