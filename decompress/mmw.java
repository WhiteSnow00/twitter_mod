import android.os.Build$VERSION;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.content.res.Resources;
import java.io.Closeable;
import android.graphics.Path;
import android.graphics.PathMeasure;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mmw
{
    public static final ThreadLocal<PathMeasure> a;
    public static final ThreadLocal<Path> b;
    public static final ThreadLocal<Path> c;
    public static final ThreadLocal<float[]> d;
    public static final float e;
    public static float f;
    
    static {
        mmw.a = new ThreadLocal<PathMeasure>() {
            public final Object initialValue() {
                return new PathMeasure();
            }
        };
        mmw.b = new ThreadLocal<Path>() {
            public final Object initialValue() {
                return new Path();
            }
        };
        mmw.c = new ThreadLocal<Path>() {
            public final Object initialValue() {
                return new Path();
            }
        };
        mmw.d = new ThreadLocal<float[]>() {
            public final Object initialValue() {
                return new float[4];
            }
        };
        e = (float)(Math.sqrt(2.0) / 2.0);
        mmw.f = -1.0f;
    }
    
    public static void a(final Path path, float min, float n, float n2) {
        final PathMeasure pathMeasure = mmw.a.get();
        final Path path2 = mmw.b.get();
        final Path path3 = mmw.c.get();
        pathMeasure.setPath(path, false);
        final float length = pathMeasure.getLength();
        if (min == 1.0f && n == 0.0f) {
            yos.g();
            return;
        }
        if (length < 1.0f || Math.abs(n - min - 1.0f) < 0.01) {
            yos.g();
            return;
        }
        final float n3 = min * length;
        n *= length;
        min = Math.min(n3, n);
        final float max = Math.max(n3, n);
        n2 *= length;
        n = min + n2;
        final float n4 = max + n2;
        n2 = n;
        min = n4;
        if (n >= length) {
            n2 = n;
            min = n4;
            if (n4 >= length) {
                n2 = (float)jbh.d(n, length);
                min = (float)jbh.d(n4, length);
            }
        }
        n = n2;
        if (n2 < 0.0f) {
            n = (float)jbh.d(n2, length);
        }
        n2 = min;
        if (min < 0.0f) {
            n2 = (float)jbh.d(min, length);
        }
        final float n5 = fcmpl(n, n2);
        if (n5 == 0) {
            path.reset();
            yos.g();
            return;
        }
        min = n;
        if (n5 >= 0) {
            min = n - length;
        }
        path2.reset();
        pathMeasure.getSegment(min, n2, path2, true);
        if (n2 > length) {
            path3.reset();
            pathMeasure.getSegment(0.0f, n2 % length, path3, true);
            path2.addPath(path3);
        }
        else if (min < 0.0f) {
            path3.reset();
            pathMeasure.getSegment(min + length, length, path3, true);
            path2.addPath(path3);
        }
        path.set(path2);
        yos.g();
    }
    
    public static void b(final Closeable closeable) {
        if (closeable == null) {
            goto Label_0016;
        }
        try {
            closeable.close();
            goto Label_0016;
        }
        catch (final RuntimeException ex) {
            throw ex;
        }
        catch (final Exception ex2) {
            goto Label_0016;
        }
    }
    
    public static float c() {
        if (mmw.f == -1.0f) {
            mmw.f = Resources.getSystem().getDisplayMetrics().density;
        }
        return mmw.f;
    }
    
    public static float d(final Matrix matrix) {
        final float[] array = mmw.d.get();
        array[1] = (array[0] = 0.0f);
        array[3] = (array[2] = mmw.e);
        matrix.mapPoints(array);
        return (float)Math.hypot(array[2] - array[0], array[3] - array[1]);
    }
    
    public static Bitmap e(final Bitmap bitmap, final int n, final int n2) {
        if (bitmap.getWidth() == n && bitmap.getHeight() == n2) {
            return bitmap;
        }
        final Bitmap scaledBitmap = Bitmap.createScaledBitmap(bitmap, n, n2, true);
        bitmap.recycle();
        return scaledBitmap;
    }
    
    public static void f(final Canvas canvas, final RectF rectF, final Paint paint, final int n) {
        if (Build$VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, n);
        }
        else {
            canvas.saveLayer(rectF, paint);
        }
        yos.g();
    }
}
