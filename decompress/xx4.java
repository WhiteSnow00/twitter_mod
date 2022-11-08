import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xx4
{
    public static final aiq a;
    
    static {
        a = new aiq("CommonUtils", "");
    }
    
    @RecentlyNonNull
    public static String a(@RecentlyNonNull final Context context) {
        String value;
        try {
            value = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        }
        catch (final PackageManager$NameNotFoundException ex) {
            final aiq a = xx4.a;
            final String value2 = String.valueOf(ex);
            final String i = hi.I(new StringBuilder(value2.length() + 48), "Exception thrown when trying to get app version ", value2);
            if (a.b(6)) {
                Log.e("CommonUtils", a.g(i));
            }
            value = "";
        }
        return value;
    }
}
