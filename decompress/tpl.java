import android.os.Bundle;
import java.util.Objects;
import android.content.Intent;
import com.twitter.notification.push.NotificationService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tpl implements spl
{
    public final NotificationService a;
    
    public tpl(final NotificationService a) {
        zzd.f((Object)a, "service");
        this.a = a;
    }
    
    public final void a(final Intent intent) {
        final NotificationService a = this.a;
        Objects.requireNonNull(a);
        final Bundle extras = intent.getExtras();
        if (extras != null) {
            final jsi b = oer.b(extras);
            if (b != null) {
                ((n9q)((bra)a.H0).a((Object)b)).G((fk6)new kww((Object)a, (Object)extras, 5), (fk6)jvb.e);
            }
        }
    }
    
    public final void b(final Bundle bundle) {
        this.a.e(bundle);
    }
    
    public final void c(final Bundle bundle) {
        this.a.c(bundle, false, false);
    }
}
