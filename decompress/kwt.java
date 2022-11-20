import android.os.SystemClock;
import com.google.android.exoplayer2.upstream.h;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kwt
{
    public static h.a a(final kga kga) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final int length = ((gwt)kga).length();
        int i = 0;
        int n = 0;
        while (i < length) {
            int n2 = n;
            if (kga.f(i, elapsedRealtime)) {
                n2 = n + 1;
            }
            ++i;
            n = n2;
        }
        return new h.a(length, n);
    }
}
