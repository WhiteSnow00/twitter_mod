import android.content.pm.PackageManager;
import android.os.Build$VERSION;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ep0
{
    public final Context a;
    
    public ep0(final Context a) {
        czd.f((Object)a, "context");
        this.a = a;
    }
    
    public final String a() {
        final PackageManager packageManager = this.a.getPackageManager();
        czd.e((Object)packageManager, "context.packageManager");
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
