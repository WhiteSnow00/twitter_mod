// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.camera.view.capture;

import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import kotlin.Metadata;
import android.view.View;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/twitter/camera/view/capture/CameraGridView;", "Landroid/view/View;", "feature.tfa.camera.capture.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class CameraGridView extends View
{
    public final Paint D0;
    public final float E0;
    public final int F0;
    public final int G0;
    public final float H0;
    
    public CameraGridView(final Context context, final AttributeSet set) {
        czd.f((Object)context, "context");
        super(context, set, 0);
        this.D0 = new Paint();
        this.E0 = this.getResources().getDimension(2131165380);
        this.F0 = this.getResources().getColor(2131100885);
        this.G0 = this.getResources().getColor(2131099702);
        this.H0 = 3.0f;
    }
    
    public final void onDraw(final Canvas canvas) {
        czd.f((Object)canvas, "canvas");
        super.onDraw(canvas);
        this.D0.reset();
        this.D0.setColor(this.F0);
        this.D0.setStrokeWidth(this.E0);
        this.D0.setShadowLayer(1.0f, 1.0f, 1.0f, this.G0);
        final Paint d0 = this.D0;
        final float n = this.getWidth() / this.H0;
        canvas.drawLine(n, 0.0f, n, (float)this.getHeight(), d0);
        final float n2 = this.getWidth() - this.getWidth() / this.H0;
        canvas.drawLine(n2, 0.0f, n2, (float)this.getHeight(), d0);
        final float n3 = this.getHeight() / this.H0;
        canvas.drawLine(0.0f, n3, (float)this.getWidth(), n3, d0);
        final float n4 = this.getHeight() - this.getHeight() / this.H0;
        canvas.drawLine(0.0f, n4, (float)this.getWidth(), n4, d0);
    }
}
