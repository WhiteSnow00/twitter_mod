// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.profiles;

import android.graphics.Canvas;
import android.content.res.TypedArray;
import android.graphics.Paint$Style;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Path;
import android.graphics.Paint;
import android.view.View;

public class ProfileHeaderSocialProofCaret extends View
{
    public final Paint C0;
    public final Paint D0;
    public final Path E0;
    public final Path F0;
    public final int G0;
    public final int H0;
    public int I0;
    public int J0;
    public float K0;
    public float L0;
    public float M0;
    
    public ProfileHeaderSocialProofCaret(final Context context, final AttributeSet set) {
        super(context, set, 0);
        this.H0 = this.getResources().getDimensionPixelSize(2131166927);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, lux.D0, 0, 0);
        final int color = obtainStyledAttributes.getColor(0, 0);
        final int color2 = obtainStyledAttributes.getColor(1, 0);
        final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, 1);
        this.G0 = dimensionPixelSize;
        final Paint c0 = new Paint(1);
        (this.C0 = c0).setStyle(Paint$Style.STROKE);
        c0.setColor(color2);
        c0.setStrokeWidth((float)dimensionPixelSize);
        final Paint d0 = new Paint(1);
        (this.D0 = d0).setStyle(Paint$Style.FILL);
        d0.setColor(color);
        this.E0 = new Path();
        this.F0 = new Path();
        obtainStyledAttributes.recycle();
    }
    
    public final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(0.0f, (float)this.J0);
        this.E0.lineTo((float)this.H0, 0.0f);
        this.E0.lineTo(this.L0, this.M0);
        this.E0.lineTo(this.K0, 0.0f);
        this.E0.lineTo((float)this.I0, 0.0f);
        this.E0.moveTo(0.0f, 0.0f);
        this.E0.close();
        canvas.drawPath(this.E0, this.C0);
        canvas.restore();
        canvas.save();
        canvas.translate((float)this.H0, (float)this.J0);
        this.F0.lineTo(this.L0 - this.H0, this.M0);
        this.F0.lineTo(this.K0 - this.H0, 0.0f);
        this.F0.close();
        canvas.drawPath(this.F0, this.D0);
        canvas.restore();
    }
    
    public final void onSizeChanged(int h0, final int j0, final int n, final int n2) {
        super.onSizeChanged(h0, j0, n, n2);
        this.I0 = h0;
        this.J0 = j0;
        final float n3 = j0 * 2.1666667f;
        h0 = this.H0;
        this.K0 = h0 + n3;
        this.L0 = n3 / 2.0f + h0;
        this.M0 = this.G0 / 2.0f + (0.0f - j0);
    }
}
