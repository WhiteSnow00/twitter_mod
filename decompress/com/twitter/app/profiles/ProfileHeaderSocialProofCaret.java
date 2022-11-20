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
    public final Paint D0;
    public final Paint E0;
    public final Path F0;
    public final Path G0;
    public final int H0;
    public final int I0;
    public int J0;
    public int K0;
    public float L0;
    public float M0;
    public float N0;
    
    public ProfileHeaderSocialProofCaret(final Context context, final AttributeSet set) {
        super(context, set, 0);
        this.I0 = this.getResources().getDimensionPixelSize(2131166927);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, xli.O0, 0, 0);
        final int color = obtainStyledAttributes.getColor(0, 0);
        final int color2 = obtainStyledAttributes.getColor(1, 0);
        final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, 1);
        this.H0 = dimensionPixelSize;
        final Paint d0 = new Paint(1);
        (this.D0 = d0).setStyle(Paint$Style.STROKE);
        d0.setColor(color2);
        d0.setStrokeWidth((float)dimensionPixelSize);
        final Paint e0 = new Paint(1);
        (this.E0 = e0).setStyle(Paint$Style.FILL);
        e0.setColor(color);
        this.F0 = new Path();
        this.G0 = new Path();
        obtainStyledAttributes.recycle();
    }
    
    public final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(0.0f, (float)this.K0);
        this.F0.lineTo((float)this.I0, 0.0f);
        this.F0.lineTo(this.M0, this.N0);
        this.F0.lineTo(this.L0, 0.0f);
        this.F0.lineTo((float)this.J0, 0.0f);
        this.F0.moveTo(0.0f, 0.0f);
        this.F0.close();
        canvas.drawPath(this.F0, this.D0);
        canvas.restore();
        canvas.save();
        canvas.translate((float)this.I0, (float)this.K0);
        this.G0.lineTo(this.M0 - this.I0, this.N0);
        this.G0.lineTo(this.L0 - this.I0, 0.0f);
        this.G0.close();
        canvas.drawPath(this.G0, this.E0);
        canvas.restore();
    }
    
    public final void onSizeChanged(int i0, final int k0, final int n, final int n2) {
        super.onSizeChanged(i0, k0, n, n2);
        this.J0 = i0;
        this.K0 = k0;
        final float n3 = k0 * 2.1666667f;
        i0 = this.I0;
        this.L0 = i0 + n3;
        this.M0 = n3 / 2.0f + i0;
        this.N0 = this.H0 / 2.0f + (0.0f - k0);
    }
}
