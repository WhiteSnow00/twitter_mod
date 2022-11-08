import android.graphics.Bitmap$Config;
import java.util.Objects;
import android.graphics.BitmapFactory$Options;
import android.annotation.TargetApi;
import com.facebook.imagepipeline.platform.a;

// 
// Decompiled by Procyon v0.6.0
// 

@TargetApi(21)
public final class lt0 extends a
{
    public lt0(final x02 x02, final int n, final yqk yqk) {
        super(x02, n, yqk);
    }
    
    public final int d(final int n, final int n2, final BitmapFactory$Options bitmapFactory$Options) {
        final Bitmap$Config inPreferredConfig = bitmapFactory$Options.inPreferredConfig;
        Objects.requireNonNull(inPreferredConfig);
        return g12.c(n, n2, inPreferredConfig);
    }
}
