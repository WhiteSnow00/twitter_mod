import java.util.List;
import android.content.pm.PackageManager;
import android.content.Intent;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.content.pm.PackageInfo;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r9h
{
    public final Context a;
    public String b;
    public String c;
    public int d;
    public int e;
    
    public r9h(final Context a) {
        this.e = 0;
        this.a = a;
    }
    
    public static String b(final a1b a1b) {
        a1b.a();
        final String e = a1b.c.e;
        if (e != null) {
            return e;
        }
        a1b.a();
        final String b = a1b.c.b;
        if (!b.startsWith("1:")) {
            return b;
        }
        final String[] split = b.split(":");
        if (split.length < 2) {
            return null;
        }
        final String s = split[1];
        if (s.isEmpty()) {
            return null;
        }
        return s;
    }
    
    public final String a() {
        synchronized (this) {
            if (this.b == null) {
                this.e();
            }
            return this.b;
        }
    }
    
    public final PackageInfo c(final String s) {
        try {
            return this.a.getPackageManager().getPackageInfo(s, 0);
        }
        catch (final PackageManager$NameNotFoundException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed to find package ");
            sb.append(ex);
            Log.w("FirebaseMessaging", sb.toString());
            return null;
        }
    }
    
    public final boolean d() {
        synchronized (this) {
            int n = this.e;
            boolean b = true;
            Label_0202: {
                if (n != 0) {
                    monitorexit(this);
                }
                else {
                    final PackageManager packageManager = this.a.getPackageManager();
                    if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                        Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                        monitorexit(this);
                        n = 0;
                    }
                    else {
                        if (!fjk.a()) {
                            final Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                            intent.setPackage("com.google.android.gms");
                            final List queryIntentServices = packageManager.queryIntentServices(intent, 0);
                            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                                this.e = 1;
                                monitorexit(this);
                                n = 1;
                                break Label_0202;
                            }
                        }
                        final Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                        intent2.setPackage("com.google.android.gms");
                        final List queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                            this.e = 2;
                            monitorexit(this);
                            n = 2;
                        }
                        else {
                            Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                            if (fjk.a()) {
                                this.e = 2;
                            }
                            else {
                                this.e = 1;
                            }
                            n = this.e;
                            monitorexit(this);
                        }
                    }
                }
            }
            if (n == 0) {
                b = false;
            }
            return b;
        }
    }
    
    public final void e() {
        synchronized (this) {
            final PackageInfo c = this.c(this.a.getPackageName());
            if (c != null) {
                this.b = Integer.toString(c.versionCode);
                this.c = c.versionName;
            }
        }
    }
}
