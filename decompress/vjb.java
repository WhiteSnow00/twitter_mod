import android.os.BaseBundle;
import android.content.Intent;
import com.twitter.util.user.UserIdentifier;
import android.app.PendingIntent;
import java.util.Collections;
import android.os.Bundle;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vjb implements zpi
{
    public final Context a;
    public final tsc b;
    
    public vjb(final Context a, final tsc b) {
        this.a = a;
        this.b = b;
    }
    
    public final Object a(final Object o, final Object o2) {
        final bti bti = (bti)o;
        final ypi ypi = (ypi)o2;
        final Bundle bundle = new Bundle();
        final uui uui = new uui(Collections.emptyList(), "deny");
        ((BaseBundle)bundle).putLong("user_id", bti.n.b.a);
        final gti gti = new gti(this.a, xui.g, bti);
        gti.e(uui, uui);
        gti.c(2131231771, this.a.getString(2131955502));
        gti.b.putExtras(bundle);
        final PendingIntent a = gti.a();
        final String c = ypi.c;
        final String string = this.a.getString(2131956014);
        String s = c;
        if (c == null) {
            s = string;
        }
        return new cri(2131231771, (CharSequence)s, a);
    }
    
    public final void b(final Context context, final UserIdentifier userIdentifier, final Bundle bundle, final Intent intent) {
        final hkd hkd = new hkd(context, userIdentifier, ((BaseBundle)bundle).getLong("user_id"), 2);
        ((pnm)hkd).z(true);
        this.b.f((pnm)hkd);
    }
}
