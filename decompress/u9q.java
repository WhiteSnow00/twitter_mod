import java.util.AbstractCollection;
import java.io.InputStream;
import android.graphics.Bitmap$CompressFormat;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory$Options;
import java.io.OutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u9q implements k9d
{
    public final boolean a;
    public final int b;
    
    public u9q(final boolean a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final j9d a(l4a l4a, OutputStream outputStream, klo decodeStream, Integer n) {
        Integer value;
        if (n == null) {
            value = 85;
        }
        else {
            value = n;
        }
        klo c;
        if (decodeStream == null) {
            c = klo.c;
        }
        else {
            c = decodeStream;
        }
        final boolean a = this.a;
        boolean b = true;
        int f;
        if (!a) {
            f = 1;
        }
        else {
            f = egz.f(l4a, this.b);
        }
        final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
        bitmapFactory$Options.inSampleSize = f;
        try {
            final InputStream f2 = l4a.f();
            final Matrix matrix = null;
            decodeStream = (klo)BitmapFactory.decodeStream(f2, (Rect)null, bitmapFactory$Options);
            if (decodeStream == null) {
                fr0.q("SimpleImageTranscoder", "Couldn't decode the EncodedImage InputStream ! ");
                return new j9d(2);
            }
            final ded<Integer> a2 = rce.a;
            l4a.r();
            Matrix matrix2;
            if (((AbstractCollection)a2).contains(l4a.J0)) {
                final int a3 = rce.a(c, l4a);
                matrix2 = new Matrix();
                if (a3 != 2) {
                    if (a3 != 7) {
                        if (a3 != 4) {
                            if (a3 != 5) {
                                matrix2 = matrix;
                            }
                            else {
                                matrix2.setRotate(90.0f);
                                matrix2.postScale(-1.0f, 1.0f);
                            }
                        }
                        else {
                            matrix2.setRotate(180.0f);
                            matrix2.postScale(-1.0f, 1.0f);
                        }
                    }
                    else {
                        matrix2.setRotate(-90.0f);
                        matrix2.postScale(-1.0f, 1.0f);
                    }
                }
                else {
                    matrix2.setScale(-1.0f, 1.0f);
                }
            }
            else {
                final int b2 = rce.b(c, l4a);
                matrix2 = matrix;
                if (b2 != 0) {
                    matrix2 = new Matrix();
                    matrix2.setRotate((float)b2);
                }
            }
            Label_0406: {
                Label_0316: {
                    if (matrix2 != null) {
                        try {
                            Bitmap.createBitmap((Bitmap)decodeStream, 0, 0, ((Bitmap)decodeStream).getWidth(), ((Bitmap)decodeStream).getHeight(), matrix2, false);
                            break Label_0316;
                        }
                        catch (final OutOfMemoryError outOfMemoryError) {}
                        finally {
                            outputStream = (OutputStream)decodeStream;
                            break Label_0406;
                        }
                    }
                    l4a = (l4a)decodeStream;
                }
                n = (Integer)l4a;
                try {
                    try {
                        ((Bitmap)l4a).compress(Bitmap$CompressFormat.JPEG, (int)value, outputStream);
                        if (f > 1) {
                            b = false;
                        }
                        n = (Integer)l4a;
                        outputStream = (OutputStream)new j9d((int)(b ? 1 : 0));
                        ((Bitmap)l4a).recycle();
                        ((Bitmap)decodeStream).recycle();
                        return (j9d)outputStream;
                    }
                    finally {
                        outputStream = (OutputStream)n;
                    }
                }
                catch (final OutOfMemoryError outOfMemoryError2) {}
                fr0.r("SimpleImageTranscoder", "Out-Of-Memory during transcode", (Throwable)outputStream);
                final j9d j9d = new j9d(2);
                ((Bitmap)l4a).recycle();
                ((Bitmap)decodeStream).recycle();
                return j9d;
            }
            ((Bitmap)outputStream).recycle();
            ((Bitmap)decodeStream).recycle();
        }
        catch (final OutOfMemoryError outOfMemoryError3) {
            fr0.r("SimpleImageTranscoder", "Out-Of-Memory during transcode", (Throwable)outOfMemoryError3);
            return new j9d(2);
        }
    }
    
    public final String b() {
        return "SimpleImageTranscoder";
    }
    
    public final boolean c(final l4a l4a, final klo klo) {
        final boolean a = this.a;
        boolean b = true;
        if (!a || egz.f(l4a, this.b) <= 1) {
            b = false;
        }
        return b;
    }
    
    public final boolean d(final k7d k7d) {
        return k7d == shw.T0 || k7d == shw.J0;
    }
}
