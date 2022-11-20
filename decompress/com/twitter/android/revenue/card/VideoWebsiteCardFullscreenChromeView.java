// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.revenue.card;

import com.twitter.media.av.ui.control.VideoControlView;
import android.content.res.TypedArray;
import android.view.View$OnClickListener;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView;
import android.view.View;

public final class VideoWebsiteCardFullscreenChromeView extends ir1
{
    public final View M0;
    public final o41 N0;
    public TextView O0;
    public final boolean P0;
    public final boolean Q0;
    
    public VideoWebsiteCardFullscreenChromeView(final Context context, final AttributeSet set) {
        super(context, set);
        final LayoutInflater from = LayoutInflater.from(context);
        final o41 o41 = null;
        final View inflate = from.inflate(2131624928, (ViewGroup)null);
        ((ViewGroup)this).addView(inflate);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams = (RelativeLayout$LayoutParams)inflate.getLayoutParams();
        relativeLayout$LayoutParams.addRule(10);
        relativeLayout$LayoutParams.addRule(20);
        relativeLayout$LayoutParams.addRule(21);
        inflate.setVisibility(8);
        this.M0 = inflate;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, chw.K0, 0, 0);
        this.P0 = obtainStyledAttributes.getBoolean(1, false);
        this.Q0 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        final VideoControlView e0 = super.E0;
        o41 n0 = o41;
        if (e0 != null) {
            n0 = o41;
            if (((View)e0).findViewById(2131427687) != null) {
                n0 = new o41((ViewGroup)super.E0, false);
                n0.N0 = true;
            }
        }
        this.N0 = n0;
        ((View)this).setOnClickListener((View$OnClickListener)new fpf(this, 5));
    }
    
    public static void l(final VideoWebsiteCardFullscreenChromeView videoWebsiteCardFullscreenChromeView) {
        videoWebsiteCardFullscreenChromeView.setShouldShowControls(true);
        videoWebsiteCardFullscreenChromeView.a();
        final w4 d0 = videoWebsiteCardFullscreenChromeView.D0;
        if (d0 != null && videoWebsiteCardFullscreenChromeView.N0 == null) {
            d0.s();
        }
    }
    
    public final boolean a() {
        this.setShouldShowControls(true);
        final boolean a = super.a();
        final w4 d0 = super.D0;
        if (d0 != null && this.N0 == null) {
            d0.s();
        }
        return a;
    }
    
    public final void e(final w4 w4) {
        final o41 n0 = this.N0;
        if (n0 != null) {
            if (w4 != null) {
                n0.g(w4);
            }
            else if (super.D0 != null) {
                n0.unbind();
            }
        }
        super.e(w4);
        this.setShouldShowControls(this.Q0);
        this.i();
    }
    
    public final VideoControlView f(final Context context) {
        final VideoControlView videoControlView = (VideoControlView)LayoutInflater.from(context).inflate(2131625988, (ViewGroup)null).findViewById(2131432556);
        final TextView o0 = (TextView)((View)videoControlView).findViewById(2131428644);
        this.O0 = o0;
        if (o0 != null) {
            ((View)o0).setVisibility(8);
        }
        return videoControlView;
    }
    
    public final void g() {
        super.g();
        final VideoControlView e0 = super.E0;
        if (e0 != null) {
            ((View)e0).setEnabled(false);
        }
        ec0.f(this.M0);
    }
    
    public final void i() {
        super.i();
        final VideoControlView e0 = super.E0;
        if (e0 != null) {
            ((View)e0).setEnabled(true);
        }
        ec0.c(this.M0);
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final o41 n0 = this.N0;
        if (n0 != null) {
            n0.unbind();
        }
    }
    
    public void setDescriptionText(final String text) {
        final TextView o0 = this.O0;
        if (o0 == null) {
            return;
        }
        if (this.P0) {
            o0.setText((CharSequence)text);
            ec0.d((View)this.O0, 300);
        }
        else {
            o0.setText((CharSequence)"");
            ec0.g((View)this.O0, 300);
        }
    }
}
