// 
// Decompiled by Procyon v0.6.0
// 

package com.github.mikephil.charting.charts;

import java.lang.ref.WeakReference;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.content.Context;

public class LineChart extends hi1<mcf> implements ncf
{
    public LineChart(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public mcf getLineData() {
        return (mcf)((jt3)this).E0;
    }
    
    public final void h() {
        super.h();
        ((jt3)this).U0 = (i78)new lcf((ncf)this, ((jt3)this).X0, ((jt3)this).W0);
    }
    
    public final void onDetachedFromWindow() {
        final i78 u0 = ((jt3)this).U0;
        if (u0 != null && u0 instanceof lcf) {
            final lcf lcf = (lcf)u0;
            final Canvas o0 = lcf.O0;
            if (o0 != null) {
                o0.setBitmap((Bitmap)null);
                lcf.O0 = null;
            }
            final WeakReference n0 = lcf.N0;
            if (n0 != null) {
                ((Bitmap)n0.get()).recycle();
                lcf.N0.clear();
                lcf.N0 = null;
            }
        }
        super.onDetachedFromWindow();
    }
}
