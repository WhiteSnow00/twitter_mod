import android.os.BaseBundle;
import android.content.pm.PackageManager$NameNotFoundException;
import java.util.Map;
import java.util.HashMap;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iwz
{
    public static final f3a e;
    public static final Intent f;
    public yfy<vuz> a;
    public final String b;
    public final Context c;
    public final vxz d;
    
    static {
        e = new f3a("AppUpdateService");
        f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    }
    
    public iwz(Context c, final vxz d) {
        this.b = c.getPackageName();
        this.c = c;
        this.d = d;
        if (mpy.b(c)) {
            final Context applicationContext = c.getApplicationContext();
            if (applicationContext != null) {
                c = applicationContext;
            }
            this.a = new yfy<vuz>(c, iwz.e, "AppUpdateService", iwz.f, (iey)chw.V0);
        }
    }
    
    public static Bundle a(final iwz iwz, String packageName) {
        final Bundle bundle = new Bundle();
        final Bundle bundle2 = new Bundle();
        final HashMap a = uik.a;
        final Bundle bundle3 = new Bundle();
        synchronized (uik.class) {
            final HashMap a2 = uik.a;
            if (!a2.containsKey("app_update")) {
                final HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
                hashMap.put("java", 11002);
                a2.put("app_update", hashMap);
            }
            final Map map = a2.get("app_update");
            monitorexit(uik.class);
            ((BaseBundle)bundle3).putInt("playcore_version_code", (int)map.get("java"));
            if (map.containsKey("native")) {
                ((BaseBundle)bundle3).putInt("playcore_native_version", (int)map.get("native"));
            }
            if (map.containsKey("unity")) {
                ((BaseBundle)bundle3).putInt("playcore_unity_version", (int)map.get("unity"));
            }
            bundle2.putAll(bundle3);
            ((BaseBundle)bundle2).putInt("playcore.version.code", 11002);
            bundle.putAll(bundle2);
            ((BaseBundle)bundle).putString("package.name", packageName);
            Integer value;
            try {
                packageName = iwz.c.getPackageName();
                value = iwz.c.getPackageManager().getPackageInfo(packageName, 0).versionCode;
            }
            catch (final PackageManager$NameNotFoundException ex) {
                iwz.e.j("The current version of the app could not be retrieved", new Object[0]);
                value = null;
            }
            if (value != null) {
                ((BaseBundle)bundle).putInt("app.version.code", (int)value);
            }
            return bundle;
        }
    }
}
