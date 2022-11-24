import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lnx extends yrb
{
    public final int f(final Uri uri, final boolean b) {
        if (p6w.u(uri)) {
            if (!b) {
                return ((xsd)super.F0).c(uri);
            }
            if (p6w.t(uri.getAuthority())) {
                return ((xsd)super.F0).c(uri);
            }
        }
        return -1;
    }
}
