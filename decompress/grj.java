import android.content.Context;
import java.util.Iterator;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.content.Intent;
import android.content.pm.PackageManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class grj
{
    public static String a(final PackageManager packageManager) {
        final Intent intent = new Intent("android.intent.action.AUTO_REVOKE_PERMISSIONS");
        String s = null;
        final Iterator iterator = packageManager.queryIntentActivities(intent.setData(Uri.fromParts("package", "com.example", (String)null)), 0).iterator();
        while (iterator.hasNext()) {
            final String packageName = ((ResolveInfo)iterator.next()).activityInfo.packageName;
            if (packageManager.checkPermission("android.permission.PACKAGE_VERIFICATION_AGENT", packageName) != 0) {
                continue;
            }
            if (s != null) {
                return s;
            }
            s = packageName;
        }
        return s;
    }
    
    public static final class a
    {
        public static boolean a(final Context context) {
            return context.getPackageManager().isAutoRevokeWhitelisted() ^ true;
        }
    }
}
