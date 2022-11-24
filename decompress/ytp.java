import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ytp
{
    static {
        final ztp$a companion = ztp.Companion;
    }
    
    public static ztp a() {
        return ztp.Companion.a();
    }
    
    public static void b(final ztp ztp, final Context context, final zxp zxp, final ica ica, xtp xtp, final List list, final int n, final Object o) {
        Object f0 = null;
        if ((n & 0x8) != 0x0) {
            xtp = new xtp(false, false, 3, (wg8)null);
        }
        if ((n & 0x10) != 0x0) {
            f0 = h3a.F0;
        }
        ztp.b(context, zxp, ica, xtp, (List)f0);
    }
}
