// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notification.service.firebase;

import java.util.HashMap;
import android.os.BaseBundle;
import java.util.Map;
import android.util.Log;
import com.twitter.util.user.UserIdentifier;
import java.util.Objects;
import com.google.firebase.messaging.FirebaseMessagingService;

public class TwitterFirebaseMessagingService extends FirebaseMessagingService
{
    public final pql M0;
    
    public TwitterFirebaseMessagingService() {
        final pql q4 = m58.m().q4();
        this.M0 = q4;
    }
    
    public final void d() {
        final fta a = fta.a();
        Objects.requireNonNull(a);
        final UserIdentifier logged_OUT = UserIdentifier.LOGGED_OUT;
        final fg4 fg4 = new fg4(logged_OUT);
        ((o1p)fg4).q(new String[] { "notification", "status_bar", null, null, "push_data_dropped" });
        ((o1p)fg4).s = 2;
        final int a2 = o5j.a;
        a.b(logged_OUT, (tlm)fg4);
    }
    
    public final void e(eem value) {
        if (((z8q)value.p()).isEmpty()) {
            final m9a m9a = new m9a();
            final Object o = ((BaseBundle)value.F0).getString("google.message_id");
            String string;
            if ((string = (String)o) == null) {
                string = ((BaseBundle)value.F0).getString("message_id");
            }
            vmw.g((Object)string);
            ((HashMap<String, String>)m9a.a).put("messageId", string);
            m9a.b = new IllegalArgumentException("[FCMMigration] Received FCM message with empty data");
            r9a.c(m9a);
            return;
        }
        final Map<String, String> p = value.p();
        value = (eem)((BaseBundle)value.F0).get("google.sent_time");
        long n = 0L;
        Label_0185: {
            if (value instanceof Long) {
                n = (long)value;
            }
            else {
                if (value instanceof String) {
                    try {
                        n = Long.parseLong((String)value);
                        break Label_0185;
                    }
                    catch (final NumberFormatException ex) {
                        final Object o = new StringBuilder();
                        ((StringBuilder)o).append("Invalid sent time: ");
                        ((StringBuilder)o).append(value);
                        Log.w("FirebaseMessaging", ((StringBuilder)o).toString());
                    }
                }
                n = 0L;
            }
        }
        ((z8q)p).put((Object)"sent_time", (Object)String.valueOf(n));
        final y0k y0k = new y0k(p);
        final pql m0 = this.M0;
        Objects.requireNonNull(m0);
        final UserIdentifier e = y0k.e();
        if (!((kfw)m0.a).l(e)) {
            return;
        }
        final String s = (String)((z8q)p).getOrDefault((Object)"scribe_target", (Object)null);
        vmw.g((Object)s);
        if (m0.k.b()) {
            m0.k.a(s);
            return;
        }
        final Object o = m0.f.a;
        ((hyo)o).a();
        try {
            String v;
            if ((v = (String)((z8q)p).getOrDefault((Object)"impression_id", (Object)null)) == null) {
                v = "not_provided";
            }
            ((hyo)o).f((Object)"impression_id", (Object)v);
            m0.h.d(e, s, v);
            final fta h = m0.h;
            Objects.requireNonNull(h);
            final fg4 fg4 = new fg4(e);
            ((o1p)fg4).q(new String[] { "notification", "status_bar", null, null, "push_data_received" });
            ((o1p)fg4).v = v;
            final int a = o5j.a;
            ((o1p)fg4).s = 2;
            h.b(e, (tlm)fg4);
            if (y0k.b() != 295) {
                if (!m0.e.d()) {
                    final fta h2 = m0.h;
                    Objects.requireNonNull(h2);
                    final fg4 fg5 = new fg4(e);
                    ((o1p)fg5).q(new String[] { "notification", "status_bar", null, s, "not_granted" });
                    h2.b(e, (tlm)fg5);
                }
                else if (!m0.e.m()) {
                    final fta h3 = m0.h;
                    Objects.requireNonNull(h3);
                    final fg4 fg6 = new fg4(e);
                    ((o1p)fg6).q(new String[] { "notification", "status_bar", null, s, "blocked" });
                    h3.b(e, (tlm)fg6);
                }
                else {
                    final t5j p2 = m0.d.g(y0k).P();
                    final rql c = m0.c;
                    Objects.requireNonNull(c);
                    final t5j filter = p2.doOnNext((rk6)new kxw((Object)c, 16)).filter((ouk)new e0h((Object)m0, 4));
                    final cpl g = m0.g;
                    Objects.requireNonNull(g);
                    filter.filter((ouk)new c5((Object)g)).subscribe((rk6)new a3x((Object)m0, 2));
                }
            }
        }
        finally {
            ((hyo)o).b();
            ((hyo)o).c();
        }
    }
    
    public final void f(final String s) {
        final fta a = fta.a();
        a.c("refresh");
        if (flr.e((CharSequence)s)) {
            a.c("invalid_received");
        }
        else {
            a.c("valid_received");
            m58.m().D7().c(s);
        }
    }
}
