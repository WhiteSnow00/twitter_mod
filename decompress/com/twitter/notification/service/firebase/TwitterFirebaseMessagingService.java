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
    public final dql K0;
    
    public TwitterFirebaseMessagingService() {
        final dql q4 = m1f.d().q4();
        this.K0 = q4;
    }
    
    @Override
    public final void d() {
        final xra a = xra.a();
        Objects.requireNonNull(a);
        final UserIdentifier logged_OUT = UserIdentifier.LOGGED_OUT;
        final af4 af4 = new af4(logged_OUT);
        ((u0p)af4).q(new String[] { "notification", "status_bar", null, null, "push_data_dropped" });
        ((u0p)af4).s = 2;
        final int a2 = c5j.a;
        a.b(logged_OUT, (elm)af4);
    }
    
    @Override
    public final void e(rdm value) {
        if (((d8q)value.r()).isEmpty()) {
            final h8a h8a = new h8a();
            final Object o = ((BaseBundle)value.D0).getString("google.message_id");
            String string;
            if ((string = (String)o) == null) {
                string = ((BaseBundle)value.D0).getString("message_id");
            }
            jee.l((Object)string);
            ((HashMap<String, String>)h8a.a).put("messageId", string);
            h8a.b = new IllegalArgumentException("[FCMMigration] Received FCM message with empty data");
            m8a.c(h8a);
            return;
        }
        final Map r = value.r();
        value = (rdm)((BaseBundle)value.D0).get("google.sent_time");
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
        ((d8q<String, String>)r).put("sent_time", String.valueOf(n));
        final i0k i0k = new i0k(r);
        final dql k0 = this.K0;
        Objects.requireNonNull(k0);
        final UserIdentifier e = i0k.e();
        if (!((uew)k0.a).l(e)) {
            return;
        }
        final String s = ((d8q<K, String>)r).getOrDefault("scribe_target", null);
        jee.l((Object)s);
        if (k0.k.b()) {
            k0.k.a(s);
            return;
        }
        final Object o = k0.f.a;
        ((mxo)o).a();
        try {
            String v;
            if ((v = ((d8q<K, String>)r).getOrDefault("impression_id", null)) == null) {
                v = "not_provided";
            }
            ((mxo)o).f((Object)"impression_id", (Object)v);
            k0.h.d(e, s, v);
            final xra h = k0.h;
            Objects.requireNonNull(h);
            final af4 af4 = new af4(e);
            ((u0p)af4).q(new String[] { "notification", "status_bar", null, null, "push_data_received" });
            ((u0p)af4).v = v;
            final int a = c5j.a;
            ((u0p)af4).s = 2;
            h.b(e, (elm)af4);
            if (i0k.b() != 295) {
                if (!k0.e.d()) {
                    final xra h2 = k0.h;
                    Objects.requireNonNull(h2);
                    final af4 af5 = new af4(e);
                    ((u0p)af5).q(new String[] { "notification", "status_bar", null, s, "not_granted" });
                    h2.b(e, (elm)af5);
                }
                else if (!k0.e.m()) {
                    final xra h3 = k0.h;
                    Objects.requireNonNull(h3);
                    final af4 af6 = new af4(e);
                    ((u0p)af6).q(new String[] { "notification", "status_bar", null, s, "blocked" });
                    h3.b(e, (elm)af6);
                }
                else {
                    final h5j p = k0.d.g(i0k).P();
                    final fql c = k0.c;
                    Objects.requireNonNull(c);
                    final h5j filter = p.doOnNext((lj6)new ghh((Object)c, 22)).filter((ytk)new xi0((Object)k0, 11));
                    final qol g = k0.g;
                    Objects.requireNonNull(g);
                    filter.filter((ytk)new y4x((Object)g)).subscribe((lj6)new r8f((Object)k0, 4));
                }
            }
        }
        finally {
            ((mxo)o).b();
            ((mxo)o).c();
        }
    }
    
    @Override
    public final void f(final String s) {
        final xra a = xra.a();
        a.c("refresh");
        if (ikr.e((CharSequence)s)) {
            a.c("invalid_received");
        }
        else {
            a.c("valid_received");
            m1f.d().D7().c(s);
        }
    }
}
