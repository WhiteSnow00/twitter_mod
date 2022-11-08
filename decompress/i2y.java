import android.util.Log;
import android.content.res.Resources;
import android.content.pm.PackageManager$NameNotFoundException;
import android.text.TextUtils;
import android.content.Context;
import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i2y
{
    public static final l7q<String, String> a;
    public static Locale b;
    
    static {
        a = new l7q();
    }
    
    public static String a(final Context context) {
        final String packageName = context.getPackageName();
        try {
            final irj a = ntx.a(context);
            return a.a.getPackageManager().getApplicationLabel(a.a.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        }
        catch (final PackageManager$NameNotFoundException | NullPointerException ex) {
            final String name = context.getApplicationInfo().name;
            if (TextUtils.isEmpty((CharSequence)name)) {
                return packageName;
            }
            return name;
        }
    }
    
    public static String b(final Context context, final int n) {
        final Resources resources = context.getResources();
        if (n == 1) {
            return resources.getString(2131952550);
        }
        if (n == 2) {
            return resources.getString(2131952557);
        }
        if (n != 3) {
            return resources.getString(17039370);
        }
        return resources.getString(2131952547);
    }
    
    public static String c(final Context context, final int n) {
        final Resources resources = context.getResources();
        final String a = a(context);
        if (n == 1) {
            return resources.getString(2131952551, new Object[] { a });
        }
        if (n != 2) {
            if (n == 3) {
                return resources.getString(2131952548, new Object[] { a });
            }
            if (n == 5) {
                return e(context, "common_google_play_services_invalid_account_text", a);
            }
            if (n == 7) {
                return e(context, "common_google_play_services_network_error_text", a);
            }
            if (n == 9) {
                return resources.getString(2131952556, new Object[] { a });
            }
            if (n == 20) {
                return e(context, "common_google_play_services_restricted_profile_text", a);
            }
            switch (n) {
                default: {
                    return resources.getString(2131952555, new Object[] { a });
                }
                case 18: {
                    return resources.getString(2131952560, new Object[] { a });
                }
                case 17: {
                    return e(context, "common_google_play_services_sign_in_failed_text", a);
                }
                case 16: {
                    return e(context, "common_google_play_services_api_unavailable_text", a);
                }
            }
        }
        else {
            if (ou8.b(context)) {
                return resources.getString(2131952561);
            }
            return resources.getString(2131952558, new Object[] { a });
        }
    }
    
    public static String d(final Context context, final int n) {
        final Resources resources = context.getResources();
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(n);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
            }
            case 20: {
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return f(context, "common_google_play_services_restricted_profile_title");
            }
            case 17: {
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return f(context, "common_google_play_services_sign_in_failed_title");
            }
            case 16: {
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            }
            case 11: {
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            }
            case 10: {
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            }
            case 9: {
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            }
            case 8: {
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            }
            case 7: {
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return f(context, "common_google_play_services_network_error_title");
            }
            case 5: {
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return f(context, "common_google_play_services_invalid_account_title");
            }
            case 4:
            case 6:
            case 18: {
                return null;
            }
            case 3: {
                return resources.getString(2131952549);
            }
            case 2: {
                return resources.getString(2131952559);
            }
            case 1: {
                return resources.getString(2131952552);
            }
        }
    }
    
    public static String e(final Context context, String s, final String s2) {
        final Resources resources = context.getResources();
        String s3;
        s = (s3 = f(context, s));
        if (s == null) {
            s3 = resources.getString(2131952555);
        }
        return String.format(resources.getConfiguration().locale, s3, s2);
    }
    
    public static String f(final Context context, final String s) {
        final l7q<String, String> a = i2y.a;
        synchronized (a) {
            final Locale b = xf6.a(context.getResources().getConfiguration()).b(0);
            if (!b.equals(i2y.b)) {
                a.clear();
                i2y.b = b;
            }
            final String s2 = (String)a.getOrDefault((Object)s, (Object)null);
            if (s2 != null) {
                return s2;
            }
            final int e = b6c.e;
            Resources resourcesForApplication;
            try {
                resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
            }
            catch (final PackageManager$NameNotFoundException ex) {
                resourcesForApplication = null;
            }
            if (resourcesForApplication == null) {
                return null;
            }
            final int identifier = resourcesForApplication.getIdentifier(s, "string", "com.google.android.gms");
            if (identifier == 0) {
                String concat;
                if (s.length() != 0) {
                    concat = "Missing resource: ".concat(s);
                }
                else {
                    concat = new String("Missing resource: ");
                }
                Log.w("GoogleApiAvailability", concat);
                return null;
            }
            final String string = resourcesForApplication.getString(identifier);
            if (TextUtils.isEmpty((CharSequence)string)) {
                String concat2;
                if (s.length() != 0) {
                    concat2 = "Got empty resource: ".concat(s);
                }
                else {
                    concat2 = new String("Got empty resource: ");
                }
                Log.w("GoogleApiAvailability", concat2);
                return null;
            }
            i2y.a.put((Object)s, (Object)string);
            return string;
        }
    }
}
