import android.os.SystemClock;
import com.google.android.exoplayer2.upstream.h$a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uvt
{
    public static h$a a(final hha hha) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final int length = ((qvt)hha).length();
        int i = 0;
        int n = 0;
        while (i < length) {
            int n2 = n;
            if (hha.f(i, elapsedRealtime)) {
                n2 = n + 1;
            }
            ++i;
            n = n2;
        }
        return new h$a(length, n);
    }
}
