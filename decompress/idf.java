import android.util.DisplayMetrics;
import android.graphics.Path;
import android.graphics.Canvas;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class idf extends kdf
{
    public idf(final cu3 cu3, final t9x t9x) {
        super(cu3, t9x);
    }
    
    public final void r(final Canvas canvas, final Path path, final int n, final int n2) {
        final DisplayMetrics a = nmw.a;
        final int save = canvas.save();
        canvas.clipPath(path);
        canvas.drawColor((n & 0xFFFFFF) | n2 << 24);
        canvas.restoreToCount(save);
    }
}
