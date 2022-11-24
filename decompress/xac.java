import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.graphics.Rect;
import android.graphics.Matrix;
import android.view.View;
import android.graphics.Bitmap;
import com.twitter.media.ui.image.MediaImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xac implements bsm$b
{
    public final o77 F0;
    public final beq G0;
    public final MediaImageView H0;
    
    public xac(final o77 f0, final beq g0, final MediaImageView h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final void f(final csm csm) {
        final o77 f0 = this.F0;
        final beq g0 = this.G0;
        final MediaImageView h0 = this.H0;
        final d9d d9d = (d9d)csm;
        if (((csm)d9d).b != null) {
            beq a = g0;
            if (g0.i()) {
                a = p60.a((Bitmap)((csm)d9d).b);
            }
            final beq b = p60.b((View)h0, true);
            final f63 a2 = s77.a;
            Rect rect;
            if (f0 != null) {
                rect = s77.a(f0.e, b, f0.a());
            }
            else {
                rect = qog.l(a, b, false);
            }
            final ImageView imageView = h0.getImageView();
            Matrix transformationMatrix;
            if (imageView.getDrawable() != null) {
                final Drawable drawable = imageView.getDrawable();
                final f63 a3 = s77.a;
                final int width = ((View)imageView).getWidth();
                final int height = ((View)imageView).getHeight();
                final int intrinsicWidth = drawable.getIntrinsicWidth();
                final int intrinsicHeight = drawable.getIntrinsicHeight();
                ((Matrix)a3.F0).getValues((float[])a3.G0);
                final float n = (float)intrinsicWidth;
                final float n2 = (float)intrinsicHeight;
                final float n3 = n / n2;
                final int n4 = (int)(width / n3);
                final float n5 = (float)(int)cn1.f((float)n4, (float)rect.height());
                final float n6 = (int)(n3 * n5) / n;
                final float n7 = n5 / n2;
                final int n8 = (height - n4) / 2;
                final float f2 = cn1.f(0.0f, (float)rect.left);
                final float f3 = cn1.f((float)n8, (float)rect.top);
                ((Matrix)a3.F0).setScale(n6, n7);
                ((Matrix)a3.F0).postTranslate(f2, f3);
                transformationMatrix = (Matrix)a3.F0;
            }
            else {
                transformationMatrix = null;
            }
            h0.setTransformationMatrix(transformationMatrix);
        }
    }
}
