// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.qrcodes.view;

import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.widget.FrameLayout;

public class QRCodeReaderOverlay extends FrameLayout
{
    public final int D0;
    public final int E0;
    public final int F0;
    public final int G0;
    public final Paint H0;
    public Bitmap I0;
    public View J0;
    public View K0;
    public Rect L0;
    
    public QRCodeReaderOverlay(Context obtainStyledAttributes, final AttributeSet set) {
        super(obtainStyledAttributes, set, 0);
        this.L0 = new Rect();
        ((View)this).setWillNotDraw(false);
        obtainStyledAttributes = (Context)obtainStyledAttributes.obtainStyledAttributes(set, wj1.G0, 0, 0);
        try {
            this.D0 = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(0, 0);
            this.E0 = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(1, 0);
            this.F0 = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(3, 0);
            this.G0 = ((TypedArray)obtainStyledAttributes).getColor(2, 0);
            ((TypedArray)obtainStyledAttributes).recycle();
            obtainStyledAttributes = (Context)new Paint();
            (this.H0 = (Paint)obtainStyledAttributes).setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.CLEAR));
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
    
    public Rect getCutoutRect() {
        return this.L0;
    }
    
    public final void onDraw(final Canvas canvas) {
        if (this.I0 == null) {
            this.I0 = Bitmap.createBitmap(((View)this).getWidth(), ((View)this).getHeight(), Bitmap$Config.ARGB_8888);
            final Canvas canvas2 = new Canvas(this.I0);
            this.I0.eraseColor(0);
            canvas2.drawColor(this.G0);
            final RectF rectF = new RectF(this.L0);
            final float n = (float)this.F0;
            canvas2.drawRoundRect(rectF, n, n, this.H0);
        }
        canvas.drawBitmap(this.I0, 0.0f, 0.0f, (Paint)null);
    }
    
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.J0 = ((View)this).findViewById(2131430568);
        this.K0 = ((View)this).findViewById(2131431907);
    }
    
    public final void onLayout(final boolean b, int b2, final int n, final int n2, final int n3) {
        super.onLayout(b, b2, n, n2, n3);
        this.L0.set(b2, n, n2, n3);
        final Rect l0 = this.L0;
        final edq g = edq.g(this.E0, this.D0);
        b2 = wng.b;
        final Rect c = q60.c(g);
        c.offset(l0.centerX() - c.centerX(), l0.centerY() - c.centerY());
        this.L0 = c;
        this.K0.layout(c.left, c.top, c.right, c.bottom);
    }
}
