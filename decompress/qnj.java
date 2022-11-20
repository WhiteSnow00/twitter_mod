import android.os.BaseBundle;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collection;
import android.content.Intent;
import com.twitter.util.user.UserIdentifier;
import android.content.ContentResolver;
import android.content.pm.PackageManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qnj implements tue
{
    public final Context a;
    public final PackageManager b;
    public final ContentResolver c;
    
    public qnj(final Context a, final ContentResolver c, final PackageManager b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public final boolean a(final UserIdentifier userIdentifier) {
        return c0.b((tue)this, userIdentifier);
    }
    
    public final String b() {
        return "oppo";
    }
    
    public final int c(final tg1 tg1) {
        final int c = tg1.c;
        final Intent intent = new Intent("com.oppo.unsettledevent");
        intent.putExtra("packageName", this.a.getPackageName()).putExtra("number", c).putExtra("upgradeNumber", c);
        this.a.sendBroadcast(intent);
        if (!(fq4.t((Collection)this.b.queryBroadcastReceivers(intent, 0)) ^ true)) {
            try {
                final Bundle bundle = new Bundle();
                ((BaseBundle)bundle).putInt("app_badge_count", c);
                this.c.call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String)null, bundle);
                return 1;
            }
            catch (final Exception ex) {
                return 2;
            }
            catch (final IllegalArgumentException ex2) {
                return 3;
            }
        }
        return 1;
    }
    
    public final String d() {
        return "android_should_badge_oppo_launchers";
    }
}
