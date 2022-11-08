import java.util.concurrent.TimeUnit;
import android.app.ActivityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jf8 implements lyr<t3h>
{
    public static final long b;
    public final ActivityManager a;
    
    static {
        b = TimeUnit.MINUTES.toMillis(5L);
    }
    
    public jf8(final ActivityManager a) {
        this.a = a;
    }
    
    public final Object get() {
        final int min = Math.min(this.a.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        int n;
        if (min < 33554432) {
            n = 4194304;
        }
        else if (min < 67108864) {
            n = 6291456;
        }
        else {
            n = min / 4;
        }
        return new t3h(n, 256, Integer.MAX_VALUE, Integer.MAX_VALUE, jf8.b);
    }
}
