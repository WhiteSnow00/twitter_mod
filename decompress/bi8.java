import java.util.Collection;
import android.content.Intent;
import com.twitter.util.user.UserIdentifier;
import android.content.pm.PackageManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class bi8 implements tue
{
    public final Context a;
    public final PackageManager b;
    public final String c;
    
    public bi8(final Context a, final String c, final PackageManager b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public final boolean a(final UserIdentifier userIdentifier) {
        return c0.b((tue)this, userIdentifier);
    }
    
    public String b() {
        return "unknown";
    }
    
    public int c(final tg1 tg1) {
        final Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count_package_name", this.a.getPackageName());
        intent.putExtra("badge_count_class_name", this.c);
        intent.putExtra("badge_count", tg1.c);
        this.a.sendBroadcast(intent);
        int n;
        if (fq4.t((Collection)this.b.queryBroadcastReceivers(intent, 0))) {
            n = 2;
        }
        else {
            n = 1;
        }
        return n;
    }
    
    public String d() {
        return null;
    }
}
