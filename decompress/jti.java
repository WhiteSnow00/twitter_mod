import com.twitter.util.InvalidDataException;
import android.net.Uri;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jti implements iti
{
    public final Context a;
    public final PackageManager b;
    public final gn c;
    
    public jti(final Context a, final PackageManager b, final gn c) {
        e0e.f((Object)a, "context");
        e0e.f((Object)b, "packageManager");
        e0e.f((Object)c, "activityArgsIntentFactory");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Object a(final Object o) {
        final bti bti = (bti)o;
        e0e.f((Object)bti, "notificationInfo");
        Intent intent;
        if ((intent = bti.J) == null) {
            Intent setPackage = new Intent("android.intent.action.VIEW").setData(Uri.parse(bti.j)).setPackage(this.a.getPackageName());
            if (setPackage.resolveActivity(this.b) == null) {
                setPackage = null;
            }
            intent = setPackage;
            if (setPackage == null) {
                r9a.d((Throwable)new InvalidDataException(mqb.l("Invalid uri: ", bti.j)));
                intent = this.e();
            }
        }
        return intent;
    }
    
    public final Intent e() {
        final Intent setPackage = this.c.a(this.a, (cn)fgg.a(pgg.N0)).putExtra("notif_triggered_intent", true).setPackage(m61.a);
        e0e.e((Object)setPackage, "activityArgsIntentFactor\u2026tPackage(Authority.get())");
        return setPackage;
    }
}
