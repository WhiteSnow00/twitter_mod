// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.analytics.tracking;

import android.content.Intent;
import android.content.BroadcastReceiver;
import java.util.Objects;
import android.content.Context;

public final class InstallationReferrer
{
    public final Context a;
    public final qbu b;
    public final a c;
    public final esd d;
    public final mq e;
    public final e f;
    public final xej g;
    public final do0 h;
    public final iq i;
    
    public InstallationReferrer(final Context a, final qbu b, final a c, final esd d, final mq e, final e f, final xej g, final do0 h, final iq i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public static void a(final InstallationReferrer installationReferrer, final String s, final m40 m40, final String s2) {
        final e f = installationReferrer.f;
        final d d = new d(installationReferrer, s, m40, s2);
        Objects.requireNonNull(f);
        try {
            new f(f.a, (e.a)d).a();
        }
        catch (final Exception ex) {}
    }
    
    public final boolean b(final String s, final m40 m40, final String s2, final t4c t4c) {
        return this.c("com.android.vending.INSTALL_REFERRER", s, m40, s2, false, t4c);
    }
    
    public final boolean c(final String s, final String s2, final m40 m40, final String s3, final boolean b, final t4c t4c) {
        if (!ikr.g((CharSequence)this.b.j("oem_referrer", "")) && ikr.g((CharSequence)s)) {
            this.b.i().b("oem_referrer", s).e();
            this.h.get().q((psb)new isd(this, s2, m40, s3, b, t4c, s)).p();
            return true;
        }
        return false;
    }
    
    public static class OemIntentReceiver extends BroadcastReceiver
    {
        public final void onReceive(final Context context, final Intent intent) {
            final InstallationReferrer o0 = zc.k().O0();
            final String action = intent.getAction();
            final String stringExtra = intent.getStringExtra("OEM");
            final String stringExtra2 = intent.getStringExtra("oem_referring_link");
            if ("com.twitter.intent.action.SEND_OEM".equals(action)) {
                o0.c(stringExtra, stringExtra, null, stringExtra2, true, null);
                final af4 af4 = new af4(new String[] { "external::oem:receiver:referred" });
                ((u0p)af4).t = stringExtra;
                final int a = c5j.a;
                cbw.b((elm)af4);
            }
            else {
                final af4 af5 = new af4(new String[] { "external::oem:receiver:error" });
                ((u0p)af5).t = action;
                final int a2 = c5j.a;
                cbw.b((elm)af5);
            }
        }
    }
}
