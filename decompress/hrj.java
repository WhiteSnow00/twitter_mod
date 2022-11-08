import android.content.pm.PackageManager;
import android.content.ComponentName;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hrj
{
    public static final String a;
    
    static {
        a = y9g.g("PackageManagerHelper");
    }
    
    public static void a(final Context context, final Class<?> clazz, final boolean b) {
        final String s = "enabled";
        try {
            final PackageManager packageManager = context.getPackageManager();
            final ComponentName componentName = new ComponentName(context, clazz.getName());
            int n;
            if (b) {
                n = 1;
            }
            else {
                n = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, n, 1);
            final y9g e = y9g.e();
            final String a = hrj.a;
            final StringBuilder sb = new StringBuilder();
            sb.append(clazz.getName());
            sb.append(" ");
            String s2;
            if (b) {
                s2 = "enabled";
            }
            else {
                s2 = "disabled";
            }
            sb.append(s2);
            e.a(a, sb.toString());
        }
        catch (final Exception ex) {
            final y9g e2 = y9g.e();
            final String a2 = hrj.a;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(clazz.getName());
            sb2.append("could not be ");
            String s3;
            if (b) {
                s3 = s;
            }
            else {
                s3 = "disabled";
            }
            sb2.append(s3);
            e2.b(a2, sb2.toString(), (Throwable)ex);
        }
    }
}
