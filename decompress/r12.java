import android.graphics.BlendModeColorFilter;
import android.graphics.BlendMode;
import android.graphics.ColorFilter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r12
{
    public static ColorFilter a(final int n, final Object o) {
        return (ColorFilter)new BlendModeColorFilter(n, (BlendMode)o);
    }
}
