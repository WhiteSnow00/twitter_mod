// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.qrcodes.view;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint$Style;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Path;
import android.graphics.Paint;
import android.view.View;

public class QRCodeTargetFinder extends View
{
    public final Paint D0;
    public final Path E0;
    public final int F0;
    
    public QRCodeTargetFinder(Context obtainStyledAttributes, final AttributeSet set) {
        super(obtainStyledAttributes, set, 0);
        this.E0 = new Path();
        obtainStyledAttributes = (Context)obtainStyledAttributes.obtainStyledAttributes(set, wj1.H0, 0, 0);
        try {
            final int color = ((TypedArray)obtainStyledAttributes).getColor(0, 0);
            final int dimensionPixelSize = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(2, 0);
            this.F0 = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(1, 0);
            final Paint d0 = new Paint();
            (this.D0 = d0).setColor(color);
            d0.setStyle(Paint$Style.STROKE);
            d0.setStrokeWidth((float)dimensionPixelSize);
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
    
    public final void onDraw(final Canvas canvas) {
        final int height = this.getHeight();
        final int width = this.getWidth();
        this.E0.rewind();
        this.E0.moveTo(0.0f, (float)this.F0);
        this.E0.lineTo(0.0f, 0.0f);
        this.E0.lineTo((float)this.F0, 0.0f);
        canvas.drawPath(this.E0, this.D0);
        this.E0.rewind();
        this.E0.moveTo((float)(width - this.F0), 0.0f);
        final Path e0 = this.E0;
        final float n = (float)width;
        e0.lineTo(n, 0.0f);
        this.E0.lineTo(n, (float)this.F0);
        canvas.drawPath(this.E0, this.D0);
        this.E0.rewind();
        this.E0.moveTo(n, (float)(height - this.F0));
        final Path e2 = this.E0;
        final float n2 = (float)height;
        e2.lineTo(n, n2);
        this.E0.lineTo((float)(width - this.F0), n2);
        canvas.drawPath(this.E0, this.D0);
        this.E0.rewind();
        this.E0.moveTo((float)this.F0, n2);
        this.E0.lineTo(0.0f, n2);
        this.E0.lineTo(0.0f, (float)(height - this.F0));
        canvas.drawPath(this.E0, this.D0);
    }
}
