import android.graphics.ColorSpace;
import android.graphics.Bitmap$Config;
import android.graphics.BitmapFactory$Options;
import android.annotation.TargetApi;
import com.facebook.imagepipeline.platform.a;

// 
// Decompiled by Procyon v0.6.0
// 

@TargetApi(26)
public final class moj extends a
{
    public moj(final r02 r02, final int n, final grk grk) {
        super(r02, n, grk);
    }
    
    public final int d(int c, final int n, final BitmapFactory$Options bitmapFactory$Options) {
        final ColorSpace outColorSpace = bitmapFactory$Options.outColorSpace;
        if (outColorSpace != null && outColorSpace.isWideGamut() && bitmapFactory$Options.inPreferredConfig != Bitmap$Config.RGBA_F16) {
            c = c * n * 8;
        }
        else {
            Bitmap$Config bitmap$Config = bitmapFactory$Options.inPreferredConfig;
            if (bitmap$Config == null) {
                bitmap$Config = Bitmap$Config.ARGB_8888;
            }
            c = a12.c(c, n, bitmap$Config);
        }
        return c;
    }
}
