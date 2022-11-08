import android.os.BaseBundle;
import android.content.Intent;
import com.twitter.util.user.UserIdentifier;
import android.app.PendingIntent;
import android.os.Bundle;
import java.util.List;
import java.util.Collections;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bib implements dpi
{
    public final Context a;
    public final psc b;
    
    public bib(final Context a, final psc b) {
        this.a = a;
        this.b = b;
    }
    
    public final Object a(Object o, final Object o2) {
        final jsi jsi = (jsi)o;
        final cpi cpi = (cpi)o2;
        final kvi b = jsi.n.b;
        final cui cui = new cui((List)Collections.emptyList(), "follow");
        if (b != null && !b.f) {
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putLong("user_id", b.a);
            ((BaseBundle)bundle).putLong("owner_id", jsi.B.getId());
            int n;
            if (b.e) {
                n = 2131955503;
            }
            else {
                n = 2131955500;
            }
            final osi osi = new osi(this.a, fui.e, jsi);
            osi.e(cui, cui);
            osi.c(2131231774, this.a.getString(n));
            osi.b.putExtras(bundle);
            final PendingIntent a = osi.a();
            final String c = cpi.c;
            final String string = this.a.getString(2131954121);
            String s = c;
            if (c == null) {
                s = string;
            }
            o = new iqi(2131231773, (CharSequence)s, a);
        }
        else {
            o = null;
        }
        return o;
    }
    
    public final void b(final Context context, final UserIdentifier userIdentifier, final Bundle bundle, final Intent intent) {
        final p47 p4 = new p47(context, userIdentifier, ((BaseBundle)bundle).getLong("user_id"), null);
        p4.z(true);
        this.b.f((ksc)p4);
    }
}
