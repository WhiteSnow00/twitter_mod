import android.net.Uri$Builder;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dse
{
    public static String a(String j) {
        if (j == null) {
            return null;
        }
        final Uri$Builder buildUpon = Uri.parse(j).buildUpon();
        j = wau.c().j("kdt", "");
        if (pjr.g((CharSequence)j)) {
            buildUpon.appendQueryParameter("kdt", j);
        }
        return buildUpon.toString();
    }
}
