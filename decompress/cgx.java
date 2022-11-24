import android.content.Intent;
import com.twitter.util.user.UserIdentifier;
import android.content.ComponentName;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cgx implements qve
{
    public final Context a;
    public final gj8 b;
    public final ComponentName c;
    
    public cgx(final Context a, final ComponentName c, final gj8 b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final boolean a(final UserIdentifier userIdentifier) {
        return mqb.f((qve)this, userIdentifier);
    }
    
    @Override
    public final String b() {
        return "vivo";
    }
    
    @Override
    public final int c(final wg1 wg1) {
        final ComponentName c = this.c;
        int n = 2;
        if (c == null) {
            return 2;
        }
        final Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
        intent.putExtra("packageName", this.a.getPackageName());
        intent.putExtra("className", this.c.getClassName());
        intent.putExtra("notificationNum", wg1.c);
        final int c2 = this.b.c(wg1);
        final int e = mqb.e(intent, this.a);
        if (c2 == 1 || e == 1) {
            n = 1;
        }
        return n;
    }
    
    @Override
    public final String d() {
        return "android_should_badge_vivo_launchers";
    }
}
