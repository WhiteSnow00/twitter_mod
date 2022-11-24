import android.graphics.Matrix;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v6d
{
    public static Bitmap a(final Bitmap bitmap, final int n, final int n2, final int n3) {
        if (n == 0) {
            return Bitmap.createBitmap(bitmap, 0, 0, n2, n3);
        }
        final Matrix matrix = new Matrix();
        matrix.postRotate((float)n);
        return Bitmap.createBitmap(bitmap, 0, 0, n2, n3, matrix, true);
    }
}
