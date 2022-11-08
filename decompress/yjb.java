import android.os.BaseBundle;
import android.content.Intent;
import com.twitter.util.user.UserIdentifier;
import android.app.PendingIntent;
import java.util.List;
import java.util.Collections;
import android.os.Bundle;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yjb implements dpi
{
    public final Context a;
    public final psc b;
    
    public yjb(final Context a, final psc b) {
        this.a = a;
        this.b = b;
    }
    
    public final Object a(final Object o, final Object o2) {
        final jsi jsi = (jsi)o;
        final cpi cpi = (cpi)o2;
        final Bundle bundle = new Bundle();
        final cui cui = new cui((List)Collections.emptyList(), "deny");
        ((BaseBundle)bundle).putLong("user_id", jsi.n.b.a);
        final osi osi = new osi(this.a, fui.g, jsi);
        osi.e(cui, cui);
        osi.c(2131231771, this.a.getString(2131955502));
        osi.b.putExtras(bundle);
        final PendingIntent a = osi.a();
        final String c = cpi.c;
        final String string = this.a.getString(2131956014);
        String s = c;
        if (c == null) {
            s = string;
        }
        return new iqi(2131231771, (CharSequence)s, a);
    }
    
    public final void b(final Context context, final UserIdentifier userIdentifier, final Bundle bundle, final Intent intent) {
        final dkd dkd = new dkd(context, userIdentifier, ((BaseBundle)bundle).getLong("user_id"), 2);
        ((kmm)dkd).z(true);
        this.b.f((ksc)dkd);
    }
}
