// 
// Decompiled by Procyon v0.6.0
// 

package com.github.mikephil.charting.charts;

import java.lang.ref.WeakReference;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.content.Context;

public class LineChart extends ji1<jdf> implements kdf
{
    public LineChart(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public jdf getLineData() {
        return (jdf)((ju3)this).G0;
    }
    
    public final void h() {
        super.h();
        ((ju3)this).W0 = (l88)new idf((kdf)this, ((ju3)this).Z0, ((ju3)this).Y0);
    }
    
    public final void onDetachedFromWindow() {
        final l88 w0 = ((ju3)this).W0;
        if (w0 != null && w0 instanceof idf) {
            final idf idf = (idf)w0;
            final Canvas q0 = idf.Q0;
            if (q0 != null) {
                q0.setBitmap((Bitmap)null);
                idf.Q0 = null;
            }
            final WeakReference p0 = idf.P0;
            if (p0 != null) {
                ((Bitmap)p0.get()).recycle();
                idf.P0.clear();
                idf.P0 = null;
            }
        }
        super.onDetachedFromWindow();
    }
}
