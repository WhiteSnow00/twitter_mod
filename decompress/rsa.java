import android.os.BaseBundle;
import android.content.Intent;
import com.twitter.util.user.UserIdentifier;
import android.app.PendingIntent;
import android.os.Bundle;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rsa implements dpi
{
    public final Context a;
    public final psc b;
    public final msi c;
    
    public rsa(final Context a, final psc b, final msi c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Object a(Object o, final Object o2) {
        final jsi jsi = (jsi)o;
        final cpi cpi = (cpi)o2;
        final kvi b = jsi.n.b;
        final vo6 a = this.c.a(jsi);
        final jvi m = jsi.m;
        final Object o3 = o = null;
        if (m != null) {
            if (b == null) {
                o = o3;
            }
            else {
                final Bundle bundle = new Bundle();
                ((BaseBundle)bundle).putLong("status_id", m.b);
                ((BaseBundle)bundle).putLong("rt_status_id", m.a);
                final cui cui = new cui(ijf.v((Object)yf4.j(this.a, a, (String)null)), "favorite");
                final osi osi = new osi(this.a, fui.d, jsi);
                osi.e(cui, cui);
                osi.c(2131231775, this.a.getString(2131955505));
                osi.b.putExtras(bundle);
                final PendingIntent a2 = osi.a();
                final String c = cpi.c;
                final String string = this.a.getString(2131952298);
                String s;
                if ((s = c) == null) {
                    s = string;
                }
                o = new iqi(2131231775, (CharSequence)s, a2);
            }
        }
        return o;
    }
    
    public final void b(final Context context, final UserIdentifier userIdentifier, final Bundle bundle, final Intent intent) {
        final h7c h7c = new h7c(context, userIdentifier, ((BaseBundle)bundle).getLong("status_id"), ((BaseBundle)bundle).getLong("rt_status_id"));
        ((kmm)h7c).z(true);
        this.b.f((ksc)h7c);
    }
}
