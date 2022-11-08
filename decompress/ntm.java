import android.os.BaseBundle;
import com.twitter.util.user.UserIdentifier;
import android.app.PendingIntent;
import java.util.Objects;
import android.os.Parcelable;
import android.content.Intent;
import com.twitter.android.dialog.NotifyRetweetDialogFragmentActivity;
import android.os.Bundle;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ntm implements dpi
{
    public final Context a;
    public final psc b;
    public final msi c;
    public final xvi d;
    
    public ntm(final Context a, final psc b, final msi c, final xvi d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final Object a(Object o, final Object o2) {
        final jsi jsi = (jsi)o;
        final cpi cpi = (cpi)o2;
        final kvi b = jsi.n.b;
        final jvi m = jsi.m;
        final vo6 a = this.c.a(jsi);
        final Object o3 = o = null;
        if (m != null) {
            o = o3;
            if (b != null) {
                if (b.e) {
                    o = o3;
                }
                else {
                    final lev j = yf4.j(this.a, a, (String)null);
                    final cui cui = new cui(ijf.v((Object)j), "retweet");
                    final cui cui2 = new cui(ijf.v((Object)j), "quote_tweet");
                    final Bundle bundle = new Bundle();
                    ((BaseBundle)bundle).putLong("ref_status_id", m.a);
                    ((BaseBundle)bundle).putLong("status_id", m.b);
                    final osi osi = new osi(this.a, fui.c, jsi);
                    osi.e(cui, cui);
                    osi.c(2131231778, this.a.getString(2131955509));
                    osi.b.putExtras(bundle);
                    final PendingIntent b2 = this.d.b(jsi, Boolean.FALSE, new Intent(this.a, (Class)NotifyRetweetDialogFragmentActivity.class).putExtra("open_app", true).putExtra("tweet", (Parcelable)a).putExtra("retweet_service_intent", (Parcelable)new Intent(osi.b)), cui2);
                    Objects.requireNonNull(lri.Companion);
                    if (!dta.c().b("android_disable_retweet_dialog", false)) {
                        osi.d(b2);
                    }
                    final PendingIntent a2 = osi.a();
                    final String c = cpi.c;
                    final String string = this.a.getString(2131952309);
                    String s;
                    if ((s = c) == null) {
                        s = string;
                    }
                    o = new iqi(2131231778, (CharSequence)s, a2);
                }
            }
        }
        return o;
    }
    
    public final void b(final Context context, final UserIdentifier userIdentifier, final Bundle bundle, final Intent intent) {
        final cum cum = new cum(context, userIdentifier, ((BaseBundle)bundle).getLong("status_id"), ((BaseBundle)bundle).getLong("ref_status_id"), (hil)null);
        ((kmm)cum).z(true);
        this.b.f((ksc)cum);
    }
}
