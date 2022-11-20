import android.view.View;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.graphics.Matrix;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u8d
{
    public static boolean a = true;
    
    public static void a(final ImageView imageView, final Matrix matrix) {
        if (Build$VERSION.SDK_INT >= 29) {
            imageView.animateTransform(matrix);
        }
        else if (matrix == null) {
            final Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, ((View)imageView).getWidth() - ((View)imageView).getPaddingLeft() - ((View)imageView).getPaddingRight(), ((View)imageView).getHeight() - ((View)imageView).getPaddingTop() - ((View)imageView).getPaddingBottom());
                ((View)imageView).invalidate();
            }
        }
        else if (u8d.a) {
            try {
                imageView.animateTransform(matrix);
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                u8d.a = false;
            }
        }
    }
}
