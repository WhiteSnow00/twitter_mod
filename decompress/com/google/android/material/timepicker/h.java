// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.timepicker;

import android.view.MotionEvent;
import android.view.GestureDetector$SimpleOnGestureListener;

public final class h extends GestureDetector$SimpleOnGestureListener
{
    public final /* synthetic */ TimePickerView C0;
    
    public h(final TimePickerView c0) {
        this.C0 = c0;
    }
    
    public final boolean onDoubleTap(final MotionEvent motionEvent) {
        final TimePickerView.b c1 = this.C0.c1;
        final boolean b = false;
        if (c1 != null) {
            final c c2 = (c)c1;
            c2.i2 = 1;
            c2.f2(c2.g2);
            final f w1 = c2.W1;
            w1.G0.setChecked(w1.D0.H0 == 12);
            final ChipTextInputComboView h0 = w1.H0;
            boolean checked = b;
            if (w1.D0.H0 == 10) {
                checked = true;
            }
            h0.setChecked(checked);
            return true;
        }
        return false;
    }
}
