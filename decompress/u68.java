import android.os.BaseBundle;
import android.os.Bundle;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.SharedPreferences;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Build$VERSION;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u68
{
    public final qnl a;
    public boolean b;
    
    public u68(Context a, final String s, final qnl a2) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 24) {
            final Object a3 = kn6.a;
            if (sdk_INT >= 24) {
                a = kn6.e.a(a);
            }
            else {
                a = null;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("com.google.firebase.common.prefs:");
        sb.append(s);
        final SharedPreferences sharedPreferences = a.getSharedPreferences(sb.toString(), 0);
        this.a = a2;
        final boolean contains = sharedPreferences.contains("firebase_data_collection_default_enabled");
        final boolean b = true;
        while (true) {
            if (contains) {
                final boolean b2 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                break Label_0183;
            }
            try {
                final PackageManager packageManager = a.getPackageManager();
                boolean b2 = b;
                if (packageManager != null) {
                    final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(a.getPackageName(), 128);
                    b2 = b;
                    if (applicationInfo != null) {
                        final Bundle metaData = applicationInfo.metaData;
                        b2 = b;
                        if (metaData != null) {
                            b2 = b;
                            if (((BaseBundle)metaData).containsKey("firebase_data_collection_default_enabled")) {
                                b2 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                            }
                        }
                    }
                }
                this.b = b2;
            }
            catch (final PackageManager$NameNotFoundException ex) {
                final boolean b2 = b;
                continue;
            }
            break;
        }
    }
}
