import java.util.Objects;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cd9
{
    public static final qwe a;
    
    static {
        a = pps.m(3, (nsb)cd9$a.D0);
    }
    
    public static final long a(final Drawable drawable) {
        long n;
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            n = oj7.d((float)drawable.getIntrinsicWidth(), (float)drawable.getIntrinsicHeight());
        }
        else {
            Objects.requireNonNull(ddq.Companion);
            n = ddq.c;
        }
        return n;
    }
}
