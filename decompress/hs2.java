import java.util.Locale;
import android.os.Build$VERSION;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hs2
{
    public static boolean a(final String s) {
        final String codename = Build$VERSION.CODENAME;
        final boolean equals = "REL".equals(codename);
        boolean b = false;
        if (equals) {
            return false;
        }
        final Locale root = Locale.ROOT;
        if (codename.toUpperCase(root).compareTo(s.toUpperCase(root)) >= 0) {
            b = true;
        }
        return b;
    }
    
    public static boolean b() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT < 33) {
            if (sdk_INT >= 32) {
                final String codename = Build$VERSION.CODENAME;
                if (a("Tiramisu")) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
}
