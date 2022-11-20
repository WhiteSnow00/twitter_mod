import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s02 extends feg
{
    public s02() {
        super(0);
    }
    
    @Override
    public final Object a(final int n) {
        Bitmap bitmap = (Bitmap)super.a(n);
        if (bitmap != null && this.e(bitmap)) {
            bitmap.eraseColor(0);
        }
        else {
            bitmap = null;
        }
        return bitmap;
    }
    
    @Override
    public final int b(final Object o) {
        return a12.d((Bitmap)o);
    }
    
    @Override
    public final void d(final Object o) {
        final Bitmap bitmap = (Bitmap)o;
        if (this.e(bitmap)) {
            super.d(bitmap);
        }
    }
    
    public final boolean e(final Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            xli.L0("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", new Object[] { bitmap });
            return false;
        }
        if (!bitmap.isMutable()) {
            xli.L0("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", new Object[] { bitmap });
            return false;
        }
        return true;
    }
}
