import android.net.Uri$Builder;
import android.text.TextUtils;
import android.net.Uri;
import android.content.Intent;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public class q4c
{
    public static final int a;
    public static final q4c b;
    
    static {
        final AtomicBoolean a2 = e5c.a;
        a = 12451000;
        b = new q4c();
    }
    
    public final int a(final Context context) {
        final AtomicBoolean a = e5c.a;
        int versionCode = 0;
        try {
            versionCode = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
        }
        return versionCode;
    }
    
    public Intent b(final Context context, int n, String string) {
        if (n != 1 && n != 2) {
            if (n != 3) {
                return null;
            }
            n = oyz.a;
            final Uri fromParts = Uri.fromParts("package", "com.google.android.gms", (String)null);
            final Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        else {
            if (context != null && yt8.b(context)) {
                n = oyz.a;
                final Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
                intent2.setPackage("com.google.android.wearable.app");
                return intent2;
            }
            final StringBuilder j = fu8.j("gcore_");
            j.append(q4c.a);
            j.append("-");
            if (!TextUtils.isEmpty((CharSequence)string)) {
                j.append(string);
            }
            j.append("-");
            if (context != null) {
                j.append(context.getPackageName());
            }
            j.append("-");
            if (context != null) {
                try {
                    j.append(dux.a(context).b(context.getPackageName(), 0).versionCode);
                }
                catch (final PackageManager$NameNotFoundException ex) {}
            }
            string = j.toString();
            n = oyz.a;
            final Intent intent3 = new Intent("android.intent.action.VIEW");
            final Uri$Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
            if (!TextUtils.isEmpty((CharSequence)string)) {
                appendQueryParameter.appendQueryParameter("pcampaignid", string);
            }
            intent3.setData(appendQueryParameter.build());
            intent3.setPackage("com.android.vending");
            intent3.addFlags(524288);
            return intent3;
        }
    }
    
    public int c(final Context context, int b) {
        b = e5c.b(context, b);
        boolean b2 = true;
        if (b != 18) {
            b2 = (b == 1 && e5c.c(context));
        }
        if (b2) {
            return 18;
        }
        return b;
    }
}
