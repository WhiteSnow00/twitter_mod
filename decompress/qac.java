import android.content.ComponentName;
import android.content.Intent;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qac implements tue
{
    public final Context a;
    public final bi8 b;
    public final String c;
    
    public qac(final Context a, final String c, final bi8 b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public final boolean a(final UserIdentifier userIdentifier) {
        return c0.b((tue)this, userIdentifier);
    }
    
    public final String b() {
        return "htc";
    }
    
    public final int c(final tg1 tg1) {
        final Intent intent = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent.setFlags(65536);
        intent.putExtra("packagename", this.a.getPackageName());
        intent.putExtra("count", tg1.c);
        final int a = c0.a(intent, this.a);
        final String c = this.c;
        int n = 2;
        int a2;
        if (c == null) {
            a2 = 2;
        }
        else {
            final Intent intent2 = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
            intent2.setFlags(65536);
            intent2.putExtra("com.htc.launcher.extra.COMPONENT", new ComponentName(this.a.getPackageName(), this.c).flattenToShortString());
            intent2.putExtra("com.htc.launcher.extra.COUNT", tg1.c);
            a2 = c0.a(intent2, this.a);
        }
        final int c2 = this.b.c(tg1);
        if (a == 1 || a2 == 1 || c2 == 1) {
            n = 1;
        }
        return n;
    }
    
    public final String d() {
        return null;
    }
}
