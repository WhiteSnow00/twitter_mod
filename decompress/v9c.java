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

public final class v9c implements mrm$b
{
    public final j67 D0;
    public final edq E0;
    public final MediaImageView F0;
    
    public v9c(final j67 d0, final edq e0, final MediaImageView f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final void f(final nrm nrm) {
        final j67 d0 = this.D0;
        final edq e0 = this.E0;
        final MediaImageView f0 = this.F0;
        final b8d b8d = (b8d)nrm;
        if (((nrm)b8d).b != null) {
            edq a = e0;
            if (e0.i()) {
                a = q60.a((Bitmap)((nrm)b8d).b);
            }
            final edq b = q60.b((View)f0, true);
            final m53 a2 = n67.a;
            Rect rect;
            if (d0 != null) {
                rect = n67.a(d0.e, b, d0.a());
            }
            else {
                rect = wng.l(a, b, false);
            }
            final ImageView imageView = f0.getImageView();
            Matrix transformationMatrix;
            if (imageView.getDrawable() != null) {
                final Drawable drawable = imageView.getDrawable();
                final m53 a3 = n67.a;
                final int width = ((View)imageView).getWidth();
                final int height = ((View)imageView).getHeight();
                final int intrinsicWidth = drawable.getIntrinsicWidth();
                final int intrinsicHeight = drawable.getIntrinsicHeight();
                ((Matrix)a3.E0).getValues((float[])a3.F0);
                final float n = (float)intrinsicWidth;
                final float n2 = (float)intrinsicHeight;
                final float n3 = n / n2;
                final int n4 = (int)(width / n3);
                final float n5 = (float)(int)xm1.f((float)n4, (float)rect.height());
                final float n6 = (int)(n3 * n5) / n;
                final float n7 = n5 / n2;
                final int n8 = (height - n4) / 2;
                final float f2 = xm1.f(0.0f, (float)rect.left);
                final float f3 = xm1.f((float)n8, (float)rect.top);
                ((Matrix)a3.E0).setScale(n6, n7);
                ((Matrix)a3.E0).postTranslate(f2, f3);
                transformationMatrix = (Matrix)a3.E0;
            }
            else {
                transformationMatrix = null;
            }
            f0.setTransformationMatrix(transformationMatrix);
        }
    }
}
