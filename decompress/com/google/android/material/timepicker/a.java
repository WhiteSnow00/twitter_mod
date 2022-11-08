// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.timepicker;

import android.view.View;
import android.view.ViewTreeObserver$OnPreDrawListener;

public final class a implements ViewTreeObserver$OnPreDrawListener
{
    public final /* synthetic */ ClockFaceView C0;
    
    public a(final ClockFaceView c0) {
        this.C0 = c0;
    }
    
    public final boolean onPreDraw() {
        if (!((View)this.C0).isShown()) {
            return true;
        }
        ((View)this.C0).getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        final int n = ((View)this.C0).getHeight() / 2;
        final ClockFaceView c0 = this.C0;
        final int v0 = n - c0.X0.J0 - c0.e1;
        if (v0 != ((uvl)c0).V0) {
            ((uvl)c0).V0 = v0;
            ((uvl)c0).z();
            final ClockHandView x0 = c0.X0;
            x0.S0 = ((uvl)c0).V0;
            x0.invalidate();
        }
        return true;
    }
}
