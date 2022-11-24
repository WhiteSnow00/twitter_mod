import android.view.View;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.content.res.ColorStateList;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class t9d
{
    public static void a(final ImageView imageView, final ColorStateList list) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        a.c(imageView, list);
        if (sdk_INT == 21) {
            final Drawable drawable = imageView.getDrawable();
            if (drawable != null && a.a(imageView) != null) {
                if (drawable.isStateful()) {
                    drawable.setState(((View)imageView).getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        }
    }
    
    public static final class a
    {
        public static ColorStateList a(final ImageView imageView) {
            return imageView.getImageTintList();
        }
        
        public static PorterDuff$Mode b(final ImageView imageView) {
            return imageView.getImageTintMode();
        }
        
        public static void c(final ImageView imageView, final ColorStateList imageTintList) {
            imageView.setImageTintList(imageTintList);
        }
        
        public static void d(final ImageView imageView, final PorterDuff$Mode imageTintMode) {
            imageView.setImageTintMode(imageTintMode);
        }
    }
}
