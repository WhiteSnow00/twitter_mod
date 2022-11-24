import android.os.BaseBundle;
import android.os.Bundle;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build$VERSION;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vai
{
    public static Intent a(final Activity activity) {
        final Intent a = vai.a.a(activity);
        if (a != null) {
            return a;
        }
        try {
            final String c = c((Context)activity, activity.getComponentName());
            if (c == null) {
                return null;
            }
            final ComponentName component = new ComponentName((Context)activity, c);
            try {
                Intent intent;
                if (c((Context)activity, component) == null) {
                    intent = Intent.makeMainActivity(component);
                }
                else {
                    intent = new Intent().setComponent(component);
                }
                return intent;
            }
            catch (final PackageManager$NameNotFoundException ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("getParentActivityIntent: bad parentActivityName '");
                sb.append(c);
                sb.append("' in manifest");
                Log.e("NavUtils", sb.toString());
                return null;
            }
        }
        catch (final PackageManager$NameNotFoundException ex2) {
            throw new IllegalArgumentException((Throwable)ex2);
        }
    }
    
    public static Intent b(final Context context, ComponentName component) throws PackageManager$NameNotFoundException {
        final String c = c(context, component);
        if (c == null) {
            return null;
        }
        component = new ComponentName(component.getPackageName(), c);
        Intent intent;
        if (c(context, component) == null) {
            intent = Intent.makeMainActivity(component);
        }
        else {
            intent = new Intent().setComponent(component);
        }
        return intent;
    }
    
    public static String c(final Context context, final ComponentName componentName) throws PackageManager$NameNotFoundException {
        final PackageManager packageManager = context.getPackageManager();
        final int sdk_INT = Build$VERSION.SDK_INT;
        int n = 640;
        if (sdk_INT >= 29) {
            n = 269222528;
        }
        else if (sdk_INT >= 24) {
            n = 787072;
        }
        final ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, n);
        final String parentActivityName = activityInfo.parentActivityName;
        if (parentActivityName != null) {
            return parentActivityName;
        }
        final Bundle metaData = activityInfo.metaData;
        if (metaData == null) {
            return null;
        }
        final String string = ((BaseBundle)metaData).getString("android.support.PARENT_ACTIVITY");
        if (string == null) {
            return null;
        }
        String string2 = string;
        if (string.charAt(0) == '.') {
            final StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(string);
            string2 = sb.toString();
        }
        return string2;
    }
    
    public static final class a
    {
        public static Intent a(final Activity activity) {
            return activity.getParentActivityIntent();
        }
        
        public static boolean b(final Activity activity, final Intent intent) {
            return activity.navigateUpTo(intent);
        }
        
        public static boolean c(final Activity activity, final Intent intent) {
            return activity.shouldUpRecreateTask(intent);
        }
    }
}
