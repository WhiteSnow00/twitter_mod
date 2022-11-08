// 
// Decompiled by Procyon v0.6.0
// 

package com.github.mikephil.charting.charts;

import java.lang.ref.WeakReference;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.content.Context;

public class LineChart extends mi1<adf> implements bdf
{
    public LineChart(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public adf getLineData() {
        return (adf)super.D0;
    }
    
    @Override
    public final void h() {
        super.h();
        super.T0 = (w78)new zcf((bdf)this, super.W0, super.V0);
    }
    
    public final void onDetachedFromWindow() {
        final w78 t0 = super.T0;
        if (t0 != null && t0 instanceof zcf) {
            final zcf zcf = (zcf)t0;
            final Canvas l = zcf.l;
            if (l != null) {
                l.setBitmap((Bitmap)null);
                zcf.l = null;
            }
            final WeakReference<Bitmap> k = zcf.k;
            if (k != null) {
                k.get().recycle();
                zcf.k.clear();
                zcf.k = null;
            }
        }
        super.onDetachedFromWindow();
    }
}
