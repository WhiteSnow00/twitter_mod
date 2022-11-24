import android.os.BaseBundle;
import java.util.Map;
import android.content.Intent;
import com.twitter.model.liveevent.LiveEventConfiguration$a;
import com.twitter.model.liveevent.LiveEventConfiguration;
import java.util.HashMap;
import android.net.Uri;
import com.twitter.app.safetymode.api.FlaggedAccountsContentViewArgs;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.superfollows.billingerror.BillingError;
import com.twitter.superfollows.billingerror.BillingErrorContentViewArgs;
import com.twitter.superfollows.billingerror.BillingError$PaymentMethodFailure;
import android.content.Context;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rac implements ara
{
    public final int a;
    public final Bundle b;
    public final Context c;
    
    public rac(final Context c, final Bundle b, final int a) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public rac(final Bundle b, final Context c, final int a) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Object a() {
        switch (this.a) {
            default: {
                final Context c = this.c;
                final Bundle b = this.b;
                e0e.f((Object)c, "$context");
                e0e.f((Object)b, "$extras");
                return ao6.Companion.a().a(c, (ContentViewArgs)new BillingErrorContentViewArgs((BillingError)new BillingError$PaymentMethodFailure(e0e.a((Object)"google", (Object)((BaseBundle)b).getString("originating_platform")))));
            }
            case 5: {
                final Context c2 = this.c;
                final Bundle b2 = this.b;
                e0e.f((Object)c2, "$context");
                e0e.f((Object)b2, "$extras");
                return ao6.Companion.a().a(c2, (ContentViewArgs)new FlaggedAccountsContentViewArgs()).putExtras(b2);
            }
            case 4: {
                final Bundle b3 = this.b;
                final Context c3 = this.c;
                e0e.f((Object)b3, "$extras");
                e0e.f((Object)c3, "$context");
                return gn.Companion.a().a(c3, (cn)fgg.b(Uri.parse(((BaseBundle)b3).getString("deep_link_uri"))));
            }
            case 3: {
                final Bundle b4 = this.b;
                final Context c4 = this.c;
                e0e.f((Object)b4, "$extras");
                e0e.f((Object)c4, "$context");
                final gn a = gn.Companion.a();
                final long o = flr.o(((BaseBundle)b4).getString("status_id"), -1L);
                Intent intent;
                if (o != -1L) {
                    final cwb$a cwb$a = new cwb$a();
                    cwb$a.v(o);
                    intent = a.a(c4, (cn)((z4j)cwb$a).e());
                }
                else {
                    intent = ud8.a(c4);
                }
                return intent;
            }
            case 2: {
                final Bundle b5 = this.b;
                final Context c5 = this.c;
                e0e.f((Object)b5, "$extras");
                e0e.f((Object)c5, "$context");
                final gn a2 = gn.Companion.a();
                final boolean e = flr.e((CharSequence)((BaseBundle)b5).getString("query"));
                final Intent intent2 = null;
                Intent intent3;
                if (e) {
                    intent3 = a2.a(c5, (cn)new h7p());
                }
                else {
                    final String string = ((BaseBundle)b5).getString("deep_link_uri");
                    intent3 = intent2;
                    if (string != null) {
                        final h6p b6 = ebp.b(Uri.parse(string));
                        intent3 = intent2;
                        if (b6 != null) {
                            intent3 = a2.a(c5, (cn)b6);
                        }
                    }
                }
                Intent a3;
                if ((a3 = intent3) == null) {
                    a3 = ud8.a(c5);
                    e0e.e((Object)a3, "getDefaultFallbackIntent(context)");
                }
                return a3;
            }
            case 1: {
                final Bundle b7 = this.b;
                final Context c6 = this.c;
                final String string2 = ((BaseBundle)b7).getString("iid");
                final String string3 = ((BaseBundle)b7).getString("id");
                final Map a4 = nuh.a(0);
                if (flr.g((CharSequence)string3)) {
                    ((HashMap<String, String>)a4).put("tweet_id", string3);
                }
                if (flr.g((CharSequence)string2)) {
                    ((HashMap<String, String>)a4).put("iid", string2);
                }
                return cpt.a(c6, new arv(a4));
            }
            case 0: {
                final Bundle b8 = this.b;
                final Context c7 = this.c;
                String string4 = ((BaseBundle)b8).getString("id");
                if (!flr.g((CharSequence)string4)) {
                    final String string5 = ((BaseBundle)b8).getString("moment_id");
                    final String string6 = ((BaseBundle)b8).getString("momentId");
                    if ((string4 = string5) == null) {
                        string4 = string6;
                    }
                }
                final long o2 = flr.o(string4, 0L);
                Intent intent4;
                if (o2 != 0L) {
                    intent4 = fn.a().a(c7, (cn)new zvf((LiveEventConfiguration)((z4j)new LiveEventConfiguration$a(String.valueOf(o2))).e()));
                }
                else {
                    intent4 = fn.a().a(c7, (cn)fgg.a(pgg.I0));
                }
                return intent4;
            }
        }
    }
}
