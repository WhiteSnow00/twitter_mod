// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.browser;

import android.content.Intent;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import android.content.BroadcastReceiver;

public class CustomTabsActionReceiver extends BroadcastReceiver
{
    public static void a(final Context context, final c0p c0p, final String s, final String t) {
        final zf4 zf4 = new zf4(UserIdentifier.getCurrent());
        zf4.q(new String[] { l7k.c("chrome::::", s) });
        zf4.t = t;
        final int a = w4j.a;
        wvz.c(zf4, context, c0p, (String)null);
        saw.b((okm)zf4);
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        final eb7 j0 = eb7.J0;
        if (context == null) {
            return;
        }
        final String action = intent.getAction();
        while (true) {
            for (final eb7 eb7 : eb7.values()) {
                if (eb7.C0.equals(action)) {
                    final String dataString = intent.getDataString();
                    final c0p c0p = (c0p)intent.getParcelableExtra("scribe_items_provider");
                    if (eb7 != j0) {
                        final Intent e = eb7.e(context, dataString);
                        if (e != null) {
                            context.startActivity(e);
                        }
                        eb7.b(context, dataString);
                        a(context, c0p, action, dataString);
                    }
                    else if ("tweet_text_icon".equals(action)) {
                        final d4c a = c4c.a();
                        final o76 o76 = new o76();
                        final StringBuilder sb = new StringBuilder();
                        sb.append(' ');
                        sb.append(dataString);
                        o76.r(sb.toString(), 0);
                        o76.o("chrome_action");
                        o76.q(false);
                        a.a((zm)o76);
                        a(context, c0p, action, dataString);
                    }
                    return;
                }
            }
            eb7 eb7 = j0;
            continue;
        }
    }
}
