import android.content.pm.PackageManager;
import android.os.Build$VERSION;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kp0
{
    public final Context a;
    
    public kp0(final Context a) {
        zzd.f((Object)a, "context");
        this.a = a;
    }
    
    public final String a() {
        final PackageManager packageManager = this.a.getPackageManager();
        zzd.e((Object)packageManager, "context.packageManager");
        try {
            String s;
            if (Build$VERSION.SDK_INT >= 30) {
                s = packageManager.getInstallSourceInfo(this.a.getPackageName()).getInstallingPackageName();
            }
            else {
                s = packageManager.getInstallerPackageName(this.a.getPackageName());
            }
            return s;
        }
        catch (final Exception ex) {
            return null;
        }
    }
}
