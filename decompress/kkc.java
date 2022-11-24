import android.os.BaseBundle;
import android.net.Uri;
import android.os.Bundle;
import android.content.pm.PackageManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kkc extends gj8
{
    public final Context d;
    public final String e;
    
    public kkc(final Context d, final String e, final PackageManager packageManager) {
        super(d, e, packageManager);
        this.d = d;
        this.e = e;
    }
    
    public final String b() {
        return "hios";
    }
    
    public final int c(final wg1 wg1) {
        final boolean b = ita.a(wg1.a).b("android_should_badge_transsion_launchers_official_api", false);
        final boolean b2 = ita.a(wg1.a).b("android_should_badge_transsion_launchers_official_api_with_fallback", false);
        if (b) {
            try {
                this.e(wg1);
                return 1;
            }
            catch (final Exception ex) {
                return 2;
            }
            catch (final IllegalArgumentException ex2) {
                return 3;
            }
        }
        if (b2) {
            try {
                this.e(wg1);
                return 1;
            }
            catch (final Exception ex3) {
                return super.c(wg1);
            }
        }
        return super.c(wg1);
    }
    
    public final String d() {
        return "android_should_badge_transsion_launchers";
    }
    
    public final void e(final wg1 wg1) {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putString("package", this.d.getPackageName());
        ((BaseBundle)bundle).putString("class", this.e);
        ((BaseBundle)bundle).putInt("badgenumber", wg1.c);
        this.d.getContentResolver().call(Uri.parse("content://com.transsion.hilauncher.unreadprovider"), "change_badge", (String)null, bundle);
    }
}
