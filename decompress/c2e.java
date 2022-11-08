import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c2e extends Drawable
{
    public final Path a;
    public final Paint b;
    public final boolean c;
    public ColorFilter d;
    public int e;
    
    public c2e(final boolean c) {
        final Path a = new Path();
        this.b = new Paint(1);
        this.e = 255;
        this.a = a;
        this.c = c;
    }
    
    public final void draw(final Canvas canvas) {
        this.b.setColorFilter(this.d);
        this.b.setAlpha(this.e);
        canvas.drawPath(this.a, this.b);
    }
    
    public final int getOpacity() {
        return this.e;
    }
    
    public final void setAlpha(final int e) {
        this.e = e;
    }
    
    public final void setBounds(int n, int n2, final int n3, final int n4) {
        super.setBounds(n, n2, n3, n4);
        this.a.rewind();
        final Rect bounds = this.getBounds();
        final boolean c = this.c;
        if (c) {
            n = bounds.right;
        }
        else {
            n = bounds.left;
        }
        if (c) {
            n2 = bounds.left;
        }
        else {
            n2 = bounds.right;
        }
        final Path a = this.a;
        final float n5 = (float)n2;
        a.moveTo(n5, (float)bounds.top);
        this.a.lineTo(n5, (float)bounds.bottom);
        final Path a2 = this.a;
        final float n6 = (float)n;
        n = bounds.top;
        a2.lineTo(n6, (float)((bounds.bottom - n) / 2 + n));
        this.a.close();
    }
    
    public final void setColorFilter(final ColorFilter d) {
        this.d = d;
    }
}
