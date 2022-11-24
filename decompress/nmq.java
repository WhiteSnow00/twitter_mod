import android.content.pm.ProviderInfo;
import java.util.Collection;
import android.content.Intent;
import android.net.Uri;
import android.content.ContentValues;
import com.twitter.util.user.UserIdentifier;
import android.content.pm.PackageManager;
import android.content.ContentResolver;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nmq implements qve
{
    public final Context a;
    public final ContentResolver b;
    public final PackageManager c;
    public final u7k d;
    public final String e;
    
    public nmq(final Context a, final ContentResolver b, final String e, final PackageManager c, final u7k d) {
        this.a = a;
        this.b = b;
        this.e = e;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean a(final UserIdentifier userIdentifier) {
        return mqb.f((qve)this, userIdentifier);
    }
    
    @Override
    public final String b() {
        return "sony";
    }
    
    @Override
    public final int c(final wg1 wg1) {
        final ProviderInfo resolveContentProvider = this.c.resolveContentProvider("com.sonymobile.home.resourceprovider", 0);
        final int n = 1;
        final int n2 = 1;
        final boolean b = resolveContentProvider != null;
        final int n3 = 2;
        if (b) {
            final ContentValues contentValues = new ContentValues();
            contentValues.put("badge_count", Integer.valueOf(wg1.c));
            contentValues.put("package_name", this.a.getPackageName());
            contentValues.put("activity_name", this.e);
            int n4;
            try {
                this.b.insert(Uri.parse("content://com.sonymobile.home.resourceprovider/badge"), contentValues);
                n4 = n2;
            }
            catch (final Exception ex) {
                r9a.d((Throwable)ex);
                n4 = 2;
            }
            catch (final IllegalArgumentException ex2) {
                n4 = 3;
            }
            return n4;
        }
        int n5;
        if (!this.d.a(this.a, new String[] { "com.sonyericsson.home.permission.BROADCAST_BADGE" })) {
            n5 = n3;
        }
        else {
            final Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", this.a.getPackageName());
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", this.e);
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(wg1.c));
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", wg1.c > 0);
            this.a.sendBroadcast(intent);
            n5 = n;
            if (kr4.t((Collection)this.c.queryBroadcastReceivers(intent, 0))) {
                n5 = 2;
            }
        }
        return n5;
    }
    
    @Override
    public final String d() {
        return null;
    }
}
