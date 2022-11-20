import android.graphics.Bitmap$Config;
import java.util.Objects;
import android.graphics.BitmapFactory$Options;
import android.annotation.TargetApi;
import com.facebook.imagepipeline.platform.a;

// 
// Decompiled by Procyon v0.6.0
// 

@TargetApi(21)
public final class et0 extends a
{
    public et0(final r02 r02, final int n, final grk grk) {
        super(r02, n, grk);
    }
    
    public final int d(final int n, final int n2, final BitmapFactory$Options bitmapFactory$Options) {
        final Bitmap$Config inPreferredConfig = bitmapFactory$Options.inPreferredConfig;
        Objects.requireNonNull(inPreferredConfig);
        return a12.c(n, n2, inPreferredConfig);
    }
}
