import android.os.BaseBundle;
import android.os.Bundle;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.content.Context;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h78
{
    public final SharedPreferences a;
    public final b1b b;
    public final Object c;
    public ebs<Void> d;
    public boolean e;
    public boolean f;
    public Boolean g;
    public final ebs<Void> h;
    
    public h78(final b1b b) {
        final Object c = new Object();
        this.c = c;
        this.d = (ebs<Void>)new ebs();
        this.e = false;
        this.f = false;
        this.h = (ebs<Void>)new ebs();
        b.a();
        final Context a = b.a;
        this.b = b;
        final SharedPreferences h = wx4.h(a);
        this.a = h;
        Boolean value;
        if (h.contains("firebase_crashlytics_collection_enabled")) {
            this.f = false;
            value = h.getBoolean("firebase_crashlytics_collection_enabled", true);
        }
        else {
            value = null;
        }
        Boolean a2 = value;
        if (value == null) {
            a2 = this.a(a);
        }
        this.g = a2;
        synchronized (c) {
            if (this.b()) {
                this.d.d((Object)null);
                this.e = true;
            }
        }
    }
    
    public final Boolean a(final Context context) {
        Boolean value = null;
        Label_0071: {
            try {
                final PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
                    if (applicationInfo != null) {
                        final Bundle metaData = applicationInfo.metaData;
                        if (metaData != null && ((BaseBundle)metaData).containsKey("firebase_crashlytics_collection_enabled")) {
                            value = applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled");
                            break Label_0071;
                        }
                    }
                }
            }
            catch (final PackageManager$NameNotFoundException ex) {
                Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", (Throwable)ex);
            }
            value = null;
        }
        if (value == null) {
            this.f = false;
            return null;
        }
        this.f = true;
        return Boolean.TRUE.equals(value);
    }
    
    public final boolean b() {
        synchronized (this) {
            final Boolean g = this.g;
            boolean b;
            if (g != null) {
                b = g;
            }
            else {
                b = this.b.g();
            }
            this.c(b);
            return b;
        }
    }
    
    public final void c(final boolean b) {
        String s;
        if (b) {
            s = "ENABLED";
        }
        else {
            s = "DISABLED";
        }
        String s2;
        if (this.g == null) {
            s2 = "global Firebase setting";
        }
        else if (this.f) {
            s2 = "firebase_crashlytics_collection_enabled manifest flag";
        }
        else {
            s2 = "API";
        }
        boolean b2 = false;
        final String format = String.format("Crashlytics automatic data collection %s by %s.", s, s2);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            b2 = true;
        }
        if (b2) {
            Log.d("FirebaseCrashlytics", format, (Throwable)null);
        }
    }
}
