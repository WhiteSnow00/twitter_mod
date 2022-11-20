// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.widget;

import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.Paint$Align;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.view.View;

public final class d extends View
{
    public int D0;
    public View E0;
    public int F0;
    
    public View getContent() {
        return this.E0;
    }
    
    public int getEmptyVisibility() {
        return this.F0;
    }
    
    public final void onDraw(final Canvas canvas) {
        if (this.isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            final Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint$Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            final Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float)rect.height());
            final int height = rect.height();
            final int width = rect.width();
            paint.setTextAlign(Paint$Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", width / 2.0f - rect.width() / 2.0f - rect.left, rect.height() / 2.0f + height / 2.0f - rect.bottom, paint);
        }
    }
    
    public void setContentId(final int d0) {
        if (this.D0 == d0) {
            return;
        }
        final View e0 = this.E0;
        if (e0 != null) {
            e0.setVisibility(0);
            ((ConstraintLayout.a)this.E0.getLayoutParams()).f0 = false;
            this.E0 = null;
        }
        if ((this.D0 = d0) != -1) {
            final View viewById = ((View)this.getParent()).findViewById(d0);
            if (viewById != null) {
                viewById.setVisibility(8);
            }
        }
    }
    
    public void setEmptyVisibility(final int f0) {
        this.F0 = f0;
    }
}
