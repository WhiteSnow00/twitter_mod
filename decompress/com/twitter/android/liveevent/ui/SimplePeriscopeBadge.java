// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.ui;

import android.view.View;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.LinearLayout;

public class SimplePeriscopeBadge extends LinearLayout implements v3k
{
    public AppCompatTextView C0;
    public AppCompatTextView D0;
    public TextView E0;
    public long F0;
    public long G0;
    public final boolean H0;
    
    public SimplePeriscopeBadge(final Context context, final AttributeSet set) {
        super(context, set, 0);
        this.F0 = -1L;
        this.G0 = -1L;
        this.H0 = t40.c(context);
    }
    
    public final void a() {
        this.D0.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        this.D0.setText((CharSequence)((View)this).getResources().getString(2131955674, new Object[] { j2d.h(((View)this).getResources(), this.G0, true) }));
        ((View)this.D0).setVisibility(0);
    }
    
    public final void b() {
        ((View)this).setVisibility(8);
    }
    
    public final void c() {
        ((View)this.D0).setVisibility(8);
    }
    
    public final void d() {
        if (this.G0 > 0L) {
            int n;
            if (this.H0) {
                n = 2131230885;
            }
            else {
                n = 2131230884;
            }
            this.g(n, false);
        }
        else {
            this.g(2131230886, false);
        }
    }
    
    public final void e() {
        this.D0.setCompoundDrawablesWithIntrinsicBounds(2131232583, 0, 0, 0);
        this.D0.setText((CharSequence)j2d.h(((View)this).getResources(), this.F0, true));
        ((View)this.D0).setVisibility(0);
    }
    
    public final void f() {
        if (this.F0 > 0L) {
            int n;
            if (this.H0) {
                n = 2131230966;
            }
            else {
                n = 2131230965;
            }
            this.g(n, true);
        }
        else {
            this.g(2131230967, true);
        }
    }
    
    public final void g(int backgroundResource, final boolean b) {
        this.C0.setBackgroundResource(backgroundResource);
        final AppCompatTextView c0 = this.C0;
        final Resources resources = ((View)this).getResources();
        if (b) {
            backgroundResource = 2131956440;
        }
        else {
            backgroundResource = 2131956331;
        }
        c0.setText((CharSequence)resources.getString(backgroundResource));
    }
    
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.C0 = (AppCompatTextView)((View)this).findViewById(2131430543);
        this.D0 = (AppCompatTextView)((View)this).findViewById(2131430545);
        this.E0 = (TextView)((View)this).findViewById(2131430542);
        int n;
        if (this.H0) {
            n = 2131230884;
        }
        else {
            n = 2131230885;
        }
        this.D0.setBackgroundResource(n);
        ((View)this.E0).setBackgroundResource(n);
    }
    
    public void setConcurrentViewerCount(final long f0) {
        this.F0 = f0;
    }
    
    public void setTimeDurationBadgeText(final long n) {
    }
    
    public void setTotalViewerCount(final long g0) {
        this.G0 = g0;
    }
    
    public final void show() {
        ((View)this).setVisibility(0);
    }
}
